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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * BrokerNodeInfo
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerNodeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerNodeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     */
    private String attachedENIId;
    /**
     * <p>
     * The ID of the broker.
     * </p>
     */
    private Double brokerId;
    /**
     * <p>
     * The client subnet to which this broker node belongs.
     * </p>
     */
    private String clientSubnet;
    /**
     * <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     */
    private String clientVpcIpAddress;
    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     */
    private BrokerSoftwareInfo currentBrokerSoftwareInfo;
    /**
     * <p>
     * Endpoints for accessing the broker.
     * </p>
     */
    private java.util.List<String> endpoints;

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @param attachedENIId
     *        <p>
     *        The attached elastic network interface of the broker.
     *        </p>
     */

    public void setAttachedENIId(String attachedENIId) {
        this.attachedENIId = attachedENIId;
    }

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @return <p>
     *         The attached elastic network interface of the broker.
     *         </p>
     */

    public String getAttachedENIId() {
        return this.attachedENIId;
    }

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @param attachedENIId
     *        <p>
     *        The attached elastic network interface of the broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withAttachedENIId(String attachedENIId) {
        setAttachedENIId(attachedENIId);
        return this;
    }

    /**
     * <p>
     * The ID of the broker.
     * </p>
     * 
     * @param brokerId
     *        <p>
     *        The ID of the broker.
     *        </p>
     */

    public void setBrokerId(Double brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * The ID of the broker.
     * </p>
     * 
     * @return <p>
     *         The ID of the broker.
     *         </p>
     */

    public Double getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * The ID of the broker.
     * </p>
     * 
     * @param brokerId
     *        <p>
     *        The ID of the broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withBrokerId(Double brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * <p>
     * The client subnet to which this broker node belongs.
     * </p>
     * 
     * @param clientSubnet
     *        <p>
     *        The client subnet to which this broker node belongs.
     *        </p>
     */

    public void setClientSubnet(String clientSubnet) {
        this.clientSubnet = clientSubnet;
    }

    /**
     * <p>
     * The client subnet to which this broker node belongs.
     * </p>
     * 
     * @return <p>
     *         The client subnet to which this broker node belongs.
     *         </p>
     */

    public String getClientSubnet() {
        return this.clientSubnet;
    }

    /**
     * <p>
     * The client subnet to which this broker node belongs.
     * </p>
     * 
     * @param clientSubnet
     *        <p>
     *        The client subnet to which this broker node belongs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withClientSubnet(String clientSubnet) {
        setClientSubnet(clientSubnet);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     * 
     * @param clientVpcIpAddress
     *        <p>
     *        The virtual private cloud (VPC) of the client.
     *        </p>
     */

    public void setClientVpcIpAddress(String clientVpcIpAddress) {
        this.clientVpcIpAddress = clientVpcIpAddress;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     * 
     * @return <p>
     *         The virtual private cloud (VPC) of the client.
     *         </p>
     */

    public String getClientVpcIpAddress() {
        return this.clientVpcIpAddress;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     * 
     * @param clientVpcIpAddress
     *        <p>
     *        The virtual private cloud (VPC) of the client.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withClientVpcIpAddress(String clientVpcIpAddress) {
        setClientVpcIpAddress(clientVpcIpAddress);
        return this;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        <p>
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *        </p>
     */

    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *         </p>
     */

    public BrokerSoftwareInfo getCurrentBrokerSoftwareInfo() {
        return this.currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        <p>
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        setCurrentBrokerSoftwareInfo(currentBrokerSoftwareInfo);
        return this;
    }

    /**
     * <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * @return <p>
     *         Endpoints for accessing the broker.
     *         </p>
     */

    public java.util.List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the broker.
     *        </p>
     */

    public void setEndpoints(java.util.Collection<String> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<String>(endpoints);
    }

    /**
     * <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withEndpoints(String... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<String>(endpoints.length));
        }
        for (String ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeInfo withEndpoints(java.util.Collection<String> endpoints) {
        setEndpoints(endpoints);
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
        if (getAttachedENIId() != null)
            sb.append("AttachedENIId: ").append(getAttachedENIId()).append(",");
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getClientSubnet() != null)
            sb.append("ClientSubnet: ").append(getClientSubnet()).append(",");
        if (getClientVpcIpAddress() != null)
            sb.append("ClientVpcIpAddress: ").append(getClientVpcIpAddress()).append(",");
        if (getCurrentBrokerSoftwareInfo() != null)
            sb.append("CurrentBrokerSoftwareInfo: ").append(getCurrentBrokerSoftwareInfo()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerNodeInfo == false)
            return false;
        BrokerNodeInfo other = (BrokerNodeInfo) obj;
        if (other.getAttachedENIId() == null ^ this.getAttachedENIId() == null)
            return false;
        if (other.getAttachedENIId() != null && other.getAttachedENIId().equals(this.getAttachedENIId()) == false)
            return false;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getClientSubnet() == null ^ this.getClientSubnet() == null)
            return false;
        if (other.getClientSubnet() != null && other.getClientSubnet().equals(this.getClientSubnet()) == false)
            return false;
        if (other.getClientVpcIpAddress() == null ^ this.getClientVpcIpAddress() == null)
            return false;
        if (other.getClientVpcIpAddress() != null && other.getClientVpcIpAddress().equals(this.getClientVpcIpAddress()) == false)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() == null ^ this.getCurrentBrokerSoftwareInfo() == null)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() != null && other.getCurrentBrokerSoftwareInfo().equals(this.getCurrentBrokerSoftwareInfo()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachedENIId() == null) ? 0 : getAttachedENIId().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getClientSubnet() == null) ? 0 : getClientSubnet().hashCode());
        hashCode = prime * hashCode + ((getClientVpcIpAddress() == null) ? 0 : getClientVpcIpAddress().hashCode());
        hashCode = prime * hashCode + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public BrokerNodeInfo clone() {
        try {
            return (BrokerNodeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerNodeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
