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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     */
    private String updateId;
    /**
     * <p>
     * The name of the Amazon EKS node group associated with the update.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     */
    private String addonName;

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster associated with the update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the update.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster associated with the update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster associated with the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @param updateId
     *        The ID of the update to describe.
     */

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @return The ID of the update to describe.
     */

    public String getUpdateId() {
        return this.updateId;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @param updateId
     *        The ID of the update to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withUpdateId(String updateId) {
        setUpdateId(updateId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EKS node group associated with the update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the Amazon EKS node group associated with the update.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name of the Amazon EKS node group associated with the update.
     * </p>
     * 
     * @return The name of the Amazon EKS node group associated with the update.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name of the Amazon EKS node group associated with the update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the Amazon EKS node group associated with the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @return The name of the add-on. The name must match one of the names returned by <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *         </a>.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withAddonName(String addonName) {
        setAddonName(addonName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUpdateId() != null)
            sb.append("UpdateId: ").append(getUpdateId()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUpdateRequest == false)
            return false;
        DescribeUpdateRequest other = (DescribeUpdateRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUpdateId() == null ^ this.getUpdateId() == null)
            return false;
        if (other.getUpdateId() != null && other.getUpdateId().equals(this.getUpdateId()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUpdateRequest clone() {
        return (DescribeUpdateRequest) super.clone();
    }

}
