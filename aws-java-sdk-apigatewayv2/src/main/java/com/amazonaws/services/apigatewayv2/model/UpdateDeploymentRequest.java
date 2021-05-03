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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a Deployment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The deployment ID.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @return The deployment ID.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @param description
     *        The description for the deployment resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @return The description for the deployment resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @param description
     *        The description for the deployment resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentRequest withDescription(String description) {
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
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

        if (obj instanceof UpdateDeploymentRequest == false)
            return false;
        UpdateDeploymentRequest other = (UpdateDeploymentRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
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

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeploymentRequest clone() {
        return (UpdateDeploymentRequest) super.clone();
    }

}
