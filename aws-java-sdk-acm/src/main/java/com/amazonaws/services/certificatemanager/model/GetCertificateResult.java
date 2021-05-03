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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ACM-issued certificate corresponding to the ARN specified as input.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs.
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * The ACM-issued certificate corresponding to the ARN specified as input.
     * </p>
     * 
     * @param certificate
     *        The ACM-issued certificate corresponding to the ARN specified as input.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The ACM-issued certificate corresponding to the ARN specified as input.
     * </p>
     * 
     * @return The ACM-issued certificate corresponding to the ARN specified as input.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The ACM-issued certificate corresponding to the ARN specified as input.
     * </p>
     * 
     * @param certificate
     *        The ACM-issued certificate corresponding to the ARN specified as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateResult withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs.
     * </p>
     * 
     * @param certificateChain
     *        Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of
     *        the issuing CA and the intermediate certificates of any other subordinate CAs.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs.
     * </p>
     * 
     * @return Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of
     *         the issuing CA and the intermediate certificates of any other subordinate CAs.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs.
     * </p>
     * 
     * @param certificateChain
     *        Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of
     *        the issuing CA and the intermediate certificates of any other subordinate CAs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateResult withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCertificateResult == false)
            return false;
        GetCertificateResult other = (GetCertificateResult) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public GetCertificateResult clone() {
        try {
            return (GetCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
