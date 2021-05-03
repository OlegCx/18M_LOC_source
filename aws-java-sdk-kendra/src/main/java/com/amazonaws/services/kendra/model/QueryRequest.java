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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the
     * <code>CreateIndex</code> operation.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The text to search for.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     */
    private AttributeFilter attributeFilter;
    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     */
    private java.util.List<Facet> facets;
    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     */
    private java.util.List<String> requestedDocumentAttributes;
    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     */
    private String queryResultTypeFilter;
    /**
     * <p>
     * Overrides relevance tuning configurations of fields or attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured at the index level, but you do not use this API to override any relevance
     * tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, but you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     */
    private java.util.List<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations;
    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     */
    private Integer pageNumber;
    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum
     * number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * Provides information that determines how the results of the query are sorted. You can set the field that Amazon
     * Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending
     * order. In the case of ties in sorting the results, the results are sorted by relevance.
     * </p>
     * <p>
     * If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines
     * for the result.
     * </p>
     */
    private SortingConfiguration sortingConfiguration;
    /**
     * <p>
     * The user context token.
     * </p>
     */
    private UserContext userContext;
    /**
     * <p>
     * Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such as a
     * GUID. Don't use personally identifiable information, such as the user's email address, as the
     * <code>VisitorId</code>.
     * </p>
     */
    private String visitorId;

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the
     * <code>CreateIndex</code> operation.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index to search. The identifier is returned in the response from the
     *        <code>CreateIndex</code> operation.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the
     * <code>CreateIndex</code> operation.
     * </p>
     * 
     * @return The unique identifier of the index to search. The identifier is returned in the response from the
     *         <code>CreateIndex</code> operation.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the
     * <code>CreateIndex</code> operation.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index to search. The identifier is returned in the response from the
     *        <code>CreateIndex</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @param queryText
     *        The text to search for.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @return The text to search for.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @param queryText
     *        The text to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *        however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *        contain a list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     */

    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @return Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *         however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *         contain a list of other filters.</p>
     *         <p>
     *         The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *         must satisfy to be included in the query results.
     */

    public AttributeFilter getAttributeFilter() {
        return this.attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *        however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *        contain a list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withAttributeFilter(AttributeFilter attributeFilter) {
        setAttributeFilter(attributeFilter);
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @return An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *         use this information to help narrow the search for your user.
     */

    public java.util.List<Facet> getFacets() {
        return facets;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     */

    public void setFacets(java.util.Collection<Facet> facets) {
        if (facets == null) {
            this.facets = null;
            return;
        }

        this.facets = new java.util.ArrayList<Facet>(facets);
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacets(java.util.Collection)} or {@link #withFacets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withFacets(Facet... facets) {
        if (this.facets == null) {
            setFacets(new java.util.ArrayList<Facet>(facets.length));
        }
        for (Facet ele : facets) {
            this.facets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withFacets(java.util.Collection<Facet> facets) {
        setFacets(facets);
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @return An array of document attributes to include in the response. No other document attributes are included in
     *         the response. By default all document attributes are included in the response.
     */

    public java.util.List<String> getRequestedDocumentAttributes() {
        return requestedDocumentAttributes;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     */

    public void setRequestedDocumentAttributes(java.util.Collection<String> requestedDocumentAttributes) {
        if (requestedDocumentAttributes == null) {
            this.requestedDocumentAttributes = null;
            return;
        }

        this.requestedDocumentAttributes = new java.util.ArrayList<String>(requestedDocumentAttributes);
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedDocumentAttributes(java.util.Collection)} or
     * {@link #withRequestedDocumentAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withRequestedDocumentAttributes(String... requestedDocumentAttributes) {
        if (this.requestedDocumentAttributes == null) {
            setRequestedDocumentAttributes(new java.util.ArrayList<String>(requestedDocumentAttributes.length));
        }
        for (String ele : requestedDocumentAttributes) {
            this.requestedDocumentAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withRequestedDocumentAttributes(java.util.Collection<String> requestedDocumentAttributes) {
        setRequestedDocumentAttributes(requestedDocumentAttributes);
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @see QueryResultType
     */

    public void setQueryResultTypeFilter(String queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @return Sets the type of query. Only results for the specified query type are returned.
     * @see QueryResultType
     */

    public String getQueryResultTypeFilter() {
        return this.queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryRequest withQueryResultTypeFilter(String queryResultTypeFilter) {
        setQueryResultTypeFilter(queryResultTypeFilter);
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryRequest withQueryResultTypeFilter(QueryResultType queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter.toString();
        return this;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields or attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured at the index level, but you do not use this API to override any relevance
     * tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, but you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @return Overrides relevance tuning configurations of fields or attributes set at the index level.</p>
     *         <p>
     *         If you use this API to override the relevance tuning configured at the index level, but there is no
     *         relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *         </p>
     *         <p>
     *         If there is relevance tuning configured at the index level, but you do not use this API to override any
     *         relevance tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the
     *         index level.
     *         </p>
     *         <p>
     *         If there is relevance tuning configured for fields at the index level, but you use this API to override
     *         only some of these fields, then for the fields you did not override, the importance is set to 1.
     */

    public java.util.List<DocumentRelevanceConfiguration> getDocumentRelevanceOverrideConfigurations() {
        return documentRelevanceOverrideConfigurations;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields or attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured at the index level, but you do not use this API to override any relevance
     * tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, but you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields or attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured at the index level, but you do not use this API to override any
     *        relevance tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the
     *        index level.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, but you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     */

    public void setDocumentRelevanceOverrideConfigurations(java.util.Collection<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations) {
        if (documentRelevanceOverrideConfigurations == null) {
            this.documentRelevanceOverrideConfigurations = null;
            return;
        }

        this.documentRelevanceOverrideConfigurations = new java.util.ArrayList<DocumentRelevanceConfiguration>(documentRelevanceOverrideConfigurations);
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields or attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured at the index level, but you do not use this API to override any relevance
     * tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, but you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentRelevanceOverrideConfigurations(java.util.Collection)} or
     * {@link #withDocumentRelevanceOverrideConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields or attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured at the index level, but you do not use this API to override any
     *        relevance tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the
     *        index level.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, but you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withDocumentRelevanceOverrideConfigurations(DocumentRelevanceConfiguration... documentRelevanceOverrideConfigurations) {
        if (this.documentRelevanceOverrideConfigurations == null) {
            setDocumentRelevanceOverrideConfigurations(new java.util.ArrayList<DocumentRelevanceConfiguration>(documentRelevanceOverrideConfigurations.length));
        }
        for (DocumentRelevanceConfiguration ele : documentRelevanceOverrideConfigurations) {
            this.documentRelevanceOverrideConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields or attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured at the index level, but you do not use this API to override any relevance
     * tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, but you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields or attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured at the index level, but you do not use this API to override any
     *        relevance tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the
     *        index level.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, but you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withDocumentRelevanceOverrideConfigurations(java.util.Collection<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations) {
        setDocumentRelevanceOverrideConfigurations(documentRelevanceOverrideConfigurations);
        return this;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *        Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     */

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @return Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *         Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     */

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *        Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withPageNumber(Integer pageNumber) {
        setPageNumber(pageNumber);
        return this;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum
     * number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of results that are returned in each page of results. The default page size is 10. The
     *        maximum number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum
     * number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     * </p>
     * 
     * @return Sets the number of results that are returned in each page of results. The default page size is 10. The
     *         maximum number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum
     * number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of results that are returned in each page of results. The default page size is 10. The
     *        maximum number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * Provides information that determines how the results of the query are sorted. You can set the field that Amazon
     * Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending
     * order. In the case of ties in sorting the results, the results are sorted by relevance.
     * </p>
     * <p>
     * If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines
     * for the result.
     * </p>
     * 
     * @param sortingConfiguration
     *        Provides information that determines how the results of the query are sorted. You can set the field that
     *        Amazon Kendra should sort the results on, and specify whether the results should be sorted in ascending or
     *        descending order. In the case of ties in sorting the results, the results are sorted by relevance.</p>
     *        <p>
     *        If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra
     *        determines for the result.
     */

    public void setSortingConfiguration(SortingConfiguration sortingConfiguration) {
        this.sortingConfiguration = sortingConfiguration;
    }

    /**
     * <p>
     * Provides information that determines how the results of the query are sorted. You can set the field that Amazon
     * Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending
     * order. In the case of ties in sorting the results, the results are sorted by relevance.
     * </p>
     * <p>
     * If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines
     * for the result.
     * </p>
     * 
     * @return Provides information that determines how the results of the query are sorted. You can set the field that
     *         Amazon Kendra should sort the results on, and specify whether the results should be sorted in ascending
     *         or descending order. In the case of ties in sorting the results, the results are sorted by relevance.</p>
     *         <p>
     *         If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra
     *         determines for the result.
     */

    public SortingConfiguration getSortingConfiguration() {
        return this.sortingConfiguration;
    }

    /**
     * <p>
     * Provides information that determines how the results of the query are sorted. You can set the field that Amazon
     * Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending
     * order. In the case of ties in sorting the results, the results are sorted by relevance.
     * </p>
     * <p>
     * If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines
     * for the result.
     * </p>
     * 
     * @param sortingConfiguration
     *        Provides information that determines how the results of the query are sorted. You can set the field that
     *        Amazon Kendra should sort the results on, and specify whether the results should be sorted in ascending or
     *        descending order. In the case of ties in sorting the results, the results are sorted by relevance.</p>
     *        <p>
     *        If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra
     *        determines for the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withSortingConfiguration(SortingConfiguration sortingConfiguration) {
        setSortingConfiguration(sortingConfiguration);
        return this;
    }

    /**
     * <p>
     * The user context token.
     * </p>
     * 
     * @param userContext
     *        The user context token.
     */

    public void setUserContext(UserContext userContext) {
        this.userContext = userContext;
    }

    /**
     * <p>
     * The user context token.
     * </p>
     * 
     * @return The user context token.
     */

    public UserContext getUserContext() {
        return this.userContext;
    }

    /**
     * <p>
     * The user context token.
     * </p>
     * 
     * @param userContext
     *        The user context token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withUserContext(UserContext userContext) {
        setUserContext(userContext);
        return this;
    }

    /**
     * <p>
     * Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such as a
     * GUID. Don't use personally identifiable information, such as the user's email address, as the
     * <code>VisitorId</code>.
     * </p>
     * 
     * @param visitorId
     *        Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such
     *        as a GUID. Don't use personally identifiable information, such as the user's email address, as the
     *        <code>VisitorId</code>.
     */

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * <p>
     * Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such as a
     * GUID. Don't use personally identifiable information, such as the user's email address, as the
     * <code>VisitorId</code>.
     * </p>
     * 
     * @return Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier,
     *         such as a GUID. Don't use personally identifiable information, such as the user's email address, as the
     *         <code>VisitorId</code>.
     */

    public String getVisitorId() {
        return this.visitorId;
    }

    /**
     * <p>
     * Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such as a
     * GUID. Don't use personally identifiable information, such as the user's email address, as the
     * <code>VisitorId</code>.
     * </p>
     * 
     * @param visitorId
     *        Provides an identifier for a specific user. The <code>VisitorId</code> should be a unique identifier, such
     *        as a GUID. Don't use personally identifiable information, such as the user's email address, as the
     *        <code>VisitorId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withVisitorId(String visitorId) {
        setVisitorId(visitorId);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getQueryText() != null)
            sb.append("QueryText: ").append(getQueryText()).append(",");
        if (getAttributeFilter() != null)
            sb.append("AttributeFilter: ").append(getAttributeFilter()).append(",");
        if (getFacets() != null)
            sb.append("Facets: ").append(getFacets()).append(",");
        if (getRequestedDocumentAttributes() != null)
            sb.append("RequestedDocumentAttributes: ").append(getRequestedDocumentAttributes()).append(",");
        if (getQueryResultTypeFilter() != null)
            sb.append("QueryResultTypeFilter: ").append(getQueryResultTypeFilter()).append(",");
        if (getDocumentRelevanceOverrideConfigurations() != null)
            sb.append("DocumentRelevanceOverrideConfigurations: ").append(getDocumentRelevanceOverrideConfigurations()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getSortingConfiguration() != null)
            sb.append("SortingConfiguration: ").append(getSortingConfiguration()).append(",");
        if (getUserContext() != null)
            sb.append("UserContext: ").append(getUserContext()).append(",");
        if (getVisitorId() != null)
            sb.append("VisitorId: ").append(getVisitorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getAttributeFilter() == null ^ this.getAttributeFilter() == null)
            return false;
        if (other.getAttributeFilter() != null && other.getAttributeFilter().equals(this.getAttributeFilter()) == false)
            return false;
        if (other.getFacets() == null ^ this.getFacets() == null)
            return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false)
            return false;
        if (other.getRequestedDocumentAttributes() == null ^ this.getRequestedDocumentAttributes() == null)
            return false;
        if (other.getRequestedDocumentAttributes() != null && other.getRequestedDocumentAttributes().equals(this.getRequestedDocumentAttributes()) == false)
            return false;
        if (other.getQueryResultTypeFilter() == null ^ this.getQueryResultTypeFilter() == null)
            return false;
        if (other.getQueryResultTypeFilter() != null && other.getQueryResultTypeFilter().equals(this.getQueryResultTypeFilter()) == false)
            return false;
        if (other.getDocumentRelevanceOverrideConfigurations() == null ^ this.getDocumentRelevanceOverrideConfigurations() == null)
            return false;
        if (other.getDocumentRelevanceOverrideConfigurations() != null
                && other.getDocumentRelevanceOverrideConfigurations().equals(this.getDocumentRelevanceOverrideConfigurations()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getSortingConfiguration() == null ^ this.getSortingConfiguration() == null)
            return false;
        if (other.getSortingConfiguration() != null && other.getSortingConfiguration().equals(this.getSortingConfiguration()) == false)
            return false;
        if (other.getUserContext() == null ^ this.getUserContext() == null)
            return false;
        if (other.getUserContext() != null && other.getUserContext().equals(this.getUserContext()) == false)
            return false;
        if (other.getVisitorId() == null ^ this.getVisitorId() == null)
            return false;
        if (other.getVisitorId() != null && other.getVisitorId().equals(this.getVisitorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode + ((getAttributeFilter() == null) ? 0 : getAttributeFilter().hashCode());
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode());
        hashCode = prime * hashCode + ((getRequestedDocumentAttributes() == null) ? 0 : getRequestedDocumentAttributes().hashCode());
        hashCode = prime * hashCode + ((getQueryResultTypeFilter() == null) ? 0 : getQueryResultTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getDocumentRelevanceOverrideConfigurations() == null) ? 0 : getDocumentRelevanceOverrideConfigurations().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getSortingConfiguration() == null) ? 0 : getSortingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserContext() == null) ? 0 : getUserContext().hashCode());
        hashCode = prime * hashCode + ((getVisitorId() == null) ? 0 : getVisitorId().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }

}
