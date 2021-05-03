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
package com.amazonaws.services.securitytoken;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS STS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS Security Token Service</fullname>
 * <p>
 * AWS Security Token Service (STS) enables you to request temporary, limited-privilege credentials for AWS Identity and
 * Access Management (IAM) users or for users that you authenticate (federated users). This guide provides descriptions
 * of the STS API. For more information about using this service, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityTokenServiceAsyncClient extends AWSSecurityTokenServiceClient implements AWSSecurityTokenServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS STS (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the provided AWS account
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
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSecurityTokenServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSecurityTokenServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSSecurityTokenServiceAsyncClientBuilder asyncBuilder() {
        return AWSSecurityTokenServiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSecurityTokenServiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSecurityTokenServiceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(AssumeRoleRequest request) {

        return assumeRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(final AssumeRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleRequest, AssumeRoleResult> asyncHandler) {
        final AssumeRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeRoleResult>() {
            @Override
            public AssumeRoleResult call() throws Exception {
                AssumeRoleResult result = null;

                try {
                    result = executeAssumeRole(finalRequest);
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
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(AssumeRoleWithSAMLRequest request) {

        return assumeRoleWithSAMLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(final AssumeRoleWithSAMLRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleWithSAMLRequest, AssumeRoleWithSAMLResult> asyncHandler) {
        final AssumeRoleWithSAMLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeRoleWithSAMLResult>() {
            @Override
            public AssumeRoleWithSAMLResult call() throws Exception {
                AssumeRoleWithSAMLResult result = null;

                try {
                    result = executeAssumeRoleWithSAML(finalRequest);
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
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(AssumeRoleWithWebIdentityRequest request) {

        return assumeRoleWithWebIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(final AssumeRoleWithWebIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleWithWebIdentityRequest, AssumeRoleWithWebIdentityResult> asyncHandler) {
        final AssumeRoleWithWebIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeRoleWithWebIdentityResult>() {
            @Override
            public AssumeRoleWithWebIdentityResult call() throws Exception {
                AssumeRoleWithWebIdentityResult result = null;

                try {
                    result = executeAssumeRoleWithWebIdentity(finalRequest);
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
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(DecodeAuthorizationMessageRequest request) {

        return decodeAuthorizationMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(final DecodeAuthorizationMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResult> asyncHandler) {
        final DecodeAuthorizationMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DecodeAuthorizationMessageResult>() {
            @Override
            public DecodeAuthorizationMessageResult call() throws Exception {
                DecodeAuthorizationMessageResult result = null;

                try {
                    result = executeDecodeAuthorizationMessage(finalRequest);
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
    public java.util.concurrent.Future<GetAccessKeyInfoResult> getAccessKeyInfoAsync(GetAccessKeyInfoRequest request) {

        return getAccessKeyInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessKeyInfoResult> getAccessKeyInfoAsync(final GetAccessKeyInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessKeyInfoRequest, GetAccessKeyInfoResult> asyncHandler) {
        final GetAccessKeyInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessKeyInfoResult>() {
            @Override
            public GetAccessKeyInfoResult call() throws Exception {
                GetAccessKeyInfoResult result = null;

                try {
                    result = executeGetAccessKeyInfo(finalRequest);
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
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(GetCallerIdentityRequest request) {

        return getCallerIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(final GetCallerIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCallerIdentityRequest, GetCallerIdentityResult> asyncHandler) {
        final GetCallerIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCallerIdentityResult>() {
            @Override
            public GetCallerIdentityResult call() throws Exception {
                GetCallerIdentityResult result = null;

                try {
                    result = executeGetCallerIdentity(finalRequest);
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
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(GetSessionTokenRequest request) {

        return getSessionTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(final GetSessionTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {
        final GetSessionTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionTokenResult>() {
            @Override
            public GetSessionTokenResult call() throws Exception {
                GetSessionTokenResult result = null;

                try {
                    result = executeGetSessionToken(finalRequest);
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
     * Simplified method form for invoking the GetSessionToken operation.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync() {

        return getSessionTokenAsync(new GetSessionTokenRequest());
    }

    /**
     * Simplified method form for invoking the GetSessionToken operation with an AsyncHandler.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(
            com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {

        return getSessionTokenAsync(new GetSessionTokenRequest(), asyncHandler);
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
