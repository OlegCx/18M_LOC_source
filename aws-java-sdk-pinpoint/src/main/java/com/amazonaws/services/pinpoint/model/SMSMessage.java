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
 * Specifies the default settings for a one-time SMS message that's sent directly to an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SMSMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     */
    private String mediaUrl;
    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's
     * assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     */
    private String originationNumber;
    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by
     * country or region.
     * </p>
     */
    private String senderId;
    /**
     * <p>
     * The message variables to use in the SMS message. You can override the default variables with individual address
     * variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * <p>
     * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your country.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The template ID received from the regulatory body for sending SMS in your country.
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @param body
     *        The body of the SMS message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @return The body of the SMS message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @param body
     *        The body of the SMS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * </p>
     * 
     * @param keyword
     *        The SMS program name that you provided to AWS Support when you requested your dedicated number.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * </p>
     * 
     * @return The SMS program name that you provided to AWS Support when you requested your dedicated number.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * </p>
     * 
     * @param keyword
     *        The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param mediaUrl
     *        This field is reserved for future use.
     */

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @return This field is reserved for future use.
     */

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param mediaUrl
     *        This field is reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withMediaUrl(String mediaUrl) {
        setMediaUrl(mediaUrl);
        return this;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     * 
     * @param messageType
     *        The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive,
     *        such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     *        as marketing messages).
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     * 
     * @return The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive,
     *         such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     *         as marketing messages).
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     * 
     * @param messageType
     *        The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive,
     *        such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     *        as marketing messages).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SMSMessage withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     * 
     * @param messageType
     *        The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive,
     *        such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     *        as marketing messages).
     * @see MessageType
     */

    public void setMessageType(MessageType messageType) {
        withMessageType(messageType);
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing
     * messages).
     * </p>
     * 
     * @param messageType
     *        The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive,
     *        such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     *        as marketing messages).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SMSMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's
     * assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     * 
     * @param originationNumber
     *        The number to send the SMS message from. This value should be one of the dedicated long or short codes
     *        that's assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a
     *        random long code to the SMS message and sends the message from that code.
     */

    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's
     * assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     * 
     * @return The number to send the SMS message from. This value should be one of the dedicated long or short codes
     *         that's assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a
     *         random long code to the SMS message and sends the message from that code.
     */

    public String getOriginationNumber() {
        return this.originationNumber;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's
     * assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     * 
     * @param originationNumber
     *        The number to send the SMS message from. This value should be one of the dedicated long or short codes
     *        that's assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a
     *        random long code to the SMS message and sends the message from that code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withOriginationNumber(String originationNumber) {
        setOriginationNumber(originationNumber);
        return this;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by
     * country or region.
     * </p>
     * 
     * @param senderId
     *        The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs
     *        varies by country or region.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by
     * country or region.
     * </p>
     * 
     * @return The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs
     *         varies by country or region.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by
     * country or region.
     * </p>
     * 
     * @param senderId
     *        The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs
     *        varies by country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the default variables with individual address
     * variables.
     * </p>
     * 
     * @return The message variables to use in the SMS message. You can override the default variables with individual
     *         address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the default variables with individual address
     * variables.
     * </p>
     * 
     * @param substitutions
     *        The message variables to use in the SMS message. You can override the default variables with individual
     *        address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the default variables with individual address
     * variables.
     * </p>
     * 
     * @param substitutions
     *        The message variables to use in the SMS message. You can override the default variables with individual
     *        address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see SMSMessage#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @param entityId
     *        The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your
     *        country.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @return The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your
     *         country.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @param entityId
     *        The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your
     *        country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The template ID received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @param templateId
     *        The template ID received from the regulatory body for sending SMS in your country.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The template ID received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @return The template ID received from the regulatory body for sending SMS in your country.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The template ID received from the regulatory body for sending SMS in your country.
     * </p>
     * 
     * @param templateId
     *        The template ID received from the regulatory body for sending SMS in your country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword()).append(",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: ").append(getMediaUrl()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getOriginationNumber() != null)
            sb.append("OriginationNumber: ").append(getOriginationNumber()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSMessage == false)
            return false;
        SMSMessage other = (SMSMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getOriginationNumber() == null ^ this.getOriginationNumber() == null)
            return false;
        if (other.getOriginationNumber() != null && other.getOriginationNumber().equals(this.getOriginationNumber()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getOriginationNumber() == null) ? 0 : getOriginationNumber().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public SMSMessage clone() {
        try {
            return (SMSMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SMSMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
