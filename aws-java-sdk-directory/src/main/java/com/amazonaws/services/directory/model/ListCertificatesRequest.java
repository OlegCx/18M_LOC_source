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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A token for requesting another page of certificates if the <code>NextToken</code> response element indicates that
     * more certificates are available. Use the value of the returned <code>NextToken</code> element in your request
     * until the token comes back as <code>null</code>. Pass <code>null</code> if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of items that should show up on one page
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A token for requesting another page of certificates if the <code>NextToken</code> response element indicates that
     * more certificates are available. Use the value of the returned <code>NextToken</code> element in your request
     * until the token comes back as <code>null</code>. Pass <code>null</code> if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        A token for requesting another page of certificates if the <code>NextToken</code> response element
     *        indicates that more certificates are available. Use the value of the returned <code>NextToken</code>
     *        element in your request until the token comes back as <code>null</code>. Pass <code>null</code> if this is
     *        the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for requesting another page of certificates if the <code>NextToken</code> response element indicates that
     * more certificates are available. Use the value of the returned <code>NextToken</code> element in your request
     * until the token comes back as <code>null</code>. Pass <code>null</code> if this is the first call.
     * </p>
     * 
     * @return A token for requesting another page of certificates if the <code>NextToken</code> response element
     *         indicates that more certificates are available. Use the value of the returned <code>NextToken</code>
     *         element in your request until the token comes back as <code>null</code>. Pass <code>null</code> if this
     *         is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for requesting another page of certificates if the <code>NextToken</code> response element indicates that
     * more certificates are available. Use the value of the returned <code>NextToken</code> element in your request
     * until the token comes back as <code>null</code>. Pass <code>null</code> if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        A token for requesting another page of certificates if the <code>NextToken</code> response element
     *        indicates that more certificates are available. Use the value of the returned <code>NextToken</code>
     *        element in your request until the token comes back as <code>null</code>. Pass <code>null</code> if this is
     *        the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of items that should show up on one page
     * </p>
     * 
     * @param limit
     *        The number of items that should show up on one page
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of items that should show up on one page
     * </p>
     * 
     * @return The number of items that should show up on one page
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of items that should show up on one page
     * </p>
     * 
     * @param limit
     *        The number of items that should show up on one page
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesRequest == false)
            return false;
        ListCertificatesRequest other = (ListCertificatesRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesRequest clone() {
        return (ListCertificatesRequest) super.clone();
    }

}
