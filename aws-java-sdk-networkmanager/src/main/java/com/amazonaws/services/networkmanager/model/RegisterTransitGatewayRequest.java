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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTransitGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>.
     * </p>
     */
    private String transitGatewayArn;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTransitGatewayRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>.
     * </p>
     * 
     * @param transitGatewayArn
     *        The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *        >Resources Defined by Amazon EC2</a>.
     */

    public void setTransitGatewayArn(String transitGatewayArn) {
        this.transitGatewayArn = transitGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *         >Resources Defined by Amazon EC2</a>.
     */

    public String getTransitGatewayArn() {
        return this.transitGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>.
     * </p>
     * 
     * @param transitGatewayArn
     *        The Amazon Resource Name (ARN) of the transit gateway. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *        >Resources Defined by Amazon EC2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTransitGatewayRequest withTransitGatewayArn(String transitGatewayArn) {
        setTransitGatewayArn(transitGatewayArn);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getTransitGatewayArn() != null)
            sb.append("TransitGatewayArn: ").append(getTransitGatewayArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTransitGatewayRequest == false)
            return false;
        RegisterTransitGatewayRequest other = (RegisterTransitGatewayRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getTransitGatewayArn() == null ^ this.getTransitGatewayArn() == null)
            return false;
        if (other.getTransitGatewayArn() != null && other.getTransitGatewayArn().equals(this.getTransitGatewayArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayArn() == null) ? 0 : getTransitGatewayArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTransitGatewayRequest clone() {
        return (RegisterTransitGatewayRequest) super.clone();
    }

}
