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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the security groups associated with the EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/SecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The security group ID of the EC2 instance.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The security group name of the EC2 instance.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The security group ID of the EC2 instance.
     * </p>
     * 
     * @param groupId
     *        The security group ID of the EC2 instance.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The security group ID of the EC2 instance.
     * </p>
     * 
     * @return The security group ID of the EC2 instance.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The security group ID of the EC2 instance.
     * </p>
     * 
     * @param groupId
     *        The security group ID of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The security group name of the EC2 instance.
     * </p>
     * 
     * @param groupName
     *        The security group name of the EC2 instance.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The security group name of the EC2 instance.
     * </p>
     * 
     * @return The security group name of the EC2 instance.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The security group name of the EC2 instance.
     * </p>
     * 
     * @param groupName
     *        The security group name of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroup == false)
            return false;
        SecurityGroup other = (SecurityGroup) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroup clone() {
        try {
            return (SecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.SecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
