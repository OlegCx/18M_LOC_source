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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a rule in Amazon EventBridge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/Rule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The event pattern of the rule. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The state of the rule.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of
     * the service that created the rule.
     * </p>
     */
    private String managedBy;
    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     */
    private String eventBusName;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The event pattern of the rule. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern of the rule. For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events
     *        and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern of the rule. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @return The event pattern of the rule. For more information, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html"
     *         >Events and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern of the rule. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern of the rule. For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events
     *        and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The state of the rule.
     * </p>
     * 
     * @param state
     *        The state of the rule.
     * @see RuleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the rule.
     * </p>
     * 
     * @return The state of the rule.
     * @see RuleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the rule.
     * </p>
     * 
     * @param state
     *        The state of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public Rule withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the rule.
     * </p>
     * 
     * @param state
     *        The state of the rule.
     * @see RuleState
     */

    public void setState(RuleState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the rule.
     * </p>
     * 
     * @param state
     *        The state of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public Rule withState(RuleState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @return The description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @return The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that is used for target invocation.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that is used for target invocation.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of
     * the service that created the rule.
     * </p>
     * 
     * @param managedBy
     *        If the rule was created on behalf of your account by an AWS service, this field displays the principal
     *        name of the service that created the rule.
     */

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    /**
     * <p>
     * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of
     * the service that created the rule.
     * </p>
     * 
     * @return If the rule was created on behalf of your account by an AWS service, this field displays the principal
     *         name of the service that created the rule.
     */

    public String getManagedBy() {
        return this.managedBy;
    }

    /**
     * <p>
     * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of
     * the service that created the rule.
     * </p>
     * 
     * @param managedBy
     *        If the rule was created on behalf of your account by an AWS service, this field displays the principal
     *        name of the service that created the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withManagedBy(String managedBy) {
        setManagedBy(managedBy);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *        used.
     */

    public void setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @return The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *         used.
     */

    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withEventBusName(String eventBusName) {
        setEventBusName(eventBusName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getManagedBy() != null)
            sb.append("ManagedBy: ").append(getManagedBy()).append(",");
        if (getEventBusName() != null)
            sb.append("EventBusName: ").append(getEventBusName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getManagedBy() == null ^ this.getManagedBy() == null)
            return false;
        if (other.getManagedBy() != null && other.getManagedBy().equals(this.getManagedBy()) == false)
            return false;
        if (other.getEventBusName() == null ^ this.getEventBusName() == null)
            return false;
        if (other.getEventBusName() != null && other.getEventBusName().equals(this.getEventBusName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getManagedBy() == null) ? 0 : getManagedBy().hashCode());
        hashCode = prime * hashCode + ((getEventBusName() == null) ? 0 : getEventBusName().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
