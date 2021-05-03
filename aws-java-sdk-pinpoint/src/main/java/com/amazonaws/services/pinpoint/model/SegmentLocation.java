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
 * Specifies geographical dimension settings for a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     * </p>
     */
    private SetDimension country;
    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     */
    private GPSPointDimension gPSPoint;

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     * </p>
     * 
     * @param country
     *        The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     */

    public void setCountry(SetDimension country) {
        this.country = country;
    }

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     * </p>
     * 
     * @return The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     */

    public SetDimension getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     * </p>
     * 
     * @param country
     *        The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentLocation withCountry(SetDimension country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     * 
     * @param gPSPoint
     *        The GPS location and range for the segment.
     */

    public void setGPSPoint(GPSPointDimension gPSPoint) {
        this.gPSPoint = gPSPoint;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     * 
     * @return The GPS location and range for the segment.
     */

    public GPSPointDimension getGPSPoint() {
        return this.gPSPoint;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     * 
     * @param gPSPoint
     *        The GPS location and range for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentLocation withGPSPoint(GPSPointDimension gPSPoint) {
        setGPSPoint(gPSPoint);
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
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getGPSPoint() != null)
            sb.append("GPSPoint: ").append(getGPSPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentLocation == false)
            return false;
        SegmentLocation other = (SegmentLocation) obj;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGPSPoint() == null ^ this.getGPSPoint() == null)
            return false;
        if (other.getGPSPoint() != null && other.getGPSPoint().equals(this.getGPSPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getGPSPoint() == null) ? 0 : getGPSPoint().hashCode());
        return hashCode;
    }

    @Override
    public SegmentLocation clone() {
        try {
            return (SegmentLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
