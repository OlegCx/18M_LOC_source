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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetExportJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetExportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of dataset
     * export jobs (if they exist).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of dataset export jobs to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset to list the dataset export jobs for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of dataset
     * export jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of
     *        dataset export jobs (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of dataset
     * export jobs (if they exist).
     * </p>
     * 
     * @return A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of
     *         dataset export jobs (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of dataset
     * export jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListDatasetExportJobs</code> for getting the next set of
     *        dataset export jobs (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of dataset export jobs to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of dataset export jobs to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of dataset export jobs to return.
     * </p>
     * 
     * @return The maximum number of dataset export jobs to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of dataset export jobs to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of dataset export jobs to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetExportJobsRequest == false)
            return false;
        ListDatasetExportJobsRequest other = (ListDatasetExportJobsRequest) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetExportJobsRequest clone() {
        return (ListDatasetExportJobsRequest) super.clone();
    }

}
