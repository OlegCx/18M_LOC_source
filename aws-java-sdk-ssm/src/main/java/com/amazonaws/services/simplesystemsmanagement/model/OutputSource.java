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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the source where the association execution details are stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OutputSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     */
    private String outputSourceId;
    /**
     * <p>
     * The type of source where the association execution details are stored, for example, Amazon S3.
     * </p>
     */
    private String outputSourceType;

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * 
     * @param outputSourceId
     *        The ID of the output source, for example the URL of an S3 bucket.
     */

    public void setOutputSourceId(String outputSourceId) {
        this.outputSourceId = outputSourceId;
    }

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * 
     * @return The ID of the output source, for example the URL of an S3 bucket.
     */

    public String getOutputSourceId() {
        return this.outputSourceId;
    }

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * 
     * @param outputSourceId
     *        The ID of the output source, for example the URL of an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withOutputSourceId(String outputSourceId) {
        setOutputSourceId(outputSourceId);
        return this;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored, for example, Amazon S3.
     * </p>
     * 
     * @param outputSourceType
     *        The type of source where the association execution details are stored, for example, Amazon S3.
     */

    public void setOutputSourceType(String outputSourceType) {
        this.outputSourceType = outputSourceType;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored, for example, Amazon S3.
     * </p>
     * 
     * @return The type of source where the association execution details are stored, for example, Amazon S3.
     */

    public String getOutputSourceType() {
        return this.outputSourceType;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored, for example, Amazon S3.
     * </p>
     * 
     * @param outputSourceType
     *        The type of source where the association execution details are stored, for example, Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withOutputSourceType(String outputSourceType) {
        setOutputSourceType(outputSourceType);
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
        if (getOutputSourceId() != null)
            sb.append("OutputSourceId: ").append(getOutputSourceId()).append(",");
        if (getOutputSourceType() != null)
            sb.append("OutputSourceType: ").append(getOutputSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSource == false)
            return false;
        OutputSource other = (OutputSource) obj;
        if (other.getOutputSourceId() == null ^ this.getOutputSourceId() == null)
            return false;
        if (other.getOutputSourceId() != null && other.getOutputSourceId().equals(this.getOutputSourceId()) == false)
            return false;
        if (other.getOutputSourceType() == null ^ this.getOutputSourceType() == null)
            return false;
        if (other.getOutputSourceType() != null && other.getOutputSourceType().equals(this.getOutputSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputSourceId() == null) ? 0 : getOutputSourceId().hashCode());
        hashCode = prime * hashCode + ((getOutputSourceType() == null) ? 0 : getOutputSourceType().hashCode());
        return hashCode;
    }

    @Override
    public OutputSource clone() {
        try {
            return (OutputSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OutputSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
