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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     * </p>
     */
    private Statistics statistics;

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     * </p>
     * 
     * @param statistics
     *        The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     */

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     * </p>
     * 
     * @return The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     */

    public Statistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     * </p>
     * 
     * @param statistics
     *        The statistics returned by the Fleet Indexing service based on the query and aggregation field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatisticsResult withStatistics(Statistics statistics) {
        setStatistics(statistics);
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
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStatisticsResult == false)
            return false;
        GetStatisticsResult other = (GetStatisticsResult) obj;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetStatisticsResult clone() {
        try {
            return (GetStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
