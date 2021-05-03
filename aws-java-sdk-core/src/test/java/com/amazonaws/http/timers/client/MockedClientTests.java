/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.timers.client;

import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertCanceledTasksRemoved;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertCoreThreadsShutDownAfterBeingIdle;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertResponseIsBuffered;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertResponseWasNotBuffered;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertTimerNeverTriggered;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.createHttpResponseProxySpy;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.createMockGetRequest;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.createRawHttpClientSpy;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.amazonaws.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.response.ErrorDuringUnmarshallingResponseHandler;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.protocol.HttpContext;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.TestPreConditions;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.response.HttpResponseProxy;
import com.amazonaws.http.response.NullResponseHandler;

/**
 * These tests don't actually start up a mock server. They use a partially mocked Apache HTTP client
 * to return the desired response
 */
public class MockedClientTests {

    private AmazonHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Test
    public void clientExecutionTimeoutEnabled_RequestCompletesWithinTimeout_TaskCanceledAndEntityBuffered()
            throws Exception {
        ClientConfiguration config = new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withMaxErrorRetry(0);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, createMockGetRequest());
            fail("Exception expected");
        } catch (AmazonClientException e) {
            NullResponseHandler.assertIsUnmarshallingException(e);
        }

        assertResponseIsBuffered(responseProxy);
        ScheduledThreadPoolExecutor requestTimerExecutor = httpClient.getClientExecutionTimer().getExecutor();
        assertTimerNeverTriggered(requestTimerExecutor);
        assertCanceledTasksRemoved(requestTimerExecutor);
        // Core threads should be spun up on demand. Since only one task was submitted only one
        // thread should exist
        assertEquals(1, requestTimerExecutor.getPoolSize());
        assertCoreThreadsShutDownAfterBeingIdle(requestTimerExecutor);
    }

    @Test
    public void clientExecutionTimeoutDisabled_RequestCompletesWithinTimeout_EntityNotBuffered() throws Exception {
        ClientConfiguration config = new ClientConfiguration().withClientExecutionTimeout(0);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, createMockGetRequest());
            fail("Exception expected");
        } catch (AmazonClientException e) {
        }

        assertResponseWasNotBuffered(responseProxy);
    }

    @Test
    public void clientExecutionTimeoutEnabled_RequestCompletesWithinTimeout_EntityNotBufferedForStreamedResponse()
            throws Exception {
        ClientConfiguration config = new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            httpClient.requestExecutionBuilder().request(createMockGetRequest()).execute(new ErrorDuringUnmarshallingResponseHandler().leaveConnectionOpen());
            fail("Exception expected");
        } catch (AmazonClientException e) {
        }

        assertResponseWasNotBuffered(responseProxy);
    }

}
