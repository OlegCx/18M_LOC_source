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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource-based policy.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @param policy
     *        The resource-based policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @return The resource-based policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @param policy
     *        The resource-based policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @return A unique identifier for the current revision of the policy.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyResult == false)
            return false;
        GetPolicyResult other = (GetPolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyResult clone() {
        try {
            return (GetPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
