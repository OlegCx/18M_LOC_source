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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that defines a message that contains SSML-formatted text.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/SSMLMessageType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSMLMessageType implements Serializable, Cloneable, StructuredPojo {

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     */
    private String languageCode;
    /** The SSML-formatted text to deliver to the recipient. */
    private String text;
    /**
     * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see
     * the Amazon Polly Developer Guide.
     */
    private String voiceId;

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @param languageCode
     *        The language to use when delivering the message. For a complete list of supported languages, see the
     *        Amazon Polly Developer Guide.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @return The language to use when delivering the message. For a complete list of supported languages, see the
     *         Amazon Polly Developer Guide.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @param languageCode
     *        The language to use when delivering the message. For a complete list of supported languages, see the
     *        Amazon Polly Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMLMessageType withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * The SSML-formatted text to deliver to the recipient.
     * 
     * @param text
     *        The SSML-formatted text to deliver to the recipient.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * The SSML-formatted text to deliver to the recipient.
     * 
     * @return The SSML-formatted text to deliver to the recipient.
     */

    public String getText() {
        return this.text;
    }

    /**
     * The SSML-formatted text to deliver to the recipient.
     * 
     * @param text
     *        The SSML-formatted text to deliver to the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMLMessageType withText(String text) {
        setText(text);
        return this;
    }

    /**
     * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see
     * the Amazon Polly Developer Guide.
     * 
     * @param voiceId
     *        The name of the voice that you want to use to deliver the message. For a complete list of supported
     *        voices, see the Amazon Polly Developer Guide.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see
     * the Amazon Polly Developer Guide.
     * 
     * @return The name of the voice that you want to use to deliver the message. For a complete list of supported
     *         voices, see the Amazon Polly Developer Guide.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see
     * the Amazon Polly Developer Guide.
     * 
     * @param voiceId
     *        The name of the voice that you want to use to deliver the message. For a complete list of supported
     *        voices, see the Amazon Polly Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMLMessageType withVoiceId(String voiceId) {
        setVoiceId(voiceId);
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSMLMessageType == false)
            return false;
        SSMLMessageType other = (SSMLMessageType) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public SSMLMessageType clone() {
        try {
            return (SSMLMessageType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.SSMLMessageTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
