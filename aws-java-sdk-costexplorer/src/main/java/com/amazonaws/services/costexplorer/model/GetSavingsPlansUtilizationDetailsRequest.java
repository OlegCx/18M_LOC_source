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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansUtilizationDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * The data type.
     * </p>
     */
    private java.util.List<String> dataType;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The following values are supported for <code>Key</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UtilizationPercentage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TotalCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnusedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetSavings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedRecurringCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedUpfrontCommitment</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     */
    private SortDefinition sortBy;

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @param timePeriod
     *        The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *        months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *        Future dates can't be used as an <code>End</code> date.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @return The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *         months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *         Future dates can't be used as an <code>End</code> date.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @param timePeriod
     *        The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *        months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *        Future dates can't be used as an <code>End</code> date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension.
     * </p>
     * 
     * @param filter
     *        Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data
     *        with the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_PLAN_ARN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAYMENT_OPTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE_FAMILY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *        dimension.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension.
     * </p>
     * 
     * @return Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data
     *         with the following dimensions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LINKED_ACCOUNT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_PLAN_ARN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PAYMENT_OPTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_TYPE_FAMILY</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     *         href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *         dimension.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension.
     * </p>
     * 
     * @param filter
     *        Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data
     *        with the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_PLAN_ARN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAYMENT_OPTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE_FAMILY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @return The data type.
     * @see SavingsPlansDataType
     */

    public java.util.List<String> getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @see SavingsPlansDataType
     */

    public void setDataType(java.util.Collection<String> dataType) {
        if (dataType == null) {
            this.dataType = null;
            return;
        }

        this.dataType = new java.util.ArrayList<String>(dataType);
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataType(java.util.Collection)} or {@link #withDataType(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlansDataType
     */

    public GetSavingsPlansUtilizationDetailsRequest withDataType(String... dataType) {
        if (this.dataType == null) {
            setDataType(new java.util.ArrayList<String>(dataType.length));
        }
        for (String ele : dataType) {
            this.dataType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlansDataType
     */

    public GetSavingsPlansUtilizationDetailsRequest withDataType(java.util.Collection<String> dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlansDataType
     */

    public GetSavingsPlansUtilizationDetailsRequest withDataType(SavingsPlansDataType... dataType) {
        java.util.ArrayList<String> dataTypeCopy = new java.util.ArrayList<String>(dataType.length);
        for (SavingsPlansDataType value : dataType) {
            dataTypeCopy.add(value.toString());
        }
        if (getDataType() == null) {
            setDataType(dataTypeCopy);
        } else {
            getDataType().addAll(dataTypeCopy);
        }
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *        <code>1</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @return The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *         <code>1</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *        <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The following values are supported for <code>Key</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UtilizationPercentage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TotalCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnusedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetSavings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedRecurringCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedUpfrontCommitment</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The following values are supported for <code>Key</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UtilizationPercentage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TotalCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsedCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnusedCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetSavings</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedRecurringCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedUpfrontCommitment</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     */

    public void setSortBy(SortDefinition sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The following values are supported for <code>Key</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UtilizationPercentage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TotalCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnusedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetSavings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedRecurringCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedUpfrontCommitment</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * 
     * @return The value by which you want to sort the data.</p>
     *         <p>
     *         The following values are supported for <code>Key</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UtilizationPercentage</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TotalCommitment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UsedCommitment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UnusedCommitment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetSavings</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AmortizedRecurringCommitment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AmortizedUpfrontCommitment</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     */

    public SortDefinition getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The following values are supported for <code>Key</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UtilizationPercentage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TotalCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnusedCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetSavings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedRecurringCommitment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedUpfrontCommitment</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The following values are supported for <code>Key</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UtilizationPercentage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TotalCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsedCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnusedCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetSavings</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedRecurringCommitment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedUpfrontCommitment</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsRequest withSortBy(SortDefinition sortBy) {
        setSortBy(sortBy);
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansUtilizationDetailsRequest == false)
            return false;
        GetSavingsPlansUtilizationDetailsRequest other = (GetSavingsPlansUtilizationDetailsRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansUtilizationDetailsRequest clone() {
        return (GetSavingsPlansUtilizationDetailsRequest) super.clone();
    }

}
