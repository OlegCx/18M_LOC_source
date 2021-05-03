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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTLogBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDRTLogBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     */
    private String logBucket;

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * 
     * @param logBucket
     *        The Amazon S3 bucket that contains your AWS WAF logs.
     */

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains your AWS WAF logs.
     */

    public String getLogBucket() {
        return this.logBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * 
     * @param logBucket
     *        The Amazon S3 bucket that contains your AWS WAF logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDRTLogBucketRequest withLogBucket(String logBucket) {
        setLogBucket(logBucket);
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
        if (getLogBucket() != null)
            sb.append("LogBucket: ").append(getLogBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDRTLogBucketRequest == false)
            return false;
        AssociateDRTLogBucketRequest other = (AssociateDRTLogBucketRequest) obj;
        if (other.getLogBucket() == null ^ this.getLogBucket() == null)
            return false;
        if (other.getLogBucket() != null && other.getLogBucket().equals(this.getLogBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogBucket() == null) ? 0 : getLogBucket().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDRTLogBucketRequest clone() {
        return (AssociateDRTLogBucketRequest) super.clone();
    }

}
