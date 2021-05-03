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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicyForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccessPointPolicyForObjectLambdaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Object Lambda Access Point resource policy document.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The account ID for the account that owns the specified Object Lambda Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @return The account ID for the account that owns the specified Object Lambda Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The account ID for the account that owns the specified Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccessPointPolicyForObjectLambdaRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @return The name of the Object Lambda Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccessPointPolicyForObjectLambdaRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Object Lambda Access Point resource policy document.
     * </p>
     * 
     * @param policy
     *        Object Lambda Access Point resource policy document.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Object Lambda Access Point resource policy document.
     * </p>
     * 
     * @return Object Lambda Access Point resource policy document.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Object Lambda Access Point resource policy document.
     * </p>
     * 
     * @param policy
     *        Object Lambda Access Point resource policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccessPointPolicyForObjectLambdaRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccessPointPolicyForObjectLambdaRequest == false)
            return false;
        PutAccessPointPolicyForObjectLambdaRequest other = (PutAccessPointPolicyForObjectLambdaRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutAccessPointPolicyForObjectLambdaRequest clone() {
        return (PutAccessPointPolicyForObjectLambdaRequest) super.clone();
    }

}
