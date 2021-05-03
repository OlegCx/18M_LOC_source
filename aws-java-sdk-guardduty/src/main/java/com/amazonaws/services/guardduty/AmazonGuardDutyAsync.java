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

import com.amazonaws.services.guardduty.model.*;

/**
 * Interface for accessing Amazon GuardDuty asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.guardduty.AbstractAmazonGuardDutyAsync} instead.
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
public interface AmazonGuardDutyAsync extends AmazonGuardDuty {

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ArchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest archiveFindingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ArchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest archiveFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ArchiveFindingsRequest, ArchiveFindingsResult> asyncHandler);

    /**
     * <p>
     * Creates a single Amazon GuardDuty detector. A detector is a resource that represents the GuardDuty service. To
     * start using GuardDuty, you must create a detector in each Region where you enable the service. You can have only
     * one detector per account per Region. All data sources are enabled in a new detector by default.
     * </p>
     * 
     * @param createDetectorRequest
     * @return A Java Future containing the result of the CreateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest createDetectorRequest);

    /**
     * <p>
     * Creates a single Amazon GuardDuty detector. A detector is a resource that represents the GuardDuty service. To
     * start using GuardDuty, you must create a detector in each Region where you enable the service. You can have only
     * one detector per account per Region. All data sources are enabled in a new detector by default.
     * </p>
     * 
     * @param createDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest createDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorRequest, CreateDetectorResult> asyncHandler);

    /**
     * <p>
     * Creates a filter using the specified finding criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a filter using the specified finding criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler);

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with AWS infrastructure and applications. GuardDuty doesn't
     * generate findings for IP addresses that are included in IPSets. Only users from the administrator account can use
     * this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with AWS infrastructure and applications. GuardDuty doesn't
     * generate findings for IP addresses that are included in IPSets. Only users from the administrator account can use
     * this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @return A Java Future containing the result of the CreatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublishingDestinationResult> createPublishingDestinationAsync(
            CreatePublishingDestinationRequest createPublishingDestinationRequest);

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublishingDestinationResult> createPublishingDestinationAsync(
            CreatePublishingDestinationRequest createPublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublishingDestinationRequest, CreatePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates example findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates example findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler);

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @return A Java Future containing the result of the CreateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest createThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThreatIntelSetRequest, CreateThreatIntelSetResult> asyncHandler);

    /**
     * <p>
     * Declines invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler);

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler);

    /**
     * <p>
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @return A Java Future containing the result of the DeletePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublishingDestinationResult> deletePublishingDestinationAsync(
            DeletePublishingDestinationRequest deletePublishingDestinationRequest);

    /**
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublishingDestinationResult> deletePublishingDestinationAsync(
            DeletePublishingDestinationRequest deletePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePublishingDestinationRequest, DeletePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @return A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThreatIntelSetRequest, DeleteThreatIntelSetResult> asyncHandler);

    /**
     * <p>
     * Returns information about the account selected as the delegated administrator for GuardDuty.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the account selected as the delegated administrator for GuardDuty.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @return A Java Future containing the result of the DescribePublishingDestination operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePublishingDestinationResult> describePublishingDestinationAsync(
            DescribePublishingDestinationRequest describePublishingDestinationRequest);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePublishingDestination operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePublishingDestinationResult> describePublishingDestinationAsync(
            DescribePublishingDestinationRequest describePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePublishingDestinationRequest, DescribePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Disables an AWS account within the Organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disables an AWS account within the Organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its administrator account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its administrator account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Disassociates GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler);

    /**
     * <p>
     * Enables an AWS account within the organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Enables an AWS account within the organization as the GuardDuty delegated administrator.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param getDetectorRequest
     * @return A Java Future containing the result of the GetDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest getDetectorRequest);

    /**
     * <p>
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param getDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest getDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<GetDetectorRequest, GetDetectorResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @return A Java Future containing the result of the GetFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest getFilterRequest);

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest getFilterRequest,
            com.amazonaws.handlers.AsyncHandler<GetFilterRequest, GetFilterResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon GuardDuty findings statistics for the specified detector ID.
     * </p>
     * 
     * @param getFindingsStatisticsRequest
     * @return A Java Future containing the result of the GetFindingsStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty findings statistics for the specified detector ID.
     * </p>
     * 
     * @param getFindingsStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest getFindingsStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsStatisticsRequest, GetFindingsStatisticsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler);

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Describes which data sources are enabled for the member account's detector.
     * </p>
     * 
     * @param getMemberDetectorsRequest
     * @return A Java Future containing the result of the GetMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberDetectorsResult> getMemberDetectorsAsync(GetMemberDetectorsRequest getMemberDetectorsRequest);

    /**
     * <p>
     * Describes which data sources are enabled for the member account's detector.
     * </p>
     * 
     * @param getMemberDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberDetectorsResult> getMemberDetectorsAsync(GetMemberDetectorsRequest getMemberDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMemberDetectorsRequest, GetMemberDetectorsResult> asyncHandler);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @return A Java Future containing the result of the GetThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest getThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetThreatIntelSetRequest, GetThreatIntelSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageStatisticsRequest, GetUsageStatisticsResult> asyncHandler);

    /**
     * <p>
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty,
     * and allow the current AWS account to view and manage these accounts' findings on their behalf as the GuardDuty
     * administrator account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty,
     * and allow the current AWS account to view and manage these accounts' findings on their behalf as the GuardDuty
     * administrator account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * </p>
     * 
     * @param listFindingsRequest
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * </p>
     * 
     * @param listFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler);

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Lists the accounts configured as GuardDuty delegated administrators.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Lists the accounts configured as GuardDuty delegated administrators.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>dectectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @return A Java Future containing the result of the ListPublishingDestinations operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishingDestinationsResult> listPublishingDestinationsAsync(
            ListPublishingDestinationsRequest listPublishingDestinationsRequest);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>dectectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublishingDestinations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishingDestinationsResult> listPublishingDestinationsAsync(
            ListPublishingDestinationsRequest listPublishingDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublishingDestinationsRequest, ListPublishingDestinationsResult> asyncHandler);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and threat
     * intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
     * given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and threat
     * intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a
     * given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @return A Java Future containing the result of the ListThreatIntelSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThreatIntelSets operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest listThreatIntelSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThreatIntelSetsRequest, ListThreatIntelSetsResult> asyncHandler);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <code>StopMonitoringMembers</code> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @return A Java Future containing the result of the StartMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <code>StopMonitoringMembers</code> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest startMonitoringMembersRequest,
            com.amazonaws.handlers.AsyncHandler<StartMonitoringMembersRequest, StartMonitoringMembersResult> asyncHandler);

    /**
     * <p>
     * Stops GuardDuty monitoring for the specified member accounts. Use the <code>StartMonitoringMembers</code>
     * operation to restart monitoring for those accounts.
     * </p>
     * 
     * @param stopMonitoringMembersRequest
     * @return A Java Future containing the result of the StopMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest stopMonitoringMembersRequest);

    /**
     * <p>
     * Stops GuardDuty monitoring for the specified member accounts. Use the <code>StartMonitoringMembers</code>
     * operation to restart monitoring for those accounts.
     * </p>
     * 
     * @param stopMonitoringMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest stopMonitoringMembersRequest,
            com.amazonaws.handlers.AsyncHandler<StopMonitoringMembersRequest, StopMonitoringMembersResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return A Java Future containing the result of the UnarchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnarchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest unarchiveFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UnarchiveFindingsRequest, UnarchiveFindingsResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param updateDetectorRequest
     * @return A Java Future containing the result of the UpdateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest updateDetectorRequest);

    /**
     * <p>
     * Updates the Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param updateDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest updateDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorRequest, UpdateDetectorResult> asyncHandler);

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler);

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @return A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsFeedbackRequest, UpdateFindingsFeedbackResult> asyncHandler);

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler);

    /**
     * <p>
     * Contains information on member accounts to be updated.
     * </p>
     * 
     * @param updateMemberDetectorsRequest
     * @return A Java Future containing the result of the UpdateMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberDetectorsResult> updateMemberDetectorsAsync(UpdateMemberDetectorsRequest updateMemberDetectorsRequest);

    /**
     * <p>
     * Contains information on member accounts to be updated.
     * </p>
     * 
     * @param updateMemberDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberDetectorsResult> updateMemberDetectorsAsync(UpdateMemberDetectorsRequest updateMemberDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMemberDetectorsRequest, UpdateMemberDetectorsResult> asyncHandler);

    /**
     * <p>
     * Updates the delegated administrator account with the values provided.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the delegated administrator account with the values provided.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @return A Java Future containing the result of the UpdatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublishingDestinationResult> updatePublishingDestinationAsync(
            UpdatePublishingDestinationRequest updatePublishingDestinationRequest);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublishingDestinationResult> updatePublishingDestinationAsync(
            UpdatePublishingDestinationRequest updatePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePublishingDestinationRequest, UpdatePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @return A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest updateThreatIntelSetRequest);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest updateThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThreatIntelSetRequest, UpdateThreatIntelSetResult> asyncHandler);

}
