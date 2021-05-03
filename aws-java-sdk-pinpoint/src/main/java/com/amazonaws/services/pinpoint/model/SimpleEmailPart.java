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
 * Specifies the subject or body of an email message, represented as textual email data and the applicable character
 * set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SimpleEmailPart" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleEmailPart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     */
    private String charset;
    /**
     * <p>
     * The textual data of the message content.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     * 
     * @param charset
     *        The applicable character set for the message content.
     */

    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     * 
     * @return The applicable character set for the message content.
     */

    public String getCharset() {
        return this.charset;
    }

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     * 
     * @param charset
     *        The applicable character set for the message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleEmailPart withCharset(String charset) {
        setCharset(charset);
        return this;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     * 
     * @param data
     *        The textual data of the message content.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     * 
     * @return The textual data of the message content.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     * 
     * @param data
     *        The textual data of the message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleEmailPart withData(String data) {
        setData(data);
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
        if (getCharset() != null)
            sb.append("Charset: ").append(getCharset()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleEmailPart == false)
            return false;
        SimpleEmailPart other = (SimpleEmailPart) obj;
        if (other.getCharset() == null ^ this.getCharset() == null)
            return false;
        if (other.getCharset() != null && other.getCharset().equals(this.getCharset()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCharset() == null) ? 0 : getCharset().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public SimpleEmailPart clone() {
        try {
            return (SimpleEmailPart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SimpleEmailPartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
