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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     * administrator account.
     * </p>
     */
    private java.util.List<AccountDetail> accountDetails;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     * </p>
     * 
     * @return The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     * administrator account.
     * </p>
     * 
     * @return A list of account ID and email address pairs of the accounts that you want to associate with the
     *         GuardDuty administrator account.
     */

    public java.util.List<AccountDetail> getAccountDetails() {
        return accountDetails;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     * administrator account.
     * </p>
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     *        administrator account.
     */

    public void setAccountDetails(java.util.Collection<AccountDetail> accountDetails) {
        if (accountDetails == null) {
            this.accountDetails = null;
            return;
        }

        this.accountDetails = new java.util.ArrayList<AccountDetail>(accountDetails);
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     * administrator account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountDetails(java.util.Collection)} or {@link #withAccountDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccountDetails(AccountDetail... accountDetails) {
        if (this.accountDetails == null) {
            setAccountDetails(new java.util.ArrayList<AccountDetail>(accountDetails.length));
        }
        for (AccountDetail ele : accountDetails) {
            this.accountDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     * administrator account.
     * </p>
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccountDetails(java.util.Collection<AccountDetail> accountDetails) {
        setAccountDetails(accountDetails);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAccountDetails() != null)
            sb.append("AccountDetails: ").append(getAccountDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersRequest == false)
            return false;
        CreateMembersRequest other = (CreateMembersRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAccountDetails() == null ^ this.getAccountDetails() == null)
            return false;
        if (other.getAccountDetails() != null && other.getAccountDetails().equals(this.getAccountDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAccountDetails() == null) ? 0 : getAccountDetails().hashCode());
        return hashCode;
    }

    @Override
    public CreateMembersRequest clone() {
        return (CreateMembersRequest) super.clone();
    }

}
