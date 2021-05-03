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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListenerCertificates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeListenerCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the certificates.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the certificates.
     * </p>
     * 
     * @return Information about the certificates.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * Information about the certificates.
     * </p>
     * 
     * @param certificates
     *        Information about the certificates.
     */

    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * Information about the certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        Information about the certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenerCertificatesResult withCertificates(Certificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        }
        for (Certificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the certificates.
     * </p>
     * 
     * @param certificates
     *        Information about the certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenerCertificatesResult withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @param nextMarker
     *        If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @return If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @param nextMarker
     *        If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenerCertificatesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeListenerCertificatesResult == false)
            return false;
        DescribeListenerCertificatesResult other = (DescribeListenerCertificatesResult) obj;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeListenerCertificatesResult clone() {
        try {
            return (DescribeListenerCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
