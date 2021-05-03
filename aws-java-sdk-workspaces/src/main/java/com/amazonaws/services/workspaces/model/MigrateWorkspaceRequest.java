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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrateWorkspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the WorkSpace to migrate from.
     * </p>
     */
    private String sourceWorkspaceId;
    /**
     * <p>
     * The identifier of the target bundle type to migrate the WorkSpace to.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The identifier of the WorkSpace to migrate from.
     * </p>
     * 
     * @param sourceWorkspaceId
     *        The identifier of the WorkSpace to migrate from.
     */

    public void setSourceWorkspaceId(String sourceWorkspaceId) {
        this.sourceWorkspaceId = sourceWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace to migrate from.
     * </p>
     * 
     * @return The identifier of the WorkSpace to migrate from.
     */

    public String getSourceWorkspaceId() {
        return this.sourceWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace to migrate from.
     * </p>
     * 
     * @param sourceWorkspaceId
     *        The identifier of the WorkSpace to migrate from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrateWorkspaceRequest withSourceWorkspaceId(String sourceWorkspaceId) {
        setSourceWorkspaceId(sourceWorkspaceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the target bundle type to migrate the WorkSpace to.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the target bundle type to migrate the WorkSpace to.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the target bundle type to migrate the WorkSpace to.
     * </p>
     * 
     * @return The identifier of the target bundle type to migrate the WorkSpace to.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the target bundle type to migrate the WorkSpace to.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the target bundle type to migrate the WorkSpace to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrateWorkspaceRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
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
        if (getSourceWorkspaceId() != null)
            sb.append("SourceWorkspaceId: ").append(getSourceWorkspaceId()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrateWorkspaceRequest == false)
            return false;
        MigrateWorkspaceRequest other = (MigrateWorkspaceRequest) obj;
        if (other.getSourceWorkspaceId() == null ^ this.getSourceWorkspaceId() == null)
            return false;
        if (other.getSourceWorkspaceId() != null && other.getSourceWorkspaceId().equals(this.getSourceWorkspaceId()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceWorkspaceId() == null) ? 0 : getSourceWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        return hashCode;
    }

    @Override
    public MigrateWorkspaceRequest clone() {
        return (MigrateWorkspaceRequest) super.clone();
    }

}
