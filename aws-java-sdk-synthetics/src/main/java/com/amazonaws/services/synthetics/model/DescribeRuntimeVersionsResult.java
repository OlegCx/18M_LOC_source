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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeRuntimeVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRuntimeVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary runtime version.
     * </p>
     */
    private java.util.List<RuntimeVersion> runtimeVersions;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary runtime version.
     * </p>
     * 
     * @return An array of objects that display the details about each Synthetics canary runtime version.
     */

    public java.util.List<RuntimeVersion> getRuntimeVersions() {
        return runtimeVersions;
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary runtime version.
     * </p>
     * 
     * @param runtimeVersions
     *        An array of objects that display the details about each Synthetics canary runtime version.
     */

    public void setRuntimeVersions(java.util.Collection<RuntimeVersion> runtimeVersions) {
        if (runtimeVersions == null) {
            this.runtimeVersions = null;
            return;
        }

        this.runtimeVersions = new java.util.ArrayList<RuntimeVersion>(runtimeVersions);
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary runtime version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuntimeVersions(java.util.Collection)} or {@link #withRuntimeVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param runtimeVersions
     *        An array of objects that display the details about each Synthetics canary runtime version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuntimeVersionsResult withRuntimeVersions(RuntimeVersion... runtimeVersions) {
        if (this.runtimeVersions == null) {
            setRuntimeVersions(new java.util.ArrayList<RuntimeVersion>(runtimeVersions.length));
        }
        for (RuntimeVersion ele : runtimeVersions) {
            this.runtimeVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary runtime version.
     * </p>
     * 
     * @param runtimeVersions
     *        An array of objects that display the details about each Synthetics canary runtime version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuntimeVersionsResult withRuntimeVersions(java.util.Collection<RuntimeVersion> runtimeVersions) {
        setRuntimeVersions(runtimeVersions);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeRuntimeVersions</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuntimeVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRuntimeVersions() != null)
            sb.append("RuntimeVersions: ").append(getRuntimeVersions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRuntimeVersionsResult == false)
            return false;
        DescribeRuntimeVersionsResult other = (DescribeRuntimeVersionsResult) obj;
        if (other.getRuntimeVersions() == null ^ this.getRuntimeVersions() == null)
            return false;
        if (other.getRuntimeVersions() != null && other.getRuntimeVersions().equals(this.getRuntimeVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeVersions() == null) ? 0 : getRuntimeVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRuntimeVersionsResult clone() {
        try {
            return (DescribeRuntimeVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
