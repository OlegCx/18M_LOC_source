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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a filter on a <a>ListImages</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImagesFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     */
    private String tagStatus;

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     * 
     * @param tagStatus
     *        The tag status with which to filter your <a>ListImages</a> results. You can filter results based on
     *        whether they are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * @see TagStatus
     */

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     * 
     * @return The tag status with which to filter your <a>ListImages</a> results. You can filter results based on
     *         whether they are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * @see TagStatus
     */

    public String getTagStatus() {
        return this.tagStatus;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     * 
     * @param tagStatus
     *        The tag status with which to filter your <a>ListImages</a> results. You can filter results based on
     *        whether they are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagStatus
     */

    public ListImagesFilter withTagStatus(String tagStatus) {
        setTagStatus(tagStatus);
        return this;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     * 
     * @param tagStatus
     *        The tag status with which to filter your <a>ListImages</a> results. You can filter results based on
     *        whether they are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * @see TagStatus
     */

    public void setTagStatus(TagStatus tagStatus) {
        withTagStatus(tagStatus);
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You can filter results based on whether they
     * are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * </p>
     * 
     * @param tagStatus
     *        The tag status with which to filter your <a>ListImages</a> results. You can filter results based on
     *        whether they are <code>TAGGED</code> or <code>UNTAGGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagStatus
     */

    public ListImagesFilter withTagStatus(TagStatus tagStatus) {
        this.tagStatus = tagStatus.toString();
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
        if (getTagStatus() != null)
            sb.append("TagStatus: ").append(getTagStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagesFilter == false)
            return false;
        ListImagesFilter other = (ListImagesFilter) obj;
        if (other.getTagStatus() == null ^ this.getTagStatus() == null)
            return false;
        if (other.getTagStatus() != null && other.getTagStatus().equals(this.getTagStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagStatus() == null) ? 0 : getTagStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListImagesFilter clone() {
        try {
            return (ListImagesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ListImagesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
