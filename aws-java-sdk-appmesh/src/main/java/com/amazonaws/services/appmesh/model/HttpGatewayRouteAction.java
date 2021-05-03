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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the action to take if a match is determined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpGatewayRouteAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRouteAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the target that traffic is routed to when a request matches the gateway route.
     * </p>
     */
    private GatewayRouteTarget target;

    /**
     * <p>
     * An object that represents the target that traffic is routed to when a request matches the gateway route.
     * </p>
     * 
     * @param target
     *        An object that represents the target that traffic is routed to when a request matches the gateway route.
     */

    public void setTarget(GatewayRouteTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * An object that represents the target that traffic is routed to when a request matches the gateway route.
     * </p>
     * 
     * @return An object that represents the target that traffic is routed to when a request matches the gateway route.
     */

    public GatewayRouteTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * An object that represents the target that traffic is routed to when a request matches the gateway route.
     * </p>
     * 
     * @param target
     *        An object that represents the target that traffic is routed to when a request matches the gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteAction withTarget(GatewayRouteTarget target) {
        setTarget(target);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpGatewayRouteAction == false)
            return false;
        HttpGatewayRouteAction other = (HttpGatewayRouteAction) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public HttpGatewayRouteAction clone() {
        try {
            return (HttpGatewayRouteAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpGatewayRouteActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
