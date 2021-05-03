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
package com.amazonaws.services.organizations;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.organizations.model.*;

/**
 * Interface for accessing Organizations.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.organizations.AbstractAWSOrganizations} instead.
 * </p>
 * <p>
 * <p>
 * AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
 * <i>organization</i> and centrally manage your accounts and their resources.
 * </p>
 * <p>
 * This guide provides descriptions of the Organizations operations. For more information about using this service, see
 * the <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">AWS Organizations User
 * Guide</a>.
 * </p>
 * <p>
 * <b>Support and feedback for AWS Organizations</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:feedback-awsorganizations@amazon.com">feedback-awsorganizations@amazon.com</a> or post your feedback and
 * questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=219">AWS Organizations support forum</a>.
 * For more information about the AWS support forums, see <a href="http://forums.aws.amazon.com/help.jspa">Forums
 * Help</a>.
 * </p>
 * <p>
 * <b>Endpoint to call When using the AWS CLI or the AWS SDK</b>
 * </p>
 * <p>
 * For the current release of Organizations, specify the <code>us-east-1</code> region for all AWS API and AWS CLI calls
 * made from the commercial AWS Regions outside of China. If calling from one of the AWS Regions in China, then specify
 * <code>cn-northwest-1</code>. You can do this in the AWS CLI by using these parameters and commands:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the following parameter with each command to specify both the endpoint and its region:
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.us-east-1.amazonaws.com</code> <i>(from commercial AWS Regions outside of
 * China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.cn-northwest-1.amazonaws.com.cn</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the default endpoint, but configure your default region with this command:
 * </p>
 * <p>
 * <code>aws configure set default.region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>aws configure set default.region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the following parameter with each command to specify the endpoint:
 * </p>
 * <p>
 * <code>--region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests the
 * Organizations service received, who made the request and when, and so on. For more about AWS Organizations and its
 * support for AWS CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_incident-response.html#orgs_cloudtrail-integration"
 * >Logging AWS Organizations Events with AWS CloudTrail</a> in the <i>AWS Organizations User Guide</i>. To learn more
 * about AWS CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOrganizations {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "organizations";

    /**
     * Overrides the default endpoint for this client ("organizations.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "organizations.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "organizations.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "organizations.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "organizations.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSOrganizations#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.
     * </p>
     * <p>
     * This operation can be called only by the following principals when they also have the relevant IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Invitation to join</b> or <b>Approve all features request</b> handshakes: only a principal from the member
     * account.
     * </p>
     * <p>
     * The user who calls the API for an invitation to join must have the <code>organizations:AcceptHandshake</code>
     * permission. If you enabled all features in the organization, the user must also have the
     * <code>iam:CreateServiceLinkedRole</code> permission so that AWS Organizations can create the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Enable all features final confirmation</b> handshake: only a principal from the management account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide.</i> For more information about
     * requests to enable all features in the organization, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
     * 
     * @param acceptHandshakeRequest
     * @return Result of the AcceptHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_IS_ALREADY_PENDING_ALL_FEATURES_MIGRATION: The handshake request is invalid because the
     *         organization has already started the process to enable all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws AccessDeniedForDependencyException
     *         The operation that you attempted requires you to have the <code>iam:CreateServiceLinkedRole</code> for
     *         <code>organizations.amazonaws.com</code> permission so that AWS Organizations can create the required
     *         service-linked role. You don't have that permission.
     * @sample AWSOrganizations.AcceptHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AcceptHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptHandshakeResult acceptHandshake(AcceptHandshakeRequest acceptHandshakeRequest);

    /**
     * <p>
     * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects
     * accounts depends on the type of policy. Refer to the <i>AWS Organizations User Guide</i> for information about
     * each policy type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws DuplicatePolicyAttachmentException
     *         The selected policy is already attached to the specified target.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws PolicyTypeNotEnabledException
     *         The specified policy type isn't currently enabled in this root. You can't attach policies of the
     *         specified type to entities in a root until you enable that type in the root. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AttachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    AttachPolicyResult attachPolicy(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Cancels a handshake. Canceling a handshake sets the handshake state to <code>CANCELED</code>.
     * </p>
     * <p>
     * This operation can be called only from the account that originated the handshake. The recipient of the handshake
     * can't cancel it, but can use <a>DeclineHandshake</a> instead. After a handshake is canceled, the recipient can no
     * longer respond to that handshake.
     * </p>
     * <p>
     * After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
     * 
     * @param cancelHandshakeRequest
     * @return Result of the CancelHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.CancelHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CancelHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    CancelHandshakeResult cancelHandshake(CancelHandshakeRequest cancelHandshakeRequest);

    /**
     * <p>
     * Creates an AWS account that is automatically a member of the organization whose credentials made the request.
     * This is an asynchronous request that AWS performs in the background. Because <code>CreateAccount</code> operates
     * asynchronously, it can return a successful completion message even though account initialization might still be
     * in progress. You might need to wait a few minutes before you can successfully access the account. To check the
     * status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Id</code> member of the <code>CreateAccountStatus</code> response element from this operation to
     * provide as a parameter to the <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with AWS Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_security_incident-response.html#orgs_cloudtrail-integration"
     * >Logging and monitoring in AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The user who calls the API to create an account must have the <code>organizations:CreateAccount</code>
     * permission. If you enabled all features in the organization, AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants users in the management account administrator
     * permissions in the new member account. Principals in the management account can assume the role. AWS
     * Organizations clones the company name and address information for the new account from the organization's
     * management account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account, such as a payment method and signing the
     * end user license agreement (EULA) is <i>not</i> automatically collected. If you must remove an account from your
     * organization later, you can do so only after you provide the missing information. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateAccount</code> to create multiple temporary accounts isn't recommended. You can only close an
     * account from the Billing and Cost Management Console, and you must be signed in as the root user. For information
     * on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createAccountRequest
     * @return Result of the CreateAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateAccount" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAccountResult createAccount(CreateAccountRequest createAccountRequest);

    /**
     * <p>
     * This action is available if all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're authorized to create accounts in the AWS GovCloud (US) Region. For more information on the AWS GovCloud
     * (US) Region, see the <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html"> <i>AWS
     * GovCloud User Guide</i>.</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * You already have an account in the AWS GovCloud (US) Region that is paired with a management account of an
     * organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call this action from the management account of your organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You have the <code>organizations:CreateGovCloudAccount</code> permission.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS Organizations automatically creates the required service-linked role named
     * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but you should also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that AWS CloudTrail is enabled to store logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an S3 bucket for AWS CloudTrail log storage.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html">Verifying AWS CloudTrail
     * Is Enabled</a> in the <i>AWS GovCloud User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * The tags are attached to the commercial account associated with the GovCloud account, rather than the GovCloud
     * account itself. To add tags to the GovCloud account, call the <a>TagResource</a> operation in the GovCloud Region
     * after the new GovCloud account exists.
     * </p>
     * <p>
     * You call this action from the management account of your organization in the commercial Region to create a
     * standalone AWS account in the AWS GovCloud (US) Region. After the account is created, the management account of
     * an organization in the AWS GovCloud (US) Region can invite it to that organization. For more information on
     * inviting standalone accounts in the AWS GovCloud (US) to join an organization, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS Organizations</a>
     * in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * Calling <code>CreateGovCloudAccount</code> is an asynchronous request that AWS performs in the background.
     * Because <code>CreateGovCloudAccount</code> operates asynchronously, it can return a successful completion message
     * even though account initialization might still be in progress. You might need to wait a few minutes before you
     * can successfully access the account. To check the status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to provide as a parameter to the
     * <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html">Monitoring the Activity in
     * Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * When you call the <code>CreateGovCloudAccount</code> action, you create two accounts: a standalone account in the
     * AWS GovCloud (US) Region and an associated account in the commercial Region for billing and support purposes. The
     * account in the commercial Region is automatically a member of the organization whose credentials made the
     * request. Both accounts are associated with the same email address.
     * </p>
     * <p>
     * A role is created in the new account in the commercial Region that allows the management account in the
     * organization in the commercial Region to assume it. An AWS GovCloud (US) account is then created and associated
     * with the commercial account that you just created. A role is also created in the new AWS GovCloud (US) account
     * that can be assumed by the AWS GovCloud (US) account that is associated with the management account of the
     * commercial organization. For more information and to view a diagram that explains how account access works, see
     * <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     * Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account is <i>not</i> automatically collected.
     * This includes a payment method and signing the end user license agreement (EULA). If you must remove an account
     * from your organization later, you can do so only after you provide the missing information. Follow the steps at
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateGovCloudAccount</code> to create multiple temporary accounts isn't recommended. You can only
     * close an account from the AWS Billing and Cost Management console, and you must be signed in as the root user.
     * For information on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createGovCloudAccountRequest
     * @return Result of the CreateGovCloudAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.CreateGovCloudAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateGovCloudAccount"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGovCloudAccountResult createGovCloudAccount(CreateGovCloudAccountRequest createGovCloudAccountRequest);

    /**
     * <p>
     * Creates an AWS organization. The account whose user is calling the <code>CreateOrganization</code> operation
     * automatically becomes the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >management account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's
     * management account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default (or if you set the <code>FeatureSet</code> parameter to <code>ALL</code>), the new organization is
     * created with all features enabled and service control policies automatically enabled in the root. If you instead
     * choose to create the organization supporting only the consolidated billing features by setting the
     * <code>FeatureSet</code> parameter to <code>CONSOLIDATED_BILLING"</code>, no policy types are enabled by default,
     * and you can't use organization policies
     * </p>
     * 
     * @param createOrganizationRequest
     * @return Result of the CreateOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AlreadyInOrganizationException
     *         This account is already a member of an organization. An account can belong to only one organization at a
     *         time.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws AccessDeniedForDependencyException
     *         The operation that you attempted requires you to have the <code>iam:CreateServiceLinkedRole</code> for
     *         <code>organizations.amazonaws.com</code> permission so that AWS Organizations can create the required
     *         service-linked role. You don't have that permission.
     * @sample AWSOrganizations.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOrganizationResult createOrganization(CreateOrganizationRequest createOrganizationRequest);

    /**
     * <p>
     * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables
     * you to organize your accounts to apply policies according to your business requirements. The number of levels
     * deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control
     * policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param createOrganizationalUnitRequest
     * @return Result of the CreateOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws DuplicateOrganizationalUnitException
     *         An OU with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.CreateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOrganizationalUnitResult createOrganizationalUnit(CreateOrganizationalUnitRequest createOrganizationalUnitRequest);

    /**
     * <p>
     * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual
     * AWS account.
     * </p>
     * <p>
     * For more information about policies and their use, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html">Managing Organization
     * Policies</a>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param createPolicyRequest
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws DuplicatePolicyException
     *         A policy with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws MalformedPolicyDocumentException
     *         The provided policy document doesn't meet the requirements of the specified policy type. For example, the
     *         syntax might be incorrect. For details about service control policy syntax, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyTypeNotAvailableForOrganizationException
     *         You can't use the specified policy type with the feature set currently enabled for this organization. For
     *         example, you can enable SCPs only after you enable all features in the organization. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#enable_policies_on_root"
     *         >Managing AWS Organizations Policies</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Declines a handshake request. This sets the handshake state to <code>DECLINED</code> and effectively deactivates
     * the request.
     * </p>
     * <p>
     * This operation can be called only from the account that received the handshake. The originator of the handshake
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can reinitiate
     * the process with a new handshake request.
     * </p>
     * <p>
     * After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
     * 
     * @param declineHandshakeRequest
     * @return Result of the DeclineHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeclineHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeclineHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineHandshakeResult declineHandshake(DeclineHandshakeRequest declineHandshakeRequest);

    /**
     * <p>
     * Deletes the organization. You can delete an organization only by using credentials from the management account.
     * The organization must be empty of member accounts.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @return Result of the DeleteOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws OrganizationNotEmptyException
     *         The organization isn't empty. To delete an organization, you must first remove all accounts except the
     *         management account, delete all OUs, and delete all policies.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOrganizationResult deleteOrganization(DeleteOrganizationRequest deleteOrganizationRequest);

    /**
     * <p>
     * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs
     * from the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param deleteOrganizationalUnitRequest
     * @return Result of the DeleteOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotEmptyException
     *         The specified OU is not empty. Move all accounts to another root or to other OUs, remove all child OUs,
     *         and try the operation again.
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeleteOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOrganizationalUnitResult deleteOrganizationalUnit(DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest);

    /**
     * <p>
     * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the
     * policy from all organizational units (OUs), roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyInUseException
     *         The policy is attached to one or more entities. You must detach it from all roots, OUs, and accounts
     *         before performing this operation.
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Removes the specified member AWS account as a delegated administrator for the specified AWS service.
     * </p>
     * <important>
     * <p>
     * Deregistering a delegated administrator can have unintended impacts on the functionality of the enabled AWS
     * service. See the documentation for the enabled service before you deregister a delegated administrator so that
     * you understand any potential impacts.
     * </p>
     * </important>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param deregisterDelegatedAdministratorRequest
     * @return Result of the DeregisterDelegatedAdministrator operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AccountNotRegisteredException
     *         The specified account is not a delegated administrator for this AWS service.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DeregisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeregisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterDelegatedAdministratorResult deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest deregisterDelegatedAdministratorRequest);

    /**
     * <p>
     * Retrieves AWS Organizations-related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeAccountRequest
     * @return Result of the DescribeAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeAccount" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAccountResult describeAccount(DescribeAccountRequest describeAccountRequest);

    /**
     * <p>
     * Retrieves the current status of an asynchronous request to create an account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeCreateAccountStatusRequest
     * @return Result of the DescribeCreateAccountStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws CreateAccountStatusNotFoundException
     *         We can't find an create account request with the <code>CreateAccountRequestId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DescribeCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCreateAccountStatusResult describeCreateAccountStatus(DescribeCreateAccountStatusRequest describeCreateAccountStatusRequest);

    /**
     * <p>
     * Returns the contents of the effective policy for specified policy type and account. The effective policy is the
     * aggregation of any policies of the specified type that the account inherits, plus any policy of that type that is
     * directly attached to the account.
     * </p>
     * <p>
     * This operation applies only to policy types <i>other</i> than service control policies (SCPs).
     * </p>
     * <p>
     * For more information about policy inheritance, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html">How Policy
     * Inheritance Works</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeEffectivePolicyRequest
     * @return Result of the DescribeEffectivePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws EffectivePolicyNotFoundException
     *         If you ran this action on the management account, this policy type is not enabled. If you ran the action
     *         on a member account, the account doesn't have an effective policy of this type. Contact the administrator
     *         of your organization about attaching a policy of this type to the account.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:
     *         </p>
     *         <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DescribeEffectivePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeEffectivePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEffectivePolicyResult describeEffectivePolicy(DescribeEffectivePolicyRequest describeEffectivePolicyRequest);

    /**
     * <p>
     * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
     * original <a>InviteAccountToOrganization</a> operation that generated the handshake.
     * </p>
     * <p>
     * You can access handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> for
     * only 30 days after they change to that state. They're then deleted and no longer accessible.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeHandshakeRequest
     * @return Result of the DescribeHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeHandshake"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHandshakeResult describeHandshake(DescribeHandshakeRequest describeHandshakeRequest);

    /**
     * <p>
     * Retrieves information about the organization that the user's account belongs to.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can disable it separately at the root level
     * with <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the status of policy types for a specified root.
     * </p>
     * </note>
     * 
     * @param describeOrganizationRequest
     * @return Result of the DescribeOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationResult describeOrganization(DescribeOrganizationRequest describeOrganizationRequest);

    /**
     * <p>
     * Retrieves information about an organizational unit (OU).
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeOrganizationalUnitRequest
     * @return Result of the DescribeOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationalUnitResult describeOrganizationalUnit(DescribeOrganizationalUnitRequest describeOrganizationalUnitRequest);

    /**
     * <p>
     * Retrieves information about a policy.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describePolicyRequest
     * @return Result of the DescribePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DescribePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePolicyResult describePolicy(DescribePolicyRequest describePolicyRequest);

    /**
     * <p>
     * Detaches a policy from a target root, organizational unit (OU), or account.
     * </p>
     * <important>
     * <p>
     * If the policy being detached is a service control policy (SCP), the changes to permissions for AWS Identity and
     * Access Management (IAM) users and roles in affected accounts are immediate.
     * </p>
     * </important>
     * <p>
     * Every root, OU, and account must have at least one SCP attached. If you want to replace the default
     * <code>FullAWSAccess</code> policy with an SCP that limits the permissions that can be delegated, you must attach
     * the replacement SCP before you can remove the default SCP. This is the authorization strategy of an
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies.html#orgs_policies_allowlist
     * ">allow list</a>". If you instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP), you're using
     * the authorization strategy of a
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies
     * .html#orgs_policies_denylist">deny list</a>".
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyNotAttachedException
     *         The policy isn't attached to the specified target in the specified root.
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DetachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DetachPolicyResult detachPolicy(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Disables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you disable integration, the specified service no longer can create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * <i>new</i> accounts in your organization. This means the service can't perform operations on your behalf on any
     * new accounts in your organization. The service can still perform operations in older accounts until the service
     * completes its clean-up from AWS Organizations.
     * </p>
     * <important>
     * <p>
     * We <b> <i>strongly recommend</i> </b> that you don't use this command to disable integration between AWS
     * Organizations and the specified AWS service. Instead, use the console or commands that are provided by the
     * specified service. This lets the trusted service perform any required initialization when enabling trusted
     * access, such as creating any required resources and any required clean up of resources when disabling trusted
     * access.
     * </p>
     * <p>
     * For information about how to disable trusted service access to your organization using the trusted service, see
     * the <b>Learn more</b> link under the <b>Supports Trusted Access</b> column at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS services
     * that you can use with AWS Organizations</a>. on this page.
     * </p>
     * <p>
     * If you disable access by using this command, it causes the following actions to occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The service can no longer create a service-linked role in the accounts in your organization. This means that the
     * service can't perform operations on your behalf on any new accounts in your organization. The service can still
     * perform operations in older accounts until the service completes its clean-up from AWS Organizations.
     * </p>
     * </li>
     * <li>
     * <p>
     * The service can no longer perform tasks in the member accounts in the organization, unless those operations are
     * explicitly permitted by the IAM policies that are attached to your roles. This includes any data aggregation from
     * the member accounts to the management account, or to a delegated administrator account, where relevant.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some services detect this and clean up any remaining data or resources related to the integration, while other
     * services stop accessing the organization but leave any historical data and configuration in place to support a
     * possible re-enabling of the integration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using the other service's console or commands to disable the integration ensures that the other service is aware
     * that it can clean up any resources that are required only for the integration. How the service cleans up its
     * resources in the organization's accounts depends on that service. For more information, see the documentation for
     * the other AWS service.
     * </p>
     * </important>
     * <p>
     * After you perform the <code>DisableAWSServiceAccess</code> operation, the specified service can no longer perform
     * operations in your organization's accounts
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param disableAWSServiceAccessRequest
     * @return Result of the DisableAWSServiceAccess operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.DisableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    DisableAWSServiceAccessResult disableAWSServiceAccess(DisableAWSServiceAccessRequest disableAWSServiceAccessRequest);

    /**
     * <p>
     * Disables an organizational policy type in a root. A policy of a certain type can be attached to entities in a
     * root only if that type is enabled in the root. After you perform this operation, you no longer can attach
     * policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can
     * undo this by using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. If you disable a policy type for a root, it
     * still appears enabled for the organization if <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features</a> are enabled for the organization. AWS recommends that you first use <a>ListRoots</a> to see the
     * status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * To view the status of available policy types in the organization, use <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param disablePolicyTypeRequest
     * @return Result of the DisablePolicyType operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyTypeNotEnabledException
     *         The specified policy type isn't currently enabled in this root. You can't attach policies of the
     *         specified type to entities in a root until you enable that type in the root. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * @throws RootNotFoundException
     *         We can't find a root with the <code>RootId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.DisablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisablePolicyType"
     *      target="_top">AWS API Documentation</a>
     */
    DisablePolicyTypeResult disablePolicyType(DisablePolicyTypeRequest disablePolicyTypeRequest);

    /**
     * <p>
     * Enables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you enable integration, you allow the specified service to create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * all the accounts in your organization. This allows the service to perform operations on your behalf in your
     * organization and its accounts.
     * </p>
     * <important>
     * <p>
     * We recommend that you enable integration between AWS Organizations and the specified AWS service by using the
     * console or commands that are provided by the specified service. Doing so ensures that the service is aware that
     * it can create the resources that are required for the integration. How the service creates those resources in the
     * organization's accounts depends on that service. For more information, see the documentation for the other AWS
     * service.
     * </p>
     * </important>
     * <p>
     * For more information about enabling services to integrate with AWS Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account and only if the organization has <a
     * href
     * ="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">enabled
     * all features</a>.
     * </p>
     * 
     * @param enableAWSServiceAccessRequest
     * @return Result of the EnableAWSServiceAccess operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.EnableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    EnableAWSServiceAccessResult enableAWSServiceAccess(EnableAWSServiceAccessRequest enableAWSServiceAccessRequest);

    /**
     * <p>
     * Enables all features in an organization. This enables the use of organization policies that can restrict the
     * services and actions that can be called in each account. Until you enable all features, you have access only to
     * consolidated billing, and you can't use any of the advanced account administration features that AWS
     * Organizations supports. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly with only the consolidated billing
     * features enabled. Calling this operation sends a handshake to every invited account in the organization. The
     * feature set change can be finalized and the additional features enabled only after all administrators in the
     * invited accounts approve the change by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After you enable all features, you can separately enable or disable individual policy types in a root using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. To see the status of policy types in a root, use
     * <a>ListRoots</a>.
     * </p>
     * <p>
     * After all invited member accounts accept the handshake, you finalize the feature set change by accepting the
     * handshake that contains <code>"Action": "ENABLE_ALL_FEATURES"</code>. This completes the change.
     * </p>
     * <p>
     * After you enable all features in your organization, the management account in the organization can apply policies
     * on all member accounts. These policies can restrict what users and even administrators in those accounts can do.
     * The management account can apply policies that prevent accounts from leaving the organization. Ensure that your
     * account administrators are aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param enableAllFeaturesRequest
     * @return Result of the EnableAllFeatures operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_IS_ALREADY_PENDING_ALL_FEATURES_MIGRATION: The handshake request is invalid because the
     *         organization has already started the process to enable all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.EnableAllFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAllFeatures"
     *      target="_top">AWS API Documentation</a>
     */
    EnableAllFeaturesResult enableAllFeatures(EnableAllFeaturesRequest enableAllFeaturesRequest);

    /**
     * <p>
     * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
     * to the root, any organizational unit (OU), or account in that root. You can undo this by using the
     * <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. AWS recommends that you first use
     * <a>ListRoots</a> to see the status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * You can enable a policy type in a root only if that policy type is available in the organization. To view the
     * status of available policy types in the organization, use <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param enablePolicyTypeRequest
     * @return Result of the EnablePolicyType operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyTypeAlreadyEnabledException
     *         The specified policy type is already enabled in the specified root.
     * @throws RootNotFoundException
     *         We can't find a root with the <code>RootId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyTypeNotAvailableForOrganizationException
     *         You can't use the specified policy type with the feature set currently enabled for this organization. For
     *         example, you can enable SCPs only after you enable all features in the organization. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#enable_policies_on_root"
     *         >Managing AWS Organizations Policies</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.EnablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS
     *      API Documentation</a>
     */
    EnablePolicyTypeResult enablePolicyType(EnablePolicyTypeRequest enablePolicyTypeRequest);

    /**
     * <p>
     * Sends an invitation to another account to join your organization as a member account. AWS Organizations sends
     * email on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can invite AWS accounts only from the same seller as the management account. For example, if your
     * organization's management account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in
     * India, you can invite only other AISPL accounts to your organization. You can't combine accounts from AISPL and
     * AWS or from any other AWS seller. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
     * >Consolidated Billing in India</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you receive an exception that indicates that you exceeded your account limits for the organization or that the
     * operation failed because your organization is still initializing, wait one hour and then try again. If the error
     * persists after an hour, contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param inviteAccountToOrganizationRequest
     * @return Result of the InviteAccountToOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws AccountOwnerNotVerifiedException
     *         You can't invite an existing account to your organization until you verify that you own the email address
     *         associated with the management account. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_create.html#about-email-verification"
     *         >Email Address Verification</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_IS_ALREADY_PENDING_ALL_FEATURES_MIGRATION: The handshake request is invalid because the
     *         organization has already started the process to enable all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws DuplicateHandshakeException
     *         A handshake with the same action and target already exists. For example, if you invited an account to
     *         join your organization, the invited account might already have a pending invitation from this
     *         organization. If you intend to resend an invitation to an account, ensure that existing handshakes that
     *         might be considered duplicates are canceled or declined.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.InviteAccountToOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/InviteAccountToOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    InviteAccountToOrganizationResult inviteAccountToOrganization(InviteAccountToOrganizationRequest inviteAccountToOrganizationRequest);

    /**
     * <p>
     * Removes a member account from its parent organization. This version of the operation is performed by the account
     * that wants to leave. To remove a member account as a user in the management account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * The management account in an organization with all features enabled can set service control policies (SCPs) that
     * can restrict what administrators of member accounts can do. This includes preventing them from successfully
     * calling <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization as a member account only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For each account that you want to make standalone, you must perform the following steps. If any of the
     * steps are already completed for this account, that step doesn't appear.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a support plan
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide and verify the required contact information
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide a current payment method
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account
     * isn't attached to an organization. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization only after you enable IAM user access to billing in your account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newly created account has a waiting period before it can be removed from its organization. If you get an error
     * that indicates that a wait period is required, then try again in a few days.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param leaveOrganizationRequest
     * @return Result of the LeaveOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws MasterCannotLeaveOrganizationException
     *         You can't remove a management account from an organization. If you want the management account to become
     *         a member account in another organization, you must first delete the current organization of the
     *         management account.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.LeaveOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/LeaveOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    LeaveOrganizationResult leaveOrganization(LeaveOrganizationRequest leaveOrganizationRequest);

    /**
     * <p>
     * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this
     * list creates the resources that it requires for the integration, it can perform operations on your organization
     * and its accounts.
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * currently work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listAWSServiceAccessForOrganizationRequest
     * @return Result of the ListAWSServiceAccessForOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListAWSServiceAccessForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAWSServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    ListAWSServiceAccessForOrganizationResult listAWSServiceAccessForOrganization(
            ListAWSServiceAccessForOrganizationRequest listAWSServiceAccessForOrganizationRequest);

    /**
     * <p>
     * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational
     * unit (OU), use the <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listAccountsRequest
     * @return Result of the ListAccounts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Lists the accounts in an organization that are contained by the specified target root or organizational unit
     * (OU). If you specify the root, you get a list of all the accounts that aren't in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU and not in any child OUs. To get a list of all accounts in the
     * organization, use the <a>ListAccounts</a> operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listAccountsForParentRequest
     * @return Result of the ListAccountsForParent operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListAccountsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccountsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountsForParentResult listAccountsForParent(ListAccountsForParentRequest listAccountsForParentRequest);

    /**
     * <p>
     * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root.
     * This operation, along with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listChildrenRequest
     * @return Result of the ListChildren operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListChildren" target="_top">AWS API
     *      Documentation</a>
     */
    ListChildrenResult listChildren(ListChildrenRequest listChildrenRequest);

    /**
     * <p>
     * Lists the account creation requests that match the specified status that is currently being tracked for the
     * organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listCreateAccountStatusRequest
     * @return Result of the ListCreateAccountStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListCreateAccountStatusResult listCreateAccountStatus(ListCreateAccountStatusRequest listCreateAccountStatusRequest);

    /**
     * <p>
     * Lists the AWS accounts that are designated as delegated administrators in this organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedAdministratorsRequest
     * @return Result of the ListDelegatedAdministrators operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListDelegatedAdministrators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedAdministrators"
     *      target="_top">AWS API Documentation</a>
     */
    ListDelegatedAdministratorsResult listDelegatedAdministrators(ListDelegatedAdministratorsRequest listDelegatedAdministratorsRequest);

    /**
     * <p>
     * List the AWS services for which the specified account is a delegated administrator.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedServicesForAccountRequest
     * @return Result of the ListDelegatedServicesForAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AccountNotRegisteredException
     *         The specified account is not a delegated administrator for this AWS service.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListDelegatedServicesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedServicesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    ListDelegatedServicesForAccountResult listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest listDelegatedServicesForAccountRequest);

    /**
     * <p>
     * Lists the current handshakes that are associated with the account of the requesting user.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param listHandshakesForAccountRequest
     * @return Result of the ListHandshakesForAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListHandshakesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    ListHandshakesForAccountResult listHandshakesForAccount(ListHandshakesForAccountRequest listHandshakesForAccountRequest);

    /**
     * <p>
     * Lists the handshakes that are associated with the organization that the requesting user is part of. The
     * <code>ListHandshakesForOrganization</code> operation returns a list of handshake structures. Each structure
     * contains details and status about a handshake.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listHandshakesForOrganizationRequest
     * @return Result of the ListHandshakesForOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListHandshakesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    ListHandshakesForOrganizationResult listHandshakesForOrganization(ListHandshakesForOrganizationRequest listHandshakesForOrganizationRequest);

    /**
     * <p>
     * Lists the organizational units (OUs) in a parent organizational unit or root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listOrganizationalUnitsForParentRequest
     * @return Result of the ListOrganizationalUnitsForParent operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListOrganizationalUnitsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListOrganizationalUnitsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationalUnitsForParentResult listOrganizationalUnitsForParent(ListOrganizationalUnitsForParentRequest listOrganizationalUnitsForParentRequest);

    /**
     * <p>
     * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or
     * account. This operation, along with <a>ListChildren</a> enables you to traverse the tree structure that makes up
     * this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * In the current release, a child can have only a single parent.
     * </p>
     * </note>
     * 
     * @param listParentsRequest
     * @return Result of the ListParents operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ChildNotFoundException
     *         We can't find an organizational unit (OU) or AWS account with the <code>ChildId</code> that you
     *         specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListParents" target="_top">AWS API
     *      Documentation</a>
     */
    ListParentsResult listParents(ListParentsRequest listParentsRequest);

    /**
     * <p>
     * Retrieves the list of all policies in an organization of a specified type.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.
     * You must specify the policy type that you want included in the returned list.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listPoliciesForTargetRequest
     * @return Result of the ListPoliciesForTarget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListPoliciesForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPoliciesForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    ListPoliciesForTargetResult listPoliciesForTarget(ListPoliciesForTargetRequest listPoliciesForTargetRequest);

    /**
     * <p>
     * Lists the roots that are defined in the current organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * Policy types can be enabled and disabled in roots. This is distinct from whether they're available in the
     * organization. When you enable all features, you make policy types available for use in that organization.
     * Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in
     * an organization, use <a>DescribeOrganization</a>.
     * </p>
     * </note>
     * 
     * @param listRootsRequest
     * @return Result of the ListRoots operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListRoots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListRoots" target="_top">AWS API
     *      Documentation</a>
     */
    ListRootsResult listRoots(ListRootsRequest listRootsRequest);

    /**
     * <p>
     * Lists tags that are attached to the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all the roots, organizational units (OUs), and accounts that the specified policy is attached to.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return Result of the ListTargetsForPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.ListTargetsForPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTargetsForPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    ListTargetsForPolicyResult listTargetsForPolicy(ListTargetsForPolicyRequest listTargetsForPolicyRequest);

    /**
     * <p>
     * Moves an account from its current source parent root or organizational unit (OU) to the specified destination
     * parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param moveAccountRequest
     * @return Result of the MoveAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws SourceParentNotFoundException
     *         We can't find a source root or OU with the <code>ParentId</code> that you specified.
     * @throws DestinationParentNotFoundException
     *         We can't find the destination container (a root or OU) with the <code>ParentId</code> that you specified.
     * @throws DuplicateAccountException
     *         That account is already present in the specified destination.
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @sample AWSOrganizations.MoveAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/MoveAccount" target="_top">AWS API
     *      Documentation</a>
     */
    MoveAccountResult moveAccount(MoveAccountRequest moveAccountRequest);

    /**
     * <p>
     * Enables the specified member account to administer the Organizations features of the specified AWS service. It
     * grants read-only access to AWS Organizations service data. The account still requires IAM permissions to access
     * and administer the AWS service.
     * </p>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param registerDelegatedAdministratorRequest
     * @return Result of the RegisterDelegatedAdministrator operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountAlreadyRegisteredException
     *         The specified account is already a delegated administrator for this AWS service.
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @sample AWSOrganizations.RegisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RegisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterDelegatedAdministratorResult registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest registerDelegatedAdministratorRequest);

    /**
     * <p>
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a standalone account that isn't a member of any organization. It's no longer subject
     * to any policies and is responsible for its own bill payments. The organization's management account is no longer
     * charged for any expenses accrued by the member account after it's removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account. Member accounts can remove
     * themselves with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can remove an account from your organization only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For an account that you want to make standalone, you must choose a support plan, provide and verify
     * the required contact information, and provide a current payment method. AWS uses the payment method to charge for
     * any billable (not free tier) AWS activity that occurs while the account isn't attached to an organization. To
     * remove an account that doesn't yet have this information, you must sign in as the member account and follow the
     * steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param removeAccountFromOrganizationRequest
     * @return Result of the RemoveAccountFromOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified, or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws MasterCannotLeaveOrganizationException
     *         You can't remove a management account from an organization. If you want the management account to become
     *         a member account in another organization, you must first delete the current organization of the
     *         management account.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.RemoveAccountFromOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RemoveAccountFromOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveAccountFromOrganizationResult removeAccountFromOrganization(RemoveAccountFromOrganizationRequest removeAccountFromOrganizationRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <p>
     * Currently, you can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes any tags with the specified keys from the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, account, or policy with the <code>TargetId</code> that you specified.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Renames the specified organizational unit (OU). The ID and ARN don't change. The child OUs and accounts remain in
     * place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param updateOrganizationalUnitRequest
     * @return Result of the UpdateOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws DuplicateOrganizationalUnitException
     *         An OU with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.UpdateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationalUnitResult updateOrganizationalUnit(UpdateOrganizationalUnitRequest updateOrganizationalUnitRequest);

    /**
     * <p>
     * Updates an existing policy with a new name, description, or content. If you don't supply any parameter, that
     * value remains unchanged. You can't change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param updatePolicyRequest
     * @return Result of the UpdatePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. For example, attempting to remove
     *         the last service control policy (SCP) from an OU or root, inviting or creating too many accounts to the
     *         organization, or attaching too many policies to an account, OU, or root. This exception includes a reason
     *         that contains additional information about the violated limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_ORGANIZATION: You attempted to remove the management account from the organization.
     *         You can't remove the management account. Instead, after you remove all member accounts, delete the
     *         organization itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a>in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
     *         >Removing a member account from your organization</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get this exception when running a command immediately after creating the organization, wait one
     *         hour and try again. After an hour, if the command continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register the management account of
     *         the organization as a delegated administrator for an AWS service integrated with Organizations. You can
     *         designate only a member account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an account that is registered as
     *         a delegated administrator for a service integrated with your organization. To complete this operation,
     *         you must first deregister this account as a delegated administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an organization in the specified
     *         region, you must enable all features mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an AWS account as a delegated
     *         administrator for an AWS service that already has a delegated administrator. To complete this operation,
     *         you must first deregister any existing delegated administrators for this service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid for a limited period of time.
     *         You must resubmit the request and generate a new verfication code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's management account to the marketplace that corresponds to the management
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in China. To create an
     *         organization, the master must have a valid business license. For more information, contact customer
     *         support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide a valid contact
     *         address and phone number for the management account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the management account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this management account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to register more delegated
     *         administrators than allowed for the service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would
     *         cause the entity to have fewer than the minimum number of policies of a certain type required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is larger than the maximum size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags that are not compliant with
     *         the tag policy requirements for this account.
     *         </p>
     *         </li>
     * @throws DuplicatePolicyException
     *         A policy with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE_TAG_KEY: Tag keys must be unique among the tags attached to the same entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL_ADDRESS_TARGET: You specified an invalid email address for the invited account owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TARGET_NOT_SUPPORTED: You can't perform the specified operation on that target entity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNRECOGNIZED_SERVICE_PRINCIPAL: You specified a service principal that isn't recognized.
     *         </p>
     *         </li>
     * @throws MalformedPolicyDocumentException
     *         The provided policy document doesn't meet the requirements of the specified policy type. For example, the
     *         syntax might be incorrect. For details about service control policy syntax, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The quota helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information about quotas that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Quotas for
     *         AWS Organizations</a>in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current AWS Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePolicyResult updatePolicy(UpdatePolicyRequest updatePolicyRequest);

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
