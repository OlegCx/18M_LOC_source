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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListOutgoingTypedLinks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutgoingTypedLinksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A reference that identifies the object whose attributes will be listed.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges
     * must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire
     * range.
     * </p>
     */
    private java.util.List<TypedLinkAttributeRange> filterAttributeRanges;
    /**
     * <p>
     * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are
     * supplied to any API calls.
     * </p>
     */
    private TypedLinkSchemaAndFacetName filterTypedLink;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     */
    private String consistencyLevel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A reference that identifies the object whose attributes will be listed.
     * </p>
     * 
     * @param objectReference
     *        A reference that identifies the object whose attributes will be listed.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference that identifies the object whose attributes will be listed.
     * </p>
     * 
     * @return A reference that identifies the object whose attributes will be listed.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference that identifies the object whose attributes will be listed.
     * </p>
     * 
     * @param objectReference
     *        A reference that identifies the object whose attributes will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges
     * must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire
     * range.
     * </p>
     * 
     * @return Provides range filters for multiple attributes. When providing ranges to typed link selection, any
     *         inexact ranges must be specified at the end. Any attributes that do not have a range specified are
     *         presumed to match the entire range.
     */

    public java.util.List<TypedLinkAttributeRange> getFilterAttributeRanges() {
        return filterAttributeRanges;
    }

    /**
     * <p>
     * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges
     * must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire
     * range.
     * </p>
     * 
     * @param filterAttributeRanges
     *        Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact
     *        ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     *        match the entire range.
     */

    public void setFilterAttributeRanges(java.util.Collection<TypedLinkAttributeRange> filterAttributeRanges) {
        if (filterAttributeRanges == null) {
            this.filterAttributeRanges = null;
            return;
        }

        this.filterAttributeRanges = new java.util.ArrayList<TypedLinkAttributeRange>(filterAttributeRanges);
    }

    /**
     * <p>
     * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges
     * must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire
     * range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterAttributeRanges(java.util.Collection)} or
     * {@link #withFilterAttributeRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param filterAttributeRanges
     *        Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact
     *        ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     *        match the entire range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withFilterAttributeRanges(TypedLinkAttributeRange... filterAttributeRanges) {
        if (this.filterAttributeRanges == null) {
            setFilterAttributeRanges(new java.util.ArrayList<TypedLinkAttributeRange>(filterAttributeRanges.length));
        }
        for (TypedLinkAttributeRange ele : filterAttributeRanges) {
            this.filterAttributeRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges
     * must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire
     * range.
     * </p>
     * 
     * @param filterAttributeRanges
     *        Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact
     *        ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     *        match the entire range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withFilterAttributeRanges(java.util.Collection<TypedLinkAttributeRange> filterAttributeRanges) {
        setFilterAttributeRanges(filterAttributeRanges);
        return this;
    }

    /**
     * <p>
     * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are
     * supplied to any API calls.
     * </p>
     * 
     * @param filterTypedLink
     *        Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they
     *        are supplied to any API calls.
     */

    public void setFilterTypedLink(TypedLinkSchemaAndFacetName filterTypedLink) {
        this.filterTypedLink = filterTypedLink;
    }

    /**
     * <p>
     * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are
     * supplied to any API calls.
     * </p>
     * 
     * @return Filters are interpreted in the order of the attributes defined on the typed link facet, not the order
     *         they are supplied to any API calls.
     */

    public TypedLinkSchemaAndFacetName getFilterTypedLink() {
        return this.filterTypedLink;
    }

    /**
     * <p>
     * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are
     * supplied to any API calls.
     * </p>
     * 
     * @param filterTypedLink
     *        Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they
     *        are supplied to any API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withFilterTypedLink(TypedLinkSchemaAndFacetName filterTypedLink) {
        setFilterTypedLink(filterTypedLink);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @return The maximum number of results to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @return The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public String getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListOutgoingTypedLinksRequest withConsistencyLevel(String consistencyLevel) {
        setConsistencyLevel(consistencyLevel);
        return this;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        withConsistencyLevel(consistencyLevel);
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListOutgoingTypedLinksRequest withConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel.toString();
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getFilterAttributeRanges() != null)
            sb.append("FilterAttributeRanges: ").append(getFilterAttributeRanges()).append(",");
        if (getFilterTypedLink() != null)
            sb.append("FilterTypedLink: ").append(getFilterTypedLink()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getConsistencyLevel() != null)
            sb.append("ConsistencyLevel: ").append(getConsistencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOutgoingTypedLinksRequest == false)
            return false;
        ListOutgoingTypedLinksRequest other = (ListOutgoingTypedLinksRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getFilterAttributeRanges() == null ^ this.getFilterAttributeRanges() == null)
            return false;
        if (other.getFilterAttributeRanges() != null && other.getFilterAttributeRanges().equals(this.getFilterAttributeRanges()) == false)
            return false;
        if (other.getFilterTypedLink() == null ^ this.getFilterTypedLink() == null)
            return false;
        if (other.getFilterTypedLink() != null && other.getFilterTypedLink().equals(this.getFilterTypedLink()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getConsistencyLevel() == null ^ this.getConsistencyLevel() == null)
            return false;
        if (other.getConsistencyLevel() != null && other.getConsistencyLevel().equals(this.getConsistencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getFilterAttributeRanges() == null) ? 0 : getFilterAttributeRanges().hashCode());
        hashCode = prime * hashCode + ((getFilterTypedLink() == null) ? 0 : getFilterTypedLink().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getConsistencyLevel() == null) ? 0 : getConsistencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public ListOutgoingTypedLinksRequest clone() {
        return (ListOutgoingTypedLinksRequest) super.clone();
    }

}
