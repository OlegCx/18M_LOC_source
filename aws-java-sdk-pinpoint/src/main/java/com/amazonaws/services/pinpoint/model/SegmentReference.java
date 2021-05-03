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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the segment identifier and version of a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version number of the segment.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the segment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @return The unique identifier for the segment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentReference withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @param version
     *        The version number of the segment.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @return The version number of the segment.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @param version
     *        The version number of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentReference withVersion(Integer version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentReference == false)
            return false;
        SegmentReference other = (SegmentReference) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SegmentReference clone() {
        try {
            return (SegmentReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
