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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to begin the verification process for an email identity (an email address or domain).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEmailIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for
     * DKIM authentication purposes, as opposed to the default method, <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     * </p>
     */
    private DkimSigningAttributes dkimSigningAttributes;
    /**
     * <p>
     * The configuration set to use by default when sending from this identity. Note that any configuration set defined
     * in the email sending request takes precedence.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to verify.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @return The email address or domain that you want to verify.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to verify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @return An array of objects that define the tags (keys and values) that you want to associate with the email
     *         identity.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @param tags
     *        An array of objects that define the tags (keys and values) that you want to associate with the email
     *        identity.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of objects that define the tags (keys and values) that you want to associate with the email
     *        identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @param tags
     *        An array of objects that define the tags (keys and values) that you want to associate with the email
     *        identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for
     * DKIM authentication purposes, as opposed to the default method, <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     * </p>
     * 
     * @param dkimSigningAttributes
     *        If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM
     *        (BYODKIM) for DKIM authentication purposes, as opposed to the default method, <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.</p>
     *        <p>
     *        You can only specify this object if the email identity is a domain, as opposed to an address.
     */

    public void setDkimSigningAttributes(DkimSigningAttributes dkimSigningAttributes) {
        this.dkimSigningAttributes = dkimSigningAttributes;
    }

    /**
     * <p>
     * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for
     * DKIM authentication purposes, as opposed to the default method, <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     * </p>
     * 
     * @return If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM
     *         (BYODKIM) for DKIM authentication purposes, as opposed to the default method, <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.</p>
     *         <p>
     *         You can only specify this object if the email identity is a domain, as opposed to an address.
     */

    public DkimSigningAttributes getDkimSigningAttributes() {
        return this.dkimSigningAttributes;
    }

    /**
     * <p>
     * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for
     * DKIM authentication purposes, as opposed to the default method, <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     * </p>
     * 
     * @param dkimSigningAttributes
     *        If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM
     *        (BYODKIM) for DKIM authentication purposes, as opposed to the default method, <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.</p>
     *        <p>
     *        You can only specify this object if the email identity is a domain, as opposed to an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withDkimSigningAttributes(DkimSigningAttributes dkimSigningAttributes) {
        setDkimSigningAttributes(dkimSigningAttributes);
        return this;
    }

    /**
     * <p>
     * The configuration set to use by default when sending from this identity. Note that any configuration set defined
     * in the email sending request takes precedence.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set to use by default when sending from this identity. Note that any configuration set
     *        defined in the email sending request takes precedence.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The configuration set to use by default when sending from this identity. Note that any configuration set defined
     * in the email sending request takes precedence.
     * </p>
     * 
     * @return The configuration set to use by default when sending from this identity. Note that any configuration set
     *         defined in the email sending request takes precedence.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The configuration set to use by default when sending from this identity. Note that any configuration set defined
     * in the email sending request takes precedence.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set to use by default when sending from this identity. Note that any configuration set
     *        defined in the email sending request takes precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDkimSigningAttributes() != null)
            sb.append("DkimSigningAttributes: ").append(getDkimSigningAttributes()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEmailIdentityRequest == false)
            return false;
        CreateEmailIdentityRequest other = (CreateEmailIdentityRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDkimSigningAttributes() == null ^ this.getDkimSigningAttributes() == null)
            return false;
        if (other.getDkimSigningAttributes() != null && other.getDkimSigningAttributes().equals(this.getDkimSigningAttributes()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDkimSigningAttributes() == null) ? 0 : getDkimSigningAttributes().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEmailIdentityRequest clone() {
        return (CreateEmailIdentityRequest) super.clone();
    }

}
