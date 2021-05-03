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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateIdentityProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdentityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The identity provider name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The identity provider details to be updated, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     */
    private java.util.Map<String, String> providerDetails;
    /**
     * <p>
     * The identity provider attribute mapping to be changed.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;
    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @return The identity provider name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The identity provider details to be updated, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @return The identity provider details to be updated, such as <code>MetadataURL</code> and
     *         <code>MetadataFile</code>.
     */

    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The identity provider details to be updated, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @param providerDetails
     *        The identity provider details to be updated, such as <code>MetadataURL</code> and
     *        <code>MetadataFile</code>.
     */

    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The identity provider details to be updated, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @param providerDetails
     *        The identity provider details to be updated, such as <code>MetadataURL</code> and
     *        <code>MetadataFile</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withProviderDetails(java.util.Map<String, String> providerDetails) {
        setProviderDetails(providerDetails);
        return this;
    }

    /**
     * Add a single ProviderDetails entry
     *
     * @see UpdateIdentityProviderRequest#withProviderDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * The identity provider attribute mapping to be changed.
     * </p>
     * 
     * @return The identity provider attribute mapping to be changed.
     */

    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * The identity provider attribute mapping to be changed.
     * </p>
     * 
     * @param attributeMapping
     *        The identity provider attribute mapping to be changed.
     */

    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * The identity provider attribute mapping to be changed.
     * </p>
     * 
     * @param attributeMapping
     *        The identity provider attribute mapping to be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withAttributeMapping(java.util.Map<String, String> attributeMapping) {
        setAttributeMapping(attributeMapping);
        return this;
    }

    /**
     * Add a single AttributeMapping entry
     *
     * @see UpdateIdentityProviderRequest#withAttributeMapping
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @return A list of identity provider identifiers.
     */

    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     */

    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdpIdentifiers(java.util.Collection)} or {@link #withIdpIdentifiers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withIdpIdentifiers(String... idpIdentifiers) {
        if (this.idpIdentifiers == null) {
            setIdpIdentifiers(new java.util.ArrayList<String>(idpIdentifiers.length));
        }
        for (String ele : idpIdentifiers) {
            this.idpIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderRequest withIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: ").append(getProviderDetails()).append(",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: ").append(getAttributeMapping()).append(",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: ").append(getIdpIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentityProviderRequest == false)
            return false;
        UpdateIdentityProviderRequest other = (UpdateIdentityProviderRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdentityProviderRequest clone() {
        return (UpdateIdentityProviderRequest) super.clone();
    }

}
