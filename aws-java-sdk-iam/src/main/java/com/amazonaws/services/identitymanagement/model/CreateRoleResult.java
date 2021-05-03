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

/**
 * <p>
 * Contains the response to a successful <a>CreateRole</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     */
    private Role role;

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     * 
     * @param role
     *        A structure containing details about the new role.
     */

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     * 
     * @return A structure containing details about the new role.
     */

    public Role getRole() {
        return this.role;
    }

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     * 
     * @param role
     *        A structure containing details about the new role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleResult withRole(Role role) {
        setRole(role);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoleResult == false)
            return false;
        CreateRoleResult other = (CreateRoleResult) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoleResult clone() {
        try {
            return (CreateRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
