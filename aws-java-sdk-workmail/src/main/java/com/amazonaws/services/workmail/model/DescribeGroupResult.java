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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The name of the described group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The email of the described group.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date enabledDate;
    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the described group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * 
     * @return The identifier of the described group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the described group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * 
     * @param name
     *        The name of the described group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * 
     * @return The name of the described group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * 
     * @param name
     *        The name of the described group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * 
     * @param email
     *        The email of the described group.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * 
     * @return The email of the described group.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * 
     * @param email
     *        The email of the described group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @return The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *         registered to WorkMail).
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeGroupResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeGroupResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     */

    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     */

    public java.util.Date getEnabledDate() {
        return this.enabledDate;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time when a user was registered to WorkMail, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withEnabledDate(java.util.Date enabledDate) {
        setEnabledDate(enabledDate);
        return this;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     */

    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     */

    public java.util.Date getDisabledDate() {
        return this.disabledDate;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withDisabledDate(java.util.Date disabledDate) {
        setDisabledDate(disabledDate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: ").append(getEnabledDate()).append(",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: ").append(getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGroupResult == false)
            return false;
        DescribeGroupResult other = (DescribeGroupResult) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGroupResult clone() {
        try {
            return (DescribeGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
