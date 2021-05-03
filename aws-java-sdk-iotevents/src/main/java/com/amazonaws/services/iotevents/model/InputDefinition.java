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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of the input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/InputDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent
     * to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and
     * those attributes (and their paired values) specified here are available for use in the <code>condition</code>
     * expressions used by detectors that monitor this input.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent
     * to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and
     * those attributes (and their paired values) specified here are available for use in the <code>condition</code>
     * expressions used by detectors that monitor this input.
     * </p>
     * 
     * @return The attributes from the JSON payload that are made available by the input. Inputs are derived from
     *         messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains
     *         a JSON payload, and those attributes (and their paired values) specified here are available for use in
     *         the <code>condition</code> expressions used by detectors that monitor this input.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent
     * to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and
     * those attributes (and their paired values) specified here are available for use in the <code>condition</code>
     * expressions used by detectors that monitor this input.
     * </p>
     * 
     * @param attributes
     *        The attributes from the JSON payload that are made available by the input. Inputs are derived from
     *        messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains
     *        a JSON payload, and those attributes (and their paired values) specified here are available for use in the
     *        <code>condition</code> expressions used by detectors that monitor this input.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent
     * to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and
     * those attributes (and their paired values) specified here are available for use in the <code>condition</code>
     * expressions used by detectors that monitor this input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes from the JSON payload that are made available by the input. Inputs are derived from
     *        messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains
     *        a JSON payload, and those attributes (and their paired values) specified here are available for use in the
     *        <code>condition</code> expressions used by detectors that monitor this input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDefinition withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent
     * to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and
     * those attributes (and their paired values) specified here are available for use in the <code>condition</code>
     * expressions used by detectors that monitor this input.
     * </p>
     * 
     * @param attributes
     *        The attributes from the JSON payload that are made available by the input. Inputs are derived from
     *        messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains
     *        a JSON payload, and those attributes (and their paired values) specified here are available for use in the
     *        <code>condition</code> expressions used by detectors that monitor this input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDefinition withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDefinition == false)
            return false;
        InputDefinition other = (InputDefinition) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InputDefinition clone() {
        try {
            return (InputDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.InputDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
