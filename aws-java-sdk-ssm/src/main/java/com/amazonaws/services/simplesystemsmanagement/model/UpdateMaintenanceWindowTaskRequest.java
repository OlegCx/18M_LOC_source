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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The task ID to modify.
     * </p>
     */
    private String windowTaskId;
    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified using
     * Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     * </p>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The task ARN to modify.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do
     * not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked
     * role for Systems Manager exists in your account, it is created when you run
     * <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The parameters to modify.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;
    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
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
     */
    private MaintenanceWindowTaskInvocationParameters taskInvocationParameters;
    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number of
     * targets that are allowed to run this task in parallel.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors that are
     * allowed before the task stops being scheduled.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     */
    private String maxErrors;
    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     */
    private LoggingInfo loggingInfo;
    /**
     * <p>
     * The new task name to specify.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new task description to specify.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also required for
     * this API request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * 
     * @param windowId
     *        The maintenance window ID that contains the task to modify.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * 
     * @return The maintenance window ID that contains the task to modify.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * 
     * @param windowId
     *        The maintenance window ID that contains the task to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The task ID to modify.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID to modify.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The task ID to modify.
     * </p>
     * 
     * @return The task ID to modify.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The task ID to modify.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withWindowTaskId(String windowTaskId) {
        setWindowTaskId(windowTaskId);
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified using
     * Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     * </p>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The targets (either instances or tags) to modify. Instances are specified using
     *         Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     *         </p> <note>
     *         <p>
     *         One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the
     *         task, targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step
     *         Functions). For more information about running tasks that do not specify targets, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     *         >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified using
     * Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     * </p>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param targets
     *        The targets (either instances or tags) to modify. Instances are specified using
     *        Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     *        </p> <note>
     *        <p>
     *        One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the
     *        task, targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step
     *        Functions). For more information about running tasks that do not specify targets, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     *        >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified using
     * Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     * </p>
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) to modify. Instances are specified using
     *        Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     *        </p> <note>
     *        <p>
     *        One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the
     *        task, targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step
     *        Functions). For more information about running tasks that do not specify targets, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     *        >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified using
     * Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     * </p>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions).
     * For more information about running tasks that do not specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param targets
     *        The targets (either instances or tags) to modify. Instances are specified using
     *        Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value.
     *        </p> <note>
     *        <p>
     *        One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the
     *        task, targets are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step
     *        Functions). For more information about running tasks that do not specify targets, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     *        >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * 
     * @param taskArn
     *        The task ARN to modify.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * 
     * @return The task ARN to modify.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * 
     * @param taskArn
     *        The task ARN to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do
     * not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked
     * role for Systems Manager exists in your account, it is created when you run
     * <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceRoleArn
     *        The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If
     *        you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no
     *        service-linked role for Systems Manager exists in your account, it is created when you run
     *        <code>RegisterTaskWithMaintenanceWindow</code>.</p>
     *        <p>
     *        For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *        >Using service-linked roles for Systems Manager</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *        >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     *        </p>
     *        </li>
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do
     * not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked
     * role for Systems Manager exists in your account, it is created when you run
     * <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If
     *         you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no
     *         service-linked role for Systems Manager exists in your account, it is created when you run
     *         <code>RegisterTaskWithMaintenanceWindow</code>.</p>
     *         <p>
     *         For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *         >Using service-linked roles for Systems Manager</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *         >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     *         </p>
     *         </li>
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do
     * not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked
     * role for Systems Manager exists in your account, it is created when you run
     * <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceRoleArn
     *        The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If
     *        you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no
     *        service-linked role for Systems Manager exists in your account, it is created when you run
     *        <code>RegisterTaskWithMaintenanceWindow</code>.</p>
     *        <p>
     *        For more information, see the following topics in the in the <i>AWS Systems Manager User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *        >Using service-linked roles for Systems Manager</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *        >Should I use a service-linked role or a custom service role to run maintenance window tasks? </a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The parameters to modify.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @return The parameters to modify.</p> <note>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *         instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure.
     *         For information about how Systems Manager handles these options for the supported maintenance window task
     *         types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         </note>
     *         <p>
     *         The map has the following format:
     *         </p>
     *         <p>
     *         Key: string, between 1 and 255 characters
     *         </p>
     *         <p>
     *         Value: an array of strings, each string is between 1 and 255 characters
     */

    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters to modify.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @param taskParameters
     *        The parameters to modify.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported maintenance window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The map has the following format:
     *        </p>
     *        <p>
     *        Key: string, between 1 and 255 characters
     *        </p>
     *        <p>
     *        Value: an array of strings, each string is between 1 and 255 characters
     */

    public void setTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters to modify.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @param taskParameters
     *        The parameters to modify.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported maintenance window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The map has the following format:
     *        </p>
     *        <p>
     *        Key: string, between 1 and 255 characters
     *        </p>
     *        <p>
     *        Value: an array of strings, each string is between 1 and 255 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    /**
     * Add a single TaskParameters entry
     *
     * @see UpdateMaintenanceWindowTaskRequest#withTaskParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
        if (null == this.taskParameters) {
            this.taskParameters = new java.util.HashMap<String, MaintenanceWindowTaskParameterValueExpression>();
        }
        if (this.taskParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
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
     * @param taskInvocationParameters
     *        The parameters that the task should use during execution. Populate only the fields that match the task
     *        type. All other fields should be empty.</p> <important>
     *        <p>
     *        When you update a maintenance window task that has options specified in
     *        <code>TaskInvocationParameters</code>, you must provide again all the
     *        <code>TaskInvocationParameters</code> values that you want to retain. The values you do not specify again
     *        are removed. For example, suppose that when you registered a Run Command task, you specified
     *        <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     *        and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a
     *        different <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and
     *        <code>NotificationConfig</code> are removed.
     *        </p>
     */

    public void setTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
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
     * @return The parameters that the task should use during execution. Populate only the fields that match the task
     *         type. All other fields should be empty.</p> <important>
     *         <p>
     *         When you update a maintenance window task that has options specified in
     *         <code>TaskInvocationParameters</code>, you must provide again all the
     *         <code>TaskInvocationParameters</code> values that you want to retain. The values you do not specify again
     *         are removed. For example, suppose that when you registered a Run Command task, you specified
     *         <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     *         and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a
     *         different <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and
     *         <code>NotificationConfig</code> are removed.
     *         </p>
     */

    public MaintenanceWindowTaskInvocationParameters getTaskInvocationParameters() {
        return this.taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
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
     * @param taskInvocationParameters
     *        The parameters that the task should use during execution. Populate only the fields that match the task
     *        type. All other fields should be empty.</p> <important>
     *        <p>
     *        When you update a maintenance window task that has options specified in
     *        <code>TaskInvocationParameters</code>, you must provide again all the
     *        <code>TaskInvocationParameters</code> values that you want to retain. The values you do not specify again
     *        are removed. For example, suppose that when you registered a Run Command task, you specified
     *        <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     *        and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a
     *        different <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and
     *        <code>NotificationConfig</code> are removed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        setTaskInvocationParameters(taskInvocationParameters);
        return this;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     *        priority are scheduled in parallel.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @return The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     *         priority are scheduled in parallel.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same
     *        priority are scheduled in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number of
     * targets that are allowed to run this task in parallel.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @param maxConcurrency
     *        The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number
     *        of targets that are allowed to run this task in parallel.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number of
     * targets that are allowed to run this task in parallel.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @return The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number
     *         of targets that are allowed to run this task in parallel.</p> <note>
     *         <p>
     *         For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *         Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *         to this command. This value does not affect the running of your task and can be ignored.
     *         </p>
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number of
     * targets that are allowed to run this task in parallel.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @param maxConcurrency
     *        The new <code>MaxConcurrency</code> value you want to specify. <code>MaxConcurrency</code> is the number
     *        of targets that are allowed to run this task in parallel.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors that are
     * allowed before the task stops being scheduled.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @param maxErrors
     *        The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors
     *        that are allowed before the task stops being scheduled.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors that are
     * allowed before the task stops being scheduled.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @return The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors
     *         that are allowed before the task stops being scheduled.</p> <note>
     *         <p>
     *         For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *         Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *         to this command. This value does not affect the running of your task and can be ignored.
     *         </p>
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors that are
     * allowed before the task stops being scheduled.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @param maxErrors
     *        The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code> is the maximum number of errors
     *        that are allowed before the task stops being scheduled.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param loggingInfo
     *        The new logging location in Amazon S3 to specify.</p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported maintenance window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @return The new logging location in Amazon S3 to specify.</p> <note>
     *         <p>
     *         <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *         <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *         <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *         options for the supported maintenance window task types, see
     *         <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param loggingInfo
     *        The new logging location in Amazon S3 to specify.</p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported maintenance window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * The new task name to specify.
     * </p>
     * 
     * @param name
     *        The new task name to specify.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new task name to specify.
     * </p>
     * 
     * @return The new task name to specify.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new task name to specify.
     * </p>
     * 
     * @param name
     *        The new task name to specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * 
     * @param description
     *        The new task description to specify.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * 
     * @return The new task description to specify.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * 
     * @param description
     *        The new task description to specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also required for
     * this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also
     *        required for this API request. Optional fields that are not specified are set to null.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also required for
     * this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also
     *         required for this API request. Optional fields that are not specified are set to null.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also required for
     * this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also
     *        required for this API request. Optional fields that are not specified are set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskRequest withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also required for
     * this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the RegisterTaskWithMaintenanceWindow action are also
     *         required for this API request. Optional fields that are not specified are set to null.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTaskId() != null)
            sb.append("WindowTaskId: ").append(getWindowTaskId()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getTaskInvocationParameters() != null)
            sb.append("TaskInvocationParameters: ").append(getTaskInvocationParameters()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowTaskRequest == false)
            return false;
        UpdateMaintenanceWindowTaskRequest other = (UpdateMaintenanceWindowTaskRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getTaskInvocationParameters() == null ^ this.getTaskInvocationParameters() == null)
            return false;
        if (other.getTaskInvocationParameters() != null && other.getTaskInvocationParameters().equals(this.getTaskInvocationParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getTaskInvocationParameters() == null) ? 0 : getTaskInvocationParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMaintenanceWindowTaskRequest clone() {
        return (UpdateMaintenanceWindowTaskRequest) super.clone();
    }

}
