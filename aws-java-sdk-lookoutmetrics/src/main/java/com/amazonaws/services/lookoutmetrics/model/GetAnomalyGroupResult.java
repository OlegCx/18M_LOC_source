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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomalyGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the anomaly group.
     * </p>
     */
    private AnomalyGroup anomalyGroup;

    /**
     * <p>
     * Details about the anomaly group.
     * </p>
     * 
     * @param anomalyGroup
     *        Details about the anomaly group.
     */

    public void setAnomalyGroup(AnomalyGroup anomalyGroup) {
        this.anomalyGroup = anomalyGroup;
    }

    /**
     * <p>
     * Details about the anomaly group.
     * </p>
     * 
     * @return Details about the anomaly group.
     */

    public AnomalyGroup getAnomalyGroup() {
        return this.anomalyGroup;
    }

    /**
     * <p>
     * Details about the anomaly group.
     * </p>
     * 
     * @param anomalyGroup
     *        Details about the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyGroupResult withAnomalyGroup(AnomalyGroup anomalyGroup) {
        setAnomalyGroup(anomalyGroup);
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
        if (getAnomalyGroup() != null)
            sb.append("AnomalyGroup: ").append(getAnomalyGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnomalyGroupResult == false)
            return false;
        GetAnomalyGroupResult other = (GetAnomalyGroupResult) obj;
        if (other.getAnomalyGroup() == null ^ this.getAnomalyGroup() == null)
            return false;
        if (other.getAnomalyGroup() != null && other.getAnomalyGroup().equals(this.getAnomalyGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyGroup() == null) ? 0 : getAnomalyGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomalyGroupResult clone() {
        try {
            return (GetAnomalyGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
