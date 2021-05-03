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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the response to a <code>GetHealthCheckLastFailureReason</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckLastFailureReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthCheckLastFailureReasonResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     * reporting a last failure reason.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HealthCheckObservation> healthCheckObservations;

    /**
     * <p>
     * A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     * reporting a last failure reason.
     * </p>
     * 
     * @return A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     *         reporting a last failure reason.
     */

    public java.util.List<HealthCheckObservation> getHealthCheckObservations() {
        if (healthCheckObservations == null) {
            healthCheckObservations = new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>();
        }
        return healthCheckObservations;
    }

    /**
     * <p>
     * A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     * reporting a last failure reason.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     *        reporting a last failure reason.
     */

    public void setHealthCheckObservations(java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        if (healthCheckObservations == null) {
            this.healthCheckObservations = null;
            return;
        }

        this.healthCheckObservations = new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>(healthCheckObservations);
    }

    /**
     * <p>
     * A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     * reporting a last failure reason.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHealthCheckObservations(java.util.Collection)} or
     * {@link #withHealthCheckObservations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     *        reporting a last failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckLastFailureReasonResult withHealthCheckObservations(HealthCheckObservation... healthCheckObservations) {
        if (this.healthCheckObservations == null) {
            setHealthCheckObservations(new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>(healthCheckObservations.length));
        }
        for (HealthCheckObservation ele : healthCheckObservations) {
            this.healthCheckObservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     * reporting a last failure reason.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>Observation</code> element for each Amazon Route 53 health checker that is
     *        reporting a last failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckLastFailureReasonResult withHealthCheckObservations(java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        setHealthCheckObservations(healthCheckObservations);
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
        if (getHealthCheckObservations() != null)
            sb.append("HealthCheckObservations: ").append(getHealthCheckObservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckLastFailureReasonResult == false)
            return false;
        GetHealthCheckLastFailureReasonResult other = (GetHealthCheckLastFailureReasonResult) obj;
        if (other.getHealthCheckObservations() == null ^ this.getHealthCheckObservations() == null)
            return false;
        if (other.getHealthCheckObservations() != null && other.getHealthCheckObservations().equals(this.getHealthCheckObservations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheckObservations() == null) ? 0 : getHealthCheckObservations().hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckLastFailureReasonResult clone() {
        try {
            return (GetHealthCheckLastFailureReasonResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
