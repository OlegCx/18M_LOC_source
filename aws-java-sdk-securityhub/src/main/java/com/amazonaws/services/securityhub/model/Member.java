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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about a member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Member" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The email address of the member account.
     * </p>
     */
    private String email;
    /**
     * <p>
     * This is replaced by <code>AdministratorID</code>.
     * </p>
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     */
    @Deprecated
    private String masterId;
    /**
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     */
    private String administratorId;
    /**
     * <p>
     * The status of the relationship between the member account and its administrator account.
     * </p>
     * <p>
     * The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet invited
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the administrator account invited the member account. The member account
     * has not yet responded to the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     * accounts, indicates that the member account accepted the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     * </p>
     * </li>
     * </ul>
     */
    private String memberStatus;
    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the member account.
     * </p>
     */
    private java.util.Date invitedAt;
    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     * 
     * @return The AWS account ID of the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @param email
     *        The email address of the member account.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @return The email address of the member account.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @param email
     *        The email address of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * This is replaced by <code>AdministratorID</code>.
     * </p>
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @param masterId
     *        This is replaced by <code>AdministratorID</code>.</p>
     *        <p>
     *        The AWS account ID of the Security Hub administrator account associated with this member account.
     */
    @Deprecated
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * This is replaced by <code>AdministratorID</code>.
     * </p>
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @return This is replaced by <code>AdministratorID</code>.</p>
     *         <p>
     *         The AWS account ID of the Security Hub administrator account associated with this member account.
     */
    @Deprecated
    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * This is replaced by <code>AdministratorID</code>.
     * </p>
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @param masterId
     *        This is replaced by <code>AdministratorID</code>.</p>
     *        <p>
     *        The AWS account ID of the Security Hub administrator account associated with this member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Member withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @param administratorId
     *        The AWS account ID of the Security Hub administrator account associated with this member account.
     */

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @return The AWS account ID of the Security Hub administrator account associated with this member account.
     */

    public String getAdministratorId() {
        return this.administratorId;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub administrator account associated with this member account.
     * </p>
     * 
     * @param administratorId
     *        The AWS account ID of the Security Hub administrator account associated with this member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAdministratorId(String administratorId) {
        setAdministratorId(administratorId);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its administrator account.
     * </p>
     * <p>
     * The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet invited
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the administrator account invited the member account. The member account
     * has not yet responded to the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     * accounts, indicates that the member account accepted the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param memberStatus
     *        The status of the relationship between the member account and its administrator account. </p>
     *        <p>
     *        The status can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet
     *        invited the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the administrator account invited the member account. The member
     *        account has not yet responded to the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     *        accounts, indicates that the member account accepted the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     *        </p>
     *        </li>
     */

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its administrator account.
     * </p>
     * <p>
     * The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet invited
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the administrator account invited the member account. The member account
     * has not yet responded to the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     * accounts, indicates that the member account accepted the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the relationship between the member account and its administrator account. </p>
     *         <p>
     *         The status can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet
     *         invited the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVITED</code> - Indicates that the administrator account invited the member account. The member
     *         account has not yet responded to the invitation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     *         accounts, indicates that the member account accepted the invitation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     *         account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     *         </p>
     *         </li>
     */

    public String getMemberStatus() {
        return this.memberStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its administrator account.
     * </p>
     * <p>
     * The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet invited
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the administrator account invited the member account. The member account
     * has not yet responded to the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     * accounts, indicates that the member account accepted the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param memberStatus
     *        The status of the relationship between the member account and its administrator account. </p>
     *        <p>
     *        The status can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - Indicates that the administrator account added the member account, but has not yet
     *        invited the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the administrator account invited the member account. The member
     *        account has not yet responded to the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account is currently active. For manually invited member
     *        accounts, indicates that the member account accepted the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVED</code> - Indicates that the administrator account disassociated the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIGNED</code> - Indicates that the member account disassociated themselves from the administrator
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Indicates that the administrator account deleted the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withMemberStatus(String memberStatus) {
        setMemberStatus(memberStatus);
        return this;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the member account.
     * </p>
     * 
     * @param invitedAt
     *        A timestamp for the date and time when the invitation was sent to the member account.
     */

    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the member account.
     * </p>
     * 
     * @return A timestamp for the date and time when the invitation was sent to the member account.
     */

    public java.util.Date getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the member account.
     * </p>
     * 
     * @param invitedAt
     *        A timestamp for the date and time when the invitation was sent to the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withInvitedAt(java.util.Date invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for the date and time when the member account was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     * 
     * @return The timestamp for the date and time when the member account was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for the date and time when the member account was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
        if (getAdministratorId() != null)
            sb.append("AdministratorId: ").append(getAdministratorId()).append(",");
        if (getMemberStatus() != null)
            sb.append("MemberStatus: ").append(getMemberStatus()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getAdministratorId() == null ^ this.getAdministratorId() == null)
            return false;
        if (other.getAdministratorId() != null && other.getAdministratorId().equals(this.getAdministratorId()) == false)
            return false;
        if (other.getMemberStatus() == null ^ this.getMemberStatus() == null)
            return false;
        if (other.getMemberStatus() != null && other.getMemberStatus().equals(this.getMemberStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getAdministratorId() == null) ? 0 : getAdministratorId().hashCode());
        hashCode = prime * hashCode + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Member clone() {
        try {
            return (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
