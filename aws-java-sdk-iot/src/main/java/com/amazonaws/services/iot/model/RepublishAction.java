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
 * Describes an action to republish to another topic.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepublishAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     * </p>
     */
    private Integer qos;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepublishAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @return The name of the MQTT topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepublishAction withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     */

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     * </p>
     * 
     * @return The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     */

    public Integer getQos() {
        return this.qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepublishAction withQos(Integer qos) {
        setQos(qos);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getQos() != null)
            sb.append("Qos: ").append(getQos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepublishAction == false)
            return false;
        RepublishAction other = (RepublishAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        return hashCode;
    }

    @Override
    public RepublishAction clone() {
        try {
            return (RepublishAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.RepublishActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
