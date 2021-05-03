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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociateSigninDelegateGroupsFromAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateSigninDelegateGroupsFromAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The sign-in delegate group names.
     * </p>
     */
    private java.util.List<String> groupNames;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSigninDelegateGroupsFromAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The sign-in delegate group names.
     * </p>
     * 
     * @return The sign-in delegate group names.
     */

    public java.util.List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * <p>
     * The sign-in delegate group names.
     * </p>
     * 
     * @param groupNames
     *        The sign-in delegate group names.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new java.util.ArrayList<String>(groupNames);
    }

    /**
     * <p>
     * The sign-in delegate group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        The sign-in delegate group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSigninDelegateGroupsFromAccountRequest withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sign-in delegate group names.
     * </p>
     * 
     * @param groupNames
     *        The sign-in delegate group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSigninDelegateGroupsFromAccountRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateSigninDelegateGroupsFromAccountRequest == false)
            return false;
        DisassociateSigninDelegateGroupsFromAccountRequest other = (DisassociateSigninDelegateGroupsFromAccountRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateSigninDelegateGroupsFromAccountRequest clone() {
        return (DisassociateSigninDelegateGroupsFromAccountRequest) super.clone();
    }

}
