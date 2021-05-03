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
package com.amazonaws.services.batch;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;

/**
 * Interface for accessing AWS Batch asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.batch.AbstractAWSBatchAsync} instead.
 * </p>
 * <p>
 * <p>
 * Using AWS Batch, you can run batch computing workloads on the AWS Cloud. Batch computing is a common means for
 * developers, scientists, and engineers to access large amounts of compute resources. AWS Batch uses the advantages of
 * this computing workload to remove the undifferentiated heavy lifting of configuring and managing required
 * infrastructure. At the same time, it also adopts a familiar batch computing software approach. Given these
 * advantages, AWS Batch can help you to efficiently provision resources in response to jobs submitted, thus effectively
 * helping you to eliminate capacity constraints, reduce compute costs, and deliver your results more quickly.
 * </p>
 * <p>
 * As a fully managed service, AWS Batch can run batch computing workloads of any scale. AWS Batch automatically
 * provisions compute resources and optimizes workload distribution based on the quantity and scale of your specific
 * workloads. With AWS Batch, there's no need to install or manage batch computing software. This means that you can
 * focus your time and energy on analyzing results and solving your specific problems.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBatchAsync extends AWSBatch {

    /**
     * <p>
     * Cancels a job in an AWS Batch job queue. Jobs that are in the <code>SUBMITTED</code>, <code>PENDING</code>, or
     * <code>RUNNABLE</code> state are canceled. Jobs that have progressed to <code>STARTING</code> or
     * <code>RUNNING</code> aren't canceled, but the API operation still succeeds, even if no job is canceled. These
     * jobs must be terminated with the <a>TerminateJob</a> operation.
     * </p>
     * 
     * @param cancelJobRequest
     *        Contains the parameters for <code>CancelJob</code>.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSBatchAsync.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels a job in an AWS Batch job queue. Jobs that are in the <code>SUBMITTED</code>, <code>PENDING</code>, or
     * <code>RUNNABLE</code> state are canceled. Jobs that have progressed to <code>STARTING</code> or
     * <code>RUNNING</code> aren't canceled, but the API operation still succeeds, even if no job is canceled. These
     * jobs must be terminated with the <a>TerminateJob</a> operation.
     * </p>
     * 
     * @param cancelJobRequest
     *        Contains the parameters for <code>CancelJob</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSBatchAsyncHandler.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS Batch compute environment. You can create <code>MANAGED</code> or <code>UNMANAGED</code> compute
     * environments. <code>MANAGED</code> compute environments can use Amazon EC2 or AWS Fargate resources.
     * <code>UNMANAGED</code> compute environments can only use EC2 resources.
     * </p>
     * <p>
     * In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources
     * within the environment. This is based on the compute resource specification that you define or the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch template</a> that you
     * specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2
     * Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can
     * optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a
     * specified percentage of the On-Demand price.
     * </p>
     * <note>
     * <p>
     * Multi-node parallel jobs aren't supported on Spot Instances.
     * </p>
     * </note>
     * <p>
     * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a lot of flexibility
     * with how you configure your compute resources. For example, you can use custom AMIs. However, you must verify
     * that each of your AMIs meet the Amazon ECS container instance AMI specification. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html">container
     * instance AMIs</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. After you created your
     * unmanaged compute environment, you can use the <a>DescribeComputeEnvironments</a> operation to find the Amazon
     * ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html">Launching an
     * Amazon ECS container instance</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * AWS Batch doesn't upgrade the AMIs in a compute environment after the environment is created. For example, it
     * doesn't update the AMIs when a newer version of the Amazon ECS optimized AMI is available. Therefore, you're
     * responsible for managing the guest operating system (including its updates and security patches) and any
     * additional application software or utilities that you install on the compute resources. To use a new AMI for your
     * AWS Batch jobs, complete these steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a new compute environment with the new AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the compute environment to an existing job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove the earlier compute environment from your job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the earlier compute environment.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param createComputeEnvironmentRequest
     *        Contains the parameters for <code>CreateComputeEnvironment</code>.
     * @return A Java Future containing the result of the CreateComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsync.CreateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(CreateComputeEnvironmentRequest createComputeEnvironmentRequest);

    /**
     * <p>
     * Creates an AWS Batch compute environment. You can create <code>MANAGED</code> or <code>UNMANAGED</code> compute
     * environments. <code>MANAGED</code> compute environments can use Amazon EC2 or AWS Fargate resources.
     * <code>UNMANAGED</code> compute environments can only use EC2 resources.
     * </p>
     * <p>
     * In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources
     * within the environment. This is based on the compute resource specification that you define or the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch template</a> that you
     * specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2
     * Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can
     * optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a
     * specified percentage of the On-Demand price.
     * </p>
     * <note>
     * <p>
     * Multi-node parallel jobs aren't supported on Spot Instances.
     * </p>
     * </note>
     * <p>
     * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a lot of flexibility
     * with how you configure your compute resources. For example, you can use custom AMIs. However, you must verify
     * that each of your AMIs meet the Amazon ECS container instance AMI specification. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html">container
     * instance AMIs</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. After you created your
     * unmanaged compute environment, you can use the <a>DescribeComputeEnvironments</a> operation to find the Amazon
     * ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html">Launching an
     * Amazon ECS container instance</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * AWS Batch doesn't upgrade the AMIs in a compute environment after the environment is created. For example, it
     * doesn't update the AMIs when a newer version of the Amazon ECS optimized AMI is available. Therefore, you're
     * responsible for managing the guest operating system (including its updates and security patches) and any
     * additional application software or utilities that you install on the compute resources. To use a new AMI for your
     * AWS Batch jobs, complete these steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a new compute environment with the new AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the compute environment to an existing job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove the earlier compute environment from your job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the earlier compute environment.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param createComputeEnvironmentRequest
     *        Contains the parameters for <code>CreateComputeEnvironment</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsyncHandler.CreateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(CreateComputeEnvironmentRequest createComputeEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComputeEnvironmentRequest, CreateComputeEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
     * the queue and assign an order of preference for the compute environments.
     * </p>
     * <p>
     * You also set a priority to the job queue that determines the order that the AWS Batch scheduler places jobs onto
     * its associated compute environments. For example, if a compute environment is associated with more than one job
     * queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
     * </p>
     * 
     * @param createJobQueueRequest
     *        Contains the parameters for <code>CreateJobQueue</code>.
     * @return A Java Future containing the result of the CreateJobQueue operation returned by the service.
     * @sample AWSBatchAsync.CreateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(CreateJobQueueRequest createJobQueueRequest);

    /**
     * <p>
     * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
     * the queue and assign an order of preference for the compute environments.
     * </p>
     * <p>
     * You also set a priority to the job queue that determines the order that the AWS Batch scheduler places jobs onto
     * its associated compute environments. For example, if a compute environment is associated with more than one job
     * queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
     * </p>
     * 
     * @param createJobQueueRequest
     *        Contains the parameters for <code>CreateJobQueue</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJobQueue operation returned by the service.
     * @sample AWSBatchAsyncHandler.CreateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(CreateJobQueueRequest createJobQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobQueueRequest, CreateJobQueueResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Batch compute environment.
     * </p>
     * <p>
     * Before you can delete a compute environment, you must set its state to <code>DISABLED</code> with the
     * <a>UpdateComputeEnvironment</a> API operation and disassociate it from any job queues with the
     * <a>UpdateJobQueue</a> API operation. Compute environments that use AWS Fargate resources must terminate all
     * active jobs on that compute environment before deleting the compute environment. If this isn't done, the compute
     * environment enters an invalid state.
     * </p>
     * 
     * @param deleteComputeEnvironmentRequest
     *        Contains the parameters for <code>DeleteComputeEnvironment</code>.
     * @return A Java Future containing the result of the DeleteComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsync.DeleteComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(DeleteComputeEnvironmentRequest deleteComputeEnvironmentRequest);

    /**
     * <p>
     * Deletes an AWS Batch compute environment.
     * </p>
     * <p>
     * Before you can delete a compute environment, you must set its state to <code>DISABLED</code> with the
     * <a>UpdateComputeEnvironment</a> API operation and disassociate it from any job queues with the
     * <a>UpdateJobQueue</a> API operation. Compute environments that use AWS Fargate resources must terminate all
     * active jobs on that compute environment before deleting the compute environment. If this isn't done, the compute
     * environment enters an invalid state.
     * </p>
     * 
     * @param deleteComputeEnvironmentRequest
     *        Contains the parameters for <code>DeleteComputeEnvironment</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsyncHandler.DeleteComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(DeleteComputeEnvironmentRequest deleteComputeEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComputeEnvironmentRequest, DeleteComputeEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified job queue. You must first disable submissions for a queue with the <a>UpdateJobQueue</a>
     * operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated
     * at a rate of about 16 jobs each second.
     * </p>
     * <p>
     * It's not necessary to disassociate compute environments from a queue before submitting a
     * <code>DeleteJobQueue</code> request.
     * </p>
     * 
     * @param deleteJobQueueRequest
     *        Contains the parameters for <code>DeleteJobQueue</code>.
     * @return A Java Future containing the result of the DeleteJobQueue operation returned by the service.
     * @sample AWSBatchAsync.DeleteJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(DeleteJobQueueRequest deleteJobQueueRequest);

    /**
     * <p>
     * Deletes the specified job queue. You must first disable submissions for a queue with the <a>UpdateJobQueue</a>
     * operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated
     * at a rate of about 16 jobs each second.
     * </p>
     * <p>
     * It's not necessary to disassociate compute environments from a queue before submitting a
     * <code>DeleteJobQueue</code> request.
     * </p>
     * 
     * @param deleteJobQueueRequest
     *        Contains the parameters for <code>DeleteJobQueue</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJobQueue operation returned by the service.
     * @sample AWSBatchAsyncHandler.DeleteJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(DeleteJobQueueRequest deleteJobQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobQueueRequest, DeleteJobQueueResult> asyncHandler);

    /**
     * <p>
     * Deregisters an AWS Batch job definition. Job definitions are permanently deleted after 180 days.
     * </p>
     * 
     * @param deregisterJobDefinitionRequest
     * @return A Java Future containing the result of the DeregisterJobDefinition operation returned by the service.
     * @sample AWSBatchAsync.DeregisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeregisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(DeregisterJobDefinitionRequest deregisterJobDefinitionRequest);

    /**
     * <p>
     * Deregisters an AWS Batch job definition. Job definitions are permanently deleted after 180 days.
     * </p>
     * 
     * @param deregisterJobDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterJobDefinition operation returned by the service.
     * @sample AWSBatchAsyncHandler.DeregisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeregisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(DeregisterJobDefinitionRequest deregisterJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterJobDefinitionRequest, DeregisterJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your compute environments.
     * </p>
     * <p>
     * If you're using an unmanaged compute environment, you can use the <code>DescribeComputeEnvironment</code>
     * operation to determine the <code>ecsClusterArn</code> that you should launch your Amazon ECS container instances
     * into.
     * </p>
     * 
     * @param describeComputeEnvironmentsRequest
     *        Contains the parameters for <code>DescribeComputeEnvironments</code>.
     * @return A Java Future containing the result of the DescribeComputeEnvironments operation returned by the service.
     * @sample AWSBatchAsync.DescribeComputeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeComputeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(
            DescribeComputeEnvironmentsRequest describeComputeEnvironmentsRequest);

    /**
     * <p>
     * Describes one or more of your compute environments.
     * </p>
     * <p>
     * If you're using an unmanaged compute environment, you can use the <code>DescribeComputeEnvironment</code>
     * operation to determine the <code>ecsClusterArn</code> that you should launch your Amazon ECS container instances
     * into.
     * </p>
     * 
     * @param describeComputeEnvironmentsRequest
     *        Contains the parameters for <code>DescribeComputeEnvironments</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComputeEnvironments operation returned by the service.
     * @sample AWSBatchAsyncHandler.DescribeComputeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeComputeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(
            DescribeComputeEnvironmentsRequest describeComputeEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComputeEnvironmentsRequest, DescribeComputeEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Describes a list of job definitions. You can specify a <code>status</code> (such as <code>ACTIVE</code>) to only
     * return job definitions that match that status.
     * </p>
     * 
     * @param describeJobDefinitionsRequest
     *        Contains the parameters for <code>DescribeJobDefinitions</code>.
     * @return A Java Future containing the result of the DescribeJobDefinitions operation returned by the service.
     * @sample AWSBatchAsync.DescribeJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(DescribeJobDefinitionsRequest describeJobDefinitionsRequest);

    /**
     * <p>
     * Describes a list of job definitions. You can specify a <code>status</code> (such as <code>ACTIVE</code>) to only
     * return job definitions that match that status.
     * </p>
     * 
     * @param describeJobDefinitionsRequest
     *        Contains the parameters for <code>DescribeJobDefinitions</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobDefinitions operation returned by the service.
     * @sample AWSBatchAsyncHandler.DescribeJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(DescribeJobDefinitionsRequest describeJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobDefinitionsRequest, DescribeJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your job queues.
     * </p>
     * 
     * @param describeJobQueuesRequest
     *        Contains the parameters for <code>DescribeJobQueues</code>.
     * @return A Java Future containing the result of the DescribeJobQueues operation returned by the service.
     * @sample AWSBatchAsync.DescribeJobQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(DescribeJobQueuesRequest describeJobQueuesRequest);

    /**
     * <p>
     * Describes one or more of your job queues.
     * </p>
     * 
     * @param describeJobQueuesRequest
     *        Contains the parameters for <code>DescribeJobQueues</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobQueues operation returned by the service.
     * @sample AWSBatchAsyncHandler.DescribeJobQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(DescribeJobQueuesRequest describeJobQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobQueuesRequest, DescribeJobQueuesResult> asyncHandler);

    /**
     * <p>
     * Describes a list of AWS Batch jobs.
     * </p>
     * 
     * @param describeJobsRequest
     *        Contains the parameters for <code>DescribeJobs</code>.
     * @return A Java Future containing the result of the DescribeJobs operation returned by the service.
     * @sample AWSBatchAsync.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Describes a list of AWS Batch jobs.
     * </p>
     * 
     * @param describeJobsRequest
     *        Contains the parameters for <code>DescribeJobs</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobs operation returned by the service.
     * @sample AWSBatchAsyncHandler.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS Batch jobs.
     * </p>
     * <p>
     * You must specify only one of the following items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A job queue ID to return a list of jobs in that job queue
     * </p>
     * </li>
     * <li>
     * <p>
     * A multi-node parallel job ID to return a list of nodes for that job
     * </p>
     * </li>
     * <li>
     * <p>
     * An array job ID to return a list of the children for that job
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can filter the results by job status with the <code>jobStatus</code> parameter. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param listJobsRequest
     *        Contains the parameters for <code>ListJobs</code>.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSBatchAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Returns a list of AWS Batch jobs.
     * </p>
     * <p>
     * You must specify only one of the following items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A job queue ID to return a list of jobs in that job queue
     * </p>
     * </li>
     * <li>
     * <p>
     * A multi-node parallel job ID to return a list of nodes for that job
     * </p>
     * </li>
     * <li>
     * <p>
     * An array job ID to return a list of the children for that job
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can filter the results by job status with the <code>jobStatus</code> parameter. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param listJobsRequest
     *        Contains the parameters for <code>ListJobs</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSBatchAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for an AWS Batch resource. AWS Batch resources that support tags are compute environments, jobs,
     * job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP) jobs are not
     * supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBatchAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for an AWS Batch resource. AWS Batch resources that support tags are compute environments, jobs,
     * job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP) jobs are not
     * supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBatchAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Registers an AWS Batch job definition.
     * </p>
     * 
     * @param registerJobDefinitionRequest
     *        Contains the parameters for <code>RegisterJobDefinition</code>.
     * @return A Java Future containing the result of the RegisterJobDefinition operation returned by the service.
     * @sample AWSBatchAsync.RegisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RegisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(RegisterJobDefinitionRequest registerJobDefinitionRequest);

    /**
     * <p>
     * Registers an AWS Batch job definition.
     * </p>
     * 
     * @param registerJobDefinitionRequest
     *        Contains the parameters for <code>RegisterJobDefinition</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterJobDefinition operation returned by the service.
     * @sample AWSBatchAsyncHandler.RegisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RegisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(RegisterJobDefinitionRequest registerJobDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterJobDefinitionRequest, RegisterJobDefinitionResult> asyncHandler);

    /**
     * <p>
     * Submits an AWS Batch job from a job definition. Parameters that are specified during <a>SubmitJob</a> override
     * parameters defined in the job definition. vCPU and memory requirements that are specified in the
     * <code>ResourceRequirements</code> objects in the job definition are the exception. They can't be overridden this
     * way using the <code>memory</code> and <code>vcpus</code> parameters. Rather, you must specify updates to job
     * definition parameters in a <code>ResourceRequirements</code> object that's included in the
     * <code>containerOverrides</code> parameter.
     * </p>
     * <important>
     * <p>
     * Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14
     * days, Fargate resources might become unavailable and job might be terminated.
     * </p>
     * </important>
     * 
     * @param submitJobRequest
     *        Contains the parameters for <code>SubmitJob</code>.
     * @return A Java Future containing the result of the SubmitJob operation returned by the service.
     * @sample AWSBatchAsync.SubmitJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SubmitJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubmitJobResult> submitJobAsync(SubmitJobRequest submitJobRequest);

    /**
     * <p>
     * Submits an AWS Batch job from a job definition. Parameters that are specified during <a>SubmitJob</a> override
     * parameters defined in the job definition. vCPU and memory requirements that are specified in the
     * <code>ResourceRequirements</code> objects in the job definition are the exception. They can't be overridden this
     * way using the <code>memory</code> and <code>vcpus</code> parameters. Rather, you must specify updates to job
     * definition parameters in a <code>ResourceRequirements</code> object that's included in the
     * <code>containerOverrides</code> parameter.
     * </p>
     * <important>
     * <p>
     * Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14
     * days, Fargate resources might become unavailable and job might be terminated.
     * </p>
     * </important>
     * 
     * @param submitJobRequest
     *        Contains the parameters for <code>SubmitJob</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitJob operation returned by the service.
     * @sample AWSBatchAsyncHandler.SubmitJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SubmitJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubmitJobResult> submitJobAsync(SubmitJobRequest submitJobRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitJobRequest, SubmitJobResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well. AWS Batch resources that support tags are compute
     * environments, jobs, job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP)
     * jobs are not supported.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBatchAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well. AWS Batch resources that support tags are compute
     * environments, jobs, job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP)
     * jobs are not supported.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBatchAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Terminates a job in a job queue. Jobs that are in the <code>STARTING</code> or <code>RUNNING</code> state are
     * terminated, which causes them to transition to <code>FAILED</code>. Jobs that have not progressed to the
     * <code>STARTING</code> state are cancelled.
     * </p>
     * 
     * @param terminateJobRequest
     *        Contains the parameters for <code>TerminateJob</code>.
     * @return A Java Future containing the result of the TerminateJob operation returned by the service.
     * @sample AWSBatchAsync.TerminateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TerminateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(TerminateJobRequest terminateJobRequest);

    /**
     * <p>
     * Terminates a job in a job queue. Jobs that are in the <code>STARTING</code> or <code>RUNNING</code> state are
     * terminated, which causes them to transition to <code>FAILED</code>. Jobs that have not progressed to the
     * <code>STARTING</code> state are cancelled.
     * </p>
     * 
     * @param terminateJobRequest
     *        Contains the parameters for <code>TerminateJob</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateJob operation returned by the service.
     * @sample AWSBatchAsyncHandler.TerminateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TerminateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(TerminateJobRequest terminateJobRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateJobRequest, TerminateJobResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from an AWS Batch resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBatchAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from an AWS Batch resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBatchAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an AWS Batch compute environment.
     * </p>
     * 
     * @param updateComputeEnvironmentRequest
     *        Contains the parameters for <code>UpdateComputeEnvironment</code>.
     * @return A Java Future containing the result of the UpdateComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsync.UpdateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest);

    /**
     * <p>
     * Updates an AWS Batch compute environment.
     * </p>
     * 
     * @param updateComputeEnvironmentRequest
     *        Contains the parameters for <code>UpdateComputeEnvironment</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComputeEnvironment operation returned by the service.
     * @sample AWSBatchAsyncHandler.UpdateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComputeEnvironmentRequest, UpdateComputeEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates a job queue.
     * </p>
     * 
     * @param updateJobQueueRequest
     *        Contains the parameters for <code>UpdateJobQueue</code>.
     * @return A Java Future containing the result of the UpdateJobQueue operation returned by the service.
     * @sample AWSBatchAsync.UpdateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(UpdateJobQueueRequest updateJobQueueRequest);

    /**
     * <p>
     * Updates a job queue.
     * </p>
     * 
     * @param updateJobQueueRequest
     *        Contains the parameters for <code>UpdateJobQueue</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobQueue operation returned by the service.
     * @sample AWSBatchAsyncHandler.UpdateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(UpdateJobQueueRequest updateJobQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobQueueRequest, UpdateJobQueueResult> asyncHandler);

}
