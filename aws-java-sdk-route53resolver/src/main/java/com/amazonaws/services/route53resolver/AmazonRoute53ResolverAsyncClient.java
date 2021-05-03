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
package com.amazonaws.services.route53resolver;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Route53Resolver asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver.
 * By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or ELB load
 * balancers. Resolver performs recursive lookups against public name servers for all other domain names.
 * </p>
 * <p>
 * You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:
 * </p>
 * <p>
 * <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b>
 * </p>
 * <p>
 * DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers
 * to easily resolve domain names for AWS resources such as EC2 instances or records in a Route 53 private hosted zone.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc"
 * >How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Conditionally forward queries from a VPC to resolvers on your network</b>
 * </p>
 * <p>
 * You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on
 * your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS
 * queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network
 * that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver
 * chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you
 * specified in that rule. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network"
 * >How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * Like Amazon VPC, Resolver is regional. In each region where you have VPCs, you can choose whether to forward queries
 * from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53ResolverAsyncClient extends AmazonRoute53ResolverClient implements AmazonRoute53ResolverAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonRoute53ResolverAsyncClientBuilder asyncBuilder() {
        return AmazonRoute53ResolverAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route53Resolver using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRoute53ResolverAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route53Resolver using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonRoute53ResolverAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallRuleGroupResult> associateFirewallRuleGroupAsync(AssociateFirewallRuleGroupRequest request) {

        return associateFirewallRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallRuleGroupResult> associateFirewallRuleGroupAsync(final AssociateFirewallRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateFirewallRuleGroupRequest, AssociateFirewallRuleGroupResult> asyncHandler) {
        final AssociateFirewallRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateFirewallRuleGroupResult>() {
            @Override
            public AssociateFirewallRuleGroupResult call() throws Exception {
                AssociateFirewallRuleGroupResult result = null;

                try {
                    result = executeAssociateFirewallRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest request) {

        return associateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            final AssociateResolverEndpointIpAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResolverEndpointIpAddressRequest, AssociateResolverEndpointIpAddressResult> asyncHandler) {
        final AssociateResolverEndpointIpAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResolverEndpointIpAddressResult>() {
            @Override
            public AssociateResolverEndpointIpAddressResult call() throws Exception {
                AssociateResolverEndpointIpAddressResult result = null;

                try {
                    result = executeAssociateResolverEndpointIpAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverQueryLogConfigResult> associateResolverQueryLogConfigAsync(
            AssociateResolverQueryLogConfigRequest request) {

        return associateResolverQueryLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverQueryLogConfigResult> associateResolverQueryLogConfigAsync(
            final AssociateResolverQueryLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResult> asyncHandler) {
        final AssociateResolverQueryLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResolverQueryLogConfigResult>() {
            @Override
            public AssociateResolverQueryLogConfigResult call() throws Exception {
                AssociateResolverQueryLogConfigResult result = null;

                try {
                    result = executeAssociateResolverQueryLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest request) {

        return associateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(final AssociateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResolverRuleRequest, AssociateResolverRuleResult> asyncHandler) {
        final AssociateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResolverRuleResult>() {
            @Override
            public AssociateResolverRuleResult call() throws Exception {
                AssociateResolverRuleResult result = null;

                try {
                    result = executeAssociateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallDomainListResult> createFirewallDomainListAsync(CreateFirewallDomainListRequest request) {

        return createFirewallDomainListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallDomainListResult> createFirewallDomainListAsync(final CreateFirewallDomainListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFirewallDomainListRequest, CreateFirewallDomainListResult> asyncHandler) {
        final CreateFirewallDomainListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFirewallDomainListResult>() {
            @Override
            public CreateFirewallDomainListResult call() throws Exception {
                CreateFirewallDomainListResult result = null;

                try {
                    result = executeCreateFirewallDomainList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallRuleResult> createFirewallRuleAsync(CreateFirewallRuleRequest request) {

        return createFirewallRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallRuleResult> createFirewallRuleAsync(final CreateFirewallRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFirewallRuleRequest, CreateFirewallRuleResult> asyncHandler) {
        final CreateFirewallRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFirewallRuleResult>() {
            @Override
            public CreateFirewallRuleResult call() throws Exception {
                CreateFirewallRuleResult result = null;

                try {
                    result = executeCreateFirewallRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallRuleGroupResult> createFirewallRuleGroupAsync(CreateFirewallRuleGroupRequest request) {

        return createFirewallRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallRuleGroupResult> createFirewallRuleGroupAsync(final CreateFirewallRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFirewallRuleGroupRequest, CreateFirewallRuleGroupResult> asyncHandler) {
        final CreateFirewallRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFirewallRuleGroupResult>() {
            @Override
            public CreateFirewallRuleGroupResult call() throws Exception {
                CreateFirewallRuleGroupResult result = null;

                try {
                    result = executeCreateFirewallRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest request) {

        return createResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(final CreateResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverEndpointRequest, CreateResolverEndpointResult> asyncHandler) {
        final CreateResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverEndpointResult>() {
            @Override
            public CreateResolverEndpointResult call() throws Exception {
                CreateResolverEndpointResult result = null;

                try {
                    result = executeCreateResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverQueryLogConfigResult> createResolverQueryLogConfigAsync(CreateResolverQueryLogConfigRequest request) {

        return createResolverQueryLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverQueryLogConfigResult> createResolverQueryLogConfigAsync(final CreateResolverQueryLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResult> asyncHandler) {
        final CreateResolverQueryLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverQueryLogConfigResult>() {
            @Override
            public CreateResolverQueryLogConfigResult call() throws Exception {
                CreateResolverQueryLogConfigResult result = null;

                try {
                    result = executeCreateResolverQueryLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest request) {

        return createResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(final CreateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverRuleRequest, CreateResolverRuleResult> asyncHandler) {
        final CreateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverRuleResult>() {
            @Override
            public CreateResolverRuleResult call() throws Exception {
                CreateResolverRuleResult result = null;

                try {
                    result = executeCreateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallDomainListResult> deleteFirewallDomainListAsync(DeleteFirewallDomainListRequest request) {

        return deleteFirewallDomainListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallDomainListResult> deleteFirewallDomainListAsync(final DeleteFirewallDomainListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFirewallDomainListRequest, DeleteFirewallDomainListResult> asyncHandler) {
        final DeleteFirewallDomainListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFirewallDomainListResult>() {
            @Override
            public DeleteFirewallDomainListResult call() throws Exception {
                DeleteFirewallDomainListResult result = null;

                try {
                    result = executeDeleteFirewallDomainList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallRuleResult> deleteFirewallRuleAsync(DeleteFirewallRuleRequest request) {

        return deleteFirewallRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallRuleResult> deleteFirewallRuleAsync(final DeleteFirewallRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFirewallRuleRequest, DeleteFirewallRuleResult> asyncHandler) {
        final DeleteFirewallRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFirewallRuleResult>() {
            @Override
            public DeleteFirewallRuleResult call() throws Exception {
                DeleteFirewallRuleResult result = null;

                try {
                    result = executeDeleteFirewallRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallRuleGroupResult> deleteFirewallRuleGroupAsync(DeleteFirewallRuleGroupRequest request) {

        return deleteFirewallRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallRuleGroupResult> deleteFirewallRuleGroupAsync(final DeleteFirewallRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFirewallRuleGroupRequest, DeleteFirewallRuleGroupResult> asyncHandler) {
        final DeleteFirewallRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFirewallRuleGroupResult>() {
            @Override
            public DeleteFirewallRuleGroupResult call() throws Exception {
                DeleteFirewallRuleGroupResult result = null;

                try {
                    result = executeDeleteFirewallRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest request) {

        return deleteResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(final DeleteResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverEndpointRequest, DeleteResolverEndpointResult> asyncHandler) {
        final DeleteResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverEndpointResult>() {
            @Override
            public DeleteResolverEndpointResult call() throws Exception {
                DeleteResolverEndpointResult result = null;

                try {
                    result = executeDeleteResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverQueryLogConfigResult> deleteResolverQueryLogConfigAsync(DeleteResolverQueryLogConfigRequest request) {

        return deleteResolverQueryLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverQueryLogConfigResult> deleteResolverQueryLogConfigAsync(final DeleteResolverQueryLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResult> asyncHandler) {
        final DeleteResolverQueryLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverQueryLogConfigResult>() {
            @Override
            public DeleteResolverQueryLogConfigResult call() throws Exception {
                DeleteResolverQueryLogConfigResult result = null;

                try {
                    result = executeDeleteResolverQueryLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest request) {

        return deleteResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(final DeleteResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverRuleRequest, DeleteResolverRuleResult> asyncHandler) {
        final DeleteResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverRuleResult>() {
            @Override
            public DeleteResolverRuleResult call() throws Exception {
                DeleteResolverRuleResult result = null;

                try {
                    result = executeDeleteResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateFirewallRuleGroupResult> disassociateFirewallRuleGroupAsync(DisassociateFirewallRuleGroupRequest request) {

        return disassociateFirewallRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFirewallRuleGroupResult> disassociateFirewallRuleGroupAsync(
            final DisassociateFirewallRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFirewallRuleGroupRequest, DisassociateFirewallRuleGroupResult> asyncHandler) {
        final DisassociateFirewallRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFirewallRuleGroupResult>() {
            @Override
            public DisassociateFirewallRuleGroupResult call() throws Exception {
                DisassociateFirewallRuleGroupResult result = null;

                try {
                    result = executeDisassociateFirewallRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest request) {

        return disassociateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            final DisassociateResolverEndpointIpAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResolverEndpointIpAddressRequest, DisassociateResolverEndpointIpAddressResult> asyncHandler) {
        final DisassociateResolverEndpointIpAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResolverEndpointIpAddressResult>() {
            @Override
            public DisassociateResolverEndpointIpAddressResult call() throws Exception {
                DisassociateResolverEndpointIpAddressResult result = null;

                try {
                    result = executeDisassociateResolverEndpointIpAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverQueryLogConfigResult> disassociateResolverQueryLogConfigAsync(
            DisassociateResolverQueryLogConfigRequest request) {

        return disassociateResolverQueryLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverQueryLogConfigResult> disassociateResolverQueryLogConfigAsync(
            final DisassociateResolverQueryLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResult> asyncHandler) {
        final DisassociateResolverQueryLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResolverQueryLogConfigResult>() {
            @Override
            public DisassociateResolverQueryLogConfigResult call() throws Exception {
                DisassociateResolverQueryLogConfigResult result = null;

                try {
                    result = executeDisassociateResolverQueryLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest request) {

        return disassociateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(final DisassociateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResolverRuleRequest, DisassociateResolverRuleResult> asyncHandler) {
        final DisassociateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResolverRuleResult>() {
            @Override
            public DisassociateResolverRuleResult call() throws Exception {
                DisassociateResolverRuleResult result = null;

                try {
                    result = executeDisassociateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFirewallConfigResult> getFirewallConfigAsync(GetFirewallConfigRequest request) {

        return getFirewallConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFirewallConfigResult> getFirewallConfigAsync(final GetFirewallConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFirewallConfigRequest, GetFirewallConfigResult> asyncHandler) {
        final GetFirewallConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFirewallConfigResult>() {
            @Override
            public GetFirewallConfigResult call() throws Exception {
                GetFirewallConfigResult result = null;

                try {
                    result = executeGetFirewallConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFirewallDomainListResult> getFirewallDomainListAsync(GetFirewallDomainListRequest request) {

        return getFirewallDomainListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFirewallDomainListResult> getFirewallDomainListAsync(final GetFirewallDomainListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFirewallDomainListRequest, GetFirewallDomainListResult> asyncHandler) {
        final GetFirewallDomainListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFirewallDomainListResult>() {
            @Override
            public GetFirewallDomainListResult call() throws Exception {
                GetFirewallDomainListResult result = null;

                try {
                    result = executeGetFirewallDomainList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupResult> getFirewallRuleGroupAsync(GetFirewallRuleGroupRequest request) {

        return getFirewallRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupResult> getFirewallRuleGroupAsync(final GetFirewallRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupRequest, GetFirewallRuleGroupResult> asyncHandler) {
        final GetFirewallRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFirewallRuleGroupResult>() {
            @Override
            public GetFirewallRuleGroupResult call() throws Exception {
                GetFirewallRuleGroupResult result = null;

                try {
                    result = executeGetFirewallRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupAssociationResult> getFirewallRuleGroupAssociationAsync(
            GetFirewallRuleGroupAssociationRequest request) {

        return getFirewallRuleGroupAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupAssociationResult> getFirewallRuleGroupAssociationAsync(
            final GetFirewallRuleGroupAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupAssociationRequest, GetFirewallRuleGroupAssociationResult> asyncHandler) {
        final GetFirewallRuleGroupAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFirewallRuleGroupAssociationResult>() {
            @Override
            public GetFirewallRuleGroupAssociationResult call() throws Exception {
                GetFirewallRuleGroupAssociationResult result = null;

                try {
                    result = executeGetFirewallRuleGroupAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupPolicyResult> getFirewallRuleGroupPolicyAsync(GetFirewallRuleGroupPolicyRequest request) {

        return getFirewallRuleGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFirewallRuleGroupPolicyResult> getFirewallRuleGroupPolicyAsync(final GetFirewallRuleGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupPolicyRequest, GetFirewallRuleGroupPolicyResult> asyncHandler) {
        final GetFirewallRuleGroupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFirewallRuleGroupPolicyResult>() {
            @Override
            public GetFirewallRuleGroupPolicyResult call() throws Exception {
                GetFirewallRuleGroupPolicyResult result = null;

                try {
                    result = executeGetFirewallRuleGroupPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverDnssecConfigResult> getResolverDnssecConfigAsync(GetResolverDnssecConfigRequest request) {

        return getResolverDnssecConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverDnssecConfigResult> getResolverDnssecConfigAsync(final GetResolverDnssecConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverDnssecConfigRequest, GetResolverDnssecConfigResult> asyncHandler) {
        final GetResolverDnssecConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverDnssecConfigResult>() {
            @Override
            public GetResolverDnssecConfigResult call() throws Exception {
                GetResolverDnssecConfigResult result = null;

                try {
                    result = executeGetResolverDnssecConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest request) {

        return getResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(final GetResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverEndpointRequest, GetResolverEndpointResult> asyncHandler) {
        final GetResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverEndpointResult>() {
            @Override
            public GetResolverEndpointResult call() throws Exception {
                GetResolverEndpointResult result = null;

                try {
                    result = executeGetResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigResult> getResolverQueryLogConfigAsync(GetResolverQueryLogConfigRequest request) {

        return getResolverQueryLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigResult> getResolverQueryLogConfigAsync(final GetResolverQueryLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigRequest, GetResolverQueryLogConfigResult> asyncHandler) {
        final GetResolverQueryLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverQueryLogConfigResult>() {
            @Override
            public GetResolverQueryLogConfigResult call() throws Exception {
                GetResolverQueryLogConfigResult result = null;

                try {
                    result = executeGetResolverQueryLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigAssociationResult> getResolverQueryLogConfigAssociationAsync(
            GetResolverQueryLogConfigAssociationRequest request) {

        return getResolverQueryLogConfigAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigAssociationResult> getResolverQueryLogConfigAssociationAsync(
            final GetResolverQueryLogConfigAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigAssociationRequest, GetResolverQueryLogConfigAssociationResult> asyncHandler) {
        final GetResolverQueryLogConfigAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverQueryLogConfigAssociationResult>() {
            @Override
            public GetResolverQueryLogConfigAssociationResult call() throws Exception {
                GetResolverQueryLogConfigAssociationResult result = null;

                try {
                    result = executeGetResolverQueryLogConfigAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigPolicyResult> getResolverQueryLogConfigPolicyAsync(
            GetResolverQueryLogConfigPolicyRequest request) {

        return getResolverQueryLogConfigPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverQueryLogConfigPolicyResult> getResolverQueryLogConfigPolicyAsync(
            final GetResolverQueryLogConfigPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigPolicyRequest, GetResolverQueryLogConfigPolicyResult> asyncHandler) {
        final GetResolverQueryLogConfigPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverQueryLogConfigPolicyResult>() {
            @Override
            public GetResolverQueryLogConfigPolicyResult call() throws Exception {
                GetResolverQueryLogConfigPolicyResult result = null;

                try {
                    result = executeGetResolverQueryLogConfigPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest request) {

        return getResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(final GetResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRuleRequest, GetResolverRuleResult> asyncHandler) {
        final GetResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRuleResult>() {
            @Override
            public GetResolverRuleResult call() throws Exception {
                GetResolverRuleResult result = null;

                try {
                    result = executeGetResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(GetResolverRuleAssociationRequest request) {

        return getResolverRuleAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(final GetResolverRuleAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRuleAssociationRequest, GetResolverRuleAssociationResult> asyncHandler) {
        final GetResolverRuleAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRuleAssociationResult>() {
            @Override
            public GetResolverRuleAssociationResult call() throws Exception {
                GetResolverRuleAssociationResult result = null;

                try {
                    result = executeGetResolverRuleAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest request) {

        return getResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(final GetResolverRulePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRulePolicyRequest, GetResolverRulePolicyResult> asyncHandler) {
        final GetResolverRulePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRulePolicyResult>() {
            @Override
            public GetResolverRulePolicyResult call() throws Exception {
                GetResolverRulePolicyResult result = null;

                try {
                    result = executeGetResolverRulePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportFirewallDomainsResult> importFirewallDomainsAsync(ImportFirewallDomainsRequest request) {

        return importFirewallDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportFirewallDomainsResult> importFirewallDomainsAsync(final ImportFirewallDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportFirewallDomainsRequest, ImportFirewallDomainsResult> asyncHandler) {
        final ImportFirewallDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportFirewallDomainsResult>() {
            @Override
            public ImportFirewallDomainsResult call() throws Exception {
                ImportFirewallDomainsResult result = null;

                try {
                    result = executeImportFirewallDomains(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallConfigsResult> listFirewallConfigsAsync(ListFirewallConfigsRequest request) {

        return listFirewallConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallConfigsResult> listFirewallConfigsAsync(final ListFirewallConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallConfigsRequest, ListFirewallConfigsResult> asyncHandler) {
        final ListFirewallConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallConfigsResult>() {
            @Override
            public ListFirewallConfigsResult call() throws Exception {
                ListFirewallConfigsResult result = null;

                try {
                    result = executeListFirewallConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallDomainListsResult> listFirewallDomainListsAsync(ListFirewallDomainListsRequest request) {

        return listFirewallDomainListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallDomainListsResult> listFirewallDomainListsAsync(final ListFirewallDomainListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallDomainListsRequest, ListFirewallDomainListsResult> asyncHandler) {
        final ListFirewallDomainListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallDomainListsResult>() {
            @Override
            public ListFirewallDomainListsResult call() throws Exception {
                ListFirewallDomainListsResult result = null;

                try {
                    result = executeListFirewallDomainLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallDomainsResult> listFirewallDomainsAsync(ListFirewallDomainsRequest request) {

        return listFirewallDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallDomainsResult> listFirewallDomainsAsync(final ListFirewallDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallDomainsRequest, ListFirewallDomainsResult> asyncHandler) {
        final ListFirewallDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallDomainsResult>() {
            @Override
            public ListFirewallDomainsResult call() throws Exception {
                ListFirewallDomainsResult result = null;

                try {
                    result = executeListFirewallDomains(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRuleGroupAssociationsResult> listFirewallRuleGroupAssociationsAsync(
            ListFirewallRuleGroupAssociationsRequest request) {

        return listFirewallRuleGroupAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRuleGroupAssociationsResult> listFirewallRuleGroupAssociationsAsync(
            final ListFirewallRuleGroupAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallRuleGroupAssociationsRequest, ListFirewallRuleGroupAssociationsResult> asyncHandler) {
        final ListFirewallRuleGroupAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallRuleGroupAssociationsResult>() {
            @Override
            public ListFirewallRuleGroupAssociationsResult call() throws Exception {
                ListFirewallRuleGroupAssociationsResult result = null;

                try {
                    result = executeListFirewallRuleGroupAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRuleGroupsResult> listFirewallRuleGroupsAsync(ListFirewallRuleGroupsRequest request) {

        return listFirewallRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRuleGroupsResult> listFirewallRuleGroupsAsync(final ListFirewallRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallRuleGroupsRequest, ListFirewallRuleGroupsResult> asyncHandler) {
        final ListFirewallRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallRuleGroupsResult>() {
            @Override
            public ListFirewallRuleGroupsResult call() throws Exception {
                ListFirewallRuleGroupsResult result = null;

                try {
                    result = executeListFirewallRuleGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRulesResult> listFirewallRulesAsync(ListFirewallRulesRequest request) {

        return listFirewallRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallRulesResult> listFirewallRulesAsync(final ListFirewallRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallRulesRequest, ListFirewallRulesResult> asyncHandler) {
        final ListFirewallRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallRulesResult>() {
            @Override
            public ListFirewallRulesResult call() throws Exception {
                ListFirewallRulesResult result = null;

                try {
                    result = executeListFirewallRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverDnssecConfigsResult> listResolverDnssecConfigsAsync(ListResolverDnssecConfigsRequest request) {

        return listResolverDnssecConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverDnssecConfigsResult> listResolverDnssecConfigsAsync(final ListResolverDnssecConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverDnssecConfigsRequest, ListResolverDnssecConfigsResult> asyncHandler) {
        final ListResolverDnssecConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverDnssecConfigsResult>() {
            @Override
            public ListResolverDnssecConfigsResult call() throws Exception {
                ListResolverDnssecConfigsResult result = null;

                try {
                    result = executeListResolverDnssecConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest request) {

        return listResolverEndpointIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            final ListResolverEndpointIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverEndpointIpAddressesRequest, ListResolverEndpointIpAddressesResult> asyncHandler) {
        final ListResolverEndpointIpAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverEndpointIpAddressesResult>() {
            @Override
            public ListResolverEndpointIpAddressesResult call() throws Exception {
                ListResolverEndpointIpAddressesResult result = null;

                try {
                    result = executeListResolverEndpointIpAddresses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest request) {

        return listResolverEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(final ListResolverEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverEndpointsRequest, ListResolverEndpointsResult> asyncHandler) {
        final ListResolverEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverEndpointsResult>() {
            @Override
            public ListResolverEndpointsResult call() throws Exception {
                ListResolverEndpointsResult result = null;

                try {
                    result = executeListResolverEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverQueryLogConfigAssociationsResult> listResolverQueryLogConfigAssociationsAsync(
            ListResolverQueryLogConfigAssociationsRequest request) {

        return listResolverQueryLogConfigAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverQueryLogConfigAssociationsResult> listResolverQueryLogConfigAssociationsAsync(
            final ListResolverQueryLogConfigAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverQueryLogConfigAssociationsRequest, ListResolverQueryLogConfigAssociationsResult> asyncHandler) {
        final ListResolverQueryLogConfigAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverQueryLogConfigAssociationsResult>() {
            @Override
            public ListResolverQueryLogConfigAssociationsResult call() throws Exception {
                ListResolverQueryLogConfigAssociationsResult result = null;

                try {
                    result = executeListResolverQueryLogConfigAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverQueryLogConfigsResult> listResolverQueryLogConfigsAsync(ListResolverQueryLogConfigsRequest request) {

        return listResolverQueryLogConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverQueryLogConfigsResult> listResolverQueryLogConfigsAsync(final ListResolverQueryLogConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResult> asyncHandler) {
        final ListResolverQueryLogConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverQueryLogConfigsResult>() {
            @Override
            public ListResolverQueryLogConfigsResult call() throws Exception {
                ListResolverQueryLogConfigsResult result = null;

                try {
                    result = executeListResolverQueryLogConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(ListResolverRuleAssociationsRequest request) {

        return listResolverRuleAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(final ListResolverRuleAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverRuleAssociationsRequest, ListResolverRuleAssociationsResult> asyncHandler) {
        final ListResolverRuleAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverRuleAssociationsResult>() {
            @Override
            public ListResolverRuleAssociationsResult call() throws Exception {
                ListResolverRuleAssociationsResult result = null;

                try {
                    result = executeListResolverRuleAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest request) {

        return listResolverRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(final ListResolverRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverRulesRequest, ListResolverRulesResult> asyncHandler) {
        final ListResolverRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverRulesResult>() {
            @Override
            public ListResolverRulesResult call() throws Exception {
                ListResolverRulesResult result = null;

                try {
                    result = executeListResolverRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFirewallRuleGroupPolicyResult> putFirewallRuleGroupPolicyAsync(PutFirewallRuleGroupPolicyRequest request) {

        return putFirewallRuleGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFirewallRuleGroupPolicyResult> putFirewallRuleGroupPolicyAsync(final PutFirewallRuleGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFirewallRuleGroupPolicyRequest, PutFirewallRuleGroupPolicyResult> asyncHandler) {
        final PutFirewallRuleGroupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFirewallRuleGroupPolicyResult>() {
            @Override
            public PutFirewallRuleGroupPolicyResult call() throws Exception {
                PutFirewallRuleGroupPolicyResult result = null;

                try {
                    result = executePutFirewallRuleGroupPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutResolverQueryLogConfigPolicyResult> putResolverQueryLogConfigPolicyAsync(
            PutResolverQueryLogConfigPolicyRequest request) {

        return putResolverQueryLogConfigPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResolverQueryLogConfigPolicyResult> putResolverQueryLogConfigPolicyAsync(
            final PutResolverQueryLogConfigPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResolverQueryLogConfigPolicyRequest, PutResolverQueryLogConfigPolicyResult> asyncHandler) {
        final PutResolverQueryLogConfigPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResolverQueryLogConfigPolicyResult>() {
            @Override
            public PutResolverQueryLogConfigPolicyResult call() throws Exception {
                PutResolverQueryLogConfigPolicyResult result = null;

                try {
                    result = executePutResolverQueryLogConfigPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest request) {

        return putResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(final PutResolverRulePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResolverRulePolicyRequest, PutResolverRulePolicyResult> asyncHandler) {
        final PutResolverRulePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResolverRulePolicyResult>() {
            @Override
            public PutResolverRulePolicyResult call() throws Exception {
                PutResolverRulePolicyResult result = null;

                try {
                    result = executePutResolverRulePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallConfigResult> updateFirewallConfigAsync(UpdateFirewallConfigRequest request) {

        return updateFirewallConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallConfigResult> updateFirewallConfigAsync(final UpdateFirewallConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallConfigRequest, UpdateFirewallConfigResult> asyncHandler) {
        final UpdateFirewallConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallConfigResult>() {
            @Override
            public UpdateFirewallConfigResult call() throws Exception {
                UpdateFirewallConfigResult result = null;

                try {
                    result = executeUpdateFirewallConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDomainsResult> updateFirewallDomainsAsync(UpdateFirewallDomainsRequest request) {

        return updateFirewallDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDomainsResult> updateFirewallDomainsAsync(final UpdateFirewallDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallDomainsRequest, UpdateFirewallDomainsResult> asyncHandler) {
        final UpdateFirewallDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallDomainsResult>() {
            @Override
            public UpdateFirewallDomainsResult call() throws Exception {
                UpdateFirewallDomainsResult result = null;

                try {
                    result = executeUpdateFirewallDomains(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallRuleResult> updateFirewallRuleAsync(UpdateFirewallRuleRequest request) {

        return updateFirewallRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallRuleResult> updateFirewallRuleAsync(final UpdateFirewallRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallRuleRequest, UpdateFirewallRuleResult> asyncHandler) {
        final UpdateFirewallRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallRuleResult>() {
            @Override
            public UpdateFirewallRuleResult call() throws Exception {
                UpdateFirewallRuleResult result = null;

                try {
                    result = executeUpdateFirewallRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallRuleGroupAssociationResult> updateFirewallRuleGroupAssociationAsync(
            UpdateFirewallRuleGroupAssociationRequest request) {

        return updateFirewallRuleGroupAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallRuleGroupAssociationResult> updateFirewallRuleGroupAssociationAsync(
            final UpdateFirewallRuleGroupAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallRuleGroupAssociationRequest, UpdateFirewallRuleGroupAssociationResult> asyncHandler) {
        final UpdateFirewallRuleGroupAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallRuleGroupAssociationResult>() {
            @Override
            public UpdateFirewallRuleGroupAssociationResult call() throws Exception {
                UpdateFirewallRuleGroupAssociationResult result = null;

                try {
                    result = executeUpdateFirewallRuleGroupAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverDnssecConfigResult> updateResolverDnssecConfigAsync(UpdateResolverDnssecConfigRequest request) {

        return updateResolverDnssecConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverDnssecConfigResult> updateResolverDnssecConfigAsync(final UpdateResolverDnssecConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverDnssecConfigRequest, UpdateResolverDnssecConfigResult> asyncHandler) {
        final UpdateResolverDnssecConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverDnssecConfigResult>() {
            @Override
            public UpdateResolverDnssecConfigResult call() throws Exception {
                UpdateResolverDnssecConfigResult result = null;

                try {
                    result = executeUpdateResolverDnssecConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest request) {

        return updateResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(final UpdateResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverEndpointRequest, UpdateResolverEndpointResult> asyncHandler) {
        final UpdateResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverEndpointResult>() {
            @Override
            public UpdateResolverEndpointResult call() throws Exception {
                UpdateResolverEndpointResult result = null;

                try {
                    result = executeUpdateResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest request) {

        return updateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(final UpdateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverRuleRequest, UpdateResolverRuleResult> asyncHandler) {
        final UpdateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverRuleResult>() {
            @Override
            public UpdateResolverRuleResult call() throws Exception {
                UpdateResolverRuleResult result = null;

                try {
                    result = executeUpdateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
