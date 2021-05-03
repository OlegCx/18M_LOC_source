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
 * Specifies the default settings and content for a one-time email message that's sent directly to an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the email message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     * </p>
     */
    private String feedbackForwardingAddress;
    /**
     * <p>
     * The verified email address to send the email message from. The default value is the FromAddress specified for the
     * email channel.
     * </p>
     */
    private String fromAddress;
    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     */
    private RawEmail rawEmail;
    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address
     * receives the reply.
     * </p>
     */
    private java.util.List<String> replyToAddresses;
    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     */
    private SimpleEmail simpleEmail;
    /**
     * <p>
     * The default message variables to use in the email message. You can override the default variables with individual
     * address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The body of the email message.
     * </p>
     * 
     * @param body
     *        The body of the email message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the email message.
     * </p>
     * 
     * @return The body of the email message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the email message.
     * </p>
     * 
     * @param body
     *        The body of the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     * </p>
     * 
     * @param feedbackForwardingAddress
     *        The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     */

    public void setFeedbackForwardingAddress(String feedbackForwardingAddress) {
        this.feedbackForwardingAddress = feedbackForwardingAddress;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     * </p>
     * 
     * @return The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     */

    public String getFeedbackForwardingAddress() {
        return this.feedbackForwardingAddress;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     * </p>
     * 
     * @param feedbackForwardingAddress
     *        The email address to forward bounces and complaints to, if feedback forwarding is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withFeedbackForwardingAddress(String feedbackForwardingAddress) {
        setFeedbackForwardingAddress(feedbackForwardingAddress);
        return this;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default value is the FromAddress specified for the
     * email channel.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email message from. The default value is the FromAddress specified
     *        for the email channel.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default value is the FromAddress specified for the
     * email channel.
     * </p>
     * 
     * @return The verified email address to send the email message from. The default value is the FromAddress specified
     *         for the email channel.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default value is the FromAddress specified for the
     * email channel.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email message from. The default value is the FromAddress specified
     *        for the email channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     * 
     * @param rawEmail
     *        The email message, represented as a raw MIME message.
     */

    public void setRawEmail(RawEmail rawEmail) {
        this.rawEmail = rawEmail;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     * 
     * @return The email message, represented as a raw MIME message.
     */

    public RawEmail getRawEmail() {
        return this.rawEmail;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     * 
     * @param rawEmail
     *        The email message, represented as a raw MIME message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withRawEmail(RawEmail rawEmail) {
        setRawEmail(rawEmail);
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address
     * receives the reply.
     * </p>
     * 
     * @return The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to
     *         address receives the reply.
     */

    public java.util.List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address
     * receives the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to
     *        address receives the reply.
     */

    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }

        this.replyToAddresses = new java.util.ArrayList<String>(replyToAddresses);
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address
     * receives the reply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplyToAddresses(java.util.Collection)} or {@link #withReplyToAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to
     *        address receives the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withReplyToAddresses(String... replyToAddresses) {
        if (this.replyToAddresses == null) {
            setReplyToAddresses(new java.util.ArrayList<String>(replyToAddresses.length));
        }
        for (String ele : replyToAddresses) {
            this.replyToAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address
     * receives the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to
     *        address receives the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     * 
     * @param simpleEmail
     *        The email message, composed of a subject, a text part, and an HTML part.
     */

    public void setSimpleEmail(SimpleEmail simpleEmail) {
        this.simpleEmail = simpleEmail;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     * 
     * @return The email message, composed of a subject, a text part, and an HTML part.
     */

    public SimpleEmail getSimpleEmail() {
        return this.simpleEmail;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     * 
     * @param simpleEmail
     *        The email message, composed of a subject, a text part, and an HTML part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withSimpleEmail(SimpleEmail simpleEmail) {
        setSimpleEmail(simpleEmail);
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @return The default message variables to use in the email message. You can override the default variables with
     *         individual address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the email message. You can override the default variables with
     *        individual address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the email message. You can override the default variables with
     *        individual address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see EmailMessage#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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

    public EmailMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
        if (getFeedbackForwardingAddress() != null)
            sb.append("FeedbackForwardingAddress: ").append(getFeedbackForwardingAddress()).append(",");
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress()).append(",");
        if (getRawEmail() != null)
            sb.append("RawEmail: ").append(getRawEmail()).append(",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: ").append(getReplyToAddresses()).append(",");
        if (getSimpleEmail() != null)
            sb.append("SimpleEmail: ").append(getSimpleEmail()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailMessage == false)
            return false;
        EmailMessage other = (EmailMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFeedbackForwardingAddress() == null ^ this.getFeedbackForwardingAddress() == null)
            return false;
        if (other.getFeedbackForwardingAddress() != null && other.getFeedbackForwardingAddress().equals(this.getFeedbackForwardingAddress()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getRawEmail() == null ^ this.getRawEmail() == null)
            return false;
        if (other.getRawEmail() != null && other.getRawEmail().equals(this.getRawEmail()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getSimpleEmail() == null ^ this.getSimpleEmail() == null)
            return false;
        if (other.getSimpleEmail() != null && other.getSimpleEmail().equals(this.getSimpleEmail()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getFeedbackForwardingAddress() == null) ? 0 : getFeedbackForwardingAddress().hashCode());
        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getRawEmail() == null) ? 0 : getRawEmail().hashCode());
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getSimpleEmail() == null) ? 0 : getSimpleEmail().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public EmailMessage clone() {
        try {
            return (EmailMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EmailMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
