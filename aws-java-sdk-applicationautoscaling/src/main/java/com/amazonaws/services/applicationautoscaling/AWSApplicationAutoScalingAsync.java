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
package com.amazonaws.services.applicationautoscaling;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;

/**
 * Interface for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationautoscaling.AbstractAWSApplicationAutoScalingAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Application Auto Scaling, you can configure automatic scaling for the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot Fleet requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR clusters
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon AppStream 2.0 fleets
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon DynamoDB tables and global secondary indexes throughput capacity
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora Replicas
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker endpoint variants
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom resources provided by your own applications or services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Comprehend document classification and entity recognizer endpoints
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Lambda function provisioned concurrency
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Keyspaces (for Apache Cassandra) tables
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Managed Streaming for Apache Kafka broker storage
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>API Summary</b>
 * </p>
 * <p>
 * The Application Auto Scaling service API includes three key sets of actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Register and manage scalable targets - Register AWS or custom resources as scalable targets (a resource that
 * Application Auto Scaling can scale), set minimum and maximum capacity limits, and retrieve information on existing
 * scalable targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage automatic scaling - Define scaling policies to dynamically scale your resources in response to
 * CloudWatch alarms, schedule one-time or recurring scaling actions, and retrieve your recent scaling activity history.
 * </p>
 * </li>
 * <li>
 * <p>
 * Suspend and resume scaling - Temporarily suspend and later resume automatic scaling by calling the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html"
 * >RegisterScalableTarget</a> API action for any Application Auto Scaling scalable target. You can suspend and resume
 * (individually or in combination) scale-out activities that are triggered by a scaling policy, scale-in activities
 * that are triggered by a scaling policy, and scheduled scaling.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To learn more about Application Auto Scaling, including information about granting IAM users required permissions for
 * Application Auto Scaling actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
 * >Application Auto Scaling User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSApplicationAutoScalingAsync extends AWSApplicationAutoScaling {

    /**
     * <p>
     * Deletes the specified scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm
     * associated with the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#delete-step-scaling-policy"
     * >Delete a step scaling policy</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#delete-target-tracking-policy"
     * >Delete a target tracking scaling policy</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes the specified scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm
     * associated with the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#delete-step-scaling-policy"
     * >Delete a step scaling policy</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#delete-target-tracking-policy"
     * >Delete a target tracking scaling policy</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html#delete-scheduled-action"
     * >Delete a scheduled action</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html#delete-scheduled-action"
     * >Delete a scheduled action</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Deregisters an Application Auto Scaling scalable target when you have finished using it. To see which resources
     * have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>.
     * </p>
     * <note>
     * <p>
     * Deregistering a scalable target deletes the scaling policies and the scheduled actions that are associated with
     * it.
     * </p>
     * </note>
     * 
     * @param deregisterScalableTargetRequest
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeregisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest);

    /**
     * <p>
     * Deregisters an Application Auto Scaling scalable target when you have finished using it. To see which resources
     * have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>.
     * </p>
     * <note>
     * <p>
     * Deregistering a scalable target deletes the scaling policies and the scheduled actions that are associated with
     * it.
     * </p>
     * </note>
     * 
     * @param deregisterScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeregisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterScalableTargetRequest, DeregisterScalableTargetResult> asyncHandler);

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceIds</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalableTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalableTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest);

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceIds</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalableTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalableTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalableTargetsRequest, DescribeScalableTargetsResult> asyncHandler);

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingActivities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingActivities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Describes the Application Auto Scaling scaling policies for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Describes the Application Auto Scaling scaling policies for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes the Application Auto Scaling scheduled actions for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>ScheduledActionNames</code> parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html"
     * >Managing scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * <p>
     * Describes the Application Auto Scaling scheduled actions for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>ScheduledActionNames</code> parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html"
     * >Managing scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
     * applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
     * have registered the resource as a scalable target.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
     * target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
     * multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
     * Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and
     * scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
     * and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
     * (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * We recommend caution, however, when using target tracking scaling policies with step scaling policies because
     * conflicts between these policies can cause undesirable behavior. For example, if the step scaling policy
     * initiates a scale-in activity before the target tracking policy is ready to scale in, the scale-in activity will
     * not be blocked. After the scale-in activity completes, the target tracking policy could instruct the scalable
     * target to scale out again.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to execute scaling policies. Any
     * scaling policies that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScalingPolicyRequest
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
     * applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
     * have registered the resource as a scalable target.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
     * target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
     * multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
     * Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and
     * scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
     * and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
     * (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * We recommend caution, however, when using target tracking scaling policies with step scaling policies because
     * conflicts between these policies can cause undesirable behavior. For example, if the step scaling policy
     * initiates a scale-in activity before the target tracking policy is ready to scale in, the scale-in activity will
     * not be blocked. After the scale-in activity completes, the target tracking policy could instruct the scalable
     * target to scale out again.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to execute scaling policies. Any
     * scaling policies that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
     * action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
     * until you have registered the resource as a scalable target.
     * </p>
     * <p>
     * When start and end times are specified with a recurring schedule using a cron expression or rates, they form the
     * boundaries for when the recurring action starts and stops.
     * </p>
     * <p>
     * To update a scheduled action, specify the parameters that you want to change. If you don't specify start and end
     * times, the old values are deleted.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to run scheduled actions. Any
     * scheduled actions that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScheduledActionRequest
     * @return A Java Future containing the result of the PutScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.PutScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(PutScheduledActionRequest putScheduledActionRequest);

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
     * action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
     * until you have registered the resource as a scalable target.
     * </p>
     * <p>
     * When start and end times are specified with a recurring schedule using a cron expression or rates, they form the
     * boundaries for when the recurring action starts and stops.
     * </p>
     * <p>
     * To update a scheduled action, specify the parameters that you want to change. If you don't specify start and end
     * times, the old values are deleted.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to run scheduled actions. Any
     * scheduled actions that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.PutScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(PutScheduledActionRequest putScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutScheduledActionRequest, PutScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Registers or updates a scalable target.
     * </p>
     * <p>
     * A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are
     * uniquely identified by the combination of resource ID, scalable dimension, and namespace.
     * </p>
     * <p>
     * When you register a new scalable target, you must specify values for minimum and maximum capacity. Current
     * capacity will be adjusted within the specified range when scaling starts. Application Auto Scaling scaling
     * policies will not scale capacity to values that are outside of this range.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
     * operations. To see which resources have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. You can also view the scaling policies for a service namespace by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. If you no longer need a scalable target, you can deregister it by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DeregisterScalableTarget.html"
     * >DeregisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a scalable target, specify the parameters that you want to change. Include the parameters that identify
     * the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are
     * not changed by this update request.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.RegisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest);

    /**
     * <p>
     * Registers or updates a scalable target.
     * </p>
     * <p>
     * A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are
     * uniquely identified by the combination of resource ID, scalable dimension, and namespace.
     * </p>
     * <p>
     * When you register a new scalable target, you must specify values for minimum and maximum capacity. Current
     * capacity will be adjusted within the specified range when scaling starts. Application Auto Scaling scaling
     * policies will not scale capacity to values that are outside of this range.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
     * operations. To see which resources have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. You can also view the scaling policies for a service namespace by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. If you no longer need a scalable target, you can deregister it by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DeregisterScalableTarget.html"
     * >DeregisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a scalable target, specify the parameters that you want to change. Include the parameters that identify
     * the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are
     * not changed by this update request.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.RegisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterScalableTargetRequest, RegisterScalableTargetResult> asyncHandler);

}
