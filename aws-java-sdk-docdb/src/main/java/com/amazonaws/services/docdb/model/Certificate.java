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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A certificate authority (CA) certificate for an AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable {

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * <p>
     * Example: <code>rds-ca-2019</code>
     * </p>
     */
    private String certificateIdentifier;
    /**
     * <p>
     * The type of the certificate.
     * </p>
     * <p>
     * Example: <code>CA</code>
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
     * The starting date-time from which the certificate is valid.
     * </p>
     * <p>
     * Example: <code>2019-07-31T17:57:09Z</code>
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The date-time after which the certificate is no longer valid.
     * </p>
     * <p>
     * Example: <code>2024-07-31T17:57:09Z</code>
     * </p>
     */
    private java.util.Date validTill;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * <p>
     * Example: <code>rds-ca-2019</code>
     * </p>
     * 
     * @param certificateIdentifier
     *        The unique key that identifies a certificate.</p>
     *        <p>
     *        Example: <code>rds-ca-2019</code>
     */

    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * <p>
     * Example: <code>rds-ca-2019</code>
     * </p>
     * 
     * @return The unique key that identifies a certificate.</p>
     *         <p>
     *         Example: <code>rds-ca-2019</code>
     */

    public String getCertificateIdentifier() {
        return this.certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * <p>
     * Example: <code>rds-ca-2019</code>
     * </p>
     * 
     * @param certificateIdentifier
     *        The unique key that identifies a certificate.</p>
     *        <p>
     *        Example: <code>rds-ca-2019</code>
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
     * <p>
     * Example: <code>CA</code>
     * </p>
     * 
     * @param certificateType
     *        The type of the certificate.</p>
     *        <p>
     *        Example: <code>CA</code>
     */

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * <p>
     * Example: <code>CA</code>
     * </p>
     * 
     * @return The type of the certificate.</p>
     *         <p>
     *         Example: <code>CA</code>
     */

    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * <p>
     * Example: <code>CA</code>
     * </p>
     * 
     * @param certificateType
     *        The type of the certificate.</p>
     *        <p>
     *        Example: <code>CA</code>
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
     * The starting date-time from which the certificate is valid.
     * </p>
     * <p>
     * Example: <code>2019-07-31T17:57:09Z</code>
     * </p>
     * 
     * @param validFrom
     *        The starting date-time from which the certificate is valid.</p>
     *        <p>
     *        Example: <code>2019-07-31T17:57:09Z</code>
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The starting date-time from which the certificate is valid.
     * </p>
     * <p>
     * Example: <code>2019-07-31T17:57:09Z</code>
     * </p>
     * 
     * @return The starting date-time from which the certificate is valid.</p>
     *         <p>
     *         Example: <code>2019-07-31T17:57:09Z</code>
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The starting date-time from which the certificate is valid.
     * </p>
     * <p>
     * Example: <code>2019-07-31T17:57:09Z</code>
     * </p>
     * 
     * @param validFrom
     *        The starting date-time from which the certificate is valid.</p>
     *        <p>
     *        Example: <code>2019-07-31T17:57:09Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The date-time after which the certificate is no longer valid.
     * </p>
     * <p>
     * Example: <code>2024-07-31T17:57:09Z</code>
     * </p>
     * 
     * @param validTill
     *        The date-time after which the certificate is no longer valid.</p>
     *        <p>
     *        Example: <code>2024-07-31T17:57:09Z</code>
     */

    public void setValidTill(java.util.Date validTill) {
        this.validTill = validTill;
    }

    /**
     * <p>
     * The date-time after which the certificate is no longer valid.
     * </p>
     * <p>
     * Example: <code>2024-07-31T17:57:09Z</code>
     * </p>
     * 
     * @return The date-time after which the certificate is no longer valid.</p>
     *         <p>
     *         Example: <code>2024-07-31T17:57:09Z</code>
     */

    public java.util.Date getValidTill() {
        return this.validTill;
    }

    /**
     * <p>
     * The date-time after which the certificate is no longer valid.
     * </p>
     * <p>
     * Example: <code>2024-07-31T17:57:09Z</code>
     * </p>
     * 
     * @param validTill
     *        The date-time after which the certificate is no longer valid.</p>
     *        <p>
     *        Example: <code>2024-07-31T17:57:09Z</code>
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
     * <p>
     * Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.</p>
     *        <p>
     *        Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate.</p>
     *         <p>
     *         Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.</p>
     *        <p>
     *        Example: <code>arn:aws:rds:us-east-1::cert:rds-ca-2019</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
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
            sb.append("CertificateArn: ").append(getCertificateArn());
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
