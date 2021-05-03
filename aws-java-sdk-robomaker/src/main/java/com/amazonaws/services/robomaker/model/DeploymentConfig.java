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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeploymentConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     */
    private Integer concurrentDeploymentPercentage;
    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     */
    private Integer failureThresholdPercentage;
    /**
     * <p>
     * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1
     * minute and 7 days. The default is 5 hours.
     * </p>
     */
    private Long robotDeploymentTimeoutInSeconds;
    /**
     * <p>
     * The download condition file.
     * </p>
     */
    private S3Object downloadConditionFile;

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @param concurrentDeploymentPercentage
     *        The percentage of robots receiving the deployment at the same time.
     */

    public void setConcurrentDeploymentPercentage(Integer concurrentDeploymentPercentage) {
        this.concurrentDeploymentPercentage = concurrentDeploymentPercentage;
    }

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @return The percentage of robots receiving the deployment at the same time.
     */

    public Integer getConcurrentDeploymentPercentage() {
        return this.concurrentDeploymentPercentage;
    }

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @param concurrentDeploymentPercentage
     *        The percentage of robots receiving the deployment at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withConcurrentDeploymentPercentage(Integer concurrentDeploymentPercentage) {
        setConcurrentDeploymentPercentage(concurrentDeploymentPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @param failureThresholdPercentage
     *        The percentage of deployments that need to fail before stopping deployment.
     */

    public void setFailureThresholdPercentage(Integer failureThresholdPercentage) {
        this.failureThresholdPercentage = failureThresholdPercentage;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @return The percentage of deployments that need to fail before stopping deployment.
     */

    public Integer getFailureThresholdPercentage() {
        return this.failureThresholdPercentage;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @param failureThresholdPercentage
     *        The percentage of deployments that need to fail before stopping deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withFailureThresholdPercentage(Integer failureThresholdPercentage) {
        setFailureThresholdPercentage(failureThresholdPercentage);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1
     * minute and 7 days. The default is 5 hours.
     * </p>
     * 
     * @param robotDeploymentTimeoutInSeconds
     *        The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time
     *        between 1 minute and 7 days. The default is 5 hours.
     */

    public void setRobotDeploymentTimeoutInSeconds(Long robotDeploymentTimeoutInSeconds) {
        this.robotDeploymentTimeoutInSeconds = robotDeploymentTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1
     * minute and 7 days. The default is 5 hours.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time
     *         between 1 minute and 7 days. The default is 5 hours.
     */

    public Long getRobotDeploymentTimeoutInSeconds() {
        return this.robotDeploymentTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1
     * minute and 7 days. The default is 5 hours.
     * </p>
     * 
     * @param robotDeploymentTimeoutInSeconds
     *        The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time
     *        between 1 minute and 7 days. The default is 5 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withRobotDeploymentTimeoutInSeconds(Long robotDeploymentTimeoutInSeconds) {
        setRobotDeploymentTimeoutInSeconds(robotDeploymentTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The download condition file.
     * </p>
     * 
     * @param downloadConditionFile
     *        The download condition file.
     */

    public void setDownloadConditionFile(S3Object downloadConditionFile) {
        this.downloadConditionFile = downloadConditionFile;
    }

    /**
     * <p>
     * The download condition file.
     * </p>
     * 
     * @return The download condition file.
     */

    public S3Object getDownloadConditionFile() {
        return this.downloadConditionFile;
    }

    /**
     * <p>
     * The download condition file.
     * </p>
     * 
     * @param downloadConditionFile
     *        The download condition file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withDownloadConditionFile(S3Object downloadConditionFile) {
        setDownloadConditionFile(downloadConditionFile);
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
        if (getConcurrentDeploymentPercentage() != null)
            sb.append("ConcurrentDeploymentPercentage: ").append(getConcurrentDeploymentPercentage()).append(",");
        if (getFailureThresholdPercentage() != null)
            sb.append("FailureThresholdPercentage: ").append(getFailureThresholdPercentage()).append(",");
        if (getRobotDeploymentTimeoutInSeconds() != null)
            sb.append("RobotDeploymentTimeoutInSeconds: ").append(getRobotDeploymentTimeoutInSeconds()).append(",");
        if (getDownloadConditionFile() != null)
            sb.append("DownloadConditionFile: ").append(getDownloadConditionFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfig == false)
            return false;
        DeploymentConfig other = (DeploymentConfig) obj;
        if (other.getConcurrentDeploymentPercentage() == null ^ this.getConcurrentDeploymentPercentage() == null)
            return false;
        if (other.getConcurrentDeploymentPercentage() != null
                && other.getConcurrentDeploymentPercentage().equals(this.getConcurrentDeploymentPercentage()) == false)
            return false;
        if (other.getFailureThresholdPercentage() == null ^ this.getFailureThresholdPercentage() == null)
            return false;
        if (other.getFailureThresholdPercentage() != null && other.getFailureThresholdPercentage().equals(this.getFailureThresholdPercentage()) == false)
            return false;
        if (other.getRobotDeploymentTimeoutInSeconds() == null ^ this.getRobotDeploymentTimeoutInSeconds() == null)
            return false;
        if (other.getRobotDeploymentTimeoutInSeconds() != null
                && other.getRobotDeploymentTimeoutInSeconds().equals(this.getRobotDeploymentTimeoutInSeconds()) == false)
            return false;
        if (other.getDownloadConditionFile() == null ^ this.getDownloadConditionFile() == null)
            return false;
        if (other.getDownloadConditionFile() != null && other.getDownloadConditionFile().equals(this.getDownloadConditionFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcurrentDeploymentPercentage() == null) ? 0 : getConcurrentDeploymentPercentage().hashCode());
        hashCode = prime * hashCode + ((getFailureThresholdPercentage() == null) ? 0 : getFailureThresholdPercentage().hashCode());
        hashCode = prime * hashCode + ((getRobotDeploymentTimeoutInSeconds() == null) ? 0 : getRobotDeploymentTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDownloadConditionFile() == null) ? 0 : getDownloadConditionFile().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfig clone() {
        try {
            return (DeploymentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.DeploymentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
