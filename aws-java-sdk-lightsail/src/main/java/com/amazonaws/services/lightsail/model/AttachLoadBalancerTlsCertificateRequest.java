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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachLoadBalancerTlsCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS certificate.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer to which you want to associate the SSL/TLS certificate.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS certificate.
     * </p>
     * 
     * @return The name of the load balancer to which you want to associate the SSL/TLS certificate.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to which you want to associate the SSL/TLS certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer to which you want to associate the SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of your SSL/TLS certificate.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * 
     * @return The name of your SSL/TLS certificate.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of your SSL/TLS certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of your SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachLoadBalancerTlsCertificateRequest == false)
            return false;
        AttachLoadBalancerTlsCertificateRequest other = (AttachLoadBalancerTlsCertificateRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        return hashCode;
    }

    @Override
    public AttachLoadBalancerTlsCertificateRequest clone() {
        return (AttachLoadBalancerTlsCertificateRequest) super.clone();
    }

}
