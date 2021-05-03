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
package com.amazonaws.services.organizations;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Organizations asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
 * <i>organization</i> and centrally manage your accounts and their resources.
 * </p>
 * <p>
 * This guide provides descriptions of the Organizations operations. For more information about using this service, see
 * the <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">AWS Organizations User
 * Guide</a>.
 * </p>
 * <p>
 * <b>Support and feedback for AWS Organizations</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:feedback-awsorganizations@amazon.com">feedback-awsorganizations@amazon.com</a> or post your feedback and
 * questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=219">AWS Organizations support forum</a>.
 * For more information about the AWS support forums, see <a href="http://forums.aws.amazon.com/help.jspa">Forums
 * Help</a>.
 * </p>
 * <p>
 * <b>Endpoint to call When using the AWS CLI or the AWS SDK</b>
 * </p>
 * <p>
 * For the current release of Organizations, specify the <code>us-east-1</code> region for all AWS API and AWS CLI calls
 * made from the commercial AWS Regions outside of China. If calling from one of the AWS Regions in China, then specify
 * <code>cn-northwest-1</code>. You can do this in the AWS CLI by using these parameters and commands:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the following parameter with each command to specify both the endpoint and its region:
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.us-east-1.amazonaws.com</code> <i>(from commercial AWS Regions outside of
 * China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.cn-northwest-1.amazonaws.com.cn</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the default endpoint, but configure your default region with this command:
 * </p>
 * <p>
 * <code>aws configure set default.region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>aws configure set default.region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the following parameter with each command to specify the endpoint:
 * </p>
 * <p>
 * <code>--region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests the
 * Organizations service received, who made the request and when, and so on. For more about AWS Organizations and its
 * support for AWS CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_incident-response.html#orgs_cloudtrail-integration"
 * >Logging AWS Organizations Events with AWS CloudTrail</a> in the <i>AWS Organizations User Guide</i>. To learn more
 * about AWS CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOrganizationsAsyncClient extends AWSOrganizationsClient implements AWSOrganizationsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Organizations (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOrganizationsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOrganizationsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOrganizationsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSOrganizationsAsyncClientBuilder asyncBuilder() {
        return AWSOrganizationsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOrganizationsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Organizations using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSOrganizationsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptHandshakeResult> acceptHandshakeAsync(AcceptHandshakeRequest request) {

        return acceptHandshakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptHandshakeResult> acceptHandshakeAsync(final AcceptHandshakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptHandshakeRequest, AcceptHandshakeResult> asyncHandler) {
        final AcceptHandshakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptHandshakeResult>() {
            @Override
            public AcceptHandshakeResult call() throws Exception {
                AcceptHandshakeResult result = null;

                try {
                    result = executeAcceptHandshake(finalRequest);
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
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest request) {

        return attachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(final AttachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler) {
        final AttachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachPolicyResult>() {
            @Override
            public AttachPolicyResult call() throws Exception {
                AttachPolicyResult result = null;

                try {
                    result = executeAttachPolicy(finalRequest);
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
    public java.util.concurrent.Future<CancelHandshakeResult> cancelHandshakeAsync(CancelHandshakeRequest request) {

        return cancelHandshakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelHandshakeResult> cancelHandshakeAsync(final CancelHandshakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelHandshakeRequest, CancelHandshakeResult> asyncHandler) {
        final CancelHandshakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelHandshakeResult>() {
            @Override
            public CancelHandshakeResult call() throws Exception {
                CancelHandshakeResult result = null;

                try {
                    result = executeCancelHandshake(finalRequest);
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
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest request) {

        return createAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(final CreateAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccountRequest, CreateAccountResult> asyncHandler) {
        final CreateAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccountResult>() {
            @Override
            public CreateAccountResult call() throws Exception {
                CreateAccountResult result = null;

                try {
                    result = executeCreateAccount(finalRequest);
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
    public java.util.concurrent.Future<CreateGovCloudAccountResult> createGovCloudAccountAsync(CreateGovCloudAccountRequest request) {

        return createGovCloudAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGovCloudAccountResult> createGovCloudAccountAsync(final CreateGovCloudAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGovCloudAccountRequest, CreateGovCloudAccountResult> asyncHandler) {
        final CreateGovCloudAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGovCloudAccountResult>() {
            @Override
            public CreateGovCloudAccountResult call() throws Exception {
                CreateGovCloudAccountResult result = null;

                try {
                    result = executeCreateGovCloudAccount(finalRequest);
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
    public java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest request) {

        return createOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(final CreateOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOrganizationRequest, CreateOrganizationResult> asyncHandler) {
        final CreateOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOrganizationResult>() {
            @Override
            public CreateOrganizationResult call() throws Exception {
                CreateOrganizationResult result = null;

                try {
                    result = executeCreateOrganization(finalRequest);
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
    public java.util.concurrent.Future<CreateOrganizationalUnitResult> createOrganizationalUnitAsync(CreateOrganizationalUnitRequest request) {

        return createOrganizationalUnitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOrganizationalUnitResult> createOrganizationalUnitAsync(final CreateOrganizationalUnitRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResult> asyncHandler) {
        final CreateOrganizationalUnitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOrganizationalUnitResult>() {
            @Override
            public CreateOrganizationalUnitResult call() throws Exception {
                CreateOrganizationalUnitResult result = null;

                try {
                    result = executeCreateOrganizationalUnit(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(final CreatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {
        final CreatePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyResult>() {
            @Override
            public CreatePolicyResult call() throws Exception {
                CreatePolicyResult result = null;

                try {
                    result = executeCreatePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeclineHandshakeResult> declineHandshakeAsync(DeclineHandshakeRequest request) {

        return declineHandshakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeclineHandshakeResult> declineHandshakeAsync(final DeclineHandshakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeclineHandshakeRequest, DeclineHandshakeResult> asyncHandler) {
        final DeclineHandshakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeclineHandshakeResult>() {
            @Override
            public DeclineHandshakeResult call() throws Exception {
                DeclineHandshakeResult result = null;

                try {
                    result = executeDeclineHandshake(finalRequest);
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
    public java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest request) {

        return deleteOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(final DeleteOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOrganizationRequest, DeleteOrganizationResult> asyncHandler) {
        final DeleteOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOrganizationResult>() {
            @Override
            public DeleteOrganizationResult call() throws Exception {
                DeleteOrganizationResult result = null;

                try {
                    result = executeDeleteOrganization(finalRequest);
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
    public java.util.concurrent.Future<DeleteOrganizationalUnitResult> deleteOrganizationalUnitAsync(DeleteOrganizationalUnitRequest request) {

        return deleteOrganizationalUnitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationalUnitResult> deleteOrganizationalUnitAsync(final DeleteOrganizationalUnitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResult> asyncHandler) {
        final DeleteOrganizationalUnitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOrganizationalUnitResult>() {
            @Override
            public DeleteOrganizationalUnitResult call() throws Exception {
                DeleteOrganizationalUnitResult result = null;

                try {
                    result = executeDeleteOrganizationalUnit(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {
        final DeletePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result = null;

                try {
                    result = executeDeletePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeregisterDelegatedAdministratorResult> deregisterDelegatedAdministratorAsync(
            DeregisterDelegatedAdministratorRequest request) {

        return deregisterDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterDelegatedAdministratorResult> deregisterDelegatedAdministratorAsync(
            final DeregisterDelegatedAdministratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResult> asyncHandler) {
        final DeregisterDelegatedAdministratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterDelegatedAdministratorResult>() {
            @Override
            public DeregisterDelegatedAdministratorResult call() throws Exception {
                DeregisterDelegatedAdministratorResult result = null;

                try {
                    result = executeDeregisterDelegatedAdministrator(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest request) {

        return describeAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(final DescribeAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountRequest, DescribeAccountResult> asyncHandler) {
        final DescribeAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountResult>() {
            @Override
            public DescribeAccountResult call() throws Exception {
                DescribeAccountResult result = null;

                try {
                    result = executeDescribeAccount(finalRequest);
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
    public java.util.concurrent.Future<DescribeCreateAccountStatusResult> describeCreateAccountStatusAsync(DescribeCreateAccountStatusRequest request) {

        return describeCreateAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCreateAccountStatusResult> describeCreateAccountStatusAsync(final DescribeCreateAccountStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCreateAccountStatusRequest, DescribeCreateAccountStatusResult> asyncHandler) {
        final DescribeCreateAccountStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCreateAccountStatusResult>() {
            @Override
            public DescribeCreateAccountStatusResult call() throws Exception {
                DescribeCreateAccountStatusResult result = null;

                try {
                    result = executeDescribeCreateAccountStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeEffectivePolicyResult> describeEffectivePolicyAsync(DescribeEffectivePolicyRequest request) {

        return describeEffectivePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEffectivePolicyResult> describeEffectivePolicyAsync(final DescribeEffectivePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEffectivePolicyRequest, DescribeEffectivePolicyResult> asyncHandler) {
        final DescribeEffectivePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEffectivePolicyResult>() {
            @Override
            public DescribeEffectivePolicyResult call() throws Exception {
                DescribeEffectivePolicyResult result = null;

                try {
                    result = executeDescribeEffectivePolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeHandshakeResult> describeHandshakeAsync(DescribeHandshakeRequest request) {

        return describeHandshakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHandshakeResult> describeHandshakeAsync(final DescribeHandshakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHandshakeRequest, DescribeHandshakeResult> asyncHandler) {
        final DescribeHandshakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHandshakeResult>() {
            @Override
            public DescribeHandshakeResult call() throws Exception {
                DescribeHandshakeResult result = null;

                try {
                    result = executeDescribeHandshake(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest request) {

        return describeOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(final DescribeOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationRequest, DescribeOrganizationResult> asyncHandler) {
        final DescribeOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationResult>() {
            @Override
            public DescribeOrganizationResult call() throws Exception {
                DescribeOrganizationResult result = null;

                try {
                    result = executeDescribeOrganization(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrganizationalUnitResult> describeOrganizationalUnitAsync(DescribeOrganizationalUnitRequest request) {

        return describeOrganizationalUnitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationalUnitResult> describeOrganizationalUnitAsync(final DescribeOrganizationalUnitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationalUnitRequest, DescribeOrganizationalUnitResult> asyncHandler) {
        final DescribeOrganizationalUnitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationalUnitResult>() {
            @Override
            public DescribeOrganizationalUnitResult call() throws Exception {
                DescribeOrganizationalUnitResult result = null;

                try {
                    result = executeDescribeOrganizationalUnit(finalRequest);
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
    public java.util.concurrent.Future<DescribePolicyResult> describePolicyAsync(DescribePolicyRequest request) {

        return describePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePolicyResult> describePolicyAsync(final DescribePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePolicyRequest, DescribePolicyResult> asyncHandler) {
        final DescribePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePolicyResult>() {
            @Override
            public DescribePolicyResult call() throws Exception {
                DescribePolicyResult result = null;

                try {
                    result = executeDescribePolicy(finalRequest);
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
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest request) {

        return detachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(final DetachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler) {
        final DetachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachPolicyResult>() {
            @Override
            public DetachPolicyResult call() throws Exception {
                DetachPolicyResult result = null;

                try {
                    result = executeDetachPolicy(finalRequest);
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
    public java.util.concurrent.Future<DisableAWSServiceAccessResult> disableAWSServiceAccessAsync(DisableAWSServiceAccessRequest request) {

        return disableAWSServiceAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableAWSServiceAccessResult> disableAWSServiceAccessAsync(final DisableAWSServiceAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableAWSServiceAccessRequest, DisableAWSServiceAccessResult> asyncHandler) {
        final DisableAWSServiceAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableAWSServiceAccessResult>() {
            @Override
            public DisableAWSServiceAccessResult call() throws Exception {
                DisableAWSServiceAccessResult result = null;

                try {
                    result = executeDisableAWSServiceAccess(finalRequest);
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
    public java.util.concurrent.Future<DisablePolicyTypeResult> disablePolicyTypeAsync(DisablePolicyTypeRequest request) {

        return disablePolicyTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisablePolicyTypeResult> disablePolicyTypeAsync(final DisablePolicyTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisablePolicyTypeRequest, DisablePolicyTypeResult> asyncHandler) {
        final DisablePolicyTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisablePolicyTypeResult>() {
            @Override
            public DisablePolicyTypeResult call() throws Exception {
                DisablePolicyTypeResult result = null;

                try {
                    result = executeDisablePolicyType(finalRequest);
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
    public java.util.concurrent.Future<EnableAWSServiceAccessResult> enableAWSServiceAccessAsync(EnableAWSServiceAccessRequest request) {

        return enableAWSServiceAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAWSServiceAccessResult> enableAWSServiceAccessAsync(final EnableAWSServiceAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableAWSServiceAccessRequest, EnableAWSServiceAccessResult> asyncHandler) {
        final EnableAWSServiceAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableAWSServiceAccessResult>() {
            @Override
            public EnableAWSServiceAccessResult call() throws Exception {
                EnableAWSServiceAccessResult result = null;

                try {
                    result = executeEnableAWSServiceAccess(finalRequest);
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
    public java.util.concurrent.Future<EnableAllFeaturesResult> enableAllFeaturesAsync(EnableAllFeaturesRequest request) {

        return enableAllFeaturesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAllFeaturesResult> enableAllFeaturesAsync(final EnableAllFeaturesRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableAllFeaturesRequest, EnableAllFeaturesResult> asyncHandler) {
        final EnableAllFeaturesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableAllFeaturesResult>() {
            @Override
            public EnableAllFeaturesResult call() throws Exception {
                EnableAllFeaturesResult result = null;

                try {
                    result = executeEnableAllFeatures(finalRequest);
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
    public java.util.concurrent.Future<EnablePolicyTypeResult> enablePolicyTypeAsync(EnablePolicyTypeRequest request) {

        return enablePolicyTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnablePolicyTypeResult> enablePolicyTypeAsync(final EnablePolicyTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnablePolicyTypeRequest, EnablePolicyTypeResult> asyncHandler) {
        final EnablePolicyTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnablePolicyTypeResult>() {
            @Override
            public EnablePolicyTypeResult call() throws Exception {
                EnablePolicyTypeResult result = null;

                try {
                    result = executeEnablePolicyType(finalRequest);
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
    public java.util.concurrent.Future<InviteAccountToOrganizationResult> inviteAccountToOrganizationAsync(InviteAccountToOrganizationRequest request) {

        return inviteAccountToOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InviteAccountToOrganizationResult> inviteAccountToOrganizationAsync(final InviteAccountToOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<InviteAccountToOrganizationRequest, InviteAccountToOrganizationResult> asyncHandler) {
        final InviteAccountToOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InviteAccountToOrganizationResult>() {
            @Override
            public InviteAccountToOrganizationResult call() throws Exception {
                InviteAccountToOrganizationResult result = null;

                try {
                    result = executeInviteAccountToOrganization(finalRequest);
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
    public java.util.concurrent.Future<LeaveOrganizationResult> leaveOrganizationAsync(LeaveOrganizationRequest request) {

        return leaveOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LeaveOrganizationResult> leaveOrganizationAsync(final LeaveOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<LeaveOrganizationRequest, LeaveOrganizationResult> asyncHandler) {
        final LeaveOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LeaveOrganizationResult>() {
            @Override
            public LeaveOrganizationResult call() throws Exception {
                LeaveOrganizationResult result = null;

                try {
                    result = executeLeaveOrganization(finalRequest);
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
    public java.util.concurrent.Future<ListAWSServiceAccessForOrganizationResult> listAWSServiceAccessForOrganizationAsync(
            ListAWSServiceAccessForOrganizationRequest request) {

        return listAWSServiceAccessForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAWSServiceAccessForOrganizationResult> listAWSServiceAccessForOrganizationAsync(
            final ListAWSServiceAccessForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAWSServiceAccessForOrganizationRequest, ListAWSServiceAccessForOrganizationResult> asyncHandler) {
        final ListAWSServiceAccessForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAWSServiceAccessForOrganizationResult>() {
            @Override
            public ListAWSServiceAccessForOrganizationResult call() throws Exception {
                ListAWSServiceAccessForOrganizationResult result = null;

                try {
                    result = executeListAWSServiceAccessForOrganization(finalRequest);
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
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request) {

        return listAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(final ListAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler) {
        final ListAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountsResult>() {
            @Override
            public ListAccountsResult call() throws Exception {
                ListAccountsResult result = null;

                try {
                    result = executeListAccounts(finalRequest);
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
    public java.util.concurrent.Future<ListAccountsForParentResult> listAccountsForParentAsync(ListAccountsForParentRequest request) {

        return listAccountsForParentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsForParentResult> listAccountsForParentAsync(final ListAccountsForParentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountsForParentRequest, ListAccountsForParentResult> asyncHandler) {
        final ListAccountsForParentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountsForParentResult>() {
            @Override
            public ListAccountsForParentResult call() throws Exception {
                ListAccountsForParentResult result = null;

                try {
                    result = executeListAccountsForParent(finalRequest);
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
    public java.util.concurrent.Future<ListChildrenResult> listChildrenAsync(ListChildrenRequest request) {

        return listChildrenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChildrenResult> listChildrenAsync(final ListChildrenRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChildrenRequest, ListChildrenResult> asyncHandler) {
        final ListChildrenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChildrenResult>() {
            @Override
            public ListChildrenResult call() throws Exception {
                ListChildrenResult result = null;

                try {
                    result = executeListChildren(finalRequest);
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
    public java.util.concurrent.Future<ListCreateAccountStatusResult> listCreateAccountStatusAsync(ListCreateAccountStatusRequest request) {

        return listCreateAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCreateAccountStatusResult> listCreateAccountStatusAsync(final ListCreateAccountStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCreateAccountStatusRequest, ListCreateAccountStatusResult> asyncHandler) {
        final ListCreateAccountStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCreateAccountStatusResult>() {
            @Override
            public ListCreateAccountStatusResult call() throws Exception {
                ListCreateAccountStatusResult result = null;

                try {
                    result = executeListCreateAccountStatus(finalRequest);
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
    public java.util.concurrent.Future<ListDelegatedAdministratorsResult> listDelegatedAdministratorsAsync(ListDelegatedAdministratorsRequest request) {

        return listDelegatedAdministratorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDelegatedAdministratorsResult> listDelegatedAdministratorsAsync(final ListDelegatedAdministratorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResult> asyncHandler) {
        final ListDelegatedAdministratorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDelegatedAdministratorsResult>() {
            @Override
            public ListDelegatedAdministratorsResult call() throws Exception {
                ListDelegatedAdministratorsResult result = null;

                try {
                    result = executeListDelegatedAdministrators(finalRequest);
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
    public java.util.concurrent.Future<ListDelegatedServicesForAccountResult> listDelegatedServicesForAccountAsync(
            ListDelegatedServicesForAccountRequest request) {

        return listDelegatedServicesForAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDelegatedServicesForAccountResult> listDelegatedServicesForAccountAsync(
            final ListDelegatedServicesForAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDelegatedServicesForAccountRequest, ListDelegatedServicesForAccountResult> asyncHandler) {
        final ListDelegatedServicesForAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDelegatedServicesForAccountResult>() {
            @Override
            public ListDelegatedServicesForAccountResult call() throws Exception {
                ListDelegatedServicesForAccountResult result = null;

                try {
                    result = executeListDelegatedServicesForAccount(finalRequest);
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
    public java.util.concurrent.Future<ListHandshakesForAccountResult> listHandshakesForAccountAsync(ListHandshakesForAccountRequest request) {

        return listHandshakesForAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHandshakesForAccountResult> listHandshakesForAccountAsync(final ListHandshakesForAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHandshakesForAccountRequest, ListHandshakesForAccountResult> asyncHandler) {
        final ListHandshakesForAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHandshakesForAccountResult>() {
            @Override
            public ListHandshakesForAccountResult call() throws Exception {
                ListHandshakesForAccountResult result = null;

                try {
                    result = executeListHandshakesForAccount(finalRequest);
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
    public java.util.concurrent.Future<ListHandshakesForOrganizationResult> listHandshakesForOrganizationAsync(ListHandshakesForOrganizationRequest request) {

        return listHandshakesForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHandshakesForOrganizationResult> listHandshakesForOrganizationAsync(
            final ListHandshakesForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHandshakesForOrganizationRequest, ListHandshakesForOrganizationResult> asyncHandler) {
        final ListHandshakesForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHandshakesForOrganizationResult>() {
            @Override
            public ListHandshakesForOrganizationResult call() throws Exception {
                ListHandshakesForOrganizationResult result = null;

                try {
                    result = executeListHandshakesForOrganization(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationalUnitsForParentResult> listOrganizationalUnitsForParentAsync(
            ListOrganizationalUnitsForParentRequest request) {

        return listOrganizationalUnitsForParentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationalUnitsForParentResult> listOrganizationalUnitsForParentAsync(
            final ListOrganizationalUnitsForParentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationalUnitsForParentRequest, ListOrganizationalUnitsForParentResult> asyncHandler) {
        final ListOrganizationalUnitsForParentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationalUnitsForParentResult>() {
            @Override
            public ListOrganizationalUnitsForParentResult call() throws Exception {
                ListOrganizationalUnitsForParentResult result = null;

                try {
                    result = executeListOrganizationalUnitsForParent(finalRequest);
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
    public java.util.concurrent.Future<ListParentsResult> listParentsAsync(ListParentsRequest request) {

        return listParentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParentsResult> listParentsAsync(final ListParentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListParentsRequest, ListParentsResult> asyncHandler) {
        final ListParentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListParentsResult>() {
            @Override
            public ListParentsResult call() throws Exception {
                ListParentsResult result = null;

                try {
                    result = executeListParents(finalRequest);
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
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {
        final ListPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
            @Override
            public ListPoliciesResult call() throws Exception {
                ListPoliciesResult result = null;

                try {
                    result = executeListPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListPoliciesForTargetResult> listPoliciesForTargetAsync(ListPoliciesForTargetRequest request) {

        return listPoliciesForTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesForTargetResult> listPoliciesForTargetAsync(final ListPoliciesForTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesForTargetRequest, ListPoliciesForTargetResult> asyncHandler) {
        final ListPoliciesForTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesForTargetResult>() {
            @Override
            public ListPoliciesForTargetResult call() throws Exception {
                ListPoliciesForTargetResult result = null;

                try {
                    result = executeListPoliciesForTarget(finalRequest);
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
    public java.util.concurrent.Future<ListRootsResult> listRootsAsync(ListRootsRequest request) {

        return listRootsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRootsResult> listRootsAsync(final ListRootsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRootsRequest, ListRootsResult> asyncHandler) {
        final ListRootsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRootsResult>() {
            @Override
            public ListRootsResult call() throws Exception {
                ListRootsResult result = null;

                try {
                    result = executeListRoots(finalRequest);
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
    public java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest request) {

        return listTargetsForPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(final ListTargetsForPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsForPolicyRequest, ListTargetsForPolicyResult> asyncHandler) {
        final ListTargetsForPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsForPolicyResult>() {
            @Override
            public ListTargetsForPolicyResult call() throws Exception {
                ListTargetsForPolicyResult result = null;

                try {
                    result = executeListTargetsForPolicy(finalRequest);
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
    public java.util.concurrent.Future<MoveAccountResult> moveAccountAsync(MoveAccountRequest request) {

        return moveAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MoveAccountResult> moveAccountAsync(final MoveAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<MoveAccountRequest, MoveAccountResult> asyncHandler) {
        final MoveAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MoveAccountResult>() {
            @Override
            public MoveAccountResult call() throws Exception {
                MoveAccountResult result = null;

                try {
                    result = executeMoveAccount(finalRequest);
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
    public java.util.concurrent.Future<RegisterDelegatedAdministratorResult> registerDelegatedAdministratorAsync(RegisterDelegatedAdministratorRequest request) {

        return registerDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDelegatedAdministratorResult> registerDelegatedAdministratorAsync(
            final RegisterDelegatedAdministratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResult> asyncHandler) {
        final RegisterDelegatedAdministratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDelegatedAdministratorResult>() {
            @Override
            public RegisterDelegatedAdministratorResult call() throws Exception {
                RegisterDelegatedAdministratorResult result = null;

                try {
                    result = executeRegisterDelegatedAdministrator(finalRequest);
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
    public java.util.concurrent.Future<RemoveAccountFromOrganizationResult> removeAccountFromOrganizationAsync(RemoveAccountFromOrganizationRequest request) {

        return removeAccountFromOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAccountFromOrganizationResult> removeAccountFromOrganizationAsync(
            final RemoveAccountFromOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAccountFromOrganizationRequest, RemoveAccountFromOrganizationResult> asyncHandler) {
        final RemoveAccountFromOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAccountFromOrganizationResult>() {
            @Override
            public RemoveAccountFromOrganizationResult call() throws Exception {
                RemoveAccountFromOrganizationResult result = null;

                try {
                    result = executeRemoveAccountFromOrganization(finalRequest);
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
    public java.util.concurrent.Future<UpdateOrganizationalUnitResult> updateOrganizationalUnitAsync(UpdateOrganizationalUnitRequest request) {

        return updateOrganizationalUnitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationalUnitResult> updateOrganizationalUnitAsync(final UpdateOrganizationalUnitRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResult> asyncHandler) {
        final UpdateOrganizationalUnitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrganizationalUnitResult>() {
            @Override
            public UpdateOrganizationalUnitResult call() throws Exception {
                UpdateOrganizationalUnitResult result = null;

                try {
                    result = executeUpdateOrganizationalUnit(finalRequest);
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
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest request) {

        return updatePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(final UpdatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResult> asyncHandler) {
        final UpdatePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePolicyResult>() {
            @Override
            public UpdatePolicyResult call() throws Exception {
                UpdatePolicyResult result = null;

                try {
                    result = executeUpdatePolicy(finalRequest);
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
