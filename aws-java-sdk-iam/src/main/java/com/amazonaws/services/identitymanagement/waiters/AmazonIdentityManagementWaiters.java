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
package com.amazonaws.services.identitymanagement.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonIdentityManagementWaiters {

    /**
     * Represents the service client
     */
    private final AmazonIdentityManagement client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonIdentityManagementWaiters");

    /**
     * Constructs a new AmazonIdentityManagementWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonIdentityManagementWaiters(AmazonIdentityManagement client) {
        this.client = client;
    }

    /**
     * Builds a RoleExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetRoleRequest> roleExists() {

        return new WaiterBuilder<GetRoleRequest, GetRoleResult>().withSdkFunction(new GetRoleFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new RoleExists.IsNoSuchEntityMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceProfileExists waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetInstanceProfileRequest> instanceProfileExists() {

        return new WaiterBuilder<GetInstanceProfileRequest, GetInstanceProfileResult>().withSdkFunction(new GetInstanceProfileFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new HttpFailureStatusAcceptor(404, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a PolicyExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetPolicyRequest> policyExists() {

        return new WaiterBuilder<GetPolicyRequest, GetPolicyResult>().withSdkFunction(new GetPolicyFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new PolicyExists.IsNoSuchEntityMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a UserExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetUserRequest> userExists() {

        return new WaiterBuilder<GetUserRequest, GetUserResult>().withSdkFunction(new GetUserFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new UserExists.IsNoSuchEntityMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
