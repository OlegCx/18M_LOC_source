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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A unique message ID that you receive when an email is accepted for sending.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the message that is generated when the message is accepted.
     * </p>
     * <note>
     * <p>
     * It's possible for Amazon SES to accept a message without sending it. This can happen when the message that you're
     * trying to send has an attachment contains a virus, or when you send a templated email that contains invalid
     * personalization content, for example.
     * </p>
     * </note>
     */
    private String messageId;

    /**
     * <p>
     * A unique identifier for the message that is generated when the message is accepted.
     * </p>
     * <note>
     * <p>
     * It's possible for Amazon SES to accept a message without sending it. This can happen when the message that you're
     * trying to send has an attachment contains a virus, or when you send a templated email that contains invalid
     * personalization content, for example.
     * </p>
     * </note>
     * 
     * @param messageId
     *        A unique identifier for the message that is generated when the message is accepted.</p> <note>
     *        <p>
     *        It's possible for Amazon SES to accept a message without sending it. This can happen when the message that
     *        you're trying to send has an attachment contains a virus, or when you send a templated email that contains
     *        invalid personalization content, for example.
     *        </p>
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * A unique identifier for the message that is generated when the message is accepted.
     * </p>
     * <note>
     * <p>
     * It's possible for Amazon SES to accept a message without sending it. This can happen when the message that you're
     * trying to send has an attachment contains a virus, or when you send a templated email that contains invalid
     * personalization content, for example.
     * </p>
     * </note>
     * 
     * @return A unique identifier for the message that is generated when the message is accepted.</p> <note>
     *         <p>
     *         It's possible for Amazon SES to accept a message without sending it. This can happen when the message
     *         that you're trying to send has an attachment contains a virus, or when you send a templated email that
     *         contains invalid personalization content, for example.
     *         </p>
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * A unique identifier for the message that is generated when the message is accepted.
     * </p>
     * <note>
     * <p>
     * It's possible for Amazon SES to accept a message without sending it. This can happen when the message that you're
     * trying to send has an attachment contains a virus, or when you send a templated email that contains invalid
     * personalization content, for example.
     * </p>
     * </note>
     * 
     * @param messageId
     *        A unique identifier for the message that is generated when the message is accepted.</p> <note>
     *        <p>
     *        It's possible for Amazon SES to accept a message without sending it. This can happen when the message that
     *        you're trying to send has an attachment contains a virus, or when you send a templated email that contains
     *        invalid personalization content, for example.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailResult withMessageId(String messageId) {
        setMessageId(messageId);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendEmailResult == false)
            return false;
        SendEmailResult other = (SendEmailResult) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public SendEmailResult clone() {
        try {
            return (SendEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
