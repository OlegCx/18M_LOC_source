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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a virtual gateway's listener's Transport Layer Security (TLS) validation context.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayListenerTlsValidationContext"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayListenerTlsValidationContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer Security (TLS)
     * validation context.
     * </p>
     */
    private SubjectAlternativeNames subjectAlternativeNames;
    /**
     * <p>
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     * certificate.
     * </p>
     */
    private VirtualGatewayListenerTlsValidationContextTrust trust;

    /**
     * <p>
     * A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer Security (TLS)
     * validation context.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer
     *        Security (TLS) validation context.
     */

    public void setSubjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    /**
     * <p>
     * A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer Security (TLS)
     * validation context.
     * </p>
     * 
     * @return A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer
     *         Security (TLS) validation context.
     */

    public SubjectAlternativeNames getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * <p>
     * A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer Security (TLS)
     * validation context.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer
     *        Security (TLS) validation context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTlsValidationContext withSubjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     * certificate.
     * </p>
     * 
     * @param trust
     *        A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     *        certificate.
     */

    public void setTrust(VirtualGatewayListenerTlsValidationContextTrust trust) {
        this.trust = trust;
    }

    /**
     * <p>
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     * certificate.
     * </p>
     * 
     * @return A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     *         certificate.
     */

    public VirtualGatewayListenerTlsValidationContextTrust getTrust() {
        return this.trust;
    }

    /**
     * <p>
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     * certificate.
     * </p>
     * 
     * @param trust
     *        A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS)
     *        certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTlsValidationContext withTrust(VirtualGatewayListenerTlsValidationContextTrust trust) {
        setTrust(trust);
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
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getTrust() != null)
            sb.append("Trust: ").append(getTrust());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayListenerTlsValidationContext == false)
            return false;
        VirtualGatewayListenerTlsValidationContext other = (VirtualGatewayListenerTlsValidationContext) obj;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getTrust() == null ^ this.getTrust() == null)
            return false;
        if (other.getTrust() != null && other.getTrust().equals(this.getTrust()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getTrust() == null) ? 0 : getTrust().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayListenerTlsValidationContext clone() {
        try {
            return (VirtualGatewayListenerTlsValidationContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayListenerTlsValidationContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
