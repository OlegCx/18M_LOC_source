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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a city.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/City" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class City implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the city.
     * </p>
     */
    private String cityName;

    /**
     * <p>
     * The name of the city.
     * </p>
     * 
     * @param cityName
     *        The name of the city.
     */

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * <p>
     * The name of the city.
     * </p>
     * 
     * @return The name of the city.
     */

    public String getCityName() {
        return this.cityName;
    }

    /**
     * <p>
     * The name of the city.
     * </p>
     * 
     * @param cityName
     *        The name of the city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public City withCityName(String cityName) {
        setCityName(cityName);
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
        if (getCityName() != null)
            sb.append("CityName: ").append(getCityName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof City == false)
            return false;
        City other = (City) obj;
        if (other.getCityName() == null ^ this.getCityName() == null)
            return false;
        if (other.getCityName() != null && other.getCityName().equals(this.getCityName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCityName() == null) ? 0 : getCityName().hashCode());
        return hashCode;
    }

    @Override
    public City clone() {
        try {
            return (City) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
