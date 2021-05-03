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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies GPS-based criteria for including or excluding endpoints from a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GPSPointDimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GPSPointDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     */
    private GPSCoordinates coordinates;
    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     */
    private Double rangeInKilometers;

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     * 
     * @param coordinates
     *        The GPS coordinates to measure distance from.
     */

    public void setCoordinates(GPSCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     * 
     * @return The GPS coordinates to measure distance from.
     */

    public GPSCoordinates getCoordinates() {
        return this.coordinates;
    }

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     * 
     * @param coordinates
     *        The GPS coordinates to measure distance from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GPSPointDimension withCoordinates(GPSCoordinates coordinates) {
        setCoordinates(coordinates);
        return this;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     * 
     * @param rangeInKilometers
     *        The range, in kilometers, from the GPS coordinates.
     */

    public void setRangeInKilometers(Double rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     * 
     * @return The range, in kilometers, from the GPS coordinates.
     */

    public Double getRangeInKilometers() {
        return this.rangeInKilometers;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     * 
     * @param rangeInKilometers
     *        The range, in kilometers, from the GPS coordinates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GPSPointDimension withRangeInKilometers(Double rangeInKilometers) {
        setRangeInKilometers(rangeInKilometers);
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
        if (getCoordinates() != null)
            sb.append("Coordinates: ").append(getCoordinates()).append(",");
        if (getRangeInKilometers() != null)
            sb.append("RangeInKilometers: ").append(getRangeInKilometers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GPSPointDimension == false)
            return false;
        GPSPointDimension other = (GPSPointDimension) obj;
        if (other.getCoordinates() == null ^ this.getCoordinates() == null)
            return false;
        if (other.getCoordinates() != null && other.getCoordinates().equals(this.getCoordinates()) == false)
            return false;
        if (other.getRangeInKilometers() == null ^ this.getRangeInKilometers() == null)
            return false;
        if (other.getRangeInKilometers() != null && other.getRangeInKilometers().equals(this.getRangeInKilometers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        hashCode = prime * hashCode + ((getRangeInKilometers() == null) ? 0 : getRangeInKilometers().hashCode());
        return hashCode;
    }

    @Override
    public GPSPointDimension clone() {
        try {
            return (GPSPointDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.GPSPointDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
