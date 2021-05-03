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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a public key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublicKeySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKeySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the public key.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time when the public key was uploaded.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The public key.
     * </p>
     */
    private String encodedKey;
    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The identifier of the public key.
     * </p>
     * 
     * @param id
     *        The identifier of the public key.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the public key.
     * </p>
     * 
     * @return The identifier of the public key.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the public key.
     * </p>
     * 
     * @param id
     *        The identifier of the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @param name
     *        A name to help identify the public key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @return A name to help identify the public key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @param name
     *        A name to help identify the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time when the public key was uploaded.
     * </p>
     * 
     * @param createdTime
     *        The date and time when the public key was uploaded.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time when the public key was uploaded.
     * </p>
     * 
     * @return The date and time when the public key was uploaded.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time when the public key was uploaded.
     * </p>
     * 
     * @param createdTime
     *        The date and time when the public key was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeySummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @param encodedKey
     *        The public key.
     */

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @return The public key.
     */

    public String getEncodedKey() {
        return this.encodedKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @param encodedKey
     *        The public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeySummary withEncodedKey(String encodedKey) {
        setEncodedKey(encodedKey);
        return this;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the public key. The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the public key. The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the public key. The comment cannot be longer than 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeySummary withComment(String comment) {
        setComment(comment);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEncodedKey() != null)
            sb.append("EncodedKey: ").append(getEncodedKey()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKeySummary == false)
            return false;
        PublicKeySummary other = (PublicKeySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEncodedKey() == null ^ this.getEncodedKey() == null)
            return false;
        if (other.getEncodedKey() != null && other.getEncodedKey().equals(this.getEncodedKey()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEncodedKey() == null) ? 0 : getEncodedKey().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public PublicKeySummary clone() {
        try {
            return (PublicKeySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
