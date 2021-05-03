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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a WorkSpace bundle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceBundle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The name of the bundle.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The description of the bundle.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the image that was used to create the bundle.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The size of the root volume.
     * </p>
     */
    private RootStorage rootStorage;
    /**
     * <p>
     * The size of the user volume.
     * </p>
     */
    private UserStorage userStorage;
    /**
     * <p>
     * The compute type of the bundle. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     */
    private ComputeType computeType;
    /**
     * <p>
     * The last time that the bundle was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The time when the bundle was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @return The identifier of the bundle.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param name
     *        The name of the bundle.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @return The name of the bundle.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param name
     *        The name of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @param owner
     *        The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle
     *        is provided by AWS.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @return The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the
     *         bundle is provided by AWS.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @param owner
     *        The owner of the bundle. This is the account identifier of the owner, or <code>AMAZON</code> if the bundle
     *        is provided by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @param description
     *        The description of the bundle.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @return The description of the bundle.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @param description
     *        The description of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the image that was used to create the bundle.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image that was used to create the bundle.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image that was used to create the bundle.
     * </p>
     * 
     * @return The identifier of the image that was used to create the bundle.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image that was used to create the bundle.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image that was used to create the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @param rootStorage
     *        The size of the root volume.
     */

    public void setRootStorage(RootStorage rootStorage) {
        this.rootStorage = rootStorage;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @return The size of the root volume.
     */

    public RootStorage getRootStorage() {
        return this.rootStorage;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @param rootStorage
     *        The size of the root volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withRootStorage(RootStorage rootStorage) {
        setRootStorage(rootStorage);
        return this;
    }

    /**
     * <p>
     * The size of the user volume.
     * </p>
     * 
     * @param userStorage
     *        The size of the user volume.
     */

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    /**
     * <p>
     * The size of the user volume.
     * </p>
     * 
     * @return The size of the user volume.
     */

    public UserStorage getUserStorage() {
        return this.userStorage;
    }

    /**
     * <p>
     * The size of the user volume.
     * </p>
     * 
     * @param userStorage
     *        The size of the user volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withUserStorage(UserStorage userStorage) {
        setUserStorage(userStorage);
        return this;
    }

    /**
     * <p>
     * The compute type of the bundle. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeType
     *        The compute type of the bundle. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     */

    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * The compute type of the bundle. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @return The compute type of the bundle. For more information, see <a
     *         href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     */

    public ComputeType getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * The compute type of the bundle. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeType
     *        The compute type of the bundle. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withComputeType(ComputeType computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * The last time that the bundle was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that the bundle was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that the bundle was updated.
     * </p>
     * 
     * @return The last time that the bundle was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that the bundle was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that the bundle was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The time when the bundle was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the bundle was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the bundle was created.
     * </p>
     * 
     * @return The time when the bundle was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the bundle was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the bundle was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getRootStorage() != null)
            sb.append("RootStorage: ").append(getRootStorage()).append(",");
        if (getUserStorage() != null)
            sb.append("UserStorage: ").append(getUserStorage()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceBundle == false)
            return false;
        WorkspaceBundle other = (WorkspaceBundle) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getRootStorage() == null ^ this.getRootStorage() == null)
            return false;
        if (other.getRootStorage() != null && other.getRootStorage().equals(this.getRootStorage()) == false)
            return false;
        if (other.getUserStorage() == null ^ this.getUserStorage() == null)
            return false;
        if (other.getUserStorage() != null && other.getUserStorage().equals(this.getUserStorage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getRootStorage() == null) ? 0 : getRootStorage().hashCode());
        hashCode = prime * hashCode + ((getUserStorage() == null) ? 0 : getUserStorage().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceBundle clone() {
        try {
            return (WorkspaceBundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceBundleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
