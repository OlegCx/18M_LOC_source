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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies either the application code, or the location of the application code, for a Flink-based Kinesis Data
 * Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CodeContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     */
    private String textContent;
    /**
     * <p>
     * The zip-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     */
    private java.nio.ByteBuffer zipFileContent;
    /**
     * <p>
     * Information about the Amazon S3 bucket containing the application code.
     * </p>
     */
    private S3ContentLocation s3ContentLocation;

    /**
     * <p>
     * The text-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param textContent
     *        The text-format code for a Flink-based Kinesis Data Analytics application.
     */

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    /**
     * <p>
     * The text-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The text-format code for a Flink-based Kinesis Data Analytics application.
     */

    public String getTextContent() {
        return this.textContent;
    }

    /**
     * <p>
     * The text-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param textContent
     *        The text-format code for a Flink-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContent withTextContent(String textContent) {
        setTextContent(textContent);
        return this;
    }

    /**
     * <p>
     * The zip-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFileContent
     *        The zip-format code for a Flink-based Kinesis Data Analytics application.
     */

    public void setZipFileContent(java.nio.ByteBuffer zipFileContent) {
        this.zipFileContent = zipFileContent;
    }

    /**
     * <p>
     * The zip-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The zip-format code for a Flink-based Kinesis Data Analytics application.
     */

    public java.nio.ByteBuffer getZipFileContent() {
        return this.zipFileContent;
    }

    /**
     * <p>
     * The zip-format code for a Flink-based Kinesis Data Analytics application.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFileContent
     *        The zip-format code for a Flink-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContent withZipFileContent(java.nio.ByteBuffer zipFileContent) {
        setZipFileContent(zipFileContent);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket containing the application code.
     * </p>
     * 
     * @param s3ContentLocation
     *        Information about the Amazon S3 bucket containing the application code.
     */

    public void setS3ContentLocation(S3ContentLocation s3ContentLocation) {
        this.s3ContentLocation = s3ContentLocation;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket containing the application code.
     * </p>
     * 
     * @return Information about the Amazon S3 bucket containing the application code.
     */

    public S3ContentLocation getS3ContentLocation() {
        return this.s3ContentLocation;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket containing the application code.
     * </p>
     * 
     * @param s3ContentLocation
     *        Information about the Amazon S3 bucket containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContent withS3ContentLocation(S3ContentLocation s3ContentLocation) {
        setS3ContentLocation(s3ContentLocation);
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
        if (getTextContent() != null)
            sb.append("TextContent: ").append(getTextContent()).append(",");
        if (getZipFileContent() != null)
            sb.append("ZipFileContent: ").append(getZipFileContent()).append(",");
        if (getS3ContentLocation() != null)
            sb.append("S3ContentLocation: ").append(getS3ContentLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeContent == false)
            return false;
        CodeContent other = (CodeContent) obj;
        if (other.getTextContent() == null ^ this.getTextContent() == null)
            return false;
        if (other.getTextContent() != null && other.getTextContent().equals(this.getTextContent()) == false)
            return false;
        if (other.getZipFileContent() == null ^ this.getZipFileContent() == null)
            return false;
        if (other.getZipFileContent() != null && other.getZipFileContent().equals(this.getZipFileContent()) == false)
            return false;
        if (other.getS3ContentLocation() == null ^ this.getS3ContentLocation() == null)
            return false;
        if (other.getS3ContentLocation() != null && other.getS3ContentLocation().equals(this.getS3ContentLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextContent() == null) ? 0 : getTextContent().hashCode());
        hashCode = prime * hashCode + ((getZipFileContent() == null) ? 0 : getZipFileContent().hashCode());
        hashCode = prime * hashCode + ((getS3ContentLocation() == null) ? 0 : getS3ContentLocation().hashCode());
        return hashCode;
    }

    @Override
    public CodeContent clone() {
        try {
            return (CodeContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CodeContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
