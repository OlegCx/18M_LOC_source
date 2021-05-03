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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for GetDataRetrievalPolicy.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataRetrievalPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *         associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *         associated with the credentials used to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataRetrievalPolicyRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataRetrievalPolicyRequest == false)
            return false;
        GetDataRetrievalPolicyRequest other = (GetDataRetrievalPolicyRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public GetDataRetrievalPolicyRequest clone() {
        return (GetDataRetrievalPolicyRequest) super.clone();
    }

}
