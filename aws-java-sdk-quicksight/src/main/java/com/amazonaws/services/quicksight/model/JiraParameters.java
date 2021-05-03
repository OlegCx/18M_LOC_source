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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Jira parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/JiraParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JiraParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     */
    private String siteBaseUrl;

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * 
     * @param siteBaseUrl
     *        The base URL of the Jira site.
     */

    public void setSiteBaseUrl(String siteBaseUrl) {
        this.siteBaseUrl = siteBaseUrl;
    }

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * 
     * @return The base URL of the Jira site.
     */

    public String getSiteBaseUrl() {
        return this.siteBaseUrl;
    }

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * 
     * @param siteBaseUrl
     *        The base URL of the Jira site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraParameters withSiteBaseUrl(String siteBaseUrl) {
        setSiteBaseUrl(siteBaseUrl);
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
        if (getSiteBaseUrl() != null)
            sb.append("SiteBaseUrl: ").append(getSiteBaseUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JiraParameters == false)
            return false;
        JiraParameters other = (JiraParameters) obj;
        if (other.getSiteBaseUrl() == null ^ this.getSiteBaseUrl() == null)
            return false;
        if (other.getSiteBaseUrl() != null && other.getSiteBaseUrl().equals(this.getSiteBaseUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteBaseUrl() == null) ? 0 : getSiteBaseUrl().hashCode());
        return hashCode;
    }

    @Override
    public JiraParameters clone() {
        try {
            return (JiraParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.JiraParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
