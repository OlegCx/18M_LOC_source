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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConformancePackComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateConformancePackComplianceSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     * </p>
     */
    private AggregateConformancePackComplianceSummaryFilters filters;
    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     */
    private String groupByKey;
    /**
     * <p>
     * The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config uses
     * the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     */

    public void setFilters(AggregateConformancePackComplianceSummaryFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     * </p>
     * 
     * @return Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     */

    public AggregateConformancePackComplianceSummaryFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>AggregateConformancePackComplianceSummaryFilters</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryRequest withFilters(AggregateConformancePackComplianceSummaryFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on AWS Account ID or AWS Region.
     * @see AggregateConformancePackComplianceSummaryGroupKey
     */

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @return Groups the result based on AWS Account ID or AWS Region.
     * @see AggregateConformancePackComplianceSummaryGroupKey
     */

    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on AWS Account ID or AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateConformancePackComplianceSummaryGroupKey
     */

    public GetAggregateConformancePackComplianceSummaryRequest withGroupByKey(String groupByKey) {
        setGroupByKey(groupByKey);
        return this;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on AWS Account ID or AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateConformancePackComplianceSummaryGroupKey
     */

    public GetAggregateConformancePackComplianceSummaryRequest withGroupByKey(AggregateConformancePackComplianceSummaryGroupKey groupByKey) {
        this.groupByKey = groupByKey.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config uses
     * the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config
     *        uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config uses
     * the default.
     * </p>
     * 
     * @return The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config
     *         uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config uses
     * the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of results returned on each page. The default is maximum. If you specify 0, AWS Config
     *        uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryRequest withNextToken(String nextToken) {
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getGroupByKey() != null)
            sb.append("GroupByKey: ").append(getGroupByKey()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetAggregateConformancePackComplianceSummaryRequest == false)
            return false;
        GetAggregateConformancePackComplianceSummaryRequest other = (GetAggregateConformancePackComplianceSummaryRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupByKey() == null ^ this.getGroupByKey() == null)
            return false;
        if (other.getGroupByKey() != null && other.getGroupByKey().equals(this.getGroupByKey()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupByKey() == null) ? 0 : getGroupByKey().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateConformancePackComplianceSummaryRequest clone() {
        return (GetAggregateConformancePackComplianceSummaryRequest) super.clone();
    }

}
