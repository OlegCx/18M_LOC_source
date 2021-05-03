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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about a device's network profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeviceNetworkProfileInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceNetworkProfileInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     */
    private String networkProfileArn;
    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     */
    private java.util.Date certificateExpirationTime;

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileArn
     *        The ARN of the network profile associated with a device.
     */

    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @return The ARN of the network profile associated with a device.
     */

    public String getNetworkProfileArn() {
        return this.networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileArn
     *        The ARN of the network profile associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceNetworkProfileInfo withNetworkProfileArn(String networkProfileArn) {
        setNetworkProfileArn(networkProfileArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate associated with a device.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * 
     * @return The ARN of the certificate associated with a device.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceNetworkProfileInfo withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     * 
     * @param certificateExpirationTime
     *        The time (in epoch) when the certificate expires.
     */

    public void setCertificateExpirationTime(java.util.Date certificateExpirationTime) {
        this.certificateExpirationTime = certificateExpirationTime;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     * 
     * @return The time (in epoch) when the certificate expires.
     */

    public java.util.Date getCertificateExpirationTime() {
        return this.certificateExpirationTime;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     * 
     * @param certificateExpirationTime
     *        The time (in epoch) when the certificate expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceNetworkProfileInfo withCertificateExpirationTime(java.util.Date certificateExpirationTime) {
        setCertificateExpirationTime(certificateExpirationTime);
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
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: ").append(getNetworkProfileArn()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificateExpirationTime() != null)
            sb.append("CertificateExpirationTime: ").append(getCertificateExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceNetworkProfileInfo == false)
            return false;
        DeviceNetworkProfileInfo other = (DeviceNetworkProfileInfo) obj;
        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateExpirationTime() == null ^ this.getCertificateExpirationTime() == null)
            return false;
        if (other.getCertificateExpirationTime() != null && other.getCertificateExpirationTime().equals(this.getCertificateExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateExpirationTime() == null) ? 0 : getCertificateExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public DeviceNetworkProfileInfo clone() {
        try {
            return (DeviceNetworkProfileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.DeviceNetworkProfileInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
