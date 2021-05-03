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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListMLTransforms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMLTransformsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     * </p>
     */
    private TransformFilterCriteria filter;
    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     * </p>
     */
    private TransformSortCriteria sort;
    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @return A continuation token, if this is a continuation request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @return The maximum size of a list to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     * </p>
     * 
     * @param filter
     *        A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     */

    public void setFilter(TransformFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     * </p>
     * 
     * @return A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     */

    public TransformFilterCriteria getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     * </p>
     * 
     * @param filter
     *        A <code>TransformFilterCriteria</code> used to filter the machine learning transforms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest withFilter(TransformFilterCriteria filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     * </p>
     * 
     * @param sort
     *        A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     */

    public void setSort(TransformSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     * </p>
     * 
     * @return A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     */

    public TransformSortCriteria getSort() {
        return this.sort;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     * </p>
     * 
     * @param sort
     *        A <code>TransformSortCriteria</code> used to sort the machine learning transforms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest withSort(TransformSortCriteria sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @return Specifies to return only these tagged resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @param tags
     *        Specifies to return only these tagged resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @param tags
     *        Specifies to return only these tagged resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListMLTransformsRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLTransformsRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMLTransformsRequest == false)
            return false;
        ListMLTransformsRequest other = (ListMLTransformsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListMLTransformsRequest clone() {
        return (ListMLTransformsRequest) super.clone();
    }

}
