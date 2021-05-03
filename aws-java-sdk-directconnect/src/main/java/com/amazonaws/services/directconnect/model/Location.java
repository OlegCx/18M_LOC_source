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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an AWS Direct Connect location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code for the location.
     * </p>
     */
    private String locationCode;
    /**
     * <p>
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * </p>
     */
    private String locationName;
    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availablePortSpeeds;
    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availableProviders;
    /**
     * <p>
     * The available MAC Security (MACsec) port speeds for the location.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availableMacSecPortSpeeds;

    /**
     * <p>
     * The code for the location.
     * </p>
     * 
     * @param locationCode
     *        The code for the location.
     */

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * <p>
     * The code for the location.
     * </p>
     * 
     * @return The code for the location.
     */

    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * <p>
     * The code for the location.
     * </p>
     * 
     * @param locationCode
     *        The code for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLocationCode(String locationCode) {
        setLocationCode(locationCode);
        return this;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * </p>
     * 
     * @param locationName
     *        The name of the location. This includes the name of the colocation partner and the physical site of the
     *        building.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * </p>
     * 
     * @return The name of the location. This includes the name of the colocation partner and the physical site of the
     *         building.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * </p>
     * 
     * @param locationName
     *        The name of the location. This includes the name of the colocation partner and the physical site of the
     *        building.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     * 
     * @param region
     *        The AWS Region for the location.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     * 
     * @return The AWS Region for the location.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     * 
     * @param region
     *        The AWS Region for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * 
     * @return The available port speeds for the location.
     */

    public java.util.List<String> getAvailablePortSpeeds() {
        if (availablePortSpeeds == null) {
            availablePortSpeeds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availablePortSpeeds;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * 
     * @param availablePortSpeeds
     *        The available port speeds for the location.
     */

    public void setAvailablePortSpeeds(java.util.Collection<String> availablePortSpeeds) {
        if (availablePortSpeeds == null) {
            this.availablePortSpeeds = null;
            return;
        }

        this.availablePortSpeeds = new com.amazonaws.internal.SdkInternalList<String>(availablePortSpeeds);
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailablePortSpeeds(java.util.Collection)} or {@link #withAvailablePortSpeeds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availablePortSpeeds
     *        The available port speeds for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailablePortSpeeds(String... availablePortSpeeds) {
        if (this.availablePortSpeeds == null) {
            setAvailablePortSpeeds(new com.amazonaws.internal.SdkInternalList<String>(availablePortSpeeds.length));
        }
        for (String ele : availablePortSpeeds) {
            this.availablePortSpeeds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * 
     * @param availablePortSpeeds
     *        The available port speeds for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailablePortSpeeds(java.util.Collection<String> availablePortSpeeds) {
        setAvailablePortSpeeds(availablePortSpeeds);
        return this;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * 
     * @return The name of the service provider for the location.
     */

    public java.util.List<String> getAvailableProviders() {
        if (availableProviders == null) {
            availableProviders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availableProviders;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * 
     * @param availableProviders
     *        The name of the service provider for the location.
     */

    public void setAvailableProviders(java.util.Collection<String> availableProviders) {
        if (availableProviders == null) {
            this.availableProviders = null;
            return;
        }

        this.availableProviders = new com.amazonaws.internal.SdkInternalList<String>(availableProviders);
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableProviders(java.util.Collection)} or {@link #withAvailableProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availableProviders
     *        The name of the service provider for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailableProviders(String... availableProviders) {
        if (this.availableProviders == null) {
            setAvailableProviders(new com.amazonaws.internal.SdkInternalList<String>(availableProviders.length));
        }
        for (String ele : availableProviders) {
            this.availableProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * 
     * @param availableProviders
     *        The name of the service provider for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailableProviders(java.util.Collection<String> availableProviders) {
        setAvailableProviders(availableProviders);
        return this;
    }

    /**
     * <p>
     * The available MAC Security (MACsec) port speeds for the location.
     * </p>
     * 
     * @return The available MAC Security (MACsec) port speeds for the location.
     */

    public java.util.List<String> getAvailableMacSecPortSpeeds() {
        if (availableMacSecPortSpeeds == null) {
            availableMacSecPortSpeeds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availableMacSecPortSpeeds;
    }

    /**
     * <p>
     * The available MAC Security (MACsec) port speeds for the location.
     * </p>
     * 
     * @param availableMacSecPortSpeeds
     *        The available MAC Security (MACsec) port speeds for the location.
     */

    public void setAvailableMacSecPortSpeeds(java.util.Collection<String> availableMacSecPortSpeeds) {
        if (availableMacSecPortSpeeds == null) {
            this.availableMacSecPortSpeeds = null;
            return;
        }

        this.availableMacSecPortSpeeds = new com.amazonaws.internal.SdkInternalList<String>(availableMacSecPortSpeeds);
    }

    /**
     * <p>
     * The available MAC Security (MACsec) port speeds for the location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableMacSecPortSpeeds(java.util.Collection)} or
     * {@link #withAvailableMacSecPortSpeeds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availableMacSecPortSpeeds
     *        The available MAC Security (MACsec) port speeds for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailableMacSecPortSpeeds(String... availableMacSecPortSpeeds) {
        if (this.availableMacSecPortSpeeds == null) {
            setAvailableMacSecPortSpeeds(new com.amazonaws.internal.SdkInternalList<String>(availableMacSecPortSpeeds.length));
        }
        for (String ele : availableMacSecPortSpeeds) {
            this.availableMacSecPortSpeeds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available MAC Security (MACsec) port speeds for the location.
     * </p>
     * 
     * @param availableMacSecPortSpeeds
     *        The available MAC Security (MACsec) port speeds for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withAvailableMacSecPortSpeeds(java.util.Collection<String> availableMacSecPortSpeeds) {
        setAvailableMacSecPortSpeeds(availableMacSecPortSpeeds);
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
        if (getLocationCode() != null)
            sb.append("LocationCode: ").append(getLocationCode()).append(",");
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAvailablePortSpeeds() != null)
            sb.append("AvailablePortSpeeds: ").append(getAvailablePortSpeeds()).append(",");
        if (getAvailableProviders() != null)
            sb.append("AvailableProviders: ").append(getAvailableProviders()).append(",");
        if (getAvailableMacSecPortSpeeds() != null)
            sb.append("AvailableMacSecPortSpeeds: ").append(getAvailableMacSecPortSpeeds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
        if (other.getLocationCode() == null ^ this.getLocationCode() == null)
            return false;
        if (other.getLocationCode() != null && other.getLocationCode().equals(this.getLocationCode()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailablePortSpeeds() == null ^ this.getAvailablePortSpeeds() == null)
            return false;
        if (other.getAvailablePortSpeeds() != null && other.getAvailablePortSpeeds().equals(this.getAvailablePortSpeeds()) == false)
            return false;
        if (other.getAvailableProviders() == null ^ this.getAvailableProviders() == null)
            return false;
        if (other.getAvailableProviders() != null && other.getAvailableProviders().equals(this.getAvailableProviders()) == false)
            return false;
        if (other.getAvailableMacSecPortSpeeds() == null ^ this.getAvailableMacSecPortSpeeds() == null)
            return false;
        if (other.getAvailableMacSecPortSpeeds() != null && other.getAvailableMacSecPortSpeeds().equals(this.getAvailableMacSecPortSpeeds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationCode() == null) ? 0 : getLocationCode().hashCode());
        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailablePortSpeeds() == null) ? 0 : getAvailablePortSpeeds().hashCode());
        hashCode = prime * hashCode + ((getAvailableProviders() == null) ? 0 : getAvailableProviders().hashCode());
        hashCode = prime * hashCode + ((getAvailableMacSecPortSpeeds() == null) ? 0 : getAvailableMacSecPortSpeeds().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
