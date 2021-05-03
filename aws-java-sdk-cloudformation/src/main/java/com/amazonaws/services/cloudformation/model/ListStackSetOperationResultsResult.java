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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperationResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetOperationResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackSetOperationResultSummary</code> structures that contain information about the specified
     * operation results, for accounts and Regions that are included in the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackSetOperationResultSummary> summaries;
    /**
     * <p>
     * If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListOperationResults</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackSetOperationResultSummary</code> structures that contain information about the specified
     * operation results, for accounts and Regions that are included in the operation.
     * </p>
     * 
     * @return A list of <code>StackSetOperationResultSummary</code> structures that contain information about the
     *         specified operation results, for accounts and Regions that are included in the operation.
     */

    public java.util.List<StackSetOperationResultSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<StackSetOperationResultSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * A list of <code>StackSetOperationResultSummary</code> structures that contain information about the specified
     * operation results, for accounts and Regions that are included in the operation.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetOperationResultSummary</code> structures that contain information about the
     *        specified operation results, for accounts and Regions that are included in the operation.
     */

    public void setSummaries(java.util.Collection<StackSetOperationResultSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<StackSetOperationResultSummary>(summaries);
    }

    /**
     * <p>
     * A list of <code>StackSetOperationResultSummary</code> structures that contain information about the specified
     * operation results, for accounts and Regions that are included in the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetOperationResultSummary</code> structures that contain information about the
     *        specified operation results, for accounts and Regions that are included in the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetOperationResultsResult withSummaries(StackSetOperationResultSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<StackSetOperationResultSummary>(summaries.length));
        }
        for (StackSetOperationResultSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackSetOperationResultSummary</code> structures that contain information about the specified
     * operation results, for accounts and Regions that are included in the operation.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetOperationResultSummary</code> structures that contain information about the
     *        specified operation results, for accounts and Regions that are included in the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetOperationResultsResult withSummaries(java.util.Collection<StackSetOperationResultSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListOperationResults</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next
     *        set of results, call <code>ListOperationResults</code> again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListOperationResults</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @return If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next
     *         set of results, call <code>ListOperationResults</code> again and assign that token to the request
     *         object's <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is
     *         set to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListOperationResults</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all results, <code>NextToken</code> is set to a token. To retrieve the next
     *        set of results, call <code>ListOperationResults</code> again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If there are no remaining results, <code>NextToken</code> is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetOperationResultsResult withNextToken(String nextToken) {
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
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

        if (obj instanceof ListStackSetOperationResultsResult == false)
            return false;
        ListStackSetOperationResultsResult other = (ListStackSetOperationResultsResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStackSetOperationResultsResult clone() {
        try {
            return (ListStackSetOperationResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
