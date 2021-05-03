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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/SkipWaitTimeForInstanceTermination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkipWaitTimeForInstanceTerminationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     * </p>
     * 
     * @return The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a blue/green deployment for which you want to skip the instance termination wait time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkipWaitTimeForInstanceTerminationRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkipWaitTimeForInstanceTerminationRequest == false)
            return false;
        SkipWaitTimeForInstanceTerminationRequest other = (SkipWaitTimeForInstanceTerminationRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public SkipWaitTimeForInstanceTerminationRequest clone() {
        return (SkipWaitTimeForInstanceTerminationRequest) super.clone();
    }

}
