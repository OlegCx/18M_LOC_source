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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an execution step, for an execution job, for an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Step" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the execution step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of the execution step.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     */
    private String logUrl;
    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     */
    private String artifactsUrl;
    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     */
    private String testArtifactsUrl;
    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     */
    private String testConfigUrl;
    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     */
    private java.util.Map<String, String> screenshots;
    /**
     * <p>
     * The reason for the current step status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The context for the current step. Includes a build image if the step is build.
     * </p>
     */
    private String context;

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * 
     * @param stepName
     *        The name of the execution step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * 
     * @return The name of the execution step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * 
     * @param stepName
     *        The name of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     * 
     * @param startTime
     *        The start date and time of the execution step.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     * 
     * @return The start date and time of the execution step.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     * 
     * @param startTime
     *        The start date and time of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * 
     * @param status
     *        The status of the execution step.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * 
     * @return The status of the execution step.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * 
     * @param status
     *        The status of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Step withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * 
     * @param status
     *        The status of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Step withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     * 
     * @param endTime
     *        The end date and time of the execution step.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     * 
     * @return The end date and time of the execution step.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     * 
     * @param endTime
     *        The end date and time of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * 
     * @param logUrl
     *        The URL to the logs for the execution step.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * 
     * @return The URL to the logs for the execution step.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * 
     * @param logUrl
     *        The URL to the logs for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withLogUrl(String logUrl) {
        setLogUrl(logUrl);
        return this;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * 
     * @param artifactsUrl
     *        The URL to the artifact for the execution step.
     */

    public void setArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * 
     * @return The URL to the artifact for the execution step.
     */

    public String getArtifactsUrl() {
        return this.artifactsUrl;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * 
     * @param artifactsUrl
     *        The URL to the artifact for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withArtifactsUrl(String artifactsUrl) {
        setArtifactsUrl(artifactsUrl);
        return this;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * 
     * @param testArtifactsUrl
     *        The URL to the test artifact for the execution step.
     */

    public void setTestArtifactsUrl(String testArtifactsUrl) {
        this.testArtifactsUrl = testArtifactsUrl;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * 
     * @return The URL to the test artifact for the execution step.
     */

    public String getTestArtifactsUrl() {
        return this.testArtifactsUrl;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * 
     * @param testArtifactsUrl
     *        The URL to the test artifact for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withTestArtifactsUrl(String testArtifactsUrl) {
        setTestArtifactsUrl(testArtifactsUrl);
        return this;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * 
     * @param testConfigUrl
     *        The URL to the test configuration for the execution step.
     */

    public void setTestConfigUrl(String testConfigUrl) {
        this.testConfigUrl = testConfigUrl;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * 
     * @return The URL to the test configuration for the execution step.
     */

    public String getTestConfigUrl() {
        return this.testConfigUrl;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * 
     * @param testConfigUrl
     *        The URL to the test configuration for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withTestConfigUrl(String testConfigUrl) {
        setTestConfigUrl(testConfigUrl);
        return this;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     * 
     * @return The list of screenshot URLs for the execution step, if relevant.
     */

    public java.util.Map<String, String> getScreenshots() {
        return screenshots;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     * 
     * @param screenshots
     *        The list of screenshot URLs for the execution step, if relevant.
     */

    public void setScreenshots(java.util.Map<String, String> screenshots) {
        this.screenshots = screenshots;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     * 
     * @param screenshots
     *        The list of screenshot URLs for the execution step, if relevant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withScreenshots(java.util.Map<String, String> screenshots) {
        setScreenshots(screenshots);
        return this;
    }

    /**
     * Add a single Screenshots entry
     *
     * @see Step#withScreenshots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Step addScreenshotsEntry(String key, String value) {
        if (null == this.screenshots) {
            this.screenshots = new java.util.HashMap<String, String>();
        }
        if (this.screenshots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.screenshots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Screenshots.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step clearScreenshotsEntries() {
        this.screenshots = null;
        return this;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current step status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * 
     * @return The reason for the current step status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current step status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is build.
     * </p>
     * 
     * @param context
     *        The context for the current step. Includes a build image if the step is build.
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is build.
     * </p>
     * 
     * @return The context for the current step. Includes a build image if the step is build.
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is build.
     * </p>
     * 
     * @param context
     *        The context for the current step. Includes a build image if the step is build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withContext(String context) {
        setContext(context);
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
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLogUrl() != null)
            sb.append("LogUrl: ").append(getLogUrl()).append(",");
        if (getArtifactsUrl() != null)
            sb.append("ArtifactsUrl: ").append(getArtifactsUrl()).append(",");
        if (getTestArtifactsUrl() != null)
            sb.append("TestArtifactsUrl: ").append(getTestArtifactsUrl()).append(",");
        if (getTestConfigUrl() != null)
            sb.append("TestConfigUrl: ").append(getTestConfigUrl()).append(",");
        if (getScreenshots() != null)
            sb.append("Screenshots: ").append(getScreenshots()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        if (other.getArtifactsUrl() == null ^ this.getArtifactsUrl() == null)
            return false;
        if (other.getArtifactsUrl() != null && other.getArtifactsUrl().equals(this.getArtifactsUrl()) == false)
            return false;
        if (other.getTestArtifactsUrl() == null ^ this.getTestArtifactsUrl() == null)
            return false;
        if (other.getTestArtifactsUrl() != null && other.getTestArtifactsUrl().equals(this.getTestArtifactsUrl()) == false)
            return false;
        if (other.getTestConfigUrl() == null ^ this.getTestConfigUrl() == null)
            return false;
        if (other.getTestConfigUrl() != null && other.getTestConfigUrl().equals(this.getTestConfigUrl()) == false)
            return false;
        if (other.getScreenshots() == null ^ this.getScreenshots() == null)
            return false;
        if (other.getScreenshots() != null && other.getScreenshots().equals(this.getScreenshots()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        hashCode = prime * hashCode + ((getArtifactsUrl() == null) ? 0 : getArtifactsUrl().hashCode());
        hashCode = prime * hashCode + ((getTestArtifactsUrl() == null) ? 0 : getTestArtifactsUrl().hashCode());
        hashCode = prime * hashCode + ((getTestConfigUrl() == null) ? 0 : getTestConfigUrl().hashCode());
        hashCode = prime * hashCode + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
