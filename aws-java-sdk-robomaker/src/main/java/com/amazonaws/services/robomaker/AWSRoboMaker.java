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
package com.amazonaws.services.robomaker;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.robomaker.model.*;

/**
 * Interface for accessing RoboMaker.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.robomaker.AbstractAWSRoboMaker} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the AWS RoboMaker API operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoboMaker {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "robomaker";

    /**
     * <p>
     * Deletes one or more worlds in a batch operation.
     * </p>
     * 
     * @param batchDeleteWorldsRequest
     * @return Result of the BatchDeleteWorlds operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.BatchDeleteWorlds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDeleteWorlds" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteWorldsResult batchDeleteWorlds(BatchDeleteWorldsRequest batchDeleteWorldsRequest);

    /**
     * <p>
     * Describes one or more simulation jobs.
     * </p>
     * 
     * @param batchDescribeSimulationJobRequest
     * @return Result of the BatchDescribeSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.BatchDescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDescribeSimulationJobResult batchDescribeSimulationJob(BatchDescribeSimulationJobRequest batchDescribeSimulationJobRequest);

    /**
     * <p>
     * Cancels the specified deployment job.
     * </p>
     * 
     * @param cancelDeploymentJobRequest
     * @return Result of the CancelDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    CancelDeploymentJobResult cancelDeploymentJob(CancelDeploymentJobRequest cancelDeploymentJobRequest);

    /**
     * <p>
     * Cancels the specified simulation job.
     * </p>
     * 
     * @param cancelSimulationJobRequest
     * @return Result of the CancelSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSimulationJobResult cancelSimulationJob(CancelSimulationJobRequest cancelSimulationJobRequest);

    /**
     * <p>
     * Cancels a simulation job batch. When you cancel a simulation job batch, you are also cancelling all of the active
     * simulation jobs created as part of the batch.
     * </p>
     * 
     * @param cancelSimulationJobBatchRequest
     * @return Result of the CancelSimulationJobBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    CancelSimulationJobBatchResult cancelSimulationJobBatch(CancelSimulationJobBatchRequest cancelSimulationJobBatchRequest);

    /**
     * <p>
     * Cancels the specified export job.
     * </p>
     * 
     * @param cancelWorldExportJobRequest
     * @return Result of the CancelWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelWorldExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    CancelWorldExportJobResult cancelWorldExportJob(CancelWorldExportJobRequest cancelWorldExportJobRequest);

    /**
     * <p>
     * Cancels the specified world generator job.
     * </p>
     * 
     * @param cancelWorldGenerationJobRequest
     * @return Result of the CancelWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    CancelWorldGenerationJobResult cancelWorldGenerationJob(CancelWorldGenerationJobRequest cancelWorldGenerationJobRequest);

    /**
     * <p>
     * Deploys a specific version of a robot application to robots in a fleet.
     * </p>
     * <p>
     * The robot application must have a numbered <code>applicationVersion</code> for consistency reasons. To create a
     * new version, use <code>CreateRobotApplicationVersion</code> or see <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/create-robot-application-version.html">Creating a Robot
     * Application Version</a>.
     * </p>
     * <note>
     * <p>
     * After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createDeploymentJobRequest
     * @return Result of the CreateDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ConcurrentDeploymentException
     *         The failure percentage threshold percentage was met.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeploymentJobResult createDeploymentJob(CreateDeploymentJobRequest createDeploymentJobRequest);

    /**
     * <p>
     * Creates a fleet, a logical group of robots running the same robot application.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AWSRoboMaker.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a robot.
     * </p>
     * 
     * @param createRobotRequest
     * @return Result of the CreateRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AWSRoboMaker.CreateRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRobotResult createRobot(CreateRobotRequest createRobotRequest);

    /**
     * <p>
     * Creates a robot application.
     * </p>
     * 
     * @param createRobotApplicationRequest
     * @return Result of the CreateRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRobotApplicationResult createRobotApplication(CreateRobotApplicationRequest createRobotApplicationRequest);

    /**
     * <p>
     * Creates a version of a robot application.
     * </p>
     * 
     * @param createRobotApplicationVersionRequest
     * @return Result of the CreateRobotApplicationVersion operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateRobotApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRobotApplicationVersionResult createRobotApplicationVersion(CreateRobotApplicationVersionRequest createRobotApplicationVersionRequest);

    /**
     * <p>
     * Creates a simulation application.
     * </p>
     * 
     * @param createSimulationApplicationRequest
     * @return Result of the CreateSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSimulationApplicationResult createSimulationApplication(CreateSimulationApplicationRequest createSimulationApplicationRequest);

    /**
     * <p>
     * Creates a simulation application with a specific revision id.
     * </p>
     * 
     * @param createSimulationApplicationVersionRequest
     * @return Result of the CreateSimulationApplicationVersion operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateSimulationApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSimulationApplicationVersionResult createSimulationApplicationVersion(
            CreateSimulationApplicationVersionRequest createSimulationApplicationVersionRequest);

    /**
     * <p>
     * Creates a simulation job.
     * </p>
     * <note>
     * <p>
     * After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createSimulationJobRequest
     * @return Result of the CreateSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSimulationJobResult createSimulationJob(CreateSimulationJobRequest createSimulationJobRequest);

    /**
     * <p>
     * Creates a world export job.
     * </p>
     * 
     * @param createWorldExportJobRequest
     * @return Result of the CreateWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorldExportJobResult createWorldExportJob(CreateWorldExportJobRequest createWorldExportJobRequest);

    /**
     * <p>
     * Creates worlds using the specified template.
     * </p>
     * 
     * @param createWorldGenerationJobRequest
     * @return Result of the CreateWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorldGenerationJobResult createWorldGenerationJob(CreateWorldGenerationJobRequest createWorldGenerationJobRequest);

    /**
     * <p>
     * Creates a world template.
     * </p>
     * 
     * @param createWorldTemplateRequest
     * @return Result of the CreateWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorldTemplateResult createWorldTemplate(CreateWorldTemplateRequest createWorldTemplateRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a robot.
     * </p>
     * 
     * @param deleteRobotRequest
     * @return Result of the DeleteRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DeleteRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRobotResult deleteRobot(DeleteRobotRequest deleteRobotRequest);

    /**
     * <p>
     * Deletes a robot application.
     * </p>
     * 
     * @param deleteRobotApplicationRequest
     * @return Result of the DeleteRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRobotApplicationResult deleteRobotApplication(DeleteRobotApplicationRequest deleteRobotApplicationRequest);

    /**
     * <p>
     * Deletes a simulation application.
     * </p>
     * 
     * @param deleteSimulationApplicationRequest
     * @return Result of the DeleteSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSimulationApplicationResult deleteSimulationApplication(DeleteSimulationApplicationRequest deleteSimulationApplicationRequest);

    /**
     * <p>
     * Deletes a world template.
     * </p>
     * 
     * @param deleteWorldTemplateRequest
     * @return Result of the DeleteWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorldTemplateResult deleteWorldTemplate(DeleteWorldTemplateRequest deleteWorldTemplateRequest);

    /**
     * <p>
     * Deregisters a robot.
     * </p>
     * 
     * @param deregisterRobotRequest
     * @return Result of the DeregisterRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSRoboMaker.DeregisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeregisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    DeregisterRobotResult deregisterRobot(DeregisterRobotRequest deregisterRobotRequest);

    /**
     * <p>
     * Describes a deployment job.
     * </p>
     * 
     * @param describeDeploymentJobRequest
     * @return Result of the DescribeDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeDeploymentJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeploymentJobResult describeDeploymentJob(DescribeDeploymentJobRequest describeDeploymentJobRequest);

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param describeFleetRequest
     * @return Result of the DescribeFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetResult describeFleet(DescribeFleetRequest describeFleetRequest);

    /**
     * <p>
     * Describes a robot.
     * </p>
     * 
     * @param describeRobotRequest
     * @return Result of the DescribeRobot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobot" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRobotResult describeRobot(DescribeRobotRequest describeRobotRequest);

    /**
     * <p>
     * Describes a robot application.
     * </p>
     * 
     * @param describeRobotApplicationRequest
     * @return Result of the DescribeRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRobotApplicationResult describeRobotApplication(DescribeRobotApplicationRequest describeRobotApplicationRequest);

    /**
     * <p>
     * Describes a simulation application.
     * </p>
     * 
     * @param describeSimulationApplicationRequest
     * @return Result of the DescribeSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSimulationApplicationResult describeSimulationApplication(DescribeSimulationApplicationRequest describeSimulationApplicationRequest);

    /**
     * <p>
     * Describes a simulation job.
     * </p>
     * 
     * @param describeSimulationJobRequest
     * @return Result of the DescribeSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSimulationJobResult describeSimulationJob(DescribeSimulationJobRequest describeSimulationJobRequest);

    /**
     * <p>
     * Describes a simulation job batch.
     * </p>
     * 
     * @param describeSimulationJobBatchRequest
     * @return Result of the DescribeSimulationJobBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSimulationJobBatchResult describeSimulationJobBatch(DescribeSimulationJobBatchRequest describeSimulationJobBatchRequest);

    /**
     * <p>
     * Describes a world.
     * </p>
     * 
     * @param describeWorldRequest
     * @return Result of the DescribeWorld operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeWorld
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorld" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorldResult describeWorld(DescribeWorldRequest describeWorldRequest);

    /**
     * <p>
     * Describes a world export job.
     * </p>
     * 
     * @param describeWorldExportJobRequest
     * @return Result of the DescribeWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorldExportJobResult describeWorldExportJob(DescribeWorldExportJobRequest describeWorldExportJobRequest);

    /**
     * <p>
     * Describes a world generation job.
     * </p>
     * 
     * @param describeWorldGenerationJobRequest
     * @return Result of the DescribeWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorldGenerationJobResult describeWorldGenerationJob(DescribeWorldGenerationJobRequest describeWorldGenerationJobRequest);

    /**
     * <p>
     * Describes a world template.
     * </p>
     * 
     * @param describeWorldTemplateRequest
     * @return Result of the DescribeWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorldTemplateResult describeWorldTemplate(DescribeWorldTemplateRequest describeWorldTemplateRequest);

    /**
     * <p>
     * Gets the world template body.
     * </p>
     * 
     * @param getWorldTemplateBodyRequest
     * @return Result of the GetWorldTemplateBody operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.GetWorldTemplateBody
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/GetWorldTemplateBody" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorldTemplateBodyResult getWorldTemplateBody(GetWorldTemplateBodyRequest getWorldTemplateBodyRequest);

    /**
     * <p>
     * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
     * jobs.
     * </p>
     * 
     * @param listDeploymentJobsRequest
     * @return Result of the ListDeploymentJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListDeploymentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListDeploymentJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeploymentJobsResult listDeploymentJobs(ListDeploymentJobsRequest listDeploymentJobsRequest);

    /**
     * <p>
     * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
     * </p>
     * 
     * @param listRobotApplicationsRequest
     * @return Result of the ListRobotApplications operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListRobotApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobotApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListRobotApplicationsResult listRobotApplications(ListRobotApplicationsRequest listRobotApplicationsRequest);

    /**
     * <p>
     * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
     * </p>
     * 
     * @param listRobotsRequest
     * @return Result of the ListRobots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListRobots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobots" target="_top">AWS API
     *      Documentation</a>
     */
    ListRobotsResult listRobots(ListRobotsRequest listRobotsRequest);

    /**
     * <p>
     * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
     * applications.
     * </p>
     * 
     * @param listSimulationApplicationsRequest
     * @return Result of the ListSimulationApplications operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListSimulationApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListSimulationApplicationsResult listSimulationApplications(ListSimulationApplicationsRequest listSimulationApplicationsRequest);

    /**
     * <p>
     * Returns a list simulation job batches. You can optionally provide filters to retrieve specific simulation batch
     * jobs.
     * </p>
     * 
     * @param listSimulationJobBatchesRequest
     * @return Result of the ListSimulationJobBatches operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListSimulationJobBatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobBatches"
     *      target="_top">AWS API Documentation</a>
     */
    ListSimulationJobBatchesResult listSimulationJobBatches(ListSimulationJobBatchesRequest listSimulationJobBatchesRequest);

    /**
     * <p>
     * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
     * </p>
     * 
     * @param listSimulationJobsRequest
     * @return Result of the ListSimulationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListSimulationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListSimulationJobsResult listSimulationJobs(ListSimulationJobsRequest listSimulationJobsRequest);

    /**
     * <p>
     * Lists all tags on a AWS RoboMaker resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists world export jobs.
     * </p>
     * 
     * @param listWorldExportJobsRequest
     * @return Result of the ListWorldExportJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListWorldExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListWorldExportJobsResult listWorldExportJobs(ListWorldExportJobsRequest listWorldExportJobsRequest);

    /**
     * <p>
     * Lists world generator jobs.
     * </p>
     * 
     * @param listWorldGenerationJobsRequest
     * @return Result of the ListWorldGenerationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListWorldGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorldGenerationJobsResult listWorldGenerationJobs(ListWorldGenerationJobsRequest listWorldGenerationJobsRequest);

    /**
     * <p>
     * Lists world templates.
     * </p>
     * 
     * @param listWorldTemplatesRequest
     * @return Result of the ListWorldTemplates operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListWorldTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListWorldTemplatesResult listWorldTemplates(ListWorldTemplatesRequest listWorldTemplatesRequest);

    /**
     * <p>
     * Lists worlds.
     * </p>
     * 
     * @param listWorldsRequest
     * @return Result of the ListWorlds operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListWorlds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorlds" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorldsResult listWorlds(ListWorldsRequest listWorldsRequest);

    /**
     * <p>
     * Registers a robot with a fleet.
     * </p>
     * 
     * @param registerRobotRequest
     * @return Result of the RegisterRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSRoboMaker.RegisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RegisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterRobotResult registerRobot(RegisterRobotRequest registerRobotRequest);

    /**
     * <p>
     * Restarts a running simulation job.
     * </p>
     * 
     * @param restartSimulationJobRequest
     * @return Result of the RestartSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.RestartSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RestartSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    RestartSimulationJobResult restartSimulationJob(RestartSimulationJobRequest restartSimulationJobRequest);

    /**
     * <p>
     * Starts a new simulation job batch. The batch is defined using one or more <code>SimulationJobRequest</code>
     * objects.
     * </p>
     * 
     * @param startSimulationJobBatchRequest
     * @return Result of the StartSimulationJobBatch operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.StartSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/StartSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    StartSimulationJobBatchResult startSimulationJobBatch(StartSimulationJobBatchRequest startSimulationJobBatchRequest);

    /**
     * <p>
     * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
     * </p>
     * 
     * @param syncDeploymentJobRequest
     * @return Result of the SyncDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ConcurrentDeploymentException
     *         The failure percentage threshold percentage was met.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.SyncDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SyncDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    SyncDeploymentJobResult syncDeploymentJob(SyncDeploymentJobRequest syncDeploymentJobRequest);

    /**
     * <p>
     * Adds or edits tags for a AWS RoboMaker resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty strings.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified AWS RoboMaker resource.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an existing tag key, use <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/API_TagResource.html"> <code>TagResource</code> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a robot application.
     * </p>
     * 
     * @param updateRobotApplicationRequest
     * @return Result of the UpdateRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRobotApplicationResult updateRobotApplication(UpdateRobotApplicationRequest updateRobotApplicationRequest);

    /**
     * <p>
     * Updates a simulation application.
     * </p>
     * 
     * @param updateSimulationApplicationRequest
     * @return Result of the UpdateSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSimulationApplicationResult updateSimulationApplication(UpdateSimulationApplicationRequest updateSimulationApplicationRequest);

    /**
     * <p>
     * Updates a world template.
     * </p>
     * 
     * @param updateWorldTemplateRequest
     * @return Result of the UpdateWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWorldTemplateResult updateWorldTemplate(UpdateWorldTemplateRequest updateWorldTemplateRequest);

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
