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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Lists the device's response, as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminListDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     */
    private java.util.List<DeviceType> devices;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * 
     * @return The devices in the list of devices response.
     */

    public java.util.List<DeviceType> getDevices() {
        return devices;
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * 
     * @param devices
     *        The devices in the list of devices response.
     */

    public void setDevices(java.util.Collection<DeviceType> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceType>(devices);
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        The devices in the list of devices response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesResult withDevices(DeviceType... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<DeviceType>(devices.length));
        }
        for (DeviceType ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * 
     * @param devices
     *        The devices in the list of devices response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesResult withDevices(java.util.Collection<DeviceType> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param paginationToken
     *        The pagination token.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param paginationToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminListDevicesResult == false)
            return false;
        AdminListDevicesResult other = (AdminListDevicesResult) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public AdminListDevicesResult clone() {
        try {
            return (AdminListDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
