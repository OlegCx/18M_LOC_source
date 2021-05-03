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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DescribeCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:</p>
     *         <p>
     *         <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a>.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateRequest withCertificateArn(String certificateArn) {
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

        if (obj instanceof DescribeCertificateRequest == false)
            return false;
        DescribeCertificateRequest other = (DescribeCertificateRequest) obj;
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

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateRequest clone() {
        return (DescribeCertificateRequest) super.clone();
    }

}
