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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectorModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     */
    private java.util.List<DetectorModelSummary> detectorModelSummaries;
    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * 
     * @return Summary information about the detector models.
     */

    public java.util.List<DetectorModelSummary> getDetectorModelSummaries() {
        return detectorModelSummaries;
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * 
     * @param detectorModelSummaries
     *        Summary information about the detector models.
     */

    public void setDetectorModelSummaries(java.util.Collection<DetectorModelSummary> detectorModelSummaries) {
        if (detectorModelSummaries == null) {
            this.detectorModelSummaries = null;
            return;
        }

        this.detectorModelSummaries = new java.util.ArrayList<DetectorModelSummary>(detectorModelSummaries);
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorModelSummaries(java.util.Collection)} or
     * {@link #withDetectorModelSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param detectorModelSummaries
     *        Summary information about the detector models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelsResult withDetectorModelSummaries(DetectorModelSummary... detectorModelSummaries) {
        if (this.detectorModelSummaries == null) {
            setDetectorModelSummaries(new java.util.ArrayList<DetectorModelSummary>(detectorModelSummaries.length));
        }
        for (DetectorModelSummary ele : detectorModelSummaries) {
            this.detectorModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * 
     * @param detectorModelSummaries
     *        Summary information about the detector models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelsResult withDetectorModelSummaries(java.util.Collection<DetectorModelSummary> detectorModelSummaries) {
        setDetectorModelSummaries(detectorModelSummaries);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelsResult withNextToken(String nextToken) {
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
        if (getDetectorModelSummaries() != null)
            sb.append("DetectorModelSummaries: ").append(getDetectorModelSummaries()).append(",");
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

        if (obj instanceof ListDetectorModelsResult == false)
            return false;
        ListDetectorModelsResult other = (ListDetectorModelsResult) obj;
        if (other.getDetectorModelSummaries() == null ^ this.getDetectorModelSummaries() == null)
            return false;
        if (other.getDetectorModelSummaries() != null && other.getDetectorModelSummaries().equals(this.getDetectorModelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDetectorModelSummaries() == null) ? 0 : getDetectorModelSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectorModelsResult clone() {
        try {
            return (ListDetectorModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
