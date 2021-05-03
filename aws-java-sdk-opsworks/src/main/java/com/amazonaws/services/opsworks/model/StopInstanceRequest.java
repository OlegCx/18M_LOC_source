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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     * EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call disassociates the
     * AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks Stacks instance. You must
     * also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks
     * instance with a new one.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     * EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call disassociates the
     * AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks Stacks instance. You must
     * also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks
     * instance with a new one.
     * </p>
     * 
     * @param force
     *        Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     *        EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call
     *        disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks
     *        Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and
     *        replacing the AWS OpsWorks Stacks instance with a new one.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     * EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call disassociates the
     * AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks Stacks instance. You must
     * also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks
     * instance with a new one.
     * </p>
     * 
     * @return Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>,
     *         or EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call
     *         disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks
     *         Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and
     *         replacing the AWS OpsWorks Stacks instance with a new one.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     * EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call disassociates the
     * AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks Stacks instance. You must
     * also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks
     * instance with a new one.
     * </p>
     * 
     * @param force
     *        Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     *        EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call
     *        disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks
     *        Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and
     *        replacing the AWS OpsWorks Stacks instance with a new one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>, or
     * EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call disassociates the
     * AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks Stacks instance. You must
     * also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks
     * instance with a new one.
     * </p>
     * 
     * @return Specifies whether to force an instance to stop. If the instance's root device type is <code>ebs</code>,
     *         or EBS-backed, adding the <code>Force</code> parameter to the <code>StopInstances</code> API call
     *         disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of <i>only</i> the OpsWorks
     *         Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and
     *         replacing the AWS OpsWorks Stacks instance with a new one.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstanceRequest == false)
            return false;
        StopInstanceRequest other = (StopInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public StopInstanceRequest clone() {
        return (StopInstanceRequest) super.clone();
    }

}
