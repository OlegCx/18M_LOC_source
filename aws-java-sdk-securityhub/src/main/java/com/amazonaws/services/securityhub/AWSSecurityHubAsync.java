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
package com.amazonaws.services.securityhub;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securityhub.AbstractAWSSecurityHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * Security Hub provides you with a comprehensive view of the security state of your AWS environment and resources. It
 * also provides you with the readiness status of your environment based on controls from supported security standards.
 * Security Hub collects security data from AWS accounts, services, and integrated third-party products and helps you
 * analyze security trends in your environment to identify the highest priority security issues. For more information
 * about Security Hub, see the <i> <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a> </i>.
 * </p>
 * <p>
 * When you use operations in the Security Hub API, the requests are executed only in the AWS Region that is currently
 * active or in the specific AWS Region that you specify in your request. Any configuration or settings change that
 * results from the operation is applied only to that Region. To make the same change in other Regions, execute the same
 * command for each Region to apply the change to.
 * </p>
 * <p>
 * For example, if your Region is set to <code>us-west-2</code>, when you use <code> <a>CreateMembers</a> </code> to add
 * a member account to Security Hub, the association of the member account with the administrator account is created
 * only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region
 * that the invitation was sent from.
 * </p>
 * <p>
 * The following throttling limits apply to using Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <a>BatchEnableStandards</a> </code> - <code>RateLimit</code> of 1 request per second, <code>BurstLimit</code>
 * of 1 request per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>GetFindings</a> </code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>UpdateFindings</a> </code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>UpdateStandardsControl</a> </code> - <code>RateLimit</code> of 1 request per second,
 * <code>BurstLimit</code> of 5 requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per
 * second.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecurityHubAsync extends AWSSecurityHub {

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptAdministratorInvitationRequest, AcceptAdministratorInvitationResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest);

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisableStandardsRequest, BatchDisableStandardsResult> asyncHandler);

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>. To obtain the ARN for a standard, use
     * the <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest);

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>. To obtain the ARN for a standard, use
     * the <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEnableStandardsRequest, BatchEnableStandardsResult> asyncHandler);

    /**
     * <p>
     * Imports security findings generated from an integrated product into Security Hub. This action is requested by the
     * integrated product to import its findings into Security Hub.
     * </p>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be used to update the following finding
     * fields and objects, which Security Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Finding providers also should not use <code>BatchImportFindings</code> to update the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, finding providers use <code>FindingProviderFields</code> to provide values for these attributes.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest);

    /**
     * <p>
     * Imports security findings generated from an integrated product into Security Hub. This action is requested by the
     * integrated product to import its findings into Security Hub.
     * </p>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be used to update the following finding
     * fields and objects, which Security Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Finding providers also should not use <code>BatchImportFindings</code> to update the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, finding providers use <code>FindingProviderFields</code> to provide values for these attributes.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchImportFindingsRequest, BatchImportFindingsResult> asyncHandler);

    /**
     * <p>
     * Used by Security Hub customers to update information about their investigation into a finding. Requested by
     * administrator accounts or member accounts. Administrator accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Administrator and member accounts can use <code>BatchUpdateFindings</code> to update the following finding fields
     * and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure IAM policies to restrict access to fields and field values. For example, you might not want
     * member accounts to be able to suppress findings or change the finding severity. See <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/finding-update-batchupdatefindings.html#batchupdatefindings-configure-access"
     * >Configuring access to BatchUpdateFindings</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @return A Java Future containing the result of the BatchUpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(BatchUpdateFindingsRequest batchUpdateFindingsRequest);

    /**
     * <p>
     * Used by Security Hub customers to update information about their investigation into a finding. Requested by
     * administrator accounts or member accounts. Administrator accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Administrator and member accounts can use <code>BatchUpdateFindings</code> to update the following finding fields
     * and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure IAM policies to restrict access to fields and field values. For example, you might not want
     * member accounts to be able to suppress findings or change the finding severity. See <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/finding-update-batchupdatefindings.html#batchupdatefindings-configure-access"
     * >Configuring access to BatchUpdateFindings</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(BatchUpdateFindingsRequest batchUpdateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateFindingsRequest, BatchUpdateFindingsResult> asyncHandler);

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon
     * CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return A Java Future containing the result of the CreateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(CreateActionTargetRequest createActionTargetRequest);

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon
     * CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(CreateActionTargetRequest createActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActionTargetRequest, CreateActionTargetResult> asyncHandler);

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest);

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInsightRequest, CreateInsightResult> asyncHandler);

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the administrator account. If you are integrated with Organizations, then the administrator
     * account is designated by the organization management account.
     * </p>
     * <p>
     * <code>CreateMembers</code> is always used to add accounts that are not organization members.
     * </p>
     * <p>
     * For accounts that are part of an organization, <code>CreateMembers</code> is only used in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Security Hub is not configured to automatically add new accounts in an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * The account was disassociated or deleted in Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the
     * <code> <a>EnableSecurityHub</a> </code> operation.
     * </p>
     * <p>
     * For accounts that are not organization members, you create the account association and then send an invitation to
     * the member account. To send the invitation, you use the <code> <a>InviteMembers</a> </code> operation. If the
     * account owner accepts the invitation, the account becomes a member account in Security Hub.
     * </p>
     * <p>
     * Accounts that are part of an organization do not receive an invitation. They automatically become a member
     * account in Security Hub.
     * </p>
     * <p>
     * A permissions policy is added that permits the administrator account to view the findings generated in the member
     * account. When Security Hub is enabled in a member account, the member account findings are also visible to the
     * administrator account.
     * </p>
     * <p>
     * To remove the association between the administrator and member accounts, use the
     * <code> <a>DisassociateFromMasterAccount</a> </code> or <code> <a>DisassociateMembers</a> </code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the administrator account. If you are integrated with Organizations, then the administrator
     * account is designated by the organization management account.
     * </p>
     * <p>
     * <code>CreateMembers</code> is always used to add accounts that are not organization members.
     * </p>
     * <p>
     * For accounts that are part of an organization, <code>CreateMembers</code> is only used in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Security Hub is not configured to automatically add new accounts in an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * The account was disassociated or deleted in Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the
     * <code> <a>EnableSecurityHub</a> </code> operation.
     * </p>
     * <p>
     * For accounts that are not organization members, you create the account association and then send an invitation to
     * the member account. To send the invitation, you use the <code> <a>InviteMembers</a> </code> operation. If the
     * account owner accepts the invitation, the account becomes a member account in Security Hub.
     * </p>
     * <p>
     * Accounts that are part of an organization do not receive an invitation. They automatically become a member
     * account in Security Hub.
     * </p>
     * <p>
     * A permissions policy is added that permits the administrator account to view the findings generated in the member
     * account. When Security Hub is enabled in a member account, the member account findings are also visible to the
     * administrator account.
     * </p>
     * <p>
     * To remove the association between the administrator and member accounts, use the
     * <code> <a>DisassociateFromMasterAccount</a> </code> or <code> <a>DisassociateMembers</a> </code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. Organization accounts do not
     * receive invitations.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. Organization accounts do not
     * receive invitations.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights that were already sent to Amazon
     * CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return A Java Future containing the result of the DeleteActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(DeleteActionTargetRequest deleteActionTargetRequest);

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights that were already sent to Amazon
     * CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(DeleteActionTargetRequest deleteActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActionTargetRequest, DeleteActionTargetResult> asyncHandler);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler);

    /**
     * <p>
     * Deletes invitations received by the AWS account to become a member account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. Organization accounts do not
     * receive invitations.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes invitations received by the AWS account to become a member account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. Organization accounts do not
     * receive invitations.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * <p>
     * Can be used to delete member accounts that belong to an organization as well as member accounts that were invited
     * manually.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * <p>
     * Can be used to delete member accounts that belong to an organization as well as member accounts that were invited
     * manually.
     * </p>
     * 
     * @param deleteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return A Java Future containing the result of the DescribeActionTargets operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(DescribeActionTargetsRequest describeActionTargetsRequest);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActionTargets operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(DescribeActionTargetsRequest describeActionTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActionTargetsRequest, DescribeActionTargetsResult> asyncHandler);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return A Java Future containing the result of the DescribeHub operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHubResult> describeHubAsync(DescribeHubRequest describeHubRequest);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHubResult> describeHubAsync(DescribeHubRequest describeHubRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHubRequest, DescribeHubResult> asyncHandler);

    /**
     * <p>
     * Returns information about the Organizations configuration for Security Hub. Can only be called from a Security
     * Hub administrator account.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the Organizations configuration for Security Hub. Can only be called from a Security
     * Hub administrator account.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about product integrations in Security Hub.
     * </p>
     * <p>
     * You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include
     * that integration.
     * </p>
     * <p>
     * If you do not provide an integration ARN, then the results include all of the available product integrations.
     * </p>
     * 
     * @param describeProductsRequest
     * @return A Java Future containing the result of the DescribeProducts operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(DescribeProductsRequest describeProductsRequest);

    /**
     * <p>
     * Returns information about product integrations in Security Hub.
     * </p>
     * <p>
     * You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include
     * that integration.
     * </p>
     * <p>
     * If you do not provide an integration ARN, then the results include all of the available product integrations.
     * </p>
     * 
     * @param describeProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProducts operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(DescribeProductsRequest describeProductsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductsRequest, DescribeProductsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return A Java Future containing the result of the DescribeStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(DescribeStandardsRequest describeStandardsRequest);

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(DescribeStandardsRequest describeStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStandardsRequest, DescribeStandardsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is currently enabled, the severity, and a link
     * to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @return A Java Future containing the result of the DescribeStandardsControls operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(
            DescribeStandardsControlsRequest describeStandardsControlsRequest);

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is currently enabled, the severity, and a link
     * to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStandardsControls operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(
            DescribeStandardsControlsRequest describeStandardsControlsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStandardsControlsRequest, DescribeStandardsControlsResult> asyncHandler);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<DisableImportFindingsForProductRequest, DisableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you
     * must submit one request per Region where you have enabled Security Hub.
     * </p>
     * <p>
     * When you disable Security Hub for an administrator account, it doesn't disable Security Hub for any associated
     * member accounts.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your
     * administrator and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest);

    /**
     * <p>
     * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you
     * must submit one request per Region where you have enabled Security Hub.
     * </p>
     * <p>
     * When you disable Security Hub for an administrator account, it doesn't disable Security Hub for any associated
     * member accounts.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your
     * administrator and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSecurityHubRequest, DisableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified member accounts from the associated administrator account.
     * </p>
     * <p>
     * Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Disassociates the specified member accounts from the associated administrator account.
     * </p>
     * <p>
     * Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler);

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permissions policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest);

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permissions policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<EnableImportFindingsForProductRequest, EnableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other
     * services that are integrated with Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable Security Hub, you also automatically enable
     * the following standards.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CIS AWS Foundations
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Foundational Security Best Practices
     * </p>
     * </li>
     * </ul>
     * <p>
     * You do not enable the Payment Card Industry Data Security Standard (PCI DSS) standard.
     * </p>
     * <p>
     * To not enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the <code> <a>BatchEnableStandards</a> </code>
     * operation. To disable a standard, use the <code> <a>BatchDisableStandards</a> </code> operation.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">Setting Up AWS
     * Security Hub</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other
     * services that are integrated with Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable Security Hub, you also automatically enable
     * the following standards.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CIS AWS Foundations
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Foundational Security Best Practices
     * </p>
     * </li>
     * </ul>
     * <p>
     * You do not enable the Payment Card Industry Data Security Standard (PCI DSS) standard.
     * </p>
     * <p>
     * To not enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the <code> <a>BatchEnableStandards</a> </code>
     * operation. To disable a standard, use the <code> <a>BatchDisableStandards</a> </code> operation.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">Setting Up AWS
     * Security Hub</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSecurityHubRequest, EnableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnabledStandardsRequest, GetEnabledStandardsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightResultsRequest, GetInsightResultsResult> asyncHandler);

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the specified account IDs.
     * </p>
     * <p>
     * An administrator account can be either the delegated Security Hub administrator account for an organization or an
     * administrator account that enabled Security Hub manually.
     * </p>
     * <p>
     * The results include both member accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the specified account IDs.
     * </p>
     * <p>
     * An administrator account can be either the delegated Security Hub administrator account for an organization or an
     * administrator account that enabled Security Hub manually.
     * </p>
     * <p>
     * The results include both member accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param getMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * <p>
     * Invites other AWS accounts to become member accounts for the Security Hub administrator account that the
     * invitation is sent from.
     * </p>
     * <p>
     * This operation is only used to invite accounts that do not belong to an organization. Organization accounts do
     * not receive invitations.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the <code> <a>CreateMembers</a> </code>
     * action to create the member account in Security Hub.
     * </p>
     * <p>
     * When the account owner enables Security Hub and accepts the invitation to become a member account, the
     * administrator account can view the findings generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Invites other AWS accounts to become member accounts for the Security Hub administrator account that the
     * invitation is sent from.
     * </p>
     * <p>
     * This operation is only used to invite accounts that do not belong to an organization. Organization accounts do
     * not receive invitations.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the <code> <a>CreateMembers</a> </code>
     * action to create the member account in Security Hub.
     * </p>
     * <p>
     * When the account owner enables Security Hub and accepts the invitation to become a member account, the
     * administrator account can view the findings generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnabledProductsForImportRequest, ListEnabledProductsForImportResult> asyncHandler);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * <p>
     * This operation is only used by accounts that are managed by invitation. Accounts that are managed using the
     * integration with AWS Organizations do not receive invitations.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * <p>
     * This operation is only used by accounts that are managed by invitation. Accounts that are managed using the
     * integration with AWS Organizations do not receive invitations.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub administrator account.
     * </p>
     * <p>
     * The results include both member accounts that belong to an organization and member accounts that were invited
     * manually.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub administrator account.
     * </p>
     * <p>
     * The results include both member accounts that belong to an organization and member accounts that were invited
     * manually.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSecurityHubAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecurityHubAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecurityHubAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return A Java Future containing the result of the UpdateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(UpdateActionTargetRequest updateActionTargetRequest);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(UpdateActionTargetRequest updateActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateActionTargetRequest, UpdateActionTargetResult> asyncHandler);

    /**
     * <p>
     * <code>UpdateFindings</code> is deprecated. Instead of <code>UpdateFindings</code>, use
     * <code>BatchUpdateFindings</code>.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * <code>UpdateFindings</code> is deprecated. Instead of <code>UpdateFindings</code>, use
     * <code>BatchUpdateFindings</code>.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * 
     * @param updateFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler);

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest);

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInsightRequest, UpdateInsightResult> asyncHandler);

    /**
     * <p>
     * Used to update the configuration related to Organizations. Can only be called from a Security Hub administrator
     * account.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Used to update the configuration related to Organizations. Can only be called from a Security Hub administrator
     * account.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @return A Java Future containing the result of the UpdateSecurityHubConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(
            UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest);

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityHubConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(
            UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityHubConfigurationRequest, UpdateSecurityHubConfigurationResult> asyncHandler);

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return A Java Future containing the result of the UpdateStandardsControl operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(UpdateStandardsControlRequest updateStandardsControlRequest);

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStandardsControl operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(UpdateStandardsControlRequest updateStandardsControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStandardsControlRequest, UpdateStandardsControlResult> asyncHandler);

}
