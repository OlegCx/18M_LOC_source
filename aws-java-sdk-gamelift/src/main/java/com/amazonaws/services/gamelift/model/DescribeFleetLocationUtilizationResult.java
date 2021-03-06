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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationUtilization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetLocationUtilizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Utilization information for the requested fleet location. Utilization objects are returned only for fleets and
     * locations that currently exist.
     * </p>
     */
    private FleetUtilization fleetUtilization;

    /**
     * <p>
     * Utilization information for the requested fleet location. Utilization objects are returned only for fleets and
     * locations that currently exist.
     * </p>
     * 
     * @param fleetUtilization
     *        Utilization information for the requested fleet location. Utilization objects are returned only for fleets
     *        and locations that currently exist.
     */

    public void setFleetUtilization(FleetUtilization fleetUtilization) {
        this.fleetUtilization = fleetUtilization;
    }

    /**
     * <p>
     * Utilization information for the requested fleet location. Utilization objects are returned only for fleets and
     * locations that currently exist.
     * </p>
     * 
     * @return Utilization information for the requested fleet location. Utilization objects are returned only for
     *         fleets and locations that currently exist.
     */

    public FleetUtilization getFleetUtilization() {
        return this.fleetUtilization;
    }

    /**
     * <p>
     * Utilization information for the requested fleet location. Utilization objects are returned only for fleets and
     * locations that currently exist.
     * </p>
     * 
     * @param fleetUtilization
     *        Utilization information for the requested fleet location. Utilization objects are returned only for fleets
     *        and locations that currently exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetLocationUtilizationResult withFleetUtilization(FleetUtilization fleetUtilization) {
        setFleetUtilization(fleetUtilization);
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
        if (getFleetUtilization() != null)
            sb.append("FleetUtilization: ").append(getFleetUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetLocationUtilizationResult == false)
            return false;
        DescribeFleetLocationUtilizationResult other = (DescribeFleetLocationUtilizationResult) obj;
        if (other.getFleetUtilization() == null ^ this.getFleetUtilization() == null)
            return false;
        if (other.getFleetUtilization() != null && other.getFleetUtilization().equals(this.getFleetUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetUtilization() == null) ? 0 : getFleetUtilization().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetLocationUtilizationResult clone() {
        try {
            return (DescribeFleetLocationUtilizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
