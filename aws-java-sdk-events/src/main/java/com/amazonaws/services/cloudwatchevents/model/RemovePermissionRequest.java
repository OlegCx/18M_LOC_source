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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemovePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * Specifies whether to remove all permissions.
     * </p>
     */
    private Boolean removeAllPermissions;
    /**
     * <p>
     * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     * </p>
     */
    private String eventBusName;

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @param statementId
     *        The statement ID corresponding to the account that is no longer allowed to put events to the default event
     *        bus.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @return The statement ID corresponding to the account that is no longer allowed to put events to the default
     *         event bus.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @param statementId
     *        The statement ID corresponding to the account that is no longer allowed to put events to the default event
     *        bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to remove all permissions.
     * </p>
     * 
     * @param removeAllPermissions
     *        Specifies whether to remove all permissions.
     */

    public void setRemoveAllPermissions(Boolean removeAllPermissions) {
        this.removeAllPermissions = removeAllPermissions;
    }

    /**
     * <p>
     * Specifies whether to remove all permissions.
     * </p>
     * 
     * @return Specifies whether to remove all permissions.
     */

    public Boolean getRemoveAllPermissions() {
        return this.removeAllPermissions;
    }

    /**
     * <p>
     * Specifies whether to remove all permissions.
     * </p>
     * 
     * @param removeAllPermissions
     *        Specifies whether to remove all permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withRemoveAllPermissions(Boolean removeAllPermissions) {
        setRemoveAllPermissions(removeAllPermissions);
        return this;
    }

    /**
     * <p>
     * Specifies whether to remove all permissions.
     * </p>
     * 
     * @return Specifies whether to remove all permissions.
     */

    public Boolean isRemoveAllPermissions() {
        return this.removeAllPermissions;
    }

    /**
     * <p>
     * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     */

    public void setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
    }

    /**
     * <p>
     * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     * </p>
     * 
     * @return The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     */

    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * <p>
     * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withEventBusName(String eventBusName) {
        setEventBusName(eventBusName);
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
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getRemoveAllPermissions() != null)
            sb.append("RemoveAllPermissions: ").append(getRemoveAllPermissions()).append(",");
        if (getEventBusName() != null)
            sb.append("EventBusName: ").append(getEventBusName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemovePermissionRequest == false)
            return false;
        RemovePermissionRequest other = (RemovePermissionRequest) obj;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getRemoveAllPermissions() == null ^ this.getRemoveAllPermissions() == null)
            return false;
        if (other.getRemoveAllPermissions() != null && other.getRemoveAllPermissions().equals(this.getRemoveAllPermissions()) == false)
            return false;
        if (other.getEventBusName() == null ^ this.getEventBusName() == null)
            return false;
        if (other.getEventBusName() != null && other.getEventBusName().equals(this.getEventBusName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getRemoveAllPermissions() == null) ? 0 : getRemoveAllPermissions().hashCode());
        hashCode = prime * hashCode + ((getEventBusName() == null) ? 0 : getEventBusName().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }

}
