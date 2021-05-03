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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the
 * files during project creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CodeSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the Amazon S3 location where the source code files provided with the project request are
     * stored.
     * </p>
     */
    private S3Location s3;

    /**
     * <p>
     * Information about the Amazon S3 location where the source code files provided with the project request are
     * stored.
     * </p>
     * 
     * @param s3
     *        Information about the Amazon S3 location where the source code files provided with the project request are
     *        stored.
     */

    public void setS3(S3Location s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Information about the Amazon S3 location where the source code files provided with the project request are
     * stored.
     * </p>
     * 
     * @return Information about the Amazon S3 location where the source code files provided with the project request
     *         are stored.
     */

    public S3Location getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Information about the Amazon S3 location where the source code files provided with the project request are
     * stored.
     * </p>
     * 
     * @param s3
     *        Information about the Amazon S3 location where the source code files provided with the project request are
     *        stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSource withS3(S3Location s3) {
        setS3(s3);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSource == false)
            return false;
        CodeSource other = (CodeSource) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public CodeSource clone() {
        try {
            return (CodeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.CodeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
