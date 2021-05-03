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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContinuousExportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique IDs assigned to the exports.
     * </p>
     */
    private java.util.List<String> exportIds;
    /**
     * <p>
     * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique IDs assigned to the exports.
     * </p>
     * 
     * @return The unique IDs assigned to the exports.
     */

    public java.util.List<String> getExportIds() {
        return exportIds;
    }

    /**
     * <p>
     * The unique IDs assigned to the exports.
     * </p>
     * 
     * @param exportIds
     *        The unique IDs assigned to the exports.
     */

    public void setExportIds(java.util.Collection<String> exportIds) {
        if (exportIds == null) {
            this.exportIds = null;
            return;
        }

        this.exportIds = new java.util.ArrayList<String>(exportIds);
    }

    /**
     * <p>
     * The unique IDs assigned to the exports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportIds(java.util.Collection)} or {@link #withExportIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportIds
     *        The unique IDs assigned to the exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsRequest withExportIds(String... exportIds) {
        if (this.exportIds == null) {
            setExportIds(new java.util.ArrayList<String>(exportIds.length));
        }
        for (String ele : exportIds) {
            this.exportIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs assigned to the exports.
     * </p>
     * 
     * @param exportIds
     *        The unique IDs assigned to the exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsRequest withExportIds(java.util.Collection<String> exportIds) {
        setExportIds(exportIds);
        return this;
    }

    /**
     * <p>
     * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     * </p>
     * 
     * @param maxResults
     *        A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     * </p>
     * 
     * @return A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     * </p>
     * 
     * @param maxResults
     *        A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to <code>DescribeExportTasks</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @return The token from the previous call to <code>DescribeExportTasks</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to <code>DescribeExportTasks</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsRequest withNextToken(String nextToken) {
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
        if (getExportIds() != null)
            sb.append("ExportIds: ").append(getExportIds()).append(",");
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

        if (obj instanceof DescribeContinuousExportsRequest == false)
            return false;
        DescribeContinuousExportsRequest other = (DescribeContinuousExportsRequest) obj;
        if (other.getExportIds() == null ^ this.getExportIds() == null)
            return false;
        if (other.getExportIds() != null && other.getExportIds().equals(this.getExportIds()) == false)
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

        hashCode = prime * hashCode + ((getExportIds() == null) ? 0 : getExportIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContinuousExportsRequest clone() {
        return (DescribeContinuousExportsRequest) super.clone();
    }

}
