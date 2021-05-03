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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAutoSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are available for the specified source instance or
     * disk.
     * </p>
     */
    private java.util.List<AutoSnapshotDetails> autoSnapshots;

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * 
     * @param resourceName
     *        The name of the source instance or disk for the automatic snapshots.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * 
     * @return The name of the source instance or disk for the automatic snapshots.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * 
     * @param resourceName
     *        The name of the source instance or disk for the automatic snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoSnapshotsResult withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * 
     * @return The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetAutoSnapshotsResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetAutoSnapshotsResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are available for the specified source instance or
     * disk.
     * </p>
     * 
     * @return An array of objects that describe the automatic snapshots that are available for the specified source
     *         instance or disk.
     */

    public java.util.List<AutoSnapshotDetails> getAutoSnapshots() {
        return autoSnapshots;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are available for the specified source instance or
     * disk.
     * </p>
     * 
     * @param autoSnapshots
     *        An array of objects that describe the automatic snapshots that are available for the specified source
     *        instance or disk.
     */

    public void setAutoSnapshots(java.util.Collection<AutoSnapshotDetails> autoSnapshots) {
        if (autoSnapshots == null) {
            this.autoSnapshots = null;
            return;
        }

        this.autoSnapshots = new java.util.ArrayList<AutoSnapshotDetails>(autoSnapshots);
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are available for the specified source instance or
     * disk.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoSnapshots(java.util.Collection)} or {@link #withAutoSnapshots(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param autoSnapshots
     *        An array of objects that describe the automatic snapshots that are available for the specified source
     *        instance or disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoSnapshotsResult withAutoSnapshots(AutoSnapshotDetails... autoSnapshots) {
        if (this.autoSnapshots == null) {
            setAutoSnapshots(new java.util.ArrayList<AutoSnapshotDetails>(autoSnapshots.length));
        }
        for (AutoSnapshotDetails ele : autoSnapshots) {
            this.autoSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are available for the specified source instance or
     * disk.
     * </p>
     * 
     * @param autoSnapshots
     *        An array of objects that describe the automatic snapshots that are available for the specified source
     *        instance or disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoSnapshotsResult withAutoSnapshots(java.util.Collection<AutoSnapshotDetails> autoSnapshots) {
        setAutoSnapshots(autoSnapshots);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAutoSnapshots() != null)
            sb.append("AutoSnapshots: ").append(getAutoSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoSnapshotsResult == false)
            return false;
        GetAutoSnapshotsResult other = (GetAutoSnapshotsResult) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAutoSnapshots() == null ^ this.getAutoSnapshots() == null)
            return false;
        if (other.getAutoSnapshots() != null && other.getAutoSnapshots().equals(this.getAutoSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAutoSnapshots() == null) ? 0 : getAutoSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoSnapshotsResult clone() {
        try {
            return (GetAutoSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
