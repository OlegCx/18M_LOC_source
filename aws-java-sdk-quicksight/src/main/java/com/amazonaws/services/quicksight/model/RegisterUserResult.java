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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user's user name.
     * </p>
     */
    private User user;
    /**
     * <p>
     * The URL the user visits to complete registration and provide a password. This is returned only for users with an
     * identity type of <code>QUICKSIGHT</code>.
     * </p>
     */
    private String userInvitationUrl;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @param user
     *        The user's user name.
     */

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @return The user's user name.
     */

    public User getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * 
     * @param user
     *        The user's user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserResult withUser(User user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The URL the user visits to complete registration and provide a password. This is returned only for users with an
     * identity type of <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param userInvitationUrl
     *        The URL the user visits to complete registration and provide a password. This is returned only for users
     *        with an identity type of <code>QUICKSIGHT</code>.
     */

    public void setUserInvitationUrl(String userInvitationUrl) {
        this.userInvitationUrl = userInvitationUrl;
    }

    /**
     * <p>
     * The URL the user visits to complete registration and provide a password. This is returned only for users with an
     * identity type of <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @return The URL the user visits to complete registration and provide a password. This is returned only for users
     *         with an identity type of <code>QUICKSIGHT</code>.
     */

    public String getUserInvitationUrl() {
        return this.userInvitationUrl;
    }

    /**
     * <p>
     * The URL the user visits to complete registration and provide a password. This is returned only for users with an
     * identity type of <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param userInvitationUrl
     *        The URL the user visits to complete registration and provide a password. This is returned only for users
     *        with an identity type of <code>QUICKSIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserResult withUserInvitationUrl(String userInvitationUrl) {
        setUserInvitationUrl(userInvitationUrl);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserResult withStatus(Integer status) {
        setStatus(status);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getUserInvitationUrl() != null)
            sb.append("UserInvitationUrl: ").append(getUserInvitationUrl()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUserResult == false)
            return false;
        RegisterUserResult other = (RegisterUserResult) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getUserInvitationUrl() == null ^ this.getUserInvitationUrl() == null)
            return false;
        if (other.getUserInvitationUrl() != null && other.getUserInvitationUrl().equals(this.getUserInvitationUrl()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getUserInvitationUrl() == null) ? 0 : getUserInvitationUrl().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RegisterUserResult clone() {
        try {
            return (RegisterUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
