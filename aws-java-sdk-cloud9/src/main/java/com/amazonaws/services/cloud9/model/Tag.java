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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata that is associated with AWS resources. In particular, a name-value pair that can be associated with an AWS
 * Cloud9 development environment. There are two types of tags: <i>user tags</i> and <i>system tags</i>. A user tag is
 * created by the user. A system tag is automatically created by AWS services. A system tag is prefixed with "aws:" and
 * cannot be modified by the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <b>name</b> part of a tag.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The <b>value</b> part of a tag.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The <b>name</b> part of a tag.
     * </p>
     * 
     * @param key
     *        The <b>name</b> part of a tag.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The <b>name</b> part of a tag.
     * </p>
     * 
     * @return The <b>name</b> part of a tag.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The <b>name</b> part of a tag.
     * </p>
     * 
     * @param key
     *        The <b>name</b> part of a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The <b>value</b> part of a tag.
     * </p>
     * 
     * @param value
     *        The <b>value</b> part of a tag.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The <b>value</b> part of a tag.
     * </p>
     * 
     * @return The <b>value</b> part of a tag.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The <b>value</b> part of a tag.
     * </p>
     * 
     * @param value
     *        The <b>value</b> part of a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getValue() != null)
            sb.append("Value: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloud9.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
