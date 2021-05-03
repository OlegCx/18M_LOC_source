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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHumanLoopsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example,
     * <code>2020-02-24</code>.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For
     * example, <code>2020-02-24</code>.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a flow definition.
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * Optional. The order for displaying results. Valid values: <code>Ascending</code> and <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of items to return. If the total number of available items is more than the value specified in
     * <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use this token to
     * display the next page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example,
     * <code>2020-02-24</code>.
     * </p>
     * 
     * @param creationTimeAfter
     *        (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For
     *        example, <code>2020-02-24</code>.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example,
     * <code>2020-02-24</code>.
     * </p>
     * 
     * @return (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For
     *         example, <code>2020-02-24</code>.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example,
     * <code>2020-02-24</code>.
     * </p>
     * 
     * @param creationTimeAfter
     *        (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For
     *        example, <code>2020-02-24</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For
     * example, <code>2020-02-24</code>.
     * </p>
     * 
     * @param creationTimeBefore
     *        (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format.
     *        For example, <code>2020-02-24</code>.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For
     * example, <code>2020-02-24</code>.
     * </p>
     * 
     * @return (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format.
     *         For example, <code>2020-02-24</code>.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For
     * example, <code>2020-02-24</code>.
     * </p>
     * 
     * @param creationTimeBefore
     *        (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format.
     *        For example, <code>2020-02-24</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of a flow definition.
     */

    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a flow definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a flow definition.
     */

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of a flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsRequest withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * Optional. The order for displaying results. Valid values: <code>Ascending</code> and <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Optional. The order for displaying results. Valid values: <code>Ascending</code> and
     *        <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Optional. The order for displaying results. Valid values: <code>Ascending</code> and <code>Descending</code>.
     * </p>
     * 
     * @return Optional. The order for displaying results. Valid values: <code>Ascending</code> and
     *         <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Optional. The order for displaying results. Valid values: <code>Ascending</code> and <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Optional. The order for displaying results. Valid values: <code>Ascending</code> and
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHumanLoopsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Optional. The order for displaying results. Valid values: <code>Ascending</code> and <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Optional. The order for displaying results. Valid values: <code>Ascending</code> and
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHumanLoopsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token to display the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * 
     * @return A token to display the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token to display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of available items is more than the value specified in
     * <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use this token to
     * display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. If the total number of available items is more than the value
     *        specified in <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use
     *        this token to display the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of available items is more than the value specified in
     * <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use this token to
     * display the next page of results.
     * </p>
     * 
     * @return The total number of items to return. If the total number of available items is more than the value
     *         specified in <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can
     *         use this token to display the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of available items is more than the value specified in
     * <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use this token to
     * display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. If the total number of available items is more than the value
     *        specified in <code>MaxResults</code>, then a <code>NextToken</code> is returned in the output. You can use
     *        this token to display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsRequest withMaxResults(Integer maxResults) {
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof ListHumanLoopsRequest == false)
            return false;
        ListHumanLoopsRequest other = (ListHumanLoopsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListHumanLoopsRequest clone() {
        return (ListHumanLoopsRequest) super.clone();
    }

}
