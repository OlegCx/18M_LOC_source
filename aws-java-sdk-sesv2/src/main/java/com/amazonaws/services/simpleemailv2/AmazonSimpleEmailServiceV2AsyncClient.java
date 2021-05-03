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
package com.amazonaws.services.simpleemailv2;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon SES V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon SES API v2</fullname>
 * <p>
 * Welcome to the Amazon SES API v2 Reference. This guide provides information about the Amazon SES API v2, including
 * supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/pinpoint">Amazon SES</a> is an AWS service that you can use to send email messages to
 * your customers.
 * </p>
 * <p>
 * If you're new to Amazon SES API v2, you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon Simple Email Service Developer Guide</a>. The
 * <i>Amazon SES Developer Guide</i> provides information and code samples that demonstrate how to use Amazon SES API v2
 * features programmatically.
 * </p>
 * <p>
 * The Amazon SES API v2 is available in several AWS Regions and it provides an endpoint for each of these Regions. For
 * a list of all the Regions and endpoints where the API is currently available, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region">AWS Service Endpoints</a> in the <i>Amazon
 * Web Services General Reference</i>. To learn more about AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>Amazon Web
 * Services General Reference</i>.
 * </p>
 * <p>
 * In each Region, AWS maintains multiple Availability Zones. These Availability Zones are physically isolated from each
 * other, but are united by private, low-latency, high-throughput, and highly redundant network connections. These
 * Availability Zones enable us to provide very high levels of availability and redundancy, while also minimizing
 * latency. To learn more about the number of Availability Zones that are available in each Region, see <a
 * href="http://aws.amazon.com/about-aws/global-infrastructure/">AWS Global Infrastructure</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSimpleEmailServiceV2AsyncClient extends AmazonSimpleEmailServiceV2Client implements AmazonSimpleEmailServiceV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSimpleEmailServiceV2AsyncClientBuilder asyncBuilder() {
        return AmazonSimpleEmailServiceV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSimpleEmailServiceV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
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
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest request) {

        return createConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler) {
        final CreateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetEventDestinationResult>() {
            @Override
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeCreateConfigurationSetEventDestination(finalRequest);
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
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest request) {

        return createContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(final CreateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactRequest, CreateContactResult> asyncHandler) {
        final CreateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactResult>() {
            @Override
            public CreateContactResult call() throws Exception {
                CreateContactResult result = null;

                try {
                    result = executeCreateContact(finalRequest);
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
    public java.util.concurrent.Future<CreateContactListResult> createContactListAsync(CreateContactListRequest request) {

        return createContactListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactListResult> createContactListAsync(final CreateContactListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactListRequest, CreateContactListResult> asyncHandler) {
        final CreateContactListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactListResult>() {
            @Override
            public CreateContactListResult call() throws Exception {
                CreateContactListResult result = null;

                try {
                    result = executeCreateContactList(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            CreateCustomVerificationEmailTemplateRequest request) {

        return createCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            final CreateCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomVerificationEmailTemplateRequest, CreateCustomVerificationEmailTemplateResult> asyncHandler) {
        final CreateCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomVerificationEmailTemplateResult>() {
            @Override
            public CreateCustomVerificationEmailTemplateResult call() throws Exception {
                CreateCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeCreateCustomVerificationEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest request) {

        return createDedicatedIpPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(final CreateDedicatedIpPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDedicatedIpPoolRequest, CreateDedicatedIpPoolResult> asyncHandler) {
        final CreateDedicatedIpPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDedicatedIpPoolResult>() {
            @Override
            public CreateDedicatedIpPoolResult call() throws Exception {
                CreateDedicatedIpPoolResult result = null;

                try {
                    result = executeCreateDedicatedIpPool(finalRequest);
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
    public java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(CreateDeliverabilityTestReportRequest request) {

        return createDeliverabilityTestReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            final CreateDeliverabilityTestReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeliverabilityTestReportRequest, CreateDeliverabilityTestReportResult> asyncHandler) {
        final CreateDeliverabilityTestReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeliverabilityTestReportResult>() {
            @Override
            public CreateDeliverabilityTestReportResult call() throws Exception {
                CreateDeliverabilityTestReportResult result = null;

                try {
                    result = executeCreateDeliverabilityTestReport(finalRequest);
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
    public java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest request) {

        return createEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(final CreateEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEmailIdentityRequest, CreateEmailIdentityResult> asyncHandler) {
        final CreateEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEmailIdentityResult>() {
            @Override
            public CreateEmailIdentityResult call() throws Exception {
                CreateEmailIdentityResult result = null;

                try {
                    result = executeCreateEmailIdentity(finalRequest);
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
    public java.util.concurrent.Future<CreateEmailIdentityPolicyResult> createEmailIdentityPolicyAsync(CreateEmailIdentityPolicyRequest request) {

        return createEmailIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailIdentityPolicyResult> createEmailIdentityPolicyAsync(final CreateEmailIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEmailIdentityPolicyRequest, CreateEmailIdentityPolicyResult> asyncHandler) {
        final CreateEmailIdentityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEmailIdentityPolicyResult>() {
            @Override
            public CreateEmailIdentityPolicyResult call() throws Exception {
                CreateEmailIdentityPolicyResult result = null;

                try {
                    result = executeCreateEmailIdentityPolicy(finalRequest);
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
    public java.util.concurrent.Future<CreateEmailTemplateResult> createEmailTemplateAsync(CreateEmailTemplateRequest request) {

        return createEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailTemplateResult> createEmailTemplateAsync(final CreateEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEmailTemplateRequest, CreateEmailTemplateResult> asyncHandler) {
        final CreateEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEmailTemplateResult>() {
            @Override
            public CreateEmailTemplateResult call() throws Exception {
                CreateEmailTemplateResult result = null;

                try {
                    result = executeCreateEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest request) {

        return createImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(final CreateImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler) {
        final CreateImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImportJobResult>() {
            @Override
            public CreateImportJobResult call() throws Exception {
                CreateImportJobResult result = null;

                try {
                    result = executeCreateImportJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest request) {

        return deleteConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler) {
        final DeleteConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetEventDestinationResult>() {
            @Override
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeDeleteConfigurationSetEventDestination(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest request) {

        return deleteContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(final DeleteContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactRequest, DeleteContactResult> asyncHandler) {
        final DeleteContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactResult>() {
            @Override
            public DeleteContactResult call() throws Exception {
                DeleteContactResult result = null;

                try {
                    result = executeDeleteContact(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactListResult> deleteContactListAsync(DeleteContactListRequest request) {

        return deleteContactListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactListResult> deleteContactListAsync(final DeleteContactListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactListRequest, DeleteContactListResult> asyncHandler) {
        final DeleteContactListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactListResult>() {
            @Override
            public DeleteContactListResult call() throws Exception {
                DeleteContactListResult result = null;

                try {
                    result = executeDeleteContactList(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            DeleteCustomVerificationEmailTemplateRequest request) {

        return deleteCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            final DeleteCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomVerificationEmailTemplateRequest, DeleteCustomVerificationEmailTemplateResult> asyncHandler) {
        final DeleteCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomVerificationEmailTemplateResult>() {
            @Override
            public DeleteCustomVerificationEmailTemplateResult call() throws Exception {
                DeleteCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeDeleteCustomVerificationEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(DeleteDedicatedIpPoolRequest request) {

        return deleteDedicatedIpPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(final DeleteDedicatedIpPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDedicatedIpPoolRequest, DeleteDedicatedIpPoolResult> asyncHandler) {
        final DeleteDedicatedIpPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDedicatedIpPoolResult>() {
            @Override
            public DeleteDedicatedIpPoolResult call() throws Exception {
                DeleteDedicatedIpPoolResult result = null;

                try {
                    result = executeDeleteDedicatedIpPool(finalRequest);
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
    public java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest request) {

        return deleteEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(final DeleteEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEmailIdentityRequest, DeleteEmailIdentityResult> asyncHandler) {
        final DeleteEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEmailIdentityResult>() {
            @Override
            public DeleteEmailIdentityResult call() throws Exception {
                DeleteEmailIdentityResult result = null;

                try {
                    result = executeDeleteEmailIdentity(finalRequest);
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
    public java.util.concurrent.Future<DeleteEmailIdentityPolicyResult> deleteEmailIdentityPolicyAsync(DeleteEmailIdentityPolicyRequest request) {

        return deleteEmailIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailIdentityPolicyResult> deleteEmailIdentityPolicyAsync(final DeleteEmailIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEmailIdentityPolicyRequest, DeleteEmailIdentityPolicyResult> asyncHandler) {
        final DeleteEmailIdentityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEmailIdentityPolicyResult>() {
            @Override
            public DeleteEmailIdentityPolicyResult call() throws Exception {
                DeleteEmailIdentityPolicyResult result = null;

                try {
                    result = executeDeleteEmailIdentityPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteEmailTemplateResult> deleteEmailTemplateAsync(DeleteEmailTemplateRequest request) {

        return deleteEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailTemplateResult> deleteEmailTemplateAsync(final DeleteEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEmailTemplateRequest, DeleteEmailTemplateResult> asyncHandler) {
        final DeleteEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEmailTemplateResult>() {
            @Override
            public DeleteEmailTemplateResult call() throws Exception {
                DeleteEmailTemplateResult result = null;

                try {
                    result = executeDeleteEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteSuppressedDestinationResult> deleteSuppressedDestinationAsync(DeleteSuppressedDestinationRequest request) {

        return deleteSuppressedDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSuppressedDestinationResult> deleteSuppressedDestinationAsync(final DeleteSuppressedDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSuppressedDestinationRequest, DeleteSuppressedDestinationResult> asyncHandler) {
        final DeleteSuppressedDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSuppressedDestinationResult>() {
            @Override
            public DeleteSuppressedDestinationResult call() throws Exception {
                DeleteSuppressedDestinationResult result = null;

                try {
                    result = executeDeleteSuppressedDestination(finalRequest);
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
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(final GetAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {
        final GetAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountResult>() {
            @Override
            public GetAccountResult call() throws Exception {
                GetAccountResult result = null;

                try {
                    result = executeGetAccount(finalRequest);
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
    public java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(GetBlacklistReportsRequest request) {

        return getBlacklistReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(final GetBlacklistReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlacklistReportsRequest, GetBlacklistReportsResult> asyncHandler) {
        final GetBlacklistReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlacklistReportsResult>() {
            @Override
            public GetBlacklistReportsResult call() throws Exception {
                GetBlacklistReportsResult result = null;

                try {
                    result = executeGetBlacklistReports(finalRequest);
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
    public java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest request) {

        return getConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(final GetConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationSetRequest, GetConfigurationSetResult> asyncHandler) {
        final GetConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationSetResult>() {
            @Override
            public GetConfigurationSetResult call() throws Exception {
                GetConfigurationSetResult result = null;

                try {
                    result = executeGetConfigurationSet(finalRequest);
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
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest request) {

        return getConfigurationSetEventDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            final GetConfigurationSetEventDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationSetEventDestinationsRequest, GetConfigurationSetEventDestinationsResult> asyncHandler) {
        final GetConfigurationSetEventDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationSetEventDestinationsResult>() {
            @Override
            public GetConfigurationSetEventDestinationsResult call() throws Exception {
                GetConfigurationSetEventDestinationsResult result = null;

                try {
                    result = executeGetConfigurationSetEventDestinations(finalRequest);
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
    public java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest request) {

        return getContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactResult> getContactAsync(final GetContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactRequest, GetContactResult> asyncHandler) {
        final GetContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactResult>() {
            @Override
            public GetContactResult call() throws Exception {
                GetContactResult result = null;

                try {
                    result = executeGetContact(finalRequest);
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
    public java.util.concurrent.Future<GetContactListResult> getContactListAsync(GetContactListRequest request) {

        return getContactListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactListResult> getContactListAsync(final GetContactListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactListRequest, GetContactListResult> asyncHandler) {
        final GetContactListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactListResult>() {
            @Override
            public GetContactListResult call() throws Exception {
                GetContactListResult result = null;

                try {
                    result = executeGetContactList(finalRequest);
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
    public java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            GetCustomVerificationEmailTemplateRequest request) {

        return getCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            final GetCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomVerificationEmailTemplateRequest, GetCustomVerificationEmailTemplateResult> asyncHandler) {
        final GetCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomVerificationEmailTemplateResult>() {
            @Override
            public GetCustomVerificationEmailTemplateResult call() throws Exception {
                GetCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeGetCustomVerificationEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(GetDedicatedIpRequest request) {

        return getDedicatedIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(final GetDedicatedIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDedicatedIpRequest, GetDedicatedIpResult> asyncHandler) {
        final GetDedicatedIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDedicatedIpResult>() {
            @Override
            public GetDedicatedIpResult call() throws Exception {
                GetDedicatedIpResult result = null;

                try {
                    result = executeGetDedicatedIp(finalRequest);
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
    public java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest request) {

        return getDedicatedIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(final GetDedicatedIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDedicatedIpsRequest, GetDedicatedIpsResult> asyncHandler) {
        final GetDedicatedIpsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDedicatedIpsResult>() {
            @Override
            public GetDedicatedIpsResult call() throws Exception {
                GetDedicatedIpsResult result = null;

                try {
                    result = executeGetDedicatedIps(finalRequest);
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
    public java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            GetDeliverabilityDashboardOptionsRequest request) {

        return getDeliverabilityDashboardOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            final GetDeliverabilityDashboardOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeliverabilityDashboardOptionsRequest, GetDeliverabilityDashboardOptionsResult> asyncHandler) {
        final GetDeliverabilityDashboardOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeliverabilityDashboardOptionsResult>() {
            @Override
            public GetDeliverabilityDashboardOptionsResult call() throws Exception {
                GetDeliverabilityDashboardOptionsResult result = null;

                try {
                    result = executeGetDeliverabilityDashboardOptions(finalRequest);
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
    public java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(GetDeliverabilityTestReportRequest request) {

        return getDeliverabilityTestReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(final GetDeliverabilityTestReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeliverabilityTestReportRequest, GetDeliverabilityTestReportResult> asyncHandler) {
        final GetDeliverabilityTestReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeliverabilityTestReportResult>() {
            @Override
            public GetDeliverabilityTestReportResult call() throws Exception {
                GetDeliverabilityTestReportResult result = null;

                try {
                    result = executeGetDeliverabilityTestReport(finalRequest);
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
    public java.util.concurrent.Future<GetDomainDeliverabilityCampaignResult> getDomainDeliverabilityCampaignAsync(
            GetDomainDeliverabilityCampaignRequest request) {

        return getDomainDeliverabilityCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainDeliverabilityCampaignResult> getDomainDeliverabilityCampaignAsync(
            final GetDomainDeliverabilityCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainDeliverabilityCampaignRequest, GetDomainDeliverabilityCampaignResult> asyncHandler) {
        final GetDomainDeliverabilityCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainDeliverabilityCampaignResult>() {
            @Override
            public GetDomainDeliverabilityCampaignResult call() throws Exception {
                GetDomainDeliverabilityCampaignResult result = null;

                try {
                    result = executeGetDomainDeliverabilityCampaign(finalRequest);
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
    public java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(GetDomainStatisticsReportRequest request) {

        return getDomainStatisticsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(final GetDomainStatisticsReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainStatisticsReportRequest, GetDomainStatisticsReportResult> asyncHandler) {
        final GetDomainStatisticsReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainStatisticsReportResult>() {
            @Override
            public GetDomainStatisticsReportResult call() throws Exception {
                GetDomainStatisticsReportResult result = null;

                try {
                    result = executeGetDomainStatisticsReport(finalRequest);
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
    public java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest request) {

        return getEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(final GetEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEmailIdentityRequest, GetEmailIdentityResult> asyncHandler) {
        final GetEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEmailIdentityResult>() {
            @Override
            public GetEmailIdentityResult call() throws Exception {
                GetEmailIdentityResult result = null;

                try {
                    result = executeGetEmailIdentity(finalRequest);
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
    public java.util.concurrent.Future<GetEmailIdentityPoliciesResult> getEmailIdentityPoliciesAsync(GetEmailIdentityPoliciesRequest request) {

        return getEmailIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEmailIdentityPoliciesResult> getEmailIdentityPoliciesAsync(final GetEmailIdentityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEmailIdentityPoliciesRequest, GetEmailIdentityPoliciesResult> asyncHandler) {
        final GetEmailIdentityPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEmailIdentityPoliciesResult>() {
            @Override
            public GetEmailIdentityPoliciesResult call() throws Exception {
                GetEmailIdentityPoliciesResult result = null;

                try {
                    result = executeGetEmailIdentityPolicies(finalRequest);
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
    public java.util.concurrent.Future<GetEmailTemplateResult> getEmailTemplateAsync(GetEmailTemplateRequest request) {

        return getEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEmailTemplateResult> getEmailTemplateAsync(final GetEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEmailTemplateRequest, GetEmailTemplateResult> asyncHandler) {
        final GetEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEmailTemplateResult>() {
            @Override
            public GetEmailTemplateResult call() throws Exception {
                GetEmailTemplateResult result = null;

                try {
                    result = executeGetEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest request) {

        return getImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(final GetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler) {
        final GetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportJobResult>() {
            @Override
            public GetImportJobResult call() throws Exception {
                GetImportJobResult result = null;

                try {
                    result = executeGetImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetSuppressedDestinationResult> getSuppressedDestinationAsync(GetSuppressedDestinationRequest request) {

        return getSuppressedDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuppressedDestinationResult> getSuppressedDestinationAsync(final GetSuppressedDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuppressedDestinationRequest, GetSuppressedDestinationResult> asyncHandler) {
        final GetSuppressedDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSuppressedDestinationResult>() {
            @Override
            public GetSuppressedDestinationResult call() throws Exception {
                GetSuppressedDestinationResult result = null;

                try {
                    result = executeGetSuppressedDestination(finalRequest);
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
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest request) {

        return listConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(final ListConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler) {
        final ListConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationSetsResult>() {
            @Override
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result = null;

                try {
                    result = executeListConfigurationSets(finalRequest);
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
    public java.util.concurrent.Future<ListContactListsResult> listContactListsAsync(ListContactListsRequest request) {

        return listContactListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactListsResult> listContactListsAsync(final ListContactListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactListsRequest, ListContactListsResult> asyncHandler) {
        final ListContactListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactListsResult>() {
            @Override
            public ListContactListsResult call() throws Exception {
                ListContactListsResult result = null;

                try {
                    result = executeListContactLists(finalRequest);
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
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest request) {

        return listContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(final ListContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler) {
        final ListContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactsResult>() {
            @Override
            public ListContactsResult call() throws Exception {
                ListContactsResult result = null;

                try {
                    result = executeListContacts(finalRequest);
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
    public java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            ListCustomVerificationEmailTemplatesRequest request) {

        return listCustomVerificationEmailTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            final ListCustomVerificationEmailTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomVerificationEmailTemplatesRequest, ListCustomVerificationEmailTemplatesResult> asyncHandler) {
        final ListCustomVerificationEmailTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomVerificationEmailTemplatesResult>() {
            @Override
            public ListCustomVerificationEmailTemplatesResult call() throws Exception {
                ListCustomVerificationEmailTemplatesResult result = null;

                try {
                    result = executeListCustomVerificationEmailTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(ListDedicatedIpPoolsRequest request) {

        return listDedicatedIpPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(final ListDedicatedIpPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDedicatedIpPoolsRequest, ListDedicatedIpPoolsResult> asyncHandler) {
        final ListDedicatedIpPoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDedicatedIpPoolsResult>() {
            @Override
            public ListDedicatedIpPoolsResult call() throws Exception {
                ListDedicatedIpPoolsResult result = null;

                try {
                    result = executeListDedicatedIpPools(finalRequest);
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
    public java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(ListDeliverabilityTestReportsRequest request) {

        return listDeliverabilityTestReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(
            final ListDeliverabilityTestReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeliverabilityTestReportsRequest, ListDeliverabilityTestReportsResult> asyncHandler) {
        final ListDeliverabilityTestReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeliverabilityTestReportsResult>() {
            @Override
            public ListDeliverabilityTestReportsResult call() throws Exception {
                ListDeliverabilityTestReportsResult result = null;

                try {
                    result = executeListDeliverabilityTestReports(finalRequest);
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
    public java.util.concurrent.Future<ListDomainDeliverabilityCampaignsResult> listDomainDeliverabilityCampaignsAsync(
            ListDomainDeliverabilityCampaignsRequest request) {

        return listDomainDeliverabilityCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainDeliverabilityCampaignsResult> listDomainDeliverabilityCampaignsAsync(
            final ListDomainDeliverabilityCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainDeliverabilityCampaignsRequest, ListDomainDeliverabilityCampaignsResult> asyncHandler) {
        final ListDomainDeliverabilityCampaignsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainDeliverabilityCampaignsResult>() {
            @Override
            public ListDomainDeliverabilityCampaignsResult call() throws Exception {
                ListDomainDeliverabilityCampaignsResult result = null;

                try {
                    result = executeListDomainDeliverabilityCampaigns(finalRequest);
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
    public java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest request) {

        return listEmailIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(final ListEmailIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEmailIdentitiesRequest, ListEmailIdentitiesResult> asyncHandler) {
        final ListEmailIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEmailIdentitiesResult>() {
            @Override
            public ListEmailIdentitiesResult call() throws Exception {
                ListEmailIdentitiesResult result = null;

                try {
                    result = executeListEmailIdentities(finalRequest);
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
    public java.util.concurrent.Future<ListEmailTemplatesResult> listEmailTemplatesAsync(ListEmailTemplatesRequest request) {

        return listEmailTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEmailTemplatesResult> listEmailTemplatesAsync(final ListEmailTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEmailTemplatesRequest, ListEmailTemplatesResult> asyncHandler) {
        final ListEmailTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEmailTemplatesResult>() {
            @Override
            public ListEmailTemplatesResult call() throws Exception {
                ListEmailTemplatesResult result = null;

                try {
                    result = executeListEmailTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListImportJobsResult> listImportJobsAsync(ListImportJobsRequest request) {

        return listImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportJobsResult> listImportJobsAsync(final ListImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImportJobsRequest, ListImportJobsResult> asyncHandler) {
        final ListImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImportJobsResult>() {
            @Override
            public ListImportJobsResult call() throws Exception {
                ListImportJobsResult result = null;

                try {
                    result = executeListImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSuppressedDestinationsResult> listSuppressedDestinationsAsync(ListSuppressedDestinationsRequest request) {

        return listSuppressedDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuppressedDestinationsResult> listSuppressedDestinationsAsync(final ListSuppressedDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuppressedDestinationsRequest, ListSuppressedDestinationsResult> asyncHandler) {
        final ListSuppressedDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSuppressedDestinationsResult>() {
            @Override
            public ListSuppressedDestinationsResult call() throws Exception {
                ListSuppressedDestinationsResult result = null;

                try {
                    result = executeListSuppressedDestinations(finalRequest);
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
    public java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            PutAccountDedicatedIpWarmupAttributesRequest request) {

        return putAccountDedicatedIpWarmupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            final PutAccountDedicatedIpWarmupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountDedicatedIpWarmupAttributesRequest, PutAccountDedicatedIpWarmupAttributesResult> asyncHandler) {
        final PutAccountDedicatedIpWarmupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountDedicatedIpWarmupAttributesResult>() {
            @Override
            public PutAccountDedicatedIpWarmupAttributesResult call() throws Exception {
                PutAccountDedicatedIpWarmupAttributesResult result = null;

                try {
                    result = executePutAccountDedicatedIpWarmupAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutAccountDetailsResult> putAccountDetailsAsync(PutAccountDetailsRequest request) {

        return putAccountDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountDetailsResult> putAccountDetailsAsync(final PutAccountDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountDetailsRequest, PutAccountDetailsResult> asyncHandler) {
        final PutAccountDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountDetailsResult>() {
            @Override
            public PutAccountDetailsResult call() throws Exception {
                PutAccountDetailsResult result = null;

                try {
                    result = executePutAccountDetails(finalRequest);
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
    public java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(PutAccountSendingAttributesRequest request) {

        return putAccountSendingAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(final PutAccountSendingAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSendingAttributesRequest, PutAccountSendingAttributesResult> asyncHandler) {
        final PutAccountSendingAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSendingAttributesResult>() {
            @Override
            public PutAccountSendingAttributesResult call() throws Exception {
                PutAccountSendingAttributesResult result = null;

                try {
                    result = executePutAccountSendingAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutAccountSuppressionAttributesResult> putAccountSuppressionAttributesAsync(
            PutAccountSuppressionAttributesRequest request) {

        return putAccountSuppressionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSuppressionAttributesResult> putAccountSuppressionAttributesAsync(
            final PutAccountSuppressionAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSuppressionAttributesRequest, PutAccountSuppressionAttributesResult> asyncHandler) {
        final PutAccountSuppressionAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSuppressionAttributesResult>() {
            @Override
            public PutAccountSuppressionAttributesResult call() throws Exception {
                PutAccountSuppressionAttributesResult result = null;

                try {
                    result = executePutAccountSuppressionAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            PutConfigurationSetDeliveryOptionsRequest request) {

        return putConfigurationSetDeliveryOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            final PutConfigurationSetDeliveryOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetDeliveryOptionsRequest, PutConfigurationSetDeliveryOptionsResult> asyncHandler) {
        final PutConfigurationSetDeliveryOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetDeliveryOptionsResult>() {
            @Override
            public PutConfigurationSetDeliveryOptionsResult call() throws Exception {
                PutConfigurationSetDeliveryOptionsResult result = null;

                try {
                    result = executePutConfigurationSetDeliveryOptions(finalRequest);
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
    public java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            PutConfigurationSetReputationOptionsRequest request) {

        return putConfigurationSetReputationOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            final PutConfigurationSetReputationOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetReputationOptionsRequest, PutConfigurationSetReputationOptionsResult> asyncHandler) {
        final PutConfigurationSetReputationOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetReputationOptionsResult>() {
            @Override
            public PutConfigurationSetReputationOptionsResult call() throws Exception {
                PutConfigurationSetReputationOptionsResult result = null;

                try {
                    result = executePutConfigurationSetReputationOptions(finalRequest);
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
    public java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            PutConfigurationSetSendingOptionsRequest request) {

        return putConfigurationSetSendingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            final PutConfigurationSetSendingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSendingOptionsRequest, PutConfigurationSetSendingOptionsResult> asyncHandler) {
        final PutConfigurationSetSendingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetSendingOptionsResult>() {
            @Override
            public PutConfigurationSetSendingOptionsResult call() throws Exception {
                PutConfigurationSetSendingOptionsResult result = null;

                try {
                    result = executePutConfigurationSetSendingOptions(finalRequest);
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
    public java.util.concurrent.Future<PutConfigurationSetSuppressionOptionsResult> putConfigurationSetSuppressionOptionsAsync(
            PutConfigurationSetSuppressionOptionsRequest request) {

        return putConfigurationSetSuppressionOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetSuppressionOptionsResult> putConfigurationSetSuppressionOptionsAsync(
            final PutConfigurationSetSuppressionOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSuppressionOptionsRequest, PutConfigurationSetSuppressionOptionsResult> asyncHandler) {
        final PutConfigurationSetSuppressionOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetSuppressionOptionsResult>() {
            @Override
            public PutConfigurationSetSuppressionOptionsResult call() throws Exception {
                PutConfigurationSetSuppressionOptionsResult result = null;

                try {
                    result = executePutConfigurationSetSuppressionOptions(finalRequest);
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
    public java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            PutConfigurationSetTrackingOptionsRequest request) {

        return putConfigurationSetTrackingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            final PutConfigurationSetTrackingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetTrackingOptionsRequest, PutConfigurationSetTrackingOptionsResult> asyncHandler) {
        final PutConfigurationSetTrackingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetTrackingOptionsResult>() {
            @Override
            public PutConfigurationSetTrackingOptionsResult call() throws Exception {
                PutConfigurationSetTrackingOptionsResult result = null;

                try {
                    result = executePutConfigurationSetTrackingOptions(finalRequest);
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
    public java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(PutDedicatedIpInPoolRequest request) {

        return putDedicatedIpInPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(final PutDedicatedIpInPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDedicatedIpInPoolRequest, PutDedicatedIpInPoolResult> asyncHandler) {
        final PutDedicatedIpInPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDedicatedIpInPoolResult>() {
            @Override
            public PutDedicatedIpInPoolResult call() throws Exception {
                PutDedicatedIpInPoolResult result = null;

                try {
                    result = executePutDedicatedIpInPool(finalRequest);
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
    public java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(PutDedicatedIpWarmupAttributesRequest request) {

        return putDedicatedIpWarmupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(
            final PutDedicatedIpWarmupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDedicatedIpWarmupAttributesRequest, PutDedicatedIpWarmupAttributesResult> asyncHandler) {
        final PutDedicatedIpWarmupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDedicatedIpWarmupAttributesResult>() {
            @Override
            public PutDedicatedIpWarmupAttributesResult call() throws Exception {
                PutDedicatedIpWarmupAttributesResult result = null;

                try {
                    result = executePutDedicatedIpWarmupAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            PutDeliverabilityDashboardOptionRequest request) {

        return putDeliverabilityDashboardOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            final PutDeliverabilityDashboardOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDeliverabilityDashboardOptionRequest, PutDeliverabilityDashboardOptionResult> asyncHandler) {
        final PutDeliverabilityDashboardOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDeliverabilityDashboardOptionResult>() {
            @Override
            public PutDeliverabilityDashboardOptionResult call() throws Exception {
                PutDeliverabilityDashboardOptionResult result = null;

                try {
                    result = executePutDeliverabilityDashboardOption(finalRequest);
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
    public java.util.concurrent.Future<PutEmailIdentityConfigurationSetAttributesResult> putEmailIdentityConfigurationSetAttributesAsync(
            PutEmailIdentityConfigurationSetAttributesRequest request) {

        return putEmailIdentityConfigurationSetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityConfigurationSetAttributesResult> putEmailIdentityConfigurationSetAttributesAsync(
            final PutEmailIdentityConfigurationSetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityConfigurationSetAttributesRequest, PutEmailIdentityConfigurationSetAttributesResult> asyncHandler) {
        final PutEmailIdentityConfigurationSetAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityConfigurationSetAttributesResult>() {
            @Override
            public PutEmailIdentityConfigurationSetAttributesResult call() throws Exception {
                PutEmailIdentityConfigurationSetAttributesResult result = null;

                try {
                    result = executePutEmailIdentityConfigurationSetAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(PutEmailIdentityDkimAttributesRequest request) {

        return putEmailIdentityDkimAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(
            final PutEmailIdentityDkimAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimAttributesRequest, PutEmailIdentityDkimAttributesResult> asyncHandler) {
        final PutEmailIdentityDkimAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityDkimAttributesResult>() {
            @Override
            public PutEmailIdentityDkimAttributesResult call() throws Exception {
                PutEmailIdentityDkimAttributesResult result = null;

                try {
                    result = executePutEmailIdentityDkimAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutEmailIdentityDkimSigningAttributesResult> putEmailIdentityDkimSigningAttributesAsync(
            PutEmailIdentityDkimSigningAttributesRequest request) {

        return putEmailIdentityDkimSigningAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityDkimSigningAttributesResult> putEmailIdentityDkimSigningAttributesAsync(
            final PutEmailIdentityDkimSigningAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimSigningAttributesRequest, PutEmailIdentityDkimSigningAttributesResult> asyncHandler) {
        final PutEmailIdentityDkimSigningAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityDkimSigningAttributesResult>() {
            @Override
            public PutEmailIdentityDkimSigningAttributesResult call() throws Exception {
                PutEmailIdentityDkimSigningAttributesResult result = null;

                try {
                    result = executePutEmailIdentityDkimSigningAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            PutEmailIdentityFeedbackAttributesRequest request) {

        return putEmailIdentityFeedbackAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            final PutEmailIdentityFeedbackAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityFeedbackAttributesRequest, PutEmailIdentityFeedbackAttributesResult> asyncHandler) {
        final PutEmailIdentityFeedbackAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityFeedbackAttributesResult>() {
            @Override
            public PutEmailIdentityFeedbackAttributesResult call() throws Exception {
                PutEmailIdentityFeedbackAttributesResult result = null;

                try {
                    result = executePutEmailIdentityFeedbackAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            PutEmailIdentityMailFromAttributesRequest request) {

        return putEmailIdentityMailFromAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            final PutEmailIdentityMailFromAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityMailFromAttributesRequest, PutEmailIdentityMailFromAttributesResult> asyncHandler) {
        final PutEmailIdentityMailFromAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityMailFromAttributesResult>() {
            @Override
            public PutEmailIdentityMailFromAttributesResult call() throws Exception {
                PutEmailIdentityMailFromAttributesResult result = null;

                try {
                    result = executePutEmailIdentityMailFromAttributes(finalRequest);
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
    public java.util.concurrent.Future<PutSuppressedDestinationResult> putSuppressedDestinationAsync(PutSuppressedDestinationRequest request) {

        return putSuppressedDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSuppressedDestinationResult> putSuppressedDestinationAsync(final PutSuppressedDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSuppressedDestinationRequest, PutSuppressedDestinationResult> asyncHandler) {
        final PutSuppressedDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSuppressedDestinationResult>() {
            @Override
            public PutSuppressedDestinationResult call() throws Exception {
                PutSuppressedDestinationResult result = null;

                try {
                    result = executePutSuppressedDestination(finalRequest);
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
    public java.util.concurrent.Future<SendBulkEmailResult> sendBulkEmailAsync(SendBulkEmailRequest request) {

        return sendBulkEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBulkEmailResult> sendBulkEmailAsync(final SendBulkEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBulkEmailRequest, SendBulkEmailResult> asyncHandler) {
        final SendBulkEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendBulkEmailResult>() {
            @Override
            public SendBulkEmailResult call() throws Exception {
                SendBulkEmailResult result = null;

                try {
                    result = executeSendBulkEmail(finalRequest);
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
    public java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(SendCustomVerificationEmailRequest request) {

        return sendCustomVerificationEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(final SendCustomVerificationEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCustomVerificationEmailRequest, SendCustomVerificationEmailResult> asyncHandler) {
        final SendCustomVerificationEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCustomVerificationEmailResult>() {
            @Override
            public SendCustomVerificationEmailResult call() throws Exception {
                SendCustomVerificationEmailResult result = null;

                try {
                    result = executeSendCustomVerificationEmail(finalRequest);
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
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest request) {

        return sendEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(final SendEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler) {
        final SendEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendEmailResult>() {
            @Override
            public SendEmailResult call() throws Exception {
                SendEmailResult result = null;

                try {
                    result = executeSendEmail(finalRequest);
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
    public java.util.concurrent.Future<TestRenderEmailTemplateResult> testRenderEmailTemplateAsync(TestRenderEmailTemplateRequest request) {

        return testRenderEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestRenderEmailTemplateResult> testRenderEmailTemplateAsync(final TestRenderEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestRenderEmailTemplateRequest, TestRenderEmailTemplateResult> asyncHandler) {
        final TestRenderEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestRenderEmailTemplateResult>() {
            @Override
            public TestRenderEmailTemplateResult call() throws Exception {
                TestRenderEmailTemplateResult result = null;

                try {
                    result = executeTestRenderEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest request) {

        return updateConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler) {
        final UpdateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetEventDestinationResult>() {
            @Override
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeUpdateConfigurationSetEventDestination(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest request) {

        return updateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(final UpdateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler) {
        final UpdateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactResult>() {
            @Override
            public UpdateContactResult call() throws Exception {
                UpdateContactResult result = null;

                try {
                    result = executeUpdateContact(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactListResult> updateContactListAsync(UpdateContactListRequest request) {

        return updateContactListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactListResult> updateContactListAsync(final UpdateContactListRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactListRequest, UpdateContactListResult> asyncHandler) {
        final UpdateContactListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactListResult>() {
            @Override
            public UpdateContactListResult call() throws Exception {
                UpdateContactListResult result = null;

                try {
                    result = executeUpdateContactList(finalRequest);
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
    public java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            UpdateCustomVerificationEmailTemplateRequest request) {

        return updateCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            final UpdateCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomVerificationEmailTemplateRequest, UpdateCustomVerificationEmailTemplateResult> asyncHandler) {
        final UpdateCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomVerificationEmailTemplateResult>() {
            @Override
            public UpdateCustomVerificationEmailTemplateResult call() throws Exception {
                UpdateCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeUpdateCustomVerificationEmailTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateEmailIdentityPolicyResult> updateEmailIdentityPolicyAsync(UpdateEmailIdentityPolicyRequest request) {

        return updateEmailIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailIdentityPolicyResult> updateEmailIdentityPolicyAsync(final UpdateEmailIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEmailIdentityPolicyRequest, UpdateEmailIdentityPolicyResult> asyncHandler) {
        final UpdateEmailIdentityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEmailIdentityPolicyResult>() {
            @Override
            public UpdateEmailIdentityPolicyResult call() throws Exception {
                UpdateEmailIdentityPolicyResult result = null;

                try {
                    result = executeUpdateEmailIdentityPolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdateEmailTemplateResult> updateEmailTemplateAsync(UpdateEmailTemplateRequest request) {

        return updateEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailTemplateResult> updateEmailTemplateAsync(final UpdateEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEmailTemplateRequest, UpdateEmailTemplateResult> asyncHandler) {
        final UpdateEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEmailTemplateResult>() {
            @Override
            public UpdateEmailTemplateResult call() throws Exception {
                UpdateEmailTemplateResult result = null;

                try {
                    result = executeUpdateEmailTemplate(finalRequest);
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
