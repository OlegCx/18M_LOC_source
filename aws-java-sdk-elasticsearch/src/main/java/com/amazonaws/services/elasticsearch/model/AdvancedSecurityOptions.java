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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database
 * option is enabled.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedSecurityOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     */
    private Boolean internalUserDatabaseEnabled;
    /**
     * <p>
     * Describes the SAML application configured for a domain.
     * </p>
     */
    private SAMLOptionsOutput sAMLOptions;

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @param enabled
     *        True if advanced security is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @return True if advanced security is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @param enabled
     *        True if advanced security is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @return True if advanced security is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True if the internal user database is enabled.
     */

    public void setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @return True if the internal user database is enabled.
     */

    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True if the internal user database is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptions withInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        setInternalUserDatabaseEnabled(internalUserDatabaseEnabled);
        return this;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @return True if the internal user database is enabled.
     */

    public Boolean isInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Describes the SAML application configured for a domain.
     * </p>
     * 
     * @param sAMLOptions
     *        Describes the SAML application configured for a domain.
     */

    public void setSAMLOptions(SAMLOptionsOutput sAMLOptions) {
        this.sAMLOptions = sAMLOptions;
    }

    /**
     * <p>
     * Describes the SAML application configured for a domain.
     * </p>
     * 
     * @return Describes the SAML application configured for a domain.
     */

    public SAMLOptionsOutput getSAMLOptions() {
        return this.sAMLOptions;
    }

    /**
     * <p>
     * Describes the SAML application configured for a domain.
     * </p>
     * 
     * @param sAMLOptions
     *        Describes the SAML application configured for a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptions withSAMLOptions(SAMLOptionsOutput sAMLOptions) {
        setSAMLOptions(sAMLOptions);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getInternalUserDatabaseEnabled() != null)
            sb.append("InternalUserDatabaseEnabled: ").append(getInternalUserDatabaseEnabled()).append(",");
        if (getSAMLOptions() != null)
            sb.append("SAMLOptions: ").append(getSAMLOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedSecurityOptions == false)
            return false;
        AdvancedSecurityOptions other = (AdvancedSecurityOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getInternalUserDatabaseEnabled() == null ^ this.getInternalUserDatabaseEnabled() == null)
            return false;
        if (other.getInternalUserDatabaseEnabled() != null && other.getInternalUserDatabaseEnabled().equals(this.getInternalUserDatabaseEnabled()) == false)
            return false;
        if (other.getSAMLOptions() == null ^ this.getSAMLOptions() == null)
            return false;
        if (other.getSAMLOptions() != null && other.getSAMLOptions().equals(this.getSAMLOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getInternalUserDatabaseEnabled() == null) ? 0 : getInternalUserDatabaseEnabled().hashCode());
        hashCode = prime * hashCode + ((getSAMLOptions() == null) ? 0 : getSAMLOptions().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedSecurityOptions clone() {
        try {
            return (AdvancedSecurityOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AdvancedSecurityOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
