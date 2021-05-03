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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch permission modification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchPermissionModifications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchPermissionModifications implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID to add to the list of launch permissions for the AMI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchPermission> add;
    /**
     * <p>
     * The AWS account ID to remove from the list of launch permissions for the AMI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchPermission> remove;

    /**
     * <p>
     * The AWS account ID to add to the list of launch permissions for the AMI.
     * </p>
     * 
     * @return The AWS account ID to add to the list of launch permissions for the AMI.
     */

    public java.util.List<LaunchPermission> getAdd() {
        if (add == null) {
            add = new com.amazonaws.internal.SdkInternalList<LaunchPermission>();
        }
        return add;
    }

    /**
     * <p>
     * The AWS account ID to add to the list of launch permissions for the AMI.
     * </p>
     * 
     * @param add
     *        The AWS account ID to add to the list of launch permissions for the AMI.
     */

    public void setAdd(java.util.Collection<LaunchPermission> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new com.amazonaws.internal.SdkInternalList<LaunchPermission>(add);
    }

    /**
     * <p>
     * The AWS account ID to add to the list of launch permissions for the AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdd(java.util.Collection)} or {@link #withAdd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param add
     *        The AWS account ID to add to the list of launch permissions for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionModifications withAdd(LaunchPermission... add) {
        if (this.add == null) {
            setAdd(new com.amazonaws.internal.SdkInternalList<LaunchPermission>(add.length));
        }
        for (LaunchPermission ele : add) {
            this.add.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account ID to add to the list of launch permissions for the AMI.
     * </p>
     * 
     * @param add
     *        The AWS account ID to add to the list of launch permissions for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionModifications withAdd(java.util.Collection<LaunchPermission> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The AWS account ID to remove from the list of launch permissions for the AMI.
     * </p>
     * 
     * @return The AWS account ID to remove from the list of launch permissions for the AMI.
     */

    public java.util.List<LaunchPermission> getRemove() {
        if (remove == null) {
            remove = new com.amazonaws.internal.SdkInternalList<LaunchPermission>();
        }
        return remove;
    }

    /**
     * <p>
     * The AWS account ID to remove from the list of launch permissions for the AMI.
     * </p>
     * 
     * @param remove
     *        The AWS account ID to remove from the list of launch permissions for the AMI.
     */

    public void setRemove(java.util.Collection<LaunchPermission> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }

        this.remove = new com.amazonaws.internal.SdkInternalList<LaunchPermission>(remove);
    }

    /**
     * <p>
     * The AWS account ID to remove from the list of launch permissions for the AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemove(java.util.Collection)} or {@link #withRemove(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param remove
     *        The AWS account ID to remove from the list of launch permissions for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionModifications withRemove(LaunchPermission... remove) {
        if (this.remove == null) {
            setRemove(new com.amazonaws.internal.SdkInternalList<LaunchPermission>(remove.length));
        }
        for (LaunchPermission ele : remove) {
            this.remove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account ID to remove from the list of launch permissions for the AMI.
     * </p>
     * 
     * @param remove
     *        The AWS account ID to remove from the list of launch permissions for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionModifications withRemove(java.util.Collection<LaunchPermission> remove) {
        setRemove(remove);
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
        if (getAdd() != null)
            sb.append("Add: ").append(getAdd()).append(",");
        if (getRemove() != null)
            sb.append("Remove: ").append(getRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPermissionModifications == false)
            return false;
        LaunchPermissionModifications other = (LaunchPermissionModifications) obj;
        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getRemove() == null ^ this.getRemove() == null)
            return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getRemove() == null) ? 0 : getRemove().hashCode());
        return hashCode;
    }

    @Override
    public LaunchPermissionModifications clone() {
        try {
            return (LaunchPermissionModifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
