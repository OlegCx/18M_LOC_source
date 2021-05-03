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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleetLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     */
    private java.util.List<String> locations;

    /**
     * <p>
     * A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     *         <code>us-west-2</code>.
     */

    public java.util.List<String> getLocations() {
        return locations;
    }

    /**
     * <p>
     * The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param locations
     *        The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     *        <code>us-west-2</code>.
     */

    public void setLocations(java.util.Collection<String> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new java.util.ArrayList<String>(locations);
    }

    /**
     * <p>
     * The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsRequest withLocations(String... locations) {
        if (this.locations == null) {
            setLocations(new java.util.ArrayList<String>(locations.length));
        }
        for (String ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param locations
     *        The list of fleet locations to delete. Specify locations in the form of an AWS Region code, such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsRequest withLocations(java.util.Collection<String> locations) {
        setLocations(locations);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getLocations() != null)
            sb.append("Locations: ").append(getLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetLocationsRequest == false)
            return false;
        DeleteFleetLocationsRequest other = (DeleteFleetLocationsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetLocationsRequest clone() {
        return (DeleteFleetLocationsRequest) super.clone();
    }

}
