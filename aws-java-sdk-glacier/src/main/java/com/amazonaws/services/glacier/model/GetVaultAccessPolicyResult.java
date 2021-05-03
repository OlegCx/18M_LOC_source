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

/**
 * <p>
 * Output for GetVaultAccessPolicy.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVaultAccessPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the returned vault access policy as a JSON string.
     * </p>
     */
    private VaultAccessPolicy policy;

    /**
     * <p>
     * Contains the returned vault access policy as a JSON string.
     * </p>
     * 
     * @param policy
     *        Contains the returned vault access policy as a JSON string.
     */

    public void setPolicy(VaultAccessPolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Contains the returned vault access policy as a JSON string.
     * </p>
     * 
     * @return Contains the returned vault access policy as a JSON string.
     */

    public VaultAccessPolicy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Contains the returned vault access policy as a JSON string.
     * </p>
     * 
     * @param policy
     *        Contains the returned vault access policy as a JSON string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVaultAccessPolicyResult withPolicy(VaultAccessPolicy policy) {
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

        if (obj instanceof GetVaultAccessPolicyResult == false)
            return false;
        GetVaultAccessPolicyResult other = (GetVaultAccessPolicyResult) obj;
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

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetVaultAccessPolicyResult clone() {
        try {
            return (GetVaultAccessPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
