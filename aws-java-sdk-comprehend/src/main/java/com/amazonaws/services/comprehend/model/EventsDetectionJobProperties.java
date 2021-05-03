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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an events detection job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EventsDetectionJobProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventsDetectionJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier assigned to the events detection job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name you assigned the events detection job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The current status of the events detection job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * A description of the status of the events detection job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the events detection job was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that the events detection job completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The input data configuration that you supplied when you created the events detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The output data configuration that you supplied when you created the events detection job.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The language code of the input documents.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The types of events that are detected by the job.
     * </p>
     */
    private java.util.List<String> targetEventTypes;

    /**
     * <p>
     * The identifier assigned to the events detection job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the events detection job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the events detection job.
     * </p>
     * 
     * @return The identifier assigned to the events detection job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier assigned to the events detection job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name you assigned the events detection job.
     * </p>
     * 
     * @param jobName
     *        The name you assigned the events detection job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name you assigned the events detection job.
     * </p>
     * 
     * @return The name you assigned the events detection job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name you assigned the events detection job.
     * </p>
     * 
     * @param jobName
     *        The name you assigned the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The current status of the events detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the events detection job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the events detection job.
     * </p>
     * 
     * @return The current status of the events detection job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the events detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public EventsDetectionJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the events detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public EventsDetectionJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the events detection job.
     * </p>
     * 
     * @param message
     *        A description of the status of the events detection job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the events detection job.
     * </p>
     * 
     * @return A description of the status of the events detection job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the events detection job.
     * </p>
     * 
     * @param message
     *        A description of the status of the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time that the events detection job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the events detection job was submitted for processing.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the events detection job was submitted for processing.
     * </p>
     * 
     * @return The time that the events detection job was submitted for processing.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the events detection job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the events detection job was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that the events detection job completed.
     * </p>
     * 
     * @param endTime
     *        The time that the events detection job completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the events detection job completed.
     * </p>
     * 
     * @return The time that the events detection job completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the events detection job completed.
     * </p>
     * 
     * @param endTime
     *        The time that the events detection job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the events detection job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @return The input data configuration that you supplied when you created the events detection job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that you supplied when you created the events detection job.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @return The output data configuration that you supplied when you created the events detection job.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the events detection job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that you supplied when you created the events detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language code of the input documents.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * 
     * @return The language code of the input documents.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language code of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public EventsDetectionJobProperties withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language code of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public EventsDetectionJobProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identify and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The types of events that are detected by the job.
     * </p>
     * 
     * @return The types of events that are detected by the job.
     */

    public java.util.List<String> getTargetEventTypes() {
        return targetEventTypes;
    }

    /**
     * <p>
     * The types of events that are detected by the job.
     * </p>
     * 
     * @param targetEventTypes
     *        The types of events that are detected by the job.
     */

    public void setTargetEventTypes(java.util.Collection<String> targetEventTypes) {
        if (targetEventTypes == null) {
            this.targetEventTypes = null;
            return;
        }

        this.targetEventTypes = new java.util.ArrayList<String>(targetEventTypes);
    }

    /**
     * <p>
     * The types of events that are detected by the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetEventTypes(java.util.Collection)} or {@link #withTargetEventTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetEventTypes
     *        The types of events that are detected by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withTargetEventTypes(String... targetEventTypes) {
        if (this.targetEventTypes == null) {
            setTargetEventTypes(new java.util.ArrayList<String>(targetEventTypes.length));
        }
        for (String ele : targetEventTypes) {
            this.targetEventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of events that are detected by the job.
     * </p>
     * 
     * @param targetEventTypes
     *        The types of events that are detected by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsDetectionJobProperties withTargetEventTypes(java.util.Collection<String> targetEventTypes) {
        setTargetEventTypes(targetEventTypes);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getTargetEventTypes() != null)
            sb.append("TargetEventTypes: ").append(getTargetEventTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventsDetectionJobProperties == false)
            return false;
        EventsDetectionJobProperties other = (EventsDetectionJobProperties) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTargetEventTypes() == null ^ this.getTargetEventTypes() == null)
            return false;
        if (other.getTargetEventTypes() != null && other.getTargetEventTypes().equals(this.getTargetEventTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTargetEventTypes() == null) ? 0 : getTargetEventTypes().hashCode());
        return hashCode;
    }

    @Override
    public EventsDetectionJobProperties clone() {
        try {
            return (EventsDetectionJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EventsDetectionJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
