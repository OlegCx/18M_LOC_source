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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of a gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GatewaySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewaySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines
     * data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     */
    private java.util.List<GatewayCapabilitySummary> gatewayCapabilitySummaries;
    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway device.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     * 
     * @return The ID of the gateway device.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param gatewayName
     *        The name of the asset.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param gatewayName
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines
     * data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * 
     * @return A list of gateway capability summaries that each contain a namespace and status. Each gateway capability
     *         defines data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *         >DescribeGatewayCapabilityConfiguration</a>.
     */

    public java.util.List<GatewayCapabilitySummary> getGatewayCapabilitySummaries() {
        return gatewayCapabilitySummaries;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines
     * data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * 
     * @param gatewayCapabilitySummaries
     *        A list of gateway capability summaries that each contain a namespace and status. Each gateway capability
     *        defines data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *        >DescribeGatewayCapabilityConfiguration</a>.
     */

    public void setGatewayCapabilitySummaries(java.util.Collection<GatewayCapabilitySummary> gatewayCapabilitySummaries) {
        if (gatewayCapabilitySummaries == null) {
            this.gatewayCapabilitySummaries = null;
            return;
        }

        this.gatewayCapabilitySummaries = new java.util.ArrayList<GatewayCapabilitySummary>(gatewayCapabilitySummaries);
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines
     * data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayCapabilitySummaries(java.util.Collection)} or
     * {@link #withGatewayCapabilitySummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param gatewayCapabilitySummaries
     *        A list of gateway capability summaries that each contain a namespace and status. Each gateway capability
     *        defines data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *        >DescribeGatewayCapabilityConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withGatewayCapabilitySummaries(GatewayCapabilitySummary... gatewayCapabilitySummaries) {
        if (this.gatewayCapabilitySummaries == null) {
            setGatewayCapabilitySummaries(new java.util.ArrayList<GatewayCapabilitySummary>(gatewayCapabilitySummaries.length));
        }
        for (GatewayCapabilitySummary ele : gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines
     * data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * 
     * @param gatewayCapabilitySummaries
     *        A list of gateway capability summaries that each contain a namespace and status. Each gateway capability
     *        defines data sources for the gateway. To retrieve a capability configuration's definition, use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *        >DescribeGatewayCapabilityConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withGatewayCapabilitySummaries(java.util.Collection<GatewayCapabilitySummary> gatewayCapabilitySummaries) {
        setGatewayCapabilitySummaries(gatewayCapabilitySummaries);
        return this;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the gateway was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the gateway was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the gateway was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the gateway was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the gateway was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the gateway was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
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
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getGatewayName() != null)
            sb.append("GatewayName: ").append(getGatewayName()).append(",");
        if (getGatewayCapabilitySummaries() != null)
            sb.append("GatewayCapabilitySummaries: ").append(getGatewayCapabilitySummaries()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewaySummary == false)
            return false;
        GatewaySummary other = (GatewaySummary) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayCapabilitySummaries() == null ^ this.getGatewayCapabilitySummaries() == null)
            return false;
        if (other.getGatewayCapabilitySummaries() != null && other.getGatewayCapabilitySummaries().equals(this.getGatewayCapabilitySummaries()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayCapabilitySummaries() == null) ? 0 : getGatewayCapabilitySummaries().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public GatewaySummary clone() {
        try {
            return (GatewaySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.GatewaySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
