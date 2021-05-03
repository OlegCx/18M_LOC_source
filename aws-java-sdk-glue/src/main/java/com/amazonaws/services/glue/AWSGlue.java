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
package com.amazonaws.services.glue;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.glue.model.*;

/**
 * Interface for accessing AWS Glue.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.glue.AbstractAWSGlue} instead.
 * </p>
 * <p>
 * <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlue {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "glue";

    /**
     * <p>
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @return Result of the BatchCreatePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.BatchCreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchCreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    BatchCreatePartitionResult batchCreatePartition(BatchCreatePartitionRequest batchCreatePartitionRequest);

    /**
     * <p>
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @return Result of the BatchDeleteConnection operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteConnectionResult batchDeleteConnection(BatchDeleteConnectionRequest batchDeleteConnectionRequest);

    /**
     * <p>
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @return Result of the BatchDeletePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeletePartitionResult batchDeletePartition(BatchDeletePartitionRequest batchDeletePartitionRequest);

    /**
     * <p>
     * Deletes multiple tables at once.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>BatchDeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param batchDeleteTableRequest
     * @return Result of the BatchDeleteTable operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteTableResult batchDeleteTable(BatchDeleteTableRequest batchDeleteTableRequest);

    /**
     * <p>
     * Deletes a specified batch of versions of a table.
     * </p>
     * 
     * @param batchDeleteTableVersionRequest
     * @return Result of the BatchDeleteTableVersion operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchDeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTableVersion" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteTableVersionResult batchDeleteTableVersion(BatchDeleteTableVersionRequest batchDeleteTableVersionRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of crawler names. After calling the
     * <code>ListCrawlers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetCrawlersRequest
     * @return Result of the BatchGetCrawlers operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchGetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetCrawlersResult batchGetCrawlers(BatchGetCrawlersRequest batchGetCrawlersRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of development endpoint names. After calling the
     * <code>ListDevEndpoints</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetDevEndpointsRequest
     * @return Result of the BatchGetDevEndpoints operation returned by the service.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.BatchGetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetDevEndpointsResult batchGetDevEndpoints(BatchGetDevEndpointsRequest batchGetDevEndpointsRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of job names. After calling the <code>ListJobs</code>
     * operation, you can call this operation to access the data to which you have been granted permissions. This
     * operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetJobsRequest
     * @return Result of the BatchGetJobs operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.BatchGetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetJobsResult batchGetJobs(BatchGetJobsRequest batchGetJobsRequest);

    /**
     * <p>
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @return Result of the BatchGetPartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.BatchGetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetPartitionResult batchGetPartition(BatchGetPartitionRequest batchGetPartitionRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of trigger names. After calling the
     * <code>ListTriggers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetTriggersRequest
     * @return Result of the BatchGetTriggers operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.BatchGetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetTriggersResult batchGetTriggers(BatchGetTriggersRequest batchGetTriggersRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of workflow names. After calling the
     * <code>ListWorkflows</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetWorkflowsRequest
     * @return Result of the BatchGetWorkflows operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.BatchGetWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetWorkflowsResult batchGetWorkflows(BatchGetWorkflowsRequest batchGetWorkflowsRequest);

    /**
     * <p>
     * Stops one or more job runs for a specified job definition.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @return Result of the BatchStopJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.BatchStopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    BatchStopJobRunResult batchStopJobRun(BatchStopJobRunRequest batchStopJobRunRequest);

    /**
     * <p>
     * Updates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchUpdatePartitionRequest
     * @return Result of the BatchUpdatePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.BatchUpdatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchUpdatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    BatchUpdatePartitionResult batchUpdatePartition(BatchUpdatePartitionRequest batchUpdatePartitionRequest);

    /**
     * <p>
     * Cancels (stops) a task run. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf
     * as part of various machine learning workflows. You can cancel a machine learning task run at any time by calling
     * <code>CancelMLTaskRun</code> with a task run's parent transform's <code>TransformID</code> and the task run's
     * <code>TaskRunId</code>.
     * </p>
     * 
     * @param cancelMLTaskRunRequest
     * @return Result of the CancelMLTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.CancelMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CancelMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    CancelMLTaskRunResult cancelMLTaskRun(CancelMLTaskRunRequest cancelMLTaskRunRequest);

    /**
     * <p>
     * Validates the supplied schema. This call has no side effects, it simply validates using the supplied schema using
     * <code>DataFormat</code> as the format. Since it does not take a schema set name, no compatibility checks are
     * performed.
     * </p>
     * 
     * @param checkSchemaVersionValidityRequest
     * @return Result of the CheckSchemaVersionValidity operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.CheckSchemaVersionValidity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CheckSchemaVersionValidity"
     *      target="_top">AWS API Documentation</a>
     */
    CheckSchemaVersionValidityResult checkSchemaVersionValidity(CheckSchemaVersionValidityRequest checkSchemaVersionValidityRequest);

    /**
     * <p>
     * Creates a classifier in the user's account. This can be a <code>GrokClassifier</code>, an
     * <code>XMLClassifier</code>, a <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which
     * field of the request is present.
     * </p>
     * 
     * @param createClassifierRequest
     * @return Result of the CreateClassifier operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClassifierResult createClassifier(CreateClassifierRequest createClassifierRequest);

    /**
     * <p>
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
     * target must be specified, in the <code>s3Targets</code> field, the <code>jdbcTargets</code> field, or the
     * <code>DynamoDBTargets</code> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @return Result of the CreateCrawler operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCrawlerResult createCrawler(CreateCrawlerRequest createCrawlerRequest);

    /**
     * <p>
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return Result of the CreateDatabase operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatabaseResult createDatabase(CreateDatabaseRequest createDatabaseRequest);

    /**
     * <p>
     * Creates a new development endpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @return Result of the CreateDevEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ValidationException
     *         A value could not be validated.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDevEndpointResult createDevEndpoint(CreateDevEndpointRequest createDevEndpointRequest);

    /**
     * <p>
     * Creates a new job definition.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates an AWS Glue machine learning transform. This operation creates the transform and all the necessary
     * parameters to train it.
     * </p>
     * <p>
     * Call this operation as the first step in the process of using a machine learning transform (such as the
     * <code>FindMatches</code> transform) for deduplicating data. You can provide an optional <code>Description</code>,
     * in addition to the parameters that you want to use for your algorithm.
     * </p>
     * <p>
     * You must also specify certain parameters for the tasks that AWS Glue runs on your behalf as part of learning from
     * your data and creating a high-quality machine learning transform. These parameters include <code>Role</code>, and
     * optionally, <code>AllocatedCapacity</code>, <code>Timeout</code>, and <code>MaxRetries</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html">Jobs</a>.
     * </p>
     * 
     * @param createMLTransformRequest
     * @return Result of the CreateMLTransform operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @sample AWSGlue.CreateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMLTransformResult createMLTransform(CreateMLTransformRequest createMLTransformRequest);

    /**
     * <p>
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @return Result of the CreatePartition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePartitionResult createPartition(CreatePartitionRequest createPartitionRequest);

    /**
     * <p>
     * Creates a specified partition index in an existing table.
     * </p>
     * 
     * @param createPartitionIndexRequest
     * @return Result of the CreatePartitionIndex operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreatePartitionIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreatePartitionIndex" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePartitionIndexResult createPartitionIndex(CreatePartitionIndexRequest createPartitionIndexRequest);

    /**
     * <p>
     * Creates a new registry which may be used to hold a collection of schemas.
     * </p>
     * 
     * @param createRegistryRequest
     * @return Result of the CreateRegistry operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.CreateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRegistryResult createRegistry(CreateRegistryRequest createRegistryRequest);

    /**
     * <p>
     * Creates a new schema set and registers the schema definition. Returns an error if the schema set already exists
     * without actually registering the version.
     * </p>
     * <p>
     * When the schema set is created, a version checkpoint will be set to the first version. Compatibility mode
     * "DISABLED" restricts any additional schema versions from being added after the first schema version. For all
     * other compatibility modes, validation of compatibility settings will be applied only from the second version
     * onwards when the <code>RegisterSchemaVersion</code> API is used.
     * </p>
     * <p>
     * When this API is called without a <code>RegistryId</code>, this will create an entry for a "default-registry" in
     * the registry database tables, if it is not already present.
     * </p>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Transforms a directed acyclic graph (DAG) into code.
     * </p>
     * 
     * @param createScriptRequest
     * @return Result of the CreateScript operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    CreateScriptResult createScript(CreateScriptRequest createScriptRequest);

    /**
     * <p>
     * Creates a new security configuration. A security configuration is a set of security properties that can be used
     * by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
     * configurations in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html">Encrypting Data Written
     * by Crawlers, Jobs, and Development Endpoints</a>.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return Result of the CreateSecurityConfiguration operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.CreateSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest createSecurityConfigurationRequest);

    /**
     * <p>
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @return Result of the CreateTable operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTableResult createTable(CreateTableRequest createTableRequest);

    /**
     * <p>
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @return Result of the CreateTrigger operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws IdempotentParameterMismatchException
     *         The same unique identifier was associated with two different records.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.CreateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTriggerResult createTrigger(CreateTriggerRequest createTriggerRequest);

    /**
     * <p>
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @return Result of the CreateUserDefinedFunction operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.CreateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUserDefinedFunctionResult createUserDefinedFunction(CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest);

    /**
     * <p>
     * Creates a new workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @return Result of the DeleteClassifier operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClassifierResult deleteClassifier(DeleteClassifierRequest deleteClassifierRequest);

    /**
     * <p>
     * Delete the partition column statistics of a column.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>DeletePartition</code>.
     * </p>
     * 
     * @param deleteColumnStatisticsForPartitionRequest
     * @return Result of the DeleteColumnStatisticsForPartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.DeleteColumnStatisticsForPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteColumnStatisticsForPartition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteColumnStatisticsForPartitionResult deleteColumnStatisticsForPartition(
            DeleteColumnStatisticsForPartitionRequest deleteColumnStatisticsForPartitionRequest);

    /**
     * <p>
     * Retrieves table statistics of columns.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>DeleteTable</code>.
     * </p>
     * 
     * @param deleteColumnStatisticsForTableRequest
     * @return Result of the DeleteColumnStatisticsForTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.DeleteColumnStatisticsForTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteColumnStatisticsForTable"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteColumnStatisticsForTableResult deleteColumnStatisticsForTable(DeleteColumnStatisticsForTableRequest deleteColumnStatisticsForTableRequest);

    /**
     * <p>
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @return Result of the DeleteCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCrawlerResult deleteCrawler(DeleteCrawlerRequest deleteCrawlerRequest);

    /**
     * <p>
     * Removes a specified database from a Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the tables (and all table versions and partitions
     * that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these
     * "orphaned" resources asynchronously in a timely manner, at the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteDatabase</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, <code>DeleteUserDefinedFunction</code>, and <code>DeleteTable</code> or
     * <code>BatchDeleteTable</code>, to delete any resources that belong to the database.
     * </p>
     * </note>
     * 
     * @param deleteDatabaseRequest
     * @return Result of the DeleteDatabase operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest);

    /**
     * <p>
     * Deletes a specified development endpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @return Result of the DeleteDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.DeleteDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDevEndpointResult deleteDevEndpoint(DeleteDevEndpointRequest deleteDevEndpointRequest);

    /**
     * <p>
     * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes an AWS Glue machine learning transform. Machine learning transforms are a special type of transform that
     * use machine learning to learn the details of the transformation to be performed by learning from examples
     * provided by humans. These transformations are then saved by AWS Glue. If you no longer need a transform, you can
     * delete it by calling <code>DeleteMLTransforms</code>. However, any AWS Glue jobs that still reference the deleted
     * transform will no longer succeed.
     * </p>
     * 
     * @param deleteMLTransformRequest
     * @return Result of the DeleteMLTransform operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.DeleteMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMLTransformResult deleteMLTransform(DeleteMLTransformRequest deleteMLTransformRequest);

    /**
     * <p>
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @return Result of the DeletePartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePartitionResult deletePartition(DeletePartitionRequest deletePartitionRequest);

    /**
     * <p>
     * Deletes a specified partition index from an existing table.
     * </p>
     * 
     * @param deletePartitionIndexRequest
     * @return Result of the DeletePartitionIndex operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ConflictException
     *         The <code>CreatePartitions</code> API was called on a table that has indexes enabled.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.DeletePartitionIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartitionIndex" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePartitionIndexResult deletePartitionIndex(DeletePartitionIndexRequest deletePartitionIndexRequest);

    /**
     * <p>
     * Delete the entire registry including schema and all of its versions. To get the status of the delete operation,
     * you can call the <code>GetRegistry</code> API after the asynchronous call. Deleting a registry will disable all
     * online operations for the registry such as the <code>UpdateRegistry</code>, <code>CreateSchema</code>,
     * <code>UpdateSchema</code>, and <code>RegisterSchemaVersion</code> APIs.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @return Result of the DeleteRegistry operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.DeleteRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRegistryResult deleteRegistry(DeleteRegistryRequest deleteRegistryRequest);

    /**
     * <p>
     * Deletes a specified policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ConditionCheckFailureException
     *         A specified condition was not satisfied.
     * @sample AWSGlue.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the entire schema set, including the schema set and all of its versions. To get the status of the delete
     * operation, you can call <code>GetSchema</code> API after the asynchronous call. Deleting a registry will disable
     * all online operations for the schema, such as the <code>GetSchemaByDefinition</code>, and
     * <code>RegisterSchemaVersion</code> APIs.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSchemaResult deleteSchema(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Remove versions from the specified schema. A version number or range may be supplied. If the compatibility mode
     * forbids deleting of a version that is necessary, such as BACKWARDS_FULL, an error is returned. Calling the
     * <code>GetSchemaVersions</code> API after this call will list the status of the deleted versions.
     * </p>
     * <p>
     * When the range of version numbers contain check pointed version, the API will return a 409 conflict and will not
     * proceed with the deletion. You have to remove the checkpoint first using the <code>DeleteSchemaCheckpoint</code>
     * API before using this API.
     * </p>
     * <p>
     * You cannot use the <code>DeleteSchemaVersions</code> API to delete the first schema version in the schema set.
     * The first schema version can only be deleted by the <code>DeleteSchema</code> API. This operation will also
     * delete the attached <code>SchemaVersionMetadata</code> under the schema versions. Hard deletes will be enforced
     * on the database.
     * </p>
     * <p>
     * If the compatibility mode forbids deleting of a version that is necessary, such as BACKWARDS_FULL, an error is
     * returned.
     * </p>
     * 
     * @param deleteSchemaVersionsRequest
     * @return Result of the DeleteSchemaVersions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.DeleteSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSchemaVersionsResult deleteSchemaVersions(DeleteSchemaVersionsRequest deleteSchemaVersionsRequest);

    /**
     * <p>
     * Deletes a specified security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return Result of the DeleteSecurityConfiguration operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSecurityConfigurationResult deleteSecurityConfiguration(DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest);

    /**
     * <p>
     * Removes a table definition from the Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param deleteTableRequest
     * @return Result of the DeleteTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * Deletes a specified version of a table.
     * </p>
     * 
     * @param deleteTableVersionRequest
     * @return Result of the DeleteTableVersion operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTableVersionResult deleteTableVersion(DeleteTableVersionRequest deleteTableVersionRequest);

    /**
     * <p>
     * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @return Result of the DeleteTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.DeleteTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTriggerResult deleteTrigger(DeleteTriggerRequest deleteTriggerRequest);

    /**
     * <p>
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @return Result of the DeleteUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.DeleteUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserDefinedFunctionResult deleteUserDefinedFunction(DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @return Result of the GetCatalogImportStatus operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCatalogImportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCatalogImportStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetCatalogImportStatusResult getCatalogImportStatus(GetCatalogImportStatusRequest getCatalogImportStatusRequest);

    /**
     * <p>
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @return Result of the GetClassifier operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    GetClassifierResult getClassifier(GetClassifierRequest getClassifierRequest);

    /**
     * <p>
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @return Result of the GetClassifiers operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifiers" target="_top">AWS API
     *      Documentation</a>
     */
    GetClassifiersResult getClassifiers(GetClassifiersRequest getClassifiersRequest);

    /**
     * <p>
     * Retrieves partition statistics of columns.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>GetPartition</code>.
     * </p>
     * 
     * @param getColumnStatisticsForPartitionRequest
     * @return Result of the GetColumnStatisticsForPartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetColumnStatisticsForPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetColumnStatisticsForPartition"
     *      target="_top">AWS API Documentation</a>
     */
    GetColumnStatisticsForPartitionResult getColumnStatisticsForPartition(GetColumnStatisticsForPartitionRequest getColumnStatisticsForPartitionRequest);

    /**
     * <p>
     * Retrieves table statistics of columns.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>GetTable</code>.
     * </p>
     * 
     * @param getColumnStatisticsForTableRequest
     * @return Result of the GetColumnStatisticsForTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetColumnStatisticsForTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetColumnStatisticsForTable"
     *      target="_top">AWS API Documentation</a>
     */
    GetColumnStatisticsForTableResult getColumnStatisticsForTable(GetColumnStatisticsForTableRequest getColumnStatisticsForTableRequest);

    /**
     * <p>
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest);

    /**
     * <p>
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return Result of the GetConnections operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
     *      Documentation</a>
     */
    GetConnectionsResult getConnections(GetConnectionsRequest getConnectionsRequest);

    /**
     * <p>
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @return Result of the GetCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    GetCrawlerResult getCrawler(GetCrawlerRequest getCrawlerRequest);

    /**
     * <p>
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @return Result of the GetCrawlerMetrics operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawlerMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    GetCrawlerMetricsResult getCrawlerMetrics(GetCrawlerMetricsRequest getCrawlerMetricsRequest);

    /**
     * <p>
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @return Result of the GetCrawlers operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    GetCrawlersResult getCrawlers(GetCrawlersRequest getCrawlersRequest);

    /**
     * <p>
     * Retrieves the security configuration for a specified catalog.
     * </p>
     * 
     * @param getDataCatalogEncryptionSettingsRequest
     * @return Result of the GetDataCatalogEncryptionSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataCatalogEncryptionSettingsResult getDataCatalogEncryptionSettings(GetDataCatalogEncryptionSettingsRequest getDataCatalogEncryptionSettingsRequest);

    /**
     * <p>
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Retrieves all databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @return Result of the GetDatabases operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatabasesResult getDatabases(GetDatabasesRequest getDatabasesRequest);

    /**
     * <p>
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @return Result of the GetDataflowGraph operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetDataflowGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataflowGraphResult getDataflowGraph(GetDataflowGraphRequest getDataflowGraphRequest);

    /**
     * <p>
     * Retrieves information about a specified development endpoint.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointRequest
     * @return Result of the GetDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.GetDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    GetDevEndpointResult getDevEndpoint(GetDevEndpointRequest getDevEndpointRequest);

    /**
     * <p>
     * Retrieves all the development endpoints in this AWS account.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointsRequest
     * @return Result of the GetDevEndpoints operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.GetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    GetDevEndpointsResult getDevEndpoints(GetDevEndpointsRequest getDevEndpointsRequest);

    /**
     * <p>
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Returns information on a job bookmark entry.
     * </p>
     * 
     * @param getJobBookmarkRequest
     * @return Result of the GetJobBookmark operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ValidationException
     *         A value could not be validated.
     * @sample AWSGlue.GetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobBookmarkResult getJobBookmark(GetJobBookmarkRequest getJobBookmarkRequest);

    /**
     * <p>
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return Result of the GetJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobRunResult getJobRun(GetJobRunRequest getJobRunRequest);

    /**
     * <p>
     * Retrieves metadata for all runs of a given job definition.
     * </p>
     * 
     * @param getJobRunsRequest
     * @return Result of the GetJobRuns operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobRunsResult getJobRuns(GetJobRunsRequest getJobRunsRequest);

    /**
     * <p>
     * Retrieves all current job definitions.
     * </p>
     * 
     * @param getJobsRequest
     * @return Result of the GetJobs operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobsResult getJobs(GetJobsRequest getJobsRequest);

    /**
     * <p>
     * Gets details for a specific task run on a machine learning transform. Machine learning task runs are asynchronous
     * tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can check the stats of
     * any task run by calling <code>GetMLTaskRun</code> with the <code>TaskRunID</code> and its parent transform's
     * <code>TransformID</code>.
     * </p>
     * 
     * @param getMLTaskRunRequest
     * @return Result of the GetMLTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetMLTaskRunResult getMLTaskRun(GetMLTaskRunRequest getMLTaskRunRequest);

    /**
     * <p>
     * Gets a list of runs for a machine learning transform. Machine learning task runs are asynchronous tasks that AWS
     * Glue runs on your behalf as part of various machine learning workflows. You can get a sortable, filterable list
     * of machine learning task runs by calling <code>GetMLTaskRuns</code> with their parent transform's
     * <code>TransformID</code> and other optional parameters as documented in this section.
     * </p>
     * <p>
     * This operation returns a list of historic runs and must be paginated.
     * </p>
     * 
     * @param getMLTaskRunsRequest
     * @return Result of the GetMLTaskRuns operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetMLTaskRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRuns" target="_top">AWS API
     *      Documentation</a>
     */
    GetMLTaskRunsResult getMLTaskRuns(GetMLTaskRunsRequest getMLTaskRunsRequest);

    /**
     * <p>
     * Gets an AWS Glue machine learning transform artifact and all its corresponding metadata. Machine learning
     * transforms are a special type of transform that use machine learning to learn the details of the transformation
     * to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue.
     * You can retrieve their metadata by calling <code>GetMLTransform</code>.
     * </p>
     * 
     * @param getMLTransformRequest
     * @return Result of the GetMLTransform operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    GetMLTransformResult getMLTransform(GetMLTransformRequest getMLTransformRequest);

    /**
     * <p>
     * Gets a sortable, filterable list of existing AWS Glue machine learning transforms. Machine learning transforms
     * are a special type of transform that use machine learning to learn the details of the transformation to be
     * performed by learning from examples provided by humans. These transformations are then saved by AWS Glue, and you
     * can retrieve their metadata by calling <code>GetMLTransforms</code>.
     * </p>
     * 
     * @param getMLTransformsRequest
     * @return Result of the GetMLTransforms operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    GetMLTransformsResult getMLTransforms(GetMLTransformsRequest getMLTransformsRequest);

    /**
     * <p>
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @return Result of the GetMapping operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.GetMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
     *      Documentation</a>
     */
    GetMappingResult getMapping(GetMappingRequest getMappingRequest);

    /**
     * <p>
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @return Result of the GetPartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    GetPartitionResult getPartition(GetPartitionRequest getPartitionRequest);

    /**
     * <p>
     * Retrieves the partition indexes associated with a table.
     * </p>
     * 
     * @param getPartitionIndexesRequest
     * @return Result of the GetPartitionIndexes operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ConflictException
     *         The <code>CreatePartitions</code> API was called on a table that has indexes enabled.
     * @sample AWSGlue.GetPartitionIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitionIndexes" target="_top">AWS API
     *      Documentation</a>
     */
    GetPartitionIndexesResult getPartitionIndexes(GetPartitionIndexesRequest getPartitionIndexesRequest);

    /**
     * <p>
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @return Result of the GetPartitions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetPartitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
     *      Documentation</a>
     */
    GetPartitionsResult getPartitions(GetPartitionsRequest getPartitionsRequest);

    /**
     * <p>
     * Gets code to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @return Result of the GetPlan operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API
     *      Documentation</a>
     */
    GetPlanResult getPlan(GetPlanRequest getPlanRequest);

    /**
     * <p>
     * Describes the specified registry in detail.
     * </p>
     * 
     * @param getRegistryRequest
     * @return Result of the GetRegistry operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    GetRegistryResult getRegistry(GetRegistryRequest getRegistryRequest);

    /**
     * <p>
     * Retrieves the resource policies set on individual resources by AWS Resource Access Manager during cross-account
     * permission grants. Also retrieves the Data Catalog resource policy.
     * </p>
     * <p>
     * If you enabled metadata encryption in Data Catalog settings, and you do not have permission on the AWS KMS key,
     * the operation can't return the Data Catalog resource policy.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves a specified resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSGlue.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Describes the specified schema in detail.
     * </p>
     * 
     * @param getSchemaRequest
     * @return Result of the GetSchema operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    GetSchemaResult getSchema(GetSchemaRequest getSchemaRequest);

    /**
     * <p>
     * Retrieves a schema by the <code>SchemaDefinition</code>. The schema definition is sent to the Schema Registry,
     * canonicalized, and hashed. If the hash is matched within the scope of the <code>SchemaName</code> or ARN (or the
     * default registry, if none is supplied), that schema’s metadata is returned. Otherwise, a 404 or NotFound error is
     * returned. Schema versions in <code>Deleted</code> statuses will not be included in the results.
     * </p>
     * 
     * @param getSchemaByDefinitionRequest
     * @return Result of the GetSchemaByDefinition operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetSchemaByDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaByDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    GetSchemaByDefinitionResult getSchemaByDefinition(GetSchemaByDefinitionRequest getSchemaByDefinitionRequest);

    /**
     * <p>
     * Get the specified schema by its unique ID assigned when a version of the schema is created or registered. Schema
     * versions in Deleted status will not be included in the results.
     * </p>
     * 
     * @param getSchemaVersionRequest
     * @return Result of the GetSchemaVersion operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetSchemaVersionResult getSchemaVersion(GetSchemaVersionRequest getSchemaVersionRequest);

    /**
     * <p>
     * Fetches the schema version difference in the specified difference type between two stored schema versions in the
     * Schema Registry.
     * </p>
     * <p>
     * This API allows you to compare two schema versions between two schema definitions under the same schema.
     * </p>
     * 
     * @param getSchemaVersionsDiffRequest
     * @return Result of the GetSchemaVersionsDiff operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.GetSchemaVersionsDiff
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaVersionsDiff" target="_top">AWS API
     *      Documentation</a>
     */
    GetSchemaVersionsDiffResult getSchemaVersionsDiff(GetSchemaVersionsDiffRequest getSchemaVersionsDiffRequest);

    /**
     * <p>
     * Retrieves a specified security configuration.
     * </p>
     * 
     * @param getSecurityConfigurationRequest
     * @return Result of the GetSecurityConfiguration operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetSecurityConfigurationResult getSecurityConfiguration(GetSecurityConfigurationRequest getSecurityConfigurationRequest);

    /**
     * <p>
     * Retrieves a list of all security configurations.
     * </p>
     * 
     * @param getSecurityConfigurationsRequest
     * @return Result of the GetSecurityConfigurations operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetSecurityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    GetSecurityConfigurationsResult getSecurityConfigurations(GetSecurityConfigurationsRequest getSecurityConfigurationsRequest);

    /**
     * <p>
     * Retrieves the <code>Table</code> definition in a Data Catalog for a specified table.
     * </p>
     * 
     * @param getTableRequest
     * @return Result of the GetTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableResult getTable(GetTableRequest getTableRequest);

    /**
     * <p>
     * Retrieves a specified version of a table.
     * </p>
     * 
     * @param getTableVersionRequest
     * @return Result of the GetTableVersion operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableVersionResult getTableVersion(GetTableVersionRequest getTableVersionRequest);

    /**
     * <p>
     * Retrieves a list of strings that identify available versions of a specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @return Result of the GetTableVersions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetTableVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersions" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableVersionsResult getTableVersions(GetTableVersionsRequest getTableVersionsRequest);

    /**
     * <p>
     * Retrieves the definitions of some or all of the tables in a given <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @return Result of the GetTables operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTables" target="_top">AWS API
     *      Documentation</a>
     */
    GetTablesResult getTables(GetTablesRequest getTablesRequest);

    /**
     * <p>
     * Retrieves a list of tags associated with a resource.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @return Result of the GetTrigger operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    GetTriggerResult getTrigger(GetTriggerRequest getTriggerRequest);

    /**
     * <p>
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @return Result of the GetTriggers operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    GetTriggersResult getTriggers(GetTriggersRequest getTriggersRequest);

    /**
     * <p>
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @return Result of the GetUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    GetUserDefinedFunctionResult getUserDefinedFunction(GetUserDefinedFunctionRequest getUserDefinedFunctionRequest);

    /**
     * <p>
     * Retrieves multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @return Result of the GetUserDefinedFunctions operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.GetUserDefinedFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    GetUserDefinedFunctionsResult getUserDefinedFunctions(GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest);

    /**
     * <p>
     * Retrieves resource metadata for a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Retrieves the metadata for a given workflow run.
     * </p>
     * 
     * @param getWorkflowRunRequest
     * @return Result of the GetWorkflowRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkflowRunResult getWorkflowRun(GetWorkflowRunRequest getWorkflowRunRequest);

    /**
     * <p>
     * Retrieves the workflow run properties which were set during the run.
     * </p>
     * 
     * @param getWorkflowRunPropertiesRequest
     * @return Result of the GetWorkflowRunProperties operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorkflowRunPropertiesResult getWorkflowRunProperties(GetWorkflowRunPropertiesRequest getWorkflowRunPropertiesRequest);

    /**
     * <p>
     * Retrieves metadata for all runs of a given workflow.
     * </p>
     * 
     * @param getWorkflowRunsRequest
     * @return Result of the GetWorkflowRuns operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.GetWorkflowRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRuns" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkflowRunsResult getWorkflowRuns(GetWorkflowRunsRequest getWorkflowRunsRequest);

    /**
     * <p>
     * Imports an existing Amazon Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @return Result of the ImportCatalogToGlue operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ImportCatalogToGlue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ImportCatalogToGlue" target="_top">AWS API
     *      Documentation</a>
     */
    ImportCatalogToGlueResult importCatalogToGlue(ImportCatalogToGlueRequest importCatalogToGlueRequest);

    /**
     * <p>
     * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listCrawlersRequest
     * @return Result of the ListCrawlers operation returned by the service.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ListCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    ListCrawlersResult listCrawlers(ListCrawlersRequest listCrawlersRequest);

    /**
     * <p>
     * Retrieves the names of all <code>DevEndpoint</code> resources in this AWS account, or the resources with the
     * specified tag. This operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listDevEndpointsRequest
     * @return Result of the ListDevEndpoints operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ListDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevEndpointsResult listDevEndpoints(ListDevEndpointsRequest listDevEndpointsRequest);

    /**
     * <p>
     * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Retrieves a sortable, filterable list of existing AWS Glue machine learning transforms in this AWS account, or
     * the resources with the specified tag. This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter of the responses so that tagged resources can be retrieved as a group. If you choose to use tag
     * filtering, only resources with the tags are retrieved.
     * </p>
     * 
     * @param listMLTransformsRequest
     * @return Result of the ListMLTransforms operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.ListMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    ListMLTransformsResult listMLTransforms(ListMLTransformsRequest listMLTransformsRequest);

    /**
     * <p>
     * Returns a list of registries that you have created, with minimal registry information. Registries in the
     * <code>Deleting</code> status will not be included in the results. Empty results will be returned if there are no
     * registries available.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return Result of the ListRegistries operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.ListRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListRegistries" target="_top">AWS API
     *      Documentation</a>
     */
    ListRegistriesResult listRegistries(ListRegistriesRequest listRegistriesRequest);

    /**
     * <p>
     * Returns a list of schema versions that you have created, with minimal information. Schema versions in Deleted
     * status will not be included in the results. Empty results will be returned if there are no schema versions
     * available.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return Result of the ListSchemaVersions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.ListSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemaVersionsResult listSchemaVersions(ListSchemaVersionsRequest listSchemaVersionsRequest);

    /**
     * <p>
     * Returns a list of schemas with minimal details. Schemas in Deleting status will not be included in the results.
     * Empty results will be returned if there are no schemas available.
     * </p>
     * <p>
     * When the <code>RegistryId</code> is not provided, all the schemas across registries will be part of the API
     * response.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listTriggersRequest
     * @return Result of the ListTriggers operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ListTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    ListTriggersResult listTriggers(ListTriggersRequest listTriggersRequest);

    /**
     * <p>
     * Lists names of workflows created in the account.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Sets the security configuration for a specified catalog. After the configuration has been set, the specified
     * encryption is applied to every catalog write thereafter.
     * </p>
     * 
     * @param putDataCatalogEncryptionSettingsRequest
     * @return Result of the PutDataCatalogEncryptionSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.PutDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    PutDataCatalogEncryptionSettingsResult putDataCatalogEncryptionSettings(PutDataCatalogEncryptionSettingsRequest putDataCatalogEncryptionSettingsRequest);

    /**
     * <p>
     * Sets the Data Catalog resource policy for access control.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ConditionCheckFailureException
     *         A specified condition was not satisfied.
     * @sample AWSGlue.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Puts the metadata key value pair for a specified schema version ID. A maximum of 10 key value pairs will be
     * allowed per schema version. They can be added over one or more calls.
     * </p>
     * 
     * @param putSchemaVersionMetadataRequest
     * @return Result of the PutSchemaVersionMetadata operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @sample AWSGlue.PutSchemaVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutSchemaVersionMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    PutSchemaVersionMetadataResult putSchemaVersionMetadata(PutSchemaVersionMetadataRequest putSchemaVersionMetadataRequest);

    /**
     * <p>
     * Puts the specified workflow run properties for the given workflow run. If a property already exists for the
     * specified run, then it overrides the value otherwise adds the property to existing properties.
     * </p>
     * 
     * @param putWorkflowRunPropertiesRequest
     * @return Result of the PutWorkflowRunProperties operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.PutWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    PutWorkflowRunPropertiesResult putWorkflowRunProperties(PutWorkflowRunPropertiesRequest putWorkflowRunPropertiesRequest);

    /**
     * <p>
     * Queries for the schema version metadata information.
     * </p>
     * 
     * @param querySchemaVersionMetadataRequest
     * @return Result of the QuerySchemaVersionMetadata operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.QuerySchemaVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/QuerySchemaVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    QuerySchemaVersionMetadataResult querySchemaVersionMetadata(QuerySchemaVersionMetadataRequest querySchemaVersionMetadataRequest);

    /**
     * <p>
     * Adds a new version to the existing schema. Returns an error if new version of schema does not meet the
     * compatibility requirements of the schema set. This API will not create a new schema set and will return a 404
     * error if the schema set is not already present in the Schema Registry.
     * </p>
     * <p>
     * If this is the first schema definition to be registered in the Schema Registry, this API will store the schema
     * version and return immediately. Otherwise, this call has the potential to run longer than other operations due to
     * compatibility modes. You can call the <code>GetSchemaVersion</code> API with the <code>SchemaVersionId</code> to
     * check compatibility modes.
     * </p>
     * <p>
     * If the same schema definition is already stored in Schema Registry as a version, the schema ID of the existing
     * schema is returned to the caller.
     * </p>
     * 
     * @param registerSchemaVersionRequest
     * @return Result of the RegisterSchemaVersion operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.RegisterSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RegisterSchemaVersion" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterSchemaVersionResult registerSchemaVersion(RegisterSchemaVersionRequest registerSchemaVersionRequest);

    /**
     * <p>
     * Removes a key value pair from the schema version metadata for the specified schema version ID.
     * </p>
     * 
     * @param removeSchemaVersionMetadataRequest
     * @return Result of the RemoveSchemaVersionMetadata operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.RemoveSchemaVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RemoveSchemaVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveSchemaVersionMetadataResult removeSchemaVersionMetadata(RemoveSchemaVersionMetadataRequest removeSchemaVersionMetadataRequest);

    /**
     * <p>
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @return Result of the ResetJobBookmark operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.ResetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    ResetJobBookmarkResult resetJobBookmark(ResetJobBookmarkRequest resetJobBookmarkRequest);

    /**
     * <p>
     * Restarts selected nodes of a previous partially completed workflow run and resumes the workflow run. The selected
     * nodes and all nodes that are downstream from the selected nodes are run.
     * </p>
     * 
     * @param resumeWorkflowRunRequest
     * @return Result of the ResumeWorkflowRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @throws IllegalWorkflowStateException
     *         The workflow is in an invalid state to perform a requested operation.
     * @sample AWSGlue.ResumeWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResumeWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    ResumeWorkflowRunResult resumeWorkflowRun(ResumeWorkflowRunRequest resumeWorkflowRunRequest);

    /**
     * <p>
     * Searches a set of tables based on properties in the table metadata as well as on the parent database. You can
     * search against text or filter conditions.
     * </p>
     * <p>
     * You can only get tables that you have access to based on the security policies defined in Lake Formation. You
     * need at least a read-only access to the table for it to be returned. If you do not have access to all the columns
     * in the table, these columns will not be searched against when returning the list of tables back to you. If you
     * have access to the columns but not the data in the columns, those columns and the associated metadata for those
     * columns will be included in the search.
     * </p>
     * 
     * @param searchTablesRequest
     * @return Result of the SearchTables operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.SearchTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SearchTables" target="_top">AWS API
     *      Documentation</a>
     */
    SearchTablesResult searchTables(SearchTablesRequest searchTablesRequest);

    /**
     * <p>
     * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
     * returns a <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException"
     * >CrawlerRunningException</a>.
     * </p>
     * 
     * @param startCrawlerRequest
     * @return Result of the StartCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StartCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    StartCrawlerResult startCrawler(StartCrawlerRequest startCrawlerRequest);

    /**
     * <p>
     * Changes the schedule state of the specified crawler to <code>SCHEDULED</code>, unless the crawler is already
     * running or the schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @return Result of the StartCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws SchedulerRunningException
     *         The specified scheduler is already running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws NoScheduleException
     *         There is no applicable schedule.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StartCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    StartCrawlerScheduleResult startCrawlerSchedule(StartCrawlerScheduleRequest startCrawlerScheduleRequest);

    /**
     * <p>
     * Begins an asynchronous task to export all labeled data for a particular transform. This task is the only
     * label-related API call that is not part of the typical active learning workflow. You typically use
     * <code>StartExportLabelsTaskRun</code> when you want to work with all of your existing labels at the same time,
     * such as when you want to remove or change labels that were previously submitted as truth. This API operation
     * accepts the <code>TransformId</code> whose labels you want to export and an Amazon Simple Storage Service (Amazon
     * S3) path to export the labels to. The operation returns a <code>TaskRunId</code>. You can check on the status of
     * your task run by calling the <code>GetMLTaskRun</code> API.
     * </p>
     * 
     * @param startExportLabelsTaskRunRequest
     * @return Result of the StartExportLabelsTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.StartExportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartExportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    StartExportLabelsTaskRunResult startExportLabelsTaskRun(StartExportLabelsTaskRunRequest startExportLabelsTaskRunRequest);

    /**
     * <p>
     * Enables you to provide additional labels (examples of truth) to be used to teach the machine learning transform
     * and improve its quality. This API operation is generally used as part of the active learning workflow that starts
     * with the <code>StartMLLabelingSetGenerationTaskRun</code> call and that ultimately results in improving the
     * quality of your machine learning transform.
     * </p>
     * <p>
     * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue machine learning will have
     * generated a series of questions for humans to answer. (Answering these questions is often called 'labeling' in
     * the machine learning workflows). In the case of the <code>FindMatches</code> transform, these questions are of
     * the form, “What is the correct way to group these rows together into groups composed entirely of matching
     * records?” After the labeling process is finished, users upload their answers/labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * <p>
     * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually learns from and combines all labels that
     * you upload unless you set <code>Replace</code> to true. If you set <code>Replace</code> to true,
     * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously uploaded labels and learns only from the
     * exact set that you upload. Replacing labels can be helpful if you realize that you previously uploaded incorrect
     * labels, and you believe that they are having a negative effect on your transform quality.
     * </p>
     * <p>
     * You can check on the status of your task run by calling the <code>GetMLTaskRun</code> operation.
     * </p>
     * 
     * @param startImportLabelsTaskRunRequest
     * @return Result of the StartImportLabelsTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.StartImportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartImportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    StartImportLabelsTaskRunResult startImportLabelsTaskRun(StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest);

    /**
     * <p>
     * Starts a job run using a job definition.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Starts a task to estimate the quality of the transform.
     * </p>
     * <p>
     * When you provide label sets as examples of truth, AWS Glue machine learning uses some of those examples to learn
     * from them. The rest of the labels are used as a test to estimate quality.
     * </p>
     * <p>
     * Returns a unique identifier for the run. You can call <code>GetMLTaskRun</code> to get more information about the
     * stats of the <code>EvaluationTaskRun</code>.
     * </p>
     * 
     * @param startMLEvaluationTaskRunRequest
     * @return Result of the StartMLEvaluationTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @throws MLTransformNotReadyException
     *         The machine learning transform is not ready to run.
     * @sample AWSGlue.StartMLEvaluationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLEvaluationTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    StartMLEvaluationTaskRunResult startMLEvaluationTaskRun(StartMLEvaluationTaskRunRequest startMLEvaluationTaskRunRequest);

    /**
     * <p>
     * Starts the active learning workflow for your machine learning transform to improve the transform's quality by
     * generating label sets and adding labels.
     * </p>
     * <p>
     * When the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue will have generated a "labeling set"
     * or a set of questions for humans to answer.
     * </p>
     * <p>
     * In the case of the <code>FindMatches</code> transform, these questions are of the form, “What is the correct way
     * to group these rows together into groups composed entirely of matching records?”
     * </p>
     * <p>
     * After the labeling process is finished, you can upload your labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform will use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * 
     * @param startMLLabelingSetGenerationTaskRunRequest
     * @return Result of the StartMLLabelingSetGenerationTaskRun operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartMLLabelingSetGenerationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLLabelingSetGenerationTaskRun"
     *      target="_top">AWS API Documentation</a>
     */
    StartMLLabelingSetGenerationTaskRunResult startMLLabelingSetGenerationTaskRun(
            StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest);

    /**
     * <p>
     * Starts an existing trigger. See <a href="https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html">Triggering
     * Jobs</a> for information about how different types of trigger are started.
     * </p>
     * 
     * @param startTriggerRequest
     * @return Result of the StartTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    StartTriggerResult startTrigger(StartTriggerRequest startTriggerRequest);

    /**
     * <p>
     * Starts a new run of the specified workflow.
     * </p>
     * 
     * @param startWorkflowRunRequest
     * @return Result of the StartWorkflowRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws ConcurrentRunsExceededException
     *         Too many jobs are being run concurrently.
     * @sample AWSGlue.StartWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartWorkflowRunResult startWorkflowRun(StartWorkflowRunRequest startWorkflowRunRequest);

    /**
     * <p>
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @return Result of the StopCrawler operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerNotRunningException
     *         The specified crawler is not running.
     * @throws CrawlerStoppingException
     *         The specified crawler is stopping.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StopCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    StopCrawlerResult stopCrawler(StopCrawlerRequest stopCrawlerRequest);

    /**
     * <p>
     * Sets the schedule state of the specified crawler to <code>NOT_SCHEDULED</code>, but does not stop the crawler if
     * it is already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @return Result of the StopCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws SchedulerNotRunningException
     *         The specified scheduler is not running.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.StopCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    StopCrawlerScheduleResult stopCrawlerSchedule(StopCrawlerScheduleRequest stopCrawlerScheduleRequest);

    /**
     * <p>
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @return Result of the StopTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.StopTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    StopTriggerResult stopTrigger(StopTriggerRequest stopTriggerRequest);

    /**
     * <p>
     * Stops the execution of the specified workflow run.
     * </p>
     * 
     * @param stopWorkflowRunRequest
     * @return Result of the StopWorkflowRun operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws IllegalWorkflowStateException
     *         The workflow is in an invalid state to perform a requested operation.
     * @sample AWSGlue.StopWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    StopWorkflowRunResult stopWorkflowRun(StopWorkflowRunRequest stopWorkflowRunRequest);

    /**
     * <p>
     * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
     * certain resources. For information about what resources you can tag, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSGlue.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies an existing classifier (a <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
     * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which field is present).
     * </p>
     * 
     * @param updateClassifierRequest
     * @return Result of the UpdateClassifier operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClassifierResult updateClassifier(UpdateClassifierRequest updateClassifierRequest);

    /**
     * <p>
     * Creates or updates partition statistics of columns.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>UpdatePartition</code>.
     * </p>
     * 
     * @param updateColumnStatisticsForPartitionRequest
     * @return Result of the UpdateColumnStatisticsForPartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateColumnStatisticsForPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateColumnStatisticsForPartition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateColumnStatisticsForPartitionResult updateColumnStatisticsForPartition(
            UpdateColumnStatisticsForPartitionRequest updateColumnStatisticsForPartitionRequest);

    /**
     * <p>
     * Creates or updates table statistics of columns.
     * </p>
     * <p>
     * The Identity and Access Management (IAM) permission required for this operation is <code>UpdateTable</code>.
     * </p>
     * 
     * @param updateColumnStatisticsForTableRequest
     * @return Result of the UpdateColumnStatisticsForTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateColumnStatisticsForTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateColumnStatisticsForTable"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateColumnStatisticsForTableResult updateColumnStatisticsForTable(UpdateColumnStatisticsForTableRequest updateColumnStatisticsForTableRequest);

    /**
     * <p>
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return Result of the UpdateConnection operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateConnectionResult updateConnection(UpdateConnectionRequest updateConnectionRequest);

    /**
     * <p>
     * Updates a crawler. If a crawler is running, you must stop it using <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @return Result of the UpdateCrawler operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws CrawlerRunningException
     *         The operation cannot be performed because the crawler is already running.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCrawlerResult updateCrawler(UpdateCrawlerRequest updateCrawlerRequest);

    /**
     * <p>
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @return Result of the UpdateCrawlerSchedule operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws VersionMismatchException
     *         There was a version conflict.
     * @throws SchedulerTransitioningException
     *         The specified scheduler is transitioning.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSGlue.UpdateCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCrawlerScheduleResult updateCrawlerSchedule(UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest);

    /**
     * <p>
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return Result of the UpdateDatabase operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest updateDatabaseRequest);

    /**
     * <p>
     * Updates a specified development endpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @return Result of the UpdateDevEndpoint operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ValidationException
     *         A value could not be validated.
     * @sample AWSGlue.UpdateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDevEndpointResult updateDevEndpoint(UpdateDevEndpointRequest updateDevEndpointRequest);

    /**
     * <p>
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Updates an existing machine learning transform. Call this operation to tune the algorithm parameters to achieve
     * better results.
     * </p>
     * <p>
     * After calling this operation, you can call the <code>StartMLEvaluationTaskRun</code> operation to assess how well
     * your new parameters achieved your goals (such as improving the quality of your machine learning transform, or
     * making it more cost-effective).
     * </p>
     * 
     * @param updateMLTransformRequest
     * @return Result of the UpdateMLTransform operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSGlue.UpdateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMLTransformResult updateMLTransform(UpdateMLTransformRequest updateMLTransformRequest);

    /**
     * <p>
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @return Result of the UpdatePartition operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePartitionResult updatePartition(UpdatePartitionRequest updatePartitionRequest);

    /**
     * <p>
     * Updates an existing registry which is used to hold a collection of schemas. The updated properties relate to the
     * registry, and do not modify any of the schemas within the registry.
     * </p>
     * 
     * @param updateRegistryRequest
     * @return Result of the UpdateRegistry operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.UpdateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRegistryResult updateRegistry(UpdateRegistryRequest updateRegistryRequest);

    /**
     * <p>
     * Updates the description, compatibility setting, or version checkpoint for a schema set.
     * </p>
     * <p>
     * For updating the compatibility setting, the call will not validate compatibility for the entire set of schema
     * versions with the new compatibility setting. If the value for <code>Compatibility</code> is provided, the
     * <code>VersionNumber</code> (a checkpoint) is also required. The API will validate the checkpoint version number
     * for consistency.
     * </p>
     * <p>
     * If the value for the <code>VersionNumber</code> (checkpoint) is provided, <code>Compatibility</code> is optional
     * and this can be used to set/reset a checkpoint for the schema.
     * </p>
     * <p>
     * This update will happen only if the schema is in the AVAILABLE state.
     * </p>
     * 
     * @param updateSchemaRequest
     * @return Result of the UpdateSchema operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSGlue.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSchemaResult updateSchema(UpdateSchemaRequest updateSchemaRequest);

    /**
     * <p>
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @return Result of the UpdateTrigger operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.UpdateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTriggerResult updateTrigger(UpdateTriggerRequest updateTriggerRequest);

    /**
     * <p>
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @return Result of the UpdateUserDefinedFunction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @sample AWSGlue.UpdateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserDefinedFunctionResult updateUserDefinedFunction(UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest);

    /**
     * <p>
     * Updates an existing workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return Result of the UpdateWorkflow operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSGlue.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
