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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the gateway to get.
     * </p>
     */
    private String gatewayArn;

    /**
     * <p>
     * The ARN of the gateway to get.
     * </p>
     * 
     * @param gatewayArn
     *        The ARN of the gateway to get.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway to get.
     * </p>
     * 
     * @return The ARN of the gateway to get.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway to get.
     * </p>
     * 
     * @param gatewayArn
     *        The ARN of the gateway to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayRequest == false)
            return false;
        GetGatewayRequest other = (GetGatewayRequest) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        return hashCode;
    }

    @Override
    public GetGatewayRequest clone() {
        return (GetGatewayRequest) super.clone();
    }

}
