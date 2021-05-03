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
package com.amazonaws.services.autoscaling;

import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Auto Scaling asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.autoscaling.AbstractAmazonAutoScalingAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon EC2 Auto Scaling</fullname>
 * <p>
 * Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined scaling
 * policies, scheduled actions, and health checks. Use this service with AWS Auto Scaling, Amazon CloudWatch, and
 * Elastic Load Balancing.
 * </p>
 * <p>
 * For more information, including information about granting IAM users required permissions for Amazon EC2 Auto Scaling
 * actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html">Amazon EC2 Auto
 * Scaling User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAutoScalingAsync extends AmazonAutoScaling {

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of
     * instances being attached. If the number of instances being attached plus the desired capacity of the group
     * exceeds the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html">Attach EC2 instances to
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @return A Java Future containing the result of the AttachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsync.AttachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest);

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of
     * instances being attached. If the number of instances being attached plus the desired capacity of the group
     * exceeds the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html">Attach EC2 instances to
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.AttachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesRequest, AttachInstancesResult> asyncHandler);

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation is used with the following load balancer types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.
     * </p>
     * </li>
     * <li>
     * <p>
     * Gateway Load Balancer - Operates at the network layer (layer 3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * To describe the target groups for an Auto Scaling group, call the <a>DescribeLoadBalancerTargetGroups</a> API. To
     * detach the target group from the Auto Scaling group, call the <a>DetachLoadBalancerTargetGroups</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     * @return A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.AttachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation is used with the following load balancer types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.
     * </p>
     * </li>
     * <li>
     * <p>
     * Gateway Load Balancer - Operates at the network layer (layer 3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * To describe the target groups for an Auto Scaling group, call the <a>DescribeLoadBalancerTargetGroups</a> API. To
     * detach the target group from the Auto Scaling group, call the <a>DetachLoadBalancerTargetGroups</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.AttachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTargetGroupsRequest, AttachLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * To attach an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer, use the
     * <a>AttachLoadBalancerTargetGroups</a> API operation instead.
     * </p>
     * </note>
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. Amazon EC2 Auto Scaling
     * registers the running instances with these Classic Load Balancers.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, call the <a>DescribeLoadBalancers</a> API. To detach
     * the load balancer from the Auto Scaling group, call the <a>DetachLoadBalancers</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @return A Java Future containing the result of the AttachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.AttachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest attachLoadBalancersRequest);

    /**
     * <note>
     * <p>
     * To attach an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer, use the
     * <a>AttachLoadBalancerTargetGroups</a> API operation instead.
     * </p>
     * </note>
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. Amazon EC2 Auto Scaling
     * registers the running instances with these Classic Load Balancers.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, call the <a>DescribeLoadBalancers</a> API. To detach
     * the load balancer from the Auto Scaling group, call the <a>DetachLoadBalancers</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.AttachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest attachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation with an AsyncHandler.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return A Java Future containing the result of the BatchDeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.BatchDeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest);

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.BatchDeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteScheduledActionRequest, BatchDeleteScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return A Java Future containing the result of the BatchPutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.BatchPutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.BatchPutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutScheduledUpdateGroupActionRequest, BatchPutScheduledUpdateGroupActionResult> asyncHandler);

    /**
     * <p>
     * Cancels an instance refresh operation in progress. Cancellation does not roll back any replacements that have
     * already been completed, but it prevents new replacements from being started.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cancelInstanceRefreshRequest
     * @return A Java Future containing the result of the CancelInstanceRefresh operation returned by the service.
     * @sample AmazonAutoScalingAsync.CancelInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CancelInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelInstanceRefreshResult> cancelInstanceRefreshAsync(CancelInstanceRefreshRequest cancelInstanceRefreshRequest);

    /**
     * <p>
     * Cancels an instance refresh operation in progress. Cancellation does not roll back any replacements that have
     * already been completed, but it prevents new replacements from being started.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cancelInstanceRefreshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelInstanceRefresh operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CancelInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CancelInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelInstanceRefreshResult> cancelInstanceRefreshAsync(CancelInstanceRefreshRequest cancelInstanceRefreshRequest,
            com.amazonaws.handlers.AsyncHandler<CancelInstanceRefreshRequest, CancelInstanceRefreshResult> asyncHandler);

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @return A Java Future containing the result of the CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.CompleteLifecycleAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CompleteLifecycleAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest completeLifecycleActionRequest);

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CompleteLifecycleAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CompleteLifecycleAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest completeLifecycleActionRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler);

    /**
     * <p>
     * <b>We strongly recommend using a launch template when calling this operation to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For introductory exercises for creating an Auto Scaling group, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/GettingStartedTutorial.html">Getting started with
     * Amazon EC2 Auto Scaling</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-register-lbs-with-asg.html">Tutorial: Set up a
     * scaled and load-balanced application</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html">Auto Scaling groups</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @return A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest createAutoScalingGroupRequest);

    /**
     * <p>
     * <b>We strongly recommend using a launch template when calling this operation to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For introductory exercises for creating an Auto Scaling group, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/GettingStartedTutorial.html">Getting started with
     * Amazon EC2 Auto Scaling</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-register-lbs-with-asg.html">Tutorial: Set up a
     * scaled and load-balanced application</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html">Auto Scaling groups</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoScalingGroupRequest, CreateAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html">Launch configurations</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @return A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html">Launch configurations</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationRequest, CreateLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @return A Java Future containing the result of the CreateOrUpdateTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateOrUpdateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateOrUpdateTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrUpdateTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateOrUpdateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateOrUpdateTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call the <a>DetachInstances</a> API with the
     * list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling
     * does not launch replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call the <a>UpdateAutoScalingGroup</a> API and
     * set the minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @return A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call the <a>DetachInstances</a> API with the
     * list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling
     * does not launch replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call the <a>UpdateAutoScalingGroup</a> API and
     * set the minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingGroupRequest, DeleteAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @return A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationRequest, DeleteLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @return A Java Future containing the result of the DeleteLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLifecycleHook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest deleteLifecycleHookRequest);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLifecycleHook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @return A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DeleteNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationConfigurationRequest, DeleteNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified scaling policy.
     * </p>
     * <p>
     * Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does
     * not delete the alarm, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/deleting-scaling-policy.html">Deleting a scaling
     * policy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified scaling policy.
     * </p>
     * <p>
     * Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does
     * not delete the alarm, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/deleting-scaling-policy.html">Deleting a scaling
     * policy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the warm pool for the specified Auto Scaling group.
     * </p>
     * 
     * @param deleteWarmPoolRequest
     * @return A Java Future containing the result of the DeleteWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWarmPoolResult> deleteWarmPoolAsync(DeleteWarmPoolRequest deleteWarmPoolRequest);

    /**
     * <p>
     * Deletes the warm pool for the specified Auto Scaling group.
     * </p>
     * 
     * @param deleteWarmPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWarmPoolResult> deleteWarmPoolAsync(DeleteWarmPoolRequest deleteWarmPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWarmPoolRequest, DeleteWarmPoolResult> asyncHandler);

    /**
     * <p>
     * Describes the current Amazon EC2 Auto Scaling resource quotas for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Describes the current Amazon EC2 Auto Scaling resource quotas for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync();

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation with an AsyncHandler.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Describes the available adjustment types for Amazon EC2 Auto Scaling scaling policies. These settings apply to
     * step scaling policies and simple scaling policies; they do not apply to target tracking scaling policies.
     * </p>
     * <p>
     * The following adjustment types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ChangeInCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ExactCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * PercentChangeInCapacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAdjustmentTypesRequest
     * @return A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAdjustmentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAdjustmentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest);

    /**
     * <p>
     * Describes the available adjustment types for Amazon EC2 Auto Scaling scaling policies. These settings apply to
     * step scaling policies and simple scaling policies; they do not apply to target tracking scaling policies.
     * </p>
     * <p>
     * The following adjustment types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ChangeInCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ExactCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * PercentChangeInCapacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAdjustmentTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAdjustmentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAdjustmentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync();

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation with an AsyncHandler.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation with an AsyncHandler.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation with an AsyncHandler.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingNotificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingNotificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest);

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingNotificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingNotificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation with an AsyncHandler.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more instance refreshes.
     * </p>
     * <p>
     * You can determine the status of a request by looking at the <code>Status</code> parameter. The following are the
     * possible statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeInstanceRefreshesRequest
     * @return A Java Future containing the result of the DescribeInstanceRefreshes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeInstanceRefreshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeInstanceRefreshes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceRefreshesResult> describeInstanceRefreshesAsync(
            DescribeInstanceRefreshesRequest describeInstanceRefreshesRequest);

    /**
     * <p>
     * Describes one or more instance refreshes.
     * </p>
     * <p>
     * You can determine the status of a request by looking at the <code>Status</code> parameter. The following are the
     * possible statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeInstanceRefreshesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceRefreshes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeInstanceRefreshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeInstanceRefreshes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceRefreshesResult> describeInstanceRefreshesAsync(
            DescribeInstanceRefreshesRequest describeInstanceRefreshesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceRefreshesRequest, DescribeInstanceRefreshesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeLaunchConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLaunchConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest);

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLaunchConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLaunchConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation with an AsyncHandler.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHookTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHookTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLifecycleHookTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHookTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHookTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync();

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation with an AsyncHandler.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHooks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest describeLifecycleHooksRequest);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHooks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler);

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerTargetGroupsRequest, DescribeLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation describes only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DescribeLoadBalancerTargetGroups</a> API instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation describes only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DescribeLoadBalancerTargetGroups</a> API instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request this metric
     * when calling the <a>EnableMetricsCollection</a> API.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeMetricCollectionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeMetricCollectionTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request this metric
     * when calling the <a>EnableMetricsCollection</a> API.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeMetricCollectionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeMetricCollectionTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync();

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation with an AsyncHandler.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeNotificationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeNotificationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeNotificationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeNotificationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation with an AsyncHandler.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return A Java Future containing the result of the DescribePolicies operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest describePoliciesRequest);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePolicies operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest describePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync();

    /**
     * Simplified method form for invoking the DescribePolicies operation with an AsyncHandler.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling group.
     * </p>
     * <p>
     * To view the scaling activities from the Amazon EC2 Auto Scaling console, choose the <b>Activity</b> tab of the
     * Auto Scaling group. When scaling events occur, you see scaling activity messages in the <b>Activity history</b>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-verify-scaling-activity.html">Verifying a scaling
     * activity for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling group.
     * </p>
     * <p>
     * To view the scaling activities from the Amazon EC2 Auto Scaling console, choose the <b>Activity</b> tab of the
     * Auto Scaling group. When scaling events occur, you see scaling activity messages in the <b>Activity history</b>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-verify-scaling-activity.html">Verifying a scaling
     * activity for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation with an AsyncHandler.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Describes the scaling process types for use with the <a>ResumeProcesses</a> and <a>SuspendProcesses</a> APIs.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingProcessTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingProcessTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest);

    /**
     * <p>
     * Describes the scaling process types for use with the <a>ResumeProcesses</a> and <a>SuspendProcesses</a> APIs.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingProcessTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingProcessTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation with an AsyncHandler.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end
     * time. To describe the actions that have already run, call the <a>DescribeScalingActivities</a> API.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end
     * time. To describe the actions that have already run, call the <a>DescribeScalingActivities</a> API.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync();

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation with an AsyncHandler.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync();

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeTerminationPolicyTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTerminationPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest);

    /**
     * <p>
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTerminationPolicyTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTerminationPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync();

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation with an AsyncHandler.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * <p>
     * Describes a warm pool and its instances.
     * </p>
     * 
     * @param describeWarmPoolRequest
     * @return A Java Future containing the result of the DescribeWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeWarmPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWarmPoolResult> describeWarmPoolAsync(DescribeWarmPoolRequest describeWarmPoolRequest);

    /**
     * <p>
     * Describes a warm pool and its instances.
     * </p>
     * 
     * @param describeWarmPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeWarmPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWarmPoolResult> describeWarmPoolAsync(DescribeWarmPoolRequest describeWarmPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWarmPoolRequest, DescribeWarmPoolResult> asyncHandler);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independent of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html">Detach EC2 instances from
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @return A Java Future containing the result of the DetachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest detachInstancesRequest);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independent of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html">Detach EC2 instances from
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest detachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler);

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DetachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DetachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancerTargetGroupsRequest, DetachLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DetachLoadBalancerTargetGroups</a> API instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using the
     * <a>DescribeLoadBalancers</a> API call. The instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @return A Java Future containing the result of the DetachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest detachLoadBalancersRequest);

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DetachLoadBalancerTargetGroups</a> API instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using the
     * <a>DescribeLoadBalancers</a> API call. The instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest detachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation with an AsyncHandler.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @return A Java Future containing the result of the DisableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsync.DisableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DisableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest disableMetricsCollectionRequest);

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DisableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DisableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DisableMetricsCollectionRequest, DisableMetricsCollectionResult> asyncHandler);

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html">Monitoring CloudWatch
     * metrics for your Auto Scaling groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @return A Java Future containing the result of the EnableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsync.EnableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest enableMetricsCollectionRequest);

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html">Monitoring CloudWatch
     * metrics for your Auto Scaling groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.EnableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<EnableMetricsCollectionRequest, EnableMetricsCollectionResult> asyncHandler);

    /**
     * <p>
     * Moves the specified instances into the standby state.
     * </p>
     * <p>
     * If you choose to decrement the desired capacity of the Auto Scaling group, the instances can enter standby as
     * long as the desired capacity of the Auto Scaling group after the instances are placed into standby is equal to or
     * greater than the minimum capacity of the group.
     * </p>
     * <p>
     * If you choose not to decrement the desired capacity of the Auto Scaling group, the Auto Scaling group launches
     * new instances to replace the instances on standby.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @return A Java Future containing the result of the EnterStandby operation returned by the service.
     * @sample AmazonAutoScalingAsync.EnterStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnterStandby" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest);

    /**
     * <p>
     * Moves the specified instances into the standby state.
     * </p>
     * <p>
     * If you choose to decrement the desired capacity of the Auto Scaling group, the instances can enter standby as
     * long as the desired capacity of the Auto Scaling group after the instances are placed into standby is equal to or
     * greater than the minimum capacity of the group.
     * </p>
     * <p>
     * If you choose not to decrement the desired capacity of the Auto Scaling group, the Auto Scaling group launches
     * new instances to replace the instances on standby.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnterStandby operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.EnterStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnterStandby" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler);

    /**
     * <p>
     * Executes the specified policy. This can be useful for testing the design of your scaling policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @return A Java Future containing the result of the ExecutePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.ExecutePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExecutePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest executePolicyRequest);

    /**
     * <p>
     * Executes the specified policy. This can be useful for testing the design of your scaling policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecutePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ExecutePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExecutePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest executePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ExecutePolicyRequest, ExecutePolicyResult> asyncHandler);

    /**
     * <p>
     * Moves the specified instances out of the standby state.
     * </p>
     * <p>
     * After you put the instances back in service, the desired capacity is incremented.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @return A Java Future containing the result of the ExitStandby operation returned by the service.
     * @sample AmazonAutoScalingAsync.ExitStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExitStandby" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest);

    /**
     * <p>
     * Moves the specified instances out of the standby state.
     * </p>
     * <p>
     * After you put the instances back in service, the desired capacity is incremented.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExitStandby operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ExitStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExitStandby" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling group.
     * </p>
     * <p>
     * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches
     * (before it is put into service) or as the instance terminates (before it is fully terminated).
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using the
     * <a>RecordLifecycleActionHeartbeat</a> API call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action using the
     * <a>CompleteLifecycleAction</a> API call.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails.
     * </p>
     * <p>
     * You can view the lifecycle hooks for an Auto Scaling group using the <a>DescribeLifecycleHooks</a> API call. If
     * you are no longer using a lifecycle hook, you can delete it by calling the <a>DeleteLifecycleHook</a> API.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @return A Java Future containing the result of the PutLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutLifecycleHook" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest putLifecycleHookRequest);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling group.
     * </p>
     * <p>
     * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches
     * (before it is put into service) or as the instance terminates (before it is fully terminated).
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using the
     * <a>RecordLifecycleActionHeartbeat</a> API call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action using the
     * <a>CompleteLifecycleAction</a> API call.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails.
     * </p>
     * <p>
     * You can view the lifecycle hooks for an Auto Scaling group using the <a>DescribeLifecycleHooks</a> API call. If
     * you are no longer using a lifecycle hook, you can delete it by calling the <a>DeleteLifecycleHook</a> API.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutLifecycleHook" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest putLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html">Getting Amazon SNS
     * notifications when your Auto Scaling group scales</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of SNS topics, which is 10 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @return A Java Future containing the result of the PutNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.PutNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html">Getting Amazon SNS
     * notifications when your Auto Scaling group scales</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of SNS topics, which is 10 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.PutNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutNotificationConfigurationRequest, PutNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scaling policy for an Auto Scaling group.
     * </p>
     * <p>
     * For more information about using scaling policies to scale your Auto Scaling group, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for an Auto Scaling group.
     * </p>
     * <p>
     * For more information about using scaling policies to scale your Auto Scaling group, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html">Scheduled scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @return A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.PutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html">Scheduled scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.PutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutScheduledUpdateGroupActionRequest, PutScheduledUpdateGroupActionResult> asyncHandler);

    /**
     * <p>
     * Adds a warm pool to the specified Auto Scaling group. A warm pool is a pool of pre-initialized EC2 instances that
     * sits alongside the Auto Scaling group. Whenever your application needs to scale out, the Auto Scaling group can
     * draw on the warm pool to meet its new desired capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This operation must be called from the Region in which the Auto Scaling group was created. This operation cannot
     * be called on an Auto Scaling group that has a mixed instances policy or a launch template or launch configuration
     * that requests Spot Instances.
     * </p>
     * <p>
     * You can view the instances in the warm pool using the <a>DescribeWarmPool</a> API call. If you are no longer
     * using a warm pool, you can delete it by calling the <a>DeleteWarmPool</a> API.
     * </p>
     * 
     * @param putWarmPoolRequest
     * @return A Java Future containing the result of the PutWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutWarmPoolResult> putWarmPoolAsync(PutWarmPoolRequest putWarmPoolRequest);

    /**
     * <p>
     * Adds a warm pool to the specified Auto Scaling group. A warm pool is a pool of pre-initialized EC2 instances that
     * sits alongside the Auto Scaling group. Whenever your application needs to scale out, the Auto Scaling group can
     * draw on the warm pool to meet its new desired capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This operation must be called from the Region in which the Auto Scaling group was created. This operation cannot
     * be called on an Auto Scaling group that has a mixed instances policy or a launch template or launch configuration
     * that requests Spot Instances.
     * </p>
     * <p>
     * You can view the instances in the warm pool using the <a>DescribeWarmPool</a> API call. If you are no longer
     * using a warm pool, you can delete it by calling the <a>DeleteWarmPool</a> API.
     * </p>
     * 
     * @param putWarmPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutWarmPool operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutWarmPoolResult> putWarmPoolAsync(PutWarmPoolRequest putWarmPoolRequest,
            com.amazonaws.handlers.AsyncHandler<PutWarmPoolRequest, PutWarmPoolResult> asyncHandler);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using the <a>PutLifecycleHook</a> API call.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @return A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.RecordLifecycleActionHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RecordLifecycleActionHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using the <a>PutLifecycleHook</a> API call.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.RecordLifecycleActionHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RecordLifecycleActionHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler);

    /**
     * <p>
     * Resumes the specified suspended auto scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @return A Java Future containing the result of the ResumeProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsync.ResumeProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ResumeProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest);

    /**
     * <p>
     * Resumes the specified suspended auto scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ResumeProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ResumeProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeProcessesRequest, ResumeProcessesResult> asyncHandler);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-manual-scaling.html">Manual scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @return A Java Future containing the result of the SetDesiredCapacity operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetDesiredCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetDesiredCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-manual-scaling.html">Manual scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDesiredCapacity operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetDesiredCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetDesiredCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<SetDesiredCapacityRequest, SetDesiredCapacityResult> asyncHandler);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * checks for Auto Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @return A Java Future containing the result of the SetInstanceHealth operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceHealth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * checks for Auto Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetInstanceHealth operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceHealth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceHealthRequest, SetInstanceHealthResult> asyncHandler);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances. This operation cannot be called on instances
     * in a warm pool.
     * </p>
     * <p>
     * For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
     * in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of instance IDs, which is 50 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @return A Java Future containing the result of the SetInstanceProtection operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetInstanceProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest setInstanceProtectionRequest);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances. This operation cannot be called on instances
     * in a warm pool.
     * </p>
     * <p>
     * For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
     * in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of instance IDs, which is 50 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetInstanceProtection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest setInstanceProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler);

    /**
     * <p>
     * Starts a new instance refresh operation, which triggers a rolling replacement of previously launched instances in
     * the Auto Scaling group with a new group of instances.
     * </p>
     * <p>
     * If successful, this call creates a new instance refresh request with a unique ID that you can use to track its
     * progress. To query its status, call the <a>DescribeInstanceRefreshes</a> API. To describe the instance refreshes
     * that have already run, call the <a>DescribeInstanceRefreshes</a> API. To cancel an instance refresh operation in
     * progress, use the <a>CancelInstanceRefresh</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param startInstanceRefreshRequest
     * @return A Java Future containing the result of the StartInstanceRefresh operation returned by the service.
     * @sample AmazonAutoScalingAsync.StartInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/StartInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceRefreshResult> startInstanceRefreshAsync(StartInstanceRefreshRequest startInstanceRefreshRequest);

    /**
     * <p>
     * Starts a new instance refresh operation, which triggers a rolling replacement of previously launched instances in
     * the Auto Scaling group with a new group of instances.
     * </p>
     * <p>
     * If successful, this call creates a new instance refresh request with a unique ID that you can use to track its
     * progress. To query its status, call the <a>DescribeInstanceRefreshes</a> API. To describe the instance refreshes
     * that have already run, call the <a>DescribeInstanceRefreshes</a> API. To cancel an instance refresh operation in
     * progress, use the <a>CancelInstanceRefresh</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">Replacing Auto Scaling
     * instances based on an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param startInstanceRefreshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstanceRefresh operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.StartInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/StartInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceRefreshResult> startInstanceRefreshAsync(StartInstanceRefreshRequest startInstanceRefreshRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRefreshRequest, StartInstanceRefreshResult> asyncHandler);

    /**
     * <p>
     * Suspends the specified auto scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * If you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent other
     * process types from functioning properly. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * To resume processes that have been suspended, call the <a>ResumeProcesses</a> API.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @return A Java Future containing the result of the SuspendProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsync.SuspendProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest);

    /**
     * <p>
     * Suspends the specified auto scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * If you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent other
     * process types from functioning properly. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * To resume processes that have been suspended, call the <a>ResumeProcesses</a> API.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SuspendProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SuspendProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<SuspendProcessesRequest, SuspendProcessesResult> asyncHandler);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size. This operation cannot be called
     * on instances in a warm pool.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately. When an instance is
     * terminated, the instance status changes to <code>terminated</code>. You can't connect to or start an instance
     * after you've terminated it.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are terminated.
     * </p>
     * <p>
     * By default, Amazon EC2 Auto Scaling balances instances across all Availability Zones. If you decrement the
     * desired capacity, your Auto Scaling group can become unbalanced between Availability Zones. Amazon EC2 Auto
     * Scaling tries to rebalance the group, and rebalancing might terminate instances in other zones. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-benefits.html#AutoScalingBehavior.InstanceUsage"
     * >Rebalancing activities</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @return A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.TerminateInstanceInAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TerminateInstanceInAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size. This operation cannot be called
     * on instances in a warm pool.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately. When an instance is
     * terminated, the instance status changes to <code>terminated</code>. You can't connect to or start an instance
     * after you've terminated it.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are terminated.
     * </p>
     * <p>
     * By default, Amazon EC2 Auto Scaling balances instances across all Availability Zones. If you decrement the
     * desired capacity, your Auto Scaling group can become unbalanced between Availability Zones. Amazon EC2 Auto
     * Scaling tries to rebalance the group, and rebalancing might terminate instances in other zones. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-benefits.html#AutoScalingBehavior.InstanceUsage"
     * >Rebalancing activities</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.TerminateInstanceInAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TerminateInstanceInAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * <b>We strongly recommend that all Auto Scaling groups use launch templates to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any
     * parameters that you don't specify are not changed by this update request. The new settings take effect on any
     * scaling activities after this call returns.
     * </p>
     * <p>
     * If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get
     * the updated configuration. Existing instances continue to run with the configuration that they were originally
     * launched with. When you update a group to specify a mixed instances policy instead of a launch configuration or
     * template, existing instances may be replaced to match the new purchasing options that you specified in the
     * policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies 50% Spot
     * capacity, this means that half of your instances will be gradually terminated and relaunched as Spot Instances.
     * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that
     * updating your group does not compromise the performance or availability of your application.
     * </p>
     * <p>
     * Note the following about changing <code>DesiredCapacity</code>, <code>MaxSize</code>, or <code>MinSize</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MinSize</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MaxSize</code> value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To see which parameters have been set, call the <a>DescribeAutoScalingGroups</a> API. To view the scaling
     * policies for an Auto Scaling group, call the <a>DescribePolicies</a> API. If the group has scaling policies, you
     * can update them by calling the <a>PutScalingPolicy</a> API.
     * </p>
     * 
     * @param updateAutoScalingGroupRequest
     * @return A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.UpdateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/UpdateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest);

    /**
     * <p>
     * <b>We strongly recommend that all Auto Scaling groups use launch templates to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any
     * parameters that you don't specify are not changed by this update request. The new settings take effect on any
     * scaling activities after this call returns.
     * </p>
     * <p>
     * If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get
     * the updated configuration. Existing instances continue to run with the configuration that they were originally
     * launched with. When you update a group to specify a mixed instances policy instead of a launch configuration or
     * template, existing instances may be replaced to match the new purchasing options that you specified in the
     * policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies 50% Spot
     * capacity, this means that half of your instances will be gradually terminated and relaunched as Spot Instances.
     * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that
     * updating your group does not compromise the performance or availability of your application.
     * </p>
     * <p>
     * Note the following about changing <code>DesiredCapacity</code>, <code>MaxSize</code>, or <code>MinSize</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MinSize</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MaxSize</code> value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To see which parameters have been set, call the <a>DescribeAutoScalingGroups</a> API. To view the scaling
     * policies for an Auto Scaling group, call the <a>DescribePolicies</a> API. If the group has scaling policies, you
     * can update them by calling the <a>PutScalingPolicy</a> API.
     * </p>
     * 
     * @param updateAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.UpdateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/UpdateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAutoScalingGroupRequest, UpdateAutoScalingGroupResult> asyncHandler);

}
