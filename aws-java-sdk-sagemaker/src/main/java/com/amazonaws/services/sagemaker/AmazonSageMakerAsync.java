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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;

/**
 * Interface for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemaker.AbstractAmazonSageMakerAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 * <p>
 * Other Resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/whatis.html#first-time-user">Amazon SageMaker Developer
 * Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/augmented-ai/2019-11-07/APIReference/Welcome.html">Amazon Augmented AI Runtime
 * API Reference</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerAsync extends AmazonSageMaker {

    /**
     * <p>
     * Creates an <i>association</i> between the source and the destination. A source can be associated with multiple
     * destinations, and a destination can be associated with multiple sources. An association is a lineage tracking
     * entity. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param addAssociationRequest
     * @return A Java Future containing the result of the AddAssociation operation returned by the service.
     * @sample AmazonSageMakerAsync.AddAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddAssociationResult> addAssociationAsync(AddAssociationRequest addAssociationRequest);

    /**
     * <p>
     * Creates an <i>association</i> between the source and the destination. A source can be associated with multiple
     * destinations, and a destination can be associated with multiple sources. An association is a lineage tracking
     * entity. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param addAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddAssociation operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.AddAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddAssociationResult> addAssociationAsync(AddAssociationRequest addAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<AddAssociationRequest, AddAssociationResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
     * endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
     * hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
     * tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
     * tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
     * first create the tuning job by specifying them in the <code>Tags</code> parameter of
     * <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonSageMakerAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
     * endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
     * hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
     * tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
     * tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
     * first create the tuning job by specifying them in the <code>Tags</code> parameter of
     * <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be associated with multiple trials. To
     * disassociate a trial component from a trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @return A Java Future containing the result of the AssociateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.AssociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(AssociateTrialComponentRequest associateTrialComponentRequest);

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be associated with multiple trials. To
     * disassociate a trial component from a trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.AssociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(AssociateTrialComponentRequest associateTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTrialComponentRequest, AssociateTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Creates an <i>action</i>. An action is a lineage tracking entity that represents an action or activity. For
     * example, a model deployment or an HPO job. Generally, an action involves at least one input or output artifact.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon
     * SageMaker ML Lineage Tracking</a>.
     * </p>
     * 
     * @param createActionRequest
     * @return A Java Future containing the result of the CreateAction operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActionResult> createActionAsync(CreateActionRequest createActionRequest);

    /**
     * <p>
     * Creates an <i>action</i>. An action is a lineage tracking entity that represents an action or activity. For
     * example, a model deployment or an HPO job. Generally, an action involves at least one input or output artifact.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon
     * SageMaker ML Lineage Tracking</a>.
     * </p>
     * 
     * @param createActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAction operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActionResult> createActionAsync(CreateActionRequest createActionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActionRequest, CreateActionResult> asyncHandler);

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return A Java Future containing the result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest createAlgorithmRequest);

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest createAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAlgorithmRequest, CreateAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Creates a running app for the specified UserProfile. Supported apps are <code>JupyterServer</code> and
     * <code>KernelGateway</code>. This operation is automatically invoked by Amazon SageMaker Studio upon access to the
     * associated Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps
     * active simultaneously.
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a running app for the specified UserProfile. Supported apps are <code>JupyterServer</code> and
     * <code>KernelGateway</code>. This operation is automatically invoked by Amazon SageMaker Studio upon access to the
     * associated Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps
     * active simultaneously.
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration for running a SageMaker image as a KernelGateway app. The configuration specifies the
     * Amazon Elastic File System (EFS) storage volume on the image, and a list of the kernels in the image.
     * </p>
     * 
     * @param createAppImageConfigRequest
     * @return A Java Future containing the result of the CreateAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppImageConfigResult> createAppImageConfigAsync(CreateAppImageConfigRequest createAppImageConfigRequest);

    /**
     * <p>
     * Creates a configuration for running a SageMaker image as a KernelGateway app. The configuration specifies the
     * Amazon Elastic File System (EFS) storage volume on the image, and a list of the kernels in the image.
     * </p>
     * 
     * @param createAppImageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppImageConfigResult> createAppImageConfigAsync(CreateAppImageConfigRequest createAppImageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppImageConfigRequest, CreateAppImageConfigResult> asyncHandler);

    /**
     * <p>
     * Creates an <i>artifact</i>. An artifact is a lineage tracking entity that represents a URI addressable object or
     * data. Some examples are the S3 URI of a dataset and the ECR registry path of an image. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param createArtifactRequest
     * @return A Java Future containing the result of the CreateArtifact operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateArtifactResult> createArtifactAsync(CreateArtifactRequest createArtifactRequest);

    /**
     * <p>
     * Creates an <i>artifact</i>. An artifact is a lineage tracking entity that represents a URI addressable object or
     * data. Some examples are the S3 URI of a dataset and the ECR registry path of an image. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param createArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateArtifact operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateArtifactResult> createArtifactAsync(CreateArtifactRequest createArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<CreateArtifactRequest, CreateArtifactResult> asyncHandler);

    /**
     * <p>
     * Creates an Autopilot job.
     * </p>
     * <p>
     * Find the best performing model after you run an Autopilot job by calling .
     * </p>
     * <p>
     * For information about how to use Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development.html">Automate Model
     * Development with Amazon SageMaker Autopilot</a>.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @return A Java Future containing the result of the CreateAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(CreateAutoMLJobRequest createAutoMLJobRequest);

    /**
     * <p>
     * Creates an Autopilot job.
     * </p>
     * <p>
     * Find the best performing model after you run an Autopilot job by calling .
     * </p>
     * <p>
     * For information about how to use Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development.html">Automate Model
     * Development with Amazon SageMaker Autopilot</a>.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(CreateAutoMLJobRequest createAutoMLJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoMLJobRequest, CreateAutoMLJobResult> asyncHandler);

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return A Java Future containing the result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest createCodeRepositoryRequest);

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest createCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCodeRepositoryRequest, CreateCodeRepositoryResult> asyncHandler);

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
     * artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation
     * job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation job's resource use and costs. The response
     * body contains the <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get information about a particular model
     * compilation job, use <a>DescribeCompilationJob</a>. To get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @return A Java Future containing the result of the CreateCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest createCompilationJobRequest);

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
     * artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation
     * job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation job's resource use and costs. The response
     * body contains the <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get information about a particular model
     * compilation job, use <a>DescribeCompilationJob</a>. To get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest createCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCompilationJobRequest, CreateCompilationJobResult> asyncHandler);

    /**
     * <p>
     * Creates a <i>context</i>. A context is a lineage tracking entity that represents a logical grouping of other
     * tracking or experiment entities. Some examples are an endpoint and a model package. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param createContextRequest
     * @return A Java Future containing the result of the CreateContext operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContextResult> createContextAsync(CreateContextRequest createContextRequest);

    /**
     * <p>
     * Creates a <i>context</i>. A context is a lineage tracking entity that represents a logical grouping of other
     * tracking or experiment entities. Some examples are an endpoint and a model package. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking.html">Amazon SageMaker ML Lineage
     * Tracking</a>.
     * </p>
     * 
     * @param createContextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContext operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContextResult> createContextAsync(CreateContextRequest createContextRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContextRequest, CreateContextResult> asyncHandler);

    /**
     * <p>
     * Creates a definition for a job that monitors data quality and drift. For information about model monitor, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param createDataQualityJobDefinitionRequest
     * @return A Java Future containing the result of the CreateDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreateDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataQualityJobDefinitionResult> createDataQualityJobDefinitionAsync(
            CreateDataQualityJobDefinitionRequest createDataQualityJobDefinitionRequest);

    /**
     * <p>
     * Creates a definition for a job that monitors data quality and drift. For information about model monitor, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param createDataQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreateDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataQualityJobDefinitionResult> createDataQualityJobDefinitionAsync(
            CreateDataQualityJobDefinitionRequest createDataQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataQualityJobDefinitionRequest, CreateDataQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Creates a device fleet.
     * </p>
     * 
     * @param createDeviceFleetRequest
     * @return A Java Future containing the result of the CreateDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceFleetResult> createDeviceFleetAsync(CreateDeviceFleetRequest createDeviceFleetRequest);

    /**
     * <p>
     * Creates a device fleet.
     * </p>
     * 
     * @param createDeviceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceFleetResult> createDeviceFleetAsync(CreateDeviceFleetRequest createDeviceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeviceFleetRequest, CreateDeviceFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>Domain</code> used by Amazon SageMaker Studio. A domain consists of an associated Amazon Elastic
     * File System (EFS) volume, a list of authorized users, and a variety of security, application, policy, and Amazon
     * Virtual Private Cloud (VPC) configurations. An AWS account is limited to one domain per region. Users within a
     * domain can share notebook files and other artifacts with each other.
     * </p>
     * <p>
     * <b>EFS storage</b>
     * </p>
     * <p>
     * When a domain is created, an EFS volume is created for use by all of the users within the domain. Each user
     * receives a private home directory within the EFS volume for notebooks, Git repositories, and data files.
     * </p>
     * <p>
     * SageMaker uses the AWS Key Management Service (AWS KMS) to encrypt the EFS volume attached to the domain with an
     * AWS managed customer master key (CMK) by default. For more control, you can specify a customer managed CMK. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/encryption-at-rest.html">Protect
     * Data at Rest Using Encryption</a>.
     * </p>
     * <p>
     * <b>VPC configuration</b>
     * </p>
     * <p>
     * All SageMaker Studio traffic between the domain and the EFS volume is through the specified VPC and subnets. For
     * other Studio traffic, you can specify the <code>AppNetworkAccessType</code> parameter.
     * <code>AppNetworkAccessType</code> corresponds to the network access type that you choose when you onboard to
     * Studio. The following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which allows
     * internet access. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets. Internet access is disabled
     * by default. To allow internet access, you must specify a NAT gateway.
     * </p>
     * <p>
     * When internet access is disabled, you won't be able to run a Studio notebook or to train or host models unless
     * your VPC has an interface endpoint to the SageMaker API and runtime or a NAT gateway and your security groups
     * allow outbound connections.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/studio-notebooks-and-internet-access.html">Connect
     * SageMaker Studio Notebooks to Resources in a VPC</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a <code>Domain</code> used by Amazon SageMaker Studio. A domain consists of an associated Amazon Elastic
     * File System (EFS) volume, a list of authorized users, and a variety of security, application, policy, and Amazon
     * Virtual Private Cloud (VPC) configurations. An AWS account is limited to one domain per region. Users within a
     * domain can share notebook files and other artifacts with each other.
     * </p>
     * <p>
     * <b>EFS storage</b>
     * </p>
     * <p>
     * When a domain is created, an EFS volume is created for use by all of the users within the domain. Each user
     * receives a private home directory within the EFS volume for notebooks, Git repositories, and data files.
     * </p>
     * <p>
     * SageMaker uses the AWS Key Management Service (AWS KMS) to encrypt the EFS volume attached to the domain with an
     * AWS managed customer master key (CMK) by default. For more control, you can specify a customer managed CMK. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/encryption-at-rest.html">Protect
     * Data at Rest Using Encryption</a>.
     * </p>
     * <p>
     * <b>VPC configuration</b>
     * </p>
     * <p>
     * All SageMaker Studio traffic between the domain and the EFS volume is through the specified VPC and subnets. For
     * other Studio traffic, you can specify the <code>AppNetworkAccessType</code> parameter.
     * <code>AppNetworkAccessType</code> corresponds to the network access type that you choose when you onboard to
     * Studio. The following options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which allows
     * internet access. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets. Internet access is disabled
     * by default. To allow internet access, you must specify a NAT gateway.
     * </p>
     * <p>
     * When internet access is disabled, you won't be able to run a Studio notebook or to train or host models unless
     * your VPC has an interface endpoint to the SageMaker API and runtime or a NAT gateway and your security groups
     * allow outbound connections.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/studio-notebooks-and-internet-access.html">Connect
     * SageMaker Studio Notebooks to Resources in a VPC</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Starts a SageMaker Edge Manager model packaging job. Edge Manager will use the model artifacts from the Amazon
     * Simple Storage Service bucket that you specify. After the model has been packaged, Amazon SageMaker saves the
     * resulting artifacts to an S3 bucket that you specify.
     * </p>
     * 
     * @param createEdgePackagingJobRequest
     * @return A Java Future containing the result of the CreateEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEdgePackagingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEdgePackagingJobResult> createEdgePackagingJobAsync(CreateEdgePackagingJobRequest createEdgePackagingJobRequest);

    /**
     * <p>
     * Starts a SageMaker Edge Manager model packaging job. Edge Manager will use the model artifacts from the Amazon
     * Simple Storage Service bucket that you specify. After the model has been packaged, Amazon SageMaker saves the
     * resulting artifacts to an S3 bucket that you specify.
     * </p>
     * 
     * @param createEdgePackagingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEdgePackagingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEdgePackagingJobResult> createEdgePackagingJobAsync(CreateEdgePackagingJobRequest createEdgePackagingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEdgePackagingJobRequest, CreateEdgePackagingJobResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the
     * <a>CreateEndpointConfig</a> API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
     * instances), and deploys the model(s) on them.
     * </p>
     * <note>
     * <p>
     * When you call <a>CreateEndpoint</a>, a load call is made to DynamoDB to verify that your endpoint configuration
     * exists. When you read data from a DynamoDB table supporting <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html">
     * <code>Eventually Consistent Reads</code> </a>, the response might not reflect the results of a recently completed
     * write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB,
     * this causes a validation error. If you repeat your read request after a short time, the response should return
     * the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers
     * call <a>DescribeEndpointConfig</a> before calling <a>CreateEndpoint</a> to minimize the potential impact of a
     * DynamoDB eventually consistent read.
     * </p>
     * </note>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Creating</code>. After it
     * creates the endpoint, it sets the status to <code>InService</code>. Amazon SageMaker can then process incoming
     * requests for inferences. To check the status of an endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To add the IAM role policies for using this API operation, go to the <a
     * href="https://console.aws.amazon.com/iam/">IAM console</a>, and choose Roles in the left navigation pane. Search
     * the IAM role that you want to grant access to use the <a>CreateEndpoint</a> and <a>CreateEndpointConfig</a> API
     * operations, add the following policies to the role.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Option 1: For a full Amazon SageMaker access, search and attach the <code>AmazonSageMakerFullAccess</code>
     * policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Option 2: For granting a limited access to an IAM role, paste the following Action elements manually into the
     * JSON file of the IAM role:
     * </p>
     * <p>
     * <code>"Action": ["sagemaker:CreateEndpoint", "sagemaker:CreateEndpointConfig"]</code>
     * </p>
     * <p>
     * <code>"Resource": [</code>
     * </p>
     * <p>
     * <code>"arn:aws:sagemaker:region:account-id:endpoint/endpointName"</code>
     * </p>
     * <p>
     * <code>"arn:aws:sagemaker:region:account-id:endpoint-config/endpointConfigName"</code>
     * </p>
     * <p>
     * <code>]</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/api-permissions-reference.html">Amazon SageMaker API
     * Permissions: Actions, Permissions, and Resources Reference</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createEndpointRequest
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the
     * <a>CreateEndpointConfig</a> API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
     * instances), and deploys the model(s) on them.
     * </p>
     * <note>
     * <p>
     * When you call <a>CreateEndpoint</a>, a load call is made to DynamoDB to verify that your endpoint configuration
     * exists. When you read data from a DynamoDB table supporting <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html">
     * <code>Eventually Consistent Reads</code> </a>, the response might not reflect the results of a recently completed
     * write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB,
     * this causes a validation error. If you repeat your read request after a short time, the response should return
     * the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers
     * call <a>DescribeEndpointConfig</a> before calling <a>CreateEndpoint</a> to minimize the potential impact of a
     * DynamoDB eventually consistent read.
     * </p>
     * </note>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Creating</code>. After it
     * creates the endpoint, it sets the status to <code>InService</code>. Amazon SageMaker can then process incoming
     * requests for inferences. To check the status of an endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To add the IAM role policies for using this API operation, go to the <a
     * href="https://console.aws.amazon.com/iam/">IAM console</a>, and choose Roles in the left navigation pane. Search
     * the IAM role that you want to grant access to use the <a>CreateEndpoint</a> and <a>CreateEndpointConfig</a> API
     * operations, add the following policies to the role.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Option 1: For a full Amazon SageMaker access, search and attach the <code>AmazonSageMakerFullAccess</code>
     * policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Option 2: For granting a limited access to an IAM role, paste the following Action elements manually into the
     * JSON file of the IAM role:
     * </p>
     * <p>
     * <code>"Action": ["sagemaker:CreateEndpoint", "sagemaker:CreateEndpointConfig"]</code>
     * </p>
     * <p>
     * <code>"Resource": [</code>
     * </p>
     * <p>
     * <code>"arn:aws:sagemaker:region:account-id:endpoint/endpointName"</code>
     * </p>
     * <p>
     * <code>"arn:aws:sagemaker:region:account-id:endpoint-config/endpointConfigName"</code>
     * </p>
     * <p>
     * <code>]</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/api-permissions-reference.html">Amazon SageMaker API
     * Permissions: Actions, Permissions, and Resources Reference</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a>CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each model that you want to deploy. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * When you call <a>CreateEndpoint</a>, a load call is made to DynamoDB to verify that your endpoint configuration
     * exists. When you read data from a DynamoDB table supporting <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html">
     * <code>Eventually Consistent Reads</code> </a>, the response might not reflect the results of a recently completed
     * write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB,
     * this causes a validation error. If you repeat your read request after a short time, the response should return
     * the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers
     * call <a>DescribeEndpointConfig</a> before calling <a>CreateEndpoint</a> to minimize the potential impact of a
     * DynamoDB eventually consistent read.
     * </p>
     * </note>
     * 
     * @param createEndpointConfigRequest
     * @return A Java Future containing the result of the CreateEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest createEndpointConfigRequest);

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a>CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each model that you want to deploy. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * When you call <a>CreateEndpoint</a>, a load call is made to DynamoDB to verify that your endpoint configuration
     * exists. When you read data from a DynamoDB table supporting <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html">
     * <code>Eventually Consistent Reads</code> </a>, the response might not reflect the results of a recently completed
     * write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB,
     * this causes a validation error. If you repeat your read request after a short time, the response should return
     * the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers
     * call <a>DescribeEndpointConfig</a> before calling <a>CreateEndpoint</a> to minimize the potential impact of a
     * DynamoDB eventually consistent read.
     * </p>
     * </note>
     * 
     * @param createEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest createEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Creates an SageMaker <i>experiment</i>. An experiment is a collection of <i>trials</i> that are observed,
     * compared and evaluated as a group. A trial is a set of steps, called <i>trial components</i>, that produce a
     * machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the best model. Multiple trials are
     * performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use the <a>Search</a> API to search for the
     * tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional <code>Description</code> parameter. To add a
     * description later, or to change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a> API. To view an experiment's properties,
     * call the <a>DescribeExperiment</a> API. To get a list of all the trials associated with an experiment, call the
     * <a>ListTrials</a> API. To create a trial call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @return A Java Future containing the result of the CreateExperiment operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest createExperimentRequest);

    /**
     * <p>
     * Creates an SageMaker <i>experiment</i>. An experiment is a collection of <i>trials</i> that are observed,
     * compared and evaluated as a group. A trial is a set of steps, called <i>trial components</i>, that produce a
     * machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the best model. Multiple trials are
     * performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use the <a>Search</a> API to search for the
     * tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional <code>Description</code> parameter. To add a
     * description later, or to change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a> API. To view an experiment's properties,
     * call the <a>DescribeExperiment</a> API. To get a list of all the trials associated with an experiment, call the
     * <a>ListTrials</a> API. To create a trial call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExperiment operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest createExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExperimentRequest, CreateExperimentResult> asyncHandler);

    /**
     * <p>
     * Create a new <code>FeatureGroup</code>. A <code>FeatureGroup</code> is a group of <code>Features</code> defined
     * in the <code>FeatureStore</code> to describe a <code>Record</code>.
     * </p>
     * <p>
     * The <code>FeatureGroup</code> defines the schema and features contained in the FeatureGroup. A
     * <code>FeatureGroup</code> definition is composed of a list of <code>Features</code>, a
     * <code>RecordIdentifierFeatureName</code>, an <code>EventTimeFeatureName</code> and configurations for its
     * <code>OnlineStore</code> and <code>OfflineStore</code>. Check <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS service quotas</a> to see the
     * <code>FeatureGroup</code>s quota for your AWS account.
     * </p>
     * <important>
     * <p>
     * You must include at least one of <code>OnlineStoreConfig</code> and <code>OfflineStoreConfig</code> to create a
     * <code>FeatureGroup</code>.
     * </p>
     * </important>
     * 
     * @param createFeatureGroupRequest
     * @return A Java Future containing the result of the CreateFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFeatureGroupResult> createFeatureGroupAsync(CreateFeatureGroupRequest createFeatureGroupRequest);

    /**
     * <p>
     * Create a new <code>FeatureGroup</code>. A <code>FeatureGroup</code> is a group of <code>Features</code> defined
     * in the <code>FeatureStore</code> to describe a <code>Record</code>.
     * </p>
     * <p>
     * The <code>FeatureGroup</code> defines the schema and features contained in the FeatureGroup. A
     * <code>FeatureGroup</code> definition is composed of a list of <code>Features</code>, a
     * <code>RecordIdentifierFeatureName</code>, an <code>EventTimeFeatureName</code> and configurations for its
     * <code>OnlineStore</code> and <code>OfflineStore</code>. Check <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS service quotas</a> to see the
     * <code>FeatureGroup</code>s quota for your AWS account.
     * </p>
     * <important>
     * <p>
     * You must include at least one of <code>OnlineStoreConfig</code> and <code>OfflineStoreConfig</code> to create a
     * <code>FeatureGroup</code>.
     * </p>
     * </important>
     * 
     * @param createFeatureGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFeatureGroupResult> createFeatureGroupAsync(CreateFeatureGroupRequest createFeatureGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFeatureGroupRequest, CreateFeatureGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @return A Java Future containing the result of the CreateFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(CreateFlowDefinitionRequest createFlowDefinitionRequest);

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(CreateFlowDefinitionRequest createFlowDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowDefinitionRequest, CreateFlowDefinitionResult> asyncHandler);

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel
     * interface with an instruction area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @return A Java Future containing the result of the CreateHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(CreateHumanTaskUiRequest createHumanTaskUiRequest);

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel
     * interface with an instruction area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(CreateHumanTaskUiRequest createHumanTaskUiRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHumanTaskUiRequest, CreateHumanTaskUiResult> asyncHandler);

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest);

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHyperParameterTuningJobRequest, CreateHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Creates a custom SageMaker image. A SageMaker image is a set of image versions. Each image version represents a
     * container image stored in Amazon Container Registry (ECR). For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html">Bring your own SageMaker image</a>.
     * </p>
     * 
     * @param createImageRequest
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Creates a custom SageMaker image. A SageMaker image is a set of image versions. Each image version represents a
     * container image stored in Amazon Container Registry (ECR). For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html">Bring your own SageMaker image</a>.
     * </p>
     * 
     * @param createImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler);

    /**
     * <p>
     * Creates a version of the SageMaker image specified by <code>ImageName</code>. The version represents the Amazon
     * Container Registry (ECR) container image specified by <code>BaseImage</code>.
     * </p>
     * 
     * @param createImageVersionRequest
     * @return A Java Future containing the result of the CreateImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageVersionResult> createImageVersionAsync(CreateImageVersionRequest createImageVersionRequest);

    /**
     * <p>
     * Creates a version of the SageMaker image specified by <code>ImageName</code>. The version represents the Amazon
     * Container Registry (ECR) container image specified by <code>BaseImage</code>.
     * </p>
     * 
     * @param createImageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageVersionResult> createImageVersionAsync(CreateImageVersionRequest createImageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageVersionRequest, CreateImageVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
     * train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
     * workforce when want the data to stay within your organization or when a specific set of skills is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
     * or data that has been stripped of any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of data objects that need to be labeled by a
     * human. Automated data labeling uses <i>active learning</i> to determine if a data object can be labeled by
     * machine or if it needs to be sent to a human worker. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * <p>
     * You can use this operation to create a static labeling job or a streaming labeling job. A static labeling job
     * stops if all data objects in the input manifest file identified in <code>ManifestS3Uri</code> have been labeled.
     * A streaming labeling job runs perpetually until it is manually stopped, or remains idle for 10 days. You can send
     * new data objects to an active (<code>InProgress</code>) streaming labeling job in real time. To learn how to
     * create a static labeling job, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-create-labeling-job-api.html">Create a Labeling Job
     * (API) </a> in the Amazon SageMaker Developer Guide. To learn how to create a streaming labeling job, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-create-job.html">Create a Streaming Labeling
     * Job</a>.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return A Java Future containing the result of the CreateLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest createLabelingJobRequest);

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
     * train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
     * workforce when want the data to stay within your organization or when a specific set of skills is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
     * or data that has been stripped of any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of data objects that need to be labeled by a
     * human. Automated data labeling uses <i>active learning</i> to determine if a data object can be labeled by
     * machine or if it needs to be sent to a human worker. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * <p>
     * You can use this operation to create a static labeling job or a streaming labeling job. A static labeling job
     * stops if all data objects in the input manifest file identified in <code>ManifestS3Uri</code> have been labeled.
     * A streaming labeling job runs perpetually until it is manually stopped, or remains idle for 10 days. You can send
     * new data objects to an active (<code>InProgress</code>) streaming labeling job in real time. To learn how to
     * create a static labeling job, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-create-labeling-job-api.html">Create a Labeling Job
     * (API) </a> in the Amazon SageMaker Developer Guide. To learn how to create a streaming labeling job, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-create-job.html">Create a Streaming Labeling
     * Job</a>.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest createLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLabelingJobRequest, CreateLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the Docker image that contains inference code, artifacts (from prior training),
     * and a custom environment map that the inference code uses when you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the <code>CreateEndpointConfig</code> API, and then
     * create an endpoint with the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of the containers
     * that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the <code>CreateTransformJob</code> API. Amazon
     * SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with the <code>PrimaryContainer</code>
     * parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
     * use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
     * other AWS resources, you grant necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the Docker image that contains inference code, artifacts (from prior training),
     * and a custom environment map that the inference code uses when you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the <code>CreateEndpointConfig</code> API, and then
     * create an endpoint with the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of the containers
     * that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the <code>CreateTransformJob</code> API. Amazon
     * SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with the <code>PrimaryContainer</code>
     * parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
     * use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
     * other AWS resources, you grant necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates the definition for a model bias job.
     * </p>
     * 
     * @param createModelBiasJobDefinitionRequest
     * @return A Java Future containing the result of the CreateModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreateModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelBiasJobDefinitionResult> createModelBiasJobDefinitionAsync(
            CreateModelBiasJobDefinitionRequest createModelBiasJobDefinitionRequest);

    /**
     * <p>
     * Creates the definition for a model bias job.
     * </p>
     * 
     * @param createModelBiasJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelBiasJobDefinitionResult> createModelBiasJobDefinitionAsync(
            CreateModelBiasJobDefinitionRequest createModelBiasJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelBiasJobDefinitionRequest, CreateModelBiasJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Creates the definition for a model explainability job.
     * </p>
     * 
     * @param createModelExplainabilityJobDefinitionRequest
     * @return A Java Future containing the result of the CreateModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.CreateModelExplainabilityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelExplainabilityJobDefinitionResult> createModelExplainabilityJobDefinitionAsync(
            CreateModelExplainabilityJobDefinitionRequest createModelExplainabilityJobDefinitionRequest);

    /**
     * <p>
     * Creates the definition for a model explainability job.
     * </p>
     * 
     * @param createModelExplainabilityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelExplainabilityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelExplainabilityJobDefinitionResult> createModelExplainabilityJobDefinitionAsync(
            CreateModelExplainabilityJobDefinitionRequest createModelExplainabilityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelExplainabilityJobDefinitionRequest, CreateModelExplainabilityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace, or a
     * versioned model that is part of a model group. Buyers can subscribe to model packages listed on AWS Marketplace
     * to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
     * location of your model artifacts, provide values for <code>InferenceSpecification</code>. To create a model from
     * an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * <note>
     * <p>
     * There are two types of model packages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Versioned - a model that is part of a model group in the model registry.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unversioned - a model package that is not part of a model group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createModelPackageRequest
     * @return A Java Future containing the result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest createModelPackageRequest);

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace, or a
     * versioned model that is part of a model group. Buyers can subscribe to model packages listed on AWS Marketplace
     * to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
     * location of your model artifacts, provide values for <code>InferenceSpecification</code>. To create a model from
     * an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * <note>
     * <p>
     * There are two types of model packages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Versioned - a model that is part of a model group in the model registry.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unversioned - a model package that is not part of a model group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createModelPackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest createModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelPackageRequest, CreateModelPackageResult> asyncHandler);

    /**
     * <p>
     * Creates a model group. A model group contains a group of model versions.
     * </p>
     * 
     * @param createModelPackageGroupRequest
     * @return A Java Future containing the result of the CreateModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageGroupResult> createModelPackageGroupAsync(CreateModelPackageGroupRequest createModelPackageGroupRequest);

    /**
     * <p>
     * Creates a model group. A model group contains a group of model versions.
     * </p>
     * 
     * @param createModelPackageGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageGroupResult> createModelPackageGroupAsync(CreateModelPackageGroupRequest createModelPackageGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelPackageGroupRequest, CreateModelPackageGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a definition for a job that monitors model quality and drift. For information about model monitor, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param createModelQualityJobDefinitionRequest
     * @return A Java Future containing the result of the CreateModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreateModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelQualityJobDefinitionResult> createModelQualityJobDefinitionAsync(
            CreateModelQualityJobDefinitionRequest createModelQualityJobDefinitionRequest);

    /**
     * <p>
     * Creates a definition for a job that monitors model quality and drift. For information about model monitor, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param createModelQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelQualityJobDefinitionResult> createModelQualityJobDefinitionAsync(
            CreateModelQualityJobDefinitionRequest createModelQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelQualityJobDefinitionRequest, CreateModelQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an
     * Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @return A Java Future containing the result of the CreateMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(CreateMonitoringScheduleRequest createMonitoringScheduleRequest);

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an
     * Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(CreateMonitoringScheduleRequest createMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitoringScheduleRequest, CreateMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
     * running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML compute instance that you want to run.
     * Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
     * training, and attaches an ML storage volume to the notebook instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
     * with a specific algorithm or with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates a network interface in your own VPC,
     * which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
     * SageMaker attaches the security group that you specified in the request to the network interface that it creates
     * in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
     * <code>SubnetId</code> of your VPC, Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
     * groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change
     * the name of a notebook instance after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
     * notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
     * model, host models by creating Amazon SageMaker endpoints, and validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It
     * Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @return A Java Future containing the result of the CreateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest createNotebookInstanceRequest);

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
     * running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML compute instance that you want to run.
     * Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
     * training, and attaches an ML storage volume to the notebook instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
     * with a specific algorithm or with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates a network interface in your own VPC,
     * which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
     * SageMaker attaches the security group that you specified in the request to the network interface that it creates
     * in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
     * <code>SubnetId</code> of your VPC, Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
     * groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change
     * the name of a notebook instance after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
     * notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
     * model, host models by creating Amazon SageMaker endpoints, and validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It
     * Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest createNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook instance. A <i>lifecycle
     * configuration</i> is a collection of shell scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is available to both scripts is
     * <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in log group
     * <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
     * it fails and the notebook instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook instance. A <i>lifecycle
     * configuration</i> is a collection of shell scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is available to both scripts is
     * <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in log group
     * <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
     * it fails and the notebook instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceLifecycleConfigRequest, CreateNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a pipeline using a JSON pipeline definition.
     * </p>
     * 
     * @param createPipelineRequest
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonSageMakerAsync.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Creates a pipeline using a JSON pipeline definition.
     * </p>
     * 
     * @param createPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be
     * automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated
     * with the Domain's Amazon Elastic File System (EFS) volume. This operation can only be called when the
     * authentication mode equals IAM.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to <code>CreatePresignedDomainUrl</code> has a default timeout of 5 minutes. You
     * can configure this value using <code>ExpiresInSeconds</code>. If you try to use the URL after the timeout limit
     * expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedDomainUrlRequest
     * @return A Java Future containing the result of the CreatePresignedDomainUrl operation returned by the service.
     * @sample AmazonSageMakerAsync.CreatePresignedDomainUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedDomainUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest);

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be
     * automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated
     * with the Domain's Amazon Elastic File System (EFS) volume. This operation can only be called when the
     * authentication mode equals IAM.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to <code>CreatePresignedDomainUrl</code> has a default timeout of 5 minutes. You
     * can configure this value using <code>ExpiresInSeconds</code>. If you try to use the URL after the timeout limit
     * expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedDomainUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePresignedDomainUrl operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreatePresignedDomainUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedDomainUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedDomainUrlRequest, CreatePresignedDomainUrlResult> asyncHandler);

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * The IAM role or user used to call this API defines the permissions to access the notebook instance. Once the
     * presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for
     * this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook
     * instance.
     * </p>
     * <p>
     * You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify.
     * Use the <code>NotIpAddress</code> condition operator and the <code>aws:SourceIP</code> condition context key to
     * specify the list of IP addresses that you want to have access to the notebook instance. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to <a>CreatePresignedNotebookInstanceUrl</a> is valid only for 5 minutes. If you
     * try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest);

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * The IAM role or user used to call this API defines the permissions to access the notebook instance. Once the
     * presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for
     * this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook
     * instance.
     * </p>
     * <p>
     * You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify.
     * Use the <code>NotIpAddress</code> condition operator and the <code>aws:SourceIP</code> condition context key to
     * specify the list of IP addresses that you want to have access to the notebook instance. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to <a>CreatePresignedNotebookInstanceUrl</a> is valid only for 5 minutes. If you
     * try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler);

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @return A Java Future containing the result of the CreateProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(CreateProcessingJobRequest createProcessingJobRequest);

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(CreateProcessingJobRequest createProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProcessingJobRequest, CreateProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Creates a machine learning (ML) project that can contain one or more templates that set up an ML pipeline from
     * training to deploying an approved model.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a machine learning (ML) project that can contain one or more templates that set up an ML pipeline from
     * training to deploying an approved model.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
     * Amazon S3 location that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inference.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to enable the estimation of model
     * parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
     * hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the
     * results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute instances, and ML storage volumes to deploy
     * for model training. In distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training machine learning models by up to 80% by
     * using Amazon EC2 Spot instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleArn</code> - The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use <code>MaxRuntimeInSeconds</code> to set a time
     * limit for training. Use <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to wait for a
     * managed spot training job to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> - The environment variables to set in the Docker container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return A Java Future containing the result of the CreateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest createTrainingJobRequest);

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
     * Amazon S3 location that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inference.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to enable the estimation of model
     * parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
     * hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the
     * results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute instances, and ML storage volumes to deploy
     * for model training. In distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training machine learning models by up to 80% by
     * using Amazon EC2 Spot instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleArn</code> - The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use <code>MaxRuntimeInSeconds</code> to set a time
     * limit for training. Use <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to wait for a
     * managed spot training job to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> - The environment variables to set in the Docker container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest createTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
     * results to an Amazon S3 location that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name must be unique within an AWS Region in an
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use. <code>ModelName</code> must be the name of an existing
     * Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
     * <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and the Amazon S3 location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
     * results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return A Java Future containing the result of the CreateTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest createTransformJobRequest);

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
     * results to an Amazon S3 location that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name must be unique within an AWS Region in an
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use. <code>ModelName</code> must be the name of an existing
     * Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
     * <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and the Amazon S3 location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
     * results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest createTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTransformJobRequest, CreateTransformJobResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps called <i>trial components</i> that produce a
     * machine learning model. A trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view a trial's properties, call the
     * <a>DescribeTrial</a> API. To create a trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @return A Java Future containing the result of the CreateTrial operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrialResult> createTrialAsync(CreateTrialRequest createTrialRequest);

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps called <i>trial components</i> that produce a
     * machine learning model. A trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view a trial's properties, call the
     * <a>DescribeTrial</a> API. To create a trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrial operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrialResult> createTrialAsync(CreateTrialRequest createTrialRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrialRequest, CreateTrialResult> asyncHandler);

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning <i>trial</i>. A trial is composed of one
     * or more trial components. A trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an Amazon SageMaker managed environment. This
     * includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call
     * to <code>CreateTrialComponent</code> from outside one of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @return A Java Future containing the result of the CreateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(CreateTrialComponentRequest createTrialComponentRequest);

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning <i>trial</i>. A trial is composed of one
     * or more trial components. A trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an Amazon SageMaker managed environment. This
     * includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call
     * to <code>CreateTrialComponent</code> from outside one of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(CreateTrialComponentRequest createTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrialComponentRequest, CreateTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Creates a user profile. A user profile represents a single user within a domain, and is the main way to reference
     * a "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is created when
     * a user onboards to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from
     * SSO, a user profile is automatically created. A user profile is the primary holder of settings for an individual
     * user and has a reference to the user's private Amazon Elastic File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a user profile. A user profile represents a single user within a domain, and is the main way to reference
     * a "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is created when
     * a user onboards to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from
     * SSO, a user profile is automatically created. A user profile is the primary holder of settings for an individual
     * user and has a reference to the user's private Amazon Elastic File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Use this operation to create a workforce. This operation will return an error if a workforce already exists in
     * the AWS Region that you specify. You can only create one workforce in each AWS Region per AWS account.
     * </p>
     * <p>
     * If you want to create a new workforce in an AWS Region where a workforce already exists, use the API operation to
     * delete the existing workforce and then use <code>CreateWorkforce</code> to create a new workforce.
     * </p>
     * <p>
     * To create a private workforce using Amazon Cognito, you must specify a Cognito user pool in
     * <code>CognitoConfig</code>. You can also create an Amazon Cognito workforce using the Amazon SageMaker console.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"> Create a Private
     * Workforce (Amazon Cognito)</a>.
     * </p>
     * <p>
     * To create a private workforce using your own OIDC Identity Provider (IdP), specify your IdP configuration in
     * <code>OidcConfig</code>. Your OIDC IdP must support <i>groups</i> because groups are used by Ground Truth and
     * Amazon A2I to create work teams. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private-oidc.html"> Create a Private
     * Workforce (OIDC IdP)</a>.
     * </p>
     * 
     * @param createWorkforceRequest
     * @return A Java Future containing the result of the CreateWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkforceResult> createWorkforceAsync(CreateWorkforceRequest createWorkforceRequest);

    /**
     * <p>
     * Use this operation to create a workforce. This operation will return an error if a workforce already exists in
     * the AWS Region that you specify. You can only create one workforce in each AWS Region per AWS account.
     * </p>
     * <p>
     * If you want to create a new workforce in an AWS Region where a workforce already exists, use the API operation to
     * delete the existing workforce and then use <code>CreateWorkforce</code> to create a new workforce.
     * </p>
     * <p>
     * To create a private workforce using Amazon Cognito, you must specify a Cognito user pool in
     * <code>CognitoConfig</code>. You can also create an Amazon Cognito workforce using the Amazon SageMaker console.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"> Create a Private
     * Workforce (Amazon Cognito)</a>.
     * </p>
     * <p>
     * To create a private workforce using your own OIDC Identity Provider (IdP), specify your IdP configuration in
     * <code>OidcConfig</code>. Your OIDC IdP must support <i>groups</i> because groups are used by Ground Truth and
     * Amazon A2I to create work teams. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private-oidc.html"> Create a Private
     * Workforce (OIDC IdP)</a>.
     * </p>
     * 
     * @param createWorkforceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkforceResult> createWorkforceAsync(CreateWorkforceRequest createWorkforceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkforceRequest, CreateWorkforceResult> asyncHandler);

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
     * You must first create the user pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @return A Java Future containing the result of the CreateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest createWorkteamRequest);

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
     * You must first create the user pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest createWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkteamRequest, CreateWorkteamResult> asyncHandler);

    /**
     * <p>
     * Deletes an action.
     * </p>
     * 
     * @param deleteActionRequest
     * @return A Java Future containing the result of the DeleteAction operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionResult> deleteActionAsync(DeleteActionRequest deleteActionRequest);

    /**
     * <p>
     * Deletes an action.
     * </p>
     * 
     * @param deleteActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAction operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionResult> deleteActionAsync(DeleteActionRequest deleteActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActionRequest, DeleteActionResult> asyncHandler);

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @return A Java Future containing the result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest deleteAlgorithmRequest);

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest deleteAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlgorithmRequest, DeleteAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes an AppImageConfig.
     * </p>
     * 
     * @param deleteAppImageConfigRequest
     * @return A Java Future containing the result of the DeleteAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppImageConfigResult> deleteAppImageConfigAsync(DeleteAppImageConfigRequest deleteAppImageConfigRequest);

    /**
     * <p>
     * Deletes an AppImageConfig.
     * </p>
     * 
     * @param deleteAppImageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppImageConfigResult> deleteAppImageConfigAsync(DeleteAppImageConfigRequest deleteAppImageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppImageConfigRequest, DeleteAppImageConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes an artifact. Either <code>ArtifactArn</code> or <code>Source</code> must be specified.
     * </p>
     * 
     * @param deleteArtifactRequest
     * @return A Java Future containing the result of the DeleteArtifact operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteArtifactResult> deleteArtifactAsync(DeleteArtifactRequest deleteArtifactRequest);

    /**
     * <p>
     * Deletes an artifact. Either <code>ArtifactArn</code> or <code>Source</code> must be specified.
     * </p>
     * 
     * @param deleteArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteArtifact operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteArtifactResult> deleteArtifactAsync(DeleteArtifactRequest deleteArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteArtifactRequest, DeleteArtifactResult> asyncHandler);

    /**
     * <p>
     * Deletes an association.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Deletes an association.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @return A Java Future containing the result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest);

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCodeRepositoryRequest, DeleteCodeRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes an context.
     * </p>
     * 
     * @param deleteContextRequest
     * @return A Java Future containing the result of the DeleteContext operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContextResult> deleteContextAsync(DeleteContextRequest deleteContextRequest);

    /**
     * <p>
     * Deletes an context.
     * </p>
     * 
     * @param deleteContextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContext operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContextResult> deleteContextAsync(DeleteContextRequest deleteContextRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContextRequest, DeleteContextResult> asyncHandler);

    /**
     * <p>
     * Deletes a data quality monitoring job definition.
     * </p>
     * 
     * @param deleteDataQualityJobDefinitionRequest
     * @return A Java Future containing the result of the DeleteDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DeleteDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataQualityJobDefinitionResult> deleteDataQualityJobDefinitionAsync(
            DeleteDataQualityJobDefinitionRequest deleteDataQualityJobDefinitionRequest);

    /**
     * <p>
     * Deletes a data quality monitoring job definition.
     * </p>
     * 
     * @param deleteDataQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DeleteDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataQualityJobDefinitionResult> deleteDataQualityJobDefinitionAsync(
            DeleteDataQualityJobDefinitionRequest deleteDataQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataQualityJobDefinitionRequest, DeleteDataQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteDeviceFleetRequest
     * @return A Java Future containing the result of the DeleteDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceFleetResult> deleteDeviceFleetAsync(DeleteDeviceFleetRequest deleteDeviceFleetRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteDeviceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceFleetResult> deleteDeviceFleetAsync(DeleteDeviceFleetRequest deleteDeviceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceFleetRequest, DeleteDeviceFleetResult> asyncHandler);

    /**
     * <p>
     * Used to delete a domain. If you onboarded with IAM mode, you will need to delete your domain to onboard again
     * using SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Used to delete a domain. If you onboarded with IAM mode, you will need to delete your domain to onboard again
     * using SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
     * created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
     * created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. If you
     * delete the <code>EndpointConfig</code> of an endpoint that is active or being created or updated you may lose
     * visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring
     * charges.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @return A Java Future containing the result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest deleteEndpointConfigRequest);

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. If you
     * delete the <code>EndpointConfig</code> of an endpoint that is active or being created or updated you may lose
     * visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring
     * charges.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest deleteEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the
     * <a>ListTrials</a> API to get a list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return A Java Future containing the result of the DeleteExperiment operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest deleteExperimentRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the
     * <a>ListTrials</a> API to get a list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExperiment operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest deleteExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResult> asyncHandler);

    /**
     * <p>
     * Delete the <code>FeatureGroup</code> and any data that was written to the <code>OnlineStore</code> of the
     * <code>FeatureGroup</code>. Data cannot be accessed from the <code>OnlineStore</code> immediately after
     * <code>DeleteFeatureGroup</code> is called.
     * </p>
     * <p>
     * Data written into the <code>OfflineStore</code> will not be deleted. The AWS Glue database and tables that are
     * automatically created for your <code>OfflineStore</code> are not deleted.
     * </p>
     * 
     * @param deleteFeatureGroupRequest
     * @return A Java Future containing the result of the DeleteFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFeatureGroupResult> deleteFeatureGroupAsync(DeleteFeatureGroupRequest deleteFeatureGroupRequest);

    /**
     * <p>
     * Delete the <code>FeatureGroup</code> and any data that was written to the <code>OnlineStore</code> of the
     * <code>FeatureGroup</code>. Data cannot be accessed from the <code>OnlineStore</code> immediately after
     * <code>DeleteFeatureGroup</code> is called.
     * </p>
     * <p>
     * Data written into the <code>OfflineStore</code> will not be deleted. The AWS Glue database and tables that are
     * automatically created for your <code>OfflineStore</code> are not deleted.
     * </p>
     * 
     * @param deleteFeatureGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFeatureGroupResult> deleteFeatureGroupAsync(DeleteFeatureGroupRequest deleteFeatureGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFeatureGroupRequest, DeleteFeatureGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @return A Java Future containing the result of the DeleteFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(DeleteFlowDefinitionRequest deleteFlowDefinitionRequest);

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(DeleteFlowDefinitionRequest deleteFlowDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowDefinitionRequest, DeleteFlowDefinitionResult> asyncHandler);

    /**
     * <p>
     * Use this operation to delete a human task user interface (worker task template).
     * </p>
     * <p>
     * To see a list of human task user interfaces (work task templates) in your account, use . When you delete a worker
     * task template, it no longer appears when you call <code>ListHumanTaskUis</code>.
     * </p>
     * 
     * @param deleteHumanTaskUiRequest
     * @return A Java Future containing the result of the DeleteHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHumanTaskUiResult> deleteHumanTaskUiAsync(DeleteHumanTaskUiRequest deleteHumanTaskUiRequest);

    /**
     * <p>
     * Use this operation to delete a human task user interface (worker task template).
     * </p>
     * <p>
     * To see a list of human task user interfaces (work task templates) in your account, use . When you delete a worker
     * task template, it no longer appears when you call <code>ListHumanTaskUis</code>.
     * </p>
     * 
     * @param deleteHumanTaskUiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHumanTaskUiResult> deleteHumanTaskUiAsync(DeleteHumanTaskUiRequest deleteHumanTaskUiRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHumanTaskUiRequest, DeleteHumanTaskUiResult> asyncHandler);

    /**
     * <p>
     * Deletes a SageMaker image and all versions of the image. The container images aren't deleted.
     * </p>
     * 
     * @param deleteImageRequest
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes a SageMaker image and all versions of the image. The container images aren't deleted.
     * </p>
     * 
     * @param deleteImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of a SageMaker image. The container image the version represents isn't deleted.
     * </p>
     * 
     * @param deleteImageVersionRequest
     * @return A Java Future containing the result of the DeleteImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageVersionResult> deleteImageVersionAsync(DeleteImageVersionRequest deleteImageVersionRequest);

    /**
     * <p>
     * Deletes a version of a SageMaker image. The container image the version represents isn't deleted.
     * </p>
     * 
     * @param deleteImageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageVersionResult> deleteImageVersionAsync(DeleteImageVersionRequest deleteImageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageVersionRequest, DeleteImageVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a>CreateModel</a> API. It does not delete model artifacts, inference code, or the
     * IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a>CreateModel</a> API. It does not delete model artifacts, inference code, or the
     * IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon SageMaker model bias job definition.
     * </p>
     * 
     * @param deleteModelBiasJobDefinitionRequest
     * @return A Java Future containing the result of the DeleteModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DeleteModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelBiasJobDefinitionResult> deleteModelBiasJobDefinitionAsync(
            DeleteModelBiasJobDefinitionRequest deleteModelBiasJobDefinitionRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker model bias job definition.
     * </p>
     * 
     * @param deleteModelBiasJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelBiasJobDefinitionResult> deleteModelBiasJobDefinitionAsync(
            DeleteModelBiasJobDefinitionRequest deleteModelBiasJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelBiasJobDefinitionRequest, DeleteModelBiasJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon SageMaker model explainability job definition.
     * </p>
     * 
     * @param deleteModelExplainabilityJobDefinitionRequest
     * @return A Java Future containing the result of the DeleteModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DeleteModelExplainabilityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelExplainabilityJobDefinitionResult> deleteModelExplainabilityJobDefinitionAsync(
            DeleteModelExplainabilityJobDefinitionRequest deleteModelExplainabilityJobDefinitionRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker model explainability job definition.
     * </p>
     * 
     * @param deleteModelExplainabilityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelExplainabilityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelExplainabilityJobDefinitionResult> deleteModelExplainabilityJobDefinitionAsync(
            DeleteModelExplainabilityJobDefinitionRequest deleteModelExplainabilityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelExplainabilityJobDefinitionRequest, DeleteModelExplainabilityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
     * model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @return A Java Future containing the result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest deleteModelPackageRequest);

    /**
     * <p>
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
     * model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest deleteModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelPackageRequest, DeleteModelPackageResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified model group.
     * </p>
     * 
     * @param deleteModelPackageGroupRequest
     * @return A Java Future containing the result of the DeleteModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageGroupResult> deleteModelPackageGroupAsync(DeleteModelPackageGroupRequest deleteModelPackageGroupRequest);

    /**
     * <p>
     * Deletes the specified model group.
     * </p>
     * 
     * @param deleteModelPackageGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageGroupResult> deleteModelPackageGroupAsync(DeleteModelPackageGroupRequest deleteModelPackageGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelPackageGroupRequest, DeleteModelPackageGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a model group resource policy.
     * </p>
     * 
     * @param deleteModelPackageGroupPolicyRequest
     * @return A Java Future containing the result of the DeleteModelPackageGroupPolicy operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DeleteModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageGroupPolicyResult> deleteModelPackageGroupPolicyAsync(
            DeleteModelPackageGroupPolicyRequest deleteModelPackageGroupPolicyRequest);

    /**
     * <p>
     * Deletes a model group resource policy.
     * </p>
     * 
     * @param deleteModelPackageGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelPackageGroupPolicy operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageGroupPolicyResult> deleteModelPackageGroupPolicyAsync(
            DeleteModelPackageGroupPolicyRequest deleteModelPackageGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelPackageGroupPolicyRequest, DeleteModelPackageGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the secified model quality monitoring job definition.
     * </p>
     * 
     * @param deleteModelQualityJobDefinitionRequest
     * @return A Java Future containing the result of the DeleteModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DeleteModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelQualityJobDefinitionResult> deleteModelQualityJobDefinitionAsync(
            DeleteModelQualityJobDefinitionRequest deleteModelQualityJobDefinitionRequest);

    /**
     * <p>
     * Deletes the secified model quality monitoring job definition.
     * </p>
     * 
     * @param deleteModelQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelQualityJobDefinitionResult> deleteModelQualityJobDefinitionAsync(
            DeleteModelQualityJobDefinitionRequest deleteModelQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelQualityJobDefinitionRequest, DeleteModelQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job
     * execution history of the monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @return A Java Future containing the result of the DeleteMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest);

    /**
     * <p>
     * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job
     * execution history of the monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitoringScheduleRequest, DeleteMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
     * <code>StopNotebookInstance</code> API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
     * and deletes the ML storage volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @return A Java Future containing the result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
     * <code>StopNotebookInstance</code> API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
     * and deletes the ML storage volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceLifecycleConfigRequest, DeleteNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a pipeline if there are no in-progress executions.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonSageMakerAsync.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes a pipeline if there are no in-progress executions.
     * </p>
     * 
     * @param deletePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * Delete the specified project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Delete the specified project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
     * training jobs that the hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
     * training jobs that the hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the
     * <a>DescribeTrialComponent</a> API to get the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @return A Java Future containing the result of the DeleteTrial operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(DeleteTrialRequest deleteTrialRequest);

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the
     * <a>DescribeTrialComponent</a> API to get the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrial operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(DeleteTrialRequest deleteTrialRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrialRequest, DeleteTrialResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial
     * component can be deleted. To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @return A Java Future containing the result of the DeleteTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(DeleteTrialComponentRequest deleteTrialComponentRequest);

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial
     * component can be deleted. To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(DeleteTrialComponentRequest deleteTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrialComponentRequest, DeleteTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Deletes a user profile. When a user profile is deleted, the user loses access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Deletes a user profile. When a user profile is deleted, the user loses access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler);

    /**
     * <p>
     * Use this operation to delete a workforce.
     * </p>
     * <p>
     * If you want to create a new workforce in an AWS Region where a workforce already exists, use this operation to
     * delete the existing workforce and then use to create a new workforce.
     * </p>
     * <important>
     * <p>
     * If a private workforce contains one or more work teams, you must use the operation to delete all work teams
     * before you delete the workforce. If you try to delete a workforce that contains one or more work teams, you will
     * recieve a <code>ResourceInUse</code> error.
     * </p>
     * </important>
     * 
     * @param deleteWorkforceRequest
     * @return A Java Future containing the result of the DeleteWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkforceResult> deleteWorkforceAsync(DeleteWorkforceRequest deleteWorkforceRequest);

    /**
     * <p>
     * Use this operation to delete a workforce.
     * </p>
     * <p>
     * If you want to create a new workforce in an AWS Region where a workforce already exists, use this operation to
     * delete the existing workforce and then use to create a new workforce.
     * </p>
     * <important>
     * <p>
     * If a private workforce contains one or more work teams, you must use the operation to delete all work teams
     * before you delete the workforce. If you try to delete a workforce that contains one or more work teams, you will
     * recieve a <code>ResourceInUse</code> error.
     * </p>
     * </important>
     * 
     * @param deleteWorkforceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkforceResult> deleteWorkforceAsync(DeleteWorkforceRequest deleteWorkforceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkforceRequest, DeleteWorkforceResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return A Java Future containing the result of the DeleteWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest deleteWorkteamRequest);

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest deleteWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkteamRequest, DeleteWorkteamResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified devices. After you deregister a device, you will need to re-register the devices.
     * </p>
     * 
     * @param deregisterDevicesRequest
     * @return A Java Future containing the result of the DeregisterDevices operation returned by the service.
     * @sample AmazonSageMakerAsync.DeregisterDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeregisterDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDevicesResult> deregisterDevicesAsync(DeregisterDevicesRequest deregisterDevicesRequest);

    /**
     * <p>
     * Deregisters the specified devices. After you deregister a device, you will need to re-register the devices.
     * </p>
     * 
     * @param deregisterDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterDevices operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeregisterDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeregisterDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDevicesResult> deregisterDevicesAsync(DeregisterDevicesRequest deregisterDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterDevicesRequest, DeregisterDevicesResult> asyncHandler);

    /**
     * <p>
     * Describes an action.
     * </p>
     * 
     * @param describeActionRequest
     * @return A Java Future containing the result of the DescribeAction operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionResult> describeActionAsync(DescribeActionRequest describeActionRequest);

    /**
     * <p>
     * Describes an action.
     * </p>
     * 
     * @param describeActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAction operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionResult> describeActionAsync(DescribeActionRequest describeActionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActionRequest, DescribeActionResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest);

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler);

    /**
     * <p>
     * Describes an AppImageConfig.
     * </p>
     * 
     * @param describeAppImageConfigRequest
     * @return A Java Future containing the result of the DescribeAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAppImageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppImageConfigResult> describeAppImageConfigAsync(DescribeAppImageConfigRequest describeAppImageConfigRequest);

    /**
     * <p>
     * Describes an AppImageConfig.
     * </p>
     * 
     * @param describeAppImageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAppImageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppImageConfigResult> describeAppImageConfigAsync(DescribeAppImageConfigRequest describeAppImageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppImageConfigRequest, DescribeAppImageConfigResult> asyncHandler);

    /**
     * <p>
     * Describes an artifact.
     * </p>
     * 
     * @param describeArtifactRequest
     * @return A Java Future containing the result of the DescribeArtifact operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeArtifactResult> describeArtifactAsync(DescribeArtifactRequest describeArtifactRequest);

    /**
     * <p>
     * Describes an artifact.
     * </p>
     * 
     * @param describeArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeArtifact operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeArtifactResult> describeArtifactAsync(DescribeArtifactRequest describeArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeArtifactRequest, DescribeArtifactResult> asyncHandler);

    /**
     * <p>
     * Returns information about an Amazon SageMaker AutoML job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @return A Java Future containing the result of the DescribeAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(DescribeAutoMLJobRequest describeAutoMLJobRequest);

    /**
     * <p>
     * Returns information about an Amazon SageMaker AutoML job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(DescribeAutoMLJobRequest describeAutoMLJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoMLJobRequest, DescribeAutoMLJobResult> asyncHandler);

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return A Java Future containing the result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest describeCodeRepositoryRequest);

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest describeCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCodeRepositoryRequest, DescribeCodeRepositoryResult> asyncHandler);

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @return A Java Future containing the result of the DescribeCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest describeCompilationJobRequest);

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest describeCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCompilationJobRequest, DescribeCompilationJobResult> asyncHandler);

    /**
     * <p>
     * Describes a context.
     * </p>
     * 
     * @param describeContextRequest
     * @return A Java Future containing the result of the DescribeContext operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeContextResult> describeContextAsync(DescribeContextRequest describeContextRequest);

    /**
     * <p>
     * Describes a context.
     * </p>
     * 
     * @param describeContextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContext operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeContextResult> describeContextAsync(DescribeContextRequest describeContextRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContextRequest, DescribeContextResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a data quality monitoring job definition.
     * </p>
     * 
     * @param describeDataQualityJobDefinitionRequest
     * @return A Java Future containing the result of the DescribeDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DescribeDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataQualityJobDefinitionResult> describeDataQualityJobDefinitionAsync(
            DescribeDataQualityJobDefinitionRequest describeDataQualityJobDefinitionRequest);

    /**
     * <p>
     * Gets the details of a data quality monitoring job definition.
     * </p>
     * 
     * @param describeDataQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DescribeDataQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDataQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataQualityJobDefinitionResult> describeDataQualityJobDefinitionAsync(
            DescribeDataQualityJobDefinitionRequest describeDataQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataQualityJobDefinitionRequest, DescribeDataQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Describes the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler);

    /**
     * <p>
     * A description of the fleet the device belongs to.
     * </p>
     * 
     * @param describeDeviceFleetRequest
     * @return A Java Future containing the result of the DescribeDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceFleetResult> describeDeviceFleetAsync(DescribeDeviceFleetRequest describeDeviceFleetRequest);

    /**
     * <p>
     * A description of the fleet the device belongs to.
     * </p>
     * 
     * @param describeDeviceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceFleetResult> describeDeviceFleetAsync(DescribeDeviceFleetRequest describeDeviceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceFleetRequest, DescribeDeviceFleetResult> asyncHandler);

    /**
     * <p>
     * The description of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * The description of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

    /**
     * <p>
     * A description of edge packaging jobs.
     * </p>
     * 
     * @param describeEdgePackagingJobRequest
     * @return A Java Future containing the result of the DescribeEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEdgePackagingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEdgePackagingJobResult> describeEdgePackagingJobAsync(DescribeEdgePackagingJobRequest describeEdgePackagingJobRequest);

    /**
     * <p>
     * A description of edge packaging jobs.
     * </p>
     * 
     * @param describeEdgePackagingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEdgePackagingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEdgePackagingJobResult> describeEdgePackagingJobAsync(DescribeEdgePackagingJobRequest describeEdgePackagingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEdgePackagingJobRequest, DescribeEdgePackagingJobResult> asyncHandler);

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return A Java Future containing the result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest describeEndpointConfigRequest);

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest describeEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @return A Java Future containing the result of the DescribeExperiment operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeExperiment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(DescribeExperimentRequest describeExperimentRequest);

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExperiment operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeExperiment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(DescribeExperimentRequest describeExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExperimentRequest, DescribeExperimentResult> asyncHandler);

    /**
     * <p>
     * Use this operation to describe a <code>FeatureGroup</code>. The response includes information on the creation
     * time, <code>FeatureGroup</code> name, the unique identifier for each <code>FeatureGroup</code>, and more.
     * </p>
     * 
     * @param describeFeatureGroupRequest
     * @return A Java Future containing the result of the DescribeFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeatureGroupResult> describeFeatureGroupAsync(DescribeFeatureGroupRequest describeFeatureGroupRequest);

    /**
     * <p>
     * Use this operation to describe a <code>FeatureGroup</code>. The response includes information on the creation
     * time, <code>FeatureGroup</code> name, the unique identifier for each <code>FeatureGroup</code>, and more.
     * </p>
     * 
     * @param describeFeatureGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFeatureGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeFeatureGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeatureGroupResult> describeFeatureGroupAsync(DescribeFeatureGroupRequest describeFeatureGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFeatureGroupRequest, DescribeFeatureGroupResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @return A Java Future containing the result of the DescribeFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFlowDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(DescribeFlowDefinitionRequest describeFlowDefinitionRequest);

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFlowDefinition operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFlowDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(DescribeFlowDefinitionRequest describeFlowDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowDefinitionRequest, DescribeFlowDefinitionResult> asyncHandler);

    /**
     * <p>
     * Returns information about the requested human task user interface (worker task template).
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @return A Java Future containing the result of the DescribeHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(DescribeHumanTaskUiRequest describeHumanTaskUiRequest);

    /**
     * <p>
     * Returns information about the requested human task user interface (worker task template).
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHumanTaskUi operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(DescribeHumanTaskUiRequest describeHumanTaskUiRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHumanTaskUiRequest, DescribeHumanTaskUiResult> asyncHandler);

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest);

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHyperParameterTuningJobRequest, DescribeHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Describes a SageMaker image.
     * </p>
     * 
     * @param describeImageRequest
     * @return A Java Future containing the result of the DescribeImage operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageResult> describeImageAsync(DescribeImageRequest describeImageRequest);

    /**
     * <p>
     * Describes a SageMaker image.
     * </p>
     * 
     * @param describeImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageResult> describeImageAsync(DescribeImageRequest describeImageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageRequest, DescribeImageResult> asyncHandler);

    /**
     * <p>
     * Describes a version of a SageMaker image.
     * </p>
     * 
     * @param describeImageVersionRequest
     * @return A Java Future containing the result of the DescribeImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageVersionResult> describeImageVersionAsync(DescribeImageVersionRequest describeImageVersionRequest);

    /**
     * <p>
     * Describes a version of a SageMaker image.
     * </p>
     * 
     * @param describeImageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageVersion operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeImageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImageVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageVersionResult> describeImageVersionAsync(DescribeImageVersionRequest describeImageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageVersionRequest, DescribeImageVersionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return A Java Future containing the result of the DescribeLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest describeLabelingJobRequest);

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest describeLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLabelingJobRequest, DescribeLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler);

    /**
     * <p>
     * Returns a description of a model bias job definition.
     * </p>
     * 
     * @param describeModelBiasJobDefinitionRequest
     * @return A Java Future containing the result of the DescribeModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DescribeModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelBiasJobDefinitionResult> describeModelBiasJobDefinitionAsync(
            DescribeModelBiasJobDefinitionRequest describeModelBiasJobDefinitionRequest);

    /**
     * <p>
     * Returns a description of a model bias job definition.
     * </p>
     * 
     * @param describeModelBiasJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelBiasJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelBiasJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelBiasJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelBiasJobDefinitionResult> describeModelBiasJobDefinitionAsync(
            DescribeModelBiasJobDefinitionRequest describeModelBiasJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelBiasJobDefinitionRequest, DescribeModelBiasJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Returns a description of a model explainability job definition.
     * </p>
     * 
     * @param describeModelExplainabilityJobDefinitionRequest
     * @return A Java Future containing the result of the DescribeModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DescribeModelExplainabilityJobDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelExplainabilityJobDefinitionResult> describeModelExplainabilityJobDefinitionAsync(
            DescribeModelExplainabilityJobDefinitionRequest describeModelExplainabilityJobDefinitionRequest);

    /**
     * <p>
     * Returns a description of a model explainability job definition.
     * </p>
     * 
     * @param describeModelExplainabilityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelExplainabilityJobDefinition operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelExplainabilityJobDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelExplainabilityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelExplainabilityJobDefinitionResult> describeModelExplainabilityJobDefinitionAsync(
            DescribeModelExplainabilityJobDefinitionRequest describeModelExplainabilityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelExplainabilityJobDefinitionRequest, DescribeModelExplainabilityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
     * them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @return A Java Future containing the result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest describeModelPackageRequest);

    /**
     * <p>
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
     * them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest describeModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelPackageRequest, DescribeModelPackageResult> asyncHandler);

    /**
     * <p>
     * Gets a description for the specified model group.
     * </p>
     * 
     * @param describeModelPackageGroupRequest
     * @return A Java Future containing the result of the DescribeModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageGroupResult> describeModelPackageGroupAsync(
            DescribeModelPackageGroupRequest describeModelPackageGroupRequest);

    /**
     * <p>
     * Gets a description for the specified model group.
     * </p>
     * 
     * @param describeModelPackageGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelPackageGroup operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageGroupResult> describeModelPackageGroupAsync(
            DescribeModelPackageGroupRequest describeModelPackageGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelPackageGroupRequest, DescribeModelPackageGroupResult> asyncHandler);

    /**
     * <p>
     * Returns a description of a model quality job definition.
     * </p>
     * 
     * @param describeModelQualityJobDefinitionRequest
     * @return A Java Future containing the result of the DescribeModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DescribeModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelQualityJobDefinitionResult> describeModelQualityJobDefinitionAsync(
            DescribeModelQualityJobDefinitionRequest describeModelQualityJobDefinitionRequest);

    /**
     * <p>
     * Returns a description of a model quality job definition.
     * </p>
     * 
     * @param describeModelQualityJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelQualityJobDefinition operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelQualityJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelQualityJobDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelQualityJobDefinitionResult> describeModelQualityJobDefinitionAsync(
            DescribeModelQualityJobDefinitionRequest describeModelQualityJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelQualityJobDefinitionRequest, DescribeModelQualityJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @return A Java Future containing the result of the DescribeMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(
            DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest);

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(
            DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMonitoringScheduleRequest, DescribeMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return A Java Future containing the result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest describeNotebookInstanceRequest);

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest describeNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceLifecycleConfigRequest, DescribeNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @return A Java Future containing the result of the DescribePipeline operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest describePipelineRequest);

    /**
     * <p>
     * Describes the details of a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipeline operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest describePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipelineRequest, DescribePipelineResult> asyncHandler);

    /**
     * <p>
     * Describes the details of an execution's pipeline definition.
     * </p>
     * 
     * @param describePipelineDefinitionForExecutionRequest
     * @return A Java Future containing the result of the DescribePipelineDefinitionForExecution operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DescribePipelineDefinitionForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipelineDefinitionForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineDefinitionForExecutionResult> describePipelineDefinitionForExecutionAsync(
            DescribePipelineDefinitionForExecutionRequest describePipelineDefinitionForExecutionRequest);

    /**
     * <p>
     * Describes the details of an execution's pipeline definition.
     * </p>
     * 
     * @param describePipelineDefinitionForExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipelineDefinitionForExecution operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DescribePipelineDefinitionForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipelineDefinitionForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineDefinitionForExecutionResult> describePipelineDefinitionForExecutionAsync(
            DescribePipelineDefinitionForExecutionRequest describePipelineDefinitionForExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipelineDefinitionForExecutionRequest, DescribePipelineDefinitionForExecutionResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a pipeline execution.
     * </p>
     * 
     * @param describePipelineExecutionRequest
     * @return A Java Future containing the result of the DescribePipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineExecutionResult> describePipelineExecutionAsync(
            DescribePipelineExecutionRequest describePipelineExecutionRequest);

    /**
     * <p>
     * Describes the details of a pipeline execution.
     * </p>
     * 
     * @param describePipelineExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineExecutionResult> describePipelineExecutionAsync(
            DescribePipelineExecutionRequest describePipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipelineExecutionRequest, DescribePipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @return A Java Future containing the result of the DescribeProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(DescribeProcessingJobRequest describeProcessingJobRequest);

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(DescribeProcessingJobRequest describeProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProcessingJobRequest, DescribeProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Describes the details of a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest);

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscribedWorkteamRequest, DescribeSubscribedWorkteamResult> asyncHandler);

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * <p>
     * Some of the attributes below only appear if the training job successfully starts. If the training job fails,
     * <code>TrainingJobStatus</code> is <code>Failed</code> and, depending on the <code>FailureReason</code>,
     * attributes like <code>TrainingStartTime</code>, <code>TrainingTimeInSeconds</code>, <code>TrainingEndTime</code>,
     * and <code>BillableTimeInSeconds</code> may not be present in the response.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return A Java Future containing the result of the DescribeTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest describeTrainingJobRequest);

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * <p>
     * Some of the attributes below only appear if the training job successfully starts. If the training job fails,
     * <code>TrainingJobStatus</code> is <code>Failed</code> and, depending on the <code>FailureReason</code>,
     * attributes like <code>TrainingStartTime</code>, <code>TrainingTimeInSeconds</code>, <code>TrainingEndTime</code>,
     * and <code>BillableTimeInSeconds</code> may not be present in the response.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest describeTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return A Java Future containing the result of the DescribeTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest describeTransformJobRequest);

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest describeTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTransformJobRequest, DescribeTransformJobResult> asyncHandler);

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @return A Java Future containing the result of the DescribeTrial operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(DescribeTrialRequest describeTrialRequest);

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrial operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(DescribeTrialRequest describeTrialRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrialRequest, DescribeTrialResult> asyncHandler);

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @return A Java Future containing the result of the DescribeTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(DescribeTrialComponentRequest describeTrialComponentRequest);

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(DescribeTrialComponentRequest describeTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrialComponentRequest, DescribeTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Describes a user profile. For more information, see <code>CreateUserProfile</code>.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return A Java Future containing the result of the DescribeUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest describeUserProfileRequest);

    /**
     * <p>
     * Describes a user profile. For more information, see <code>CreateUserProfile</code>.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest describeUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserProfileRequest, DescribeUserProfileResult> asyncHandler);

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable,
     * allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>). Allowable IP address ranges
     * are the IP addresses that workers can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @return A Java Future containing the result of the DescribeWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkforce" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(DescribeWorkforceRequest describeWorkforceRequest);

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable,
     * allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>). Allowable IP address ranges
     * are the IP addresses that workers can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkforce" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(DescribeWorkforceRequest describeWorkforceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkforceRequest, DescribeWorkforceResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return A Java Future containing the result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest describeWorkteamRequest);

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest describeWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkteamRequest, DescribeWorkteamResult> asyncHandler);

    /**
     * <p>
     * Disables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param disableSagemakerServicecatalogPortfolioRequest
     * @return A Java Future containing the result of the DisableSagemakerServicecatalogPortfolio operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DisableSagemakerServicecatalogPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisableSagemakerServicecatalogPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableSagemakerServicecatalogPortfolioResult> disableSagemakerServicecatalogPortfolioAsync(
            DisableSagemakerServicecatalogPortfolioRequest disableSagemakerServicecatalogPortfolioRequest);

    /**
     * <p>
     * Disables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param disableSagemakerServicecatalogPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSagemakerServicecatalogPortfolio operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DisableSagemakerServicecatalogPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisableSagemakerServicecatalogPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableSagemakerServicecatalogPortfolioResult> disableSagemakerServicecatalogPortfolioAsync(
            DisableSagemakerServicecatalogPortfolioRequest disableSagemakerServicecatalogPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSagemakerServicecatalogPortfolioRequest, DisableSagemakerServicecatalogPortfolioResult> asyncHandler);

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with.
     * Before you can delete a component, you must disassociate the component from all trials it is associated with. To
     * associate a trial component with a trial, call the <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the <a>Search</a> API. Specify
     * <code>ExperimentTrialComponent</code> for the <code>Resource</code> parameter. The list appears in the response
     * under <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @return A Java Future containing the result of the DisassociateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.DisassociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisassociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(
            DisassociateTrialComponentRequest disassociateTrialComponentRequest);

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with.
     * Before you can delete a component, you must disassociate the component from all trials it is associated with. To
     * associate a trial component with a trial, call the <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the <a>Search</a> API. Specify
     * <code>ExperimentTrialComponent</code> for the <code>Resource</code> parameter. The list appears in the response
     * under <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DisassociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisassociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(
            DisassociateTrialComponentRequest disassociateTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTrialComponentRequest, DisassociateTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Enables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param enableSagemakerServicecatalogPortfolioRequest
     * @return A Java Future containing the result of the EnableSagemakerServicecatalogPortfolio operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.EnableSagemakerServicecatalogPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EnableSagemakerServicecatalogPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableSagemakerServicecatalogPortfolioResult> enableSagemakerServicecatalogPortfolioAsync(
            EnableSagemakerServicecatalogPortfolioRequest enableSagemakerServicecatalogPortfolioRequest);

    /**
     * <p>
     * Enables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param enableSagemakerServicecatalogPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSagemakerServicecatalogPortfolio operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.EnableSagemakerServicecatalogPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EnableSagemakerServicecatalogPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableSagemakerServicecatalogPortfolioResult> enableSagemakerServicecatalogPortfolioAsync(
            EnableSagemakerServicecatalogPortfolioRequest enableSagemakerServicecatalogPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSagemakerServicecatalogPortfolioRequest, EnableSagemakerServicecatalogPortfolioResult> asyncHandler);

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param getDeviceFleetReportRequest
     * @return A Java Future containing the result of the GetDeviceFleetReport operation returned by the service.
     * @sample AmazonSageMakerAsync.GetDeviceFleetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetDeviceFleetReport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceFleetReportResult> getDeviceFleetReportAsync(GetDeviceFleetReportRequest getDeviceFleetReportRequest);

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param getDeviceFleetReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceFleetReport operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.GetDeviceFleetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetDeviceFleetReport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceFleetReportResult> getDeviceFleetReportAsync(GetDeviceFleetReportRequest getDeviceFleetReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceFleetReportRequest, GetDeviceFleetReportResult> asyncHandler);

    /**
     * <p>
     * Gets a resource policy that manages access for a model group. For information about resource policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies</a> in the <i>AWS Identity and Access Management User Guide.</i>.
     * </p>
     * 
     * @param getModelPackageGroupPolicyRequest
     * @return A Java Future containing the result of the GetModelPackageGroupPolicy operation returned by the service.
     * @sample AmazonSageMakerAsync.GetModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelPackageGroupPolicyResult> getModelPackageGroupPolicyAsync(
            GetModelPackageGroupPolicyRequest getModelPackageGroupPolicyRequest);

    /**
     * <p>
     * Gets a resource policy that manages access for a model group. For information about resource policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies</a> in the <i>AWS Identity and Access Management User Guide.</i>.
     * </p>
     * 
     * @param getModelPackageGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelPackageGroupPolicy operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.GetModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelPackageGroupPolicyResult> getModelPackageGroupPolicyAsync(
            GetModelPackageGroupPolicyRequest getModelPackageGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelPackageGroupPolicyRequest, GetModelPackageGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets the status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param getSagemakerServicecatalogPortfolioStatusRequest
     * @return A Java Future containing the result of the GetSagemakerServicecatalogPortfolioStatus operation returned
     *         by the service.
     * @sample AmazonSageMakerAsync.GetSagemakerServicecatalogPortfolioStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSagemakerServicecatalogPortfolioStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSagemakerServicecatalogPortfolioStatusResult> getSagemakerServicecatalogPortfolioStatusAsync(
            GetSagemakerServicecatalogPortfolioStatusRequest getSagemakerServicecatalogPortfolioStatusRequest);

    /**
     * <p>
     * Gets the status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
     * </p>
     * 
     * @param getSagemakerServicecatalogPortfolioStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSagemakerServicecatalogPortfolioStatus operation returned
     *         by the service.
     * @sample AmazonSageMakerAsyncHandler.GetSagemakerServicecatalogPortfolioStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSagemakerServicecatalogPortfolioStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSagemakerServicecatalogPortfolioStatusResult> getSagemakerServicecatalogPortfolioStatusAsync(
            GetSagemakerServicecatalogPortfolioStatusRequest getSagemakerServicecatalogPortfolioStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetSagemakerServicecatalogPortfolioStatusRequest, GetSagemakerServicecatalogPortfolioStatusResult> asyncHandler);

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return A Java Future containing the result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMakerAsync.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest getSearchSuggestionsRequest);

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest getSearchSuggestionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSearchSuggestionsRequest, GetSearchSuggestionsResult> asyncHandler);

    /**
     * <p>
     * Lists the actions in your account and their properties.
     * </p>
     * 
     * @param listActionsRequest
     * @return A Java Future containing the result of the ListActions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest listActionsRequest);

    /**
     * <p>
     * Lists the actions in your account and their properties.
     * </p>
     * 
     * @param listActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest listActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListActionsRequest, ListActionsResult> asyncHandler);

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return A Java Future containing the result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMakerAsync.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest listAlgorithmsRequest);

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest listAlgorithmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlgorithmsRequest, ListAlgorithmsResult> asyncHandler);

    /**
     * <p>
     * Lists the AppImageConfigs in your account and their properties. The list can be filtered by creation time or
     * modified time, and whether the AppImageConfig name contains a specified string.
     * </p>
     * 
     * @param listAppImageConfigsRequest
     * @return A Java Future containing the result of the ListAppImageConfigs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListAppImageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAppImageConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppImageConfigsResult> listAppImageConfigsAsync(ListAppImageConfigsRequest listAppImageConfigsRequest);

    /**
     * <p>
     * Lists the AppImageConfigs in your account and their properties. The list can be filtered by creation time or
     * modified time, and whether the AppImageConfig name contains a specified string.
     * </p>
     * 
     * @param listAppImageConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppImageConfigs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListAppImageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAppImageConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppImageConfigsResult> listAppImageConfigsAsync(ListAppImageConfigsRequest listAppImageConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppImageConfigsRequest, ListAppImageConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AmazonSageMakerAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler);

    /**
     * <p>
     * Lists the artifacts in your account and their properties.
     * </p>
     * 
     * @param listArtifactsRequest
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AmazonSageMakerAsync.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Lists the artifacts in your account and their properties.
     * </p>
     * 
     * @param listArtifactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler);

    /**
     * <p>
     * Lists the associations in your account and their properties.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AmazonSageMakerAsync.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * Lists the associations in your account and their properties.
     * </p>
     * 
     * @param listAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler);

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @return A Java Future containing the result of the ListAutoMLJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListAutoMLJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(ListAutoMLJobsRequest listAutoMLJobsRequest);

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAutoMLJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListAutoMLJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(ListAutoMLJobsRequest listAutoMLJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAutoMLJobsRequest, ListAutoMLJobsResult> asyncHandler);

    /**
     * <p>
     * List the candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @return A Java Future containing the result of the ListCandidatesForAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsync.ListCandidatesForAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(
            ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest);

    /**
     * <p>
     * List the candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCandidatesForAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListCandidatesForAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(
            ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest,
            com.amazonaws.handlers.AsyncHandler<ListCandidatesForAutoMLJobRequest, ListCandidatesForAutoMLJobResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return A Java Future containing the result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMakerAsync.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest listCodeRepositoriesRequest);

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest listCodeRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCodeRepositoriesRequest, ListCodeRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about a particular model
     * compilation job you have created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @return A Java Future containing the result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest listCompilationJobsRequest);

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about a particular model
     * compilation job you have created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest listCompilationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCompilationJobsRequest, ListCompilationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the contexts in your account and their properties.
     * </p>
     * 
     * @param listContextsRequest
     * @return A Java Future containing the result of the ListContexts operation returned by the service.
     * @sample AmazonSageMakerAsync.ListContexts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListContexts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContextsResult> listContextsAsync(ListContextsRequest listContextsRequest);

    /**
     * <p>
     * Lists the contexts in your account and their properties.
     * </p>
     * 
     * @param listContextsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContexts operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListContexts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListContexts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContextsResult> listContextsAsync(ListContextsRequest listContextsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContextsRequest, ListContextsResult> asyncHandler);

    /**
     * <p>
     * Lists the data quality job definitions in your account.
     * </p>
     * 
     * @param listDataQualityJobDefinitionsRequest
     * @return A Java Future containing the result of the ListDataQualityJobDefinitions operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListDataQualityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDataQualityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataQualityJobDefinitionsResult> listDataQualityJobDefinitionsAsync(
            ListDataQualityJobDefinitionsRequest listDataQualityJobDefinitionsRequest);

    /**
     * <p>
     * Lists the data quality job definitions in your account.
     * </p>
     * 
     * @param listDataQualityJobDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataQualityJobDefinitions operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListDataQualityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDataQualityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataQualityJobDefinitionsResult> listDataQualityJobDefinitionsAsync(
            ListDataQualityJobDefinitionsRequest listDataQualityJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataQualityJobDefinitionsRequest, ListDataQualityJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of devices in the fleet.
     * </p>
     * 
     * @param listDeviceFleetsRequest
     * @return A Java Future containing the result of the ListDeviceFleets operation returned by the service.
     * @sample AmazonSageMakerAsync.ListDeviceFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDeviceFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceFleetsResult> listDeviceFleetsAsync(ListDeviceFleetsRequest listDeviceFleetsRequest);

    /**
     * <p>
     * Returns a list of devices in the fleet.
     * </p>
     * 
     * @param listDeviceFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceFleets operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListDeviceFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDeviceFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceFleetsResult> listDeviceFleetsAsync(ListDeviceFleetsRequest listDeviceFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceFleetsRequest, ListDeviceFleetsResult> asyncHandler);

    /**
     * <p>
     * A list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonSageMakerAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * A list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSageMakerAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of edge packaging jobs.
     * </p>
     * 
     * @param listEdgePackagingJobsRequest
     * @return A Java Future containing the result of the ListEdgePackagingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListEdgePackagingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgePackagingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEdgePackagingJobsResult> listEdgePackagingJobsAsync(ListEdgePackagingJobsRequest listEdgePackagingJobsRequest);

    /**
     * <p>
     * Returns a list of edge packaging jobs.
     * </p>
     * 
     * @param listEdgePackagingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEdgePackagingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListEdgePackagingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgePackagingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEdgePackagingJobsResult> listEdgePackagingJobsAsync(ListEdgePackagingJobsRequest listEdgePackagingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEdgePackagingJobsRequest, ListEdgePackagingJobsResult> asyncHandler);

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return A Java Future containing the result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest listEndpointConfigsRequest);

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest listEndpointConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMakerAsync.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest);

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in
     * a specific time range. The list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AmazonSageMakerAsync.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in
     * a specific time range. The list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler);

    /**
     * <p>
     * List <code>FeatureGroup</code>s based on given filter and order.
     * </p>
     * 
     * @param listFeatureGroupsRequest
     * @return A Java Future containing the result of the ListFeatureGroups operation returned by the service.
     * @sample AmazonSageMakerAsync.ListFeatureGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFeatureGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFeatureGroupsResult> listFeatureGroupsAsync(ListFeatureGroupsRequest listFeatureGroupsRequest);

    /**
     * <p>
     * List <code>FeatureGroup</code>s based on given filter and order.
     * </p>
     * 
     * @param listFeatureGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFeatureGroups operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListFeatureGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFeatureGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFeatureGroupsResult> listFeatureGroupsAsync(ListFeatureGroupsRequest listFeatureGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFeatureGroupsRequest, ListFeatureGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @return A Java Future containing the result of the ListFlowDefinitions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListFlowDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFlowDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(ListFlowDefinitionsRequest listFlowDefinitionsRequest);

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlowDefinitions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListFlowDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFlowDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(ListFlowDefinitionsRequest listFlowDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowDefinitionsRequest, ListFlowDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @return A Java Future containing the result of the ListHumanTaskUis operation returned by the service.
     * @sample AmazonSageMakerAsync.ListHumanTaskUis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHumanTaskUis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(ListHumanTaskUisRequest listHumanTaskUisRequest);

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHumanTaskUis operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListHumanTaskUis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHumanTaskUis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(ListHumanTaskUisRequest listHumanTaskUisRequest,
            com.amazonaws.handlers.AsyncHandler<ListHumanTaskUisRequest, ListHumanTaskUisResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest);

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHyperParameterTuningJobsRequest, ListHyperParameterTuningJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of a specified image and their properties. The list can be filtered by creation time or
     * modified time.
     * </p>
     * 
     * @param listImageVersionsRequest
     * @return A Java Future containing the result of the ListImageVersions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListImageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImageVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImageVersionsResult> listImageVersionsAsync(ListImageVersionsRequest listImageVersionsRequest);

    /**
     * <p>
     * Lists the versions of a specified image and their properties. The list can be filtered by creation time or
     * modified time.
     * </p>
     * 
     * @param listImageVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImageVersions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListImageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImageVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImageVersionsResult> listImageVersionsAsync(ListImageVersionsRequest listImageVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImageVersionsRequest, ListImageVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the images in your account and their properties. The list can be filtered by creation time or modified
     * time, and whether the image name contains a specified string.
     * </p>
     * 
     * @param listImagesRequest
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonSageMakerAsync.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Lists the images in your account and their properties. The list can be filtered by creation time or modified
     * time, and whether the image name contains a specified string.
     * </p>
     * 
     * @param listImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return A Java Future containing the result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest listLabelingJobsRequest);

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest listLabelingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLabelingJobsRequest, ListLabelingJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest);

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<ListLabelingJobsForWorkteamRequest, ListLabelingJobsForWorkteamResult> asyncHandler);

    /**
     * <p>
     * Lists model bias jobs definitions that satisfy various filters.
     * </p>
     * 
     * @param listModelBiasJobDefinitionsRequest
     * @return A Java Future containing the result of the ListModelBiasJobDefinitions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModelBiasJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelBiasJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelBiasJobDefinitionsResult> listModelBiasJobDefinitionsAsync(
            ListModelBiasJobDefinitionsRequest listModelBiasJobDefinitionsRequest);

    /**
     * <p>
     * Lists model bias jobs definitions that satisfy various filters.
     * </p>
     * 
     * @param listModelBiasJobDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelBiasJobDefinitions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModelBiasJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelBiasJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelBiasJobDefinitionsResult> listModelBiasJobDefinitionsAsync(
            ListModelBiasJobDefinitionsRequest listModelBiasJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelBiasJobDefinitionsRequest, ListModelBiasJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Lists model explainability job definitions that satisfy various filters.
     * </p>
     * 
     * @param listModelExplainabilityJobDefinitionsRequest
     * @return A Java Future containing the result of the ListModelExplainabilityJobDefinitions operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.ListModelExplainabilityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelExplainabilityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelExplainabilityJobDefinitionsResult> listModelExplainabilityJobDefinitionsAsync(
            ListModelExplainabilityJobDefinitionsRequest listModelExplainabilityJobDefinitionsRequest);

    /**
     * <p>
     * Lists model explainability job definitions that satisfy various filters.
     * </p>
     * 
     * @param listModelExplainabilityJobDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelExplainabilityJobDefinitions operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.ListModelExplainabilityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelExplainabilityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelExplainabilityJobDefinitionsResult> listModelExplainabilityJobDefinitionsAsync(
            ListModelExplainabilityJobDefinitionsRequest listModelExplainabilityJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelExplainabilityJobDefinitionsRequest, ListModelExplainabilityJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the model groups in your AWS account.
     * </p>
     * 
     * @param listModelPackageGroupsRequest
     * @return A Java Future containing the result of the ListModelPackageGroups operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModelPackageGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackageGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackageGroupsResult> listModelPackageGroupsAsync(ListModelPackageGroupsRequest listModelPackageGroupsRequest);

    /**
     * <p>
     * Gets a list of the model groups in your AWS account.
     * </p>
     * 
     * @param listModelPackageGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelPackageGroups operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModelPackageGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackageGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackageGroupsResult> listModelPackageGroupsAsync(ListModelPackageGroupsRequest listModelPackageGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelPackageGroupsRequest, ListModelPackageGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return A Java Future containing the result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest listModelPackagesRequest);

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest listModelPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelPackagesRequest, ListModelPackagesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of model quality monitoring job definitions in your account.
     * </p>
     * 
     * @param listModelQualityJobDefinitionsRequest
     * @return A Java Future containing the result of the ListModelQualityJobDefinitions operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListModelQualityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelQualityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelQualityJobDefinitionsResult> listModelQualityJobDefinitionsAsync(
            ListModelQualityJobDefinitionsRequest listModelQualityJobDefinitionsRequest);

    /**
     * <p>
     * Gets a list of model quality monitoring job definitions in your account.
     * </p>
     * 
     * @param listModelQualityJobDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelQualityJobDefinitions operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListModelQualityJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelQualityJobDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelQualityJobDefinitionsResult> listModelQualityJobDefinitionsAsync(
            ListModelQualityJobDefinitionsRequest listModelQualityJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelQualityJobDefinitionsRequest, ListModelQualityJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Lists models created with the <a>CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists models created with the <a>CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler);

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @return A Java Future containing the result of the ListMonitoringExecutions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListMonitoringExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(ListMonitoringExecutionsRequest listMonitoringExecutionsRequest);

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitoringExecutions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListMonitoringExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(ListMonitoringExecutionsRequest listMonitoringExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitoringExecutionsRequest, ListMonitoringExecutionsResult> asyncHandler);

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @return A Java Future containing the result of the ListMonitoringSchedules operation returned by the service.
     * @sample AmazonSageMakerAsync.ListMonitoringSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(ListMonitoringSchedulesRequest listMonitoringSchedulesRequest);

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitoringSchedules operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListMonitoringSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(ListMonitoringSchedulesRequest listMonitoringSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitoringSchedulesRequest, ListMonitoringSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest);

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookInstanceLifecycleConfigsRequest, ListNotebookInstanceLifecycleConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return A Java Future containing the result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMakerAsync.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest listNotebookInstancesRequest);

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest listNotebookInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <code>PipeLineExecutionStep</code> objects.
     * </p>
     * 
     * @param listPipelineExecutionStepsRequest
     * @return A Java Future containing the result of the ListPipelineExecutionSteps operation returned by the service.
     * @sample AmazonSageMakerAsync.ListPipelineExecutionSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutionSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineExecutionStepsResult> listPipelineExecutionStepsAsync(
            ListPipelineExecutionStepsRequest listPipelineExecutionStepsRequest);

    /**
     * <p>
     * Gets a list of <code>PipeLineExecutionStep</code> objects.
     * </p>
     * 
     * @param listPipelineExecutionStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelineExecutionSteps operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListPipelineExecutionSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutionSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineExecutionStepsResult> listPipelineExecutionStepsAsync(
            ListPipelineExecutionStepsRequest listPipelineExecutionStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelineExecutionStepsRequest, ListPipelineExecutionStepsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the pipeline executions.
     * </p>
     * 
     * @param listPipelineExecutionsRequest
     * @return A Java Future containing the result of the ListPipelineExecutions operation returned by the service.
     * @sample AmazonSageMakerAsync.ListPipelineExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(ListPipelineExecutionsRequest listPipelineExecutionsRequest);

    /**
     * <p>
     * Gets a list of the pipeline executions.
     * </p>
     * 
     * @param listPipelineExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelineExecutions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListPipelineExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(ListPipelineExecutionsRequest listPipelineExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelineExecutionsRequest, ListPipelineExecutionsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of parameters for a pipeline execution.
     * </p>
     * 
     * @param listPipelineParametersForExecutionRequest
     * @return A Java Future containing the result of the ListPipelineParametersForExecution operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListPipelineParametersForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineParametersForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineParametersForExecutionResult> listPipelineParametersForExecutionAsync(
            ListPipelineParametersForExecutionRequest listPipelineParametersForExecutionRequest);

    /**
     * <p>
     * Gets a list of parameters for a pipeline execution.
     * </p>
     * 
     * @param listPipelineParametersForExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelineParametersForExecution operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListPipelineParametersForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineParametersForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineParametersForExecutionResult> listPipelineParametersForExecutionAsync(
            ListPipelineParametersForExecutionRequest listPipelineParametersForExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelineParametersForExecutionRequest, ListPipelineParametersForExecutionResult> asyncHandler);

    /**
     * <p>
     * Gets a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonSageMakerAsync.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Gets a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @return A Java Future containing the result of the ListProcessingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProcessingJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(ListProcessingJobsRequest listProcessingJobsRequest);

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProcessingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProcessingJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(ListProcessingJobsRequest listProcessingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProcessingJobsRequest, ListProcessingJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the projects in an AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonSageMakerAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Gets a list of the projects in an AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsync.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest);

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscribedWorkteamsRequest, ListSubscribedWorkteamsResult> asyncHandler);

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * <note>
     * <p>
     * When <code>StatusEquals</code> and <code>MaxResults</code> are set at the same time, the <code>MaxResults</code>
     * number of training jobs are first retrieved ignoring the <code>StatusEquals</code> parameter and then they are
     * filtered by the <code>StatusEquals</code> parameter, which is returned as a response. For example, if
     * <code>ListTrainingJobs</code> is invoked with the following parameters:
     * </p>
     * <p>
     * <code>{ ... MaxResults: 100, StatusEquals: InProgress ... }</code>
     * </p>
     * <p>
     * Then, 100 trainings jobs with any status including those other than <code>InProgress</code> are selected first
     * (sorted according the creation time, from the latest to the oldest) and those with status <code>InProgress</code>
     * are returned.
     * </p>
     * <p>
     * You can quickly test the API using the following AWS CLI code.
     * </p>
     * <p>
     * <code>aws sagemaker list-training-jobs --max-results 100 --status-equals InProgress</code>
     * </p>
     * </note>
     * 
     * @param listTrainingJobsRequest
     * @return A Java Future containing the result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest listTrainingJobsRequest);

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * <note>
     * <p>
     * When <code>StatusEquals</code> and <code>MaxResults</code> are set at the same time, the <code>MaxResults</code>
     * number of training jobs are first retrieved ignoring the <code>StatusEquals</code> parameter and then they are
     * filtered by the <code>StatusEquals</code> parameter, which is returned as a response. For example, if
     * <code>ListTrainingJobs</code> is invoked with the following parameters:
     * </p>
     * <p>
     * <code>{ ... MaxResults: 100, StatusEquals: InProgress ... }</code>
     * </p>
     * <p>
     * Then, 100 trainings jobs with any status including those other than <code>InProgress</code> are selected first
     * (sorted according the creation time, from the latest to the oldest) and those with status <code>InProgress</code>
     * are returned.
     * </p>
     * <p>
     * You can quickly test the API using the following AWS CLI code.
     * </p>
     * <p>
     * <code>aws sagemaker list-training-jobs --max-results 100 --status-equals InProgress</code>
     * </p>
     * </note>
     * 
     * @param listTrainingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest listTrainingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
     *         by the service.
     * @sample AmazonSageMakerAsync.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest);

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
     *         by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrainingJobsForHyperParameterTuningJobRequest, ListTrainingJobsForHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return A Java Future containing the result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest listTransformJobsRequest);

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest listTransformJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransformJobsRequest, ListTransformJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by trial component name or creation time. You
     * can filter the list to show only components that were created in a specific time range. You can also filter on
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @return A Java Future containing the result of the ListTrialComponents operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTrialComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(ListTrialComponentsRequest listTrialComponentsRequest);

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by trial component name or creation time. You
     * can filter the list to show only components that were created in a specific time range. You can also filter on
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrialComponents operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrialComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(ListTrialComponentsRequest listTrialComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrialComponentsRequest, ListTrialComponentsResult> asyncHandler);

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of
     * that experiment. Specify a trial component name to limit the list to the trials that associated with that trial
     * component. The list can be filtered to show only trials that were created in a specific time range. The list can
     * be sorted by trial name or creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @return A Java Future containing the result of the ListTrials operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTrials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(ListTrialsRequest listTrialsRequest);

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of
     * that experiment. Specify a trial component name to limit the list to the trials that associated with that trial
     * component. The list can be filtered to show only trials that were created in a specific time range. The list can
     * be sorted by trial name or creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrials operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(ListTrialsRequest listTrialsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrialsRequest, ListTrialsResult> asyncHandler);

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return A Java Future containing the result of the ListUserProfiles operation returned by the service.
     * @sample AmazonSageMakerAsync.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest listUserProfilesRequest);

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserProfiles operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest listUserProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserProfilesRequest, ListUserProfilesResult> asyncHandler);

    /**
     * <p>
     * Use this operation to list all private and vendor workforces in an AWS Region. Note that you can only have one
     * private workforce per AWS Region.
     * </p>
     * 
     * @param listWorkforcesRequest
     * @return A Java Future containing the result of the ListWorkforces operation returned by the service.
     * @sample AmazonSageMakerAsync.ListWorkforces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkforces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkforcesResult> listWorkforcesAsync(ListWorkforcesRequest listWorkforcesRequest);

    /**
     * <p>
     * Use this operation to list all private and vendor workforces in an AWS Region. Note that you can only have one
     * private workforce per AWS Region.
     * </p>
     * 
     * @param listWorkforcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkforces operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListWorkforces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkforces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkforcesResult> listWorkforcesAsync(ListWorkforcesRequest listWorkforcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkforcesRequest, ListWorkforcesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of private work teams that you have defined in a region. The list may be empty if no work team
     * satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return A Java Future containing the result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsync.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest listWorkteamsRequest);

    /**
     * <p>
     * Gets a list of private work teams that you have defined in a region. The list may be empty if no work team
     * satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest listWorkteamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkteamsRequest, ListWorkteamsResult> asyncHandler);

    /**
     * <p>
     * Adds a resouce policy to control access to a model group. For information about resoure policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies</a> in the <i>AWS Identity and Access Management User Guide.</i>.
     * </p>
     * 
     * @param putModelPackageGroupPolicyRequest
     * @return A Java Future containing the result of the PutModelPackageGroupPolicy operation returned by the service.
     * @sample AmazonSageMakerAsync.PutModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PutModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutModelPackageGroupPolicyResult> putModelPackageGroupPolicyAsync(
            PutModelPackageGroupPolicyRequest putModelPackageGroupPolicyRequest);

    /**
     * <p>
     * Adds a resouce policy to control access to a model group. For information about resoure policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies</a> in the <i>AWS Identity and Access Management User Guide.</i>.
     * </p>
     * 
     * @param putModelPackageGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutModelPackageGroupPolicy operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.PutModelPackageGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PutModelPackageGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutModelPackageGroupPolicyResult> putModelPackageGroupPolicyAsync(
            PutModelPackageGroupPolicyRequest putModelPackageGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutModelPackageGroupPolicyRequest, PutModelPackageGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Register devices.
     * </p>
     * 
     * @param registerDevicesRequest
     * @return A Java Future containing the result of the RegisterDevices operation returned by the service.
     * @sample AmazonSageMakerAsync.RegisterDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RegisterDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterDevicesResult> registerDevicesAsync(RegisterDevicesRequest registerDevicesRequest);

    /**
     * <p>
     * Register devices.
     * </p>
     * 
     * @param registerDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDevices operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.RegisterDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RegisterDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterDevicesResult> registerDevicesAsync(RegisterDevicesRequest registerDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDevicesRequest, RegisterDevicesResult> asyncHandler);

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return A Java Future containing the result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMakerAsync.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest renderUiTemplateRequest);

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest renderUiTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<RenderUiTemplateRequest, RenderUiTemplateResult> asyncHandler);

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resources are returned as a list of
     * <code>SearchRecord</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean, and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonSageMakerAsync.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest);

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resources are returned as a list of
     * <code>SearchRecord</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean, and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler);

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * By default, when you successfully create a new schedule, the status of a monitoring schedule is
     * <code>scheduled</code>.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @return A Java Future containing the result of the StartMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.StartMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(StartMonitoringScheduleRequest startMonitoringScheduleRequest);

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * By default, when you successfully create a new schedule, the status of a monitoring schedule is
     * <code>scheduled</code>.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StartMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(StartMonitoringScheduleRequest startMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<StartMonitoringScheduleRequest, StartMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @return A Java Future containing the result of the StartNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest startNotebookInstanceRequest);

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest startNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Starts a pipeline execution.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     * @return A Java Future containing the result of the StartPipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsync.StartPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest startPipelineExecutionRequest);

    /**
     * <p>
     * Starts a pipeline execution.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StartPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest startPipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartPipelineExecutionRequest, StartPipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @return A Java Future containing the result of the StopAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(StopAutoMLJobRequest stopAutoMLJobRequest);

    /**
     * <p>
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAutoMLJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(StopAutoMLJobRequest stopAutoMLJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopAutoMLJobRequest, StopAutoMLJobResult> asyncHandler);

    /**
     * <p>
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
     * the job hasn't stopped, it sends the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon SageMaker changes the
     * <a>CompilationJobSummary$CompilationJobStatus</a> of the job to <code>Stopping</code>. After Amazon SageMaker
     * stops the job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @return A Java Future containing the result of the StopCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest stopCompilationJobRequest);

    /**
     * <p>
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
     * the job hasn't stopped, it sends the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon SageMaker changes the
     * <a>CompilationJobSummary$CompilationJobStatus</a> of the job to <code>Stopping</code>. After Amazon SageMaker
     * stops the job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest stopCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopCompilationJobRequest, StopCompilationJobResult> asyncHandler);

    /**
     * <p>
     * Request to stop an edge packaging job.
     * </p>
     * 
     * @param stopEdgePackagingJobRequest
     * @return A Java Future containing the result of the StopEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopEdgePackagingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopEdgePackagingJobResult> stopEdgePackagingJobAsync(StopEdgePackagingJobRequest stopEdgePackagingJobRequest);

    /**
     * <p>
     * Request to stop an edge packaging job.
     * </p>
     * 
     * @param stopEdgePackagingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEdgePackagingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopEdgePackagingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopEdgePackagingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopEdgePackagingJobResult> stopEdgePackagingJobAsync(StopEdgePackagingJobRequest stopEdgePackagingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopEdgePackagingJobRequest, StopEdgePackagingJobResult> asyncHandler);

    /**
     * <p>
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
     * data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
     * job moves to the <code>Stopped</code> state, it releases all reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest);

    /**
     * <p>
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
     * data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
     * job moves to the <code>Stopped</code> state, it releases all reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopHyperParameterTuningJobRequest, StopHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @return A Java Future containing the result of the StopLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest stopLabelingJobRequest);

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest stopLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopLabelingJobRequest, StopLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @return A Java Future containing the result of the StopMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.StopMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(StopMonitoringScheduleRequest stopMonitoringScheduleRequest);

    /**
     * <p>
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(StopMonitoringScheduleRequest stopMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<StopMonitoringScheduleRequest, StopMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
     * compute instance when you call <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @return A Java Future containing the result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest stopNotebookInstanceRequest);

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
     * compute instance when you call <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest stopNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Stops a pipeline execution.
     * </p>
     * 
     * @param stopPipelineExecutionRequest
     * @return A Java Future containing the result of the StopPipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsync.StopPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopPipelineExecutionResult> stopPipelineExecutionAsync(StopPipelineExecutionRequest stopPipelineExecutionRequest);

    /**
     * <p>
     * Stops a pipeline execution.
     * </p>
     * 
     * @param stopPipelineExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopPipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopPipelineExecutionResult> stopPipelineExecutionAsync(StopPipelineExecutionRequest stopPipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopPipelineExecutionRequest, StopPipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @return A Java Future containing the result of the StopProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(StopProcessingJobRequest stopProcessingJobRequest);

    /**
     * <p>
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopProcessingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(StopProcessingJobRequest stopProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopProcessingJobRequest, StopProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which
     * delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
     * so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker changes the status of the job to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @return A Java Future containing the result of the StopTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest stopTrainingJobRequest);

    /**
     * <p>
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which
     * delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
     * so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker changes the status of the job to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest stopTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request, the status of the job changes to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, the status is set to <code>Stopped</code>. When you
     * stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @return A Java Future containing the result of the StopTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest stopTransformJobRequest);

    /**
     * <p>
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request, the status of the job changes to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, the status is set to <code>Stopped</code>. When you
     * stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest stopTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopTransformJobRequest, StopTransformJobResult> asyncHandler);

    /**
     * <p>
     * Updates an action.
     * </p>
     * 
     * @param updateActionRequest
     * @return A Java Future containing the result of the UpdateAction operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionResult> updateActionAsync(UpdateActionRequest updateActionRequest);

    /**
     * <p>
     * Updates an action.
     * </p>
     * 
     * @param updateActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAction operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionResult> updateActionAsync(UpdateActionRequest updateActionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateActionRequest, UpdateActionResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of an AppImageConfig.
     * </p>
     * 
     * @param updateAppImageConfigRequest
     * @return A Java Future containing the result of the UpdateAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppImageConfigResult> updateAppImageConfigAsync(UpdateAppImageConfigRequest updateAppImageConfigRequest);

    /**
     * <p>
     * Updates the properties of an AppImageConfig.
     * </p>
     * 
     * @param updateAppImageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppImageConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateAppImageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAppImageConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppImageConfigResult> updateAppImageConfigAsync(UpdateAppImageConfigRequest updateAppImageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppImageConfigRequest, UpdateAppImageConfigResult> asyncHandler);

    /**
     * <p>
     * Updates an artifact.
     * </p>
     * 
     * @param updateArtifactRequest
     * @return A Java Future containing the result of the UpdateArtifact operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateArtifactResult> updateArtifactAsync(UpdateArtifactRequest updateArtifactRequest);

    /**
     * <p>
     * Updates an artifact.
     * </p>
     * 
     * @param updateArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateArtifact operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateArtifact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateArtifactResult> updateArtifactAsync(UpdateArtifactRequest updateArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateArtifactRequest, UpdateArtifactResult> asyncHandler);

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return A Java Future containing the result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest updateCodeRepositoryRequest);

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest updateCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCodeRepositoryRequest, UpdateCodeRepositoryResult> asyncHandler);

    /**
     * <p>
     * Updates a context.
     * </p>
     * 
     * @param updateContextRequest
     * @return A Java Future containing the result of the UpdateContext operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContextResult> updateContextAsync(UpdateContextRequest updateContextRequest);

    /**
     * <p>
     * Updates a context.
     * </p>
     * 
     * @param updateContextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContext operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateContext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateContext" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContextResult> updateContextAsync(UpdateContextRequest updateContextRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContextRequest, UpdateContextResult> asyncHandler);

    /**
     * <p>
     * Updates a fleet of devices.
     * </p>
     * 
     * @param updateDeviceFleetRequest
     * @return A Java Future containing the result of the UpdateDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceFleetResult> updateDeviceFleetAsync(UpdateDeviceFleetRequest updateDeviceFleetRequest);

    /**
     * <p>
     * Updates a fleet of devices.
     * </p>
     * 
     * @param updateDeviceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceFleet operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateDeviceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDeviceFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceFleetResult> updateDeviceFleetAsync(UpdateDeviceFleetRequest updateDeviceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceFleetRequest, UpdateDeviceFleetResult> asyncHandler);

    /**
     * <p>
     * Updates one or more devices in a fleet.
     * </p>
     * 
     * @param updateDevicesRequest
     * @return A Java Future containing the result of the UpdateDevices operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevicesResult> updateDevicesAsync(UpdateDevicesRequest updateDevicesRequest);

    /**
     * <p>
     * Updates one or more devices in a fleet.
     * </p>
     * 
     * @param updateDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevices operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevicesResult> updateDevicesAsync(UpdateDevicesRequest updateDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDevicesRequest, UpdateDevicesResult> asyncHandler);

    /**
     * <p>
     * Updates the default settings for new user profiles in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Updates the default settings for new user profiles in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler);

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request, switches to using newly created endpoint,
     * and then deletes resources provisioned for the endpoint using the previous <code>EndpointConfig</code> (there is
     * no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Updating</code>. After updating
     * the endpoint, it sets the status to <code>InService</code>. To check the status of an endpoint, use the
     * <a>DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * <p>
     * If you delete the <code>EndpointConfig</code> of an endpoint that is active or being created or updated you may
     * lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop
     * incurring charges.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest);

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request, switches to using newly created endpoint,
     * and then deletes resources provisioned for the endpoint using the previous <code>EndpointConfig</code> (there is
     * no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Updating</code>. After updating
     * the endpoint, it sets the status to <code>InService</code>. To check the status of an endpoint, use the
     * <a>DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * <p>
     * If you delete the <code>EndpointConfig</code> of an endpoint that is active or being created or updated you may
     * lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop
     * incurring charges.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler);

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
     * associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
     * <code>Updating</code>. After updating the endpoint, it sets the status to <code>InService</code>. To check the
     * status of an endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @return A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest);

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
     * associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
     * <code>Updating</code>. After updating the endpoint, it sets the status to <code>InService</code>. To check the
     * status of an endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler);

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return A Java Future containing the result of the UpdateExperiment operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest updateExperimentRequest);

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExperiment operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest updateExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of a SageMaker image. To change the image's tags, use the <a>AddTags</a> and
     * <a>DeleteTags</a> APIs.
     * </p>
     * 
     * @param updateImageRequest
     * @return A Java Future containing the result of the UpdateImage operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageResult> updateImageAsync(UpdateImageRequest updateImageRequest);

    /**
     * <p>
     * Updates the properties of a SageMaker image. To change the image's tags, use the <a>AddTags</a> and
     * <a>DeleteTags</a> APIs.
     * </p>
     * 
     * @param updateImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageResult> updateImageAsync(UpdateImageRequest updateImageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImageRequest, UpdateImageResult> asyncHandler);

    /**
     * <p>
     * Updates a versioned model.
     * </p>
     * 
     * @param updateModelPackageRequest
     * @return A Java Future containing the result of the UpdateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelPackageResult> updateModelPackageAsync(UpdateModelPackageRequest updateModelPackageRequest);

    /**
     * <p>
     * Updates a versioned model.
     * </p>
     * 
     * @param updateModelPackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelPackageResult> updateModelPackageAsync(UpdateModelPackageRequest updateModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelPackageRequest, UpdateModelPackageResult> asyncHandler);

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @return A Java Future containing the result of the UpdateMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest);

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMonitoringSchedule operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitoringScheduleRequest, UpdateMonitoringScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return A Java Future containing the result of the UpdateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest updateNotebookInstanceRequest);

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest updateNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceLifecycleConfigRequest, UpdateNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a pipeline.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Updates a pipeline.
     * </p>
     * 
     * @param updatePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler);

    /**
     * <p>
     * Updates a pipeline execution.
     * </p>
     * 
     * @param updatePipelineExecutionRequest
     * @return A Java Future containing the result of the UpdatePipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdatePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineExecutionResult> updatePipelineExecutionAsync(UpdatePipelineExecutionRequest updatePipelineExecutionRequest);

    /**
     * <p>
     * Updates a pipeline execution.
     * </p>
     * 
     * @param updatePipelineExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipelineExecution operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdatePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineExecutionResult> updatePipelineExecutionAsync(UpdatePipelineExecutionRequest updatePipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineExecutionRequest, UpdatePipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Update a model training job to request a new Debugger profiling configuration.
     * </p>
     * 
     * @param updateTrainingJobRequest
     * @return A Java Future containing the result of the UpdateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrainingJobResult> updateTrainingJobAsync(UpdateTrainingJobRequest updateTrainingJobRequest);

    /**
     * <p>
     * Update a model training job to request a new Debugger profiling configuration.
     * </p>
     * 
     * @param updateTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrainingJobResult> updateTrainingJobAsync(UpdateTrainingJobRequest updateTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrainingJobRequest, UpdateTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @return A Java Future containing the result of the UpdateTrial operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(UpdateTrialRequest updateTrialRequest);

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrial operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(UpdateTrialRequest updateTrialRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrialRequest, UpdateTrialResult> asyncHandler);

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @return A Java Future containing the result of the UpdateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(UpdateTrialComponentRequest updateTrialComponentRequest);

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrialComponent operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(UpdateTrialComponentRequest updateTrialComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrialComponentRequest, UpdateTrialComponentResult> asyncHandler);

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Use this operation to update your workforce. You can use this operation to require that workers use specific IP
     * addresses to work on tasks and to update your OpenID Connect (OIDC) Identity Provider (IdP) workforce
     * configuration.
     * </p>
     * <p>
     * Use <code>SourceIpConfig</code> to restrict worker access to tasks to a specific range of IP addresses. You
     * specify allowed IP addresses by creating a list of up to ten <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>. By default, a workforce isn't
     * restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks
     * using any IP address outside the specified range are denied and get a <code>Not Found</code> error message on the
     * worker portal.
     * </p>
     * <p>
     * Use <code>OidcConfig</code> to update the configuration of a workforce created using your own OIDC IdP.
     * </p>
     * <important>
     * <p>
     * You can only update your OIDC IdP configuration when there are no work teams associated with your workforce. You
     * can delete work teams using the operation.
     * </p>
     * </important>
     * <p>
     * After restricting access to a range of IP addresses or updating your OIDC IdP configuration with this operation,
     * you can view details about your update workforce using the operation.
     * </p>
     * <important>
     * <p>
     * This operation only applies to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @return A Java Future containing the result of the UpdateWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(UpdateWorkforceRequest updateWorkforceRequest);

    /**
     * <p>
     * Use this operation to update your workforce. You can use this operation to require that workers use specific IP
     * addresses to work on tasks and to update your OpenID Connect (OIDC) Identity Provider (IdP) workforce
     * configuration.
     * </p>
     * <p>
     * Use <code>SourceIpConfig</code> to restrict worker access to tasks to a specific range of IP addresses. You
     * specify allowed IP addresses by creating a list of up to ten <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>. By default, a workforce isn't
     * restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks
     * using any IP address outside the specified range are denied and get a <code>Not Found</code> error message on the
     * worker portal.
     * </p>
     * <p>
     * Use <code>OidcConfig</code> to update the configuration of a workforce created using your own OIDC IdP.
     * </p>
     * <important>
     * <p>
     * You can only update your OIDC IdP configuration when there are no work teams associated with your workforce. You
     * can delete work teams using the operation.
     * </p>
     * </important>
     * <p>
     * After restricting access to a range of IP addresses or updating your OIDC IdP configuration with this operation,
     * you can view details about your update workforce using the operation.
     * </p>
     * <important>
     * <p>
     * This operation only applies to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkforce operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(UpdateWorkforceRequest updateWorkforceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkforceRequest, UpdateWorkforceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return A Java Future containing the result of the UpdateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest updateWorkteamRequest);

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest updateWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkteamRequest, UpdateWorkteamResult> asyncHandler);

}
