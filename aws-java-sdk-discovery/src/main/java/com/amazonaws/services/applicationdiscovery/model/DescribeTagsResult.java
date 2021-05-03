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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a
     * specific configuration item.
     * </p>
     */
    private java.util.List<ConfigurationTag> tags;
    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a
     * specific configuration item.
     * </p>
     * 
     * @return Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of
     *         tags for a specific configuration item.
     */

    public java.util.List<ConfigurationTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a
     * specific configuration item.
     * </p>
     * 
     * @param tags
     *        Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of
     *        tags for a specific configuration item.
     */

    public void setTags(java.util.Collection<ConfigurationTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<ConfigurationTag>(tags);
    }

    /**
     * <p>
     * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a
     * specific configuration item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of
     *        tags for a specific configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTags(ConfigurationTag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<ConfigurationTag>(tags.length));
        }
        for (ConfigurationTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a
     * specific configuration item.
     * </p>
     * 
     * @param tags
     *        Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of
     *        tags for a specific configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTags(java.util.Collection<ConfigurationTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @return The call returns a token. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withNextToken(String nextToken) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof DescribeTagsResult == false)
            return false;
        DescribeTagsResult other = (DescribeTagsResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsResult clone() {
        try {
            return (DescribeTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
