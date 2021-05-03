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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain information about the specified extension's
     * versions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TypeVersionSummary> typeVersionSummaries;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain information about the specified extension's
     * versions.
     * </p>
     * 
     * @return A list of <code>TypeVersionSummary</code> structures that contain information about the specified
     *         extension's versions.
     */

    public java.util.List<TypeVersionSummary> getTypeVersionSummaries() {
        if (typeVersionSummaries == null) {
            typeVersionSummaries = new com.amazonaws.internal.SdkInternalList<TypeVersionSummary>();
        }
        return typeVersionSummaries;
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain information about the specified extension's
     * versions.
     * </p>
     * 
     * @param typeVersionSummaries
     *        A list of <code>TypeVersionSummary</code> structures that contain information about the specified
     *        extension's versions.
     */

    public void setTypeVersionSummaries(java.util.Collection<TypeVersionSummary> typeVersionSummaries) {
        if (typeVersionSummaries == null) {
            this.typeVersionSummaries = null;
            return;
        }

        this.typeVersionSummaries = new com.amazonaws.internal.SdkInternalList<TypeVersionSummary>(typeVersionSummaries);
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain information about the specified extension's
     * versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypeVersionSummaries(java.util.Collection)} or {@link #withTypeVersionSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param typeVersionSummaries
     *        A list of <code>TypeVersionSummary</code> structures that contain information about the specified
     *        extension's versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeVersionsResult withTypeVersionSummaries(TypeVersionSummary... typeVersionSummaries) {
        if (this.typeVersionSummaries == null) {
            setTypeVersionSummaries(new com.amazonaws.internal.SdkInternalList<TypeVersionSummary>(typeVersionSummaries.length));
        }
        for (TypeVersionSummary ele : typeVersionSummaries) {
            this.typeVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain information about the specified extension's
     * versions.
     * </p>
     * 
     * @param typeVersionSummaries
     *        A list of <code>TypeVersionSummary</code> structures that contain information about the specified
     *        extension's versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeVersionsResult withTypeVersionSummaries(java.util.Collection<TypeVersionSummary> typeVersionSummaries) {
        setTypeVersionSummaries(typeVersionSummaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call this action again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call this action again and assign that token to the request object's
     *         <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call this action again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeVersionsResult withNextToken(String nextToken) {
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
        if (getTypeVersionSummaries() != null)
            sb.append("TypeVersionSummaries: ").append(getTypeVersionSummaries()).append(",");
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

        if (obj instanceof ListTypeVersionsResult == false)
            return false;
        ListTypeVersionsResult other = (ListTypeVersionsResult) obj;
        if (other.getTypeVersionSummaries() == null ^ this.getTypeVersionSummaries() == null)
            return false;
        if (other.getTypeVersionSummaries() != null && other.getTypeVersionSummaries().equals(this.getTypeVersionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTypeVersionSummaries() == null) ? 0 : getTypeVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTypeVersionsResult clone() {
        try {
            return (ListTypeVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
