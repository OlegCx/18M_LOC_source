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
package com.amazonaws.services.imagebuilder;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.imagebuilder.model.*;

/**
 * Interface for accessing imagebuilder.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.imagebuilder.AbstractAWSimagebuilder} instead.
 * </p>
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to automate the creation, management, and
 * deployment of customized, secure, and up-to-date "golden" server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSimagebuilder {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "imagebuilder";

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal
     * state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return Result of the CancelImageCreation operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.CancelImageCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation"
     *      target="_top">AWS API Documentation</a>
     */
    CancelImageCreationResult cancelImageCreation(CancelImageCreationRequest cancelImageCreationRequest);

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS
     *      API Documentation</a>
     */
    CreateComponentResult createComponent(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a new container recipe. Container recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createContainerRecipeRequest
     * @return Result of the CreateContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerRecipeResult createContainerRecipe(CreateContainerRecipeRequest createContainerRecipeRequest);

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return Result of the CreateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDistributionConfigurationResult createDistributionConfiguration(CreateDistributionConfigurationRequest createDistributionConfigurationRequest);

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration.
     * </p>
     * 
     * @param createImageRequest
     * @return Result of the CreateImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return Result of the CreateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateImagePipelineResult createImagePipeline(CreateImagePipelineRequest createImagePipelineRequest);

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return Result of the CreateImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    CreateImageRecipeResult createImageRecipe(CreateImageRecipeRequest createImageRecipeRequest);

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return Result of the CreateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInfrastructureConfigurationResult createInfrastructureConfiguration(CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest);

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a container recipe.
     * </p>
     * 
     * @param deleteContainerRecipeRequest
     * @return Result of the DeleteContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerRecipeResult deleteContainerRecipe(DeleteContainerRecipeRequest deleteContainerRecipeRequest);

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return Result of the DeleteDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDistributionConfigurationResult deleteDistributionConfiguration(DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest);

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return Result of the DeleteImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteImagePipelineResult deleteImagePipeline(DeleteImagePipelineRequest deleteImagePipelineRequest);

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return Result of the DeleteImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteImageRecipeResult deleteImageRecipe(DeleteImageRecipeRequest deleteImageRecipeRequest);

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return Result of the DeleteInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInfrastructureConfigurationResult deleteInfrastructureConfiguration(DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest);

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return Result of the GetComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetComponentPolicyResult getComponentPolicy(GetComponentPolicyRequest getComponentPolicyRequest);

    /**
     * <p>
     * Retrieves a container recipe.
     * </p>
     * 
     * @param getContainerRecipeRequest
     * @return Result of the GetContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerRecipeResult getContainerRecipe(GetContainerRecipeRequest getContainerRecipeRequest);

    /**
     * <p>
     * Retrieves the policy for a container recipe.
     * </p>
     * 
     * @param getContainerRecipePolicyRequest
     * @return Result of the GetContainerRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetContainerRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetContainerRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerRecipePolicyResult getContainerRecipePolicy(GetContainerRecipePolicyRequest getContainerRecipePolicyRequest);

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return Result of the GetDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionConfigurationResult getDistributionConfiguration(GetDistributionConfigurationRequest getDistributionConfigurationRequest);

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return Result of the GetImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
     *      Documentation</a>
     */
    GetImageResult getImage(GetImageRequest getImageRequest);

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return Result of the GetImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    GetImagePipelineResult getImagePipeline(GetImagePipelineRequest getImagePipelineRequest);

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return Result of the GetImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetImagePolicyResult getImagePolicy(GetImagePolicyRequest getImagePolicyRequest);

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return Result of the GetImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    GetImageRecipeResult getImageRecipe(GetImageRecipeRequest getImageRecipeRequest);

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return Result of the GetImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetImageRecipePolicyResult getImageRecipePolicy(GetImageRecipePolicyRequest getImageRecipePolicyRequest);

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest
     *        GetInfrastructureConfiguration request object.
     * @return Result of the GetInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetInfrastructureConfigurationResult getInfrastructureConfiguration(GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest);

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return Result of the ImportComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.ImportComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportComponent" target="_top">AWS
     *      API Documentation</a>
     */
    ImportComponentResult importComponent(ImportComponentRequest importComponentRequest);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @return Result of the ListComponentBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponentBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentBuildVersionsResult listComponentBuildVersions(ListComponentBuildVersionsRequest listComponentBuildVersionsRequest);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Returns a list of container recipes.
     * </p>
     * 
     * @param listContainerRecipesRequest
     * @return Result of the ListContainerRecipes operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListContainerRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListContainerRecipes"
     *      target="_top">AWS API Documentation</a>
     */
    ListContainerRecipesResult listContainerRecipes(ListContainerRecipesRequest listContainerRecipesRequest);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return Result of the ListDistributionConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListDistributionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionConfigurationsResult listDistributionConfigurations(ListDistributionConfigurationsRequest listDistributionConfigurationsRequest);

    /**
     * <p>
     * Returns a list of image build versions.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return Result of the ListImageBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListImageBuildVersionsResult listImageBuildVersions(ListImageBuildVersionsRequest listImageBuildVersionsRequest);

    /**
     * <p>
     * List the Packages that are associated with an Image Build Version, as determined by AWS Systems Manager Inventory
     * at build time.
     * </p>
     * 
     * @param listImagePackagesRequest
     * @return Result of the ListImagePackages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePackages" target="_top">AWS
     *      API Documentation</a>
     */
    ListImagePackagesResult listImagePackages(ListImagePackagesRequest listImagePackagesRequest);

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return Result of the ListImagePipelineImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelineImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelineImages"
     *      target="_top">AWS API Documentation</a>
     */
    ListImagePipelineImagesResult listImagePipelineImages(ListImagePipelineImagesRequest listImagePipelineImagesRequest);

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return Result of the ListImagePipelines operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    ListImagePipelinesResult listImagePipelines(ListImagePipelinesRequest listImagePipelinesRequest);

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return Result of the ListImageRecipes operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageRecipes" target="_top">AWS
     *      API Documentation</a>
     */
    ListImageRecipesResult listImageRecipes(ListImageRecipesRequest listImageRecipesRequest);

    /**
     * <p>
     * Returns the list of images that you have access to.
     * </p>
     * 
     * @param listImagesRequest
     * @return Result of the ListImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return Result of the ListInfrastructureConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListInfrastructureConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListInfrastructureConfigurationsResult listInfrastructureConfigurations(ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest);

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Applies a policy to a component. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutComponentPolicy</code>, you must also call the RAM
     * API <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html">
     * PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom the
     * resource is shared.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return Result of the PutComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutComponentPolicyResult putComponentPolicy(PutComponentPolicyRequest putComponentPolicyRequest);

    /**
     * <p>
     * Applies a policy to a container image. We recommend that you call the RAM API CreateResourceShare
     * (https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html) to share resources. If you
     * call the Image Builder API <code>PutContainerImagePolicy</code>, you must also call the RAM API
     * PromoteResourceShareCreatedFromPolicy
     * (https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html) in order for
     * the resource to be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putContainerRecipePolicyRequest
     * @return Result of the PutContainerRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutContainerRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutContainerRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutContainerRecipePolicyResult putContainerRecipePolicy(PutContainerRecipePolicyRequest putContainerRecipePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutImagePolicy</code>, you must also call the RAM API
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html">
     * PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom the
     * resource is shared.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return Result of the PutImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutImagePolicyResult putImagePolicy(PutImagePolicyRequest putImagePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image recipe. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutImageRecipePolicy</code>, you must also call the
     * RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom
     * the resource is shared.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return Result of the PutImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutImageRecipePolicyResult putImageRecipePolicy(PutImageRecipePolicyRequest putImageRecipePolicyRequest);

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return Result of the StartImagePipelineExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.StartImagePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartImagePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartImagePipelineExecutionResult startImagePipelineExecution(StartImagePipelineExecutionRequest startImagePipelineExecutionRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return Result of the UpdateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.UpdateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDistributionConfigurationResult updateDistributionConfiguration(UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest);

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @return Result of the UpdateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateImagePipelineResult updateImagePipeline(UpdateImagePipelineRequest updateImagePipelineRequest);

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return Result of the UpdateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInfrastructureConfigurationResult updateInfrastructureConfiguration(UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest);

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
