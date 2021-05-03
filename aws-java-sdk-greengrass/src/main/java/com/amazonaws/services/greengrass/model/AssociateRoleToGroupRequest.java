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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateRoleToGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateRoleToGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the Greengrass group. */
    private String groupId;
    /** The ARN of the role you wish to associate with this group. The existence of the role is not validated. */
    private String roleArn;

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateRoleToGroupRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     * 
     * @param roleArn
     *        The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     * 
     * @return The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     * 
     * @param roleArn
     *        The ARN of the role you wish to associate with this group. The existence of the role is not validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateRoleToGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateRoleToGroupRequest == false)
            return false;
        AssociateRoleToGroupRequest other = (AssociateRoleToGroupRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateRoleToGroupRequest clone() {
        return (AssociateRoleToGroupRequest) super.clone();
    }

}
