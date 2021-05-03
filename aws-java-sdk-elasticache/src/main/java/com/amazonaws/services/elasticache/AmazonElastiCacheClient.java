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
package com.amazonaws.services.elasticache;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder;
import com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.model.transform.*;

/**
 * Client for accessing Amazon ElastiCache. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
 * cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
 * administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
 * statistics associated with their cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElastiCacheClient extends AmazonWebServiceClient implements AmazonElastiCache {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElastiCache.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticache";

    private volatile AmazonElastiCacheWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElastiCacheClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElastiCacheClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElastiCacheClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonElastiCacheClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElastiCacheClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElastiCacheClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonElastiCacheClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElastiCacheClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElastiCacheClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonElastiCacheClientBuilder builder() {
        return AmazonElastiCacheClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElastiCacheClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElastiCacheClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new CacheSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGlobalReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotUnderMigrationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TestFailoverNotAvailableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateUserNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetNotAllowedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceLinkedRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new APICallRateForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidKMSKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCacheClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeGroupsPerReplicationGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DefaultUserRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUserGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForClusterExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceUpdateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotFeatureNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyUnderMigrationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DefaultUserAssociatedToUserGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUserStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidARNExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagQuotaPerResourceExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.elasticache.model.AmazonElastiCacheException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticache.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticache/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticache/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your ElastiCache resources, with the exception of global replication group. When you add or remove tags on
     * replication groups, those actions will be replicated to all nodes in the replication group. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html">Resource
     * -level permissions</a>.
     * </p>
     * <p>
     * For example, you can use cost-allocation tags to your ElastiCache resources, AWS generates a cost allocation
     * report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply
     * tags that represent business categories (such as cost centers, application names, or owners) to organize your
     * costs across multiple services.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Using Cost Allocation Tags in
     * Amazon ElastiCache</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an AddTagsToResource operation.
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AddTagsToResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller().marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddTagsToResourceResult> responseHandler = new StaxResponseHandler<AddTagsToResourceResult>(
                    new AddTagsToResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
     * and Amazon EC2 security groups are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
     * region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
     * @return Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified Amazon EC2 security group is already authorized for the specified cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.AuthorizeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AuthorizeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeCacheSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final CacheSecurityGroup executeAuthorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeCacheSecurityGroupIngressRequestMarshaller()
                        .marshall(super.beforeMarshalling(authorizeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeCacheSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Apply the service update. For more information on service updates and applying them, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/applying-updates.html">Applying Service
     * Updates</a>.
     * </p>
     * 
     * @param batchApplyUpdateActionRequest
     * @return Result of the BatchApplyUpdateAction operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.BatchApplyUpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchApplyUpdateAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchApplyUpdateActionResult batchApplyUpdateAction(BatchApplyUpdateActionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchApplyUpdateAction(request);
    }

    @SdkInternalApi
    final BatchApplyUpdateActionResult executeBatchApplyUpdateAction(BatchApplyUpdateActionRequest batchApplyUpdateActionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchApplyUpdateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchApplyUpdateActionRequest> request = null;
        Response<BatchApplyUpdateActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchApplyUpdateActionRequestMarshaller().marshall(super.beforeMarshalling(batchApplyUpdateActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchApplyUpdateAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchApplyUpdateActionResult> responseHandler = new StaxResponseHandler<BatchApplyUpdateActionResult>(
                    new BatchApplyUpdateActionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop the service update. For more information on service updates and stopping them, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/stopping-self-service-updates.html">Stopping
     * Service Updates</a>.
     * </p>
     * 
     * @param batchStopUpdateActionRequest
     * @return Result of the BatchStopUpdateAction operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.BatchStopUpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchStopUpdateAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchStopUpdateActionResult batchStopUpdateAction(BatchStopUpdateActionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchStopUpdateAction(request);
    }

    @SdkInternalApi
    final BatchStopUpdateActionResult executeBatchStopUpdateAction(BatchStopUpdateActionRequest batchStopUpdateActionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchStopUpdateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStopUpdateActionRequest> request = null;
        Response<BatchStopUpdateActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStopUpdateActionRequestMarshaller().marshall(super.beforeMarshalling(batchStopUpdateActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchStopUpdateAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchStopUpdateActionResult> responseHandler = new StaxResponseHandler<BatchStopUpdateActionResult>(
                    new BatchStopUpdateActionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Complete the migration of data.
     * </p>
     * 
     * @param completeMigrationRequest
     * @return Result of the CompleteMigration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotUnderMigrationException
     *         The designated replication group is not available for data migration.
     * @sample AmazonElastiCache.CompleteMigration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CompleteMigration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ReplicationGroup completeMigration(CompleteMigrationRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteMigration(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeCompleteMigration(CompleteMigrationRequest completeMigrationRequest) {

        ExecutionContext executionContext = createExecutionContext(completeMigrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteMigrationRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteMigrationRequestMarshaller().marshall(super.beforeMarshalling(completeMigrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteMigration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the <code>CopySnapshot</code> operation can create their own Amazon
     * S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <code>CopySnapshot</code> operation. For more information about using IAM to control the
     * use of ElastiCache operations, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting Snapshots</a>
     * and <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html">Authentication &amp; Access
     * Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient permissions to perform the desired
     * activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique value. If exporting a snapshot, you
     * could alternatively create a new Amazon S3 bucket and use this same value for <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <code>CopySnapshotMessage</code> operation.
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Snapshot copySnapshot(CopySnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopySnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeCopySnapshot(CopySnapshotRequest copySnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestMarshaller().marshall(super.beforeMarshalling(copySnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopySnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
     * Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a CreateCacheCluster operation.
     * @return Result of the CreateCacheCluster operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws CacheClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CacheCluster createCacheCluster(CreateCacheClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCacheCluster(request);
    }

    @SdkInternalApi
    final CacheCluster executeCreateCacheCluster(CreateCacheClusterRequest createCacheClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(createCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCacheCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of
     * parameters and their values that are applied to all of the nodes in any cluster or replication group using the
     * CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the
     * CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of
     * specific parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html">
     * ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html">Parameters and
     * Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <code>CreateCacheParameterGroup</code> operation.
     * @return Result of the CreateCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of cache security groups.
     * @throws CacheParameterGroupAlreadyExistsException
     *         A cache parameter group with the requested name already exists.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCacheParameterGroup(request);
    }

    @SdkInternalApi
    final CacheParameterGroup executeCreateCacheParameterGroup(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheParameterGroupRequest> request = null;
        Response<CacheParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCacheParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheParameterGroup> responseHandler = new StaxResponseHandler<CacheParameterGroup>(new CacheParameterGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
     * (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
     * @return Result of the CreateCacheSecurityGroup operation returned by the service.
     * @throws CacheSecurityGroupAlreadyExistsException
     *         A cache security group with the specified name already exists.
     * @throws CacheSecurityGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache security groups.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCacheSecurityGroup(request);
    }

    @SdkInternalApi
    final CacheSecurityGroup executeCreateCacheSecurityGroup(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSecurityGroupRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCacheSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
     * @return Result of the CreateCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupAlreadyExistsException
     *         The requested cache subnet group name is already in use by an existing cache subnet group.
     * @throws CacheSubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache subnet groups.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws SubnetNotAllowedException
     *         At least one subnet ID does not match the other subnet IDs. This mismatch typically occurs when a user
     *         sets one subnet ID to a regional Availability Zone and a different one to an outpost. Or when a user sets
     *         the subnet ID to an Outpost when not subscribed on this service.
     * @sample AmazonElastiCache.CreateCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCacheSubnetGroup(request);
    }

    @SdkInternalApi
    final CacheSubnetGroup executeCreateCacheSubnetGroup(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCacheSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSubnetGroup> responseHandler = new StaxResponseHandler<CacheSubnetGroup>(new CacheSubnetGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global
     * Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable
     * low-latency reads and disaster recovery across regions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Redis-Global-Datastore.html">Replication Across
     * Regions Using Global Datastore</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> is the name of the Global datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <b>PrimaryReplicationGroupId</b> represents the name of the primary cluster that accepts writes and will
     * replicate updates to the secondary cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGlobalReplicationGroupRequest
     * @return Result of the CreateGlobalReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws GlobalReplicationGroupAlreadyExistsException
     *         The Global datastore name already exists.
     * @throws ServiceLinkedRoleNotFoundException
     *         The specified service linked role (SLR) was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup createGlobalReplicationGroup(CreateGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeCreateGlobalReplicationGroup(CreateGlobalReplicationGroupRequest createGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlobalReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(createGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * This API can be used to create a standalone regional replication group or a secondary replication group
     * associated with a Global datastore.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a
     * read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to
     * the replicas.
     * </p>
     * <p>
     * A Redis cluster-mode enabled cluster is comprised of from 1 to 90 shards (API/CLI: node groups). Each shard has a
     * primary node and up to 5 read-only replica nodes. The configuration can range from 90 shards and 0 replicas to 15
     * shards and 5 replicas, which is the maximum number or replicas allowed.
     * </p>
     * <p>
     * The node or shard limit can be increased to a maximum of 500 per cluster if the Redis engine version is 5.0.6 or
     * higher. For example, you can choose to configure a 500 node cluster that ranges between 83 shards (one primary
     * and 5 replicas per shard) and 500 shards (single primary and no replicas). Make sure there are enough available
     * IP addresses to accommodate the increase. Common pitfalls include the subnets in the subnet group have too small
     * a CIDR range or the subnets are shared and heavily used by other clusters. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.Creating.html">Creating a Subnet
     * Group</a>. For versions below 5.0.6, the limit is 250 per cluster.
     * </p>
     * <p>
     * To request a limit increase, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> and choose
     * the limit type <b>Nodes per cluster per instance type</b>.
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
     * read replicas to it, up to a total of 5 read replicas. If you need to increase or decrease the number of node
     * groups (console: shards), you can avail yourself of ElastiCache for Redis' scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Scaling.html">Scaling ElastiCache for Redis
     * Clusters</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <code>CreateReplicationGroup</code> operation.
     * @return Result of the CreateReplicationGroup operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws ReplicationGroupAlreadyExistsException
     *         The specified replication group already exists.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationGroup(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeCreateReplicationGroup(CreateReplicationGroupRequest createReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(createReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <code>CreateSnapshot</code> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Snapshot createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For Redis engine version 6.x onwards: Creates a Redis user. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws UserAlreadyExistsException
     *         A user with this ID already exists.
     * @throws UserQuotaExceededException
     *         The quota of users has been exceeded.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @sample AmazonElastiCache.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateUserResult> responseHandler = new StaxResponseHandler<CreateUserResult>(new CreateUserResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For Redis engine version 6.x onwards: Creates a Redis user group. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>
     * </p>
     * 
     * @param createUserGroupRequest
     * @return Result of the CreateUserGroup operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws UserGroupAlreadyExistsException
     *         The user group with this ID already exists.
     * @throws DefaultUserRequiredException
     *         You must add default user to a user group.
     * @throws UserGroupQuotaExceededException
     *         The number of users exceeds the user group limit.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @sample AmazonElastiCache.CreateUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateUserGroupResult createUserGroup(CreateUserGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserGroup(request);
    }

    @SdkInternalApi
    final CreateUserGroupResult executeCreateUserGroup(CreateUserGroupRequest createUserGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserGroupRequest> request = null;
        Response<CreateUserGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserGroupRequestMarshaller().marshall(super.beforeMarshalling(createUserGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateUserGroupResult> responseHandler = new StaxResponseHandler<CreateUserGroupResult>(
                    new CreateUserGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Decreases the number of node groups in a Global datastore
     * </p>
     * 
     * @param decreaseNodeGroupsInGlobalReplicationGroupRequest
     * @return Result of the DecreaseNodeGroupsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DecreaseNodeGroupsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseNodeGroupsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup decreaseNodeGroupsInGlobalReplicationGroup(DecreaseNodeGroupsInGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDecreaseNodeGroupsInGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeDecreaseNodeGroupsInGlobalReplicationGroup(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(decreaseNodeGroupsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller().marshall(super
                        .beforeMarshalling(decreaseNodeGroupsInGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DecreaseNodeGroupsInGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dynamically decreases the number of replicas in a Redis (cluster mode disabled) replication group or the number
     * of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @return Result of the DecreaseReplicaCount operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws ServiceLinkedRoleNotFoundException
     *         The specified service linked role (SLR) was not found.
     * @throws NoOperationException
     *         The operation was not performed because no changes were required.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DecreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup decreaseReplicaCount(DecreaseReplicaCountRequest request) {
        request = beforeClientExecution(request);
        return executeDecreaseReplicaCount(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeDecreaseReplicaCount(DecreaseReplicaCountRequest decreaseReplicaCountRequest) {

        ExecutionContext executionContext = createExecutionContext(decreaseReplicaCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseReplicaCountRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseReplicaCountRequestMarshaller().marshall(super.beforeMarshalling(decreaseReplicaCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DecreaseReplicaCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code> deletes all associated cache nodes,
     * node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation.
     * </p>
     * <p>
     * This operation is not valid for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode enabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the last read replica of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the primary node of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A node group (shard) that has Multi-AZ mode enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster from a Redis (cluster mode enabled) replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is not in the <code>available</code> state
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <code>DeleteCacheCluster</code> operation.
     * @return Result of the DeleteCacheCluster operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CacheCluster deleteCacheCluster(DeleteCacheClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCacheCluster(request);
    }

    @SdkInternalApi
    final CacheCluster executeDeleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCacheCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
     * any cache clusters. You cannot delete the default cache parameter groups in your account.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
     * @return Result of the DeleteCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCacheParameterGroupResult deleteCacheParameterGroup(DeleteCacheParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCacheParameterGroup(request);
    }

    @SdkInternalApi
    final DeleteCacheParameterGroupResult executeDeleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheParameterGroupRequest> request = null;
        Response<DeleteCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCacheParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheParameterGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheParameterGroupResult>(
                    new DeleteCacheParameterGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
     * @return Result of the DeleteCacheSecurityGroup operation returned by the service.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCacheSecurityGroupResult deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCacheSecurityGroup(request);
    }

    @SdkInternalApi
    final DeleteCacheSecurityGroupResult executeDeleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSecurityGroupRequest> request = null;
        Response<DeleteCacheSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCacheSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheSecurityGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheSecurityGroupResult>(
                    new DeleteCacheSecurityGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a default cache subnet group or one that is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
     * @return Result of the DeleteCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupInUseException
     *         The requested cache subnet group is currently in use.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DeleteCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCacheSubnetGroupResult deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCacheSubnetGroup(request);
    }

    @SdkInternalApi
    final DeleteCacheSubnetGroupResult executeDeleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSubnetGroupRequest> request = null;
        Response<DeleteCacheSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCacheSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheSubnetGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheSubnetGroupResult>(
                    new DeleteCacheSubnetGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deleting a Global datastore is a two-step process:
     * </p>
     * <ul>
     * <li>
     * <p>
     * First, you must <a>DisassociateGlobalReplicationGroup</a> to remove the secondary clusters in the Global
     * datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the Global datastore contains only the primary cluster, you can use the
     * <code>DeleteGlobalReplicationGroup</code> API to delete the Global datastore while retainining the primary
     * cluster using <code>RetainPrimaryReplicationGroup=true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Since the Global Datastore has only a primary cluster, you can delete the Global Datastore while retaining the
     * primary by setting <code>RetainPrimaryReplicationGroup=true</code>. The primary cluster is never deleted when
     * deleting a Global Datastore. It can only be deleted when it no longer is associated with any Global Datastore.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteGlobalReplicationGroupRequest
     * @return Result of the DeleteGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.DeleteGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup deleteGlobalReplicationGroup(DeleteGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeDeleteGlobalReplicationGroup(DeleteGlobalReplicationGroupRequest deleteGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlobalReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes the entire replication group, including
     * the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <code>DeleteReplicationGroup</code> operation.
     * @return Result of the DeleteReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationGroup(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeDeleteReplicationGroup(DeleteReplicationGroupRequest deleteReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <code>DeleteSnapshot</code> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Snapshot deleteSnapshot(DeleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeDeleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For Redis engine version 6.x onwards: Deletes a user. The user will be removed from all user groups and in turn
     * removed from all replication groups. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidUserStateException
     *         The user is not in active state.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws DefaultUserAssociatedToUserGroupException
     * @sample AmazonElastiCache.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteUserResult> responseHandler = new StaxResponseHandler<DeleteUserResult>(new DeleteUserResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For Redis engine version 6.x onwards: Deletes a user group. The user group must first be disassociated from the
     * replication group before it can be deleted. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param deleteUserGroupRequest
     * @return Result of the DeleteUserGroup operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.DeleteUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUserGroupResult deleteUserGroup(DeleteUserGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserGroup(request);
    }

    @SdkInternalApi
    final DeleteUserGroupResult executeDeleteUserGroup(DeleteUserGroupRequest deleteUserGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserGroupRequest> request = null;
        Response<DeleteUserGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteUserGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteUserGroupResult> responseHandler = new StaxResponseHandler<DeleteUserGroupResult>(
                    new DeleteUserGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cache cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You can use the optional
     * <i>ShowCacheNodeInfo</i> flag to retrieve detailed information about the cache nodes associated with the
     * clusters. These details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level information is displayed until all of the
     * nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint information and creation time for the
     * additional nodes are not displayed until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <code>DescribeCacheClusters</code> operation.
     * @return Result of the DescribeCacheClusters operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheClusters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheClusters(request);
    }

    @SdkInternalApi
    final DescribeCacheClustersResult executeDescribeCacheClusters(DescribeCacheClustersRequest describeCacheClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheClustersRequest> request = null;
        Response<DescribeCacheClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheClustersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheClustersResult> responseHandler = new StaxResponseHandler<DescribeCacheClustersResult>(
                    new DescribeCacheClustersResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheClustersResult describeCacheClusters() {
        return describeCacheClusters(new DescribeCacheClustersRequest());
    }

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
     * @return Result of the DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCache.DescribeCacheEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheEngineVersions(request);
    }

    @SdkInternalApi
    final DescribeCacheEngineVersionsResult executeDescribeCacheEngineVersions(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheEngineVersionsRequest> request = null;
        Response<DescribeCacheEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheEngineVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheEngineVersionsResult> responseHandler = new StaxResponseHandler<DescribeCacheEngineVersionsResult>(
                    new DescribeCacheEngineVersionsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions() {
        return describeCacheEngineVersions(new DescribeCacheEngineVersionsRequest());
    }

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
     * contains only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
     * @return Result of the DescribeCacheParameterGroups operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheParameterGroups(request);
    }

    @SdkInternalApi
    final DescribeCacheParameterGroupsResult executeDescribeCacheParameterGroups(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParameterGroupsRequest> request = null;
        Response<DescribeCacheParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheParameterGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheParameterGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheParameterGroupsResult>(
                    new DescribeCacheParameterGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups() {
        return describeCacheParameterGroups(new DescribeCacheParameterGroupsRequest());
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <code>DescribeCacheParameters</code> operation.
     * @return Result of the DescribeCacheParameters operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheParameters(request);
    }

    @SdkInternalApi
    final DescribeCacheParametersResult executeDescribeCacheParameters(DescribeCacheParametersRequest describeCacheParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParametersRequest> request = null;
        Response<DescribeCacheParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParametersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheParametersResult> responseHandler = new StaxResponseHandler<DescribeCacheParametersResult>(
                    new DescribeCacheParametersResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security group name is specified, the list
     * contains only the description of that group. This applicable only when you have ElastiCache in Classic setup
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
     * @return Result of the DescribeCacheSecurityGroups operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheSecurityGroups(request);
    }

    @SdkInternalApi
    final DescribeCacheSecurityGroupsResult executeDescribeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSecurityGroupsRequest> request = null;
        Response<DescribeCacheSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheSecurityGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheSecurityGroupsResult>(
                    new DescribeCacheSecurityGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups() {
        return describeCacheSecurityGroups(new DescribeCacheSecurityGroupsRequest());
    }

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
     * the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache
     * clusters now launch in VPC by default.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
     * @return Result of the DescribeCacheSubnetGroups operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DescribeCacheSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCacheSubnetGroups(request);
    }

    @SdkInternalApi
    final DescribeCacheSubnetGroupsResult executeDescribeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSubnetGroupsRequest> request = null;
        Response<DescribeCacheSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCacheSubnetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheSubnetGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheSubnetGroupsResult>(
                    new DescribeCacheSubnetGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups() {
        return describeCacheSubnetGroups(new DescribeCacheSubnetGroupsRequest());
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngineDefaultParameters(request);
    }

    @SdkInternalApi
    final EngineDefaults executeDescribeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<EngineDefaults> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineDefaultParametersRequestMarshaller().marshall(super.beforeMarshalling(describeEngineDefaultParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngineDefaultParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EngineDefaults> responseHandler = new StaxResponseHandler<EngineDefaults>(new EngineDefaultsStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
     * specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <code>DescribeEvents</code> operation.
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventsResult> responseHandler = new StaxResponseHandler<DescribeEventsResult>(
                    new DescribeEventsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    /**
     * <p>
     * Returns information about a particular global replication group. If no identifier is specified, returns
     * information about all Global datastores.
     * </p>
     * 
     * @param describeGlobalReplicationGroupsRequest
     * @return Result of the DescribeGlobalReplicationGroups operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeGlobalReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeGlobalReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGlobalReplicationGroupsResult describeGlobalReplicationGroups(DescribeGlobalReplicationGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalReplicationGroups(request);
    }

    @SdkInternalApi
    final DescribeGlobalReplicationGroupsResult executeDescribeGlobalReplicationGroups(
            DescribeGlobalReplicationGroupsRequest describeGlobalReplicationGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalReplicationGroupsRequest> request = null;
        Response<DescribeGlobalReplicationGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalReplicationGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeGlobalReplicationGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGlobalReplicationGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeGlobalReplicationGroupsResult> responseHandler = new StaxResponseHandler<DescribeGlobalReplicationGroupsResult>(
                    new DescribeGlobalReplicationGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a particular replication group. If no identifier is specified,
     * <code>DescribeReplicationGroups</code> returns information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <code>DescribeReplicationGroups</code> operation.
     * @return Result of the DescribeReplicationGroups operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationGroups(request);
    }

    @SdkInternalApi
    final DescribeReplicationGroupsResult executeDescribeReplicationGroups(DescribeReplicationGroupsRequest describeReplicationGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationGroupsRequest> request = null;
        Response<DescribeReplicationGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeReplicationGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReplicationGroupsResult> responseHandler = new StaxResponseHandler<DescribeReplicationGroupsResult>(
                    new DescribeReplicationGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups() {
        return describeReplicationGroups(new DescribeReplicationGroupsRequest());
    }

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
     * @return Result of the DescribeReservedCacheNodes operation returned by the service.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedCacheNodes(request);
    }

    @SdkInternalApi
    final DescribeReservedCacheNodesResult executeDescribeReservedCacheNodes(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesRequest> request = null;
        Response<DescribeReservedCacheNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedCacheNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedCacheNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedCacheNodesResult> responseHandler = new StaxResponseHandler<DescribeReservedCacheNodesResult>(
                    new DescribeReservedCacheNodesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes() {
        return describeReservedCacheNodes(new DescribeReservedCacheNodesRequest());
    }

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
     * @return Result of the DescribeReservedCacheNodesOfferings operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedCacheNodesOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedCacheNodesOfferingsResult executeDescribeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesOfferingsRequest> request = null;
        Response<DescribeReservedCacheNodesOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesOfferingsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeReservedCacheNodesOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedCacheNodesOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedCacheNodesOfferingsResult> responseHandler = new StaxResponseHandler<DescribeReservedCacheNodesOfferingsResult>(
                    new DescribeReservedCacheNodesOfferingsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() {
        return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());
    }

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return Result of the DescribeServiceUpdates operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceUpdates(request);
    }

    @SdkInternalApi
    final DescribeServiceUpdatesResult executeDescribeServiceUpdates(DescribeServiceUpdatesRequest describeServiceUpdatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceUpdatesRequest> request = null;
        Response<DescribeServiceUpdatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceUpdatesRequestMarshaller().marshall(super.beforeMarshalling(describeServiceUpdatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceUpdates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeServiceUpdatesResult> responseHandler = new StaxResponseHandler<DescribeServiceUpdatesResult>(
                    new DescribeServiceUpdatesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By default, <code>DescribeSnapshots</code>
     * lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
     * a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshots(request);
    }

    @SdkInternalApi
    final DescribeSnapshotsResult executeDescribeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSnapshotsResult> responseHandler = new StaxResponseHandler<DescribeSnapshotsResult>(
                    new DescribeSnapshotsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    /**
     * <p>
     * Returns details of the update actions
     * </p>
     * 
     * @param describeUpdateActionsRequest
     * @return Result of the DescribeUpdateActions operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUpdateActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUpdateActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUpdateActionsResult describeUpdateActions(DescribeUpdateActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUpdateActions(request);
    }

    @SdkInternalApi
    final DescribeUpdateActionsResult executeDescribeUpdateActions(DescribeUpdateActionsRequest describeUpdateActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUpdateActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUpdateActionsRequest> request = null;
        Response<DescribeUpdateActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUpdateActionsRequestMarshaller().marshall(super.beforeMarshalling(describeUpdateActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUpdateActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeUpdateActionsResult> responseHandler = new StaxResponseHandler<DescribeUpdateActionsResult>(
                    new DescribeUpdateActionsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * 
     * @param describeUserGroupsRequest
     * @return Result of the DescribeUserGroups operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUserGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeUserGroupsResult describeUserGroups(DescribeUserGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserGroups(request);
    }

    @SdkInternalApi
    final DescribeUserGroupsResult executeDescribeUserGroups(DescribeUserGroupsRequest describeUserGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserGroupsRequest> request = null;
        Response<DescribeUserGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeUserGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeUserGroupsResult> responseHandler = new StaxResponseHandler<DescribeUserGroupsResult>(
                    new DescribeUserGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUsersResult describeUsers(DescribeUsersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUsers(request);
    }

    @SdkInternalApi
    final DescribeUsersResult executeDescribeUsers(DescribeUsersRequest describeUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUsersRequest> request = null;
        Response<DescribeUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUsersRequestMarshaller().marshall(super.beforeMarshalling(describeUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeUsersResult> responseHandler = new StaxResponseHandler<DescribeUsersResult>(new DescribeUsersResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a secondary cluster from the Global datastore using the Global datastore name. The secondary cluster will
     * no longer receive updates from the primary cluster, but will remain as a standalone cluster in that AWS region.
     * </p>
     * 
     * @param disassociateGlobalReplicationGroupRequest
     * @return Result of the DisassociateGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DisassociateGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DisassociateGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup disassociateGlobalReplicationGroup(DisassociateGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeDisassociateGlobalReplicationGroup(DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateGlobalReplicationGroupRequestMarshaller()
                        .marshall(super.beforeMarshalling(disassociateGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to failover the primary region to a selected secondary region. The selected secondary region will become
     * primary, and all other clusters will become secondary.
     * </p>
     * 
     * @param failoverGlobalReplicationGroupRequest
     * @return Result of the FailoverGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.FailoverGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/FailoverGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup failoverGlobalReplicationGroup(FailoverGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeFailoverGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeFailoverGlobalReplicationGroup(FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(failoverGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FailoverGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FailoverGlobalReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(failoverGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FailoverGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Increase the number of node groups in the Global datastore
     * </p>
     * 
     * @param increaseNodeGroupsInGlobalReplicationGroupRequest
     * @return Result of the IncreaseNodeGroupsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.IncreaseNodeGroupsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseNodeGroupsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup increaseNodeGroupsInGlobalReplicationGroup(IncreaseNodeGroupsInGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeIncreaseNodeGroupsInGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeIncreaseNodeGroupsInGlobalReplicationGroup(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(increaseNodeGroupsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller().marshall(super
                        .beforeMarshalling(increaseNodeGroupsInGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IncreaseNodeGroupsInGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dynamically increases the number of replicas in a Redis (cluster mode disabled) replication group or the number
     * of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @return Result of the IncreaseReplicaCount operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws NoOperationException
     *         The operation was not performed because no changes were required.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.IncreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup increaseReplicaCount(IncreaseReplicaCountRequest request) {
        request = beforeClientExecution(request);
        return executeIncreaseReplicaCount(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeIncreaseReplicaCount(IncreaseReplicaCountRequest increaseReplicaCountRequest) {

        ExecutionContext executionContext = createExecutionContext(increaseReplicaCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseReplicaCountRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseReplicaCountRequestMarshaller().marshall(super.beforeMarshalling(increaseReplicaCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IncreaseReplicaCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or replication group's current node type.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code> operations to scale your
     * cluster or replication group, the value of the <code>CacheNodeType</code> parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
     * @return Result of the ListAllowedNodeTypeModifications operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ListAllowedNodeTypeModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAllowedNodeTypeModifications(request);
    }

    @SdkInternalApi
    final ListAllowedNodeTypeModificationsResult executeListAllowedNodeTypeModifications(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAllowedNodeTypeModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAllowedNodeTypeModificationsRequest> request = null;
        Response<ListAllowedNodeTypeModificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAllowedNodeTypeModificationsRequestMarshaller().marshall(super.beforeMarshalling(listAllowedNodeTypeModificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAllowedNodeTypeModifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAllowedNodeTypeModificationsResult> responseHandler = new StaxResponseHandler<ListAllowedNodeTypeModificationsResult>(
                    new ListAllowedNodeTypeModificationsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications() {
        return listAllowedNodeTypeModifications(new ListAllowedNodeTypeModificationsRequest());
    }

    /**
     * <p>
     * Lists all tags currently on a named resource.
     * </p>
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your ElastiCache resources, with the exception of global replication group. When you add or remove tags on
     * replication groups, those actions will be replicated to all nodes in the replication group. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html">Resource
     * -level permissions</a>.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state, <code>ListTagsForResource</code> returns an error.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new StaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <code>ModifyCacheCluster</code> operation.
     * @return Result of the ModifyCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest request) {
        request = beforeClientExecution(request);
        return executeModifyCacheCluster(request);
    }

    @SdkInternalApi
    final CacheCluster executeModifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyCacheCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
     * @return Result of the ModifyCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @sample AmazonElastiCache.ModifyCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyCacheParameterGroup(request);
    }

    @SdkInternalApi
    final ModifyCacheParameterGroupResult executeModifyCacheParameterGroup(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheParameterGroupRequest> request = null;
        Response<ModifyCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyCacheParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyCacheParameterGroupResult> responseHandler = new StaxResponseHandler<ModifyCacheParameterGroupResult>(
                    new ModifyCacheParameterGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
     * @return Result of the ModifyCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another cache subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws SubnetNotAllowedException
     *         At least one subnet ID does not match the other subnet IDs. This mismatch typically occurs when a user
     *         sets one subnet ID to a regional Availability Zone and a different one to an outpost. Or when a user sets
     *         the subnet ID to an Outpost when not subscribed on this service.
     * @sample AmazonElastiCache.ModifyCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyCacheSubnetGroup(request);
    }

    @SdkInternalApi
    final CacheSubnetGroup executeModifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyCacheSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSubnetGroup> responseHandler = new StaxResponseHandler<CacheSubnetGroup>(new CacheSubnetGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a Global datastore.
     * </p>
     * 
     * @param modifyGlobalReplicationGroupRequest
     * @return Result of the ModifyGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ModifyGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup modifyGlobalReplicationGroup(ModifyGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeModifyGlobalReplicationGroup(ModifyGlobalReplicationGroupRequest modifyGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyGlobalReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html">
     * Scaling for Amazon ElastiCache for Redis (cluster mode enabled)</a> in the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <code>ModifyReplicationGroups</code> operation.
     * @return Result of the ModifyReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationGroup(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeModifyReplicationGroup(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
     * the keyspaces among existing shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest
     *        Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
     * @return Result of the ModifyReplicationGroupShardConfiguration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroupShardConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroupShardConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicationGroup modifyReplicationGroupShardConfiguration(ModifyReplicationGroupShardConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationGroupShardConfiguration(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeModifyReplicationGroupShardConfiguration(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupShardConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupShardConfigurationRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationGroupShardConfigurationRequestMarshaller().marshall(super
                        .beforeMarshalling(modifyReplicationGroupShardConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationGroupShardConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param modifyUserRequest
     * @return Result of the ModifyUser operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidUserStateException
     *         The user is not in active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyUserResult modifyUser(ModifyUserRequest request) {
        request = beforeClientExecution(request);
        return executeModifyUser(request);
    }

    @SdkInternalApi
    final ModifyUserResult executeModifyUser(ModifyUserRequest modifyUserRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyUserRequest> request = null;
        Response<ModifyUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyUserRequestMarshaller().marshall(super.beforeMarshalling(modifyUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyUserResult> responseHandler = new StaxResponseHandler<ModifyUserResult>(new ModifyUserResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the list of users that belong to the user group.
     * </p>
     * 
     * @param modifyUserGroupRequest
     * @return Result of the ModifyUserGroup operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws DefaultUserRequiredException
     *         You must add default user to a user group.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyUserGroupResult modifyUserGroup(ModifyUserGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyUserGroup(request);
    }

    @SdkInternalApi
    final ModifyUserGroupResult executeModifyUserGroup(ModifyUserGroupRequest modifyUserGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyUserGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyUserGroupRequest> request = null;
        Response<ModifyUserGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyUserGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyUserGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyUserGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyUserGroupResult> responseHandler = new StaxResponseHandler<ModifyUserGroupResult>(
                    new ModifyUserGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/reserved-nodes.html">Managing Costs with
     * Reserved Nodes</a> for Redis or <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/reserved-nodes.html">Managing Costs with
     * Reserved Nodes</a> for Memcached.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
     * @return Result of the PurchaseReservedCacheNodesOffering operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws ReservedCacheNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedCacheNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the user's cache node quota.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.PurchaseReservedCacheNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PurchaseReservedCacheNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedCacheNodesOffering(request);
    }

    @SdkInternalApi
    final ReservedCacheNode executePurchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedCacheNodesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedCacheNodesOfferingRequest> request = null;
        Response<ReservedCacheNode> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedCacheNodesOfferingRequestMarshaller()
                        .marshall(super.beforeMarshalling(purchaseReservedCacheNodesOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedCacheNodesOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReservedCacheNode> responseHandler = new StaxResponseHandler<ReservedCacheNode>(new ReservedCacheNodeStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Redistribute slots to ensure uniform distribution across existing shards in the cluster.
     * </p>
     * 
     * @param rebalanceSlotsInGlobalReplicationGroupRequest
     * @return Result of the RebalanceSlotsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.RebalanceSlotsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebalanceSlotsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GlobalReplicationGroup rebalanceSlotsInGlobalReplicationGroup(RebalanceSlotsInGlobalReplicationGroupRequest request) {
        request = beforeClientExecution(request);
        return executeRebalanceSlotsInGlobalReplicationGroup(request);
    }

    @SdkInternalApi
    final GlobalReplicationGroup executeRebalanceSlotsInGlobalReplicationGroup(
            RebalanceSlotsInGlobalReplicationGroupRequest rebalanceSlotsInGlobalReplicationGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(rebalanceSlotsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebalanceSlotsInGlobalReplicationGroupRequest> request = null;
        Response<GlobalReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebalanceSlotsInGlobalReplicationGroupRequestMarshaller().marshall(super
                        .beforeMarshalling(rebalanceSlotsInGlobalReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebalanceSlotsInGlobalReplicationGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalReplicationGroup> responseHandler = new StaxResponseHandler<GlobalReplicationGroup>(
                    new GlobalReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache
     * parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary
     * outage to the cluster. During the reboot, the cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is
     * not supported on Redis (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to
     * be applied, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html">Rebooting a Cluster</a>
     * for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <code>RebootCacheCluster</code> operation.
     * @return Result of the RebootCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @sample AmazonElastiCache.RebootCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebootCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CacheCluster rebootCacheCluster(RebootCacheClusterRequest request) {
        request = beforeClientExecution(request);
        return executeRebootCacheCluster(request);
    }

    @SdkInternalApi
    final CacheCluster executeRebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(rebootCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootCacheCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the named resource. A tag is a key-value pair
     * where the key and value are case-sensitive. You can use tags to categorize and track all your ElastiCache
     * resources, with the exception of global replication group. When you add or remove tags on replication groups,
     * those actions will be replicated to all nodes in the replication group. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html"
     * >Resource-level permissions</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <code>RemoveTagsFromResource</code> operation.
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws TagNotFoundException
     *         The requested tag was not found on this resource.
     * @sample AmazonElastiCache.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller().marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveTagsFromResourceResult> responseHandler = new StaxResponseHandler<RemoveTagsFromResourceResult>(
                    new RemoveTagsFromResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
     * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <code>ResetCacheParameterGroup</code> operation.
     * @return Result of the ResetCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @sample AmazonElastiCache.ResetCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ResetCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeResetCacheParameterGroup(request);
    }

    @SdkInternalApi
    final ResetCacheParameterGroupResult executeResetCacheParameterGroup(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(resetCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheParameterGroupRequest> request = null;
        Response<ResetCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetCacheParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetCacheParameterGroupResult> responseHandler = new StaxResponseHandler<ResetCacheParameterGroupResult>(
                    new ResetCacheParameterGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
     * group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
     * @return Result of the RevokeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws AuthorizationNotFoundException
     *         The specified Amazon EC2 security group is not authorized for the specified cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.RevokeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RevokeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeCacheSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final CacheSecurityGroup executeRevokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeCacheSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeCacheSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start the migration of data.
     * </p>
     * 
     * @param startMigrationRequest
     * @return Result of the StartMigration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupAlreadyUnderMigrationException
     *         The targeted replication group is not available.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.StartMigration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/StartMigration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReplicationGroup startMigration(StartMigrationRequest request) {
        request = beforeClientExecution(request);
        return executeStartMigration(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeStartMigration(StartMigrationRequest startMigrationRequest) {

        ExecutionContext executionContext = createExecutionContext(startMigrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMigrationRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMigrationRequestMarshaller().marshall(super.beforeMarshalling(startMigrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMigration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test automatic failover on a specified node
     * group (called shard in the console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the
     * ElastiCache API and AWS CLI) in any rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called replication groups in the API and CLI), the
     * calls can be made concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication
     * group, the first node replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console,
     * the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in
     * order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message: <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html">Viewing ElastiCache
     * Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html">DescribeEvents
     * </a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test">Testing
     * Multi-AZ </a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @return Result of the TestFailover operation returned by the service.
     * @throws APICallRateForCustomerExceededException
     *         The customer has exceeded the allowed rate of API calls.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws NodeGroupNotFoundException
     *         The node group specified by the <code>NodeGroupId</code> parameter could not be found. Please verify that
     *         the node group exists and that you spelled the <code>NodeGroupId</code> value correctly.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws TestFailoverNotAvailableException
     *         The <code>TestFailover</code> action is not available.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.TestFailover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/TestFailover" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReplicationGroup testFailover(TestFailoverRequest request) {
        request = beforeClientExecution(request);
        return executeTestFailover(request);
    }

    @SdkInternalApi
    final ReplicationGroup executeTestFailover(TestFailoverRequest testFailoverRequest) {

        ExecutionContext executionContext = createExecutionContext(testFailoverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestFailoverRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestFailoverRequestMarshaller().marshall(super.beforeMarshalling(testFailoverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ElastiCache");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestFailover");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public AmazonElastiCacheWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonElastiCacheWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
