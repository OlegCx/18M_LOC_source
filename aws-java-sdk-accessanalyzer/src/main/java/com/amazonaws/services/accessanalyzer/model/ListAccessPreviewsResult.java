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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAccessPreviews" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPreviewsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of access previews retrieved for the analyzer.
     * </p>
     */
    private java.util.List<AccessPreviewSummary> accessPreviews;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of access previews retrieved for the analyzer.
     * </p>
     * 
     * @return A list of access previews retrieved for the analyzer.
     */

    public java.util.List<AccessPreviewSummary> getAccessPreviews() {
        return accessPreviews;
    }

    /**
     * <p>
     * A list of access previews retrieved for the analyzer.
     * </p>
     * 
     * @param accessPreviews
     *        A list of access previews retrieved for the analyzer.
     */

    public void setAccessPreviews(java.util.Collection<AccessPreviewSummary> accessPreviews) {
        if (accessPreviews == null) {
            this.accessPreviews = null;
            return;
        }

        this.accessPreviews = new java.util.ArrayList<AccessPreviewSummary>(accessPreviews);
    }

    /**
     * <p>
     * A list of access previews retrieved for the analyzer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessPreviews(java.util.Collection)} or {@link #withAccessPreviews(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accessPreviews
     *        A list of access previews retrieved for the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewsResult withAccessPreviews(AccessPreviewSummary... accessPreviews) {
        if (this.accessPreviews == null) {
            setAccessPreviews(new java.util.ArrayList<AccessPreviewSummary>(accessPreviews.length));
        }
        for (AccessPreviewSummary ele : accessPreviews) {
            this.accessPreviews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of access previews retrieved for the analyzer.
     * </p>
     * 
     * @param accessPreviews
     *        A list of access previews retrieved for the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewsResult withAccessPreviews(java.util.Collection<AccessPreviewSummary> accessPreviews) {
        setAccessPreviews(accessPreviews);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewsResult withNextToken(String nextToken) {
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
        if (getAccessPreviews() != null)
            sb.append("AccessPreviews: ").append(getAccessPreviews()).append(",");
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

        if (obj instanceof ListAccessPreviewsResult == false)
            return false;
        ListAccessPreviewsResult other = (ListAccessPreviewsResult) obj;
        if (other.getAccessPreviews() == null ^ this.getAccessPreviews() == null)
            return false;
        if (other.getAccessPreviews() != null && other.getAccessPreviews().equals(this.getAccessPreviews()) == false)
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

        hashCode = prime * hashCode + ((getAccessPreviews() == null) ? 0 : getAccessPreviews().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPreviewsResult clone() {
        try {
            return (ListAccessPreviewsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
