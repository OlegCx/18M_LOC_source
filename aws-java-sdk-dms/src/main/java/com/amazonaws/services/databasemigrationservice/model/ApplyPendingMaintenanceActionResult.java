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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyPendingMaintenanceActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The AWS DMS resource that the pending maintenance action will be applied to.
     * </p>
     */
    private ResourcePendingMaintenanceActions resourcePendingMaintenanceActions;

    /**
     * <p>
     * The AWS DMS resource that the pending maintenance action will be applied to.
     * </p>
     * 
     * @param resourcePendingMaintenanceActions
     *        The AWS DMS resource that the pending maintenance action will be applied to.
     */

    public void setResourcePendingMaintenanceActions(ResourcePendingMaintenanceActions resourcePendingMaintenanceActions) {
        this.resourcePendingMaintenanceActions = resourcePendingMaintenanceActions;
    }

    /**
     * <p>
     * The AWS DMS resource that the pending maintenance action will be applied to.
     * </p>
     * 
     * @return The AWS DMS resource that the pending maintenance action will be applied to.
     */

    public ResourcePendingMaintenanceActions getResourcePendingMaintenanceActions() {
        return this.resourcePendingMaintenanceActions;
    }

    /**
     * <p>
     * The AWS DMS resource that the pending maintenance action will be applied to.
     * </p>
     * 
     * @param resourcePendingMaintenanceActions
     *        The AWS DMS resource that the pending maintenance action will be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyPendingMaintenanceActionResult withResourcePendingMaintenanceActions(ResourcePendingMaintenanceActions resourcePendingMaintenanceActions) {
        setResourcePendingMaintenanceActions(resourcePendingMaintenanceActions);
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
        if (getResourcePendingMaintenanceActions() != null)
            sb.append("ResourcePendingMaintenanceActions: ").append(getResourcePendingMaintenanceActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyPendingMaintenanceActionResult == false)
            return false;
        ApplyPendingMaintenanceActionResult other = (ApplyPendingMaintenanceActionResult) obj;
        if (other.getResourcePendingMaintenanceActions() == null ^ this.getResourcePendingMaintenanceActions() == null)
            return false;
        if (other.getResourcePendingMaintenanceActions() != null
                && other.getResourcePendingMaintenanceActions().equals(this.getResourcePendingMaintenanceActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcePendingMaintenanceActions() == null) ? 0 : getResourcePendingMaintenanceActions().hashCode());
        return hashCode;
    }

    @Override
    public ApplyPendingMaintenanceActionResult clone() {
        try {
            return (ApplyPendingMaintenanceActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
