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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     */
    private String dashboardArn;
    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * Information about the permissions on the dashboard.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @param dashboardArn
     *        The Amazon Resource Name (ARN) of the dashboard.
     */

    public void setDashboardArn(String dashboardArn) {
        this.dashboardArn = dashboardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dashboard.
     */

    public String getDashboardArn() {
        return this.dashboardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @param dashboardArn
     *        The Amazon Resource Name (ARN) of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withDashboardArn(String dashboardArn) {
        setDashboardArn(dashboardArn);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @return The ID for the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * Information about the permissions on the dashboard.
     * </p>
     * 
     * @return Information about the permissions on the dashboard.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Information about the permissions on the dashboard.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the dashboard.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * Information about the permissions on the dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the permissions on the dashboard.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsResult withStatus(Integer status) {
        setStatus(status);
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
        if (getDashboardArn() != null)
            sb.append("DashboardArn: ").append(getDashboardArn()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardPermissionsResult == false)
            return false;
        UpdateDashboardPermissionsResult other = (UpdateDashboardPermissionsResult) obj;
        if (other.getDashboardArn() == null ^ this.getDashboardArn() == null)
            return false;
        if (other.getDashboardArn() != null && other.getDashboardArn().equals(this.getDashboardArn()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardArn() == null) ? 0 : getDashboardArn().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardPermissionsResult clone() {
        try {
            return (UpdateDashboardPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
