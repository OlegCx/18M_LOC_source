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
 * Contains information about the remote IP address of the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RemoteIpDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteIpDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     */
    private City city;
    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     */
    private Country country;
    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     */
    private GeoLocation geoLocation;
    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     */
    private String ipAddressV4;
    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     */
    private Organization organization;

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     * 
     * @param city
     *        The city information of the remote IP address.
     */

    public void setCity(City city) {
        this.city = city;
    }

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     * 
     * @return The city information of the remote IP address.
     */

    public City getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     * 
     * @param city
     *        The city information of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteIpDetails withCity(City city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     * 
     * @param country
     *        The country code of the remote IP address.
     */

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     * 
     * @return The country code of the remote IP address.
     */

    public Country getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     * 
     * @param country
     *        The country code of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteIpDetails withCountry(Country country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     * 
     * @param geoLocation
     *        The location information of the remote IP address.
     */

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     * 
     * @return The location information of the remote IP address.
     */

    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     * 
     * @param geoLocation
     *        The location information of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteIpDetails withGeoLocation(GeoLocation geoLocation) {
        setGeoLocation(geoLocation);
        return this;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     * 
     * @param ipAddressV4
     *        The IPv4 remote address of the connection.
     */

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     * 
     * @return The IPv4 remote address of the connection.
     */

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     * 
     * @param ipAddressV4
     *        The IPv4 remote address of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteIpDetails withIpAddressV4(String ipAddressV4) {
        setIpAddressV4(ipAddressV4);
        return this;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     * 
     * @param organization
     *        The ISP organization information of the remote IP address.
     */

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     * 
     * @return The ISP organization information of the remote IP address.
     */

    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     * 
     * @param organization
     *        The ISP organization information of the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteIpDetails withOrganization(Organization organization) {
        setOrganization(organization);
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
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getGeoLocation() != null)
            sb.append("GeoLocation: ").append(getGeoLocation()).append(",");
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: ").append(getIpAddressV4()).append(",");
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteIpDetails == false)
            return false;
        RemoteIpDetails other = (RemoteIpDetails) obj;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGeoLocation() == null ^ this.getGeoLocation() == null)
            return false;
        if (other.getGeoLocation() != null && other.getGeoLocation().equals(this.getGeoLocation()) == false)
            return false;
        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getGeoLocation() == null) ? 0 : getGeoLocation().hashCode());
        hashCode = prime * hashCode + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        return hashCode;
    }

    @Override
    public RemoteIpDetails clone() {
        try {
            return (RemoteIpDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RemoteIpDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
