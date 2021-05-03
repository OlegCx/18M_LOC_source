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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when using Zendesk as a flow source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ZendeskSourceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZendeskSourceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Zendesk flow source.
     * </p>
     */
    private String object;

    /**
     * <p>
     * The object specified in the Zendesk flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Zendesk flow source.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Zendesk flow source.
     * </p>
     * 
     * @return The object specified in the Zendesk flow source.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Zendesk flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Zendesk flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskSourceProperties withObject(String object) {
        setObject(object);
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
        if (getObject() != null)
            sb.append("Object: ").append(getObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZendeskSourceProperties == false)
            return false;
        ZendeskSourceProperties other = (ZendeskSourceProperties) obj;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        return hashCode;
    }

    @Override
    public ZendeskSourceProperties clone() {
        try {
            return (ZendeskSourceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ZendeskSourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
