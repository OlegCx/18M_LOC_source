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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved maintenance window ID.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The retrieved maintenance window task ID.
     * </p>
     */
    private String windowTaskId;
    /**
     * <p>
     * The targets where the task should run.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the
     * Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTIONS
     * tasks, the value is the state machine ARN.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
     * for maintenance window Run Command tasks.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The type of task to run.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;
    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     */
    private MaintenanceWindowTaskInvocationParameters taskInvocationParameters;
    /**
     * <p>
     * The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel.
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
     * The maximum number of errors allowed before the task stops being scheduled.
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
     * The location in Amazon S3 where the task results are logged.
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
     * The retrieved task name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The retrieved task description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The retrieved maintenance window ID.
     * </p>
     * 
     * @param windowId
     *        The retrieved maintenance window ID.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The retrieved maintenance window ID.
     * </p>
     * 
     * @return The retrieved maintenance window ID.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The retrieved maintenance window ID.
     * </p>
     * 
     * @param windowId
     *        The retrieved maintenance window ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The retrieved maintenance window task ID.
     * </p>
     * 
     * @param windowTaskId
     *        The retrieved maintenance window task ID.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The retrieved maintenance window task ID.
     * </p>
     * 
     * @return The retrieved maintenance window task ID.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The retrieved maintenance window task ID.
     * </p>
     * 
     * @param windowTaskId
     *        The retrieved maintenance window task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withWindowTaskId(String windowTaskId) {
        setWindowTaskId(windowTaskId);
        return this;
    }

    /**
     * <p>
     * The targets where the task should run.
     * </p>
     * 
     * @return The targets where the task should run.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets where the task should run.
     * </p>
     * 
     * @param targets
     *        The targets where the task should run.
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
     * The targets where the task should run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets where the task should run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withTargets(Target... targets) {
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
     * The targets where the task should run.
     * </p>
     * 
     * @param targets
     *        The targets where the task should run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the
     * Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTIONS
     * tasks, the value is the state machine ARN.
     * </p>
     * 
     * @param taskArn
     *        The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn
     *        is the Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For
     *        STEP_FUNCTIONS tasks, the value is the state machine ARN.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the
     * Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTIONS
     * tasks, the value is the state machine ARN.
     * </p>
     * 
     * @return The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn
     *         is the Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For
     *         STEP_FUNCTIONS tasks, the value is the state machine ARN.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the
     * Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTIONS
     * tasks, the value is the state machine ARN.
     * </p>
     * 
     * @param taskArn
     *        The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn
     *        is the Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For
     *        STEP_FUNCTIONS tasks, the value is the state machine ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
     * for maintenance window Run Command tasks.
     * </p>
     * 
     * @param serviceRoleArn
     *        The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     *        notifications for maintenance window Run Command tasks.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
     * for maintenance window Run Command tasks.
     * </p>
     * 
     * @return The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     *         notifications for maintenance window Run Command tasks.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
     * for maintenance window Run Command tasks.
     * </p>
     * 
     * @param serviceRoleArn
     *        The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     *        notifications for maintenance window Run Command tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The type of task to run.
     * </p>
     * 
     * @param taskType
     *        The type of task to run.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task to run.
     * </p>
     * 
     * @return The type of task to run.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of task to run.
     * </p>
     * 
     * @param taskType
     *        The type of task to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowTaskResult withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of task to run.
     * </p>
     * 
     * @param taskType
     *        The type of task to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowTaskResult withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @return The parameters to pass to the task when it runs.</p> <note>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *         instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure.
     *         For information about how Systems Manager handles these options for the supported maintenance window task
     *         types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     */

    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param taskParameters
     *        The parameters to pass to the task when it runs.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported maintenance window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     */

    public void setTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param taskParameters
     *        The parameters to pass to the task when it runs.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported maintenance window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    /**
     * Add a single TaskParameters entry
     *
     * @see GetMaintenanceWindowTaskResult#withTaskParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
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

    public GetMaintenanceWindowTaskResult clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The parameters to pass to the task when it runs.
     */

    public void setTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * 
     * @return The parameters to pass to the task when it runs.
     */

    public MaintenanceWindowTaskInvocationParameters getTaskInvocationParameters() {
        return this.taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters to pass to the task when it runs.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The parameters to pass to the task when it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        setTaskInvocationParameters(taskInvocationParameters);
        return this;
    }

    /**
     * <p>
     * The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the
     *        same priority are scheduled in parallel.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @return The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the
     *         same priority are scheduled in parallel.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the same
     * priority are scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the
     *        same priority are scheduled in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel.
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
     *        The maximum number of targets allowed to run this task in parallel.</p> <note>
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
     * The maximum number of targets allowed to run this task in parallel.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @return The maximum number of targets allowed to run this task in parallel.</p> <note>
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
     * The maximum number of targets allowed to run this task in parallel.
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
     *        The maximum number of targets allowed to run this task in parallel.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed before the task stops being scheduled.
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
     *        The maximum number of errors allowed before the task stops being scheduled.</p> <note>
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
     * The maximum number of errors allowed before the task stops being scheduled.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a target specified, you cannot supply a value for this option. Instead, the
     * system inserts a placeholder value of <code>1</code>, which may be reported in the response to this command. This
     * value does not affect the running of your task and can be ignored.
     * </p>
     * </note>
     * 
     * @return The maximum number of errors allowed before the task stops being scheduled.</p> <note>
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
     * The maximum number of errors allowed before the task stops being scheduled.
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
     *        The maximum number of errors allowed before the task stops being scheduled.</p> <note>
     *        <p>
     *        For maintenance window tasks without a target specified, you cannot supply a value for this option.
     *        Instead, the system inserts a placeholder value of <code>1</code>, which may be reported in the response
     *        to this command. This value does not affect the running of your task and can be ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where the task results are logged.
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
     *        The location in Amazon S3 where the task results are logged.</p> <note>
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
     * The location in Amazon S3 where the task results are logged.
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
     * @return The location in Amazon S3 where the task results are logged.</p> <note>
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
     * The location in Amazon S3 where the task results are logged.
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
     *        The location in Amazon S3 where the task results are logged.</p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported maintenance window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * The retrieved task name.
     * </p>
     * 
     * @param name
     *        The retrieved task name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The retrieved task name.
     * </p>
     * 
     * @return The retrieved task name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The retrieved task name.
     * </p>
     * 
     * @param name
     *        The retrieved task name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The retrieved task description.
     * </p>
     * 
     * @param description
     *        The retrieved task description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retrieved task description.
     * </p>
     * 
     * @return The retrieved task description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The retrieved task description.
     * </p>
     * 
     * @param description
     *        The retrieved task description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskResult withDescription(String description) {
        setDescription(description);
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
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
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
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowTaskResult == false)
            return false;
        GetMaintenanceWindowTaskResult other = (GetMaintenanceWindowTaskResult) obj;
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
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
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
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getTaskInvocationParameters() == null) ? 0 : getTaskInvocationParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetMaintenanceWindowTaskResult clone() {
        try {
            return (GetMaintenanceWindowTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
