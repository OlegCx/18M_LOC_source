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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyPendingMaintenanceActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     */
    private String applyAction;
    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request
     * of type <code>immediate</code>.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     */
    private String optInType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyPendingMaintenanceActionRequest withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * 
     * @param applyAction
     *        The pending maintenance action to apply to this resource.
     */

    public void setApplyAction(String applyAction) {
        this.applyAction = applyAction;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * 
     * @return The pending maintenance action to apply to this resource.
     */

    public String getApplyAction() {
        return this.applyAction;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * 
     * @param applyAction
     *        The pending maintenance action to apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyPendingMaintenanceActionRequest withApplyAction(String applyAction) {
        setApplyAction(applyAction);
        return this;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request
     * of type <code>immediate</code>.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     * 
     * @param optInType
     *        A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in
     *        request of type <code>immediate</code>.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>immediate</code> - Apply the maintenance action immediately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the
     *        resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     *        </p>
     *        </li>
     */

    public void setOptInType(String optInType) {
        this.optInType = optInType;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request
     * of type <code>immediate</code>.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in
     *         request of type <code>immediate</code>.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>immediate</code> - Apply the maintenance action immediately.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     *         </p>
     *         </li>
     */

    public String getOptInType() {
        return this.optInType;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request
     * of type <code>immediate</code>.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     * 
     * @param optInType
     *        A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in
     *        request of type <code>immediate</code>.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>immediate</code> - Apply the maintenance action immediately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>next-maintenance</code> - Apply the maintenance action during the next maintenance window for the
     *        resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>undo-opt-in</code> - Cancel any existing <code>next-maintenance</code> opt-in requests.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyPendingMaintenanceActionRequest withOptInType(String optInType) {
        setOptInType(optInType);
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getApplyAction() != null)
            sb.append("ApplyAction: ").append(getApplyAction()).append(",");
        if (getOptInType() != null)
            sb.append("OptInType: ").append(getOptInType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyPendingMaintenanceActionRequest == false)
            return false;
        ApplyPendingMaintenanceActionRequest other = (ApplyPendingMaintenanceActionRequest) obj;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getApplyAction() == null ^ this.getApplyAction() == null)
            return false;
        if (other.getApplyAction() != null && other.getApplyAction().equals(this.getApplyAction()) == false)
            return false;
        if (other.getOptInType() == null ^ this.getOptInType() == null)
            return false;
        if (other.getOptInType() != null && other.getOptInType().equals(this.getOptInType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getApplyAction() == null) ? 0 : getApplyAction().hashCode());
        hashCode = prime * hashCode + ((getOptInType() == null) ? 0 : getOptInType().hashCode());
        return hashCode;
    }

    @Override
    public ApplyPendingMaintenanceActionRequest clone() {
        return (ApplyPendingMaintenanceActionRequest) super.clone();
    }

}
