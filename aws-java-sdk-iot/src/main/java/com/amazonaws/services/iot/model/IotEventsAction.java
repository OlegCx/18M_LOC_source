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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends an input to an AWS IoT Events detector.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotEventsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS IoT Events input.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID value
     * will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message) with a given <code>messageId</code> will
     * be processed by an AWS IoT Events detector.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * </p>
     */
    private Boolean batchMode;
    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     * ("Action":"iotevents:BatchPutMessage").
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the AWS IoT Events input.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input.
     * </p>
     * 
     * @return The name of the AWS IoT Events input.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID value
     * will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message) with a given <code>messageId</code> will
     * be processed by an AWS IoT Events detector.
     * </p>
     * 
     * @param messageId
     *        The ID of the message. The default <code>messageId</code> is a new UUID value.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID
     *        value will be assigned.
     *        </p>
     *        <p>
     *        Assign a value to this property to ensure that only one input (message) with a given
     *        <code>messageId</code> will be processed by an AWS IoT Events detector.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID value
     * will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message) with a given <code>messageId</code> will
     * be processed by an AWS IoT Events detector.
     * </p>
     * 
     * @return The ID of the message. The default <code>messageId</code> is a new UUID value.</p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID
     *         value will be assigned.
     *         </p>
     *         <p>
     *         Assign a value to this property to ensure that only one input (message) with a given
     *         <code>messageId</code> will be processed by an AWS IoT Events detector.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID value
     * will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message) with a given <code>messageId</code> will
     * be processed by an AWS IoT Events detector.
     * </p>
     * 
     * @param messageId
     *        The ID of the message. The default <code>messageId</code> is a new UUID value.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>--a new UUID
     *        value will be assigned.
     *        </p>
     *        <p>
     *        Assign a value to this property to ensure that only one input (message) with a given
     *        <code>messageId</code> will be processed by an AWS IoT Events detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * </p>
     * 
     * @param batchMode
     *        Whether to process the event actions as a batch. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     *        </p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *        Array element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     *        <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     */

    public void setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * </p>
     * 
     * @return Whether to process the event actions as a batch. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *         Array element is treated as a separate message when it's sent to AWS IoT Events by calling <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     *         <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     */

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * </p>
     * 
     * @param batchMode
     *        Whether to process the event actions as a batch. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     *        </p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *        Array element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     *        <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withBatchMode(Boolean batchMode) {
        setBatchMode(batchMode);
        return this;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when it's sent to AWS IoT Events by calling <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     * </p>
     * 
     * @return Whether to process the event actions as a batch. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't specify a <code>messageId</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *         Array element is treated as a separate message when it's sent to AWS IoT Events by calling <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html">
     *         <code>BatchPutMessage</code> </a>. The resulting array can't have more than 10 messages.
     */

    public Boolean isBatchMode() {
        return this.batchMode;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     * ("Action":"iotevents:BatchPutMessage").
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     *        ("Action":"iotevents:BatchPutMessage").
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     * ("Action":"iotevents:BatchPutMessage").
     * </p>
     * 
     * @return The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     *         ("Action":"iotevents:BatchPutMessage").
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     * ("Action":"iotevents:BatchPutMessage").
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector.
     *        ("Action":"iotevents:BatchPutMessage").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getBatchMode() != null)
            sb.append("BatchMode: ").append(getBatchMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotEventsAction == false)
            return false;
        IotEventsAction other = (IotEventsAction) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getBatchMode() == null ^ this.getBatchMode() == null)
            return false;
        if (other.getBatchMode() != null && other.getBatchMode().equals(this.getBatchMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getBatchMode() == null) ? 0 : getBatchMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public IotEventsAction clone() {
        try {
            return (IotEventsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.IotEventsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
