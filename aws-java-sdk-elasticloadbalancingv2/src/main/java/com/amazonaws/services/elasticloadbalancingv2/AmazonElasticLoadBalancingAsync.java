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
package com.amazonaws.services.elasticloadbalancingv2;

import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;

/**
 * Interface for accessing Elastic Load Balancing v2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticloadbalancingv2.AbstractAmazonElasticLoadBalancingAsync} instead.
 * </p>
 * <p>
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase
 * the availability of your application. The load balancer also monitors the health of its registered targets and
 * ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic
 * by specifying one or more listeners, which are configured with a protocol and port number for connections from
 * clients to the load balancer. You configure a target group with a protocol and port number for connections from the
 * load balancer to the targets, and with health check settings to be used when checking the health status of the
 * targets.
 * </p>
 * <p>
 * Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load
 * Balancers, Gateway Load Balancers, and Classic Load Balancers. This reference covers the following load balancer
 * types:
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
 * For more information, see the <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic
 * Load Balancing User Guide</a>.
 * </p>
 * <p>
 * All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat
 * an operation, it succeeds.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {

    /**
     * <p>
     * Adds the specified SSL server certificate to the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * <p>
     * If the certificate in already in the certificate list, the call is successful but the certificate is not added
     * again.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html">HTTPS
     * listeners</a> in the <i>Application Load Balancers Guide</i> or <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS listeners</a>
     * in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param addListenerCertificatesRequest
     * @return A Java Future containing the result of the AddListenerCertificates operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.AddListenerCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddListenerCertificatesResult> addListenerCertificatesAsync(AddListenerCertificatesRequest addListenerCertificatesRequest);

    /**
     * <p>
     * Adds the specified SSL server certificate to the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * <p>
     * If the certificate in already in the certificate list, the call is successful but the certificate is not added
     * again.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html">HTTPS
     * listeners</a> in the <i>Application Load Balancers Guide</i> or <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS listeners</a>
     * in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param addListenerCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddListenerCertificates operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.AddListenerCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddListenerCertificatesResult> addListenerCertificatesAsync(AddListenerCertificatesRequest addListenerCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<AddListenerCertificatesRequest, AddListenerCertificatesResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load
     * Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, and rules.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
     * <code>AddTags</code> updates its value.
     * </p>
     * 
     * @param addTagsRequest
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load
     * Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, and rules.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
     * <code>AddTags</code> updates its value.
     * </p>
     * 
     * @param addTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a listener for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">
     * Listeners for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-listeners.html">Listeners
     * for your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-listeners.html">Listeners for
     * your Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * listeners with the same settings, each call succeeds.
     * </p>
     * 
     * @param createListenerRequest
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest);

    /**
     * <p>
     * Creates a listener for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">
     * Listeners for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-listeners.html">Listeners
     * for your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-listeners.html">Listeners for
     * your Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * listeners with the same settings, each call succeeds.
     * </p>
     * 
     * @param createListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler);

    /**
     * <p>
     * Creates an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html">
     * Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html">Network
     * Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-load-balancers.html">Gateway
     * Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * load balancers with the same settings, each call succeeds.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest);

    /**
     * <p>
     * Creates an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html">
     * Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html">Network
     * Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-load-balancers.html">Gateway
     * Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * load balancers with the same settings, each call succeeds.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer.
     * </p>
     * <p>
     * Each rule consists of a priority, one or more actions, and one or more conditions. Rules are evaluated in
     * priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions
     * are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer.
     * </p>
     * <p>
     * Each rule consists of a priority, one or more actions, and one or more conditions. Rules are evaluated in
     * priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions
     * are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a target group.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html">
     * Target groups for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html">Target
     * groups for your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/target-groups.html">Target groups for
     * your Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * target groups with the same settings, each call succeeds.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest);

    /**
     * <p>
     * Creates a target group.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html">
     * Target groups for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html">Target
     * groups for your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/target-groups.html">Target groups for
     * your Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * target groups with the same settings, each call succeeds.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTargetGroupRequest, CreateTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * <p>
     * Alternatively, your listener is deleted when you delete the load balancer to which it is attached.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * <p>
     * Alternatively, your listener is deleted when you delete the load balancer to which it is attached.
     * </p>
     * 
     * @param deleteListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. Deleting a load
     * balancer also deletes its listeners.
     * </p>
     * <p>
     * You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
     * already been deleted, the call succeeds.
     * </p>
     * <p>
     * Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
     * and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
     * terminate them.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

    /**
     * <p>
     * Deletes the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. Deleting a load
     * balancer also deletes its listeners.
     * </p>
     * <p>
     * You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
     * already been deleted, the call succeeds.
     * </p>
     * <p>
     * Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
     * and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
     * terminate them.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * You can't delete the default rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * You can't delete the default rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified target group.
     * </p>
     * <p>
     * You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
     * associated health checks. Deleting a target group does not affect its registered targets. For example, any EC2
     * instances continue to run until you stop or terminate them.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest);

    /**
     * <p>
     * Deletes the specified target group.
     * </p>
     * <p>
     * You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
     * associated health checks. Deleting a target group does not affect its registered targets. For example, any EC2
     * instances continue to run until you stop or terminate them.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetGroupRequest, DeleteTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
     * longer receive traffic from the load balancer.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeregisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
     * longer receive traffic from the load balancer.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeregisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTargetsRequest, DeregisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Describes the current Elastic Load Balancing resource limits for your AWS account.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Quotas
     * for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html">Quotas for
     * your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/quotas-limits.html">Quotas for your
     * Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountLimitsRequest
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Describes the current Elastic Load Balancing resource limits for your AWS account.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Quotas
     * for your Application Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html">Quotas for
     * your Network Load Balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/quotas-limits.html">Quotas for your
     * Gateway Load Balancers</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountLimitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Describes the default certificate and the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * <p>
     * If the default certificate is also in the certificate list, it appears twice in the results (once with
     * <code>IsDefault</code> set to true and once with <code>IsDefault</code> set to false).
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#https-listener-certificates"
     * >SSL certificates</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#tls-listener-certificate"
     * >Server certificates</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeListenerCertificatesRequest
     * @return A Java Future containing the result of the DescribeListenerCertificates operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenerCertificatesResult> describeListenerCertificatesAsync(
            DescribeListenerCertificatesRequest describeListenerCertificatesRequest);

    /**
     * <p>
     * Describes the default certificate and the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * <p>
     * If the default certificate is also in the certificate list, it appears twice in the results (once with
     * <code>IsDefault</code> set to true and once with <code>IsDefault</code> set to false).
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#https-listener-certificates"
     * >SSL certificates</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#tls-listener-certificate"
     * >Server certificates</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeListenerCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeListenerCertificates operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenerCertificatesResult> describeListenerCertificatesAsync(
            DescribeListenerCertificatesRequest describeListenerCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeListenerCertificatesRequest, DescribeListenerCertificatesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified listeners or the listeners for the specified Application Load Balancer, Network Load
     * Balancer, or Gateway Load Balancer. You must specify either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     * @return A Java Future containing the result of the DescribeListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(DescribeListenersRequest describeListenersRequest);

    /**
     * <p>
     * Describes the specified listeners or the listeners for the specified Application Load Balancer, Network Load
     * Balancer, or Gateway Load Balancer. You must specify either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(DescribeListenersRequest describeListenersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeListenersRequest, DescribeListenersResult> asyncHandler);

    /**
     * <p>
     * Describes the attributes for the specified Application Load Balancer, Network Load Balancer, or Gateway Load
     * Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Application Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Network Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Gateway Load Balancers Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest);

    /**
     * <p>
     * Describes the attributes for the specified Application Load Balancer, Network Load Balancer, or Gateway Load
     * Balancer.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Application Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Network Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/gateway-load-balancers.html#load-balancer-attributes"
     * >Load balancer attributes</a> in the <i>Gateway Load Balancers Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified load balancers or all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the specified load balancers or all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
     * or more rules.
     * </p>
     * 
     * @param describeRulesRequest
     * @return A Java Future containing the result of the DescribeRules operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(DescribeRulesRequest describeRulesRequest);

    /**
     * <p>
     * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
     * or more rules.
     * </p>
     * 
     * @param describeRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRules operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(DescribeRulesRequest describeRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRulesRequest, DescribeRulesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified policies or all policies used for SSL negotiation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     * @return A Java Future containing the result of the DescribeSSLPolicies operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeSSLPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeSSLPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(DescribeSSLPoliciesRequest describeSSLPoliciesRequest);

    /**
     * <p>
     * Describes the specified policies or all policies used for SSL negotiation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSSLPolicies operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeSSLPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeSSLPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(DescribeSSLPoliciesRequest describeSSLPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSSLPoliciesRequest, DescribeSSLPoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes the tags for the specified Elastic Load Balancing resources. You can describe the tags for one or more
     * Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags for the specified Elastic Load Balancing resources. You can describe the tags for one or more
     * Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the attributes for the specified target group.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Application Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Network Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Gateway Load Balancers Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTargetGroupAttributesRequest
     * @return A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(
            DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest);

    /**
     * <p>
     * Describes the attributes for the specified target group.
     * </p>
     * <p>
     * For more information, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Application Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Network Load Balancers Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/target-groups.html#target-group-attributes"
     * >Target group attributes</a> in the <i>Gateway Load Balancers Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTargetGroupAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(
            DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupAttributesRequest, DescribeTargetGroupAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified target groups or all of your target groups. By default, all target groups are described.
     * Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
     * names of one or more target groups, or the ARNs of one or more target groups.
     * </p>
     * 
     * @param describeTargetGroupsRequest
     * @return A Java Future containing the result of the DescribeTargetGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(DescribeTargetGroupsRequest describeTargetGroupsRequest);

    /**
     * <p>
     * Describes the specified target groups or all of your target groups. By default, all target groups are described.
     * Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
     * names of one or more target groups, or the ARNs of one or more target groups.
     * </p>
     * 
     * @param describeTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(DescribeTargetGroupsRequest describeTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupsRequest, DescribeTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the health of the specified targets or all of your targets.
     * </p>
     * 
     * @param describeTargetHealthRequest
     * @return A Java Future containing the result of the DescribeTargetHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(DescribeTargetHealthRequest describeTargetHealthRequest);

    /**
     * <p>
     * Describes the health of the specified targets or all of your targets.
     * </p>
     * 
     * @param describeTargetHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(DescribeTargetHealthRequest describeTargetHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetHealthRequest, DescribeTargetHealthResult> asyncHandler);

    /**
     * <p>
     * Replaces the specified properties of the specified listener. Any properties that you do not specify remain
     * unchanged.
     * </p>
     * <p>
     * Changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate
     * properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy
     * and default certificate properties.
     * </p>
     * <p>
     * To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire
     * list. For example, to add an action, specify a list with the current actions plus the new action.
     * </p>
     * 
     * @param modifyListenerRequest
     * @return A Java Future containing the result of the ModifyListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(ModifyListenerRequest modifyListenerRequest);

    /**
     * <p>
     * Replaces the specified properties of the specified listener. Any properties that you do not specify remain
     * unchanged.
     * </p>
     * <p>
     * Changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate
     * properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy
     * and default certificate properties.
     * </p>
     * <p>
     * To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire
     * list. For example, to add an action, specify a list with the current actions plus the new action.
     * </p>
     * 
     * @param modifyListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(ModifyListenerRequest modifyListenerRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyListenerRequest, ModifyListenerResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attributes of the specified Application Load Balancer, Network Load Balancer, or Gateway
     * Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest);

    /**
     * <p>
     * Modifies the specified attributes of the specified Application Load Balancer, Network Load Balancer, or Gateway
     * Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler);

    /**
     * <p>
     * Replaces the specified properties of the specified rule. Any properties that you do not specify are unchanged.
     * </p>
     * <p>
     * To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire
     * list. For example, to add an action, specify a list with the current actions plus the new action.
     * </p>
     * 
     * @param modifyRuleRequest
     * @return A Java Future containing the result of the ModifyRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(ModifyRuleRequest modifyRuleRequest);

    /**
     * <p>
     * Replaces the specified properties of the specified rule. Any properties that you do not specify are unchanged.
     * </p>
     * <p>
     * To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire
     * list. For example, to add an action, specify a list with the current actions plus the new action.
     * </p>
     * 
     * @param modifyRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(ModifyRuleRequest modifyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyRuleRequest, ModifyRuleResult> asyncHandler);

    /**
     * <p>
     * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupRequest
     * @return A Java Future containing the result of the ModifyTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(ModifyTargetGroupRequest modifyTargetGroupRequest);

    /**
     * <p>
     * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(ModifyTargetGroupRequest modifyTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupRequest, ModifyTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attributes of the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupAttributesRequest
     * @return A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(
            ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest);

    /**
     * <p>
     * Modifies the specified attributes of the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(
            ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupAttributesRequest, ModifyTargetGroupAttributesResult> asyncHandler);

    /**
     * <p>
     * Registers the specified targets with the specified target group.
     * </p>
     * <p>
     * If the target is an EC2 instance, it must be in the <code>running</code> state when you register it.
     * </p>
     * <p>
     * By default, the load balancer routes requests to registered targets using the protocol and port for the target
     * group. Alternatively, you can override the port for a target when you register it. You can register each EC2
     * instance or IP address with the same target group multiple times using different ports.
     * </p>
     * <p>
     * With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance
     * types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of
     * these types by IP address.
     * </p>
     * 
     * @param registerTargetsRequest
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RegisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest);

    /**
     * <p>
     * Registers the specified targets with the specified target group.
     * </p>
     * <p>
     * If the target is an EC2 instance, it must be in the <code>running</code> state when you register it.
     * </p>
     * <p>
     * By default, the load balancer routes requests to registered targets using the protocol and port for the target
     * group. Alternatively, you can override the port for a target when you register it. You can register each EC2
     * instance or IP address with the same target group multiple times using different ports.
     * </p>
     * <p>
     * With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance
     * types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of
     * these types by IP address.
     * </p>
     * 
     * @param registerTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RegisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTargetsRequest, RegisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified certificate from the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * 
     * @param removeListenerCertificatesRequest
     * @return A Java Future containing the result of the RemoveListenerCertificates operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RemoveListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveListenerCertificatesResult> removeListenerCertificatesAsync(
            RemoveListenerCertificatesRequest removeListenerCertificatesRequest);

    /**
     * <p>
     * Removes the specified certificate from the certificate list for the specified HTTPS or TLS listener.
     * </p>
     * 
     * @param removeListenerCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveListenerCertificates operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RemoveListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveListenerCertificatesResult> removeListenerCertificatesAsync(
            RemoveListenerCertificatesRequest removeListenerCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveListenerCertificatesRequest, RemoveListenerCertificatesResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified Elastic Load Balancing resources. You can remove the tags for one
     * or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or
     * rules.
     * </p>
     * 
     * @param removeTagsRequest
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Elastic Load Balancing resources. You can remove the tags for one
     * or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or
     * rules.
     * </p>
     * 
     * @param removeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load
     * Balancer.
     * </p>
     * 
     * @param setIpAddressTypeRequest
     * @return A Java Future containing the result of the SetIpAddressType operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetIpAddressType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(SetIpAddressTypeRequest setIpAddressTypeRequest);

    /**
     * <p>
     * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load
     * Balancer.
     * </p>
     * 
     * @param setIpAddressTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIpAddressType operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetIpAddressType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(SetIpAddressTypeRequest setIpAddressTypeRequest,
            com.amazonaws.handlers.AsyncHandler<SetIpAddressTypeRequest, SetIpAddressTypeResult> asyncHandler);

    /**
     * <p>
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     * @return A Java Future containing the result of the SetRulePriorities operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetRulePriorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetRulePriorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(SetRulePrioritiesRequest setRulePrioritiesRequest);

    /**
     * <p>
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRulePriorities operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetRulePriorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetRulePriorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(SetRulePrioritiesRequest setRulePrioritiesRequest,
            com.amazonaws.handlers.AsyncHandler<SetRulePrioritiesRequest, SetRulePrioritiesResult> asyncHandler);

    /**
     * <p>
     * Associates the specified security groups with the specified Application Load Balancer. The specified security
     * groups override the previously associated security groups.
     * </p>
     * <p>
     * You can't specify a security group for a Network Load Balancer or Gateway Load Balancer.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     * @return A Java Future containing the result of the SetSecurityGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(SetSecurityGroupsRequest setSecurityGroupsRequest);

    /**
     * <p>
     * Associates the specified security groups with the specified Application Load Balancer. The specified security
     * groups override the previously associated security groups.
     * </p>
     * <p>
     * You can't specify a security group for a Network Load Balancer or Gateway Load Balancer.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSecurityGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(SetSecurityGroupsRequest setSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<SetSecurityGroupsRequest, SetSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Enables the Availability Zones for the specified public subnets for the specified Application Load Balancer or
     * Network Load Balancer. The specified subnets replace the previously enabled subnets.
     * </p>
     * <p>
     * When you specify subnets for a Network Load Balancer, you must include all subnets that were enabled previously,
     * with their existing configurations, plus any additional subnets.
     * </p>
     * 
     * @param setSubnetsRequest
     * @return A Java Future containing the result of the SetSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(SetSubnetsRequest setSubnetsRequest);

    /**
     * <p>
     * Enables the Availability Zones for the specified public subnets for the specified Application Load Balancer or
     * Network Load Balancer. The specified subnets replace the previously enabled subnets.
     * </p>
     * <p>
     * When you specify subnets for a Network Load Balancer, you must include all subnets that were enabled previously,
     * with their existing configurations, plus any additional subnets.
     * </p>
     * 
     * @param setSubnetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(SetSubnetsRequest setSubnetsRequest,
            com.amazonaws.handlers.AsyncHandler<SetSubnetsRequest, SetSubnetsResult> asyncHandler);

}
