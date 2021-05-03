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
package com.amazonaws.services.fsx;

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

import com.amazonaws.services.fsx.AmazonFSxClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.services.fsx.model.transform.*;

/**
 * Client for accessing Amazon FSx. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFSxClient extends AmazonWebServiceClient implements AmazonFSx {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonFSx.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "fsx";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportPath").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidImportPathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSourceKmsKey").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidSourceKmsKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNetworkSettings").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidNetworkSettingsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleRegionForMultiAZ").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.IncompatibleRegionForMultiAZExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskExecuting").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskExecutingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.FileSystemNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDoesNotSupportTagging").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ResourceDoesNotSupportTaggingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDestinationKmsKey").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidDestinationKmsKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SourceBackupUnavailable").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.SourceBackupUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotServiceResourceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.NotServiceResourceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperation").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingFileSystemConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.MissingFileSystemConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupBeingCopied").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupBeingCopiedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupRestoring").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupRestoringExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleParameterError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.IncompatibleParameterErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskEnded").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskEndedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPerUnitStorageThroughput").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidPerUnitStorageThroughputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupInProgress").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExportPath").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidExportPathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRegion").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidRegionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActiveDirectoryError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ActiveDirectoryErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequest").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.fsx.model.AmazonFSxException.class));

    public static AmazonFSxClientBuilder builder() {
        return AmazonFSxClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFSxClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFSxClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("fsx.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/fsx/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/fsx/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows
     * File Server file system. A file systen can have a maximum of 50 DNS aliases associated with it at any one time.
     * If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that
     * alias in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS Aliases</a>
     * and <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html">
     * Walkthrough 5: Using DNS aliases to access your file system</a>, including additional steps you must take to be
     * able to access your file system using a DNS alias.
     * </p>
     * <p>
     * The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use
     * the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param associateFileSystemAliasesRequest
     *        The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File
     *        Server file system.
     * @return Result of the AssociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateFileSystemAliasesResult associateFileSystemAliases(AssociateFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateFileSystemAliases(request);
    }

    @SdkInternalApi
    final AssociateFileSystemAliasesResult executeAssociateFileSystemAliases(AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFileSystemAliasesRequest> request = null;
        Response<AssociateFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the <code>PENDING</code>
     * or <code>EXECUTING</code> state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest
     *        Cancels a data repository task.
     * @return Result of the CancelDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws DataRepositoryTaskEndedException
     *         The data repository task could not be canceled because the task has already ended.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelDataRepositoryTaskResult cancelDataRepositoryTask(CancelDataRepositoryTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelDataRepositoryTask(request);
    }

    @SdkInternalApi
    final CancelDataRepositoryTaskResult executeCancelDataRepositoryTask(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDataRepositoryTaskRequest> request = null;
        Response<CancelDataRepositoryTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDataRepositoryTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelDataRepositoryTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelDataRepositoryTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelDataRepositoryTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelDataRepositoryTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies an existing backup within the same AWS account to another Region (cross-Region copy) or within the same
     * Region (in-Region copy). You can have up to five backup copy requests in progress to a single destination Region
     * per account.
     * </p>
     * <p>
     * You can use cross-Region backup copies for cross-region disaster recovery. You periodically take backups and copy
     * them to another Region so that in the event of a disaster in the primary Region, you can restore from backup and
     * recover availability quickly in the other Region. You can make cross-Region copies only within your AWS
     * partition.
     * </p>
     * <p>
     * You can also use backup copies to clone your file data set to another Region or within the same Region.
     * </p>
     * <p>
     * You can use the <code>SourceRegion</code> parameter to specify the AWS Region from which the backup will be
     * copied. For example, if you make the call from the <code>us-west-1</code> Region and want to copy a backup from
     * the <code>us-east-2</code> Region, you specify <code>us-east-2</code> in the <code>SourceRegion</code> parameter
     * to make a cross-Region copy. If you don't specify a Region, the backup copy is created in the same Region where
     * the request is sent from (in-Region copy).
     * </p>
     * <p>
     * For more information on creating backup copies, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/copy-backups.html"> Copying backups</a> in the
     * <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/copy-backups.html">Copying backups</a> in the <i>Amazon
     * FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param copyBackupRequest
     * @return Result of the CopyBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws InvalidSourceKmsKeyException
     *         The AWS Key Management Service (AWS KMS) key of the source backup is invalid.
     * @throws InvalidDestinationKmsKeyException
     *         The AWS Key Management Service (AWS KMS) key of the destination backup is invalid.
     * @throws InvalidRegionException
     *         The Region provided for <code>Source Region</code> is invalid or is in a different AWS partition.
     * @throws SourceBackupUnavailableException
     *         The request was rejected because the lifecycle status of the source backup is not <code>AVAILABLE</code>.
     * @throws IncompatibleRegionForMultiAZException
     *         Amazon FSx doesn't support Multi-AZ Windows File Server copy backup in the destination Region, so the
     *         copied backup can't be restored.
     * @sample AmazonFSx.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopyBackupResult copyBackup(CopyBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCopyBackup(request);
    }

    @SdkInternalApi
    final CopyBackupResult executeCopyBackup(CopyBackupRequest copyBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(copyBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyBackupRequest> request = null;
        Response<CopyBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyBackupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx file system. Creating regular backups for your file system is a best
     * practice, enabling you to restore a file system from a backup if an issue arises with the original file system.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for file systems with the following
     * configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * is <i>not</i> linked to a data respository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about backing up Amazon FSx for Lustre file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with FSx for Lustre
     * backups</a>.
     * </p>
     * <p>
     * For more information about backing up Amazon FSx for Windows file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html">Working with FSx for Windows
     * backups</a>.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the parameters match, this operation returns the
     * description of the existing backup. If a backup specified client request token exists, and the parameters don't
     * match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified client
     * request token doesn't exist, <code>CreateBackup</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateBackup</code> operation without the risk of
     * creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a backup was created. If you use the same client request token and the initial call created a backup, the
     * operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateBackup</code> operation returns while the backup's lifecycle state is still <code>CREATING</code>
     * . You can check the backup creation status by calling the <a>DescribeBackups</a> operation, which returns the
     * backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @return Result of the CreateBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackup(request);
    }

    @SdkInternalApi
    final CreateBackupResult executeCreateBackup(CreateBackupRequest createBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupRequest> request = null;
        Response<CreateBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations
     * between your Amazon FSx file system and its linked data repository. An example of a data repository task is
     * exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links
     * (symlinks) from your FSx file system to its linked data repository. A <code>CreateDataRepositoryTask</code>
     * operation will fail if a data repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html">Data Repository Tasks</a>.
     * To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-fs-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return Result of the CreateDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws DataRepositoryTaskExecutingException
     *         An existing data repository task is currently executing on the file system. Wait until the existing task
     *         has completed, then create the new task.
     * @sample AmazonFSx.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDataRepositoryTaskResult createDataRepositoryTask(CreateDataRepositoryTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataRepositoryTask(request);
    }

    @SdkInternalApi
    final CreateDataRepositoryTaskResult executeCreateDataRepositoryTask(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataRepositoryTaskRequest> request = null;
        Response<CreateDataRepositoryTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataRepositoryTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataRepositoryTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataRepositoryTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataRepositoryTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataRepositoryTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system specified
     * client request token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
     * This means that calling the operation multiple times with the same client request token has no effect. By using
     * the idempotent operation, you can retry a <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
     * a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a file system, the client receives success as
     * long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object used to create a new Amazon FSx file system.
     * @return Result of the CreateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidImportPathException
     *         The path provided for data repository import isn't valid.
     * @throws InvalidExportPathException
     *         The path provided for data repository export isn't valid.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid. <code>InvalidVpcId</code> means that
     *         the ID passed for the virtual private cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the
     *         list of IDs for subnets that are either invalid or not part of the VPC specified.
     *         <code>InvalidSecurityGroupIds</code> returns the list of IDs for security groups that are either invalid
     *         or not part of the VPC specified.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileSystem(request);
    }

    @SdkInternalApi
    final CreateFileSystemResult executeCreateFileSystem(CreateFileSystemRequest createFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemRequest> request = null;
        Response<CreateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon FSx file system from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this operation returns
     * the description of the file system. If a client request token specified by the file system exists and the
     * parameters don't match, this call returns <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives success as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest
     *        The request object for the <code>CreateFileSystemFromBackup</code> operation.
     * @return Result of the CreateFileSystemFromBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid. <code>InvalidVpcId</code> means that
     *         the ID passed for the virtual private cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the
     *         list of IDs for subnets that are either invalid or not part of the VPC specified.
     *         <code>InvalidSecurityGroupIds</code> returns the list of IDs for security groups that are either invalid
     *         or not part of the VPC specified.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFileSystemFromBackupResult createFileSystemFromBackup(CreateFileSystemFromBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileSystemFromBackup(request);
    }

    @SdkInternalApi
    final CreateFileSystemFromBackupResult executeCreateFileSystemFromBackup(CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileSystemFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemFromBackupRequest> request = null;
        Response<CreateFileSystemFromBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemFromBackupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createFileSystemFromBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileSystemFromBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileSystemFromBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateFileSystemFromBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon FSx backup, deleting its contents. After deletion, the backup no longer exists, and its data is
     * gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for <code>DeleteBackup</code> operation.
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws BackupRestoringException
     *         You can't delete a backup while it's being used to restore a file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws BackupBeingCopiedException
     *         You can't delete a backup while it's being copied.
     * @sample AmazonFSx.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackup(request);
    }

    @SdkInternalApi
    final DeleteBackupResult executeDeleteBackup(DeleteBackupRequest deleteBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is
     * gone. Any existing automatic backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system has the <code>DELETING</code> status. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> action, which returns a list
     * of file systems in your account. If you pass the file system ID for a deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * Deleting an Amazon FSx for Lustre file system will fail with a 400 BadRequest if a data repository task is in a
     * <code>PENDING</code> or <code>EXECUTING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest
     *        The request object for <code>DeleteFileSystem</code> operation.
     * @return Result of the DeleteFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFileSystem(request);
    }

    @SdkInternalApi
    final DeleteFileSystemResult executeDeleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemRequest> request = null;
        Response<DeleteFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of specific Amazon FSx backups, if a <code>BackupIds</code> value is provided for that
     * backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the endpoint that you're
     * calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one <code>DescribeBackups</code> call and the order of backups
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for <code>DescribeBackups</code> operation.
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackups(request);
    }

    @SdkInternalApi
    final DescribeBackupsResult executeDescribeBackups(DescribeBackupsRequest describeBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupsRequest> request = null;
        Response<DescribeBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre data repository tasks, if one or more
     * <code>TaskIds</code> values are provided in the request, or if filters are used in the request. You can use
     * filters to narrow the response to include just tasks for specific file systems, or tasks in a specific lifecycle
     * state. Otherwise, it returns all data repository tasks owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the optional <code>MaxResults</code> parameter
     * to limit the number of tasks returned in a response. If more tasks remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return Result of the DescribeDataRepositoryTasks operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataRepositoryTasksResult describeDataRepositoryTasks(DescribeDataRepositoryTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataRepositoryTasks(request);
    }

    @SdkInternalApi
    final DescribeDataRepositoryTasksResult executeDescribeDataRepositoryTasks(DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataRepositoryTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataRepositoryTasksRequest> request = null;
        Response<DescribeDataRepositoryTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataRepositoryTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataRepositoryTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataRepositoryTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataRepositoryTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataRepositoryTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @return Result of the DescribeFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFileSystemAliasesResult describeFileSystemAliases(DescribeFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileSystemAliases(request);
    }

    @SdkInternalApi
    final DescribeFileSystemAliasesResult executeDescribeFileSystemAliases(DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemAliasesRequest> request = null;
        Response<DescribeFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the action continues
     * to be called with the <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value
     * until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest
     *        The request object for <code>DescribeFileSystems</code> operation.
     * @return Result of the DescribeFileSystems operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileSystems(request);
    }

    @SdkInternalApi
    final DescribeFileSystemsResult executeDescribeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileSystemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemsRequest> request = null;
        Response<DescribeFileSystemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFileSystemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileSystems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileSystemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFileSystemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for
     * Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file
     * system, Amazon FSx responds with a 400 Bad Request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS
     * Aliases</a>.
     * </p>
     * <p>
     * The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file
     * system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file
     * system.
     * </p>
     * 
     * @param disassociateFileSystemAliasesRequest
     *        The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
     * @return Result of the DisassociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateFileSystemAliasesResult disassociateFileSystemAliases(DisassociateFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFileSystemAliases(request);
    }

    @SdkInternalApi
    final DisassociateFileSystemAliasesResult executeDisassociateFileSystemAliases(DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFileSystemAliasesRequest> request = null;
        Response<DisassociateFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the <code>MaxResults</code> parameter to limit the number of
     * tags in a response. If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the response. In
     * this case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your tags. <code>ListTagsForResource</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one <code>ListTagsForResource</code> call and the order of tags
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     *        The request object for <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple
     * properties in a single request.
     * </p>
     * <p>
     * For Amazon FSx for Windows File Server file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * SelfManagedActiveDirectoryConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ThroughputCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for Lustre file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoImportPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @return Result of the UpdateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @sample AmazonFSx.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFileSystem(request);
    }

    @SdkInternalApi
    final UpdateFileSystemResult executeUpdateFileSystem(UpdateFileSystemRequest updateFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFileSystemRequest> request = null;
        Response<UpdateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFileSystemResultJsonUnmarshaller());
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

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
