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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ListPipelineExecutions</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelineExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used to
     * return the next set of pipeline executions in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get execution summary information.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @return The name of the pipeline for which you want to get execution summary information.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get execution summary information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on
     *        pipeline execution start times. Default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based
     *         on pipeline execution start times. Default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on
     *        pipeline execution start times. Default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used to
     * return the next set of pipeline executions in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used
     *        to return the next set of pipeline executions in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used to
     * return the next set of pipeline executions in the list.
     * </p>
     * 
     * @return The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used
     *         to return the next set of pipeline executions in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used to
     * return the next set of pipeline executions in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListPipelineExecutions</code> call, which can be used
     *        to return the next set of pipeline executions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsRequest withNextToken(String nextToken) {
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListPipelineExecutionsRequest == false)
            return false;
        ListPipelineExecutionsRequest other = (ListPipelineExecutionsRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineExecutionsRequest clone() {
        return (ListPipelineExecutionsRequest) super.clone();
    }

}
