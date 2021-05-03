/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.cloudwatch.AmazonCloudWatch;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchWaiters {

    /**
     * Represents the service client
     */
    private final AmazonCloudWatch client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonCloudWatchWaiters");

    /**
     * Constructs a new AmazonCloudWatchWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonCloudWatchWaiters(AmazonCloudWatch client) {
        this.client = client;
    }

    /**
     * Builds a AlarmExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAlarmsRequest> alarmExists() {

        return new WaiterBuilder<DescribeAlarmsRequest, DescribeAlarmsResult>().withSdkFunction(new DescribeAlarmsFunction(client))
                .withAcceptors(new AlarmExists.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a CompositeAlarmExists waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAlarmsRequest> compositeAlarmExists() {

        return new WaiterBuilder<DescribeAlarmsRequest, DescribeAlarmsResult>().withSdkFunction(new DescribeAlarmsFunction(client))
                .withAcceptors(new CompositeAlarmExists.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
