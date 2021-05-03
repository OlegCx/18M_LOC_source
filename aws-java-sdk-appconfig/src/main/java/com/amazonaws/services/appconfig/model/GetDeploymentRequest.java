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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     */
    private Integer deploymentNumber;

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that includes the deployment you want to get.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * 
     * @return The ID of the application that includes the deployment you want to get.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that includes the deployment you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment that includes the deployment you want to get.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * 
     * @return The ID of the environment that includes the deployment you want to get.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment that includes the deployment you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     */

    public void setDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @return The sequence number of the deployment.
     */

    public Integer getDeploymentNumber() {
        return this.deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withDeploymentNumber(Integer deploymentNumber) {
        setDeploymentNumber(deploymentNumber);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: ").append(getDeploymentNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentRequest clone() {
        return (GetDeploymentRequest) super.clone();
    }

}
