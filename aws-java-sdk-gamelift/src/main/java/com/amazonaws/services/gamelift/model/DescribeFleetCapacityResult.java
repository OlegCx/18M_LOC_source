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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetCapacityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are
     * returned only for fleets that currently exist.
     * </p>
     */
    private java.util.List<FleetCapacity> fleetCapacity;
    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are
     * returned only for fleets that currently exist.
     * </p>
     * 
     * @return A collection of objects that contains capacity information for each requested fleet ID. Capacity objects
     *         are returned only for fleets that currently exist.
     */

    public java.util.List<FleetCapacity> getFleetCapacity() {
        return fleetCapacity;
    }

    /**
     * <p>
     * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are
     * returned only for fleets that currently exist.
     * </p>
     * 
     * @param fleetCapacity
     *        A collection of objects that contains capacity information for each requested fleet ID. Capacity objects
     *        are returned only for fleets that currently exist.
     */

    public void setFleetCapacity(java.util.Collection<FleetCapacity> fleetCapacity) {
        if (fleetCapacity == null) {
            this.fleetCapacity = null;
            return;
        }

        this.fleetCapacity = new java.util.ArrayList<FleetCapacity>(fleetCapacity);
    }

    /**
     * <p>
     * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are
     * returned only for fleets that currently exist.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetCapacity(java.util.Collection)} or {@link #withFleetCapacity(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fleetCapacity
     *        A collection of objects that contains capacity information for each requested fleet ID. Capacity objects
     *        are returned only for fleets that currently exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetCapacityResult withFleetCapacity(FleetCapacity... fleetCapacity) {
        if (this.fleetCapacity == null) {
            setFleetCapacity(new java.util.ArrayList<FleetCapacity>(fleetCapacity.length));
        }
        for (FleetCapacity ele : fleetCapacity) {
            this.fleetCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are
     * returned only for fleets that currently exist.
     * </p>
     * 
     * @param fleetCapacity
     *        A collection of objects that contains capacity information for each requested fleet ID. Capacity objects
     *        are returned only for fleets that currently exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetCapacityResult withFleetCapacity(java.util.Collection<FleetCapacity> fleetCapacity) {
        setFleetCapacity(fleetCapacity);
        return this;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @return A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *         is returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetCapacityResult withNextToken(String nextToken) {
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
        if (getFleetCapacity() != null)
            sb.append("FleetCapacity: ").append(getFleetCapacity()).append(",");
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

        if (obj instanceof DescribeFleetCapacityResult == false)
            return false;
        DescribeFleetCapacityResult other = (DescribeFleetCapacityResult) obj;
        if (other.getFleetCapacity() == null ^ this.getFleetCapacity() == null)
            return false;
        if (other.getFleetCapacity() != null && other.getFleetCapacity().equals(this.getFleetCapacity()) == false)
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

        hashCode = prime * hashCode + ((getFleetCapacity() == null) ? 0 : getFleetCapacity().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetCapacityResult clone() {
        try {
            return (DescribeFleetCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
