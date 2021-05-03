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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStateMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the state machine.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains
     * security by granting Step Functions access to AWS resources.)
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date the state machine is created.
     * </p>
     */
    private java.util.Date creationDate;

    private LoggingConfiguration loggingConfiguration;
    /**
     * <p>
     * Selects whether AWS X-Ray tracing is enabled.
     * </p>
     */
    private TracingConfiguration tracingConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the state machine.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @return The name of the state machine.</p>
     *         <p>
     *         A name must <i>not</i> contain:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         white space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         brackets <code>&lt; &gt; { } [ ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         wildcard characters <code>? *</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the state machine.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @see StateMachineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @return The current status of the state machine.
     * @see StateMachineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineStatus
     */

    public DescribeStateMachineResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @see StateMachineStatus
     */

    public void setStatus(StateMachineStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineStatus
     */

    public DescribeStateMachineResult withStatus(StateMachineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine. See <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *         States Language</a>.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains
     * security by granting Step Functions access to AWS resources.)
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role
     *        maintains security by granting Step Functions access to AWS resources.)
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains
     * security by granting Step Functions access to AWS resources.)
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role
     *         maintains security by granting Step Functions access to AWS resources.)
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains
     * security by granting Step Functions access to AWS resources.)
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role
     *        maintains security by granting Step Functions access to AWS resources.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     * 
     * @param type
     *        The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * @see StateMachineType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     * 
     * @return The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * @see StateMachineType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     * 
     * @param type
     *        The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public DescribeStateMachineResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     * 
     * @param type
     *        The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * @see StateMachineType
     */

    public void setType(StateMachineType type) {
        withType(type);
    }

    /**
     * <p>
     * The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * </p>
     * 
     * @param type
     *        The <code>type</code> of the state machine (<code>STANDARD</code> or <code>EXPRESS</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public DescribeStateMachineResult withType(StateMachineType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date the state machine is created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine is created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the state machine is created.
     * </p>
     * 
     * @return The date the state machine is created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the state machine is created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * @param loggingConfiguration
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * @return
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * @param loggingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * Selects whether AWS X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Selects whether AWS X-Ray tracing is enabled.
     */

    public void setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
    }

    /**
     * <p>
     * Selects whether AWS X-Ray tracing is enabled.
     * </p>
     * 
     * @return Selects whether AWS X-Ray tracing is enabled.
     */

    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    /**
     * <p>
     * Selects whether AWS X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Selects whether AWS X-Ray tracing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withTracingConfiguration(TracingConfiguration tracingConfiguration) {
        setTracingConfiguration(tracingConfiguration);
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getTracingConfiguration() != null)
            sb.append("TracingConfiguration: ").append(getTracingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStateMachineResult == false)
            return false;
        DescribeStateMachineResult other = (DescribeStateMachineResult) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getTracingConfiguration() == null ^ this.getTracingConfiguration() == null)
            return false;
        if (other.getTracingConfiguration() != null && other.getTracingConfiguration().equals(this.getTracingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTracingConfiguration() == null) ? 0 : getTracingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStateMachineResult clone() {
        try {
            return (DescribeStateMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
