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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for associating a license configuration with a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     */
    private String licenseConfigurationArn;
    /**
     * <p>
     * Scope of AMI associations. The possible value is <code>cross-account</code>.
     * </p>
     */
    private String amiAssociationScope;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Amazon Resource Name (ARN) of the license configuration.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license configuration.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Amazon Resource Name (ARN) of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseSpecification withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Scope of AMI associations. The possible value is <code>cross-account</code>.
     * </p>
     * 
     * @param amiAssociationScope
     *        Scope of AMI associations. The possible value is <code>cross-account</code>.
     */

    public void setAmiAssociationScope(String amiAssociationScope) {
        this.amiAssociationScope = amiAssociationScope;
    }

    /**
     * <p>
     * Scope of AMI associations. The possible value is <code>cross-account</code>.
     * </p>
     * 
     * @return Scope of AMI associations. The possible value is <code>cross-account</code>.
     */

    public String getAmiAssociationScope() {
        return this.amiAssociationScope;
    }

    /**
     * <p>
     * Scope of AMI associations. The possible value is <code>cross-account</code>.
     * </p>
     * 
     * @param amiAssociationScope
     *        Scope of AMI associations. The possible value is <code>cross-account</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseSpecification withAmiAssociationScope(String amiAssociationScope) {
        setAmiAssociationScope(amiAssociationScope);
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn()).append(",");
        if (getAmiAssociationScope() != null)
            sb.append("AmiAssociationScope: ").append(getAmiAssociationScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseSpecification == false)
            return false;
        LicenseSpecification other = (LicenseSpecification) obj;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        if (other.getAmiAssociationScope() == null ^ this.getAmiAssociationScope() == null)
            return false;
        if (other.getAmiAssociationScope() != null && other.getAmiAssociationScope().equals(this.getAmiAssociationScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getAmiAssociationScope() == null) ? 0 : getAmiAssociationScope().hashCode());
        return hashCode;
    }

    @Override
    public LicenseSpecification clone() {
        try {
            return (LicenseSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
