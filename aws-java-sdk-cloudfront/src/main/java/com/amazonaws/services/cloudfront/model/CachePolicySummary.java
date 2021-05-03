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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a cache policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CachePolicySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachePolicySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in this
     * AWS account).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The cache policy.
     * </p>
     */
    private CachePolicy cachePolicy;

    /**
     * <p>
     * The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in this
     * AWS account).
     * </p>
     * 
     * @param type
     *        The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in
     *        this AWS account).
     * @see CachePolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in this
     * AWS account).
     * </p>
     * 
     * @return The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in
     *         this AWS account).
     * @see CachePolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in this
     * AWS account).
     * </p>
     * 
     * @param type
     *        The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in
     *        this AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CachePolicyType
     */

    public CachePolicySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in this
     * AWS account).
     * </p>
     * 
     * @param type
     *        The type of cache policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created in
     *        this AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CachePolicyType
     */

    public CachePolicySummary withType(CachePolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The cache policy.
     * </p>
     * 
     * @param cachePolicy
     *        The cache policy.
     */

    public void setCachePolicy(CachePolicy cachePolicy) {
        this.cachePolicy = cachePolicy;
    }

    /**
     * <p>
     * The cache policy.
     * </p>
     * 
     * @return The cache policy.
     */

    public CachePolicy getCachePolicy() {
        return this.cachePolicy;
    }

    /**
     * <p>
     * The cache policy.
     * </p>
     * 
     * @param cachePolicy
     *        The cache policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicySummary withCachePolicy(CachePolicy cachePolicy) {
        setCachePolicy(cachePolicy);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCachePolicy() != null)
            sb.append("CachePolicy: ").append(getCachePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CachePolicySummary == false)
            return false;
        CachePolicySummary other = (CachePolicySummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCachePolicy() == null ^ this.getCachePolicy() == null)
            return false;
        if (other.getCachePolicy() != null && other.getCachePolicy().equals(this.getCachePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCachePolicy() == null) ? 0 : getCachePolicy().hashCode());
        return hashCode;
    }

    @Override
    public CachePolicySummary clone() {
        try {
            return (CachePolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
