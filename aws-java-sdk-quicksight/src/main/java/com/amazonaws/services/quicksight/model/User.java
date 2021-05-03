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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A registered user of Amazon QuickSight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/User" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The user's user name.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The user's email address.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     */
    private String role;
    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     * Directory user, that user is inactive until they sign in and provide a password.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * The principal ID of the user.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The custom permissions profile associated with this user.
     * </p>
     */
    private String customPermissionsName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the user.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the user.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @param userName
     *        The user's user name.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @return The user's user name.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @param userName
     *        The user's user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     * 
     * @param email
     *        The user's email address.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     * 
     * @return The user's email address.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     * 
     * @param email
     *        The user's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param role
     *        The Amazon QuickSight role for the user. The user role can be one of the following:.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @see UserRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon QuickSight role for the user. The user role can be one of the following:.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *         </p>
     *         </li>
     * @see UserRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param role
     *        The Amazon QuickSight role for the user. The user role can be one of the following:.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public User withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param role
     *        The Amazon QuickSight role for the user. The user role can be one of the following:.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public User withRole(UserRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * 
     * @param identityType
     *        The type of identity authentication used by the user.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * 
     * @return The type of identity authentication used by the user.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * 
     * @param identityType
     *        The type of identity authentication used by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public User withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * 
     * @param identityType
     *        The type of identity authentication used by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public User withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     * Directory user, that user is inactive until they sign in and provide a password.
     * </p>
     * 
     * @param active
     *        The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     *        Directory user, that user is inactive until they sign in and provide a password.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     * Directory user, that user is inactive until they sign in and provide a password.
     * </p>
     * 
     * @return The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     *         Directory user, that user is inactive until they sign in and provide a password.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     * Directory user, that user is inactive until they sign in and provide a password.
     * </p>
     * 
     * @param active
     *        The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     *        Directory user, that user is inactive until they sign in and provide a password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     * Directory user, that user is inactive until they sign in and provide a password.
     * </p>
     * 
     * @return The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active
     *         Directory user, that user is inactive until they sign in and provide a password.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the user.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @return The principal ID of the user.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The custom permissions profile associated with this user.
     * </p>
     * 
     * @param customPermissionsName
     *        The custom permissions profile associated with this user.
     */

    public void setCustomPermissionsName(String customPermissionsName) {
        this.customPermissionsName = customPermissionsName;
    }

    /**
     * <p>
     * The custom permissions profile associated with this user.
     * </p>
     * 
     * @return The custom permissions profile associated with this user.
     */

    public String getCustomPermissionsName() {
        return this.customPermissionsName;
    }

    /**
     * <p>
     * The custom permissions profile associated with this user.
     * </p>
     * 
     * @param customPermissionsName
     *        The custom permissions profile associated with this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withCustomPermissionsName(String customPermissionsName) {
        setCustomPermissionsName(customPermissionsName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getCustomPermissionsName() != null)
            sb.append("CustomPermissionsName: ").append(getCustomPermissionsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getCustomPermissionsName() == null ^ this.getCustomPermissionsName() == null)
            return false;
        if (other.getCustomPermissionsName() != null && other.getCustomPermissionsName().equals(this.getCustomPermissionsName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getCustomPermissionsName() == null) ? 0 : getCustomPermissionsName().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
