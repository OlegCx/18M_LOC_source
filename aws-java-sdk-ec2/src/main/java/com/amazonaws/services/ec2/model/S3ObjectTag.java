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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The tags to apply to the AMI object that will be stored in the S3 bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html">Categorizing your storage using
 * tags</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/S3ObjectTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectTag implements Serializable, Cloneable {

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with
     * <code>aws</code>:.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with
     * <code>aws</code>:.
     * </p>
     * 
     * @param key
     *        The key of the tag.</p>
     *        <p>
     *        Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin
     *        with <code>aws</code>:.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with
     * <code>aws</code>:.
     * </p>
     * 
     * @return The key of the tag.</p>
     *         <p>
     *         Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin
     *         with <code>aws</code>:.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with
     * <code>aws</code>:.
     * </p>
     * 
     * @param key
     *        The key of the tag.</p>
     *        <p>
     *        Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin
     *        with <code>aws</code>:.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectTag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     * </p>
     * 
     * @param value
     *        The value of the tag.</p>
     *        <p>
     *        Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     * </p>
     * 
     * @return The value of the tag.</p>
     *         <p>
     *         Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     * </p>
     * 
     * @param value
     *        The value of the tag.</p>
     *        <p>
     *        Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectTag withValue(String value) {
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
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ObjectTag == false)
            return false;
        S3ObjectTag other = (S3ObjectTag) obj;
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
    public S3ObjectTag clone() {
        try {
            return (S3ObjectTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
