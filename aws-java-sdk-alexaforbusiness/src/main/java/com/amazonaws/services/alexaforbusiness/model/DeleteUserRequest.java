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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     */
    private String enrollmentId;

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     * 
     * @param userArn
     *        The ARN of the user to delete in the organization. Required.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     * 
     * @return The ARN of the user to delete in the organization. Required.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     * 
     * @param userArn
     *        The ARN of the user to delete in the organization. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * 
     * @param enrollmentId
     *        The ARN of the user's enrollment in the organization. Required.
     */

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * 
     * @return The ARN of the user's enrollment in the organization. Required.
     */

    public String getEnrollmentId() {
        return this.enrollmentId;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * 
     * @param enrollmentId
     *        The ARN of the user's enrollment in the organization. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserRequest withEnrollmentId(String enrollmentId) {
        setEnrollmentId(enrollmentId);
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getEnrollmentId() != null)
            sb.append("EnrollmentId: ").append(getEnrollmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserRequest == false)
            return false;
        DeleteUserRequest other = (DeleteUserRequest) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getEnrollmentId() == null ^ this.getEnrollmentId() == null)
            return false;
        if (other.getEnrollmentId() != null && other.getEnrollmentId().equals(this.getEnrollmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentId() == null) ? 0 : getEnrollmentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserRequest clone() {
        return (DeleteUserRequest) super.clone();
    }

}
