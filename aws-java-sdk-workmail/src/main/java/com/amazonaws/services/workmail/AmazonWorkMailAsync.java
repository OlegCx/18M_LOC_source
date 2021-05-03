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
package com.amazonaws.services.workmail;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;

/**
 * Interface for accessing Amazon WorkMail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workmail.AbstractAmazonWorkMailAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon WorkMail is a secure, managed business email and calendaring service with support for existing desktop and
 * mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or
 * other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory
 * and control both the keys that encrypt your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate
 * access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the
 * IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy).
 * This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This
 * allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a
 * selective basis using the IAM model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkMailAsync extends AmazonWorkMail {

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return A Java Future containing the result of the AssociateDelegateToResource operation returned by the service.
     * @sample AmazonWorkMailAsync.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest);

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDelegateToResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDelegateToResourceRequest, AssociateDelegateToResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return A Java Future containing the result of the AssociateMemberToGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(AssociateMemberToGroupRequest associateMemberToGroupRequest);

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(AssociateMemberToGroupRequest associateMemberToGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToGroupRequest, AssociateMemberToGroupResult> asyncHandler);

    /**
     * <p>
     * Cancels a mailbox export job.
     * </p>
     * <note>
     * <p>
     * If the mailbox export job is near completion, it might not be possible to cancel it.
     * </p>
     * </note>
     * 
     * @param cancelMailboxExportJobRequest
     * @return A Java Future containing the result of the CancelMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.CancelMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(CancelMailboxExportJobRequest cancelMailboxExportJobRequest);

    /**
     * <p>
     * Cancels a mailbox export job.
     * </p>
     * <note>
     * <p>
     * If the mailbox export job is near completion, it might not be possible to cancel it.
     * </p>
     * </note>
     * 
     * @param cancelMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CancelMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(CancelMailboxExportJobRequest cancelMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMailboxExportJobRequest, CancelMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a group that can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group that can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param createMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the CreateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.CreateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(
            CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Creates a new mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param createMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.CreateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(
            CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMobileDeviceAccessRuleRequest, CreateMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon WorkMail organization. Optionally, you can choose to associate an existing AWS Directory
     * Service directory with your organization. If an AWS Directory Service directory ID is specified, the organization
     * alias must match the directory alias. If you choose not to associate an existing directory with your
     * organization, then we create a new Amazon WorkMail directory for you. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_new_organization.html">Adding an
     * organization</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * You can associate multiple email domains with an organization, then set your default email domain from the Amazon
     * WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For
     * more information, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a
     * domain</a> and <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/default_domain.html">Choosing the
     * default domain</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * Optionally, you can use a customer managed master key from AWS Key Management Service (AWS KMS) to encrypt email
     * for your organization. If you don't associate an AWS KMS key, Amazon WorkMail creates a default AWS managed
     * master key for you.
     * </p>
     * 
     * @param createOrganizationRequest
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest);

    /**
     * <p>
     * Creates a new Amazon WorkMail organization. Optionally, you can choose to associate an existing AWS Directory
     * Service directory with your organization. If an AWS Directory Service directory ID is specified, the organization
     * alias must match the directory alias. If you choose not to associate an existing directory with your
     * organization, then we create a new Amazon WorkMail directory for you. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_new_organization.html">Adding an
     * organization</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * You can associate multiple email domains with an organization, then set your default email domain from the Amazon
     * WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For
     * more information, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a
     * domain</a> and <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/default_domain.html">Choosing the
     * default domain</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * Optionally, you can use a customer managed master key from AWS Key Management Service (AWS KMS) to encrypt email
     * for your organization. If you don't associate an AWS KMS key, Amazon WorkMail creates a default AWS managed
     * master key for you.
     * </p>
     * 
     * @param createOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrganizationRequest, CreateOrganizationResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a new Amazon WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a user who can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user who can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * 
     * @param deleteAccessControlRuleRequest
     * @return A Java Future containing the result of the DeleteAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAccessControlRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(DeleteAccessControlRuleRequest deleteAccessControlRuleRequest);

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * 
     * @param deleteAccessControlRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAccessControlRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(DeleteAccessControlRuleRequest deleteAccessControlRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessControlRuleRequest, DeleteAccessControlRuleResult> asyncHandler);

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a group from Amazon WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group from Amazon WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest);

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMailboxPermissionsRequest, DeleteMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Deletes a mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param deleteMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DeleteMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(
            DeleteMobileDeviceAccessRuleRequest deleteMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Deletes a mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param deleteMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DeleteMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(
            DeleteMobileDeviceAccessRuleRequest deleteMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMobileDeviceAccessRuleRequest, DeleteMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon WorkMail organization and all underlying AWS resources managed by Amazon WorkMail as part of
     * the organization. You can choose whether to delete the associated directory. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/remove_organization.html">Removing an
     * organization</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest);

    /**
     * <p>
     * Deletes an Amazon WorkMail organization and all underlying AWS resources managed by Amazon WorkMail as part of
     * the organization. You can choose whether to delete the associated directory. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/remove_organization.html">Removing an
     * organization</a> in the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationRequest, DeleteOrganizationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
     * be <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
     * be <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsync.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest);

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterFromWorkMailRequest, DeregisterFromWorkMailResult> asyncHandler);

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler);

    /**
     * <p>
     * Describes the current status of a mailbox export job.
     * </p>
     * 
     * @param describeMailboxExportJobRequest
     * @return A Java Future containing the result of the DescribeMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(DescribeMailboxExportJobRequest describeMailboxExportJobRequest);

    /**
     * <p>
     * Describes the current status of a mailbox export job.
     * </p>
     * 
     * @param describeMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(DescribeMailboxExportJobRequest describeMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMailboxExportJobRequest, DescribeMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest);

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationRequest, DescribeOrganizationResult> asyncHandler);

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler);

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest);

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDelegateFromResourceRequest, DisassociateDelegateFromResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest);

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromGroupRequest, DisassociateMemberFromGroupResult> asyncHandler);

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access
     * protocol action, or user ID.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @return A Java Future containing the result of the GetAccessControlEffect operation returned by the service.
     * @sample AmazonWorkMailAsync.GetAccessControlEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(GetAccessControlEffectRequest getAccessControlEffectRequest);

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access
     * protocol action, or user ID.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessControlEffect operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetAccessControlEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(GetAccessControlEffectRequest getAccessControlEffectRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessControlEffectRequest, GetAccessControlEffectResult> asyncHandler);

    /**
     * <p>
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @return A Java Future containing the result of the GetDefaultRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.GetDefaultRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(
            GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest);

    /**
     * <p>
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDefaultRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetDefaultRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(
            GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDefaultRetentionPolicyRequest, GetDefaultRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @return A Java Future containing the result of the GetMailboxDetails operation returned by the service.
     * @sample AmazonWorkMailAsync.GetMailboxDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(GetMailboxDetailsRequest getMailboxDetailsRequest);

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMailboxDetails operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetMailboxDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(GetMailboxDetailsRequest getMailboxDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMailboxDetailsRequest, GetMailboxDetailsResult> asyncHandler);

    /**
     * <p>
     * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use
     * this method to test the effects of the current set of mobile device access rules for the Amazon WorkMail
     * organization for a particular user's attributes.
     * </p>
     * 
     * @param getMobileDeviceAccessEffectRequest
     * @return A Java Future containing the result of the GetMobileDeviceAccessEffect operation returned by the service.
     * @sample AmazonWorkMailAsync.GetMobileDeviceAccessEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(
            GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest);

    /**
     * <p>
     * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use
     * this method to test the effects of the current set of mobile device access rules for the Amazon WorkMail
     * organization for a particular user's attributes.
     * </p>
     * 
     * @param getMobileDeviceAccessEffectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMobileDeviceAccessEffect operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetMobileDeviceAccessEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(
            GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest,
            com.amazonaws.handlers.AsyncHandler<GetMobileDeviceAccessEffectRequest, GetMobileDeviceAccessEffectResult> asyncHandler);

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @return A Java Future containing the result of the ListAccessControlRules operation returned by the service.
     * @sample AmazonWorkMailAsync.ListAccessControlRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAccessControlRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(ListAccessControlRulesRequest listAccessControlRulesRequest);

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessControlRules operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListAccessControlRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAccessControlRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(ListAccessControlRulesRequest listAccessControlRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessControlRulesRequest, ListAccessControlRulesResult> asyncHandler);

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonWorkMailAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return A Java Future containing the result of the ListGroupMembers operation returned by the service.
     * @sample AmazonWorkMailAsync.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(ListGroupMembersRequest listGroupMembersRequest);

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupMembers operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(ListGroupMembersRequest listGroupMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembersRequest, ListGroupMembersResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonWorkMailAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the mailbox export jobs started for the specified organization within the last seven days.
     * </p>
     * 
     * @param listMailboxExportJobsRequest
     * @return A Java Future containing the result of the ListMailboxExportJobs operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMailboxExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(ListMailboxExportJobsRequest listMailboxExportJobsRequest);

    /**
     * <p>
     * Lists the mailbox export jobs started for the specified organization within the last seven days.
     * </p>
     * 
     * @param listMailboxExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMailboxExportJobs operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMailboxExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(ListMailboxExportJobsRequest listMailboxExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMailboxExportJobsRequest, ListMailboxExportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return A Java Future containing the result of the ListMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(ListMailboxPermissionsRequest listMailboxPermissionsRequest);

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(ListMailboxPermissionsRequest listMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMailboxPermissionsRequest, ListMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists the mobile device access rules for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param listMobileDeviceAccessRulesRequest
     * @return A Java Future containing the result of the ListMobileDeviceAccessRules operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMobileDeviceAccessRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(
            ListMobileDeviceAccessRulesRequest listMobileDeviceAccessRulesRequest);

    /**
     * <p>
     * Lists the mobile device access rules for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param listMobileDeviceAccessRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMobileDeviceAccessRules operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMobileDeviceAccessRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(
            ListMobileDeviceAccessRulesRequest listMobileDeviceAccessRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMobileDeviceAccessRulesRequest, ListMobileDeviceAccessRulesResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return A Java Future containing the result of the ListOrganizations operation returned by the service.
     * @sample AmazonWorkMailAsync.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(ListOrganizationsRequest listOrganizationsRequest);

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizations operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(ListOrganizationsRequest listOrganizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationsRequest, ListOrganizationsResult> asyncHandler);

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return A Java Future containing the result of the ListResourceDelegates operation returned by the service.
     * @sample AmazonWorkMailAsync.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(ListResourceDelegatesRequest listResourceDelegatesRequest);

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceDelegates operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(ListResourceDelegatesRequest listResourceDelegatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceDelegatesRequest, ListResourceDelegatesResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AmazonWorkMailAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkMailAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonWorkMailAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule allows or denies access to the
     * organization for the specified IPv4 addresses, access protocol actions, and user IDs. Adding a new rule with the
     * same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @return A Java Future containing the result of the PutAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsync.PutAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutAccessControlRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(PutAccessControlRuleRequest putAccessControlRuleRequest);

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule allows or denies access to the
     * organization for the specified IPv4 addresses, access protocol actions, and user IDs. Adding a new rule with the
     * same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutAccessControlRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(PutAccessControlRuleRequest putAccessControlRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessControlRuleRequest, PutAccessControlRuleResult> asyncHandler);

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return A Java Future containing the result of the PutMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(PutMailboxPermissionsRequest putMailboxPermissionsRequest);

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(PutMailboxPermissionsRequest putMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutMailboxPermissionsRequest, PutMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return A Java Future containing the result of the RegisterToWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsync.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(RegisterToWorkMailRequest registerToWorkMailRequest);

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterToWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(RegisterToWorkMailRequest registerToWorkMailRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterToWorkMailRequest, RegisterToWorkMailResult> asyncHandler);

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return A Java Future containing the result of the ResetPassword operation returned by the service.
     * @sample AmazonWorkMailAsync.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(ResetPasswordRequest resetPasswordRequest);

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetPassword operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(ResetPasswordRequest resetPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ResetPasswordRequest, ResetPasswordResult> asyncHandler);

    /**
     * <p>
     * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to
     * the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/mail-export.html">Exporting mailbox content</a> in
     * the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param startMailboxExportJobRequest
     * @return A Java Future containing the result of the StartMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.StartMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(StartMailboxExportJobRequest startMailboxExportJobRequest);

    /**
     * <p>
     * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to
     * the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/mail-export.html">Exporting mailbox content</a> in
     * the <i>Amazon WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param startMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.StartMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(StartMailboxExportJobRequest startMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMailboxExportJobRequest, StartMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon WorkMail organization resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkMailAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon WorkMail organization resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon WorkMail organization resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkMailAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon WorkMail organization resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @return A Java Future containing the result of the UpdateMailboxQuota operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateMailboxQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(UpdateMailboxQuotaRequest updateMailboxQuotaRequest);

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMailboxQuota operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateMailboxQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(UpdateMailboxQuotaRequest updateMailboxQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMailboxQuotaRequest, UpdateMailboxQuotaResult> asyncHandler);

    /**
     * <p>
     * Updates a mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param updateMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the UpdateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.UpdateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(
            UpdateMobileDeviceAccessRuleRequest updateMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Updates a mobile device access rule for the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param updateMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.UpdateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(
            UpdateMobileDeviceAccessRuleRequest updateMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMobileDeviceAccessRuleRequest, UpdateMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest);

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePrimaryEmailAddressRequest, UpdatePrimaryEmailAddressResult> asyncHandler);

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

}
