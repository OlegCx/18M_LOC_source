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
package com.amazonaws.services.mturk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mturk.model.*;

/**
 * Interface for accessing Amazon MTurk.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mturk.AbstractAmazonMTurk} instead.
 * </p>
 * <p>
 * <fullname>Amazon Mechanical Turk API Reference</fullname>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMTurk {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mturk-requester";

    /**
     * <p>
     * The <code>AcceptQualificationRequest</code> operation approves a Worker's request for a Qualification.
     * </p>
     * <p>
     * Only the owner of the Qualification type can grant a Qualification request for that type.
     * </p>
     * <p>
     * A successful request for the <code>AcceptQualificationRequest</code> operation returns with no errors and an
     * empty body.
     * </p>
     * 
     * @param acceptQualificationRequestRequest
     * @return Result of the AcceptQualificationRequest operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.AcceptQualificationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AcceptQualificationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptQualificationRequestResult acceptQualificationRequest(AcceptQualificationRequestRequest acceptQualificationRequestRequest);

    /**
     * <p>
     * The <code>ApproveAssignment</code> operation approves the results of a completed assignment.
     * </p>
     * <p>
     * Approving an assignment initiates two payments from the Requester's Amazon.com account
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Worker who submitted the results is paid the reward specified in the HIT.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Mechanical Turk fees are debited.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns
     * an exception, and the approval is not processed. You can include an optional feedback message with the approval,
     * which the Worker can see in the Status section of the web site.
     * </p>
     * <p>
     * You can also call this operation for assignments that were previous rejected and approve them by explicitly
     * overriding the previous rejection. This only works on rejected assignments that were submitted within the
     * previous 30 days and only if the assignment's related HIT has not been deleted.
     * </p>
     * 
     * @param approveAssignmentRequest
     * @return Result of the ApproveAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ApproveAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ApproveAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    ApproveAssignmentResult approveAssignment(ApproveAssignmentRequest approveAssignmentRequest);

    /**
     * <p>
     * The <code>AssociateQualificationWithWorker</code> operation gives a Worker a Qualification.
     * <code>AssociateQualificationWithWorker</code> does not require that the Worker submit a Qualification request. It
     * gives the Qualification directly to the Worker.
     * </p>
     * <p>
     * You can only assign a Qualification of a Qualification type that you created (using the
     * <code>CreateQualificationType</code> operation).
     * </p>
     * <note>
     * <p>
     * Note: <code>AssociateQualificationWithWorker</code> does not affect any pending Qualification requests for the
     * Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request
     * made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending
     * Qualification request without affecting the Qualification the Worker already has, reject the request with the
     * <code>RejectQualificationRequest</code> operation.
     * </p>
     * </note>
     * 
     * @param associateQualificationWithWorkerRequest
     * @return Result of the AssociateQualificationWithWorker operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.AssociateQualificationWithWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AssociateQualificationWithWorker"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateQualificationWithWorkerResult associateQualificationWithWorker(AssociateQualificationWithWorkerRequest associateQualificationWithWorkerRequest);

    /**
     * <p>
     * The <code>CreateAdditionalAssignmentsForHIT</code> operation increases the maximum number of assignments of an
     * existing HIT.
     * </p>
     * <p>
     * To extend the maximum number of assignments, specify the number of additional assignments.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add
     * assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10
     * or more assignments will result in an <code>AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease</code>
     * exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created
     * before July 22, 2015 will result in an <code>AWS.MechanicalTurk.HITTooOldForExtension</code> exception.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createAdditionalAssignmentsForHITRequest
     * @return Result of the CreateAdditionalAssignmentsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateAdditionalAssignmentsForHIT
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateAdditionalAssignmentsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAdditionalAssignmentsForHITResult createAdditionalAssignmentsForHIT(CreateAdditionalAssignmentsForHITRequest createAdditionalAssignmentsForHITRequest);

    /**
     * <p>
     * The <code>CreateHIT</code> operation creates a new Human Intelligence Task (HIT). The new HIT is made available
     * for Workers to find and accept on the Amazon Mechanical Turk website.
     * </p>
     * <p>
     * This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its
     * title, reward amount and number of assignments. When you pass these values to <code>CreateHIT</code>, a new HIT
     * is created for you, with a new <code>HITTypeID</code>. The HITTypeID can be used to create additional HITs in the
     * future without needing to specify common parameters such as the title, description and reward amount each time.
     * </p>
     * <p>
     * An alternative way to create HITs is to first generate a HITTypeID using the <code>CreateHITType</code> operation
     * and then call the <code>CreateHITWithHITType</code> operation. This is the recommended best practice for
     * Requesters who are creating large numbers of HITs.
     * </p>
     * <p>
     * CreateHIT also supports several ways to provide question data: by providing a value for the <code>Question</code>
     * parameter that fully specifies the contents of the HIT, or by providing a <code>HitLayoutId</code> and associated
     * <code>HitLayoutParameters</code>.
     * </p>
     * <note>
     * <p>
     * If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see <a
     * href="https://requester.mturk.com/pricing">Amazon Mechanical Turk Pricing</a>.
     * </p>
     * </note>
     * 
     * @param createHITRequest
     * @return Result of the CreateHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHIT" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHITResult createHIT(CreateHITRequest createHITRequest);

    /**
     * <p>
     * The <code>CreateHITType</code> operation creates a new HIT type. This operation allows you to define a standard
     * set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing
     * HIT type, the HIT type ID of the existing type will be returned.
     * </p>
     * 
     * @param createHITTypeRequest
     * @return Result of the CreateHITType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHITType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITType" target="_top">AWS
     *      API Documentation</a>
     */
    CreateHITTypeResult createHITType(CreateHITTypeRequest createHITTypeRequest);

    /**
     * <p>
     * The <code>CreateHITWithHITType</code> operation creates a new Human Intelligence Task (HIT) using an existing
     * HITTypeID generated by the <code>CreateHITType</code> operation.
     * </p>
     * <p>
     * This is an alternative way to create HITs from the <code>CreateHIT</code> operation. This is the recommended best
     * practice for Requesters who are creating large numbers of HITs.
     * </p>
     * <p>
     * CreateHITWithHITType also supports several ways to provide question data: by providing a value for the
     * <code>Question</code> parameter that fully specifies the contents of the HIT, or by providing a
     * <code>HitLayoutId</code> and associated <code>HitLayoutParameters</code>.
     * </p>
     * <note>
     * <p>
     * If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see <a
     * href="https://requester.mturk.com/pricing">Amazon Mechanical Turk Pricing</a>.
     * </p>
     * </note>
     * 
     * @param createHITWithHITTypeRequest
     * @return Result of the CreateHITWithHITType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHITWithHITType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITWithHITType"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHITWithHITTypeResult createHITWithHITType(CreateHITWithHITTypeRequest createHITWithHITTypeRequest);

    /**
     * <p>
     * The <code>CreateQualificationType</code> operation creates a new Qualification type, which is represented by a
     * <code>QualificationType</code> data structure.
     * </p>
     * 
     * @param createQualificationTypeRequest
     * @return Result of the CreateQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    CreateQualificationTypeResult createQualificationType(CreateQualificationTypeRequest createQualificationTypeRequest);

    /**
     * <p>
     * The <code>CreateWorkerBlock</code> operation allows you to prevent a Worker from working on your HITs. For
     * example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
     * </p>
     * 
     * @param createWorkerBlockRequest
     * @return Result of the CreateWorkerBlock operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateWorkerBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateWorkerBlock"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkerBlockResult createWorkerBlock(CreateWorkerBlockRequest createWorkerBlockRequest);

    /**
     * <p>
     * The <code>DeleteHIT</code> operation is used to delete HIT that is no longer needed. Only the Requester who
     * created the HIT can delete it.
     * </p>
     * <p>
     * You can only dispose of HITs that are in the <code>Reviewable</code> state, with all of their submitted
     * assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the
     * <code>Reviewable</code> state (for example, that has not expired, or still has active assignments), or on a HIT
     * that is Reviewable but without all of its submitted assignments already approved or rejected, the service will
     * return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * HITs are automatically disposed of after 120 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Disposed HITs are not returned in results for the ListHITs operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteHITRequest
     * @return Result of the DeleteHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteHIT" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHITResult deleteHIT(DeleteHITRequest deleteHITRequest);

    /**
     * <p>
     * The <code>DeleteQualificationType</code> deletes a Qualification type and deletes any HIT types that are
     * associated with the Qualification type.
     * </p>
     * <p>
     * This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be
     * needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk
     * rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT
     * types.
     * </p>
     * <note>
     * <p>
     * DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before
     * completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the
     * Qualification type is available for reuse with CreateQualificationType.
     * </p>
     * </note>
     * 
     * @param deleteQualificationTypeRequest
     * @return Result of the DeleteQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQualificationTypeResult deleteQualificationType(DeleteQualificationTypeRequest deleteQualificationTypeRequest);

    /**
     * <p>
     * The <code>DeleteWorkerBlock</code> operation allows you to reinstate a blocked Worker to work on your HITs. This
     * operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation.
     * If the Worker ID is missing or invalid, this operation fails and returns the message ???WorkerId is invalid.??? If
     * the specified Worker is not blocked, this operation returns successfully.
     * </p>
     * 
     * @param deleteWorkerBlockRequest
     * @return Result of the DeleteWorkerBlock operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteWorkerBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteWorkerBlock"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkerBlockResult deleteWorkerBlock(DeleteWorkerBlockRequest deleteWorkerBlockRequest);

    /**
     * <p>
     * The <code>DisassociateQualificationFromWorker</code> revokes a previously granted Qualification from a user.
     * </p>
     * <p>
     * You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification
     * can see this message.
     * </p>
     * 
     * @param disassociateQualificationFromWorkerRequest
     * @return Result of the DisassociateQualificationFromWorker operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DisassociateQualificationFromWorker
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DisassociateQualificationFromWorker"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateQualificationFromWorkerResult disassociateQualificationFromWorker(
            DisassociateQualificationFromWorkerRequest disassociateQualificationFromWorkerRequest);

    /**
     * <p>
     * The <code>GetAccountBalance</code> operation retrieves the amount of money in your Amazon Mechanical Turk
     * account.
     * </p>
     * 
     * @param getAccountBalanceRequest
     * @return Result of the GetAccountBalance operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetAccountBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAccountBalance"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccountBalanceResult getAccountBalance(GetAccountBalanceRequest getAccountBalanceRequest);

    /**
     * <p>
     * The <code>GetAssignment</code> operation retrieves the details of the specified Assignment.
     * </p>
     * 
     * @param getAssignmentRequest
     * @return Result of the GetAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAssignment" target="_top">AWS
     *      API Documentation</a>
     */
    GetAssignmentResult getAssignment(GetAssignmentRequest getAssignmentRequest);

    /**
     * <p>
     * The <code>GetFileUploadURL</code> operation generates and returns a temporary URL. You use the temporary URL to
     * retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is
     * generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a
     * temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are
     * deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure
     * will no longer support the <code>FileUploadAnswer</code> element to be used for the QuestionForm data structure.
     * Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3.
     * </p>
     * 
     * @param getFileUploadURLRequest
     * @return Result of the GetFileUploadURL operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetFileUploadURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetFileUploadURL"
     *      target="_top">AWS API Documentation</a>
     */
    GetFileUploadURLResult getFileUploadURL(GetFileUploadURLRequest getFileUploadURLRequest);

    /**
     * <p>
     * The <code>GetHIT</code> operation retrieves the details of the specified HIT.
     * </p>
     * 
     * @param getHITRequest
     * @return Result of the GetHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetHIT" target="_top">AWS API
     *      Documentation</a>
     */
    GetHITResult getHIT(GetHITRequest getHITRequest);

    /**
     * <p>
     * The <code>GetQualificationScore</code> operation returns the value of a Worker's Qualification for a given
     * Qualification type.
     * </p>
     * <p>
     * To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment
     * data returned by the <code>ListAssignmentsForHIT</code> operation.
     * </p>
     * <p>
     * Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
     * </p>
     * 
     * @param getQualificationScoreRequest
     * @return Result of the GetQualificationScore operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetQualificationScore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationScore"
     *      target="_top">AWS API Documentation</a>
     */
    GetQualificationScoreResult getQualificationScore(GetQualificationScoreRequest getQualificationScoreRequest);

    /**
     * <p>
     * The <code>GetQualificationType</code>operation retrieves information about a Qualification type using its ID.
     * </p>
     * 
     * @param getQualificationTypeRequest
     * @return Result of the GetQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    GetQualificationTypeResult getQualificationType(GetQualificationTypeRequest getQualificationTypeRequest);

    /**
     * <p>
     * The <code>ListAssignmentsForHIT</code> operation retrieves completed assignments for a HIT. You can use this
     * operation to retrieve the results for a HIT.
     * </p>
     * <p>
     * You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple
     * assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial
     * results with this operation.
     * </p>
     * <p>
     * Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The
     * ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments
     * that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments
     * that have already been approved and rejected together in one result set.
     * </p>
     * <p>
     * Only the Requester who created the HIT can retrieve the assignments for that HIT.
     * </p>
     * <p>
     * Results are sorted and divided into numbered pages and the operation returns a single page of results. You can
     * use the parameters of the operation to control sorting and pagination.
     * </p>
     * 
     * @param listAssignmentsForHITRequest
     * @return Result of the ListAssignmentsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListAssignmentsForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListAssignmentsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest listAssignmentsForHITRequest);

    /**
     * <p>
     * The <code>ListBonusPayments</code> operation retrieves the amounts of bonuses you have paid to Workers for a
     * given HIT or assignment.
     * </p>
     * 
     * @param listBonusPaymentsRequest
     * @return Result of the ListBonusPayments operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListBonusPayments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListBonusPayments"
     *      target="_top">AWS API Documentation</a>
     */
    ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest listBonusPaymentsRequest);

    /**
     * <p>
     * The <code>ListHITs</code> operation returns all of a Requester's HITs. The operation returns HITs of any status,
     * except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted.
     * </p>
     * 
     * @param listHITsRequest
     * @return Result of the ListHITs operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListHITs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListHITs" target="_top">AWS API
     *      Documentation</a>
     */
    ListHITsResult listHITs(ListHITsRequest listHITsRequest);

    /**
     * <p>
     * The <code>ListHITsForQualificationType</code> operation returns the HITs that use the given Qualification type
     * for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted
     * with the <code>DeleteHIT</code> operation or that have been auto-deleted.
     * </p>
     * 
     * @param listHITsForQualificationTypeRequest
     * @return Result of the ListHITsForQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListHITsForQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListHITsForQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    ListHITsForQualificationTypeResult listHITsForQualificationType(ListHITsForQualificationTypeRequest listHITsForQualificationTypeRequest);

    /**
     * <p>
     * The <code>ListQualificationRequests</code> operation retrieves requests for Qualifications of a particular
     * Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and
     * accepts them using the AcceptQualification operation.
     * </p>
     * 
     * @param listQualificationRequestsRequest
     * @return Result of the ListQualificationRequests operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListQualificationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    ListQualificationRequestsResult listQualificationRequests(ListQualificationRequestsRequest listQualificationRequestsRequest);

    /**
     * <p>
     * The <code>ListQualificationTypes</code> operation returns a list of Qualification types, filtered by an optional
     * search term.
     * </p>
     * 
     * @param listQualificationTypesRequest
     * @return Result of the ListQualificationTypes operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListQualificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    ListQualificationTypesResult listQualificationTypes(ListQualificationTypesRequest listQualificationTypesRequest);

    /**
     * <p>
     * The <code>ListReviewPolicyResultsForHIT</code> operation retrieves the computed results and the actions taken in
     * the course of executing your Review Policies for a given HIT. For information about how to specify Review
     * Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return
     * results for both Assignment-level and HIT-level review results.
     * </p>
     * 
     * @param listReviewPolicyResultsForHITRequest
     * @return Result of the ListReviewPolicyResultsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListReviewPolicyResultsForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewPolicyResultsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    ListReviewPolicyResultsForHITResult listReviewPolicyResultsForHIT(ListReviewPolicyResultsForHITRequest listReviewPolicyResultsForHITRequest);

    /**
     * <p>
     * The <code>ListReviewableHITs</code> operation retrieves the HITs with Status equal to Reviewable or Status equal
     * to Reviewing that belong to the Requester calling the operation.
     * </p>
     * 
     * @param listReviewableHITsRequest
     * @return Result of the ListReviewableHITs operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListReviewableHITs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewableHITs"
     *      target="_top">AWS API Documentation</a>
     */
    ListReviewableHITsResult listReviewableHITs(ListReviewableHITsRequest listReviewableHITsRequest);

    /**
     * <p>
     * The <code>ListWorkersBlocks</code> operation retrieves a list of Workers who are blocked from working on your
     * HITs.
     * </p>
     * 
     * @param listWorkerBlocksRequest
     * @return Result of the ListWorkerBlocks operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListWorkerBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkerBlocks"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkerBlocksResult listWorkerBlocks(ListWorkerBlocksRequest listWorkerBlocksRequest);

    /**
     * <p>
     * The <code>ListWorkersWithQualificationType</code> operation returns all of the Workers that have been associated
     * with a given Qualification type.
     * </p>
     * 
     * @param listWorkersWithQualificationTypeRequest
     * @return Result of the ListWorkersWithQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListWorkersWithQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkersWithQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkersWithQualificationTypeResult listWorkersWithQualificationType(ListWorkersWithQualificationTypeRequest listWorkersWithQualificationTypeRequest);

    /**
     * <p>
     * The <code>NotifyWorkers</code> operation sends an email to one or more Workers that you specify with the Worker
     * ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers
     * operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously
     * approved or rejected work from the Worker.
     * </p>
     * 
     * @param notifyWorkersRequest
     * @return Result of the NotifyWorkers operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.NotifyWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotifyWorkers" target="_top">AWS
     *      API Documentation</a>
     */
    NotifyWorkersResult notifyWorkers(NotifyWorkersRequest notifyWorkersRequest);

    /**
     * <p>
     * The <code>RejectAssignment</code> operation rejects the results of a completed assignment.
     * </p>
     * <p>
     * You can include an optional feedback message with the rejection, which the Worker can see in the Status section
     * of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the
     * assignment was rejected, and can improve the quality of the results the Worker submits in the future.
     * </p>
     * <p>
     * Only the Requester who created the HIT can reject an assignment for the HIT.
     * </p>
     * 
     * @param rejectAssignmentRequest
     * @return Result of the RejectAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.RejectAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    RejectAssignmentResult rejectAssignment(RejectAssignmentRequest rejectAssignmentRequest);

    /**
     * <p>
     * The <code>RejectQualificationRequest</code> operation rejects a user's request for a Qualification.
     * </p>
     * <p>
     * You can provide a text message explaining why the request was rejected. The Worker who made the request can see
     * this message.
     * </p>
     * 
     * @param rejectQualificationRequestRequest
     * @return Result of the RejectQualificationRequest operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.RejectQualificationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectQualificationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    RejectQualificationRequestResult rejectQualificationRequest(RejectQualificationRequestRequest rejectQualificationRequestRequest);

    /**
     * <p>
     * The <code>SendBonus</code> operation issues a payment of money from your account to a Worker. This payment
     * happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus
     * operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must
     * include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment.
     * Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if
     * your account does not have enough funds to pay for both the bonus and the fees.
     * </p>
     * 
     * @param sendBonusRequest
     * @return Result of the SendBonus operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.SendBonus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendBonus" target="_top">AWS API
     *      Documentation</a>
     */
    SendBonusResult sendBonus(SendBonusRequest sendBonusRequest);

    /**
     * <p>
     * The <code>SendTestEventNotification</code> operation causes Amazon Mechanical Turk to send a notification message
     * as if a HIT event occurred, according to the provided notification specification. This allows you to test
     * notifications without setting up notifications for a real HIT type and trying to trigger them using the website.
     * When you call this operation, the service attempts to send the test notification immediately.
     * </p>
     * 
     * @param sendTestEventNotificationRequest
     * @return Result of the SendTestEventNotification operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.SendTestEventNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendTestEventNotification"
     *      target="_top">AWS API Documentation</a>
     */
    SendTestEventNotificationResult sendTestEventNotification(SendTestEventNotificationRequest sendTestEventNotificationRequest);

    /**
     * <p>
     * The <code>UpdateExpirationForHIT</code> operation allows you update the expiration time of a HIT. If you update
     * it to a time in the past, the HIT will be immediately expired.
     * </p>
     * 
     * @param updateExpirationForHITRequest
     * @return Result of the UpdateExpirationForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateExpirationForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateExpirationForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateExpirationForHITResult updateExpirationForHIT(UpdateExpirationForHITRequest updateExpirationForHITRequest);

    /**
     * <p>
     * The <code>UpdateHITReviewStatus</code> operation updates the status of a HIT. If the status is Reviewable, this
     * operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status.
     * </p>
     * 
     * @param updateHITReviewStatusRequest
     * @return Result of the UpdateHITReviewStatus operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateHITReviewStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateHITReviewStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateHITReviewStatusResult updateHITReviewStatus(UpdateHITReviewStatusRequest updateHITReviewStatusRequest);

    /**
     * <p>
     * The <code>UpdateHITTypeOfHIT</code> operation allows you to change the HITType properties of a HIT. This
     * operation disassociates the HIT from its old HITType properties and associates it with the new HITType
     * properties. The HIT takes on the properties of the new HITType in place of the old ones.
     * </p>
     * 
     * @param updateHITTypeOfHITRequest
     * @return Result of the UpdateHITTypeOfHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateHITTypeOfHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateHITTypeOfHIT"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateHITTypeOfHITResult updateHITTypeOfHIT(UpdateHITTypeOfHITRequest updateHITTypeOfHITRequest);

    /**
     * <p>
     * The <code>UpdateNotificationSettings</code> operation creates, updates, disables or re-enables notifications for
     * a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification
     * specification, the operation replaces the old specification with a new one. You can call the
     * UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to
     * modify the notification specification itself by providing updates to the Active status without specifying a new
     * notification specification. To change the Active status of a HIT type's notifications, the HIT type must already
     * have a notification specification, or one must be provided in the same call to
     * <code>UpdateNotificationSettings</code>.
     * </p>
     * 
     * @param updateNotificationSettingsRequest
     * @return Result of the UpdateNotificationSettings operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNotificationSettingsResult updateNotificationSettings(UpdateNotificationSettingsRequest updateNotificationSettingsRequest);

    /**
     * <p>
     * The <code>UpdateQualificationType</code> operation modifies the attributes of an existing Qualification type,
     * which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its
     * attributes.
     * </p>
     * <p>
     * Most attributes of a Qualification type can be changed after the type has been created. However, the Name and
     * Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the
     * delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.
     * </p>
     * <p>
     * You can use this operation to update the test for a Qualification type. The test is updated based on the values
     * specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated
     * test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters.
     * The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.
     * </p>
     * <p>
     * If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a
     * test from a Qualification type that has one. If the type already has a test, you cannot update it to be
     * AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will
     * henceforth have a test.
     * </p>
     * <p>
     * If you want to update the test duration or answer key for an existing test without changing the questions, you
     * must specify a Test parameter with the original questions, along with the updated values.
     * </p>
     * <p>
     * If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such
     * Qualifications must be granted manually.
     * </p>
     * <p>
     * You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
     * </p>
     * 
     * @param updateQualificationTypeRequest
     * @return Result of the UpdateQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQualificationTypeResult updateQualificationType(UpdateQualificationTypeRequest updateQualificationTypeRequest);

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
