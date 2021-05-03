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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the location of the remote IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GeoLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     */
    private Double lat;
    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     */
    private Double lon;

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     * 
     * @param lat
     *        The latitude information of the remote IP address.
     */

    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     * 
     * @return The latitude information of the remote IP address.
     */

    public Double getLat() {
        return this.lat;
    }

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     * 
     * @param lat
     *        The latitude information of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withLat(Double lat) {
        setLat(lat);
        return this;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     * 
     * @param lon
     *        The longitude information of the remote IP address.
     */

    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     * 
     * @return The longitude information of the remote IP address.
     */

    public Double getLon() {
        return this.lon;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     * 
     * @param lon
     *        The longitude information of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withLon(Double lon) {
        setLon(lon);
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
        if (getLat() != null)
            sb.append("Lat: ").append(getLat()).append(",");
        if (getLon() != null)
            sb.append("Lon: ").append(getLon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocation == false)
            return false;
        GeoLocation other = (GeoLocation) obj;
        if (other.getLat() == null ^ this.getLat() == null)
            return false;
        if (other.getLat() != null && other.getLat().equals(this.getLat()) == false)
            return false;
        if (other.getLon() == null ^ this.getLon() == null)
            return false;
        if (other.getLon() != null && other.getLon().equals(this.getLon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLat() == null) ? 0 : getLat().hashCode());
        hashCode = prime * hashCode + ((getLon() == null) ? 0 : getLon().hashCode());
        return hashCode;
    }

    @Override
    public GeoLocation clone() {
        try {
            return (GeoLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.GeoLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
