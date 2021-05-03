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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a custom verification email template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CustomVerificationEmailTemplateMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomVerificationEmailTemplateMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     */
    private String fromEmailAddress;
    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     */
    private String templateSubject;
    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
     * </p>
     */
    private String successRedirectionURL;
    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is not successfully
     * verified.
     * </p>
     */
    private String failureRedirectionURL;

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     * 
     * @param templateName
     *        The name of the custom verification email template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     * 
     * @return The name of the custom verification email template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     * 
     * @param templateName
     *        The name of the custom verification email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateMetadata withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that the custom verification email is sent from.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     * 
     * @return The email address that the custom verification email is sent from.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that the custom verification email is sent from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateMetadata withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     * 
     * @param templateSubject
     *        The subject line of the custom verification email.
     */

    public void setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     * 
     * @return The subject line of the custom verification email.
     */

    public String getTemplateSubject() {
        return this.templateSubject;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     * 
     * @param templateSubject
     *        The subject line of the custom verification email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateMetadata withTemplateSubject(String templateSubject) {
        setTemplateSubject(templateSubject);
        return this;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
     * </p>
     * 
     * @param successRedirectionURL
     *        The URL that the recipient of the verification email is sent to if his or her address is successfully
     *        verified.
     */

    public void setSuccessRedirectionURL(String successRedirectionURL) {
        this.successRedirectionURL = successRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
     * </p>
     * 
     * @return The URL that the recipient of the verification email is sent to if his or her address is successfully
     *         verified.
     */

    public String getSuccessRedirectionURL() {
        return this.successRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
     * </p>
     * 
     * @param successRedirectionURL
     *        The URL that the recipient of the verification email is sent to if his or her address is successfully
     *        verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateMetadata withSuccessRedirectionURL(String successRedirectionURL) {
        setSuccessRedirectionURL(successRedirectionURL);
        return this;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is not successfully
     * verified.
     * </p>
     * 
     * @param failureRedirectionURL
     *        The URL that the recipient of the verification email is sent to if his or her address is not successfully
     *        verified.
     */

    public void setFailureRedirectionURL(String failureRedirectionURL) {
        this.failureRedirectionURL = failureRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is not successfully
     * verified.
     * </p>
     * 
     * @return The URL that the recipient of the verification email is sent to if his or her address is not successfully
     *         verified.
     */

    public String getFailureRedirectionURL() {
        return this.failureRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or her address is not successfully
     * verified.
     * </p>
     * 
     * @param failureRedirectionURL
     *        The URL that the recipient of the verification email is sent to if his or her address is not successfully
     *        verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateMetadata withFailureRedirectionURL(String failureRedirectionURL) {
        setFailureRedirectionURL(failureRedirectionURL);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append(getFromEmailAddress()).append(",");
        if (getTemplateSubject() != null)
            sb.append("TemplateSubject: ").append(getTemplateSubject()).append(",");
        if (getSuccessRedirectionURL() != null)
            sb.append("SuccessRedirectionURL: ").append(getSuccessRedirectionURL()).append(",");
        if (getFailureRedirectionURL() != null)
            sb.append("FailureRedirectionURL: ").append(getFailureRedirectionURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomVerificationEmailTemplateMetadata == false)
            return false;
        CustomVerificationEmailTemplateMetadata other = (CustomVerificationEmailTemplateMetadata) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getTemplateSubject() == null ^ this.getTemplateSubject() == null)
            return false;
        if (other.getTemplateSubject() != null && other.getTemplateSubject().equals(this.getTemplateSubject()) == false)
            return false;
        if (other.getSuccessRedirectionURL() == null ^ this.getSuccessRedirectionURL() == null)
            return false;
        if (other.getSuccessRedirectionURL() != null && other.getSuccessRedirectionURL().equals(this.getSuccessRedirectionURL()) == false)
            return false;
        if (other.getFailureRedirectionURL() == null ^ this.getFailureRedirectionURL() == null)
            return false;
        if (other.getFailureRedirectionURL() != null && other.getFailureRedirectionURL().equals(this.getFailureRedirectionURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getTemplateSubject() == null) ? 0 : getTemplateSubject().hashCode());
        hashCode = prime * hashCode + ((getSuccessRedirectionURL() == null) ? 0 : getSuccessRedirectionURL().hashCode());
        hashCode = prime * hashCode + ((getFailureRedirectionURL() == null) ? 0 : getFailureRedirectionURL().hashCode());
        return hashCode;
    }

    @Override
    public CustomVerificationEmailTemplateMetadata clone() {
        try {
            return (CustomVerificationEmailTemplateMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.CustomVerificationEmailTemplateMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
