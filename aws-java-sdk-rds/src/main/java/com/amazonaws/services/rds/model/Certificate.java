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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A CA certificate for an AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable {

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     */
    private String certificateIdentifier;
    /**
     * <p>
     * The type of the certificate.
     * </p>
     */
    private String certificateType;
    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     */
    private String thumbprint;
    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     */
    private java.util.Date validTill;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     */
    private Boolean customerOverride;
    /**
     * <p>
     * If there is an override for the default certificate identifier, when the override expires.
     * </p>
     */
    private java.util.Date customerOverrideValidTill;

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * 
     * @param certificateIdentifier
     *        The unique key that identifies a certificate.
     */

    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * 
     * @return The unique key that identifies a certificate.
     */

    public String getCertificateIdentifier() {
        return this.certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * 
     * @param certificateIdentifier
     *        The unique key that identifies a certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateIdentifier(String certificateIdentifier) {
        setCertificateIdentifier(certificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * 
     * @param certificateType
     *        The type of the certificate.
     */

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * 
     * @return The type of the certificate.
     */

    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * 
     * @param certificateType
     *        The type of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateType(String certificateType) {
        setCertificateType(certificateType);
        return this;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     * 
     * @param thumbprint
     *        The thumbprint of the certificate.
     */

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     * 
     * @return The thumbprint of the certificate.
     */

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     * 
     * @param thumbprint
     *        The thumbprint of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withThumbprint(String thumbprint) {
        setThumbprint(thumbprint);
        return this;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     * 
     * @param validFrom
     *        The starting date from which the certificate is valid.
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     * 
     * @return The starting date from which the certificate is valid.
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     * 
     * @param validFrom
     *        The starting date from which the certificate is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     * 
     * @param validTill
     *        The final date that the certificate continues to be valid.
     */

    public void setValidTill(java.util.Date validTill) {
        this.validTill = validTill;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     * 
     * @return The final date that the certificate continues to be valid.
     */

    public java.util.Date getValidTill() {
        return this.validTill;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     * 
     * @param validTill
     *        The final date that the certificate continues to be valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withValidTill(java.util.Date validTill) {
        setValidTill(validTill);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     * 
     * @param customerOverride
     *        Whether there is an override for the default certificate identifier.
     */

    public void setCustomerOverride(Boolean customerOverride) {
        this.customerOverride = customerOverride;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     * 
     * @return Whether there is an override for the default certificate identifier.
     */

    public Boolean getCustomerOverride() {
        return this.customerOverride;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     * 
     * @param customerOverride
     *        Whether there is an override for the default certificate identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCustomerOverride(Boolean customerOverride) {
        setCustomerOverride(customerOverride);
        return this;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     * 
     * @return Whether there is an override for the default certificate identifier.
     */

    public Boolean isCustomerOverride() {
        return this.customerOverride;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the override expires.
     * </p>
     * 
     * @param customerOverrideValidTill
     *        If there is an override for the default certificate identifier, when the override expires.
     */

    public void setCustomerOverrideValidTill(java.util.Date customerOverrideValidTill) {
        this.customerOverrideValidTill = customerOverrideValidTill;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the override expires.
     * </p>
     * 
     * @return If there is an override for the default certificate identifier, when the override expires.
     */

    public java.util.Date getCustomerOverrideValidTill() {
        return this.customerOverrideValidTill;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the override expires.
     * </p>
     * 
     * @param customerOverrideValidTill
     *        If there is an override for the default certificate identifier, when the override expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCustomerOverrideValidTill(java.util.Date customerOverrideValidTill) {
        setCustomerOverrideValidTill(customerOverrideValidTill);
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: ").append(getCertificateIdentifier()).append(",");
        if (getCertificateType() != null)
            sb.append("CertificateType: ").append(getCertificateType()).append(",");
        if (getThumbprint() != null)
            sb.append("Thumbprint: ").append(getThumbprint()).append(",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: ").append(getValidFrom()).append(",");
        if (getValidTill() != null)
            sb.append("ValidTill: ").append(getValidTill()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCustomerOverride() != null)
            sb.append("CustomerOverride: ").append(getCustomerOverride()).append(",");
        if (getCustomerOverrideValidTill() != null)
            sb.append("CustomerOverrideValidTill: ").append(getCustomerOverrideValidTill());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getCertificateType() == null ^ this.getCertificateType() == null)
            return false;
        if (other.getCertificateType() != null && other.getCertificateType().equals(this.getCertificateType()) == false)
            return false;
        if (other.getThumbprint() == null ^ this.getThumbprint() == null)
            return false;
        if (other.getThumbprint() != null && other.getThumbprint().equals(this.getThumbprint()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidTill() == null ^ this.getValidTill() == null)
            return false;
        if (other.getValidTill() != null && other.getValidTill().equals(this.getValidTill()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCustomerOverride() == null ^ this.getCustomerOverride() == null)
            return false;
        if (other.getCustomerOverride() != null && other.getCustomerOverride().equals(this.getCustomerOverride()) == false)
            return false;
        if (other.getCustomerOverrideValidTill() == null ^ this.getCustomerOverrideValidTill() == null)
            return false;
        if (other.getCustomerOverrideValidTill() != null && other.getCustomerOverrideValidTill().equals(this.getCustomerOverrideValidTill()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        hashCode = prime * hashCode + ((getThumbprint() == null) ? 0 : getThumbprint().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidTill() == null) ? 0 : getValidTill().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerOverride() == null) ? 0 : getCustomerOverride().hashCode());
        hashCode = prime * hashCode + ((getCustomerOverrideValidTill() == null) ? 0 : getCustomerOverrideValidTill().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
