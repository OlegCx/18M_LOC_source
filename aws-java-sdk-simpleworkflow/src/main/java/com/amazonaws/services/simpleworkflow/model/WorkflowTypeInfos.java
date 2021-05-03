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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a paginated list of information structures about workflow types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowTypeInfos" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeInfos extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of workflow type information.
     * </p>
     */
    private java.util.List<WorkflowTypeInfo> typeInfos;
    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The list of workflow type information.
     * </p>
     * 
     * @return The list of workflow type information.
     */

    public java.util.List<WorkflowTypeInfo> getTypeInfos() {
        return typeInfos;
    }

    /**
     * <p>
     * The list of workflow type information.
     * </p>
     * 
     * @param typeInfos
     *        The list of workflow type information.
     */

    public void setTypeInfos(java.util.Collection<WorkflowTypeInfo> typeInfos) {
        if (typeInfos == null) {
            this.typeInfos = null;
            return;
        }

        this.typeInfos = new java.util.ArrayList<WorkflowTypeInfo>(typeInfos);
    }

    /**
     * <p>
     * The list of workflow type information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypeInfos(java.util.Collection)} or {@link #withTypeInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param typeInfos
     *        The list of workflow type information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfos withTypeInfos(WorkflowTypeInfo... typeInfos) {
        if (this.typeInfos == null) {
            setTypeInfos(new java.util.ArrayList<WorkflowTypeInfo>(typeInfos.length));
        }
        for (WorkflowTypeInfo ele : typeInfos) {
            this.typeInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of workflow type information.
     * </p>
     * 
     * @param typeInfos
     *        The list of workflow type information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfos withTypeInfos(java.util.Collection<WorkflowTypeInfo> typeInfos) {
        setTypeInfos(typeInfos);
        return this;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfos withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getTypeInfos() != null)
            sb.append("TypeInfos: ").append(getTypeInfos()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowTypeInfos == false)
            return false;
        WorkflowTypeInfos other = (WorkflowTypeInfos) obj;
        if (other.getTypeInfos() == null ^ this.getTypeInfos() == null)
            return false;
        if (other.getTypeInfos() != null && other.getTypeInfos().equals(this.getTypeInfos()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeInfos() == null) ? 0 : getTypeInfos().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowTypeInfos clone() {
        try {
            return (WorkflowTypeInfos) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
