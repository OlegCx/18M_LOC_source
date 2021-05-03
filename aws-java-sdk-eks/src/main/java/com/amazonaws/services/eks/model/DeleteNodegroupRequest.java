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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteNodegroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNodegroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with your node group.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the node group to delete.
     * </p>
     */
    private String nodegroupName;

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with your node group.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that is associated with your node group.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with your node group.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster that is associated with your node group.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with your node group.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that is associated with your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNodegroupRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the node group to delete.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the node group to delete.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name of the node group to delete.
     * </p>
     * 
     * @return The name of the node group to delete.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name of the node group to delete.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the node group to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNodegroupRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNodegroupRequest == false)
            return false;
        DeleteNodegroupRequest other = (DeleteNodegroupRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNodegroupRequest clone() {
        return (DeleteNodegroupRequest) super.clone();
    }

}
