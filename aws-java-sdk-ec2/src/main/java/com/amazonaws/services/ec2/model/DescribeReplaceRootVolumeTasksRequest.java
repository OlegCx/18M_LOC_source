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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeReplaceRootVolumeTasksRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplaceRootVolumeTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeReplaceRootVolumeTasksRequest> {

    /**
     * <p>
     * The ID of the root volume replacement task to view.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replaceRootVolumeTaskIds;
    /**
     * <p>
     * Filter to use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the root volume replacement task to view.
     * </p>
     * 
     * @return The ID of the root volume replacement task to view.
     */

    public java.util.List<String> getReplaceRootVolumeTaskIds() {
        if (replaceRootVolumeTaskIds == null) {
            replaceRootVolumeTaskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replaceRootVolumeTaskIds;
    }

    /**
     * <p>
     * The ID of the root volume replacement task to view.
     * </p>
     * 
     * @param replaceRootVolumeTaskIds
     *        The ID of the root volume replacement task to view.
     */

    public void setReplaceRootVolumeTaskIds(java.util.Collection<String> replaceRootVolumeTaskIds) {
        if (replaceRootVolumeTaskIds == null) {
            this.replaceRootVolumeTaskIds = null;
            return;
        }

        this.replaceRootVolumeTaskIds = new com.amazonaws.internal.SdkInternalList<String>(replaceRootVolumeTaskIds);
    }

    /**
     * <p>
     * The ID of the root volume replacement task to view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplaceRootVolumeTaskIds(java.util.Collection)} or
     * {@link #withReplaceRootVolumeTaskIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replaceRootVolumeTaskIds
     *        The ID of the root volume replacement task to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withReplaceRootVolumeTaskIds(String... replaceRootVolumeTaskIds) {
        if (this.replaceRootVolumeTaskIds == null) {
            setReplaceRootVolumeTaskIds(new com.amazonaws.internal.SdkInternalList<String>(replaceRootVolumeTaskIds.length));
        }
        for (String ele : replaceRootVolumeTaskIds) {
            this.replaceRootVolumeTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the root volume replacement task to view.
     * </p>
     * 
     * @param replaceRootVolumeTaskIds
     *        The ID of the root volume replacement task to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withReplaceRootVolumeTaskIds(java.util.Collection<String> replaceRootVolumeTaskIds) {
        setReplaceRootVolumeTaskIds(replaceRootVolumeTaskIds);
        return this;
    }

    /**
     * <p>
     * Filter to use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filter to use:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filter to use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filter to use:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * Filter to use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filter to use:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter to use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filter to use:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance for which the root volume replacement task was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeReplaceRootVolumeTasksRequest> getDryRunRequest() {
        Request<DescribeReplaceRootVolumeTasksRequest> request = new DescribeReplaceRootVolumeTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getReplaceRootVolumeTaskIds() != null)
            sb.append("ReplaceRootVolumeTaskIds: ").append(getReplaceRootVolumeTaskIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeReplaceRootVolumeTasksRequest == false)
            return false;
        DescribeReplaceRootVolumeTasksRequest other = (DescribeReplaceRootVolumeTasksRequest) obj;
        if (other.getReplaceRootVolumeTaskIds() == null ^ this.getReplaceRootVolumeTaskIds() == null)
            return false;
        if (other.getReplaceRootVolumeTaskIds() != null && other.getReplaceRootVolumeTaskIds().equals(this.getReplaceRootVolumeTaskIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getReplaceRootVolumeTaskIds() == null) ? 0 : getReplaceRootVolumeTaskIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplaceRootVolumeTasksRequest clone() {
        return (DescribeReplaceRootVolumeTasksRequest) super.clone();
    }
}
