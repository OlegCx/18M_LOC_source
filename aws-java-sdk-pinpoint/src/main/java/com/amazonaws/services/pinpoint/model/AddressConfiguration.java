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
 * Specifies address-based configuration settings for a message that's sent directly to an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/AddressConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message body to use instead of the default message body. This value overrides the default message body.
     * </p>
     */
    private String bodyOverride;
    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     */
    private String channelType;
    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute
     * names are case sensitive.
     * </p>
     * <p>
     * For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all
     * other values for the message.
     * </p>
     */
    private String rawContent;
    /**
     * <p>
     * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object.
     * The variables specified in this map take precedence over all other variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * <p>
     * The message title to use instead of the default message title. This value overrides the default message title.
     * </p>
     */
    private String titleOverride;

    /**
     * <p>
     * The message body to use instead of the default message body. This value overrides the default message body.
     * </p>
     * 
     * @param bodyOverride
     *        The message body to use instead of the default message body. This value overrides the default message
     *        body.
     */

    public void setBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
    }

    /**
     * <p>
     * The message body to use instead of the default message body. This value overrides the default message body.
     * </p>
     * 
     * @return The message body to use instead of the default message body. This value overrides the default message
     *         body.
     */

    public String getBodyOverride() {
        return this.bodyOverride;
    }

    /**
     * <p>
     * The message body to use instead of the default message body. This value overrides the default message body.
     * </p>
     * 
     * @param bodyOverride
     *        The message body to use instead of the default message body. This value overrides the default message
     *        body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withBodyOverride(String bodyOverride) {
        setBodyOverride(bodyOverride);
        return this;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending the message.
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * 
     * @return The channel to use when sending the message.
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public AddressConfiguration withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending the message.
     * @see ChannelType
     */

    public void setChannelType(ChannelType channelType) {
        withChannelType(channelType);
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public AddressConfiguration withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute
     * names are case sensitive.
     * </p>
     * <p>
     * For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     * 
     * @return An object that maps custom attributes to attributes for the address and is attached to the message.
     *         Attribute names are case sensitive.</p>
     *         <p>
     *         For a push notification, this payload is added to the data.pinpoint object. For an email or text message,
     *         this payload is added to email/SMS delivery receipt event attributes.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute
     * names are case sensitive.
     * </p>
     * <p>
     * For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     * 
     * @param context
     *        An object that maps custom attributes to attributes for the address and is attached to the message.
     *        Attribute names are case sensitive.</p>
     *        <p>
     *        For a push notification, this payload is added to the data.pinpoint object. For an email or text message,
     *        this payload is added to email/SMS delivery receipt event attributes.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute
     * names are case sensitive.
     * </p>
     * <p>
     * For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     * 
     * @param context
     *        An object that maps custom attributes to attributes for the address and is attached to the message.
     *        Attribute names are case sensitive.</p>
     *        <p>
     *        For a push notification, this payload is added to the data.pinpoint object. For an email or text message,
     *        this payload is added to email/SMS delivery receipt event attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see AddressConfiguration#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all
     * other values for the message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides
     *        all other values for the message.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all
     * other values for the message.
     * </p>
     * 
     * @return The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides
     *         all other values for the message.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all
     * other values for the message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides
     *        all other values for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * <p>
     * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object.
     * The variables specified in this map take precedence over all other variables.
     * </p>
     * 
     * @return A map of the message variables to merge with the variables specified by properties of the DefaultMessage
     *         object. The variables specified in this map take precedence over all other variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object.
     * The variables specified in this map take precedence over all other variables.
     * </p>
     * 
     * @param substitutions
     *        A map of the message variables to merge with the variables specified by properties of the DefaultMessage
     *        object. The variables specified in this map take precedence over all other variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object.
     * The variables specified in this map take precedence over all other variables.
     * </p>
     * 
     * @param substitutions
     *        A map of the message variables to merge with the variables specified by properties of the DefaultMessage
     *        object. The variables specified in this map take precedence over all other variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see AddressConfiguration#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration addSubstitutionsEntry(String key, java.util.List<String> value) {
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

    public AddressConfiguration clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value overrides the default message title.
     * </p>
     * 
     * @param titleOverride
     *        The message title to use instead of the default message title. This value overrides the default message
     *        title.
     */

    public void setTitleOverride(String titleOverride) {
        this.titleOverride = titleOverride;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value overrides the default message title.
     * </p>
     * 
     * @return The message title to use instead of the default message title. This value overrides the default message
     *         title.
     */

    public String getTitleOverride() {
        return this.titleOverride;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value overrides the default message title.
     * </p>
     * 
     * @param titleOverride
     *        The message title to use instead of the default message title. This value overrides the default message
     *        title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withTitleOverride(String titleOverride) {
        setTitleOverride(titleOverride);
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
        if (getBodyOverride() != null)
            sb.append("BodyOverride: ").append(getBodyOverride()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getTitleOverride() != null)
            sb.append("TitleOverride: ").append(getTitleOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddressConfiguration == false)
            return false;
        AddressConfiguration other = (AddressConfiguration) obj;
        if (other.getBodyOverride() == null ^ this.getBodyOverride() == null)
            return false;
        if (other.getBodyOverride() != null && other.getBodyOverride().equals(this.getBodyOverride()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTitleOverride() == null ^ this.getTitleOverride() == null)
            return false;
        if (other.getTitleOverride() != null && other.getTitleOverride().equals(this.getTitleOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBodyOverride() == null) ? 0 : getBodyOverride().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTitleOverride() == null) ? 0 : getTitleOverride().hashCode());
        return hashCode;
    }

    @Override
    public AddressConfiguration clone() {
        try {
            return (AddressConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.AddressConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
