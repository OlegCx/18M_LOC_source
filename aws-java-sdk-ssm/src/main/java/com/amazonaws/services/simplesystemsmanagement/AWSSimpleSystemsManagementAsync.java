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
package com.amazonaws.services.simplesystemsmanagement;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing Amazon SSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagementAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate management tasks such as collecting
 * system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and securely
 * manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon Elastic Compute Cloud
 * instance (EC2 instance), or any on-premises server or virtual machine (VM) in your hybrid environment that has been
 * configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Setting up AWS
 * Systems Manager</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on EC2 instances, see the <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>. For information about
 * how to use a Query API, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API requests</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSimpleSystemsManagementAsync extends AWSSimpleSystemsManagement {

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your
     * documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable
     * you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
     * consists of a key and an optional value, both of which you define. For example, you could define a set of tags
     * for your account's managed instances that helps you track each instance's owner and stack level. For example:
     * Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
     * set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
     * on the tags you add. Tags don't have any semantic meaning to and are interpreted strictly as a string of
     * characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your
     * documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable
     * you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
     * consists of a key and an optional value, both of which you define. For example, you could define a set of tags
     * for your account's managed instances that helps you track each instance's owner and stack level. For example:
     * Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
     * set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
     * on the tags you add. Tags don't have any semantic meaning to and are interpreted strictly as a string of
     * characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return A Java Future containing the result of the CancelCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CancelCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CancelCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest,
            com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler);

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have
     * not already starting running. (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return A Java Future containing the result of the CancelMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.CancelMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have
     * not already starting running. (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CancelMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMaintenanceWindowExecutionRequest, CancelMaintenanceWindowExecutionResult> asyncHandler);

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register your on-premises server or virtual machine
     * (VM) with Systems Manager. Registering these machines with Systems Manager makes it possible to manage them using
     * Systems Manager capabilities. You use the activation code and ID when installing SSM Agent on machines in your
     * hybrid environment. For more information about requirements for managing on-premises instances and VMs using
     * Systems Manager, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html">Setting
     * up AWS Systems Manager for hybrid environments</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and EC2 instances that you manage with
     * Systems Manager are all called <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return A Java Future containing the result of the CreateActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateActivation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest createActivationRequest);

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register your on-premises server or virtual machine
     * (VM) with Systems Manager. Registering these machines with Systems Manager makes it possible to manage them using
     * Systems Manager capabilities. You use the activation code and ID when installing SSM Agent on machines in your
     * hybrid environment. For more information about requirements for managing on-premises instances and VMs using
     * Systems Manager, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html">Setting
     * up AWS Systems Manager for hybrid environments</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and EC2 instances that you manage with
     * Systems Manager are all called <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateActivation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest createActivationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler);

    /**
     * <p>
     * A State Manager association defines the state that you want to maintain on your instances. For example, an
     * association can specify that anti-virus software must be installed and running on your instances, or that certain
     * ports must be closed. For static targets, the association specifies a schedule for when the configuration is
     * reapplied. For dynamic targets, such as an AWS Resource Group or an AWS Autoscaling Group, State Manager applies
     * the configuration when new instances are added to the group. The association also specifies actions to take when
     * applying the configuration. For example, an association for anti-virus software might run once a day. If the
     * software is not installed, then State Manager installs it. If the software is installed, but the service is not
     * running, then the association might instruct State Manager to start the service.
     * </p>
     * 
     * @param createAssociationRequest
     * @return A Java Future containing the result of the CreateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * A State Manager association defines the state that you want to maintain on your instances. For example, an
     * association can specify that anti-virus software must be installed and running on your instances, or that certain
     * ports must be closed. For static targets, the association specifies a schedule for when the configuration is
     * reapplied. For dynamic targets, such as an AWS Resource Group or an AWS Autoscaling Group, State Manager applies
     * the configuration when new instances are added to the group. The association also specifies actions to take when
     * applying the configuration. For example, an association for anti-virus software might run once a day. If the
     * software is not installed, then State Manager installs it. If the software is installed, but the service is not
     * running, then the association might instruct State Manager to start the service.
     * </p>
     * 
     * @param createAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler);

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return A Java Future containing the result of the CreateAssociationBatch operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateAssociationBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociationBatch operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateAssociationBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler);

    /**
     * <p>
     * Creates a Systems Manager (SSM) document. An SSM document defines the actions that Systems Manager performs on
     * your managed instances. For more information about SSM documents, including information about supported schemas,
     * features, and syntax, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html">AWS Systems Manager
     * Documents</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @return A Java Future containing the result of the CreateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Creates a Systems Manager (SSM) document. An SSM document defines the actions that Systems Manager performs on
     * your managed instances. For more information about SSM documents, including information about supported schemas,
     * features, and syntax, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html">AWS Systems Manager
     * Documents</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler);

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest createMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new
     * OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return A Java Future containing the result of the CreateOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOpsItemResult> createOpsItemAsync(CreateOpsItemRequest createOpsItemRequest);

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new
     * OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOpsItemResult> createOpsItemAsync(CreateOpsItemRequest createOpsItemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOpsItemRequest, CreateOpsItemResult> asyncHandler);

    /**
     * <p>
     * If you create a new application in Application Manager, Systems Manager calls this API action to specify
     * information about the new application, including the application type.
     * </p>
     * 
     * @param createOpsMetadataRequest
     * @return A Java Future containing the result of the CreateOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOpsMetadataResult> createOpsMetadataAsync(CreateOpsMetadataRequest createOpsMetadataRequest);

    /**
     * <p>
     * If you create a new application in Application Manager, Systems Manager calls this API action to specify
     * information about the new application, including the application type.
     * </p>
     * 
     * @param createOpsMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOpsMetadataResult> createOpsMetadataAsync(CreateOpsMetadataRequest createOpsMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOpsMetadataRequest, CreateOpsMetadataResult> asyncHandler);

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return A Java Future containing the result of the CreatePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePatchBaselineResult> createPatchBaselineAsync(CreatePatchBaselineRequest createPatchBaselineRequest);

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePatchBaselineResult> createPatchBaselineAsync(CreatePatchBaselineRequest createPatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePatchBaselineRequest, CreatePatchBaselineResult> asyncHandler);

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a single location. Systems Manager offers two
     * types of resource data sync: <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the <code>SyncToDestination</code> type to synchronize
     * Inventory data from multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring
     * Resource Data Sync for Inventory</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the <code>SyncFromSource</code> type to synchronize operational
     * work items (OpsItems) and operational data (OpsData) from multiple AWS Regions to a single S3 bucket. This type
     * can synchronize OpsItems and OpsData from multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html">Setting up
     * Systems Manager Explorer to display data from multiple accounts and Regions</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is
     * completed, the system continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
     * ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
     * restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @return A Java Future containing the result of the CreateResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(CreateResourceDataSyncRequest createResourceDataSyncRequest);

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a single location. Systems Manager offers two
     * types of resource data sync: <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the <code>SyncToDestination</code> type to synchronize
     * Inventory data from multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring
     * Resource Data Sync for Inventory</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the <code>SyncFromSource</code> type to synchronize operational
     * work items (OpsItems) and operational data (OpsData) from multiple AWS Regions to a single S3 bucket. This type
     * can synchronize OpsItems and OpsData from multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html">Setting up
     * Systems Manager Explorer to display data from multiple accounts and Regions</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is
     * completed, the system continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
     * ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
     * restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(CreateResourceDataSyncRequest createResourceDataSyncRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceDataSyncRequest, CreateResourceDataSyncResult> asyncHandler);

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return A Java Future containing the result of the DeleteActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteActivation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest deleteActivationRequest);

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteActivation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest deleteActivationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the configuration of the instance. To
     * change the configuration state of an instance after you disassociate a document, you must create a new document
     * with the desired configuration and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the configuration of the instance. To
     * change the configuration state of an instance after you disassociate a document, you must create a new document
     * with the desired configuration and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use <a>DeleteAssociation</a> to disassociate all instances
     * that are associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use <a>DeleteAssociation</a> to disassociate all instances
     * that are associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Delete a custom inventory type or the data associated with a custom Inventory type. Deleting a custom inventory
     * type is also referred to as deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return A Java Future containing the result of the DeleteInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInventoryResult> deleteInventoryAsync(DeleteInventoryRequest deleteInventoryRequest);

    /**
     * <p>
     * Delete a custom inventory type or the data associated with a custom Inventory type. Deleting a custom inventory
     * type is also referred to as deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInventoryResult> deleteInventoryAsync(DeleteInventoryRequest deleteInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInventoryRequest, DeleteInventoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest);

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Delete OpsMetadata related to an application.
     * </p>
     * 
     * @param deleteOpsMetadataRequest
     * @return A Java Future containing the result of the DeleteOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOpsMetadataResult> deleteOpsMetadataAsync(DeleteOpsMetadataRequest deleteOpsMetadataRequest);

    /**
     * <p>
     * Delete OpsMetadata related to an application.
     * </p>
     * 
     * @param deleteOpsMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOpsMetadataResult> deleteOpsMetadataAsync(DeleteOpsMetadataRequest deleteOpsMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOpsMetadataRequest, DeleteOpsMetadataResult> asyncHandler);

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return A Java Future containing the result of the DeleteParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest deleteParameterRequest);

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest deleteParameterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler);

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return A Java Future containing the result of the DeleteParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParametersResult> deleteParametersAsync(DeleteParametersRequest deleteParametersRequest);

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParametersResult> deleteParametersAsync(DeleteParametersRequest deleteParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteParametersRequest, DeleteParametersResult> asyncHandler);

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return A Java Future containing the result of the DeletePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeletePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeletePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePatchBaselineResult> deletePatchBaselineAsync(DeletePatchBaselineRequest deletePatchBaselineRequest);

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeletePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeletePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePatchBaselineResult> deletePatchBaselineAsync(DeletePatchBaselineRequest deletePatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePatchBaselineRequest, DeletePatchBaselineResult> asyncHandler);

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to data on managed
     * instances are no longer synced to or from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return A Java Future containing the result of the DeleteResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(DeleteResourceDataSyncRequest deleteResourceDataSyncRequest);

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to data on managed
     * instances are no longer synced to or from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(DeleteResourceDataSyncRequest deleteResourceDataSyncRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceDataSyncRequest, DeleteResourceDataSyncResult> asyncHandler);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return A Java Future containing the result of the DeregisterManagedInstance operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterManagedInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterManagedInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterManagedInstance operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterManagedInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterManagedInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler);

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return A Java Future containing the result of the DeregisterPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterPatchBaselineForPatchGroupRequest, DeregisterPatchBaselineForPatchGroupResult> asyncHandler);

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterTargetFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTargetFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest);

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterTargetFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTargetFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterTaskFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTaskFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest);

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterTaskFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTaskFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Describes details about the activation, such as the date and time the activation was created, its expiration
     * date, the IAM role assigned to the instances in the activation, and the number of instances registered by using
     * this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return A Java Future containing the result of the DescribeActivations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeActivations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest describeActivationsRequest);

    /**
     * <p>
     * Describes details about the activation, such as the date and time the activation was created, its expiration
     * date, the IAM role assigned to the instances in the activation, and the number of instances registered by using
     * this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActivations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeActivations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest describeActivationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler);

    /**
     * <p>
     * Describes the association for the specified target or instance. If you created the association by using the
     * <code>Targets</code> parameter, then you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
     * association by specifying the document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future containing the result of the DescribeAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Describes the association for the specified target or instance. If you created the association by using the
     * <code>Targets</code> parameter, then you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
     * association by specifying the document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler);

    /**
     * <p>
     * Use this API action to view information about a specific execution of a specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return A Java Future containing the result of the DescribeAssociationExecutionTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAssociationExecutionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest);

    /**
     * <p>
     * Use this API action to view information about a specific execution of a specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssociationExecutionTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAssociationExecutionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationExecutionTargetsRequest, DescribeAssociationExecutionTargetsResult> asyncHandler);

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return A Java Future containing the result of the DescribeAssociationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAssociationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest);

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssociationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAssociationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationExecutionsRequest, DescribeAssociationExecutionsResult> asyncHandler);

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAutomationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest);

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAutomationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler);

    /**
     * <p>
     * Information about all active and terminated step executions in an Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return A Java Future containing the result of the DescribeAutomationStepExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAutomationStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest);

    /**
     * <p>
     * Information about all active and terminated step executions in an Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutomationStepExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAutomationStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutomationStepExecutionsRequest, DescribeAutomationStepExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return A Java Future containing the result of the DescribeAvailablePatches operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAvailablePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(DescribeAvailablePatchesRequest describeAvailablePatchesRequest);

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAvailablePatches operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAvailablePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(DescribeAvailablePatchesRequest describeAvailablePatchesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAvailablePatchesRequest, DescribeAvailablePatchesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future containing the result of the DescribeDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
     * document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return A Java Future containing the result of the DescribeDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest);

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
     * document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler);

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeEffectiveInstanceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectiveInstanceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest);

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeEffectiveInstanceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectiveInstanceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
     * that this API applies only to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return A Java Future containing the result of the DescribeEffectivePatchesForPatchBaseline operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeEffectivePatchesForPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectivePatchesForPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest);

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
     * that this API applies only to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEffectivePatchesForPatchBaseline operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeEffectivePatchesForPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectivePatchesForPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEffectivePatchesForPatchBaselineRequest, DescribeEffectivePatchesForPatchBaselineResult> asyncHandler);

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstanceAssociationsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest);

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstanceAssociationsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your instances, including information about the operating system platform, the version
     * of SSM Agent installed on the instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those instances. If you do not specify
     * instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or
     * an instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
     * on-premises instances. This call does not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return A Java Future containing the result of the DescribeInstanceInformation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstanceInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest);

    /**
     * <p>
     * Describes one or more of your instances, including information about the operating system platform, the version
     * of SSM Agent installed on the instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those instances. If you do not specify
     * instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or
     * an instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
     * on-premises instances. This call does not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceInformation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstanceInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return A Java Future containing the result of the DescribeInstancePatchStates operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstancePatchStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest);

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstancePatchStates operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstancePatchStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchStatesRequest, DescribeInstancePatchStatesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return A Java Future containing the result of the DescribeInstancePatchStatesForPatchGroup operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstancePatchStatesForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStatesForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest);

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstancePatchStatesForPatchGroup operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstancePatchStatesForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStatesForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchStatesForPatchGroupRequest, DescribeInstancePatchStatesForPatchGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and their state relative to the patch baseline
     * being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return A Java Future containing the result of the DescribeInstancePatches operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstancePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(DescribeInstancePatchesRequest describeInstancePatchesRequest);

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and their state relative to the patch baseline
     * being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstancePatches operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstancePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(DescribeInstancePatchesRequest describeInstancePatchesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchesRequest, DescribeInstancePatchesResult> asyncHandler);

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return A Java Future containing the result of the DescribeInventoryDeletions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInventoryDeletions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInventoryDeletions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest);

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInventoryDeletions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInventoryDeletions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInventoryDeletions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInventoryDeletionsRequest, DescribeInventoryDeletionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
     *         returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutionTaskInvocations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTaskInvocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest);

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
     *         returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutionTaskInvocations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTaskInvocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler);

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest);

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler);

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information about when the maintenance window was
     * scheduled to be active, and information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest);

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information about when the maintenance window was
     * scheduled to be active, and information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowSchedule operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest);

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowSchedule operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowScheduleRequest, DescribeMaintenanceWindowScheduleResult> asyncHandler);

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest);

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you cannot supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values do not affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest);

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you cannot supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values do not affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler);

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest);

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowsForTarget operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowsForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowsForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest);

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowsForTarget operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowsForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowsForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsForTargetRequest, DescribeMaintenanceWindowsForTargetResult> asyncHandler);

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of
     * OpsItems. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return A Java Future containing the result of the DescribeOpsItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeOpsItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeOpsItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOpsItemsResult> describeOpsItemsAsync(DescribeOpsItemsRequest describeOpsItemsRequest);

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of
     * OpsItems. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOpsItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeOpsItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeOpsItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOpsItemsResult> describeOpsItemsAsync(DescribeOpsItemsRequest describeOpsItemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOpsItemsRequest, DescribeOpsItemsResult> asyncHandler);

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler);

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return A Java Future containing the result of the DescribePatchBaselines operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribePatchBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(DescribePatchBaselinesRequest describePatchBaselinesRequest);

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePatchBaselines operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribePatchBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(DescribePatchBaselinesRequest describePatchBaselinesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePatchBaselinesRequest, DescribePatchBaselinesResult> asyncHandler);

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return A Java Future containing the result of the DescribePatchGroupState operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribePatchGroupState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(DescribePatchGroupStateRequest describePatchGroupStateRequest);

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePatchGroupState operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribePatchGroupState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(DescribePatchGroupStateRequest describePatchGroupStateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePatchGroupStateRequest, DescribePatchGroupStateResult> asyncHandler);

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return A Java Future containing the result of the DescribePatchGroups operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribePatchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchGroupsResult> describePatchGroupsAsync(DescribePatchGroupsRequest describePatchGroupsRequest);

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePatchGroups operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribePatchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchGroupsResult> describePatchGroupsAsync(DescribePatchGroupsRequest describePatchGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePatchGroupsRequest, DescribePatchGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the properties of available patches organized by product, product family, classification, severity, and
     * other properties of available patches. You can use the reported properties in the filters you specify in requests
     * for actions such as <a>CreatePatchBaseline</a>, <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters for each major operating system type:
     * </p>
     * <dl>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>DEBIAN</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>MACOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION
     * </p>
     * </dd>
     * <dt>ORACLE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return A Java Future containing the result of the DescribePatchProperties operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribePatchProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(DescribePatchPropertiesRequest describePatchPropertiesRequest);

    /**
     * <p>
     * Lists the properties of available patches organized by product, product family, classification, severity, and
     * other properties of available patches. You can use the reported properties in the filters you specify in requests
     * for actions such as <a>CreatePatchBaseline</a>, <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters for each major operating system type:
     * </p>
     * <dl>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>DEBIAN</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>MACOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION
     * </p>
     * </dd>
     * <dt>ORACLE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePatchProperties operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribePatchProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(DescribePatchPropertiesRequest describePatchPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePatchPropertiesRequest, DescribePatchPropertiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
     * days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
     * days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler);

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return A Java Future containing the result of the GetAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest getAutomationExecutionRequest);

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest getAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional, specified time. If you specify a time,
     * <code>GetCalendarState</code> returns the state of the calendar at a specific time, and returns the next time
     * that the Change Calendar state will transition. If you do not specify a time, <code>GetCalendarState</code>
     * assumes the current time. Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>.
     * </p>
     * <p>
     * If you specify more than one calendar in a request, the command returns the status of <code>OPEN</code> only if
     * all calendars in the request are open. If one or more calendars in the request are closed, the status returned is
     * <code>CLOSED</code>.
     * </p>
     * <p>
     * For more information about Systems Manager Change Calendar, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html">AWS
     * Systems Manager Change Calendar</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return A Java Future containing the result of the GetCalendarState operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetCalendarState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCalendarState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCalendarStateResult> getCalendarStateAsync(GetCalendarStateRequest getCalendarStateRequest);

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional, specified time. If you specify a time,
     * <code>GetCalendarState</code> returns the state of the calendar at a specific time, and returns the next time
     * that the Change Calendar state will transition. If you do not specify a time, <code>GetCalendarState</code>
     * assumes the current time. Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>.
     * </p>
     * <p>
     * If you specify more than one calendar in a request, the command returns the status of <code>OPEN</code> only if
     * all calendars in the request are open. If one or more calendars in the request are closed, the status returned is
     * <code>CLOSED</code>.
     * </p>
     * <p>
     * For more information about Systems Manager Change Calendar, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html">AWS
     * Systems Manager Change Calendar</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCalendarState operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetCalendarState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCalendarState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCalendarStateResult> getCalendarStateAsync(GetCalendarStateRequest getCalendarStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCalendarStateRequest, GetCalendarStateResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * <p>
     * <code>GetCommandInvocation</code> only gives the execution status of a plugin in a document. To get the command
     * execution status on a specific instance, use <a>ListCommandInvocations</a>. To get the command execution status
     * across instances, use <a>ListCommands</a>.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return A Java Future containing the result of the GetCommandInvocation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetCommandInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest getCommandInvocationRequest);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * <p>
     * <code>GetCommandInvocation</code> only gives the execution status of a plugin in a document. To get the command
     * execution status on a specific instance, use <a>ListCommandInvocations</a>. To get the command execution status
     * across instances, use <a>ListCommands</a>.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommandInvocation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetCommandInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest getCommandInvocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to determine whether it is running and ready to
     * receive Session Manager connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return A Java Future containing the result of the GetConnectionStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetConnectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionStatusResult> getConnectionStatusAsync(GetConnectionStatusRequest getConnectionStatusRequest);

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to determine whether it is running and ready to
     * receive Session Manager connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectionStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetConnectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionStatusResult> getConnectionStatusAsync(GetConnectionStatusRequest getConnectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionStatusRequest, GetConnectionStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
     * baselines. For example, you can create a default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return A Java Future containing the result of the GetDefaultPatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDefaultPatchBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest);

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
     * baselines. For example, you can create a default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDefaultPatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDefaultPatchBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<GetDefaultPatchBaselineRequest, GetDefaultPatchBaselineResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
     * AWS-RunPatchBaseline Systems Manager document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return A Java Future containing the result of the GetDeployablePatchSnapshotForInstance operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest);

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
     * AWS-RunPatchBaseline Systems Manager document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployablePatchSnapshotForInstance operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeployablePatchSnapshotForInstanceRequest, GetDeployablePatchSnapshotForInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler);

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return A Java Future containing the result of the GetInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest);

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler);

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return A Java Future containing the result of the GetInventorySchema operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetInventorySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest getInventorySchemaRequest);

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInventorySchema operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetInventorySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest getInventorySchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler);

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return A Java Future containing the result of the GetMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest getMaintenanceWindowRequest);

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest getMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest);

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTaskInvocation operation returned
     *         by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowExecutionTaskInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest);

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTaskInvocation operation returned
     *         by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowExecutionTaskInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskInvocationRequest, GetMaintenanceWindowExecutionTaskInvocationResult> asyncHandler);

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you cannot supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values do not affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowTask operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you cannot supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values do not affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowTask operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowTaskRequest, GetMaintenanceWindowTaskResult> asyncHandler);

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management
     * (IAM) to view information about an OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return A Java Future containing the result of the GetOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsItemResult> getOpsItemAsync(GetOpsItemRequest getOpsItemRequest);

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management
     * (IAM) to view information about an OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsItemResult> getOpsItemAsync(GetOpsItemRequest getOpsItemRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpsItemRequest, GetOpsItemResult> asyncHandler);

    /**
     * <p>
     * View operational metadata related to an application in Application Manager.
     * </p>
     * 
     * @param getOpsMetadataRequest
     * @return A Java Future containing the result of the GetOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsMetadataResult> getOpsMetadataAsync(GetOpsMetadataRequest getOpsMetadataRequest);

    /**
     * <p>
     * View operational metadata related to an application in Application Manager.
     * </p>
     * 
     * @param getOpsMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsMetadataResult> getOpsMetadataAsync(GetOpsMetadataRequest getOpsMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpsMetadataRequest, GetOpsMetadataResult> asyncHandler);

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return A Java Future containing the result of the GetOpsSummary operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetOpsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsSummary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsSummaryResult> getOpsSummaryAsync(GetOpsSummaryRequest getOpsSummaryRequest);

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpsSummary operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetOpsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsSummary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOpsSummaryResult> getOpsSummaryAsync(GetOpsSummaryRequest getOpsSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpsSummaryRequest, GetOpsSummaryResult> asyncHandler);

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't confuse this API action with the
     * <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return A Java Future containing the result of the GetParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParameterResult> getParameterAsync(GetParameterRequest getParameterRequest);

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't confuse this API action with the
     * <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParameterResult> getParameterAsync(GetParameterRequest getParameterRequest,
            com.amazonaws.handlers.AsyncHandler<GetParameterRequest, GetParameterResult> asyncHandler);

    /**
     * <p>
     * Retrieves the history of all changes to a parameter.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return A Java Future containing the result of the GetParameterHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest getParameterHistoryRequest);

    /**
     * <p>
     * Retrieves the history of all changes to a parameter.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParameterHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest getParameterHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler);

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return A Java Future containing the result of the GetParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest);

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return A Java Future containing the result of the GetParametersByPath operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParametersByPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParametersByPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersByPathResult> getParametersByPathAsync(GetParametersByPathRequest getParametersByPathRequest);

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParametersByPath operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParametersByPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParametersByPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersByPathResult> getParametersByPathAsync(GetParametersByPathRequest getParametersByPathRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersByPathRequest, GetParametersByPathResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return A Java Future containing the result of the GetPatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPatchBaselineResult> getPatchBaselineAsync(GetPatchBaselineRequest getPatchBaselineRequest);

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPatchBaselineResult> getPatchBaselineAsync(GetPatchBaselineRequest getPatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<GetPatchBaselineRequest, GetPatchBaselineResult> asyncHandler);

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return A Java Future containing the result of the GetPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.GetPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetPatchBaselineForPatchGroupRequest, GetPatchBaselineForPatchGroupResult> asyncHandler);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>UpdateServiceSetting</a> API action to change the default setting. Or use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest
     *        The request body of the GetServiceSetting API action.
     * @return A Java Future containing the result of the GetServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingResult> getServiceSettingAsync(GetServiceSettingRequest getServiceSettingRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>UpdateServiceSetting</a> API action to change the default setting. Or use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest
     *        The request body of the GetServiceSetting API action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingResult> getServiceSettingAsync(GetServiceSettingRequest getServiceSettingRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceSettingRequest, GetServiceSettingResult> asyncHandler);

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
     * parameter, Systems Manager automatically saves a new version and increments the version number by one. A label
     * can help you remember the purpose of a parameter when there are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same parameter. For example, if version 1 has the
     * label Production, then you can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach a label to a specific version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you no longer want to use a parameter label, then you can either delete it or move it to a different version
     * of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these
     * requirements, then the label is not associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return A Java Future containing the result of the LabelParameterVersion operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.LabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LabelParameterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LabelParameterVersionResult> labelParameterVersionAsync(LabelParameterVersionRequest labelParameterVersionRequest);

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
     * parameter, Systems Manager automatically saves a new version and increments the version number by one. A label
     * can help you remember the purpose of a parameter when there are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same parameter. For example, if version 1 has the
     * label Production, then you can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach a label to a specific version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you no longer want to use a parameter label, then you can either delete it or move it to a different version
     * of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these
     * requirements, then the label is not associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LabelParameterVersion operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.LabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LabelParameterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LabelParameterVersionResult> labelParameterVersionAsync(LabelParameterVersionRequest labelParameterVersionRequest,
            com.amazonaws.handlers.AsyncHandler<LabelParameterVersionRequest, LabelParameterVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return A Java Future containing the result of the ListAssociationVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListAssociationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationVersionsResult> listAssociationVersionsAsync(ListAssociationVersionsRequest listAssociationVersionsRequest);

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociationVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListAssociationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationVersionsResult> listAssociationVersionsAsync(ListAssociationVersionsRequest listAssociationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationVersionsRequest, ListAssociationVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and Region. You can limit the results to a
     * specific State Manager association document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and Region. You can limit the results to a
     * specific State Manager association document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
     * a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return A Java Future containing the result of the ListCommandInvocations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListCommandInvocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest listCommandInvocationsRequest);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
     * a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCommandInvocations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListCommandInvocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest listCommandInvocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler);

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return A Java Future containing the result of the ListCommands operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommands" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest);

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCommands operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommands" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler);

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
     * Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
     * filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return A Java Future containing the result of the ListComplianceItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceItemsResult> listComplianceItemsAsync(ListComplianceItemsRequest listComplianceItemsRequest);

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
     * Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
     * filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComplianceItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceItemsResult> listComplianceItemsAsync(ListComplianceItemsRequest listComplianceItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComplianceItemsRequest, ListComplianceItemsResult> asyncHandler);

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
     * can return State Manager associations, patches, or custom compliance types according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return A Java Future containing the result of the ListComplianceSummaries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceSummariesResult> listComplianceSummariesAsync(ListComplianceSummariesRequest listComplianceSummariesRequest);

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
     * can return State Manager associations, patches, or custom compliance types according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComplianceSummaries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceSummariesResult> listComplianceSummariesAsync(ListComplianceSummariesRequest listComplianceSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListComplianceSummariesRequest, ListComplianceSummariesResult> asyncHandler);

    /**
     * <p>
     * Information about approval reviews for a version of an SSM document.
     * </p>
     * 
     * @param listDocumentMetadataHistoryRequest
     * @return A Java Future containing the result of the ListDocumentMetadataHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListDocumentMetadataHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentMetadataHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentMetadataHistoryResult> listDocumentMetadataHistoryAsync(
            ListDocumentMetadataHistoryRequest listDocumentMetadataHistoryRequest);

    /**
     * <p>
     * Information about approval reviews for a version of an SSM document.
     * </p>
     * 
     * @param listDocumentMetadataHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocumentMetadataHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListDocumentMetadataHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentMetadataHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentMetadataHistoryResult> listDocumentMetadataHistoryAsync(
            ListDocumentMetadataHistoryRequest listDocumentMetadataHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentMetadataHistoryRequest, ListDocumentMetadataHistoryResult> asyncHandler);

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return A Java Future containing the result of the ListDocumentVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest listDocumentVersionsRequest);

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocumentVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest listDocumentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account and Region. You can limit the results of
     * this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest);

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account and Region. You can limit the results of
     * this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync();

    /**
     * Simplified method form for invoking the ListDocuments operation with an AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return A Java Future containing the result of the ListInventoryEntries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListInventoryEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(ListInventoryEntriesRequest listInventoryEntriesRequest);

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInventoryEntries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListInventoryEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(ListInventoryEntriesRequest listInventoryEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInventoryEntriesRequest, ListInventoryEntriesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all OpsItem events in the current AWS account and Region. You can limit the results to events
     * associated with specific OpsItems by specifying a filter.
     * </p>
     * 
     * @param listOpsItemEventsRequest
     * @return A Java Future containing the result of the ListOpsItemEvents operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListOpsItemEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsItemEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOpsItemEventsResult> listOpsItemEventsAsync(ListOpsItemEventsRequest listOpsItemEventsRequest);

    /**
     * <p>
     * Returns a list of all OpsItem events in the current AWS account and Region. You can limit the results to events
     * associated with specific OpsItems by specifying a filter.
     * </p>
     * 
     * @param listOpsItemEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOpsItemEvents operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListOpsItemEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsItemEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOpsItemEventsResult> listOpsItemEventsAsync(ListOpsItemEventsRequest listOpsItemEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOpsItemEventsRequest, ListOpsItemEventsResult> asyncHandler);

    /**
     * <p>
     * Systems Manager calls this API action when displaying all Application Manager OpsMetadata objects or blobs.
     * </p>
     * 
     * @param listOpsMetadataRequest
     * @return A Java Future containing the result of the ListOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOpsMetadataResult> listOpsMetadataAsync(ListOpsMetadataRequest listOpsMetadataRequest);

    /**
     * <p>
     * Systems Manager calls this API action when displaying all Application Manager OpsMetadata objects or blobs.
     * </p>
     * 
     * @param listOpsMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOpsMetadataResult> listOpsMetadataAsync(ListOpsMetadataRequest listOpsMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<ListOpsMetadataRequest, ListOpsMetadataResult> asyncHandler);

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information about compliant and non-compliant
     * statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return A Java Future containing the result of the ListResourceComplianceSummaries operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.ListResourceComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceComplianceSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest);

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information about compliant and non-compliant
     * statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceComplianceSummaries operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListResourceComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceComplianceSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceComplianceSummariesRequest, ListResourceComplianceSummariesResult> asyncHandler);

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
     * the last sync status, and the last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a single call to
     * <code>ListResourceDataSync</code>. You can limit the number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more sync configurations to list, check the
     * value of <code>NextToken</code> in the output. If there are more sync configurations to list, you can request
     * them by specifying the <code>NextToken</code> returned in the call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return A Java Future containing the result of the ListResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDataSyncResult> listResourceDataSyncAsync(ListResourceDataSyncRequest listResourceDataSyncRequest);

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
     * the last sync status, and the last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a single call to
     * <code>ListResourceDataSync</code>. You can limit the number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more sync configurations to list, check the
     * value of <code>NextToken</code> in the output. If there are more sync configurations to list, you can request
     * them by specifying the <code>NextToken</code> returned in the call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDataSyncResult> listResourceDataSyncAsync(ListResourceDataSyncRequest listResourceDataSyncRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceDataSyncRequest, ListResourceDataSyncResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
     * AWS user account IDs for those people who can use the document. If you share a document publicly, you must
     * specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return A Java Future containing the result of the ModifyDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
     * AWS user account IDs for those people who can use the document. If you share a document publicly, you must
     * specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler);

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated resource. This action lets you register
     * custom compliance details with a resource. This call overwrites existing compliance information on the resource,
     * so you must provide a full list of compliance items each time that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example, <code>approved</code> for patches, or <code>Failed</code>
     * for associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example, <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example, <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify
     * the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return A Java Future containing the result of the PutComplianceItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.PutComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutComplianceItemsResult> putComplianceItemsAsync(PutComplianceItemsRequest putComplianceItemsRequest);

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated resource. This action lets you register
     * custom compliance details with a resource. This call overwrites existing compliance information on the resource,
     * so you must provide a full list of compliance items each time that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example, <code>approved</code> for patches, or <code>Failed</code>
     * for associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example, <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example, <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify
     * the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutComplianceItems operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.PutComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutComplianceItemsResult> putComplianceItemsAsync(PutComplianceItemsRequest putComplianceItemsRequest,
            com.amazonaws.handlers.AsyncHandler<PutComplianceItemsRequest, PutComplianceItemsResult> asyncHandler);

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return A Java Future containing the result of the PutInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.PutInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest);

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.PutInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler);

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return A Java Future containing the result of the PutParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.PutParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest);

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.PutParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest,
            com.amazonaws.handlers.AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler);

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID
     * value. For example, for CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code> instead of
     * <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return A Java Future containing the result of the RegisterDefaultPatchBaseline operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterDefaultPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest);

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID
     * value. For example, for CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code> instead of
     * <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDefaultPatchBaseline operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterDefaultPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDefaultPatchBaselineRequest, RegisterDefaultPatchBaselineResult> asyncHandler);

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return A Java Future containing the result of the RegisterPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterPatchBaselineForPatchGroup operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterPatchBaselineForPatchGroupRequest, RegisterPatchBaselineForPatchGroupResult> asyncHandler);

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterTargetWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTargetWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest);

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterTargetWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTargetWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterTaskWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest);

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterTaskWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Use the <a>UpdateServiceSetting</a> API action to
     * change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest
     *        The request body of the ResetServiceSetting API action.
     * @return A Java Future containing the result of the ResetServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ResetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetServiceSettingResult> resetServiceSettingAsync(ResetServiceSettingRequest resetServiceSettingRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Use the <a>UpdateServiceSetting</a> API action to
     * change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest
     *        The request body of the ResetServiceSetting API action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ResetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetServiceSettingResult> resetServiceSettingAsync(ResetServiceSettingRequest resetServiceSettingRequest,
            com.amazonaws.handlers.AsyncHandler<ResetServiceSettingRequest, ResetServiceSettingResult> asyncHandler);

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
     * sessions, but not terminated sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically reconnect during intermittent network
     * issues. It is not intended for any other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return A Java Future containing the result of the ResumeSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ResumeSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResumeSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeSessionResult> resumeSessionAsync(ResumeSessionRequest resumeSessionRequest);

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
     * sessions, but not terminated sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically reconnect during intermittent network
     * issues. It is not intended for any other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ResumeSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResumeSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeSessionResult> resumeSessionAsync(ResumeSessionRequest resumeSessionRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeSessionRequest, ResumeSessionResult> asyncHandler);

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return A Java Future containing the result of the SendAutomationSignal operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.SendAutomationSignal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendAutomationSignal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendAutomationSignalResult> sendAutomationSignalAsync(SendAutomationSignalRequest sendAutomationSignalRequest);

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendAutomationSignal operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.SendAutomationSignal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendAutomationSignal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendAutomationSignalResult> sendAutomationSignalAsync(SendAutomationSignalRequest sendAutomationSignalRequest,
            com.amazonaws.handlers.AsyncHandler<SendAutomationSignalRequest, SendAutomationSignalResult> asyncHandler);

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest,
            com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler);

    /**
     * <p>
     * Use this API action to run an association immediately and only one time. This action can be helpful when
     * troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return A Java Future containing the result of the StartAssociationsOnce operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StartAssociationsOnce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAssociationsOnceResult> startAssociationsOnceAsync(StartAssociationsOnceRequest startAssociationsOnceRequest);

    /**
     * <p>
     * Use this API action to run an association immediately and only one time. This action can be helpful when
     * troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAssociationsOnce operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StartAssociationsOnce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAssociationsOnceResult> startAssociationsOnceAsync(StartAssociationsOnceRequest startAssociationsOnceRequest,
            com.amazonaws.handlers.AsyncHandler<StartAssociationsOnceRequest, StartAssociationsOnceResult> asyncHandler);

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return A Java Future containing the result of the StartAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest startAutomationExecutionRequest);

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest startAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Creates a change request for Change Manager. The runbooks (Automation documents) specified in the change request
     * run only after all required approvals for the change request have been received.
     * </p>
     * 
     * @param startChangeRequestExecutionRequest
     * @return A Java Future containing the result of the StartChangeRequestExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StartChangeRequestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartChangeRequestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartChangeRequestExecutionResult> startChangeRequestExecutionAsync(
            StartChangeRequestExecutionRequest startChangeRequestExecutionRequest);

    /**
     * <p>
     * Creates a change request for Change Manager. The runbooks (Automation documents) specified in the change request
     * run only after all required approvals for the change request have been received.
     * </p>
     * 
     * @param startChangeRequestExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChangeRequestExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StartChangeRequestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartChangeRequestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartChangeRequestExecutionResult> startChangeRequestExecutionAsync(
            StartChangeRequestExecutionRequest startChangeRequestExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartChangeRequestExecutionRequest, StartChangeRequestExecutionResult> asyncHandler);

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
     * token that can be used to open a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that requires the Session Manager plugin to
     * be installed on the client machine making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently supported by AWS Tools for PowerShell on
     * Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return A Java Future containing the result of the StartSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest);

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
     * token that can be used to open a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that requires the Session Manager plugin to
     * be installed on the client machine making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently supported by AWS Tools for PowerShell on
     * Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler);

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return A Java Future containing the result of the StopAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StopAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest stopAutomationExecutionRequest);

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StopAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest stopAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
     * instance. A terminated session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return A Java Future containing the result of the TerminateSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest terminateSessionRequest);

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
     * instance. A terminated session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateSession operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest terminateSessionRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler);

    /**
     * <p>
     * Remove a label or labels from a parameter.
     * </p>
     * 
     * @param unlabelParameterVersionRequest
     * @return A Java Future containing the result of the UnlabelParameterVersion operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UnlabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UnlabelParameterVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnlabelParameterVersionResult> unlabelParameterVersionAsync(UnlabelParameterVersionRequest unlabelParameterVersionRequest);

    /**
     * <p>
     * Remove a label or labels from a parameter.
     * </p>
     * 
     * @param unlabelParameterVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnlabelParameterVersion operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UnlabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UnlabelParameterVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnlabelParameterVersionResult> unlabelParameterVersionAsync(UnlabelParameterVersionRequest unlabelParameterVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UnlabelParameterVersionRequest, UnlabelParameterVersionResult> asyncHandler);

    /**
     * <p>
     * Updates an association. You can update the association name and version, the document version, schedule,
     * parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role must be configured with permission to
     * call the <a>DescribeAssociation</a> API action. If you don't have permission to call DescribeAssociation, then
     * you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return A Java Future containing the result of the UpdateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest updateAssociationRequest);

    /**
     * <p>
     * Updates an association. You can update the association name and version, the document version, schedule,
     * parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role must be configured with permission to
     * call the <a>DescribeAssociation</a> API action. If you don't have permission to call DescribeAssociation, then
     * you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest updateAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future containing the result of the UpdateAssociationStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociationStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssociationStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociationStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler);

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest);

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler);

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateDocumentDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest);

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateDocumentDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler);

    /**
     * <p>
     * Updates information related to approval reviews for a specific version of a document.
     * </p>
     * 
     * @param updateDocumentMetadataRequest
     * @return A Java Future containing the result of the UpdateDocumentMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateDocumentMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentMetadataResult> updateDocumentMetadataAsync(UpdateDocumentMetadataRequest updateDocumentMetadataRequest);

    /**
     * <p>
     * Updates information related to approval reviews for a specific version of a document.
     * </p>
     * 
     * @param updateDocumentMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateDocumentMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentMetadataResult> updateDocumentMetadataAsync(UpdateDocumentMetadataRequest updateDocumentMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentMetadataRequest, UpdateDocumentMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest);

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource
     * group. For more information, see <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return A Java Future containing the result of the UpdateMaintenanceWindowTarget operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateMaintenanceWindowTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest);

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource
     * group. For more information, see <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMaintenanceWindowTarget operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateMaintenanceWindowTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowTargetRequest, UpdateMaintenanceWindowTargetResult> asyncHandler);

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * <p>
     * If the value for a parameter in <code>UpdateMaintenanceWindowTask</code> is null, then the corresponding field is
     * not modified. If you set <code>Replace</code> to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this request. Optional fields that aren't
     * specified are set to null.
     * </p>
     * <important>
     * <p>
     * When you update a maintenance window task that has options specified in <code>TaskInvocationParameters</code>,
     * you must provide again all the <code>TaskInvocationParameters</code> values that you want to retain. The values
     * you do not specify again are removed. For example, suppose that when you registered a Run Command task, you
     * specified <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     * and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a different
     * <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and <code>NotificationConfig</code>
     * are removed.
     * </p>
     * </important>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return A Java Future containing the result of the UpdateMaintenanceWindowTask operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * <p>
     * If the value for a parameter in <code>UpdateMaintenanceWindowTask</code> is null, then the corresponding field is
     * not modified. If you set <code>Replace</code> to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this request. Optional fields that aren't
     * specified are set to null.
     * </p>
     * <important>
     * <p>
     * When you update a maintenance window task that has options specified in <code>TaskInvocationParameters</code>,
     * you must provide again all the <code>TaskInvocationParameters</code> values that you want to retain. The values
     * you do not specify again are removed. For example, suppose that when you registered a Run Command task, you
     * specified <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     * and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a different
     * <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and <code>NotificationConfig</code>
     * are removed.
     * </p>
     * </important>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMaintenanceWindowTask operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowTaskRequest, UpdateMaintenanceWindowTaskResult> asyncHandler);

    /**
     * <p>
     * Changes the Amazon Identity and Access Management (IAM) role that is assigned to the on-premises instance or
     * virtual machines (VM). IAM roles are first assigned to these hybrid instances during the activation process. For
     * more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateManagedInstanceRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest);

    /**
     * <p>
     * Changes the Amazon Identity and Access Management (IAM) role that is assigned to the on-premises instance or
     * virtual machines (VM). IAM roles are first assigned to these hybrid instances during the activation process. For
     * more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateManagedInstanceRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler);

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an
     * OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return A Java Future containing the result of the UpdateOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOpsItemResult> updateOpsItemAsync(UpdateOpsItemRequest updateOpsItemRequest);

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an
     * OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
     * impacting the performance and health of their AWS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager
     * OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOpsItem operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOpsItemResult> updateOpsItemAsync(UpdateOpsItemRequest updateOpsItemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOpsItemRequest, UpdateOpsItemResult> asyncHandler);

    /**
     * <p>
     * Systems Manager calls this API action when you edit OpsMetadata in Application Manager.
     * </p>
     * 
     * @param updateOpsMetadataRequest
     * @return A Java Future containing the result of the UpdateOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOpsMetadataResult> updateOpsMetadataAsync(UpdateOpsMetadataRequest updateOpsMetadataRequest);

    /**
     * <p>
     * Systems Manager calls this API action when you edit OpsMetadata in Application Manager.
     * </p>
     * 
     * @param updateOpsMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOpsMetadata operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOpsMetadataResult> updateOpsMetadataAsync(UpdateOpsMetadataRequest updateOpsMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOpsMetadataRequest, UpdateOpsMetadataResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return A Java Future containing the result of the UpdatePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(UpdatePatchBaselineRequest updatePatchBaselineRequest);

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePatchBaseline operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(UpdatePatchBaselineRequest updatePatchBaselineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePatchBaselineRequest, UpdatePatchBaselineResult> asyncHandler);

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a Region, you can't change the account
     * options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later and choose the Include all accounts from
     * my AWS Organizations configuration option. Instead, you must delete the first resource data sync, and create a
     * new one.
     * </p>
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return A Java Future containing the result of the UpdateResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(UpdateResourceDataSyncRequest updateResourceDataSyncRequest);

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a Region, you can't change the account
     * options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later and choose the Include all accounts from
     * my AWS Organizations configuration option. Instead, you must delete the first resource data sync, and create a
     * new one.
     * </p>
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceDataSync operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(UpdateResourceDataSyncRequest updateResourceDataSyncRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceDataSyncRequest, UpdateResourceDataSyncResult> asyncHandler);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Or, use the <a>ResetServiceSetting</a> to change
     * the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest
     *        The request body of the UpdateServiceSetting API action.
     * @return A Java Future containing the result of the UpdateServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingResult> updateServiceSettingAsync(UpdateServiceSettingRequest updateServiceSettingRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Or, use the <a>ResetServiceSetting</a> to change
     * the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest
     *        The request body of the UpdateServiceSetting API action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceSetting operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingResult> updateServiceSettingAsync(UpdateServiceSettingRequest updateServiceSettingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingRequest, UpdateServiceSettingResult> asyncHandler);

}
