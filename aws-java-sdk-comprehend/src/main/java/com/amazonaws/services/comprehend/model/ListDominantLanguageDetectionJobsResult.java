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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDominantLanguageDetectionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDominantLanguageDetectionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @return A list containing the properties of each job that is returned.
     */

    public java.util.List<DominantLanguageDetectionJobProperties> getDominantLanguageDetectionJobPropertiesList() {
        return dominantLanguageDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param dominantLanguageDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     */

    public void setDominantLanguageDetectionJobPropertiesList(
            java.util.Collection<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList) {
        if (dominantLanguageDetectionJobPropertiesList == null) {
            this.dominantLanguageDetectionJobPropertiesList = null;
            return;
        }

        this.dominantLanguageDetectionJobPropertiesList = new java.util.ArrayList<DominantLanguageDetectionJobProperties>(
                dominantLanguageDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDominantLanguageDetectionJobPropertiesList(java.util.Collection)} or
     * {@link #withDominantLanguageDetectionJobPropertiesList(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dominantLanguageDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDominantLanguageDetectionJobsResult withDominantLanguageDetectionJobPropertiesList(
            DominantLanguageDetectionJobProperties... dominantLanguageDetectionJobPropertiesList) {
        if (this.dominantLanguageDetectionJobPropertiesList == null) {
            setDominantLanguageDetectionJobPropertiesList(new java.util.ArrayList<DominantLanguageDetectionJobProperties>(
                    dominantLanguageDetectionJobPropertiesList.length));
        }
        for (DominantLanguageDetectionJobProperties ele : dominantLanguageDetectionJobPropertiesList) {
            this.dominantLanguageDetectionJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param dominantLanguageDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDominantLanguageDetectionJobsResult withDominantLanguageDetectionJobPropertiesList(
            java.util.Collection<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList) {
        setDominantLanguageDetectionJobPropertiesList(dominantLanguageDetectionJobPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDominantLanguageDetectionJobsResult withNextToken(String nextToken) {
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
        if (getDominantLanguageDetectionJobPropertiesList() != null)
            sb.append("DominantLanguageDetectionJobPropertiesList: ").append(getDominantLanguageDetectionJobPropertiesList()).append(",");
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

        if (obj instanceof ListDominantLanguageDetectionJobsResult == false)
            return false;
        ListDominantLanguageDetectionJobsResult other = (ListDominantLanguageDetectionJobsResult) obj;
        if (other.getDominantLanguageDetectionJobPropertiesList() == null ^ this.getDominantLanguageDetectionJobPropertiesList() == null)
            return false;
        if (other.getDominantLanguageDetectionJobPropertiesList() != null
                && other.getDominantLanguageDetectionJobPropertiesList().equals(this.getDominantLanguageDetectionJobPropertiesList()) == false)
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

        hashCode = prime * hashCode
                + ((getDominantLanguageDetectionJobPropertiesList() == null) ? 0 : getDominantLanguageDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDominantLanguageDetectionJobsResult clone() {
        try {
            return (ListDominantLanguageDetectionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
