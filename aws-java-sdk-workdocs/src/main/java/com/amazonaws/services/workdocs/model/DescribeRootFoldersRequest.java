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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRootFoldersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Amazon WorkDocs authentication token.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @return The marker for the next set of results. (You received this marker from a previous call.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRootFoldersRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRootFoldersRequest == false)
            return false;
        DescribeRootFoldersRequest other = (DescribeRootFoldersRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRootFoldersRequest clone() {
        return (DescribeRootFoldersRequest) super.clone();
    }

}
