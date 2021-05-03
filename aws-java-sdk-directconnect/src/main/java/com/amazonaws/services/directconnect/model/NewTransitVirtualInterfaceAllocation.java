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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a transit virtual interface to be provisioned on a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/NewTransitVirtualInterfaceAllocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewTransitVirtualInterfaceAllocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The
     * following are valid characters: a-z, 0-9 and a hyphen (-).
     * </p>
     */
    private String virtualInterfaceName;
    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;
    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     */
    private Integer asn;
    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;
    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun
     * lenth of 80 characters.
     * </p>
     */
    private String authKey;
    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     */
    private String amazonAddress;
    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;
    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The
     * following are valid characters: a-z, 0-9 and a hyphen (-).
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network. The name has a maximum of 100
     *        characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The
     * following are valid characters: a-z, 0-9 and a hyphen (-).
     * </p>
     * 
     * @return The name of the virtual interface assigned by the customer network. The name has a maximum of 100
     *         characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The
     * following are valid characters: a-z, 0-9 and a hyphen (-).
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network. The name has a maximum of 100
     *        characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @return The ID of the VLAN.
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.</p>
     *        <p>
     *        The valid values are 1-2147483647.
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     * 
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.</p>
     *         <p>
     *         The valid values are 1-2147483647.
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.</p>
     *        <p>
     *        The valid values are 1-2147483647.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     */

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @return The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *         is 1500.
     */

    public Integer getMtu() {
        return this.mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withMtu(Integer mtu) {
        setMtu(mtu);
        return this;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun
     * lenth of 80 characters.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a
     *        maximun lenth of 80 characters.
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun
     * lenth of 80 characters.
     * </p>
     * 
     * @return The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a
     *         maximun lenth of 80 characters.
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun
     * lenth of 80 characters.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a
     *        maximun lenth of 80 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @return The IP address assigned to the Amazon interface.
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @return The IP address assigned to the customer interface.
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @return The address family for the BGP peer.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewTransitVirtualInterfaceAllocation withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewTransitVirtualInterfaceAllocation withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     * 
     * @return The tags associated with the transitive virtual interface.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     * 
     * @param tags
     *        The tags associated with the transitive virtual interface.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the transitive virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     * 
     * @param tags
     *        The tags associated with the transitive virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewTransitVirtualInterfaceAllocation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVirtualInterfaceName() != null)
            sb.append("VirtualInterfaceName: ").append(getVirtualInterfaceName()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getMtu() != null)
            sb.append("Mtu: ").append(getMtu()).append(",");
        if (getAuthKey() != null)
            sb.append("AuthKey: ").append(getAuthKey()).append(",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: ").append(getAmazonAddress()).append(",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: ").append(getCustomerAddress()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewTransitVirtualInterfaceAllocation == false)
            return false;
        NewTransitVirtualInterfaceAllocation other = (NewTransitVirtualInterfaceAllocation) obj;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NewTransitVirtualInterfaceAllocation clone() {
        try {
            return (NewTransitVirtualInterfaceAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.NewTransitVirtualInterfaceAllocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
