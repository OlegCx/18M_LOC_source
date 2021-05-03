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
package com.amazonaws.services.elasticfilesystem;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing EFS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 * <p>
 * Amazon Elastic File System (Amazon EFS) provides simple, scalable file storage for use with Amazon EC2 instances in
 * the AWS Cloud. With Amazon EFS, storage capacity is elastic, growing and shrinking automatically as you add and
 * remove files, so your applications have the storage they need, when they need it. For more information, see the <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/api-reference.html">User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticFileSystemAsyncClient extends AmazonElasticFileSystemClient implements AmazonElasticFileSystemAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to EFS (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the provided AWS account credentials
     * provider and client configuration options.
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
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticFileSystemAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticFileSystemAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticFileSystemAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonElasticFileSystemAsyncClientBuilder asyncBuilder() {
        return AmazonElasticFileSystemAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonElasticFileSystemAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonElasticFileSystemAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request) {

        return createAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(final CreateAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler) {
        final CreateAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessPointResult>() {
            @Override
            public CreateAccessPointResult call() throws Exception {
                CreateAccessPointResult result = null;

                try {
                    result = executeCreateAccessPoint(finalRequest);
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
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(final CreateFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {
        final CreateFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFileSystemResult>() {
            @Override
            public CreateFileSystemResult call() throws Exception {
                CreateFileSystemResult result = null;

                try {
                    result = executeCreateFileSystem(finalRequest);
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
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(CreateMountTargetRequest request) {

        return createMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(final CreateMountTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler) {
        final CreateMountTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMountTargetResult>() {
            @Override
            public CreateMountTargetResult call() throws Exception {
                CreateMountTargetResult result = null;

                try {
                    result = executeCreateMountTarget(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {
        final CreateTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result = null;

                try {
                    result = executeCreateTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request) {

        return deleteAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(final DeleteAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler) {
        final DeleteAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessPointResult>() {
            @Override
            public DeleteAccessPointResult call() throws Exception {
                DeleteAccessPointResult result = null;

                try {
                    result = executeDeleteAccessPoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(final DeleteFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler) {
        final DeleteFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileSystemResult>() {
            @Override
            public DeleteFileSystemResult call() throws Exception {
                DeleteFileSystemResult result = null;

                try {
                    result = executeDeleteFileSystem(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(DeleteFileSystemPolicyRequest request) {

        return deleteFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(final DeleteFileSystemPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileSystemPolicyRequest, DeleteFileSystemPolicyResult> asyncHandler) {
        final DeleteFileSystemPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileSystemPolicyResult>() {
            @Override
            public DeleteFileSystemPolicyResult call() throws Exception {
                DeleteFileSystemPolicyResult result = null;

                try {
                    result = executeDeleteFileSystemPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(DeleteMountTargetRequest request) {

        return deleteMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(final DeleteMountTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, DeleteMountTargetResult> asyncHandler) {
        final DeleteMountTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMountTargetResult>() {
            @Override
            public DeleteMountTargetResult call() throws Exception {
                DeleteMountTargetResult result = null;

                try {
                    result = executeDeleteMountTarget(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(DescribeAccessPointsRequest request) {

        return describeAccessPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(final DescribeAccessPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccessPointsRequest, DescribeAccessPointsResult> asyncHandler) {
        final DescribeAccessPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccessPointsResult>() {
            @Override
            public DescribeAccessPointsResult call() throws Exception {
                DescribeAccessPointsResult result = null;

                try {
                    result = executeDescribeAccessPoints(finalRequest);
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
    public java.util.concurrent.Future<DescribeBackupPolicyResult> describeBackupPolicyAsync(DescribeBackupPolicyRequest request) {

        return describeBackupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupPolicyResult> describeBackupPolicyAsync(final DescribeBackupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBackupPolicyRequest, DescribeBackupPolicyResult> asyncHandler) {
        final DescribeBackupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBackupPolicyResult>() {
            @Override
            public DescribeBackupPolicyResult call() throws Exception {
                DescribeBackupPolicyResult result = null;

                try {
                    result = executeDescribeBackupPolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(DescribeFileSystemPolicyRequest request) {

        return describeFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(final DescribeFileSystemPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemPolicyRequest, DescribeFileSystemPolicyResult> asyncHandler) {
        final DescribeFileSystemPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFileSystemPolicyResult>() {
            @Override
            public DescribeFileSystemPolicyResult call() throws Exception {
                DescribeFileSystemPolicyResult result = null;

                try {
                    result = executeDescribeFileSystemPolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(final DescribeFileSystemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {
        final DescribeFileSystemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFileSystemsResult>() {
            @Override
            public DescribeFileSystemsResult call() throws Exception {
                DescribeFileSystemsResult result = null;

                try {
                    result = executeDescribeFileSystems(finalRequest);
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
     * Simplified method form for invoking the DescribeFileSystems operation.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync() {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFileSystems operation with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(DescribeLifecycleConfigurationRequest request) {

        return describeLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(
            final DescribeLifecycleConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLifecycleConfigurationRequest, DescribeLifecycleConfigurationResult> asyncHandler) {
        final DescribeLifecycleConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLifecycleConfigurationResult>() {
            @Override
            public DescribeLifecycleConfigurationResult call() throws Exception {
                DescribeLifecycleConfigurationResult result = null;

                try {
                    result = executeDescribeLifecycleConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest request) {

        return describeMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            final DescribeMountTargetSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler) {
        final DescribeMountTargetSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMountTargetSecurityGroupsResult>() {
            @Override
            public DescribeMountTargetSecurityGroupsResult call() throws Exception {
                DescribeMountTargetSecurityGroupsResult result = null;

                try {
                    result = executeDescribeMountTargetSecurityGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(DescribeMountTargetsRequest request) {

        return describeMountTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(final DescribeMountTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler) {
        final DescribeMountTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMountTargetsResult>() {
            @Override
            public DescribeMountTargetsResult call() throws Exception {
                DescribeMountTargetsResult result = null;

                try {
                    result = executeDescribeMountTargets(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {
        final DescribeTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;

                try {
                    result = executeDescribeTags(finalRequest);
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
    public java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest request) {

        return modifyMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            final ModifyMountTargetSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, ModifyMountTargetSecurityGroupsResult> asyncHandler) {
        final ModifyMountTargetSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyMountTargetSecurityGroupsResult>() {
            @Override
            public ModifyMountTargetSecurityGroupsResult call() throws Exception {
                ModifyMountTargetSecurityGroupsResult result = null;

                try {
                    result = executeModifyMountTargetSecurityGroups(finalRequest);
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
    public java.util.concurrent.Future<PutBackupPolicyResult> putBackupPolicyAsync(PutBackupPolicyRequest request) {

        return putBackupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBackupPolicyResult> putBackupPolicyAsync(final PutBackupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBackupPolicyRequest, PutBackupPolicyResult> asyncHandler) {
        final PutBackupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBackupPolicyResult>() {
            @Override
            public PutBackupPolicyResult call() throws Exception {
                PutBackupPolicyResult result = null;

                try {
                    result = executePutBackupPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(PutFileSystemPolicyRequest request) {

        return putFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(final PutFileSystemPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFileSystemPolicyRequest, PutFileSystemPolicyResult> asyncHandler) {
        final PutFileSystemPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFileSystemPolicyResult>() {
            @Override
            public PutFileSystemPolicyResult call() throws Exception {
                PutFileSystemPolicyResult result = null;

                try {
                    result = executePutFileSystemPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(PutLifecycleConfigurationRequest request) {

        return putLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(final PutLifecycleConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLifecycleConfigurationRequest, PutLifecycleConfigurationResult> asyncHandler) {
        final PutLifecycleConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLifecycleConfigurationResult>() {
            @Override
            public PutLifecycleConfigurationResult call() throws Exception {
                PutLifecycleConfigurationResult result = null;

                try {
                    result = executePutLifecycleConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request) {

        return updateFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(final UpdateFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler) {
        final UpdateFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFileSystemResult>() {
            @Override
            public UpdateFileSystemResult call() throws Exception {
                UpdateFileSystemResult result = null;

                try {
                    result = executeUpdateFileSystem(finalRequest);
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
