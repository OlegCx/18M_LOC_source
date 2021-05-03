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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArtifactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of artifacts and their properties.
     * </p>
     */
    private java.util.List<ArtifactSummary> artifactSummaries;
    /**
     * <p>
     * A token for getting the next set of artifacts, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of artifacts and their properties.
     * </p>
     * 
     * @return A list of artifacts and their properties.
     */

    public java.util.List<ArtifactSummary> getArtifactSummaries() {
        return artifactSummaries;
    }

    /**
     * <p>
     * A list of artifacts and their properties.
     * </p>
     * 
     * @param artifactSummaries
     *        A list of artifacts and their properties.
     */

    public void setArtifactSummaries(java.util.Collection<ArtifactSummary> artifactSummaries) {
        if (artifactSummaries == null) {
            this.artifactSummaries = null;
            return;
        }

        this.artifactSummaries = new java.util.ArrayList<ArtifactSummary>(artifactSummaries);
    }

    /**
     * <p>
     * A list of artifacts and their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifactSummaries(java.util.Collection)} or {@link #withArtifactSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param artifactSummaries
     *        A list of artifacts and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withArtifactSummaries(ArtifactSummary... artifactSummaries) {
        if (this.artifactSummaries == null) {
            setArtifactSummaries(new java.util.ArrayList<ArtifactSummary>(artifactSummaries.length));
        }
        for (ArtifactSummary ele : artifactSummaries) {
            this.artifactSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of artifacts and their properties.
     * </p>
     * 
     * @param artifactSummaries
     *        A list of artifacts and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withArtifactSummaries(java.util.Collection<ArtifactSummary> artifactSummaries) {
        setArtifactSummaries(artifactSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of artifacts, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of artifacts, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of artifacts, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of artifacts, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of artifacts, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of artifacts, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withNextToken(String nextToken) {
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
        if (getArtifactSummaries() != null)
            sb.append("ArtifactSummaries: ").append(getArtifactSummaries()).append(",");
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

        if (obj instanceof ListArtifactsResult == false)
            return false;
        ListArtifactsResult other = (ListArtifactsResult) obj;
        if (other.getArtifactSummaries() == null ^ this.getArtifactSummaries() == null)
            return false;
        if (other.getArtifactSummaries() != null && other.getArtifactSummaries().equals(this.getArtifactSummaries()) == false)
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

        hashCode = prime * hashCode + ((getArtifactSummaries() == null) ? 0 : getArtifactSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListArtifactsResult clone() {
        try {
            return (ListArtifactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
