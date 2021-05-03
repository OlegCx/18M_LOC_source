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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activity that adds information from the AWS IoT Device Shadow service to a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeviceShadowEnrichActivity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceShadowEnrichActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the <code>deviceShadowEnrich</code> activity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the attribute that is added to the message.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The name of the IoT device whose shadow information is added to the message.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ARN of the role that allows access to the device's shadow.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     */
    private String next;

    /**
     * <p>
     * The name of the <code>deviceShadowEnrich</code> activity.
     * </p>
     * 
     * @param name
     *        The name of the <code>deviceShadowEnrich</code> activity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>deviceShadowEnrich</code> activity.
     * </p>
     * 
     * @return The name of the <code>deviceShadowEnrich</code> activity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>deviceShadowEnrich</code> activity.
     * </p>
     * 
     * @param name
     *        The name of the <code>deviceShadowEnrich</code> activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceShadowEnrichActivity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute that is added to the message.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute that is added to the message.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute that is added to the message.
     * </p>
     * 
     * @return The name of the attribute that is added to the message.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The name of the attribute that is added to the message.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute that is added to the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceShadowEnrichActivity withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The name of the IoT device whose shadow information is added to the message.
     * </p>
     * 
     * @param thingName
     *        The name of the IoT device whose shadow information is added to the message.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the IoT device whose shadow information is added to the message.
     * </p>
     * 
     * @return The name of the IoT device whose shadow information is added to the message.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the IoT device whose shadow information is added to the message.
     * </p>
     * 
     * @param thingName
     *        The name of the IoT device whose shadow information is added to the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceShadowEnrichActivity withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that allows access to the device's shadow.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows access to the device's shadow.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows access to the device's shadow.
     * </p>
     * 
     * @return The ARN of the role that allows access to the device's shadow.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows access to the device's shadow.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows access to the device's shadow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceShadowEnrichActivity withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     */

    public void setNext(String next) {
        this.next = next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @return The next activity in the pipeline.
     */

    public String getNext() {
        return this.next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceShadowEnrichActivity withNext(String next) {
        setNext(next);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceShadowEnrichActivity == false)
            return false;
        DeviceShadowEnrichActivity other = (DeviceShadowEnrichActivity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public DeviceShadowEnrichActivity clone() {
        try {
            return (DeviceShadowEnrichActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DeviceShadowEnrichActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
