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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the disk (e.g., <code>my-disk</code>).
     * </p>
     */
    private String diskName;

    /**
     * <p>
     * The name of the disk (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The name of the disk (e.g., <code>my-disk</code>).
     */

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The name of the disk (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @return The name of the disk (e.g., <code>my-disk</code>).
     */

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * <p>
     * The name of the disk (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The name of the disk (e.g., <code>my-disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskRequest withDiskName(String diskName) {
        setDiskName(diskName);
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
        if (getDiskName() != null)
            sb.append("DiskName: ").append(getDiskName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskRequest == false)
            return false;
        GetDiskRequest other = (GetDiskRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        return hashCode;
    }

    @Override
    public GetDiskRequest clone() {
        return (GetDiskRequest) super.clone();
    }

}
