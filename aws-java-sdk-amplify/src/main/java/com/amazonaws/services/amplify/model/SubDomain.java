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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The subdomain for the domain association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/SubDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubDomain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     */
    private SubDomainSetting subDomainSetting;
    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     */
    private Boolean verified;
    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     */
    private String dnsRecord;

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * 
     * @param subDomainSetting
     *        Describes the settings for the subdomain.
     */

    public void setSubDomainSetting(SubDomainSetting subDomainSetting) {
        this.subDomainSetting = subDomainSetting;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * 
     * @return Describes the settings for the subdomain.
     */

    public SubDomainSetting getSubDomainSetting() {
        return this.subDomainSetting;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * 
     * @param subDomainSetting
     *        Describes the settings for the subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubDomain withSubDomainSetting(SubDomainSetting subDomainSetting) {
        setSubDomainSetting(subDomainSetting);
        return this;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     * 
     * @param verified
     *        The verified status of the subdomain
     */

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     * 
     * @return The verified status of the subdomain
     */

    public Boolean getVerified() {
        return this.verified;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     * 
     * @param verified
     *        The verified status of the subdomain
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubDomain withVerified(Boolean verified) {
        setVerified(verified);
        return this;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     * 
     * @return The verified status of the subdomain
     */

    public Boolean isVerified() {
        return this.verified;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * 
     * @param dnsRecord
     *        The DNS record for the subdomain.
     */

    public void setDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * 
     * @return The DNS record for the subdomain.
     */

    public String getDnsRecord() {
        return this.dnsRecord;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * 
     * @param dnsRecord
     *        The DNS record for the subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubDomain withDnsRecord(String dnsRecord) {
        setDnsRecord(dnsRecord);
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
        if (getSubDomainSetting() != null)
            sb.append("SubDomainSetting: ").append(getSubDomainSetting()).append(",");
        if (getVerified() != null)
            sb.append("Verified: ").append(getVerified()).append(",");
        if (getDnsRecord() != null)
            sb.append("DnsRecord: ").append(getDnsRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubDomain == false)
            return false;
        SubDomain other = (SubDomain) obj;
        if (other.getSubDomainSetting() == null ^ this.getSubDomainSetting() == null)
            return false;
        if (other.getSubDomainSetting() != null && other.getSubDomainSetting().equals(this.getSubDomainSetting()) == false)
            return false;
        if (other.getVerified() == null ^ this.getVerified() == null)
            return false;
        if (other.getVerified() != null && other.getVerified().equals(this.getVerified()) == false)
            return false;
        if (other.getDnsRecord() == null ^ this.getDnsRecord() == null)
            return false;
        if (other.getDnsRecord() != null && other.getDnsRecord().equals(this.getDnsRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubDomainSetting() == null) ? 0 : getSubDomainSetting().hashCode());
        hashCode = prime * hashCode + ((getVerified() == null) ? 0 : getVerified().hashCode());
        hashCode = prime * hashCode + ((getDnsRecord() == null) ? 0 : getDnsRecord().hashCode());
        return hashCode;
    }

    @Override
    public SubDomain clone() {
        try {
            return (SubDomain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.SubDomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
