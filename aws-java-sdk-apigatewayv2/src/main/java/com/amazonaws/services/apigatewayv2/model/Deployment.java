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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An immutable representation of an API that can be called by users. A Deployment must be associated with a Stage for
 * it to be callable over the internet.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     */
    private Boolean autoDeployed;
    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * The description for the deployment.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     * 
     * @param autoDeployed
     *        Specifies whether a deployment was automatically released.
     */

    public void setAutoDeployed(Boolean autoDeployed) {
        this.autoDeployed = autoDeployed;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     * 
     * @return Specifies whether a deployment was automatically released.
     */

    public Boolean getAutoDeployed() {
        return this.autoDeployed;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     * 
     * @param autoDeployed
     *        Specifies whether a deployment was automatically released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withAutoDeployed(Boolean autoDeployed) {
        setAutoDeployed(autoDeployed);
        return this;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     * 
     * @return Specifies whether a deployment was automatically released.
     */

    public Boolean isAutoDeployed() {
        return this.autoDeployed;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the Deployment resource was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     * 
     * @return The date and time when the Deployment resource was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the Deployment resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier for the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     * 
     * @return The identifier for the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier for the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * 
     * @return The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        May contain additional feedback on the status of an API deployment.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     * 
     * @return May contain additional feedback on the status of an API deployment.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        May contain additional feedback on the status of an API deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     * 
     * @param description
     *        The description for the deployment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     * 
     * @return The description for the deployment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     * 
     * @param description
     *        The description for the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDescription(String description) {
        setDescription(description);
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
        if (getAutoDeployed() != null)
            sb.append("AutoDeployed: ").append(getAutoDeployed()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentStatusMessage() != null)
            sb.append("DeploymentStatusMessage: ").append(getDeploymentStatusMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
        if (other.getAutoDeployed() == null ^ this.getAutoDeployed() == null)
            return false;
        if (other.getAutoDeployed() != null && other.getAutoDeployed().equals(this.getAutoDeployed()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentStatusMessage() == null ^ this.getDeploymentStatusMessage() == null)
            return false;
        if (other.getDeploymentStatusMessage() != null && other.getDeploymentStatusMessage().equals(this.getDeploymentStatusMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoDeployed() == null) ? 0 : getAutoDeployed().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatusMessage() == null) ? 0 : getDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
