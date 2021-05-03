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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTraceSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time frame for which to retrieve traces.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time frame for which to retrieve traces.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * </p>
     */
    private String timeRangeType;
    /**
     * <p>
     * Set to <code>true</code> to get summaries for only a subset of available traces.
     * </p>
     */
    private Boolean sampling;
    /**
     * <p>
     * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
     * </p>
     */
    private SamplingStrategy samplingStrategy;
    /**
     * <p>
     * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start of the time frame for which to retrieve traces.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which to retrieve traces.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time frame for which to retrieve traces.
     * </p>
     * 
     * @return The start of the time frame for which to retrieve traces.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time frame for which to retrieve traces.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which to retrieve traces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time frame for which to retrieve traces.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which to retrieve traces.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time frame for which to retrieve traces.
     * </p>
     * 
     * @return The end of the time frame for which to retrieve traces.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time frame for which to retrieve traces.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which to retrieve traces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * </p>
     * 
     * @param timeRangeType
     *        A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * @see TimeRangeType
     */

    public void setTimeRangeType(String timeRangeType) {
        this.timeRangeType = timeRangeType;
    }

    /**
     * <p>
     * A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * </p>
     * 
     * @return A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * @see TimeRangeType
     */

    public String getTimeRangeType() {
        return this.timeRangeType;
    }

    /**
     * <p>
     * A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * </p>
     * 
     * @param timeRangeType
     *        A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRangeType
     */

    public GetTraceSummariesRequest withTimeRangeType(String timeRangeType) {
        setTimeRangeType(timeRangeType);
        return this;
    }

    /**
     * <p>
     * A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * </p>
     * 
     * @param timeRangeType
     *        A parameter to indicate whether to query trace summaries by TraceId or Event time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRangeType
     */

    public GetTraceSummariesRequest withTimeRangeType(TimeRangeType timeRangeType) {
        this.timeRangeType = timeRangeType.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to get summaries for only a subset of available traces.
     * </p>
     * 
     * @param sampling
     *        Set to <code>true</code> to get summaries for only a subset of available traces.
     */

    public void setSampling(Boolean sampling) {
        this.sampling = sampling;
    }

    /**
     * <p>
     * Set to <code>true</code> to get summaries for only a subset of available traces.
     * </p>
     * 
     * @return Set to <code>true</code> to get summaries for only a subset of available traces.
     */

    public Boolean getSampling() {
        return this.sampling;
    }

    /**
     * <p>
     * Set to <code>true</code> to get summaries for only a subset of available traces.
     * </p>
     * 
     * @param sampling
     *        Set to <code>true</code> to get summaries for only a subset of available traces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withSampling(Boolean sampling) {
        setSampling(sampling);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to get summaries for only a subset of available traces.
     * </p>
     * 
     * @return Set to <code>true</code> to get summaries for only a subset of available traces.
     */

    public Boolean isSampling() {
        return this.sampling;
    }

    /**
     * <p>
     * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
     * </p>
     * 
     * @param samplingStrategy
     *        A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and
     *        Value.
     */

    public void setSamplingStrategy(SamplingStrategy samplingStrategy) {
        this.samplingStrategy = samplingStrategy;
    }

    /**
     * <p>
     * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
     * </p>
     * 
     * @return A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and
     *         Value.
     */

    public SamplingStrategy getSamplingStrategy() {
        return this.samplingStrategy;
    }

    /**
     * <p>
     * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
     * </p>
     * 
     * @param samplingStrategy
     *        A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and
     *        Value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withSamplingStrategy(SamplingStrategy samplingStrategy) {
        setSamplingStrategy(samplingStrategy);
        return this;
    }

    /**
     * <p>
     * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
     * </p>
     * 
     * @param filterExpression
     *        Specify a filter expression to retrieve trace summaries for services or requests that meet certain
     *        requirements.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
     * </p>
     * 
     * @return Specify a filter expression to retrieve trace summaries for services or requests that meet certain
     *         requirements.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
     * </p>
     * 
     * @param filterExpression
     *        Specify a filter expression to retrieve trace summaries for services or requests that meet certain
     *        requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token returned by a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesRequest withNextToken(String nextToken) {
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTimeRangeType() != null)
            sb.append("TimeRangeType: ").append(getTimeRangeType()).append(",");
        if (getSampling() != null)
            sb.append("Sampling: ").append(getSampling()).append(",");
        if (getSamplingStrategy() != null)
            sb.append("SamplingStrategy: ").append(getSamplingStrategy()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
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

        if (obj instanceof GetTraceSummariesRequest == false)
            return false;
        GetTraceSummariesRequest other = (GetTraceSummariesRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTimeRangeType() == null ^ this.getTimeRangeType() == null)
            return false;
        if (other.getTimeRangeType() != null && other.getTimeRangeType().equals(this.getTimeRangeType()) == false)
            return false;
        if (other.getSampling() == null ^ this.getSampling() == null)
            return false;
        if (other.getSampling() != null && other.getSampling().equals(this.getSampling()) == false)
            return false;
        if (other.getSamplingStrategy() == null ^ this.getSamplingStrategy() == null)
            return false;
        if (other.getSamplingStrategy() != null && other.getSamplingStrategy().equals(this.getSamplingStrategy()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeType() == null) ? 0 : getTimeRangeType().hashCode());
        hashCode = prime * hashCode + ((getSampling() == null) ? 0 : getSampling().hashCode());
        hashCode = prime * hashCode + ((getSamplingStrategy() == null) ? 0 : getSamplingStrategy().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTraceSummariesRequest clone() {
        return (GetTraceSummariesRequest) super.clone();
    }

}
