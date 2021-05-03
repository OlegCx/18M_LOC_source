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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlaybackKeyPairsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum number of key pairs to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * Default: 50.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Maximum number of key pairs to return.
     * </p>
     * 
     * @param nextToken
     *        Maximum number of key pairs to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Maximum number of key pairs to return.
     * </p>
     * 
     * @return Maximum number of key pairs to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Maximum number of key pairs to return.
     * </p>
     * 
     * @param nextToken
     *        Maximum number of key pairs to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackKeyPairsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * Default: 50.
     * </p>
     * 
     * @param maxResults
     *        The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field. Default: 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * Default: 50.
     * </p>
     * 
     * @return The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *         field. Default: 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * Default: 50.
     * </p>
     * 
     * @param maxResults
     *        The first key pair to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field. Default: 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackKeyPairsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlaybackKeyPairsRequest == false)
            return false;
        ListPlaybackKeyPairsRequest other = (ListPlaybackKeyPairsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPlaybackKeyPairsRequest clone() {
        return (ListPlaybackKeyPairsRequest) super.clone();
    }

}
