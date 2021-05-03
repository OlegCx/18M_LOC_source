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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for an endpoint. Each endpoint group can include one or more endpoints, such as load balancers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/EndpointDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the
     * Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP
     * address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID.
     * </p>
     * <p>
     * An Application Load Balancer can be either internal or internet-facing.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator
     * to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5,
     * 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is
     * routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html">Endpoint
     * Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     */
    private Integer weight;
    /**
     * <p>
     * The health status of the endpoint.
     * </p>
     */
    private String healthState;
    /**
     * <p>
     * Returns a null result.
     * </p>
     */
    private String healthReason;
    /**
     * <p>
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value
     * is true or false. The default value is true for new accelerators.
     * </p>
     * <p>
     * If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code> request
     * header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html"> Viewing
     * Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     */
    private Boolean clientIPPreservationEnabled;

    /**
     * <p>
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the
     * Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP
     * address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID.
     * </p>
     * <p>
     * An Application Load Balancer can be either internal or internet-facing.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is
     *        the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
     *        Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. </p>
     *        <p>
     *        An Application Load Balancer can be either internal or internet-facing.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the
     * Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP
     * address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID.
     * </p>
     * <p>
     * An Application Load Balancer can be either internal or internet-facing.
     * </p>
     * 
     * @return An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is
     *         the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
     *         Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. </p>
     *         <p>
     *         An Application Load Balancer can be either internal or internet-facing.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the
     * Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP
     * address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID.
     * </p>
     * <p>
     * An Application Load Balancer can be either internal or internet-facing.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is
     *        the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
     *        Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. </p>
     *        <p>
     *        An Application Load Balancer can be either internal or internet-facing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDescription withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator
     * to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5,
     * 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is
     * routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html">Endpoint
     * Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param weight
     *        The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global
     *        Accelerator to route traffic based on proportions that you specify. For example, you might specify
     *        endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is
     *        routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to
     *        the last endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html"
     *        >Endpoint Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator
     * to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5,
     * 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is
     * routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html">Endpoint
     * Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @return The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global
     *         Accelerator to route traffic based on proportions that you specify. For example, you might specify
     *         endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is
     *         routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed
     *         to the last endpoint. For more information, see <a
     *         href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html"
     *         >Endpoint Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator
     * to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5,
     * 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is
     * routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html">Endpoint
     * Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param weight
     *        The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global
     *        Accelerator to route traffic based on proportions that you specify. For example, you might specify
     *        endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is
     *        routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to
     *        the last endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html"
     *        >Endpoint Weights</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDescription withWeight(Integer weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The health status of the endpoint.
     * </p>
     * 
     * @param healthState
     *        The health status of the endpoint.
     * @see HealthState
     */

    public void setHealthState(String healthState) {
        this.healthState = healthState;
    }

    /**
     * <p>
     * The health status of the endpoint.
     * </p>
     * 
     * @return The health status of the endpoint.
     * @see HealthState
     */

    public String getHealthState() {
        return this.healthState;
    }

    /**
     * <p>
     * The health status of the endpoint.
     * </p>
     * 
     * @param healthState
     *        The health status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthState
     */

    public EndpointDescription withHealthState(String healthState) {
        setHealthState(healthState);
        return this;
    }

    /**
     * <p>
     * The health status of the endpoint.
     * </p>
     * 
     * @param healthState
     *        The health status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthState
     */

    public EndpointDescription withHealthState(HealthState healthState) {
        this.healthState = healthState.toString();
        return this;
    }

    /**
     * <p>
     * Returns a null result.
     * </p>
     * 
     * @param healthReason
     *        Returns a null result.
     */

    public void setHealthReason(String healthReason) {
        this.healthReason = healthReason;
    }

    /**
     * <p>
     * Returns a null result.
     * </p>
     * 
     * @return Returns a null result.
     */

    public String getHealthReason() {
        return this.healthReason;
    }

    /**
     * <p>
     * Returns a null result.
     * </p>
     * 
     * @param healthReason
     *        Returns a null result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDescription withHealthReason(String healthReason) {
        setHealthReason(healthReason);
        return this;
    }

    /**
     * <p>
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value
     * is true or false. The default value is true for new accelerators.
     * </p>
     * <p>
     * If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code> request
     * header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html"> Viewing
     * Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param clientIPPreservationEnabled
     *        Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The
     *        value is true or false. The default value is true for new accelerators. </p>
     *        <p>
     *        If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code>
     *        request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the
     *        accelerator.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html">
     *        Viewing Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer
     *        Guide</i>.
     */

    public void setClientIPPreservationEnabled(Boolean clientIPPreservationEnabled) {
        this.clientIPPreservationEnabled = clientIPPreservationEnabled;
    }

    /**
     * <p>
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value
     * is true or false. The default value is true for new accelerators.
     * </p>
     * <p>
     * If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code> request
     * header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html"> Viewing
     * Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @return Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint.
     *         The value is true or false. The default value is true for new accelerators. </p>
     *         <p>
     *         If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code>
     *         request header as traffic travels to applications on the Application Load Balancer endpoint fronted by
     *         the accelerator.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html">
     *         Viewing Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer
     *         Guide</i>.
     */

    public Boolean getClientIPPreservationEnabled() {
        return this.clientIPPreservationEnabled;
    }

    /**
     * <p>
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value
     * is true or false. The default value is true for new accelerators.
     * </p>
     * <p>
     * If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code> request
     * header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html"> Viewing
     * Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param clientIPPreservationEnabled
     *        Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The
     *        value is true or false. The default value is true for new accelerators. </p>
     *        <p>
     *        If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code>
     *        request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the
     *        accelerator.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html">
     *        Viewing Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDescription withClientIPPreservationEnabled(Boolean clientIPPreservationEnabled) {
        setClientIPPreservationEnabled(clientIPPreservationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value
     * is true or false. The default value is true for new accelerators.
     * </p>
     * <p>
     * If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code> request
     * header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html"> Viewing
     * Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @return Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint.
     *         The value is true or false. The default value is true for new accelerators. </p>
     *         <p>
     *         If the value is set to true, the client's IP address is preserved in the <code>X-Forwarded-For</code>
     *         request header as traffic travels to applications on the Application Load Balancer endpoint fronted by
     *         the accelerator.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-how-it-works-client-ip.html">
     *         Viewing Client IP Addresses in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer
     *         Guide</i>.
     */

    public Boolean isClientIPPreservationEnabled() {
        return this.clientIPPreservationEnabled;
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getHealthState() != null)
            sb.append("HealthState: ").append(getHealthState()).append(",");
        if (getHealthReason() != null)
            sb.append("HealthReason: ").append(getHealthReason()).append(",");
        if (getClientIPPreservationEnabled() != null)
            sb.append("ClientIPPreservationEnabled: ").append(getClientIPPreservationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDescription == false)
            return false;
        EndpointDescription other = (EndpointDescription) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getHealthState() == null ^ this.getHealthState() == null)
            return false;
        if (other.getHealthState() != null && other.getHealthState().equals(this.getHealthState()) == false)
            return false;
        if (other.getHealthReason() == null ^ this.getHealthReason() == null)
            return false;
        if (other.getHealthReason() != null && other.getHealthReason().equals(this.getHealthReason()) == false)
            return false;
        if (other.getClientIPPreservationEnabled() == null ^ this.getClientIPPreservationEnabled() == null)
            return false;
        if (other.getClientIPPreservationEnabled() != null && other.getClientIPPreservationEnabled().equals(this.getClientIPPreservationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getHealthState() == null) ? 0 : getHealthState().hashCode());
        hashCode = prime * hashCode + ((getHealthReason() == null) ? 0 : getHealthReason().hashCode());
        hashCode = prime * hashCode + ((getClientIPPreservationEnabled() == null) ? 0 : getClientIPPreservationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public EndpointDescription clone() {
        try {
            return (EndpointDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.EndpointDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
