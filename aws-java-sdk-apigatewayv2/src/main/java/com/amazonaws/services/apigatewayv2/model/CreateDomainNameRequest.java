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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new DomainName resource to represent a domain name.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The domain name configurations.
     * </p>
     */
    private java.util.List<DomainNameConfiguration> domainNameConfigurations;
    /**
     * <p>
     * The mutual TLS authentication configuration for a custom domain name.
     * </p>
     */
    private MutualTlsAuthenticationInput mutualTlsAuthentication;
    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @return The domain name configurations.
     */

    public java.util.List<DomainNameConfiguration> getDomainNameConfigurations() {
        return domainNameConfigurations;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     */

    public void setDomainNameConfigurations(java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        if (domainNameConfigurations == null) {
            this.domainNameConfigurations = null;
            return;
        }

        this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(domainNameConfigurations);
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainNameConfigurations(java.util.Collection)} or
     * {@link #withDomainNameConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withDomainNameConfigurations(DomainNameConfiguration... domainNameConfigurations) {
        if (this.domainNameConfigurations == null) {
            setDomainNameConfigurations(new java.util.ArrayList<DomainNameConfiguration>(domainNameConfigurations.length));
        }
        for (DomainNameConfiguration ele : domainNameConfigurations) {
            this.domainNameConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withDomainNameConfigurations(java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        setDomainNameConfigurations(domainNameConfigurations);
        return this;
    }

    /**
     * <p>
     * The mutual TLS authentication configuration for a custom domain name.
     * </p>
     * 
     * @param mutualTlsAuthentication
     *        The mutual TLS authentication configuration for a custom domain name.
     */

    public void setMutualTlsAuthentication(MutualTlsAuthenticationInput mutualTlsAuthentication) {
        this.mutualTlsAuthentication = mutualTlsAuthentication;
    }

    /**
     * <p>
     * The mutual TLS authentication configuration for a custom domain name.
     * </p>
     * 
     * @return The mutual TLS authentication configuration for a custom domain name.
     */

    public MutualTlsAuthenticationInput getMutualTlsAuthentication() {
        return this.mutualTlsAuthentication;
    }

    /**
     * <p>
     * The mutual TLS authentication configuration for a custom domain name.
     * </p>
     * 
     * @param mutualTlsAuthentication
     *        The mutual TLS authentication configuration for a custom domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withMutualTlsAuthentication(MutualTlsAuthenticationInput mutualTlsAuthentication) {
        setMutualTlsAuthentication(mutualTlsAuthentication);
        return this;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @return The collection of tags associated with a domain name.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @param tags
     *        The collection of tags associated with a domain name.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @param tags
     *        The collection of tags associated with a domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDomainNameRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainNameConfigurations() != null)
            sb.append("DomainNameConfigurations: ").append(getDomainNameConfigurations()).append(",");
        if (getMutualTlsAuthentication() != null)
            sb.append("MutualTlsAuthentication: ").append(getMutualTlsAuthentication()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainNameRequest == false)
            return false;
        CreateDomainNameRequest other = (CreateDomainNameRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainNameConfigurations() == null ^ this.getDomainNameConfigurations() == null)
            return false;
        if (other.getDomainNameConfigurations() != null && other.getDomainNameConfigurations().equals(this.getDomainNameConfigurations()) == false)
            return false;
        if (other.getMutualTlsAuthentication() == null ^ this.getMutualTlsAuthentication() == null)
            return false;
        if (other.getMutualTlsAuthentication() != null && other.getMutualTlsAuthentication().equals(this.getMutualTlsAuthentication()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainNameConfigurations() == null) ? 0 : getDomainNameConfigurations().hashCode());
        hashCode = prime * hashCode + ((getMutualTlsAuthentication() == null) ? 0 : getMutualTlsAuthentication().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainNameRequest clone() {
        return (CreateDomainNameRequest) super.clone();
    }

}
