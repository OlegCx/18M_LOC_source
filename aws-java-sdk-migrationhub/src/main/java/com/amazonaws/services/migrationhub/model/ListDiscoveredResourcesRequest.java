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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveredResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results returned per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @return The name of the ProgressUpdateStream.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     * </p>
     * 
     * @param migrationTaskName
     *        The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     * </p>
     * 
     * @return The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     * </p>
     * 
     * @param migrationTaskName
     *        The name of the MigrationTask. <i>Do not store personal data in this field.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in <code>NextToken</code>
     *         .
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned per page.
     * </p>
     * 
     * @return The maximum number of results returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withMaxResults(Integer maxResults) {
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
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

        if (obj instanceof ListDiscoveredResourcesRequest == false)
            return false;
        ListDiscoveredResourcesRequest other = (ListDiscoveredResourcesRequest) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
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

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveredResourcesRequest clone() {
        return (ListDiscoveredResourcesRequest) super.clone();
    }

}
