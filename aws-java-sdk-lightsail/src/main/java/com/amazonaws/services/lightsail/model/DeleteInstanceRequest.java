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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * </p>
     */
    private Boolean forceDeleteAddOns;

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to delete.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * 
     * @return The name of the instance to delete.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * </p>
     * 
     * @param forceDeleteAddOns
     *        A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     */

    public void setForceDeleteAddOns(Boolean forceDeleteAddOns) {
        this.forceDeleteAddOns = forceDeleteAddOns;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * </p>
     * 
     * @return A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     */

    public Boolean getForceDeleteAddOns() {
        return this.forceDeleteAddOns;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * </p>
     * 
     * @param forceDeleteAddOns
     *        A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceRequest withForceDeleteAddOns(Boolean forceDeleteAddOns) {
        setForceDeleteAddOns(forceDeleteAddOns);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     * </p>
     * 
     * @return A Boolean value to indicate whether to delete the enabled add-ons for the disk.
     */

    public Boolean isForceDeleteAddOns() {
        return this.forceDeleteAddOns;
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getForceDeleteAddOns() != null)
            sb.append("ForceDeleteAddOns: ").append(getForceDeleteAddOns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceRequest == false)
            return false;
        DeleteInstanceRequest other = (DeleteInstanceRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getForceDeleteAddOns() == null ^ this.getForceDeleteAddOns() == null)
            return false;
        if (other.getForceDeleteAddOns() != null && other.getForceDeleteAddOns().equals(this.getForceDeleteAddOns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getForceDeleteAddOns() == null) ? 0 : getForceDeleteAddOns().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceRequest clone() {
        return (DeleteInstanceRequest) super.clone();
    }

}
