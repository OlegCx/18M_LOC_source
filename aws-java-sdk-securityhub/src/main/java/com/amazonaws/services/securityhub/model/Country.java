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
 * Information about a country.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Country" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Country implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 2-letter ISO 3166 country code for the country.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The name of the country.
     * </p>
     */
    private String countryName;

    /**
     * <p>
     * The 2-letter ISO 3166 country code for the country.
     * </p>
     * 
     * @param countryCode
     *        The 2-letter ISO 3166 country code for the country.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The 2-letter ISO 3166 country code for the country.
     * </p>
     * 
     * @return The 2-letter ISO 3166 country code for the country.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The 2-letter ISO 3166 country code for the country.
     * </p>
     * 
     * @param countryCode
     *        The 2-letter ISO 3166 country code for the country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Country withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @param countryName
     *        The name of the country.
     */

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @return The name of the country.
     */

    public String getCountryName() {
        return this.countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @param countryName
     *        The name of the country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Country withCountryName(String countryName) {
        setCountryName(countryName);
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
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getCountryName() != null)
            sb.append("CountryName: ").append(getCountryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Country == false)
            return false;
        Country other = (Country) obj;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCountryName() == null ^ this.getCountryName() == null)
            return false;
        if (other.getCountryName() != null && other.getCountryName().equals(this.getCountryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        return hashCode;
    }

    @Override
    public Country clone() {
        try {
            return (Country) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CountryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
