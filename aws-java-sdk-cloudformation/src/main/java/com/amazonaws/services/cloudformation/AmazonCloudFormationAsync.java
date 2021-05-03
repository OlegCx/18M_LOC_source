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
package com.amazonaws.services.cloudformation;

import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AWS CloudFormation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudformation.AbstractAmazonCloudFormationAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
 * use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
 * Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
 * scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
 * a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a href="http://aws.amazon.com/cloudformation/">AWS
 * CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
 * AWS product, you can find the product's technical documentation at <a
 * href="https://docs.aws.amazon.com/">docs.aws.amazon.com</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudFormationAsync extends AmazonCloudFormation {

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
     * reverts to the previous stack configuration.
     * </p>
     * <note>
     * <p>
     * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
     * </p>
     * </note>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @return A Java Future containing the result of the CancelUpdateStack operation returned by the service.
     * @sample AmazonCloudFormationAsync.CancelUpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CancelUpdateStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(CancelUpdateStackRequest cancelUpdateStackRequest);

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
     * reverts to the previous stack configuration.
     * </p>
     * <note>
     * <p>
     * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
     * </p>
     * </note>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelUpdateStack operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CancelUpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CancelUpdateStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(CancelUpdateStackRequest cancelUpdateStackRequest,
            com.amazonaws.handlers.AsyncHandler<CancelUpdateStackRequest, CancelUpdateStackResult> asyncHandler);

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code> state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of the failure, you can manually <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the rollback, you can return your stack to a working
     * state (the <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS CloudFormation cannot roll back all
     * changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
     * instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
     * deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
     * rollback to fail.
     * </p>
     * 
     * @param continueUpdateRollbackRequest
     *        The input for the <a>ContinueUpdateRollback</a> action.
     * @return A Java Future containing the result of the ContinueUpdateRollback operation returned by the service.
     * @sample AmazonCloudFormationAsync.ContinueUpdateRollback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ContinueUpdateRollback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(ContinueUpdateRollbackRequest continueUpdateRollbackRequest);

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code> state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of the failure, you can manually <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the rollback, you can return your stack to a working
     * state (the <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS CloudFormation cannot roll back all
     * changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
     * instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
     * deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
     * rollback to fail.
     * </p>
     * 
     * @param continueUpdateRollbackRequest
     *        The input for the <a>ContinueUpdateRollback</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ContinueUpdateRollback operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ContinueUpdateRollback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ContinueUpdateRollback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(ContinueUpdateRollbackRequest continueUpdateRollbackRequest,
            com.amazonaws.handlers.AsyncHandler<ContinueUpdateRollbackRequest, ContinueUpdateRollbackResult> asyncHandler);

    /**
     * <p>
     * Creates a list of changes that will be applied to a stack so that you can review the changes before executing
     * them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
     * for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
     * you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
     * information that you submit in the change set and lists the differences. Use change sets to understand which
     * resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
     * you create or update a stack.
     * </p>
     * <p>
     * To create a change set for a stack that doesn't exist, for the <code>ChangeSetType</code> parameter, specify
     * <code>CREATE</code>. To create a change set for an existing stack, specify <code>UPDATE</code> for the
     * <code>ChangeSetType</code> parameter. To create a change set for an import operation, specify <code>IMPORT</code>
     * for the <code>ChangeSetType</code> parameter. After the <code>CreateChangeSet</code> call successfully completes,
     * AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
     * <a>DescribeChangeSet</a> action.
     * </p>
     * <p>
     * When you are satisfied with the changes the change set will make, execute the change set by using the
     * <a>ExecuteChangeSet</a> action. AWS CloudFormation doesn't make changes until you execute the change set.
     * </p>
     * <p>
     * To create a change set for the entire stack hierachy, set <code>IncludeNestedStacks</code> to <code>True</code>.
     * </p>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @return A Java Future containing the result of the CreateChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.CreateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(CreateChangeSetRequest createChangeSetRequest);

    /**
     * <p>
     * Creates a list of changes that will be applied to a stack so that you can review the changes before executing
     * them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
     * for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
     * you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
     * information that you submit in the change set and lists the differences. Use change sets to understand which
     * resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
     * you create or update a stack.
     * </p>
     * <p>
     * To create a change set for a stack that doesn't exist, for the <code>ChangeSetType</code> parameter, specify
     * <code>CREATE</code>. To create a change set for an existing stack, specify <code>UPDATE</code> for the
     * <code>ChangeSetType</code> parameter. To create a change set for an import operation, specify <code>IMPORT</code>
     * for the <code>ChangeSetType</code> parameter. After the <code>CreateChangeSet</code> call successfully completes,
     * AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
     * <a>DescribeChangeSet</a> action.
     * </p>
     * <p>
     * When you are satisfied with the changes the change set will make, execute the change set by using the
     * <a>ExecuteChangeSet</a> action. AWS CloudFormation doesn't make changes until you execute the change set.
     * </p>
     * <p>
     * To create a change set for the entire stack hierachy, set <code>IncludeNestedStacks</code> to <code>True</code>.
     * </p>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(CreateChangeSetRequest createChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChangeSetRequest, CreateChangeSetResult> asyncHandler);

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
     * You can check the status of the stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonCloudFormationAsync.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
     * You can check the status of the stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Creates stack instances for the specified accounts, within the specified Regions. A stack instance refers to a
     * stack in a specific account and Region. You must specify at least one value for either <code>Accounts</code> or
     * <code>DeploymentTargets</code>, and you must specify at least one value for <code>Regions</code>.
     * </p>
     * 
     * @param createStackInstancesRequest
     * @return A Java Future containing the result of the CreateStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsync.CreateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStackInstancesResult> createStackInstancesAsync(CreateStackInstancesRequest createStackInstancesRequest);

    /**
     * <p>
     * Creates stack instances for the specified accounts, within the specified Regions. A stack instance refers to a
     * stack in a specific account and Region. You must specify at least one value for either <code>Accounts</code> or
     * <code>DeploymentTargets</code>, and you must specify at least one value for <code>Regions</code>.
     * </p>
     * 
     * @param createStackInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStackInstancesResult> createStackInstancesAsync(CreateStackInstancesRequest createStackInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackInstancesRequest, CreateStackInstancesResult> asyncHandler);

    /**
     * <p>
     * Creates a stack set.
     * </p>
     * 
     * @param createStackSetRequest
     * @return A Java Future containing the result of the CreateStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.CreateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStackSetResult> createStackSetAsync(CreateStackSetRequest createStackSetRequest);

    /**
     * <p>
     * Creates a stack set.
     * </p>
     * 
     * @param createStackSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStackSetResult> createStackSetAsync(CreateStackSetRequest createStackSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackSetRequest, CreateStackSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully deleted the change set.
     * </p>
     * <p>
     * If <code>IncludeNestedStacks</code> specifies <code>True</code> during the creation of the nested change set,
     * then <code>DeleteChangeSet</code> will delete all change sets that belong to the stacks hierarchy and will also
     * delete all change sets for nested stacks with the status of <code>REVIEW_IN_PROGRESS</code>.
     * </p>
     * 
     * @param deleteChangeSetRequest
     *        The input for the <a>DeleteChangeSet</a> action.
     * @return A Java Future containing the result of the DeleteChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeleteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(DeleteChangeSetRequest deleteChangeSetRequest);

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully deleted the change set.
     * </p>
     * <p>
     * If <code>IncludeNestedStacks</code> specifies <code>True</code> during the creation of the nested change set,
     * then <code>DeleteChangeSet</code> will delete all change sets that belong to the stacks hierarchy and will also
     * delete all change sets for nested stacks with the status of <code>REVIEW_IN_PROGRESS</code>.
     * </p>
     * 
     * @param deleteChangeSetRequest
     *        The input for the <a>DeleteChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeleteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(DeleteChangeSetRequest deleteChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChangeSetRequest, DeleteChangeSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
     * show up in the <a>DescribeStacks</a> API if the deletion has been completed successfully.
     * </p>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
     * show up in the <a>DescribeStacks</a> API if the deletion has been completed successfully.
     * </p>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler);

    /**
     * <p>
     * Deletes stack instances for the specified accounts, in the specified Regions.
     * </p>
     * 
     * @param deleteStackInstancesRequest
     * @return A Java Future containing the result of the DeleteStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeleteStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackInstancesResult> deleteStackInstancesAsync(DeleteStackInstancesRequest deleteStackInstancesRequest);

    /**
     * <p>
     * Deletes stack instances for the specified accounts, in the specified Regions.
     * </p>
     * 
     * @param deleteStackInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeleteStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackInstancesResult> deleteStackInstancesAsync(DeleteStackInstancesRequest deleteStackInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackInstancesRequest, DeleteStackInstancesResult> asyncHandler);

    /**
     * <p>
     * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
     * more information about how to do this, see <a>DeleteStackInstances</a>.
     * </p>
     * 
     * @param deleteStackSetRequest
     * @return A Java Future containing the result of the DeleteStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeleteStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackSetResult> deleteStackSetAsync(DeleteStackSetRequest deleteStackSetRequest);

    /**
     * <p>
     * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
     * more information about how to do this, see <a>DeleteStackInstances</a>.
     * </p>
     * 
     * @param deleteStackSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeleteStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackSetResult> deleteStackSetAsync(DeleteStackSetRequest deleteStackSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackSetRequest, DeleteStackSetResult> asyncHandler);

    /**
     * <p>
     * Marks an extension or extension version as <code>DEPRECATED</code> in the CloudFormation registry, removing it
     * from active use. Deprecated extensions or extension versions cannot be used in CloudFormation operations.
     * </p>
     * <p>
     * To deregister an entire extension, you must individually deregister all active versions of that extension. If an
     * extension has only a single active version, deregistering that version results in the extension itself being
     * deregistered and marked as deprecated in the registry.
     * </p>
     * <p>
     * You cannot deregister the default version of an extension if there are other active version of that extension. If
     * you do deregister the default version of an extension, the textensionype itself is deregistered as well and
     * marked as deprecated.
     * </p>
     * <p>
     * To view the deprecation status of an extension or extension version, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeType.html">DescribeType</a>.
     * </p>
     * 
     * @param deregisterTypeRequest
     * @return A Java Future containing the result of the DeregisterType operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeregisterType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeregisterType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTypeResult> deregisterTypeAsync(DeregisterTypeRequest deregisterTypeRequest);

    /**
     * <p>
     * Marks an extension or extension version as <code>DEPRECATED</code> in the CloudFormation registry, removing it
     * from active use. Deprecated extensions or extension versions cannot be used in CloudFormation operations.
     * </p>
     * <p>
     * To deregister an entire extension, you must individually deregister all active versions of that extension. If an
     * extension has only a single active version, deregistering that version results in the extension itself being
     * deregistered and marked as deprecated in the registry.
     * </p>
     * <p>
     * You cannot deregister the default version of an extension if there are other active version of that extension. If
     * you do deregister the default version of an extension, the textensionype itself is deregistered as well and
     * marked as deprecated.
     * </p>
     * <p>
     * To view the deprecation status of an extension or extension version, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeType.html">DescribeType</a>.
     * </p>
     * 
     * @param deregisterTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterType operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeregisterType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeregisterType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTypeResult> deregisterTypeAsync(DeregisterTypeRequest deregisterTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTypeRequest, DeregisterTypeResult> asyncHandler);

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
     * your account. For more information about account limits, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html">AWS
     * CloudFormation Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
     * your account. For more information about account limits, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html">AWS
     * CloudFormation Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
     * change set. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param describeChangeSetRequest
     *        The input for the <a>DescribeChangeSet</a> action.
     * @return A Java Future containing the result of the DescribeChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest describeChangeSetRequest);

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
     * change set. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param describeChangeSetRequest
     *        The input for the <a>DescribeChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest describeChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
     * stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration, as defined in the
     * stack template and any values specified as template parameters. A stack is considered to have drifted if one or
     * more of its resources have drifted. For more information on stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <a>DetectStackDrift</a> to initiate a stack drift detection operation. <code>DetectStackDrift</code> returns
     * a <code>StackDriftDetectionId</code> you can use to monitor the progress of the operation using
     * <code>DescribeStackDriftDetectionStatus</code>. Once the drift detection operation has completed, use
     * <a>DescribeStackResourceDrifts</a> to return drift information about the stack and its resources.
     * </p>
     * 
     * @param describeStackDriftDetectionStatusRequest
     * @return A Java Future containing the result of the DescribeStackDriftDetectionStatus operation returned by the
     *         service.
     * @sample AmazonCloudFormationAsync.DescribeStackDriftDetectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackDriftDetectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackDriftDetectionStatusResult> describeStackDriftDetectionStatusAsync(
            DescribeStackDriftDetectionStatusRequest describeStackDriftDetectionStatusRequest);

    /**
     * <p>
     * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
     * stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration, as defined in the
     * stack template and any values specified as template parameters. A stack is considered to have drifted if one or
     * more of its resources have drifted. For more information on stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <a>DetectStackDrift</a> to initiate a stack drift detection operation. <code>DetectStackDrift</code> returns
     * a <code>StackDriftDetectionId</code> you can use to monitor the progress of the operation using
     * <code>DescribeStackDriftDetectionStatus</code>. Once the drift detection operation has completed, use
     * <a>DescribeStackResourceDrifts</a> to return drift information about the stack and its resources.
     * </p>
     * 
     * @param describeStackDriftDetectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackDriftDetectionStatus operation returned by the
     *         service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackDriftDetectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackDriftDetectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackDriftDetectionStatusResult> describeStackDriftDetectionStatusAsync(
            DescribeStackDriftDetectionStatusRequest describeStackDriftDetectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackDriftDetectionStatusRequest, DescribeStackDriftDetectionStatusResult> asyncHandler);

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse chronological order. For more information about
     * a stack's event history, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html">Stacks</a> in the AWS
     * CloudFormation User Guide.
     * </p>
     * <note>
     * <p>
     * You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
     * identifier (stack ID).
     * </p>
     * </note>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @return A Java Future containing the result of the DescribeStackEvents operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest describeStackEventsRequest);

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse chronological order. For more information about
     * a stack's event history, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html">Stacks</a> in the AWS
     * CloudFormation User Guide.
     * </p>
     * <note>
     * <p>
     * You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
     * identifier (stack ID).
     * </p>
     * </note>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackEvents operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest describeStackEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler);

    /**
     * <p>
     * Returns the stack instance that's associated with the specified stack set, AWS account, and Region.
     * </p>
     * <p>
     * For a list of stack instances that are associated with a specific stack set, use <a>ListStackInstances</a>.
     * </p>
     * 
     * @param describeStackInstanceRequest
     * @return A Java Future containing the result of the DescribeStackInstance operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackInstanceResult> describeStackInstanceAsync(DescribeStackInstanceRequest describeStackInstanceRequest);

    /**
     * <p>
     * Returns the stack instance that's associated with the specified stack set, AWS account, and Region.
     * </p>
     * <p>
     * For a list of stack instances that are associated with a specific stack set, use <a>ListStackInstances</a>.
     * </p>
     * 
     * @param describeStackInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackInstance operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackInstanceResult> describeStackInstanceAsync(DescribeStackInstanceRequest describeStackInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackInstanceRequest, DescribeStackInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @return A Java Future containing the result of the DescribeStackResource operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest describeStackResourceRequest);

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackResource operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest describeStackResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler);

    /**
     * <p>
     * Returns drift information for the resources that have been checked for drift in the specified stack. This
     * includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
     * drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect
     * drift on all supported resources for a given stack.
     * </p>
     * 
     * @param describeStackResourceDriftsRequest
     * @return A Java Future containing the result of the DescribeStackResourceDrifts operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourceDriftsResult> describeStackResourceDriftsAsync(
            DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest);

    /**
     * <p>
     * Returns drift information for the resources that have been checked for drift in the specified stack. This
     * includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
     * drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect
     * drift on all supported resources for a given stack.
     * </p>
     * 
     * @param describeStackResourceDriftsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackResourceDrifts operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourceDriftsResult> describeStackResourceDriftsAsync(
            DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourceDriftsRequest, DescribeStackResourceDriftsResult> asyncHandler);

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If <code>StackName</code> is specified, all the
     * associated resources that are part of the stack are returned. If <code>PhysicalResourceId</code> is specified,
     * the associated resources of the stack that the resource belongs to are returned.
     * </p>
     * <note>
     * <p>
     * Only the first 100 resources will be returned. If your stack has more resources than this, you should use
     * <code>ListStackResources</code> instead.
     * </p>
     * </note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource information for up to 90 days after the
     * stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or <code>PhysicalResourceId</code>, but not both. In addition, you
     * can specify <code>LogicalResourceId</code> to filter the returned result. For more information about resources,
     * the <code>LogicalResourceId</code> and <code>PhysicalResourceId</code>, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS CloudFormation User Guide</a>.
     * </p>
     * <note>
     * <p>
     * A <code>ValidationError</code> is returned if you specify both <code>StackName</code> and
     * <code>PhysicalResourceId</code> in the same request.
     * </p>
     * </note>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @return A Java Future containing the result of the DescribeStackResources operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest describeStackResourcesRequest);

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If <code>StackName</code> is specified, all the
     * associated resources that are part of the stack are returned. If <code>PhysicalResourceId</code> is specified,
     * the associated resources of the stack that the resource belongs to are returned.
     * </p>
     * <note>
     * <p>
     * Only the first 100 resources will be returned. If your stack has more resources than this, you should use
     * <code>ListStackResources</code> instead.
     * </p>
     * </note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource information for up to 90 days after the
     * stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or <code>PhysicalResourceId</code>, but not both. In addition, you
     * can specify <code>LogicalResourceId</code> to filter the returned result. For more information about resources,
     * the <code>LogicalResourceId</code> and <code>PhysicalResourceId</code>, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS CloudFormation User Guide</a>.
     * </p>
     * <note>
     * <p>
     * A <code>ValidationError</code> is returned if you specify both <code>StackName</code> and
     * <code>PhysicalResourceId</code> in the same request.
     * </p>
     * </note>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackResources operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest describeStackResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns the description of the specified stack set.
     * </p>
     * 
     * @param describeStackSetRequest
     * @return A Java Future containing the result of the DescribeStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSetResult> describeStackSetAsync(DescribeStackSetRequest describeStackSetRequest);

    /**
     * <p>
     * Returns the description of the specified stack set.
     * </p>
     * 
     * @param describeStackSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSetResult> describeStackSetAsync(DescribeStackSetRequest describeStackSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSetRequest, DescribeStackSetResult> asyncHandler);

    /**
     * <p>
     * Returns the description of the specified stack set operation.
     * </p>
     * 
     * @param describeStackSetOperationRequest
     * @return A Java Future containing the result of the DescribeStackSetOperation operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSetOperationResult> describeStackSetOperationAsync(
            DescribeStackSetOperationRequest describeStackSetOperationRequest);

    /**
     * <p>
     * Returns the description of the specified stack set operation.
     * </p>
     * 
     * @param describeStackSetOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackSetOperation operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSetOperationResult> describeStackSetOperationAsync(
            DescribeStackSetOperationRequest describeStackSetOperationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSetOperationRequest, DescribeStackSetOperationResult> asyncHandler);

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was specified, then it returns the description
     * for all the stacks created.
     * </p>
     * <note>
     * <p>
     * If the stack does not exist, an <code>AmazonCloudFormationException</code> is returned.
     * </p>
     * </note>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was specified, then it returns the description
     * for all the stacks created.
     * </p>
     * <note>
     * <p>
     * If the stack does not exist, an <code>AmazonCloudFormationException</code> is returned.
     * </p>
     * </note>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacksAsync(DescribeStacksRequest)
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync();

    /**
     * Simplified method form for invoking the DescribeStacks operation with an AsyncHandler.
     *
     * @see #describeStacksAsync(DescribeStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about an extension that has been registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     * 
     * @param describeTypeRequest
     * @return A Java Future containing the result of the DescribeType operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTypeResult> describeTypeAsync(DescribeTypeRequest describeTypeRequest);

    /**
     * <p>
     * Returns detailed information about an extension that has been registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     * 
     * @param describeTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeType operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTypeResult> describeTypeAsync(DescribeTypeRequest describeTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTypeRequest, DescribeTypeResult> asyncHandler);

    /**
     * <p>
     * Returns information about an extension's registration, including its current status and type and version
     * identifiers.
     * </p>
     * <p>
     * When you initiate a registration request using <code> <a>RegisterType</a> </code>, you can then use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of that registration request.
     * </p>
     * <p>
     * Once the registration request has completed, use <code> <a>DescribeType</a> </code> to return detailed
     * information about an extension.
     * </p>
     * 
     * @param describeTypeRegistrationRequest
     * @return A Java Future containing the result of the DescribeTypeRegistration operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeTypeRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeTypeRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTypeRegistrationResult> describeTypeRegistrationAsync(DescribeTypeRegistrationRequest describeTypeRegistrationRequest);

    /**
     * <p>
     * Returns information about an extension's registration, including its current status and type and version
     * identifiers.
     * </p>
     * <p>
     * When you initiate a registration request using <code> <a>RegisterType</a> </code>, you can then use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of that registration request.
     * </p>
     * <p>
     * Once the registration request has completed, use <code> <a>DescribeType</a> </code> to return detailed
     * information about an extension.
     * </p>
     * 
     * @param describeTypeRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTypeRegistration operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeTypeRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeTypeRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTypeRegistrationResult> describeTypeRegistrationAsync(DescribeTypeRegistrationRequest describeTypeRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTypeRegistrationRequest, DescribeTypeRegistrationResult> asyncHandler);

    /**
     * <p>
     * Detects whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration,
     * as defined in the stack template and any values specified as template parameters. For each resource in the stack
     * that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
     * expected template configuration. Only resource properties explicitly defined in the stack template are checked
     * for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
     * template configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackDrift</code> to detect drift on all supported resources for a given stack, or
     * <a>DetectStackResourceDrift</a> to detect drift on individual resources.
     * </p>
     * <p>
     * For a list of stack resources that currently support drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <code>DetectStackDrift</code> can take up to several minutes, depending on the number of resources contained
     * within the stack. Use <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a detect stack drift
     * operation. Once the drift detection operation has completed, use <a>DescribeStackResourceDrifts</a> to return
     * drift information about the stack and its resources.
     * </p>
     * <p>
     * When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
     * stack. Perform <code>DetectStackDrift</code> directly on the nested stack itself.
     * </p>
     * 
     * @param detectStackDriftRequest
     * @return A Java Future containing the result of the DetectStackDrift operation returned by the service.
     * @sample AmazonCloudFormationAsync.DetectStackDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackDriftResult> detectStackDriftAsync(DetectStackDriftRequest detectStackDriftRequest);

    /**
     * <p>
     * Detects whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration,
     * as defined in the stack template and any values specified as template parameters. For each resource in the stack
     * that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
     * expected template configuration. Only resource properties explicitly defined in the stack template are checked
     * for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
     * template configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackDrift</code> to detect drift on all supported resources for a given stack, or
     * <a>DetectStackResourceDrift</a> to detect drift on individual resources.
     * </p>
     * <p>
     * For a list of stack resources that currently support drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <code>DetectStackDrift</code> can take up to several minutes, depending on the number of resources contained
     * within the stack. Use <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a detect stack drift
     * operation. Once the drift detection operation has completed, use <a>DescribeStackResourceDrifts</a> to return
     * drift information about the stack and its resources.
     * </p>
     * <p>
     * When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
     * stack. Perform <code>DetectStackDrift</code> directly on the nested stack itself.
     * </p>
     * 
     * @param detectStackDriftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectStackDrift operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DetectStackDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackDriftResult> detectStackDriftAsync(DetectStackDriftRequest detectStackDriftRequest,
            com.amazonaws.handlers.AsyncHandler<DetectStackDriftRequest, DetectStackDriftResult> asyncHandler);

    /**
     * <p>
     * Returns information about whether a resource's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. This
     * information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
     * Only resource properties explicitly defined in the stack template are checked for drift. For more information
     * about stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackResourceDrift</code> to detect drift on individual resources, or <a>DetectStackDrift</a> to
     * detect drift on all resources in a given stack that support drift detection.
     * </p>
     * <p>
     * Resources that do not currently support drift detection cannot be checked. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param detectStackResourceDriftRequest
     * @return A Java Future containing the result of the DetectStackResourceDrift operation returned by the service.
     * @sample AmazonCloudFormationAsync.DetectStackResourceDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackResourceDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackResourceDriftResult> detectStackResourceDriftAsync(DetectStackResourceDriftRequest detectStackResourceDriftRequest);

    /**
     * <p>
     * Returns information about whether a resource's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. This
     * information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
     * Only resource properties explicitly defined in the stack template are checked for drift. For more information
     * about stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackResourceDrift</code> to detect drift on individual resources, or <a>DetectStackDrift</a> to
     * detect drift on all resources in a given stack that support drift detection.
     * </p>
     * <p>
     * Resources that do not currently support drift detection cannot be checked. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param detectStackResourceDriftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectStackResourceDrift operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DetectStackResourceDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackResourceDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackResourceDriftResult> detectStackResourceDriftAsync(DetectStackResourceDriftRequest detectStackResourceDriftRequest,
            com.amazonaws.handlers.AsyncHandler<DetectStackResourceDriftRequest, DetectStackResourceDriftResult> asyncHandler);

    /**
     * <p>
     * Detect drift on a stack set. When CloudFormation performs drift detection on a stack set, it performs drift
     * detection on the stack associated with each stack instance in the stack set. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html">How CloudFormation
     * Performs Drift Detection on a Stack Set</a>.
     * </p>
     * <p>
     * <code>DetectStackSetDrift</code> returns the <code>OperationId</code> of the stack set drift detection operation.
     * Use this operation id with <code> <a>DescribeStackSetOperation</a> </code> to monitor the progress of the drift
     * detection operation. The drift detection operation may take some time, depending on the number of stack instances
     * included in the stack set, as well as the number of resources included in each stack.
     * </p>
     * <p>
     * Once the operation has completed, use the following actions to return drift information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackSet</a> </code> to return detailed information about the stack set, including detailed
     * information about the last <i>completed</i> drift operation performed on the stack set. (Information about drift
     * operations that are in progress is not included.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>ListStackInstances</a> </code> to return a list of stack instances belonging to the stack set,
     * including the drift status and last drift time checked of each instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackInstance</a> </code> to return detailed information about a specific stack instance,
     * including its drift status and last drift time checked.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on performing a drift detection operation on a stack set, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html">Detecting Unmanaged
     * Changes in Stack Sets</a>.
     * </p>
     * <p>
     * You can only run a single drift detection operation on a given stack set at one time.
     * </p>
     * <p>
     * To stop a drift detection stack set operation, use <code> <a>StopStackSetOperation</a> </code>.
     * </p>
     * 
     * @param detectStackSetDriftRequest
     * @return A Java Future containing the result of the DetectStackSetDrift operation returned by the service.
     * @sample AmazonCloudFormationAsync.DetectStackSetDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackSetDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackSetDriftResult> detectStackSetDriftAsync(DetectStackSetDriftRequest detectStackSetDriftRequest);

    /**
     * <p>
     * Detect drift on a stack set. When CloudFormation performs drift detection on a stack set, it performs drift
     * detection on the stack associated with each stack instance in the stack set. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html">How CloudFormation
     * Performs Drift Detection on a Stack Set</a>.
     * </p>
     * <p>
     * <code>DetectStackSetDrift</code> returns the <code>OperationId</code> of the stack set drift detection operation.
     * Use this operation id with <code> <a>DescribeStackSetOperation</a> </code> to monitor the progress of the drift
     * detection operation. The drift detection operation may take some time, depending on the number of stack instances
     * included in the stack set, as well as the number of resources included in each stack.
     * </p>
     * <p>
     * Once the operation has completed, use the following actions to return drift information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackSet</a> </code> to return detailed information about the stack set, including detailed
     * information about the last <i>completed</i> drift operation performed on the stack set. (Information about drift
     * operations that are in progress is not included.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>ListStackInstances</a> </code> to return a list of stack instances belonging to the stack set,
     * including the drift status and last drift time checked of each instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackInstance</a> </code> to return detailed information about a specific stack instance,
     * including its drift status and last drift time checked.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on performing a drift detection operation on a stack set, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html">Detecting Unmanaged
     * Changes in Stack Sets</a>.
     * </p>
     * <p>
     * You can only run a single drift detection operation on a given stack set at one time.
     * </p>
     * <p>
     * To stop a drift detection stack set operation, use <code> <a>StopStackSetOperation</a> </code>.
     * </p>
     * 
     * @param detectStackSetDriftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectStackSetDrift operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DetectStackSetDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackSetDrift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectStackSetDriftResult> detectStackSetDriftAsync(DetectStackSetDriftRequest detectStackSetDriftRequest,
            com.amazonaws.handlers.AsyncHandler<DetectStackSetDriftRequest, DetectStackSetDriftResult> asyncHandler);

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
     * query string that describes the resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest
     *        The input for an <a>EstimateTemplateCost</a> action.
     * @return A Java Future containing the result of the EstimateTemplateCost operation returned by the service.
     * @sample AmazonCloudFormationAsync.EstimateTemplateCost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/EstimateTemplateCost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest estimateTemplateCostRequest);

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
     * query string that describes the resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest
     *        The input for an <a>EstimateTemplateCost</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EstimateTemplateCost operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.EstimateTemplateCost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/EstimateTemplateCost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest estimateTemplateCostRequest,
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler);

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest)
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync();

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation with an AsyncHandler.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler);

    /**
     * <p>
     * Updates a stack using the input information that was provided when the specified change set was created. After
     * the call successfully completes, AWS CloudFormation starts updating the stack. Use the <a>DescribeStacks</a>
     * action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
     * they aren't valid for the updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
     * can't specify a temporary stack policy that overrides the current policy.
     * </p>
     * <p>
     * To create a change set for the entire stack hierachy, <code>IncludeNestedStacks</code> must have been set to
     * <code>True</code>.
     * </p>
     * 
     * @param executeChangeSetRequest
     *        The input for the <a>ExecuteChangeSet</a> action.
     * @return A Java Future containing the result of the ExecuteChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.ExecuteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ExecuteChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(ExecuteChangeSetRequest executeChangeSetRequest);

    /**
     * <p>
     * Updates a stack using the input information that was provided when the specified change set was created. After
     * the call successfully completes, AWS CloudFormation starts updating the stack. Use the <a>DescribeStacks</a>
     * action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
     * they aren't valid for the updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
     * can't specify a temporary stack policy that overrides the current policy.
     * </p>
     * <p>
     * To create a change set for the entire stack hierachy, <code>IncludeNestedStacks</code> must have been set to
     * <code>True</code>.
     * </p>
     * 
     * @param executeChangeSetRequest
     *        The input for the <a>ExecuteChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteChangeSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ExecuteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ExecuteChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(ExecuteChangeSetRequest executeChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteChangeSetRequest, ExecuteChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @return A Java Future containing the result of the GetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormationAsync.GetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest getStackPolicyRequest);

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest getStackPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.
     * </p>
     * <note>
     * <p>
     * If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * </note>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonCloudFormationAsync.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.
     * </p>
     * <note>
     * <p>
     * If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * </note>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns information about a new or existing template. The <code>GetTemplateSummary</code> action is useful for
     * viewing parameter information, such as default parameter values and parameter types, before you create or update
     * a stack or stack set.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a template, or you can get template
     * information for a stack set, or a running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template information for up to 90 days after the
     * stack has been deleted. If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @return A Java Future containing the result of the GetTemplateSummary operation returned by the service.
     * @sample AmazonCloudFormationAsync.GetTemplateSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplateSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest getTemplateSummaryRequest);

    /**
     * <p>
     * Returns information about a new or existing template. The <code>GetTemplateSummary</code> action is useful for
     * viewing parameter information, such as default parameter values and parameter types, before you create or update
     * a stack or stack set.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a template, or you can get template
     * information for a stack set, or a running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template information for up to 90 days after the
     * stack has been deleted. If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateSummary operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetTemplateSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplateSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest getTemplateSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest)
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync();

    /**
     * Simplified method form for invoking the GetTemplateSummary operation with an AsyncHandler.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
     * sets that are in the <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * 
     * @param listChangeSetsRequest
     *        The input for the <a>ListChangeSets</a> action.
     * @return A Java Future containing the result of the ListChangeSets operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListChangeSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest listChangeSetsRequest);

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
     * sets that are in the <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * 
     * @param listChangeSetsRequest
     *        The input for the <a>ListChangeSets</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangeSets operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListChangeSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest listChangeSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler);

    /**
     * <p>
     * Lists all exported output values in the account and Region in which you call this action. Use this action to see
     * the exported output values that you can import into other stacks. To import values, use the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"> AWS
     * CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists all exported output values in the account and Region in which you call this action. Use this action to see
     * the exported output values that you can import into other stacks. To import values, use the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"> AWS
     * CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler);

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
     * use this action to see which stacks are using it. To see the exported output values in your account, see
     * <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest);

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
     * use this action to see which stacks are using it. To see the exported output values in your account, see
     * <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about stack instances that are associated with the specified stack set. You can
     * filter for stack instances that are associated with a specific AWS account name or Region, or that have a
     * specific status.
     * </p>
     * 
     * @param listStackInstancesRequest
     * @return A Java Future containing the result of the ListStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackInstancesResult> listStackInstancesAsync(ListStackInstancesRequest listStackInstancesRequest);

    /**
     * <p>
     * Returns summary information about stack instances that are associated with the specified stack set. You can
     * filter for stack instances that are associated with a specific AWS account name or Region, or that have a
     * specific status.
     * </p>
     * 
     * @param listStackInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackInstancesResult> listStackInstancesAsync(ListStackInstancesRequest listStackInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackInstancesRequest, ListStackInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @return A Java Future containing the result of the ListStackResources operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest listStackResourcesRequest);

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackResources operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest listStackResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about the results of a stack set operation.
     * </p>
     * 
     * @param listStackSetOperationResultsRequest
     * @return A Java Future containing the result of the ListStackSetOperationResults operation returned by the
     *         service.
     * @sample AmazonCloudFormationAsync.ListStackSetOperationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperationResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetOperationResultsResult> listStackSetOperationResultsAsync(
            ListStackSetOperationResultsRequest listStackSetOperationResultsRequest);

    /**
     * <p>
     * Returns summary information about the results of a stack set operation.
     * </p>
     * 
     * @param listStackSetOperationResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackSetOperationResults operation returned by the
     *         service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackSetOperationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperationResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetOperationResultsResult> listStackSetOperationResultsAsync(
            ListStackSetOperationResultsRequest listStackSetOperationResultsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackSetOperationResultsRequest, ListStackSetOperationResultsResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about operations performed on a stack set.
     * </p>
     * 
     * @param listStackSetOperationsRequest
     * @return A Java Future containing the result of the ListStackSetOperations operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStackSetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetOperationsResult> listStackSetOperationsAsync(ListStackSetOperationsRequest listStackSetOperationsRequest);

    /**
     * <p>
     * Returns summary information about operations performed on a stack set.
     * </p>
     * 
     * @param listStackSetOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackSetOperations operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackSetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetOperationsResult> listStackSetOperationsAsync(ListStackSetOperationsRequest listStackSetOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackSetOperationsRequest, ListStackSetOperationsResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about stack sets that are associated with the user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * [Self-managed permissions] If you set the <code>CallAs</code> parameter to <code>SELF</code> while signed in to
     * your AWS account, <code>ListStackSets</code> returns all self-managed stack sets in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * [Service-managed permissions] If you set the <code>CallAs</code> parameter to <code>SELF</code> while signed in
     * to the organization's management account, <code>ListStackSets</code> returns all stack sets in the management
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * [Service-managed permissions] If you set the <code>CallAs</code> parameter to <code>DELEGATED_ADMIN</code> while
     * signed in to your member account, <code>ListStackSets</code> returns all stack sets with service-managed
     * permissions in the management account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listStackSetsRequest
     * @return A Java Future containing the result of the ListStackSets operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStackSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetsResult> listStackSetsAsync(ListStackSetsRequest listStackSetsRequest);

    /**
     * <p>
     * Returns summary information about stack sets that are associated with the user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * [Self-managed permissions] If you set the <code>CallAs</code> parameter to <code>SELF</code> while signed in to
     * your AWS account, <code>ListStackSets</code> returns all self-managed stack sets in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * [Service-managed permissions] If you set the <code>CallAs</code> parameter to <code>SELF</code> while signed in
     * to the organization's management account, <code>ListStackSets</code> returns all stack sets in the management
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * [Service-managed permissions] If you set the <code>CallAs</code> parameter to <code>DELEGATED_ADMIN</code> while
     * signed in to your member account, <code>ListStackSets</code> returns all stack sets with service-managed
     * permissions in the management account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listStackSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackSets operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStackSetsResult> listStackSetsAsync(ListStackSetsRequest listStackSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackSetsRequest, ListStackSetsResult> asyncHandler);

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
     * information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
     * stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @return A Java Future containing the result of the ListStacks operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(ListStacksRequest listStacksRequest);

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
     * information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
     * stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStacks operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(ListStacksRequest listStacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacksAsync(ListStacksRequest)
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync();

    /**
     * Simplified method form for invoking the ListStacks operation with an AsyncHandler.
     *
     * @see #listStacksAsync(ListStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler);

    /**
     * <p>
     * Returns a list of registration tokens for the specified extension(s).
     * </p>
     * 
     * @param listTypeRegistrationsRequest
     * @return A Java Future containing the result of the ListTypeRegistrations operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListTypeRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypeRegistrationsResult> listTypeRegistrationsAsync(ListTypeRegistrationsRequest listTypeRegistrationsRequest);

    /**
     * <p>
     * Returns a list of registration tokens for the specified extension(s).
     * </p>
     * 
     * @param listTypeRegistrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypeRegistrations operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListTypeRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypeRegistrationsResult> listTypeRegistrationsAsync(ListTypeRegistrationsRequest listTypeRegistrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypeRegistrationsRequest, ListTypeRegistrationsResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about the versions of an extension.
     * </p>
     * 
     * @param listTypeVersionsRequest
     * @return A Java Future containing the result of the ListTypeVersions operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypeVersionsResult> listTypeVersionsAsync(ListTypeVersionsRequest listTypeVersionsRequest);

    /**
     * <p>
     * Returns summary information about the versions of an extension.
     * </p>
     * 
     * @param listTypeVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypeVersions operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypeVersionsResult> listTypeVersionsAsync(ListTypeVersionsRequest listTypeVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypeVersionsRequest, ListTypeVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about extension that have been registered with CloudFormation.
     * </p>
     * 
     * @param listTypesRequest
     * @return A Java Future containing the result of the ListTypes operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTypesResult> listTypesAsync(ListTypesRequest listTypesRequest);

    /**
     * <p>
     * Returns summary information about extension that have been registered with CloudFormation.
     * </p>
     * 
     * @param listTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypes operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTypesResult> listTypesAsync(ListTypesRequest listTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypesRequest, ListTypesResult> asyncHandler);

    /**
     * <p>
     * Reports progress of a resource handler to CloudFormation.
     * </p>
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>. Do not use this API in your code.
     * </p>
     * 
     * @param recordHandlerProgressRequest
     * @return A Java Future containing the result of the RecordHandlerProgress operation returned by the service.
     * @sample AmazonCloudFormationAsync.RecordHandlerProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RecordHandlerProgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecordHandlerProgressResult> recordHandlerProgressAsync(RecordHandlerProgressRequest recordHandlerProgressRequest);

    /**
     * <p>
     * Reports progress of a resource handler to CloudFormation.
     * </p>
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>. Do not use this API in your code.
     * </p>
     * 
     * @param recordHandlerProgressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecordHandlerProgress operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.RecordHandlerProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RecordHandlerProgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecordHandlerProgressResult> recordHandlerProgressAsync(RecordHandlerProgressRequest recordHandlerProgressRequest,
            com.amazonaws.handlers.AsyncHandler<RecordHandlerProgressRequest, RecordHandlerProgressResult> asyncHandler);

    /**
     * <p>
     * Registers an extension with the CloudFormation service. Registering an extension makes it available for use in
     * CloudFormation templates in your AWS account, and includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Validating the extension schema
     * </p>
     * </li>
     * <li>
     * <p>
     * Determining which handlers, if any, have been specified for the extension
     * </p>
     * </li>
     * <li>
     * <p>
     * Making the extension available for use in your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to develop extensions and ready them for registeration, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html">Creating Resource
     * Providers</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <p>
     * You can have a maximum of 50 resource extension versions registered at a time. This maximum is per account and
     * per region. Use <a href="AWSCloudFormation/latest/APIReference/API_DeregisterType.html">DeregisterType</a> to
     * deregister specific extension versions if necessary.
     * </p>
     * <p>
     * Once you have initiated a registration request using <code> <a>RegisterType</a> </code>, you can use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of the registration request.
     * </p>
     * 
     * @param registerTypeRequest
     * @return A Java Future containing the result of the RegisterType operation returned by the service.
     * @sample AmazonCloudFormationAsync.RegisterType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RegisterType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTypeResult> registerTypeAsync(RegisterTypeRequest registerTypeRequest);

    /**
     * <p>
     * Registers an extension with the CloudFormation service. Registering an extension makes it available for use in
     * CloudFormation templates in your AWS account, and includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Validating the extension schema
     * </p>
     * </li>
     * <li>
     * <p>
     * Determining which handlers, if any, have been specified for the extension
     * </p>
     * </li>
     * <li>
     * <p>
     * Making the extension available for use in your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to develop extensions and ready them for registeration, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html">Creating Resource
     * Providers</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <p>
     * You can have a maximum of 50 resource extension versions registered at a time. This maximum is per account and
     * per region. Use <a href="AWSCloudFormation/latest/APIReference/API_DeregisterType.html">DeregisterType</a> to
     * deregister specific extension versions if necessary.
     * </p>
     * <p>
     * Once you have initiated a registration request using <code> <a>RegisterType</a> </code>, you can use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of the registration request.
     * </p>
     * 
     * @param registerTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterType operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.RegisterType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RegisterType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTypeResult> registerTypeAsync(RegisterTypeRequest registerTypeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTypeRequest, RegisterTypeResult> asyncHandler);

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @return A Java Future containing the result of the SetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormationAsync.SetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(SetStackPolicyRequest setStackPolicyRequest);

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.SetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(SetStackPolicyRequest setStackPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetStackPolicyRequest, SetStackPolicyResult> asyncHandler);

    /**
     * <p>
     * Specify the default version of an extension. The default version of an extension will be used in CloudFormation
     * operations.
     * </p>
     * 
     * @param setTypeDefaultVersionRequest
     * @return A Java Future containing the result of the SetTypeDefaultVersion operation returned by the service.
     * @sample AmazonCloudFormationAsync.SetTypeDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetTypeDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTypeDefaultVersionResult> setTypeDefaultVersionAsync(SetTypeDefaultVersionRequest setTypeDefaultVersionRequest);

    /**
     * <p>
     * Specify the default version of an extension. The default version of an extension will be used in CloudFormation
     * operations.
     * </p>
     * 
     * @param setTypeDefaultVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTypeDefaultVersion operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.SetTypeDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetTypeDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTypeDefaultVersionResult> setTypeDefaultVersionAsync(SetTypeDefaultVersionRequest setTypeDefaultVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SetTypeDefaultVersionRequest, SetTypeDefaultVersionResult> asyncHandler);

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
     * conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
     * update until resources receive the required number of signals or the timeout period is exceeded. The
     * SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
     * instance.
     * </p>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @return A Java Future containing the result of the SignalResource operation returned by the service.
     * @sample AmazonCloudFormationAsync.SignalResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SignalResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(SignalResourceRequest signalResourceRequest);

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
     * conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
     * update until resources receive the required number of signals or the timeout period is exceeded. The
     * SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
     * instance.
     * </p>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SignalResource operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.SignalResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SignalResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(SignalResourceRequest signalResourceRequest,
            com.amazonaws.handlers.AsyncHandler<SignalResourceRequest, SignalResourceResult> asyncHandler);

    /**
     * <p>
     * Stops an in-progress operation on a stack set and its associated stack instances.
     * </p>
     * 
     * @param stopStackSetOperationRequest
     * @return A Java Future containing the result of the StopStackSetOperation operation returned by the service.
     * @sample AmazonCloudFormationAsync.StopStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StopStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopStackSetOperationResult> stopStackSetOperationAsync(StopStackSetOperationRequest stopStackSetOperationRequest);

    /**
     * <p>
     * Stops an in-progress operation on a stack set and its associated stack instances.
     * </p>
     * 
     * @param stopStackSetOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopStackSetOperation operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.StopStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StopStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopStackSetOperationResult> stopStackSetOperationAsync(StopStackSetOperationRequest stopStackSetOperationRequest,
            com.amazonaws.handlers.AsyncHandler<StopStackSetOperationRequest, StopStackSetOperationResult> asyncHandler);

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
     * can check the status of the stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack, and monitoring the progress of the
     * update, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">Updating a
     * Stack</a>.
     * </p>
     * 
     * @param updateStackRequest
     *        The input for an <a>UpdateStack</a> action.
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonCloudFormationAsync.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
     * can check the status of the stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack, and monitoring the progress of the
     * update, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">Updating a
     * Stack</a>.
     * </p>
     * 
     * @param updateStackRequest
     *        The input for an <a>UpdateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler);

    /**
     * <p>
     * Updates the parameter values for stack instances for the specified accounts, within the specified Regions. A
     * stack instance refers to a stack in a specific account and Region.
     * </p>
     * <p>
     * You can only update stack instances in Regions and accounts where they already exist; to create additional stack
     * instances, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
     * >CreateStackInstances</a>.
     * </p>
     * <p>
     * During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only update the parameter <i>values</i> that are specified in the stack set; to add or delete a parameter
     * itself, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">UpdateStackSet
     * </a> to update the stack set template. If you add a parameter to a template, before you can override the
     * parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param updateStackInstancesRequest
     * @return A Java Future containing the result of the UpdateStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsync.UpdateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackInstancesResult> updateStackInstancesAsync(UpdateStackInstancesRequest updateStackInstancesRequest);

    /**
     * <p>
     * Updates the parameter values for stack instances for the specified accounts, within the specified Regions. A
     * stack instance refers to a stack in a specific account and Region.
     * </p>
     * <p>
     * You can only update stack instances in Regions and accounts where they already exist; to create additional stack
     * instances, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
     * >CreateStackInstances</a>.
     * </p>
     * <p>
     * During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only update the parameter <i>values</i> that are specified in the stack set; to add or delete a parameter
     * itself, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">UpdateStackSet
     * </a> to update the stack set template. If you add a parameter to a template, before you can override the
     * parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param updateStackInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStackInstances operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.UpdateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackInstancesResult> updateStackInstancesAsync(UpdateStackInstancesRequest updateStackInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackInstancesRequest, UpdateStackInstancesResult> asyncHandler);

    /**
     * <p>
     * Updates the stack set, and associated stack instances in the specified accounts and Regions.
     * </p>
     * <p>
     * Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
     * a specified failure tolerance), the stack set is updated with your changes. Subsequent
     * <a>CreateStackInstances</a> calls on the specified stack set use the updated stack set.
     * </p>
     * 
     * @param updateStackSetRequest
     * @return A Java Future containing the result of the UpdateStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsync.UpdateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackSetResult> updateStackSetAsync(UpdateStackSetRequest updateStackSetRequest);

    /**
     * <p>
     * Updates the stack set, and associated stack instances in the specified accounts and Regions.
     * </p>
     * <p>
     * Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
     * a specified failure tolerance), the stack set is updated with your changes. Subsequent
     * <a>CreateStackInstances</a> calls on the specified stack set use the updated stack set.
     * </p>
     * 
     * @param updateStackSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStackSet operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.UpdateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackSetResult> updateStackSetAsync(UpdateStackSetRequest updateStackSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackSetRequest, UpdateStackSetResult> asyncHandler);

    /**
     * <p>
     * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
     * protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * </p>
     * 
     * @param updateTerminationProtectionRequest
     * @return A Java Future containing the result of the UpdateTerminationProtection operation returned by the service.
     * @sample AmazonCloudFormationAsync.UpdateTerminationProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTerminationProtectionResult> updateTerminationProtectionAsync(
            UpdateTerminationProtectionRequest updateTerminationProtectionRequest);

    /**
     * <p>
     * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
     * protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * </p>
     * 
     * @param updateTerminationProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTerminationProtection operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.UpdateTerminationProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTerminationProtectionResult> updateTerminationProtectionAsync(
            UpdateTerminationProtectionRequest updateTerminationProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTerminationProtectionRequest, UpdateTerminationProtectionResult> asyncHandler);

    /**
     * <p>
     * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
     * CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
     * template validation error.
     * </p>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @return A Java Future containing the result of the ValidateTemplate operation returned by the service.
     * @sample AmazonCloudFormationAsync.ValidateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ValidateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest validateTemplateRequest);

    /**
     * <p>
     * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
     * CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
     * template validation error.
     * </p>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateTemplate operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ValidateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ValidateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest validateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler);

}
