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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data source for the Autopilot job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the input data.
     * </p>
     * <note>
     * <p>
     * The input data must be in CSV format and contain at least 500 rows.
     * </p>
     * </note>
     */
    private AutoMLS3DataSource s3DataSource;

    /**
     * <p>
     * The Amazon S3 location of the input data.
     * </p>
     * <note>
     * <p>
     * The input data must be in CSV format and contain at least 500 rows.
     * </p>
     * </note>
     * 
     * @param s3DataSource
     *        The Amazon S3 location of the input data.</p> <note>
     *        <p>
     *        The input data must be in CSV format and contain at least 500 rows.
     *        </p>
     */

    public void setS3DataSource(AutoMLS3DataSource s3DataSource) {
        this.s3DataSource = s3DataSource;
    }

    /**
     * <p>
     * The Amazon S3 location of the input data.
     * </p>
     * <note>
     * <p>
     * The input data must be in CSV format and contain at least 500 rows.
     * </p>
     * </note>
     * 
     * @return The Amazon S3 location of the input data.</p> <note>
     *         <p>
     *         The input data must be in CSV format and contain at least 500 rows.
     *         </p>
     */

    public AutoMLS3DataSource getS3DataSource() {
        return this.s3DataSource;
    }

    /**
     * <p>
     * The Amazon S3 location of the input data.
     * </p>
     * <note>
     * <p>
     * The input data must be in CSV format and contain at least 500 rows.
     * </p>
     * </note>
     * 
     * @param s3DataSource
     *        The Amazon S3 location of the input data.</p> <note>
     *        <p>
     *        The input data must be in CSV format and contain at least 500 rows.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLDataSource withS3DataSource(AutoMLS3DataSource s3DataSource) {
        setS3DataSource(s3DataSource);
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
        if (getS3DataSource() != null)
            sb.append("S3DataSource: ").append(getS3DataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLDataSource == false)
            return false;
        AutoMLDataSource other = (AutoMLDataSource) obj;
        if (other.getS3DataSource() == null ^ this.getS3DataSource() == null)
            return false;
        if (other.getS3DataSource() != null && other.getS3DataSource().equals(this.getS3DataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataSource() == null) ? 0 : getS3DataSource().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLDataSource clone() {
        try {
            return (AutoMLDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
