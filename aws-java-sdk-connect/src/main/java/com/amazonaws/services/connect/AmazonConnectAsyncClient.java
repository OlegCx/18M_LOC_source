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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that you use to set up and manage a customer contact center
 * and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to optimize contact routing. You can also
 * resolve customer issues more efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create. There are also limits to the number
 * of requests that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an AWS service by using an endpoint. For a list of Amazon Connect endpoints, see
 * <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect Endpoints</a>.
 * </p>
 * <note>
 * <p>
 * Working with contact flows? Check out the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectAsyncClient extends AmazonConnectClient implements AmazonConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectAsyncClientBuilder asyncBuilder() {
        return AmazonConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(AssociateApprovedOriginRequest request) {

        return associateApprovedOriginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(final AssociateApprovedOriginRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateApprovedOriginRequest, AssociateApprovedOriginResult> asyncHandler) {
        final AssociateApprovedOriginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateApprovedOriginResult>() {
            @Override
            public AssociateApprovedOriginResult call() throws Exception {
                AssociateApprovedOriginResult result = null;

                try {
                    result = executeAssociateApprovedOrigin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(AssociateInstanceStorageConfigRequest request) {

        return associateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            final AssociateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateInstanceStorageConfigRequest, AssociateInstanceStorageConfigResult> asyncHandler) {
        final AssociateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateInstanceStorageConfigResult>() {
            @Override
            public AssociateInstanceStorageConfigResult call() throws Exception {
                AssociateInstanceStorageConfigResult result = null;

                try {
                    result = executeAssociateInstanceStorageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(AssociateLambdaFunctionRequest request) {

        return associateLambdaFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(final AssociateLambdaFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLambdaFunctionRequest, AssociateLambdaFunctionResult> asyncHandler) {
        final AssociateLambdaFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLambdaFunctionResult>() {
            @Override
            public AssociateLambdaFunctionResult call() throws Exception {
                AssociateLambdaFunctionResult result = null;

                try {
                    result = executeAssociateLambdaFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(AssociateLexBotRequest request) {

        return associateLexBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(final AssociateLexBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLexBotRequest, AssociateLexBotResult> asyncHandler) {
        final AssociateLexBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLexBotResult>() {
            @Override
            public AssociateLexBotResult call() throws Exception {
                AssociateLexBotResult result = null;

                try {
                    result = executeAssociateLexBot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(AssociateQueueQuickConnectsRequest request) {

        return associateQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(final AssociateQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateQueueQuickConnectsRequest, AssociateQueueQuickConnectsResult> asyncHandler) {
        final AssociateQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateQueueQuickConnectsResult>() {
            @Override
            public AssociateQueueQuickConnectsResult call() throws Exception {
                AssociateQueueQuickConnectsResult result = null;

                try {
                    result = executeAssociateQueueQuickConnects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(AssociateRoutingProfileQueuesRequest request) {

        return associateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(
            final AssociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRoutingProfileQueuesRequest, AssociateRoutingProfileQueuesResult> asyncHandler) {
        final AssociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRoutingProfileQueuesResult>() {
            @Override
            public AssociateRoutingProfileQueuesResult call() throws Exception {
                AssociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeAssociateRoutingProfileQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(AssociateSecurityKeyRequest request) {

        return associateSecurityKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(final AssociateSecurityKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSecurityKeyRequest, AssociateSecurityKeyResult> asyncHandler) {
        final AssociateSecurityKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSecurityKeyResult>() {
            @Override
            public AssociateSecurityKeyResult call() throws Exception {
                AssociateSecurityKeyResult result = null;

                try {
                    result = executeAssociateSecurityKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(CreateContactFlowRequest request) {

        return createContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(final CreateContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler) {
        final CreateContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactFlowResult>() {
            @Override
            public CreateContactFlowResult call() throws Exception {
                CreateContactFlowResult result = null;

                try {
                    result = executeCreateContactFlow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {
        final CreateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceResult>() {
            @Override
            public CreateInstanceResult call() throws Exception {
                CreateInstanceResult result = null;

                try {
                    result = executeCreateInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(CreateIntegrationAssociationRequest request) {

        return createIntegrationAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(final CreateIntegrationAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntegrationAssociationRequest, CreateIntegrationAssociationResult> asyncHandler) {
        final CreateIntegrationAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntegrationAssociationResult>() {
            @Override
            public CreateIntegrationAssociationResult call() throws Exception {
                CreateIntegrationAssociationResult result = null;

                try {
                    result = executeCreateIntegrationAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {
        final CreateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueResult>() {
            @Override
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;

                try {
                    result = executeCreateQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(CreateQuickConnectRequest request) {

        return createQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(final CreateQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQuickConnectRequest, CreateQuickConnectResult> asyncHandler) {
        final CreateQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQuickConnectResult>() {
            @Override
            public CreateQuickConnectResult call() throws Exception {
                CreateQuickConnectResult result = null;

                try {
                    result = executeCreateQuickConnect(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(CreateRoutingProfileRequest request) {

        return createRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(final CreateRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler) {
        final CreateRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoutingProfileResult>() {
            @Override
            public CreateRoutingProfileResult call() throws Exception {
                CreateRoutingProfileResult result = null;

                try {
                    result = executeCreateRoutingProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest request) {

        return createUseCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(final CreateUseCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUseCaseRequest, CreateUseCaseResult> asyncHandler) {
        final CreateUseCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUseCaseResult>() {
            @Override
            public CreateUseCaseResult call() throws Exception {
                CreateUseCaseResult result = null;

                try {
                    result = executeCreateUseCase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(CreateUserHierarchyGroupRequest request) {

        return createUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(final CreateUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler) {
        final CreateUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserHierarchyGroupResult>() {
            @Override
            public CreateUserHierarchyGroupResult call() throws Exception {
                CreateUserHierarchyGroupResult result = null;

                try {
                    result = executeCreateUserHierarchyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {
        final DeleteInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result = null;

                try {
                    result = executeDeleteInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(DeleteIntegrationAssociationRequest request) {

        return deleteIntegrationAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(final DeleteIntegrationAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationAssociationRequest, DeleteIntegrationAssociationResult> asyncHandler) {
        final DeleteIntegrationAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationAssociationResult>() {
            @Override
            public DeleteIntegrationAssociationResult call() throws Exception {
                DeleteIntegrationAssociationResult result = null;

                try {
                    result = executeDeleteIntegrationAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(DeleteQuickConnectRequest request) {

        return deleteQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(final DeleteQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQuickConnectRequest, DeleteQuickConnectResult> asyncHandler) {
        final DeleteQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQuickConnectResult>() {
            @Override
            public DeleteQuickConnectResult call() throws Exception {
                DeleteQuickConnectResult result = null;

                try {
                    result = executeDeleteQuickConnect(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(DeleteUseCaseRequest request) {

        return deleteUseCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(final DeleteUseCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUseCaseRequest, DeleteUseCaseResult> asyncHandler) {
        final DeleteUseCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUseCaseResult>() {
            @Override
            public DeleteUseCaseResult call() throws Exception {
                DeleteUseCaseResult result = null;

                try {
                    result = executeDeleteUseCase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(DeleteUserHierarchyGroupRequest request) {

        return deleteUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(final DeleteUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserHierarchyGroupRequest, DeleteUserHierarchyGroupResult> asyncHandler) {
        final DeleteUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserHierarchyGroupResult>() {
            @Override
            public DeleteUserHierarchyGroupResult call() throws Exception {
                DeleteUserHierarchyGroupResult result = null;

                try {
                    result = executeDeleteUserHierarchyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(DescribeContactFlowRequest request) {

        return describeContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(final DescribeContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler) {
        final DescribeContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactFlowResult>() {
            @Override
            public DescribeContactFlowResult call() throws Exception {
                DescribeContactFlowResult result = null;

                try {
                    result = executeDescribeContactFlow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(DescribeHoursOfOperationRequest request) {

        return describeHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(final DescribeHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHoursOfOperationRequest, DescribeHoursOfOperationResult> asyncHandler) {
        final DescribeHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHoursOfOperationResult>() {
            @Override
            public DescribeHoursOfOperationResult call() throws Exception {
                DescribeHoursOfOperationResult result = null;

                try {
                    result = executeDescribeHoursOfOperation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest request) {

        return describeInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(final DescribeInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler) {
        final DescribeInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceResult>() {
            @Override
            public DescribeInstanceResult call() throws Exception {
                DescribeInstanceResult result = null;

                try {
                    result = executeDescribeInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest request) {

        return describeInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(final DescribeInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler) {
        final DescribeInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAttributeResult>() {
            @Override
            public DescribeInstanceAttributeResult call() throws Exception {
                DescribeInstanceAttributeResult result = null;

                try {
                    result = executeDescribeInstanceAttribute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(DescribeInstanceStorageConfigRequest request) {

        return describeInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            final DescribeInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceStorageConfigRequest, DescribeInstanceStorageConfigResult> asyncHandler) {
        final DescribeInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceStorageConfigResult>() {
            @Override
            public DescribeInstanceStorageConfigResult call() throws Exception {
                DescribeInstanceStorageConfigResult result = null;

                try {
                    result = executeDescribeInstanceStorageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest request) {

        return describeQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(final DescribeQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQueueRequest, DescribeQueueResult> asyncHandler) {
        final DescribeQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQueueResult>() {
            @Override
            public DescribeQueueResult call() throws Exception {
                DescribeQueueResult result = null;

                try {
                    result = executeDescribeQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(DescribeQuickConnectRequest request) {

        return describeQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(final DescribeQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQuickConnectRequest, DescribeQuickConnectResult> asyncHandler) {
        final DescribeQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQuickConnectResult>() {
            @Override
            public DescribeQuickConnectResult call() throws Exception {
                DescribeQuickConnectResult result = null;

                try {
                    result = executeDescribeQuickConnect(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(DescribeRoutingProfileRequest request) {

        return describeRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(final DescribeRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler) {
        final DescribeRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRoutingProfileResult>() {
            @Override
            public DescribeRoutingProfileResult call() throws Exception {
                DescribeRoutingProfileResult result = null;

                try {
                    result = executeDescribeRoutingProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(DescribeUserHierarchyGroupRequest request) {

        return describeUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(final DescribeUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler) {
        final DescribeUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyGroupResult>() {
            @Override
            public DescribeUserHierarchyGroupResult call() throws Exception {
                DescribeUserHierarchyGroupResult result = null;

                try {
                    result = executeDescribeUserHierarchyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(DescribeUserHierarchyStructureRequest request) {

        return describeUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            final DescribeUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler) {
        final DescribeUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyStructureResult>() {
            @Override
            public DescribeUserHierarchyStructureResult call() throws Exception {
                DescribeUserHierarchyStructureResult result = null;

                try {
                    result = executeDescribeUserHierarchyStructure(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(DisassociateApprovedOriginRequest request) {

        return disassociateApprovedOriginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(final DisassociateApprovedOriginRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateApprovedOriginRequest, DisassociateApprovedOriginResult> asyncHandler) {
        final DisassociateApprovedOriginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateApprovedOriginResult>() {
            @Override
            public DisassociateApprovedOriginResult call() throws Exception {
                DisassociateApprovedOriginResult result = null;

                try {
                    result = executeDisassociateApprovedOrigin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest request) {

        return disassociateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            final DisassociateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateInstanceStorageConfigRequest, DisassociateInstanceStorageConfigResult> asyncHandler) {
        final DisassociateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateInstanceStorageConfigResult>() {
            @Override
            public DisassociateInstanceStorageConfigResult call() throws Exception {
                DisassociateInstanceStorageConfigResult result = null;

                try {
                    result = executeDisassociateInstanceStorageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(DisassociateLambdaFunctionRequest request) {

        return disassociateLambdaFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(final DisassociateLambdaFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLambdaFunctionRequest, DisassociateLambdaFunctionResult> asyncHandler) {
        final DisassociateLambdaFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLambdaFunctionResult>() {
            @Override
            public DisassociateLambdaFunctionResult call() throws Exception {
                DisassociateLambdaFunctionResult result = null;

                try {
                    result = executeDisassociateLambdaFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(DisassociateLexBotRequest request) {

        return disassociateLexBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(final DisassociateLexBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLexBotRequest, DisassociateLexBotResult> asyncHandler) {
        final DisassociateLexBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLexBotResult>() {
            @Override
            public DisassociateLexBotResult call() throws Exception {
                DisassociateLexBotResult result = null;

                try {
                    result = executeDisassociateLexBot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(DisassociateQueueQuickConnectsRequest request) {

        return disassociateQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(
            final DisassociateQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateQueueQuickConnectsRequest, DisassociateQueueQuickConnectsResult> asyncHandler) {
        final DisassociateQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateQueueQuickConnectsResult>() {
            @Override
            public DisassociateQueueQuickConnectsResult call() throws Exception {
                DisassociateQueueQuickConnectsResult result = null;

                try {
                    result = executeDisassociateQueueQuickConnects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest request) {

        return disassociateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            final DisassociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRoutingProfileQueuesRequest, DisassociateRoutingProfileQueuesResult> asyncHandler) {
        final DisassociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRoutingProfileQueuesResult>() {
            @Override
            public DisassociateRoutingProfileQueuesResult call() throws Exception {
                DisassociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeDisassociateRoutingProfileQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(DisassociateSecurityKeyRequest request) {

        return disassociateSecurityKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(final DisassociateSecurityKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSecurityKeyRequest, DisassociateSecurityKeyResult> asyncHandler) {
        final DisassociateSecurityKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSecurityKeyResult>() {
            @Override
            public DisassociateSecurityKeyResult call() throws Exception {
                DisassociateSecurityKeyResult result = null;

                try {
                    result = executeDisassociateSecurityKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(GetContactAttributesRequest request) {

        return getContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(final GetContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler) {
        final GetContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactAttributesResult>() {
            @Override
            public GetContactAttributesResult call() throws Exception {
                GetContactAttributesResult result = null;

                try {
                    result = executeGetContactAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(GetCurrentMetricDataRequest request) {

        return getCurrentMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(final GetCurrentMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler) {
        final GetCurrentMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCurrentMetricDataResult>() {
            @Override
            public GetCurrentMetricDataResult call() throws Exception {
                GetCurrentMetricDataResult result = null;

                try {
                    result = executeGetCurrentMetricData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest request) {

        return getFederationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(final GetFederationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler) {
        final GetFederationTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFederationTokenResult>() {
            @Override
            public GetFederationTokenResult call() throws Exception {
                GetFederationTokenResult result = null;

                try {
                    result = executeGetFederationToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest request) {

        return getMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(final GetMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler) {
        final GetMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricDataResult>() {
            @Override
            public GetMetricDataResult call() throws Exception {
                GetMetricDataResult result = null;

                try {
                    result = executeGetMetricData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(ListApprovedOriginsRequest request) {

        return listApprovedOriginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(final ListApprovedOriginsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApprovedOriginsRequest, ListApprovedOriginsResult> asyncHandler) {
        final ListApprovedOriginsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApprovedOriginsResult>() {
            @Override
            public ListApprovedOriginsResult call() throws Exception {
                ListApprovedOriginsResult result = null;

                try {
                    result = executeListApprovedOrigins(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(ListContactFlowsRequest request) {

        return listContactFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(final ListContactFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler) {
        final ListContactFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactFlowsResult>() {
            @Override
            public ListContactFlowsResult call() throws Exception {
                ListContactFlowsResult result = null;

                try {
                    result = executeListContactFlows(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(ListHoursOfOperationsRequest request) {

        return listHoursOfOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(final ListHoursOfOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler) {
        final ListHoursOfOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHoursOfOperationsResult>() {
            @Override
            public ListHoursOfOperationsResult call() throws Exception {
                ListHoursOfOperationsResult result = null;

                try {
                    result = executeListHoursOfOperations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(ListInstanceAttributesRequest request) {

        return listInstanceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(final ListInstanceAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceAttributesRequest, ListInstanceAttributesResult> asyncHandler) {
        final ListInstanceAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceAttributesResult>() {
            @Override
            public ListInstanceAttributesResult call() throws Exception {
                ListInstanceAttributesResult result = null;

                try {
                    result = executeListInstanceAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(ListInstanceStorageConfigsRequest request) {

        return listInstanceStorageConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(final ListInstanceStorageConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceStorageConfigsRequest, ListInstanceStorageConfigsResult> asyncHandler) {
        final ListInstanceStorageConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceStorageConfigsResult>() {
            @Override
            public ListInstanceStorageConfigsResult call() throws Exception {
                ListInstanceStorageConfigsResult result = null;

                try {
                    result = executeListInstanceStorageConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(ListIntegrationAssociationsRequest request) {

        return listIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(final ListIntegrationAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntegrationAssociationsRequest, ListIntegrationAssociationsResult> asyncHandler) {
        final ListIntegrationAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntegrationAssociationsResult>() {
            @Override
            public ListIntegrationAssociationsResult call() throws Exception {
                ListIntegrationAssociationsResult result = null;

                try {
                    result = executeListIntegrationAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(ListLambdaFunctionsRequest request) {

        return listLambdaFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(final ListLambdaFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLambdaFunctionsRequest, ListLambdaFunctionsResult> asyncHandler) {
        final ListLambdaFunctionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLambdaFunctionsResult>() {
            @Override
            public ListLambdaFunctionsResult call() throws Exception {
                ListLambdaFunctionsResult result = null;

                try {
                    result = executeListLambdaFunctions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest request) {

        return listLexBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(final ListLexBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLexBotsRequest, ListLexBotsResult> asyncHandler) {
        final ListLexBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLexBotsResult>() {
            @Override
            public ListLexBotsResult call() throws Exception {
                ListLexBotsResult result = null;

                try {
                    result = executeListLexBots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest request) {

        return listPhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(final ListPhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler) {
        final ListPhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersResult>() {
            @Override
            public ListPhoneNumbersResult call() throws Exception {
                ListPhoneNumbersResult result = null;

                try {
                    result = executeListPhoneNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest request) {

        return listPromptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(final ListPromptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler) {
        final ListPromptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPromptsResult>() {
            @Override
            public ListPromptsResult call() throws Exception {
                ListPromptsResult result = null;

                try {
                    result = executeListPrompts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(ListQueueQuickConnectsRequest request) {

        return listQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(final ListQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueQuickConnectsRequest, ListQueueQuickConnectsResult> asyncHandler) {
        final ListQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueQuickConnectsResult>() {
            @Override
            public ListQueueQuickConnectsResult call() throws Exception {
                ListQueueQuickConnectsResult result = null;

                try {
                    result = executeListQueueQuickConnects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(ListQuickConnectsRequest request) {

        return listQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(final ListQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQuickConnectsRequest, ListQuickConnectsResult> asyncHandler) {
        final ListQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQuickConnectsResult>() {
            @Override
            public ListQuickConnectsResult call() throws Exception {
                ListQuickConnectsResult result = null;

                try {
                    result = executeListQuickConnects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(ListRoutingProfileQueuesRequest request) {

        return listRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(final ListRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler) {
        final ListRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfileQueuesResult>() {
            @Override
            public ListRoutingProfileQueuesResult call() throws Exception {
                ListRoutingProfileQueuesResult result = null;

                try {
                    result = executeListRoutingProfileQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(ListRoutingProfilesRequest request) {

        return listRoutingProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(final ListRoutingProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler) {
        final ListRoutingProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfilesResult>() {
            @Override
            public ListRoutingProfilesResult call() throws Exception {
                ListRoutingProfilesResult result = null;

                try {
                    result = executeListRoutingProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(ListSecurityKeysRequest request) {

        return listSecurityKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(final ListSecurityKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityKeysRequest, ListSecurityKeysResult> asyncHandler) {
        final ListSecurityKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityKeysResult>() {
            @Override
            public ListSecurityKeysResult call() throws Exception {
                ListSecurityKeysResult result = null;

                try {
                    result = executeListSecurityKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest request) {

        return listSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(final ListSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler) {
        final ListSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityProfilesResult>() {
            @Override
            public ListSecurityProfilesResult call() throws Exception {
                ListSecurityProfilesResult result = null;

                try {
                    result = executeListSecurityProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest request) {

        return listUseCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(final ListUseCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUseCasesRequest, ListUseCasesResult> asyncHandler) {
        final ListUseCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUseCasesResult>() {
            @Override
            public ListUseCasesResult call() throws Exception {
                ListUseCasesResult result = null;

                try {
                    result = executeListUseCases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(ListUserHierarchyGroupsRequest request) {

        return listUserHierarchyGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(final ListUserHierarchyGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler) {
        final ListUserHierarchyGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserHierarchyGroupsResult>() {
            @Override
            public ListUserHierarchyGroupsResult call() throws Exception {
                ListUserHierarchyGroupsResult result = null;

                try {
                    result = executeListUserHierarchyGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(ResumeContactRecordingRequest request) {

        return resumeContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(final ResumeContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler) {
        final ResumeContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeContactRecordingResult>() {
            @Override
            public ResumeContactRecordingResult call() throws Exception {
                ResumeContactRecordingResult result = null;

                try {
                    result = executeResumeContactRecording(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(StartChatContactRequest request) {

        return startChatContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(final StartChatContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler) {
        final StartChatContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChatContactResult>() {
            @Override
            public StartChatContactResult call() throws Exception {
                StartChatContactResult result = null;

                try {
                    result = executeStartChatContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(StartContactRecordingRequest request) {

        return startContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(final StartContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler) {
        final StartContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContactRecordingResult>() {
            @Override
            public StartContactRecordingResult call() throws Exception {
                StartContactRecordingResult result = null;

                try {
                    result = executeStartContactRecording(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(StartOutboundVoiceContactRequest request) {

        return startOutboundVoiceContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(final StartOutboundVoiceContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler) {
        final StartOutboundVoiceContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartOutboundVoiceContactResult>() {
            @Override
            public StartOutboundVoiceContactResult call() throws Exception {
                StartOutboundVoiceContactResult result = null;

                try {
                    result = executeStartOutboundVoiceContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(StartTaskContactRequest request) {

        return startTaskContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(final StartTaskContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTaskContactRequest, StartTaskContactResult> asyncHandler) {
        final StartTaskContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTaskContactResult>() {
            @Override
            public StartTaskContactResult call() throws Exception {
                StartTaskContactResult result = null;

                try {
                    result = executeStartTaskContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest request) {

        return stopContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(final StopContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRequest, StopContactResult> asyncHandler) {
        final StopContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactResult>() {
            @Override
            public StopContactResult call() throws Exception {
                StopContactResult result = null;

                try {
                    result = executeStopContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(StopContactRecordingRequest request) {

        return stopContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(final StopContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler) {
        final StopContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactRecordingResult>() {
            @Override
            public StopContactRecordingResult call() throws Exception {
                StopContactRecordingResult result = null;

                try {
                    result = executeStopContactRecording(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(SuspendContactRecordingRequest request) {

        return suspendContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(final SuspendContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler) {
        final SuspendContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SuspendContactRecordingResult>() {
            @Override
            public SuspendContactRecordingResult call() throws Exception {
                SuspendContactRecordingResult result = null;

                try {
                    result = executeSuspendContactRecording(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(UpdateContactAttributesRequest request) {

        return updateContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(final UpdateContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler) {
        final UpdateContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactAttributesResult>() {
            @Override
            public UpdateContactAttributesResult call() throws Exception {
                UpdateContactAttributesResult result = null;

                try {
                    result = executeUpdateContactAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(UpdateContactFlowContentRequest request) {

        return updateContactFlowContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(final UpdateContactFlowContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler) {
        final UpdateContactFlowContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowContentResult>() {
            @Override
            public UpdateContactFlowContentResult call() throws Exception {
                UpdateContactFlowContentResult result = null;

                try {
                    result = executeUpdateContactFlowContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(UpdateContactFlowNameRequest request) {

        return updateContactFlowNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(final UpdateContactFlowNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler) {
        final UpdateContactFlowNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowNameResult>() {
            @Override
            public UpdateContactFlowNameResult call() throws Exception {
                UpdateContactFlowNameResult result = null;

                try {
                    result = executeUpdateContactFlowName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(UpdateInstanceAttributeRequest request) {

        return updateInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(final UpdateInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceAttributeRequest, UpdateInstanceAttributeResult> asyncHandler) {
        final UpdateInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceAttributeResult>() {
            @Override
            public UpdateInstanceAttributeResult call() throws Exception {
                UpdateInstanceAttributeResult result = null;

                try {
                    result = executeUpdateInstanceAttribute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(UpdateInstanceStorageConfigRequest request) {

        return updateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(final UpdateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceStorageConfigRequest, UpdateInstanceStorageConfigResult> asyncHandler) {
        final UpdateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceStorageConfigResult>() {
            @Override
            public UpdateInstanceStorageConfigResult call() throws Exception {
                UpdateInstanceStorageConfigResult result = null;

                try {
                    result = executeUpdateInstanceStorageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(UpdateQueueHoursOfOperationRequest request) {

        return updateQueueHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(final UpdateQueueHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueHoursOfOperationRequest, UpdateQueueHoursOfOperationResult> asyncHandler) {
        final UpdateQueueHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueHoursOfOperationResult>() {
            @Override
            public UpdateQueueHoursOfOperationResult call() throws Exception {
                UpdateQueueHoursOfOperationResult result = null;

                try {
                    result = executeUpdateQueueHoursOfOperation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(UpdateQueueMaxContactsRequest request) {

        return updateQueueMaxContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(final UpdateQueueMaxContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueMaxContactsRequest, UpdateQueueMaxContactsResult> asyncHandler) {
        final UpdateQueueMaxContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueMaxContactsResult>() {
            @Override
            public UpdateQueueMaxContactsResult call() throws Exception {
                UpdateQueueMaxContactsResult result = null;

                try {
                    result = executeUpdateQueueMaxContacts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(UpdateQueueNameRequest request) {

        return updateQueueNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(final UpdateQueueNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueNameRequest, UpdateQueueNameResult> asyncHandler) {
        final UpdateQueueNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueNameResult>() {
            @Override
            public UpdateQueueNameResult call() throws Exception {
                UpdateQueueNameResult result = null;

                try {
                    result = executeUpdateQueueName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest request) {

        return updateQueueOutboundCallerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            final UpdateQueueOutboundCallerConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueOutboundCallerConfigRequest, UpdateQueueOutboundCallerConfigResult> asyncHandler) {
        final UpdateQueueOutboundCallerConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueOutboundCallerConfigResult>() {
            @Override
            public UpdateQueueOutboundCallerConfigResult call() throws Exception {
                UpdateQueueOutboundCallerConfigResult result = null;

                try {
                    result = executeUpdateQueueOutboundCallerConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(UpdateQueueStatusRequest request) {

        return updateQueueStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(final UpdateQueueStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueStatusRequest, UpdateQueueStatusResult> asyncHandler) {
        final UpdateQueueStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueStatusResult>() {
            @Override
            public UpdateQueueStatusResult call() throws Exception {
                UpdateQueueStatusResult result = null;

                try {
                    result = executeUpdateQueueStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(UpdateQuickConnectConfigRequest request) {

        return updateQuickConnectConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(final UpdateQuickConnectConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectConfigRequest, UpdateQuickConnectConfigResult> asyncHandler) {
        final UpdateQuickConnectConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuickConnectConfigResult>() {
            @Override
            public UpdateQuickConnectConfigResult call() throws Exception {
                UpdateQuickConnectConfigResult result = null;

                try {
                    result = executeUpdateQuickConnectConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(UpdateQuickConnectNameRequest request) {

        return updateQuickConnectNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(final UpdateQuickConnectNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectNameRequest, UpdateQuickConnectNameResult> asyncHandler) {
        final UpdateQuickConnectNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuickConnectNameResult>() {
            @Override
            public UpdateQuickConnectNameResult call() throws Exception {
                UpdateQuickConnectNameResult result = null;

                try {
                    result = executeUpdateQuickConnectName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest request) {

        return updateRoutingProfileConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            final UpdateRoutingProfileConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileConcurrencyRequest, UpdateRoutingProfileConcurrencyResult> asyncHandler) {
        final UpdateRoutingProfileConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileConcurrencyResult>() {
            @Override
            public UpdateRoutingProfileConcurrencyResult call() throws Exception {
                UpdateRoutingProfileConcurrencyResult result = null;

                try {
                    result = executeUpdateRoutingProfileConcurrency(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest request) {

        return updateRoutingProfileDefaultOutboundQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            final UpdateRoutingProfileDefaultOutboundQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, UpdateRoutingProfileDefaultOutboundQueueResult> asyncHandler) {
        final UpdateRoutingProfileDefaultOutboundQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileDefaultOutboundQueueResult>() {
            @Override
            public UpdateRoutingProfileDefaultOutboundQueueResult call() throws Exception {
                UpdateRoutingProfileDefaultOutboundQueueResult result = null;

                try {
                    result = executeUpdateRoutingProfileDefaultOutboundQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(UpdateRoutingProfileNameRequest request) {

        return updateRoutingProfileNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(final UpdateRoutingProfileNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileNameRequest, UpdateRoutingProfileNameResult> asyncHandler) {
        final UpdateRoutingProfileNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileNameResult>() {
            @Override
            public UpdateRoutingProfileNameResult call() throws Exception {
                UpdateRoutingProfileNameResult result = null;

                try {
                    result = executeUpdateRoutingProfileName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(UpdateRoutingProfileQueuesRequest request) {

        return updateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(final UpdateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileQueuesRequest, UpdateRoutingProfileQueuesResult> asyncHandler) {
        final UpdateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileQueuesResult>() {
            @Override
            public UpdateRoutingProfileQueuesResult call() throws Exception {
                UpdateRoutingProfileQueuesResult result = null;

                try {
                    result = executeUpdateRoutingProfileQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(UpdateUserHierarchyRequest request) {

        return updateUserHierarchyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(final UpdateUserHierarchyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyRequest, UpdateUserHierarchyResult> asyncHandler) {
        final UpdateUserHierarchyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyResult>() {
            @Override
            public UpdateUserHierarchyResult call() throws Exception {
                UpdateUserHierarchyResult result = null;

                try {
                    result = executeUpdateUserHierarchy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(UpdateUserHierarchyGroupNameRequest request) {

        return updateUserHierarchyGroupNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(final UpdateUserHierarchyGroupNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyGroupNameRequest, UpdateUserHierarchyGroupNameResult> asyncHandler) {
        final UpdateUserHierarchyGroupNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyGroupNameResult>() {
            @Override
            public UpdateUserHierarchyGroupNameResult call() throws Exception {
                UpdateUserHierarchyGroupNameResult result = null;

                try {
                    result = executeUpdateUserHierarchyGroupName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(UpdateUserHierarchyStructureRequest request) {

        return updateUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(final UpdateUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyStructureRequest, UpdateUserHierarchyStructureResult> asyncHandler) {
        final UpdateUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyStructureResult>() {
            @Override
            public UpdateUserHierarchyStructureResult call() throws Exception {
                UpdateUserHierarchyStructureResult result = null;

                try {
                    result = executeUpdateUserHierarchyStructure(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(UpdateUserIdentityInfoRequest request) {

        return updateUserIdentityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(final UpdateUserIdentityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserIdentityInfoRequest, UpdateUserIdentityInfoResult> asyncHandler) {
        final UpdateUserIdentityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserIdentityInfoResult>() {
            @Override
            public UpdateUserIdentityInfoResult call() throws Exception {
                UpdateUserIdentityInfoResult result = null;

                try {
                    result = executeUpdateUserIdentityInfo(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(UpdateUserPhoneConfigRequest request) {

        return updateUserPhoneConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(final UpdateUserPhoneConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPhoneConfigRequest, UpdateUserPhoneConfigResult> asyncHandler) {
        final UpdateUserPhoneConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPhoneConfigResult>() {
            @Override
            public UpdateUserPhoneConfigResult call() throws Exception {
                UpdateUserPhoneConfigResult result = null;

                try {
                    result = executeUpdateUserPhoneConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(UpdateUserRoutingProfileRequest request) {

        return updateUserRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(final UpdateUserRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRoutingProfileRequest, UpdateUserRoutingProfileResult> asyncHandler) {
        final UpdateUserRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserRoutingProfileResult>() {
            @Override
            public UpdateUserRoutingProfileResult call() throws Exception {
                UpdateUserRoutingProfileResult result = null;

                try {
                    result = executeUpdateUserRoutingProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(UpdateUserSecurityProfilesRequest request) {

        return updateUserSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(final UpdateUserSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserSecurityProfilesRequest, UpdateUserSecurityProfilesResult> asyncHandler) {
        final UpdateUserSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserSecurityProfilesResult>() {
            @Override
            public UpdateUserSecurityProfilesResult call() throws Exception {
                UpdateUserSecurityProfilesResult result = null;

                try {
                    result = executeUpdateUserSecurityProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
