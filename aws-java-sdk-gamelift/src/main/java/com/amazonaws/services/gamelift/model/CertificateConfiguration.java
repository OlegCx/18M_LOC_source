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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines whether a TLS/SSL certificate is generated for a fleet. This feature must be enabled when creating the
 * fleet. All instances in a fleet share the same certificate. The certificate can be retrieved by calling the <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html">GameLift Server SDK</a>
 * operation <code>GetInstanceCertificate</code>.
 * </p>
 * <p>
 * A fleet's certificate configuration is part of <a>FleetAttributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CertificateConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     */
    private String certificateType;

    /**
     * <p>
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param certificateType
     *        Indicates whether a TLS/SSL certificate is generated for a fleet. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @see CertificateType
     */

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * <p>
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @return Indicates whether a TLS/SSL certificate is generated for a fleet. </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     * @see CertificateType
     */

    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * <p>
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param certificateType
     *        Indicates whether a TLS/SSL certificate is generated for a fleet. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateConfiguration withCertificateType(String certificateType) {
        setCertificateType(certificateType);
        return this;
    }

    /**
     * <p>
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param certificateType
     *        Indicates whether a TLS/SSL certificate is generated for a fleet. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateConfiguration withCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType.toString();
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
        if (getCertificateType() != null)
            sb.append("CertificateType: ").append(getCertificateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateConfiguration == false)
            return false;
        CertificateConfiguration other = (CertificateConfiguration) obj;
        if (other.getCertificateType() == null ^ this.getCertificateType() == null)
            return false;
        if (other.getCertificateType() != null && other.getCertificateType().equals(this.getCertificateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        return hashCode;
    }

    @Override
    public CertificateConfiguration clone() {
        try {
            return (CertificateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.CertificateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
