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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <zonbook></zonbook><xhtml></xhtml>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The name of the route to describe.
     * </p>
     */
    private String routeName;
    /**
     * <p>
     * The name of the virtual router that the route is associated with.
     * </p>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the route resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @return The name of the service mesh that the route resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the route resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *         the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteRequest withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The name of the route to describe.
     * </p>
     * 
     * @param routeName
     *        The name of the route to describe.
     */

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * <p>
     * The name of the route to describe.
     * </p>
     * 
     * @return The name of the route to describe.
     */

    public String getRouteName() {
        return this.routeName;
    }

    /**
     * <p>
     * The name of the route to describe.
     * </p>
     * 
     * @param routeName
     *        The name of the route to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteRequest withRouteName(String routeName) {
        setRouteName(routeName);
        return this;
    }

    /**
     * <p>
     * The name of the virtual router that the route is associated with.
     * </p>
     * 
     * @param virtualRouterName
     *        The name of the virtual router that the route is associated with.
     */

    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router that the route is associated with.
     * </p>
     * 
     * @return The name of the virtual router that the route is associated with.
     */

    public String getVirtualRouterName() {
        return this.virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router that the route is associated with.
     * </p>
     * 
     * @param virtualRouterName
     *        The name of the virtual router that the route is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteRequest withVirtualRouterName(String virtualRouterName) {
        setVirtualRouterName(virtualRouterName);
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
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getRouteName() != null)
            sb.append("RouteName: ").append(getRouteName()).append(",");
        if (getVirtualRouterName() != null)
            sb.append("VirtualRouterName: ").append(getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRouteRequest == false)
            return false;
        DescribeRouteRequest other = (DescribeRouteRequest) obj;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getRouteName() == null ^ this.getRouteName() == null)
            return false;
        if (other.getRouteName() != null && other.getRouteName().equals(this.getRouteName()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        hashCode = prime * hashCode + ((getVirtualRouterName() == null) ? 0 : getVirtualRouterName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouteRequest clone() {
        return (DescribeRouteRequest) super.clone();
    }

}
