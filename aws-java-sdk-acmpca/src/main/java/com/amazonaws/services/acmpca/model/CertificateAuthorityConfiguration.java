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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information for your private certificate authority (CA). This includes information about the
 * class of public key algorithm and the key pair that your private CA creates when it issues a certificate. It also
 * includes the signature algorithm that it uses when issuing certificates, and its X.500 distinguished name. You must
 * specify this information when you call the <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
 * >CreateCertificateAuthority</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CertificateAuthorityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateAuthorityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     * certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * Name of the algorithm your private CA uses to sign certificate requests.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign certificates
     * when they are issued.
     * </p>
     */
    private String signingAlgorithm;
    /**
     * <p>
     * Structure that contains X.500 distinguished name information for your private CA.
     * </p>
     */
    private ASN1Subject subject;
    /**
     * <p>
     * Specifies information to be added to the extension section of the certificate signing request (CSR).
     * </p>
     */
    private CsrExtensions csrExtensions;

    /**
     * <p>
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     * certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * </p>
     * 
     * @param keyAlgorithm
     *        Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     *        certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     * certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * </p>
     * 
     * @return Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     *         certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * @see KeyAlgorithm
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     * certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * </p>
     * 
     * @param keyAlgorithm
     *        Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     *        certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public CertificateAuthorityConfiguration withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     * certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * </p>
     * 
     * @param keyAlgorithm
     *        Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a
     *        certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public CertificateAuthorityConfiguration withKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Name of the algorithm your private CA uses to sign certificate requests.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign certificates
     * when they are issued.
     * </p>
     * 
     * @param signingAlgorithm
     *        Name of the algorithm your private CA uses to sign certificate requests.</p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign
     *        certificates when they are issued.
     * @see SigningAlgorithm
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * Name of the algorithm your private CA uses to sign certificate requests.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign certificates
     * when they are issued.
     * </p>
     * 
     * @return Name of the algorithm your private CA uses to sign certificate requests.</p>
     *         <p>
     *         This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign
     *         certificates when they are issued.
     * @see SigningAlgorithm
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * Name of the algorithm your private CA uses to sign certificate requests.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign certificates
     * when they are issued.
     * </p>
     * 
     * @param signingAlgorithm
     *        Name of the algorithm your private CA uses to sign certificate requests.</p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign
     *        certificates when they are issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithm
     */

    public CertificateAuthorityConfiguration withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * Name of the algorithm your private CA uses to sign certificate requests.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign certificates
     * when they are issued.
     * </p>
     * 
     * @param signingAlgorithm
     *        Name of the algorithm your private CA uses to sign certificate requests.</p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign
     *        certificates when they are issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithm
     */

    public CertificateAuthorityConfiguration withSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Structure that contains X.500 distinguished name information for your private CA.
     * </p>
     * 
     * @param subject
     *        Structure that contains X.500 distinguished name information for your private CA.
     */

    public void setSubject(ASN1Subject subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * Structure that contains X.500 distinguished name information for your private CA.
     * </p>
     * 
     * @return Structure that contains X.500 distinguished name information for your private CA.
     */

    public ASN1Subject getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * Structure that contains X.500 distinguished name information for your private CA.
     * </p>
     * 
     * @param subject
     *        Structure that contains X.500 distinguished name information for your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthorityConfiguration withSubject(ASN1Subject subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * Specifies information to be added to the extension section of the certificate signing request (CSR).
     * </p>
     * 
     * @param csrExtensions
     *        Specifies information to be added to the extension section of the certificate signing request (CSR).
     */

    public void setCsrExtensions(CsrExtensions csrExtensions) {
        this.csrExtensions = csrExtensions;
    }

    /**
     * <p>
     * Specifies information to be added to the extension section of the certificate signing request (CSR).
     * </p>
     * 
     * @return Specifies information to be added to the extension section of the certificate signing request (CSR).
     */

    public CsrExtensions getCsrExtensions() {
        return this.csrExtensions;
    }

    /**
     * <p>
     * Specifies information to be added to the extension section of the certificate signing request (CSR).
     * </p>
     * 
     * @param csrExtensions
     *        Specifies information to be added to the extension section of the certificate signing request (CSR).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthorityConfiguration withCsrExtensions(CsrExtensions csrExtensions) {
        setCsrExtensions(csrExtensions);
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
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getCsrExtensions() != null)
            sb.append("CsrExtensions: ").append(getCsrExtensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateAuthorityConfiguration == false)
            return false;
        CertificateAuthorityConfiguration other = (CertificateAuthorityConfiguration) obj;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getCsrExtensions() == null ^ this.getCsrExtensions() == null)
            return false;
        if (other.getCsrExtensions() != null && other.getCsrExtensions().equals(this.getCsrExtensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getCsrExtensions() == null) ? 0 : getCsrExtensions().hashCode());
        return hashCode;
    }

    @Override
    public CertificateAuthorityConfiguration clone() {
        try {
            return (CertificateAuthorityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CertificateAuthorityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
