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

/**
 * <zonbook></zonbook><xhtml></xhtml>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualRouter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVirtualRouterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your virtual router.
     * </p>
     */
    private VirtualRouterData virtualRouter;

    /**
     * <p>
     * The full description of your virtual router.
     * </p>
     * 
     * @param virtualRouter
     *        The full description of your virtual router.
     */

    public void setVirtualRouter(VirtualRouterData virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    /**
     * <p>
     * The full description of your virtual router.
     * </p>
     * 
     * @return The full description of your virtual router.
     */

    public VirtualRouterData getVirtualRouter() {
        return this.virtualRouter;
    }

    /**
     * <p>
     * The full description of your virtual router.
     * </p>
     * 
     * @param virtualRouter
     *        The full description of your virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualRouterResult withVirtualRouter(VirtualRouterData virtualRouter) {
        setVirtualRouter(virtualRouter);
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
        if (getVirtualRouter() != null)
            sb.append("VirtualRouter: ").append(getVirtualRouter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualRouterResult == false)
            return false;
        DescribeVirtualRouterResult other = (DescribeVirtualRouterResult) obj;
        if (other.getVirtualRouter() == null ^ this.getVirtualRouter() == null)
            return false;
        if (other.getVirtualRouter() != null && other.getVirtualRouter().equals(this.getVirtualRouter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualRouter() == null) ? 0 : getVirtualRouter().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVirtualRouterResult clone() {
        try {
            return (DescribeVirtualRouterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
