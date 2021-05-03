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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStackInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack instances for.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accounts;
    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     */
    private DeploymentTargets deploymentTargets;
    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a
     * retained stack or add an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     */
    private Boolean retainStacks;
    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You can retry stack set operation requests to
     * ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack instances for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to delete stack instances for.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack instances for.
     * </p>
     * 
     * @return The name or unique ID of the stack set that you want to delete stack instances for.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack instances for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to delete stack instances for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @return [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.</p>
     *         <p>
     *         You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     */

    public java.util.List<String> getAccounts() {
        if (accounts == null) {
            accounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accounts;
    }

    /**
     * <p>
     * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.</p>
     *        <p>
     *        You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new com.amazonaws.internal.SdkInternalList<String>(accounts);
    }

    /**
     * <p>
     * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.</p>
     *        <p>
     *        You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new com.amazonaws.internal.SdkInternalList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for.</p>
     *        <p>
     *        You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @param deploymentTargets
     *        [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.</p>
     *        <p>
     *        You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     */

    public void setDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @return [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.</p>
     *         <p>
     *         You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     */

    public DeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * </p>
     * 
     * @param deploymentTargets
     *        [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances.</p>
     *        <p>
     *        You can specify <code>Accounts</code> or <code>DeploymentTargets</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withDeploymentTargets(DeploymentTargets deploymentTargets) {
        setDeploymentTargets(deploymentTargets);
        return this;
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     * 
     * @return The Regions where you want to delete stack set instances.
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     * 
     * @param regions
     *        The Regions where you want to delete stack set instances.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The Regions where you want to delete stack set instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     * 
     * @param regions
     *        The Regions where you want to delete stack set instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @return Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a
     * retained stack or add an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * 
     * @param retainStacks
     *        Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't
     *        reassociate a retained stack or add an existing, saved stack to a new stack set.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *        >Stack set operation options</a>.
     */

    public void setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a
     * retained stack or add an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * 
     * @return Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't
     *         reassociate a retained stack or add an existing, saved stack to a new stack set.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *         >Stack set operation options</a>.
     */

    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a
     * retained stack or add an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * 
     * @param retainStacks
     *        Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't
     *        reassociate a retained stack or add an existing, saved stack to a new stack set.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *        >Stack set operation options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withRetainStacks(Boolean retainStacks) {
        setRetainStacks(retainStacks);
        return this;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a
     * retained stack or add an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * 
     * @return Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't
     *         reassociate a retained stack or add an existing, saved stack to a new stack set.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *         >Stack set operation options</a>.
     */

    public Boolean isRetainStacks() {
        return this.retainStacks;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You can retry stack set operation requests to
     * ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @param operationId
     *        The unique identifier for this stack set operation. </p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     *        </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You can retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *        <code>OUTDATED</code>.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You can retry stack set operation requests to
     * ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @return The unique identifier for this stack set operation. </p>
     *         <p>
     *         If you don't specify an operation ID, the SDK generates one automatically.
     *         </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *         stack set operation only once, even if you retry the request multiple times. You can retry stack set
     *         operation requests to ensure that AWS CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *         <code>OUTDATED</code>.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You can retry stack set operation requests to
     * ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @param operationId
     *        The unique identifier for this stack set operation. </p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     *        </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You can retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *        <code>OUTDATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackInstancesRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *         organization's management account or as a delegated administrator in a member account.</p>
     *         <p>
     *         By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         <p>
     *         Your AWS account must be registered as a delegated administrator in the management account. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *         >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public DeleteStackInstancesRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public DeleteStackInstancesRequest withCallAs(CallAs callAs) {
        this.callAs = callAs.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: ").append(getDeploymentTargets()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
        if (getRetainStacks() != null)
            sb.append("RetainStacks: ").append(getRetainStacks()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getCallAs() != null)
            sb.append("CallAs: ").append(getCallAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStackInstancesRequest == false)
            return false;
        DeleteStackInstancesRequest other = (DeleteStackInstancesRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getRetainStacks() == null ^ this.getRetainStacks() == null)
            return false;
        if (other.getRetainStacks() != null && other.getRetainStacks().equals(this.getRetainStacks()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getCallAs() == null ^ this.getCallAs() == null)
            return false;
        if (other.getCallAs() != null && other.getCallAs().equals(this.getCallAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getRetainStacks() == null) ? 0 : getRetainStacks().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStackInstancesRequest clone() {
        return (DeleteStackInstancesRequest) super.clone();
    }

}
