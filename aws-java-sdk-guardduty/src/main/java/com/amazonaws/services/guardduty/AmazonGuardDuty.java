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
package com.amazonaws.services.guardduty;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.guardduty.model.*;

/**
 * Interface for accessing Amazon GuardDuty.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.guardduty.AbstractAmazonGuardDuty} instead.
 * </p>
 * <p>
 * <p>
 * Amazon GuardDuty is a continuous security monitoring service that analyzes and processes the following data sources:
 * VPC Flow Logs, AWS CloudTrail event logs, and DNS logs. It uses threat intelligence feeds (such as lists of malicious
 * IPs and domains) and machine learning to identify unexpected, potentially unauthorized, and malicious activity within
 * your AWS environment. This can include issues like escalations of privileges, uses of exposed credentials, or
 * communication with malicious IPs, URLs, or domains. For example, GuardDuty can detect compromised EC2 instances that
 * serve malware or mine bitcoin.
 * </p>
 * <p>
 * GuardDuty also monitors AWS account access behavior for signs of compromise. Some examples of this are unauthorized
 * infrastructure deployments such as EC2 instances deployed in a Region that has never been used, or unusual API calls
 * like a password policy change to reduce password strength.
 * </p>
 * <p>
 * GuardDuty informs you of the status of your AWS environment by producing security findings that you can view in the
 * GuardDuty console or through Amazon CloudWatch events. For more information, see the <i> <a
 * href="https://docs.aws.amazon.com/guardduty/latest/ug/what-is-guardduty.html">Amazon GuardDuty User Guide</a> </i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGuardDuty {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "guardduty";

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Archives GuardDuty findings that are specified by the list of finding IDs.
     * </p>
     * <note>
     * <p>
     * Only the administrator account can archive findings. Member accounts don't have permission to archive findings
     * from their accounts.
     * </p>
     * </note>
     * 
     * @param archiveFindingsRequest
     * @return Result of the ArchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest);

    /**
     * <p>
     * Creates a single Amazon GuardDuty detector. A detector is a resource that represents the GuardDuty service. To
     * start using GuardDuty, you must create a detector in each Region where you enable the service. You can have only
     * one detector per account per Region. All data sources are enabled in a new detector by default.
     * </p>
     * 
     * @param createDetectorRequest
     * @return Result of the CreateDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDetectorResult createDetector(CreateDetectorRequest createDetectorRequest);

    /**
     * <p>
     * Creates a filter using the specified finding criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @return Result of the CreateFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with AWS infrastructure and applications. GuardDuty doesn't
     * generate findings for IP addresses that are included in IPSets. Only users from the administrator account can use
     * this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. This step is a
     * prerequisite for managing the associated member accounts either by invitation or through an organization.
     * </p>
     * <p>
     * When using <code>Create Members</code> as an organizations delegated administrator this action will enable
     * GuardDuty in the added member accounts, with the exception of the organization delegated administrator account,
     * which must enable GuardDuty prior to being added as a member.
     * </p>
     * <p>
     * If you are adding accounts by invitation use this action after GuardDuty has been enabled in potential member
     * accounts and before using <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">
     * <code>Invite Members</code> </a>.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @return Result of the CreatePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublishingDestinationResult createPublishingDestination(CreatePublishingDestinationRequest createPublishingDestinationRequest);

    /**
     * <p>
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates example findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return Result of the CreateSampleFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSampleFindingsResult createSampleFindings(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @return Result of the CreateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateThreatIntelSetResult createThreatIntelSet(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * <p>
     * Declines invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return Result of the DeleteDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @return Result of the DeletePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePublishingDestinationResult deletePublishingDestination(DeletePublishingDestinationRequest deletePublishingDestinationRequest);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @return Result of the DeleteThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteThreatIntelSetResult deleteThreatIntelSet(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * <p>
     * Returns information about the account selected as the delegated administrator for GuardDuty.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @return Result of the DescribePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePublishingDestinationResult describePublishingDestination(DescribePublishingDestinationRequest describePublishingDestinationRequest);

    /**
     * <p>
     * Disables an AWS account within the Organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its administrator account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Enables an AWS account within the organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param getDetectorRequest
     * @return Result of the GetDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    GetDetectorResult getDetector(GetDetectorRequest getDetectorRequest);

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @return Result of the GetFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    GetFilterResult getFilter(GetFilterRequest getFilterRequest);

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty findings statistics for the specified detector ID.
     * </p>
     * 
     * @param getFindingsStatisticsRequest
     * @return Result of the GetFindingsStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsStatisticsResult getFindingsStatistics(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Describes which data sources are enabled for the member account's detector.
     * </p>
     * 
     * @param getMemberDetectorsRequest
     * @return Result of the GetMemberDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    GetMemberDetectorsResult getMemberDetectors(GetMemberDetectorsRequest getMemberDetectorsRequest);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @return Result of the GetThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty usage statistics over the last 30 days for the specified detector ID. For newly enabled
     * detectors or data sources the cost returned will include only the usage so far under 30 days, this may differ
     * from the cost metrics in the console, which projects usage over 30 days to provide a monthly cost estimate. For
     * more information see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/monitoring_costs.html#usage-calculations">Understanding How
     * Usage Costs are Calculated</a>.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return Result of the GetUsageStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    GetUsageStatisticsResult getUsageStatistics(GetUsageStatisticsRequest getUsageStatisticsRequest);

    /**
     * <p>
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty,
     * and allow the current AWS account to view and manage these accounts' findings on their behalf as the GuardDuty
     * administrator account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    ListDetectorsResult listDetectors(ListDetectorsRequest listDetectorsRequest);

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists the accounts configured as GuardDuty delegated administrators.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>dectectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @return Result of the ListPublishingDestinations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest listPublishingDestinationsRequest);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and threat
     * intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
     * given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @return Result of the ListThreatIntelSets operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListThreatIntelSetsResult listThreatIntelSets(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <code>StopMonitoringMembers</code> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @return Result of the StartMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitoringMembersResult startMonitoringMembers(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * <p>
     * Stops GuardDuty monitoring for the specified member accounts. Use the <code>StartMonitoringMembers</code>
     * operation to restart monitoring for those accounts.
     * </p>
     * 
     * @param stopMonitoringMembersRequest
     * @return Result of the StopMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StopMonitoringMembersResult stopMonitoringMembers(StopMonitoringMembersRequest stopMonitoringMembersRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return Result of the UnarchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    UnarchiveFindingsResult unarchiveFindings(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param updateDetectorRequest
     * @return Result of the UpdateDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDetectorResult updateDetector(UpdateDetectorRequest updateDetectorRequest);

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @return Result of the UpdateFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFilterResult updateFilter(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @return Result of the UpdateFindingsFeedback operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFindingsFeedbackResult updateFindingsFeedback(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Contains information on member accounts to be updated.
     * </p>
     * 
     * @param updateMemberDetectorsRequest
     * @return Result of the UpdateMemberDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMemberDetectorsResult updateMemberDetectors(UpdateMemberDetectorsRequest updateMemberDetectorsRequest);

    /**
     * <p>
     * Updates the delegated administrator account with the values provided.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @return Result of the UpdatePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePublishingDestinationResult updatePublishingDestination(UpdatePublishingDestinationRequest updatePublishingDestinationRequest);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @return Result of the UpdateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateThreatIntelSetResult updateThreatIntelSet(UpdateThreatIntelSetRequest updateThreatIntelSetRequest);

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
