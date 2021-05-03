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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DescribeTunnel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTunnelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The tunnel being described.
     * </p>
     */
    private Tunnel tunnel;

    /**
     * <p>
     * The tunnel being described.
     * </p>
     * 
     * @param tunnel
     *        The tunnel being described.
     */

    public void setTunnel(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    /**
     * <p>
     * The tunnel being described.
     * </p>
     * 
     * @return The tunnel being described.
     */

    public Tunnel getTunnel() {
        return this.tunnel;
    }

    /**
     * <p>
     * The tunnel being described.
     * </p>
     * 
     * @param tunnel
     *        The tunnel being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTunnelResult withTunnel(Tunnel tunnel) {
        setTunnel(tunnel);
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
        if (getTunnel() != null)
            sb.append("Tunnel: ").append(getTunnel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTunnelResult == false)
            return false;
        DescribeTunnelResult other = (DescribeTunnelResult) obj;
        if (other.getTunnel() == null ^ this.getTunnel() == null)
            return false;
        if (other.getTunnel() != null && other.getTunnel().equals(this.getTunnel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnel() == null) ? 0 : getTunnel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTunnelResult clone() {
        try {
            return (DescribeTunnelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
