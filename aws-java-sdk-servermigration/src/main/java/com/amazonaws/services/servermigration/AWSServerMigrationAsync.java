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
package com.amazonaws.services.servermigration;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;

/**
 * Interface for accessing SMS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servermigration.AbstractAWSServerMigrationAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Server Migration Service</fullname>
 * <p>
 * AWS Server Migration Service (AWS SMS) makes it easier and faster for you to migrate your on-premises workloads to
 * AWS. To learn more about AWS SMS, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/server-migration-service/">AWS Server Migration Service product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/server-migration-service/latest/userguide/">AWS Server Migration Service User
 * Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServerMigrationAsync extends AWSServerMigration {

    /**
     * <p>
     * Creates an application. An application consists of one or more server groups. Each server group contain one or
     * more servers.
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSServerMigrationAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates an application. An application consists of one or more server groups. Each server group contain one or
     * more servers.
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
     * AWS. Each replication run creates an Amazon Machine Image (AMI).
     * </p>
     * 
     * @param createReplicationJobRequest
     * @return A Java Future containing the result of the CreateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.CreateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest createReplicationJobRequest);

    /**
     * <p>
     * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
     * AWS. Each replication run creates an Amazon Machine Image (AMI).
     * </p>
     * 
     * @param createReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.CreateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest createReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationJobRequest, CreateReplicationJobResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified application. Optionally deletes the launched stack associated with the application and all
     * AWS SMS replication jobs for servers in the application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSServerMigrationAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes the specified application. Optionally deletes the launched stack associated with the application and all
     * AWS SMS replication jobs for servers in the application.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes the launch configuration for the specified application.
     * </p>
     * 
     * @param deleteAppLaunchConfigurationRequest
     * @return A Java Future containing the result of the DeleteAppLaunchConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.DeleteAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(
            DeleteAppLaunchConfigurationRequest deleteAppLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes the launch configuration for the specified application.
     * </p>
     * 
     * @param deleteAppLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppLaunchConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.DeleteAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(
            DeleteAppLaunchConfigurationRequest deleteAppLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppLaunchConfigurationRequest, DeleteAppLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the replication configuration for the specified application.
     * </p>
     * 
     * @param deleteAppReplicationConfigurationRequest
     * @return A Java Future containing the result of the DeleteAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.DeleteAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            DeleteAppReplicationConfigurationRequest deleteAppReplicationConfigurationRequest);

    /**
     * <p>
     * Deletes the replication configuration for the specified application.
     * </p>
     * 
     * @param deleteAppReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.DeleteAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            DeleteAppReplicationConfigurationRequest deleteAppReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppReplicationConfigurationRequest, DeleteAppReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the validation configuration for the specified application.
     * </p>
     * 
     * @param deleteAppValidationConfigurationRequest
     * @return A Java Future containing the result of the DeleteAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.DeleteAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppValidationConfigurationResult> deleteAppValidationConfigurationAsync(
            DeleteAppValidationConfigurationRequest deleteAppValidationConfigurationRequest);

    /**
     * <p>
     * Deletes the validation configuration for the specified application.
     * </p>
     * 
     * @param deleteAppValidationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.DeleteAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppValidationConfigurationResult> deleteAppValidationConfigurationAsync(
            DeleteAppValidationConfigurationRequest deleteAppValidationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppValidationConfigurationRequest, DeleteAppValidationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified replication job.
     * </p>
     * <p>
     * After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
     * S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
     * </p>
     * 
     * @param deleteReplicationJobRequest
     * @return A Java Future containing the result of the DeleteReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.DeleteReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest deleteReplicationJobRequest);

    /**
     * <p>
     * Deletes the specified replication job.
     * </p>
     * <p>
     * After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
     * S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
     * </p>
     * 
     * @param deleteReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DeleteReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest deleteReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationJobRequest, DeleteReplicationJobResult> asyncHandler);

    /**
     * <p>
     * Deletes all servers from your server catalog.
     * </p>
     * 
     * @param deleteServerCatalogRequest
     * @return A Java Future containing the result of the DeleteServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsync.DeleteServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest deleteServerCatalogRequest);

    /**
     * <p>
     * Deletes all servers from your server catalog.
     * </p>
     * 
     * @param deleteServerCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DeleteServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest deleteServerCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServerCatalogRequest, DeleteServerCatalogResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified connector from AWS SMS.
     * </p>
     * <p>
     * After you disassociate a connector, it is no longer available to support replication jobs.
     * </p>
     * 
     * @param disassociateConnectorRequest
     * @return A Java Future containing the result of the DisassociateConnector operation returned by the service.
     * @sample AWSServerMigrationAsync.DisassociateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DisassociateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest disassociateConnectorRequest);

    /**
     * <p>
     * Disassociates the specified connector from AWS SMS.
     * </p>
     * <p>
     * After you disassociate a connector, it is no longer available to support replication jobs.
     * </p>
     * 
     * @param disassociateConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConnector operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DisassociateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DisassociateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest disassociateConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectorRequest, DisassociateConnectorResult> asyncHandler);

    /**
     * <p>
     * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
     * customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateChangeSetRequest
     * @return A Java Future containing the result of the GenerateChangeSet operation returned by the service.
     * @sample AWSServerMigrationAsync.GenerateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateChangeSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(GenerateChangeSetRequest generateChangeSetRequest);

    /**
     * <p>
     * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
     * customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateChangeSet operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GenerateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateChangeSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(GenerateChangeSetRequest generateChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateChangeSetRequest, GenerateChangeSetResult> asyncHandler);

    /**
     * <p>
     * Generates an AWS CloudFormation template based on the current launch configuration and writes it to an Amazon S3
     * object in the customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateTemplateRequest
     * @return A Java Future containing the result of the GenerateTemplate operation returned by the service.
     * @sample AWSServerMigrationAsync.GenerateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(GenerateTemplateRequest generateTemplateRequest);

    /**
     * <p>
     * Generates an AWS CloudFormation template based on the current launch configuration and writes it to an Amazon S3
     * object in the customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateTemplate operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GenerateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(GenerateTemplateRequest generateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateTemplateRequest, GenerateTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about the specified application.
     * </p>
     * 
     * @param getAppRequest
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AWSServerMigrationAsync.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieve information about the specified application.
     * </p>
     * 
     * @param getAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler);

    /**
     * <p>
     * Retrieves the application launch configuration associated with the specified application.
     * </p>
     * 
     * @param getAppLaunchConfigurationRequest
     * @return A Java Future containing the result of the GetAppLaunchConfiguration operation returned by the service.
     * @sample AWSServerMigrationAsync.GetAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(
            GetAppLaunchConfigurationRequest getAppLaunchConfigurationRequest);

    /**
     * <p>
     * Retrieves the application launch configuration associated with the specified application.
     * </p>
     * 
     * @param getAppLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppLaunchConfiguration operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(
            GetAppLaunchConfigurationRequest getAppLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppLaunchConfigurationRequest, GetAppLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the application replication configuration associated with the specified application.
     * </p>
     * 
     * @param getAppReplicationConfigurationRequest
     * @return A Java Future containing the result of the GetAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.GetAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(
            GetAppReplicationConfigurationRequest getAppReplicationConfigurationRequest);

    /**
     * <p>
     * Retrieves the application replication configuration associated with the specified application.
     * </p>
     * 
     * @param getAppReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.GetAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(
            GetAppReplicationConfigurationRequest getAppReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppReplicationConfigurationRequest, GetAppReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a configuration for validating an application.
     * </p>
     * 
     * @param getAppValidationConfigurationRequest
     * @return A Java Future containing the result of the GetAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.GetAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppValidationConfigurationResult> getAppValidationConfigurationAsync(
            GetAppValidationConfigurationRequest getAppValidationConfigurationRequest);

    /**
     * <p>
     * Retrieves information about a configuration for validating an application.
     * </p>
     * 
     * @param getAppValidationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.GetAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppValidationConfigurationResult> getAppValidationConfigurationAsync(
            GetAppValidationConfigurationRequest getAppValidationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppValidationConfigurationRequest, GetAppValidationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves output from validating an application.
     * </p>
     * 
     * @param getAppValidationOutputRequest
     * @return A Java Future containing the result of the GetAppValidationOutput operation returned by the service.
     * @sample AWSServerMigrationAsync.GetAppValidationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppValidationOutput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppValidationOutputResult> getAppValidationOutputAsync(GetAppValidationOutputRequest getAppValidationOutputRequest);

    /**
     * <p>
     * Retrieves output from validating an application.
     * </p>
     * 
     * @param getAppValidationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppValidationOutput operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetAppValidationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppValidationOutput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppValidationOutputResult> getAppValidationOutputAsync(GetAppValidationOutputRequest getAppValidationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppValidationOutputRequest, GetAppValidationOutputResult> asyncHandler);

    /**
     * <p>
     * Describes the connectors registered with the AWS SMS.
     * </p>
     * 
     * @param getConnectorsRequest
     * @return A Java Future containing the result of the GetConnectors operation returned by the service.
     * @sample AWSServerMigrationAsync.GetConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest getConnectorsRequest);

    /**
     * <p>
     * Describes the connectors registered with the AWS SMS.
     * </p>
     * 
     * @param getConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectors operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest getConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectorsRequest, GetConnectorsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified replication job or all of your replication jobs.
     * </p>
     * 
     * @param getReplicationJobsRequest
     * @return A Java Future containing the result of the GetReplicationJobs operation returned by the service.
     * @sample AWSServerMigrationAsync.GetReplicationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest getReplicationJobsRequest);

    /**
     * <p>
     * Describes the specified replication job or all of your replication jobs.
     * </p>
     * 
     * @param getReplicationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationJobs operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetReplicationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest getReplicationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationJobsRequest, GetReplicationJobsResult> asyncHandler);

    /**
     * <p>
     * Describes the replication runs for the specified replication job.
     * </p>
     * 
     * @param getReplicationRunsRequest
     * @return A Java Future containing the result of the GetReplicationRuns operation returned by the service.
     * @sample AWSServerMigrationAsync.GetReplicationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest getReplicationRunsRequest);

    /**
     * <p>
     * Describes the replication runs for the specified replication job.
     * </p>
     * 
     * @param getReplicationRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationRuns operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetReplicationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest getReplicationRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationRunsRequest, GetReplicationRunsResult> asyncHandler);

    /**
     * <p>
     * Describes the servers in your server catalog.
     * </p>
     * <p>
     * Before you can describe your servers, you must import them using <a>ImportServerCatalog</a>.
     * </p>
     * 
     * @param getServersRequest
     * @return A Java Future containing the result of the GetServers operation returned by the service.
     * @sample AWSServerMigrationAsync.GetServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest getServersRequest);

    /**
     * <p>
     * Describes the servers in your server catalog.
     * </p>
     * <p>
     * Before you can describe your servers, you must import them using <a>ImportServerCatalog</a>.
     * </p>
     * 
     * @param getServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServers operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest getServersRequest,
            com.amazonaws.handlers.AsyncHandler<GetServersRequest, GetServersResult> asyncHandler);

    /**
     * <p>
     * Allows application import from AWS Migration Hub.
     * </p>
     * 
     * @param importAppCatalogRequest
     * @return A Java Future containing the result of the ImportAppCatalog operation returned by the service.
     * @sample AWSServerMigrationAsync.ImportAppCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportAppCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportAppCatalogResult> importAppCatalogAsync(ImportAppCatalogRequest importAppCatalogRequest);

    /**
     * <p>
     * Allows application import from AWS Migration Hub.
     * </p>
     * 
     * @param importAppCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportAppCatalog operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.ImportAppCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportAppCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportAppCatalogResult> importAppCatalogAsync(ImportAppCatalogRequest importAppCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<ImportAppCatalogRequest, ImportAppCatalogResult> asyncHandler);

    /**
     * <p>
     * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers to
     * import.
     * </p>
     * <p>
     * This call returns immediately, but might take additional time to retrieve all the servers.
     * </p>
     * 
     * @param importServerCatalogRequest
     * @return A Java Future containing the result of the ImportServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsync.ImportServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest importServerCatalogRequest);

    /**
     * <p>
     * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers to
     * import.
     * </p>
     * <p>
     * This call returns immediately, but might take additional time to retrieve all the servers.
     * </p>
     * 
     * @param importServerCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.ImportServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest importServerCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<ImportServerCatalogRequest, ImportServerCatalogResult> asyncHandler);

    /**
     * <p>
     * Launches the specified application as a stack in AWS CloudFormation.
     * </p>
     * 
     * @param launchAppRequest
     * @return A Java Future containing the result of the LaunchApp operation returned by the service.
     * @sample AWSServerMigrationAsync.LaunchApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/LaunchApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LaunchAppResult> launchAppAsync(LaunchAppRequest launchAppRequest);

    /**
     * <p>
     * Launches the specified application as a stack in AWS CloudFormation.
     * </p>
     * 
     * @param launchAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LaunchApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.LaunchApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/LaunchApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LaunchAppResult> launchAppAsync(LaunchAppRequest launchAppRequest,
            com.amazonaws.handlers.AsyncHandler<LaunchAppRequest, LaunchAppResult> asyncHandler);

    /**
     * <p>
     * Retrieves summaries for all applications.
     * </p>
     * 
     * @param listAppsRequest
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSServerMigrationAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Retrieves summaries for all applications.
     * </p>
     * 
     * @param listAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler);

    /**
     * <p>
     * Provides information to AWS SMS about whether application validation is successful.
     * </p>
     * 
     * @param notifyAppValidationOutputRequest
     * @return A Java Future containing the result of the NotifyAppValidationOutput operation returned by the service.
     * @sample AWSServerMigrationAsync.NotifyAppValidationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/NotifyAppValidationOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<NotifyAppValidationOutputResult> notifyAppValidationOutputAsync(
            NotifyAppValidationOutputRequest notifyAppValidationOutputRequest);

    /**
     * <p>
     * Provides information to AWS SMS about whether application validation is successful.
     * </p>
     * 
     * @param notifyAppValidationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyAppValidationOutput operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.NotifyAppValidationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/NotifyAppValidationOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<NotifyAppValidationOutputResult> notifyAppValidationOutputAsync(
            NotifyAppValidationOutputRequest notifyAppValidationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyAppValidationOutputRequest, NotifyAppValidationOutputResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the launch configuration for the specified application.
     * </p>
     * 
     * @param putAppLaunchConfigurationRequest
     * @return A Java Future containing the result of the PutAppLaunchConfiguration operation returned by the service.
     * @sample AWSServerMigrationAsync.PutAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(
            PutAppLaunchConfigurationRequest putAppLaunchConfigurationRequest);

    /**
     * <p>
     * Creates or updates the launch configuration for the specified application.
     * </p>
     * 
     * @param putAppLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppLaunchConfiguration operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.PutAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(
            PutAppLaunchConfigurationRequest putAppLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppLaunchConfigurationRequest, PutAppLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the replication configuration for the specified application.
     * </p>
     * 
     * @param putAppReplicationConfigurationRequest
     * @return A Java Future containing the result of the PutAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.PutAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(
            PutAppReplicationConfigurationRequest putAppReplicationConfigurationRequest);

    /**
     * <p>
     * Creates or updates the replication configuration for the specified application.
     * </p>
     * 
     * @param putAppReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.PutAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(
            PutAppReplicationConfigurationRequest putAppReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppReplicationConfigurationRequest, PutAppReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a validation configuration for the specified application.
     * </p>
     * 
     * @param putAppValidationConfigurationRequest
     * @return A Java Future containing the result of the PutAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsync.PutAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppValidationConfigurationResult> putAppValidationConfigurationAsync(
            PutAppValidationConfigurationRequest putAppValidationConfigurationRequest);

    /**
     * <p>
     * Creates or updates a validation configuration for the specified application.
     * </p>
     * 
     * @param putAppValidationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppValidationConfiguration operation returned by the
     *         service.
     * @sample AWSServerMigrationAsyncHandler.PutAppValidationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppValidationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppValidationConfigurationResult> putAppValidationConfigurationAsync(
            PutAppValidationConfigurationRequest putAppValidationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppValidationConfigurationRequest, PutAppValidationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Starts replicating the specified application by creating replication jobs for each server in the application.
     * </p>
     * 
     * @param startAppReplicationRequest
     * @return A Java Future containing the result of the StartAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsync.StartAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(StartAppReplicationRequest startAppReplicationRequest);

    /**
     * <p>
     * Starts replicating the specified application by creating replication jobs for each server in the application.
     * </p>
     * 
     * @param startAppReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.StartAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(StartAppReplicationRequest startAppReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartAppReplicationRequest, StartAppReplicationResult> asyncHandler);

    /**
     * <p>
     * Starts an on-demand replication run for the specified application.
     * </p>
     * 
     * @param startOnDemandAppReplicationRequest
     * @return A Java Future containing the result of the StartOnDemandAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsync.StartOnDemandAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandAppReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOnDemandAppReplicationResult> startOnDemandAppReplicationAsync(
            StartOnDemandAppReplicationRequest startOnDemandAppReplicationRequest);

    /**
     * <p>
     * Starts an on-demand replication run for the specified application.
     * </p>
     * 
     * @param startOnDemandAppReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOnDemandAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.StartOnDemandAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandAppReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOnDemandAppReplicationResult> startOnDemandAppReplicationAsync(
            StartOnDemandAppReplicationRequest startOnDemandAppReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartOnDemandAppReplicationRequest, StartOnDemandAppReplicationResult> asyncHandler);

    /**
     * <p>
     * Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
     * This replication run is in addition to the ones already scheduled.
     * </p>
     * <p>
     * There is a limit on the number of on-demand replications runs that you can request in a 24-hour period.
     * </p>
     * 
     * @param startOnDemandReplicationRunRequest
     * @return A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service.
     * @sample AWSServerMigrationAsync.StartOnDemandReplicationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandReplicationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(
            StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest);

    /**
     * <p>
     * Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
     * This replication run is in addition to the ones already scheduled.
     * </p>
     * <p>
     * There is a limit on the number of on-demand replications runs that you can request in a 24-hour period.
     * </p>
     * 
     * @param startOnDemandReplicationRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.StartOnDemandReplicationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandReplicationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(
            StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartOnDemandReplicationRunRequest, StartOnDemandReplicationRunResult> asyncHandler);

    /**
     * <p>
     * Stops replicating the specified application by deleting the replication job for each server in the application.
     * </p>
     * 
     * @param stopAppReplicationRequest
     * @return A Java Future containing the result of the StopAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsync.StopAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StopAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(StopAppReplicationRequest stopAppReplicationRequest);

    /**
     * <p>
     * Stops replicating the specified application by deleting the replication job for each server in the application.
     * </p>
     * 
     * @param stopAppReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAppReplication operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.StopAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StopAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(StopAppReplicationRequest stopAppReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopAppReplicationRequest, StopAppReplicationResult> asyncHandler);

    /**
     * <p>
     * Terminates the stack for the specified application.
     * </p>
     * 
     * @param terminateAppRequest
     * @return A Java Future containing the result of the TerminateApp operation returned by the service.
     * @sample AWSServerMigrationAsync.TerminateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/TerminateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(TerminateAppRequest terminateAppRequest);

    /**
     * <p>
     * Terminates the stack for the specified application.
     * </p>
     * 
     * @param terminateAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.TerminateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/TerminateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(TerminateAppRequest terminateAppRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateAppRequest, TerminateAppResult> asyncHandler);

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateAppRequest
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSServerMigrationAsync.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler);

    /**
     * <p>
     * Updates the specified settings for the specified replication job.
     * </p>
     * 
     * @param updateReplicationJobRequest
     * @return A Java Future containing the result of the UpdateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.UpdateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest updateReplicationJobRequest);

    /**
     * <p>
     * Updates the specified settings for the specified replication job.
     * </p>
     * 
     * @param updateReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.UpdateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest updateReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationJobRequest, UpdateReplicationJobResult> asyncHandler);

}
