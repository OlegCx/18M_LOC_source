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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateRoleDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoleDescriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @param roleName
     *        The name of the role that you want to modify.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @return The name of the role that you want to modify.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @param roleName
     *        The name of the role that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleDescriptionRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @param description
     *        The new description that you want to apply to the specified role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @return The new description that you want to apply to the specified role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @param description
     *        The new description that you want to apply to the specified role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleDescriptionRequest withDescription(String description) {
        setDescription(description);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoleDescriptionRequest == false)
            return false;
        UpdateRoleDescriptionRequest other = (UpdateRoleDescriptionRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoleDescriptionRequest clone() {
        return (UpdateRoleDescriptionRequest) super.clone();
    }

}
