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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the options for a transit gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayOptions implements Serializable, Cloneable {

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * The transit gateway CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> transitGatewayCidrBlocks;
    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     */
    private String autoAcceptSharedAttachments;
    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with the default association route table.
     * </p>
     */
    private String defaultRouteTableAssociation;
    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     */
    private String associationDefaultRouteTableId;
    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     * </p>
     */
    private String defaultRouteTablePropagation;
    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     */
    private String propagationDefaultRouteTableId;
    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     */
    private String vpnEcmpSupport;
    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     */
    private String dnsSupport;
    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     */
    private String multicastSupport;

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @return A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to
     *         65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayOptions withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * The transit gateway CIDR blocks.
     * </p>
     * 
     * @return The transit gateway CIDR blocks.
     */

    public java.util.List<String> getTransitGatewayCidrBlocks() {
        if (transitGatewayCidrBlocks == null) {
            transitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return transitGatewayCidrBlocks;
    }

    /**
     * <p>
     * The transit gateway CIDR blocks.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway CIDR blocks.
     */

    public void setTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        if (transitGatewayCidrBlocks == null) {
            this.transitGatewayCidrBlocks = null;
            return;
        }

        this.transitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(transitGatewayCidrBlocks);
    }

    /**
     * <p>
     * The transit gateway CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayCidrBlocks(java.util.Collection)} or
     * {@link #withTransitGatewayCidrBlocks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayOptions withTransitGatewayCidrBlocks(String... transitGatewayCidrBlocks) {
        if (this.transitGatewayCidrBlocks == null) {
            setTransitGatewayCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(transitGatewayCidrBlocks.length));
        }
        for (String ele : transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The transit gateway CIDR blocks.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayOptions withTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        setTransitGatewayCidrBlocks(transitGatewayCidrBlocks);
        return this;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Indicates whether attachment requests are automatically accepted.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * 
     * @return Indicates whether attachment requests are automatically accepted.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Indicates whether attachment requests are automatically accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayOptions withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        setAutoAcceptSharedAttachments(autoAcceptSharedAttachments);
        return this;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Indicates whether attachment requests are automatically accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayOptions withAutoAcceptSharedAttachments(AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Indicates whether resource attachments are automatically associated with the default association route
     *        table.
     * @see DefaultRouteTableAssociationValue
     */

    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with the default association route table.
     * </p>
     * 
     * @return Indicates whether resource attachments are automatically associated with the default association route
     *         table.
     * @see DefaultRouteTableAssociationValue
     */

    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Indicates whether resource attachments are automatically associated with the default association route
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayOptions withDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        setDefaultRouteTableAssociation(defaultRouteTableAssociation);
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Indicates whether resource attachments are automatically associated with the default association route
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayOptions withDefaultRouteTableAssociation(DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @param associationDefaultRouteTableId
     *        The ID of the default association route table.
     */

    public void setAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @return The ID of the default association route table.
     */

    public String getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @param associationDefaultRouteTableId
     *        The ID of the default association route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayOptions withAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        setAssociationDefaultRouteTableId(associationDefaultRouteTableId);
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Indicates whether resource attachments automatically propagate routes to the default propagation route
     *        table.
     * @see DefaultRouteTablePropagationValue
     */

    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     * </p>
     * 
     * @return Indicates whether resource attachments automatically propagate routes to the default propagation route
     *         table.
     * @see DefaultRouteTablePropagationValue
     */

    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Indicates whether resource attachments automatically propagate routes to the default propagation route
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayOptions withDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        setDefaultRouteTablePropagation(defaultRouteTablePropagation);
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Indicates whether resource attachments automatically propagate routes to the default propagation route
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayOptions withDefaultRouteTablePropagation(DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @param propagationDefaultRouteTableId
     *        The ID of the default propagation route table.
     */

    public void setPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @return The ID of the default propagation route table.
     */

    public String getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @param propagationDefaultRouteTableId
     *        The ID of the default propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayOptions withPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        setPropagationDefaultRouteTableId(propagationDefaultRouteTableId);
        return this;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Indicates whether Equal Cost Multipath Protocol support is enabled.
     * @see VpnEcmpSupportValue
     */

    public void setVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * 
     * @return Indicates whether Equal Cost Multipath Protocol support is enabled.
     * @see VpnEcmpSupportValue
     */

    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Indicates whether Equal Cost Multipath Protocol support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayOptions withVpnEcmpSupport(String vpnEcmpSupport) {
        setVpnEcmpSupport(vpnEcmpSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Indicates whether Equal Cost Multipath Protocol support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayOptions withVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @see DnsSupportValue
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @return Indicates whether DNS support is enabled.
     * @see DnsSupportValue
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayOptions withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @see MulticastSupportValue
     */

    public void setMulticastSupport(String multicastSupport) {
        this.multicastSupport = multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @return Indicates whether multicast is enabled on the transit gateway
     * @see MulticastSupportValue
     */

    public String getMulticastSupport() {
        return this.multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MulticastSupportValue
     */

    public TransitGatewayOptions withMulticastSupport(String multicastSupport) {
        setMulticastSupport(multicastSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MulticastSupportValue
     */

    public TransitGatewayOptions withMulticastSupport(MulticastSupportValue multicastSupport) {
        this.multicastSupport = multicastSupport.toString();
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
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn()).append(",");
        if (getTransitGatewayCidrBlocks() != null)
            sb.append("TransitGatewayCidrBlocks: ").append(getTransitGatewayCidrBlocks()).append(",");
        if (getAutoAcceptSharedAttachments() != null)
            sb.append("AutoAcceptSharedAttachments: ").append(getAutoAcceptSharedAttachments()).append(",");
        if (getDefaultRouteTableAssociation() != null)
            sb.append("DefaultRouteTableAssociation: ").append(getDefaultRouteTableAssociation()).append(",");
        if (getAssociationDefaultRouteTableId() != null)
            sb.append("AssociationDefaultRouteTableId: ").append(getAssociationDefaultRouteTableId()).append(",");
        if (getDefaultRouteTablePropagation() != null)
            sb.append("DefaultRouteTablePropagation: ").append(getDefaultRouteTablePropagation()).append(",");
        if (getPropagationDefaultRouteTableId() != null)
            sb.append("PropagationDefaultRouteTableId: ").append(getPropagationDefaultRouteTableId()).append(",");
        if (getVpnEcmpSupport() != null)
            sb.append("VpnEcmpSupport: ").append(getVpnEcmpSupport()).append(",");
        if (getDnsSupport() != null)
            sb.append("DnsSupport: ").append(getDnsSupport()).append(",");
        if (getMulticastSupport() != null)
            sb.append("MulticastSupport: ").append(getMulticastSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayOptions == false)
            return false;
        TransitGatewayOptions other = (TransitGatewayOptions) obj;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getTransitGatewayCidrBlocks() == null ^ this.getTransitGatewayCidrBlocks() == null)
            return false;
        if (other.getTransitGatewayCidrBlocks() != null && other.getTransitGatewayCidrBlocks().equals(this.getTransitGatewayCidrBlocks()) == false)
            return false;
        if (other.getAutoAcceptSharedAttachments() == null ^ this.getAutoAcceptSharedAttachments() == null)
            return false;
        if (other.getAutoAcceptSharedAttachments() != null && other.getAutoAcceptSharedAttachments().equals(this.getAutoAcceptSharedAttachments()) == false)
            return false;
        if (other.getDefaultRouteTableAssociation() == null ^ this.getDefaultRouteTableAssociation() == null)
            return false;
        if (other.getDefaultRouteTableAssociation() != null && other.getDefaultRouteTableAssociation().equals(this.getDefaultRouteTableAssociation()) == false)
            return false;
        if (other.getAssociationDefaultRouteTableId() == null ^ this.getAssociationDefaultRouteTableId() == null)
            return false;
        if (other.getAssociationDefaultRouteTableId() != null
                && other.getAssociationDefaultRouteTableId().equals(this.getAssociationDefaultRouteTableId()) == false)
            return false;
        if (other.getDefaultRouteTablePropagation() == null ^ this.getDefaultRouteTablePropagation() == null)
            return false;
        if (other.getDefaultRouteTablePropagation() != null && other.getDefaultRouteTablePropagation().equals(this.getDefaultRouteTablePropagation()) == false)
            return false;
        if (other.getPropagationDefaultRouteTableId() == null ^ this.getPropagationDefaultRouteTableId() == null)
            return false;
        if (other.getPropagationDefaultRouteTableId() != null
                && other.getPropagationDefaultRouteTableId().equals(this.getPropagationDefaultRouteTableId()) == false)
            return false;
        if (other.getVpnEcmpSupport() == null ^ this.getVpnEcmpSupport() == null)
            return false;
        if (other.getVpnEcmpSupport() != null && other.getVpnEcmpSupport().equals(this.getVpnEcmpSupport()) == false)
            return false;
        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getMulticastSupport() == null ^ this.getMulticastSupport() == null)
            return false;
        if (other.getMulticastSupport() != null && other.getMulticastSupport().equals(this.getMulticastSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayCidrBlocks() == null) ? 0 : getTransitGatewayCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getAutoAcceptSharedAttachments() == null) ? 0 : getAutoAcceptSharedAttachments().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTableAssociation() == null) ? 0 : getDefaultRouteTableAssociation().hashCode());
        hashCode = prime * hashCode + ((getAssociationDefaultRouteTableId() == null) ? 0 : getAssociationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTablePropagation() == null) ? 0 : getDefaultRouteTablePropagation().hashCode());
        hashCode = prime * hashCode + ((getPropagationDefaultRouteTableId() == null) ? 0 : getPropagationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpnEcmpSupport() == null) ? 0 : getVpnEcmpSupport().hashCode());
        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getMulticastSupport() == null) ? 0 : getMulticastSupport().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayOptions clone() {
        try {
            return (TransitGatewayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
