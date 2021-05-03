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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.securityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securityhub.AbstractAWSSecurityHub} instead.
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
public interface AWSSecurityHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "securityhub";

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
     * @return Result of the AcceptAdministratorInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptAdministratorInvitationResult acceptAdministratorInvitation(AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest);

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
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

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
     * @return Result of the BatchDisableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisableStandardsResult batchDisableStandards(BatchDisableStandardsRequest batchDisableStandardsRequest);

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
     * @return Result of the BatchEnableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    BatchEnableStandardsResult batchEnableStandards(BatchEnableStandardsRequest batchEnableStandardsRequest);

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
     * @return Result of the BatchImportFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    BatchImportFindingsResult batchImportFindings(BatchImportFindingsRequest batchImportFindingsRequest);

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
     * @return Result of the BatchUpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateFindingsResult batchUpdateFindings(BatchUpdateFindingsRequest batchUpdateFindingsRequest);

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
     * @return Result of the CreateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    CreateActionTargetResult createActionTarget(CreateActionTargetRequest createActionTargetRequest);

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
     * @return Result of the CreateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInsightResult createInsight(CreateInsightRequest createInsightRequest);

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
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

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
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

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
     * @return Result of the DeleteActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteActionTargetResult deleteActionTarget(DeleteActionTargetRequest deleteActionTargetRequest);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return Result of the DeleteInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInsightResult deleteInsight(DeleteInsightRequest deleteInsightRequest);

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
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

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
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return Result of the DescribeActionTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeActionTargetsResult describeActionTargets(DescribeActionTargetsRequest describeActionTargetsRequest);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return Result of the DescribeHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHubResult describeHub(DescribeHubRequest describeHubRequest);

    /**
     * <p>
     * Returns information about the Organizations configuration for Security Hub. Can only be called from a Security
     * Hub administrator account.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

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
     * @return Result of the DescribeProducts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProductsResult describeProducts(DescribeProductsRequest describeProductsRequest);

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return Result of the DescribeStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeStandardsResult describeStandards(DescribeStandardsRequest describeStandardsRequest);

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
     * @return Result of the DescribeStandardsControls operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStandardsControlsResult describeStandardsControls(DescribeStandardsControlsRequest describeStandardsControlsRequest);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return Result of the DisableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    DisableImportFindingsForProductResult disableImportFindingsForProduct(DisableImportFindingsForProductRequest disableImportFindingsForProductRequest);

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

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
     * @return Result of the DisableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest);

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
     * @return Result of the DisassociateFromAdministratorAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromAdministratorAccountResult disassociateFromAdministratorAccount(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

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
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

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
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

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
     * @return Result of the EnableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    EnableImportFindingsForProductResult enableImportFindingsForProduct(EnableImportFindingsForProductRequest enableImportFindingsForProductRequest);

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

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
     * @return Result of the EnableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return Result of the GetAdministratorAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetAdministratorAccountResult getAdministratorAccount(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return Result of the GetEnabledStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnabledStandardsResult getEnabledStandards(GetEnabledStandardsRequest getEnabledStandardsRequest);

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return Result of the GetInsightResults operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    GetInsightResultsResult getInsightResults(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    GetInsightsResult getInsights(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

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
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

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
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

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
     * @return Result of the InviteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return Result of the ListEnabledProductsForImport operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @sample AWSSecurityHub.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnabledProductsForImportResult listEnabledProductsForImport(ListEnabledProductsForImportRequest listEnabledProductsForImportRequest);

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
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

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
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return Result of the UpdateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateActionTargetResult updateActionTarget(UpdateActionTargetRequest updateActionTargetRequest);

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
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return Result of the UpdateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInsightResult updateInsight(UpdateInsightRequest updateInsightRequest);

    /**
     * <p>
     * Used to update the configuration related to Organizations. Can only be called from a Security Hub administrator
     * account.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @return Result of the UpdateSecurityHubConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account or
     *         throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSecurityHubConfigurationResult updateSecurityHubConfiguration(UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest);

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return Result of the UpdateStandardsControl operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         There is an issue with the account used to make the request. Either Security Hub is not enabled for the
     *         account, or the account does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateStandardsControlResult updateStandardsControl(UpdateStandardsControlRequest updateStandardsControlRequest);

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
