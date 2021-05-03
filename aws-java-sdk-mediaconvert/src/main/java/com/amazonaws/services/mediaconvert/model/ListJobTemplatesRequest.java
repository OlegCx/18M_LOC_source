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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Optionally, specify a job template category to limit responses to only job templates from that category. */
    private String category;
    /**
     * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     * chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     */
    private String listBy;
    /** Optional. Number of job templates, up to twenty, that will be returned at one time. */
    private Integer maxResults;
    /** Use this string, provided with the response to a previous request, to request the next batch of job templates. */
    private String nextToken;
    /**
     * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING
     * order. Default varies by resource.
     */
    private String order;

    /**
     * Optionally, specify a job template category to limit responses to only job templates from that category.
     * 
     * @param category
     *        Optionally, specify a job template category to limit responses to only job templates from that category.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Optionally, specify a job template category to limit responses to only job templates from that category.
     * 
     * @return Optionally, specify a job template category to limit responses to only job templates from that category.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * Optionally, specify a job template category to limit responses to only job templates from that category.
     * 
     * @param category
     *        Optionally, specify a job template category to limit responses to only job templates from that category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     * chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * 
     * @param listBy
     *        Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     *        chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * @see JobTemplateListBy
     */

    public void setListBy(String listBy) {
        this.listBy = listBy;
    }

    /**
     * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     * chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * 
     * @return Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     *         chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * @see JobTemplateListBy
     */

    public String getListBy() {
        return this.listBy;
    }

    /**
     * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     * chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * 
     * @param listBy
     *        Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     *        chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTemplateListBy
     */

    public ListJobTemplatesRequest withListBy(String listBy) {
        setListBy(listBy);
        return this;
    }

    /**
     * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     * chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * 
     * @param listBy
     *        Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or
     *        chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTemplateListBy
     */

    public ListJobTemplatesRequest withListBy(JobTemplateListBy listBy) {
        this.listBy = listBy.toString();
        return this;
    }

    /**
     * Optional. Number of job templates, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Number of job templates, up to twenty, that will be returned at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Optional. Number of job templates, up to twenty, that will be returned at one time.
     * 
     * @return Optional. Number of job templates, up to twenty, that will be returned at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Optional. Number of job templates, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Number of job templates, up to twenty, that will be returned at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of job templates.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of job
     *        templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of job templates.
     * 
     * @return Use this string, provided with the response to a previous request, to request the next batch of job
     *         templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of job templates.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of job
     *        templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING
     * order. Default varies by resource.
     * 
     * @param order
     *        Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING
     * order. Default varies by resource.
     * 
     * @return Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or
     *         DESCENDING order. Default varies by resource.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING
     * order. Default varies by resource.
     * 
     * @param order
     *        Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public ListJobTemplatesRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING
     * order. Default varies by resource.
     * 
     * @param order
     *        Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public ListJobTemplatesRequest withOrder(Order order) {
        this.order = order.toString();
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getListBy() != null)
            sb.append("ListBy: ").append(getListBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobTemplatesRequest == false)
            return false;
        ListJobTemplatesRequest other = (ListJobTemplatesRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getListBy() == null ^ this.getListBy() == null)
            return false;
        if (other.getListBy() != null && other.getListBy().equals(this.getListBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getListBy() == null) ? 0 : getListBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListJobTemplatesRequest clone() {
        return (ListJobTemplatesRequest) super.clone();
    }

}
