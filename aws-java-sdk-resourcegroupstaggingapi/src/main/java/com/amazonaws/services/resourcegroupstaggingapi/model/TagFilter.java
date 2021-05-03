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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of tags (keys and values) that are used to specify the associated resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     */
    private String key;
    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The
     * value can be empty or null.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @return One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *         more specific tag values.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The
     * value can be empty or null.
     * </p>
     * 
     * @return One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category
     *         (key). The value can be empty or null.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The
     * value can be empty or null.
     * </p>
     * 
     * @param values
     *        One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
     *        The value can be empty or null.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The
     * value can be empty or null.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
     *        The value can be empty or null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The
     * value can be empty or null.
     * </p>
     * 
     * @param values
     *        One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
     *        The value can be empty or null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public TagFilter clone() {
        try {
            return (TagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroupstaggingapi.model.transform.TagFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
