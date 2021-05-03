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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutExternalModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The model endpoints name.
     * </p>
     */
    private String modelEndpoint;
    /**
     * <p>
     * The source of the model.
     * </p>
     */
    private String modelSource;
    /**
     * <p>
     * The IAM role used to invoke the model endpoint.
     * </p>
     */
    private String invokeModelEndpointRoleArn;
    /**
     * <p>
     * The model endpoint input configuration.
     * </p>
     */
    private ModelInputConfiguration inputConfiguration;
    /**
     * <p>
     * The model endpoint output configuration.
     * </p>
     */
    private ModelOutputConfiguration outputConfiguration;
    /**
     * <p>
     * The model endpoint’s status in Amazon Fraud Detector.
     * </p>
     */
    private String modelEndpointStatus;
    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The model endpoints name.
     * </p>
     * 
     * @param modelEndpoint
     *        The model endpoints name.
     */

    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The model endpoints name.
     * </p>
     * 
     * @return The model endpoints name.
     */

    public String getModelEndpoint() {
        return this.modelEndpoint;
    }

    /**
     * <p>
     * The model endpoints name.
     * </p>
     * 
     * @param modelEndpoint
     *        The model endpoints name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withModelEndpoint(String modelEndpoint) {
        setModelEndpoint(modelEndpoint);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @see ModelSource
     */

    public void setModelSource(String modelSource) {
        this.modelSource = modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @return The source of the model.
     * @see ModelSource
     */

    public String getModelSource() {
        return this.modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public PutExternalModelRequest withModelSource(String modelSource) {
        setModelSource(modelSource);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public PutExternalModelRequest withModelSource(ModelSource modelSource) {
        this.modelSource = modelSource.toString();
        return this;
    }

    /**
     * <p>
     * The IAM role used to invoke the model endpoint.
     * </p>
     * 
     * @param invokeModelEndpointRoleArn
     *        The IAM role used to invoke the model endpoint.
     */

    public void setInvokeModelEndpointRoleArn(String invokeModelEndpointRoleArn) {
        this.invokeModelEndpointRoleArn = invokeModelEndpointRoleArn;
    }

    /**
     * <p>
     * The IAM role used to invoke the model endpoint.
     * </p>
     * 
     * @return The IAM role used to invoke the model endpoint.
     */

    public String getInvokeModelEndpointRoleArn() {
        return this.invokeModelEndpointRoleArn;
    }

    /**
     * <p>
     * The IAM role used to invoke the model endpoint.
     * </p>
     * 
     * @param invokeModelEndpointRoleArn
     *        The IAM role used to invoke the model endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withInvokeModelEndpointRoleArn(String invokeModelEndpointRoleArn) {
        setInvokeModelEndpointRoleArn(invokeModelEndpointRoleArn);
        return this;
    }

    /**
     * <p>
     * The model endpoint input configuration.
     * </p>
     * 
     * @param inputConfiguration
     *        The model endpoint input configuration.
     */

    public void setInputConfiguration(ModelInputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
    }

    /**
     * <p>
     * The model endpoint input configuration.
     * </p>
     * 
     * @return The model endpoint input configuration.
     */

    public ModelInputConfiguration getInputConfiguration() {
        return this.inputConfiguration;
    }

    /**
     * <p>
     * The model endpoint input configuration.
     * </p>
     * 
     * @param inputConfiguration
     *        The model endpoint input configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withInputConfiguration(ModelInputConfiguration inputConfiguration) {
        setInputConfiguration(inputConfiguration);
        return this;
    }

    /**
     * <p>
     * The model endpoint output configuration.
     * </p>
     * 
     * @param outputConfiguration
     *        The model endpoint output configuration.
     */

    public void setOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        this.outputConfiguration = outputConfiguration;
    }

    /**
     * <p>
     * The model endpoint output configuration.
     * </p>
     * 
     * @return The model endpoint output configuration.
     */

    public ModelOutputConfiguration getOutputConfiguration() {
        return this.outputConfiguration;
    }

    /**
     * <p>
     * The model endpoint output configuration.
     * </p>
     * 
     * @param outputConfiguration
     *        The model endpoint output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        setOutputConfiguration(outputConfiguration);
        return this;
    }

    /**
     * <p>
     * The model endpoint’s status in Amazon Fraud Detector.
     * </p>
     * 
     * @param modelEndpointStatus
     *        The model endpoint’s status in Amazon Fraud Detector.
     * @see ModelEndpointStatus
     */

    public void setModelEndpointStatus(String modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus;
    }

    /**
     * <p>
     * The model endpoint’s status in Amazon Fraud Detector.
     * </p>
     * 
     * @return The model endpoint’s status in Amazon Fraud Detector.
     * @see ModelEndpointStatus
     */

    public String getModelEndpointStatus() {
        return this.modelEndpointStatus;
    }

    /**
     * <p>
     * The model endpoint’s status in Amazon Fraud Detector.
     * </p>
     * 
     * @param modelEndpointStatus
     *        The model endpoint’s status in Amazon Fraud Detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelEndpointStatus
     */

    public PutExternalModelRequest withModelEndpointStatus(String modelEndpointStatus) {
        setModelEndpointStatus(modelEndpointStatus);
        return this;
    }

    /**
     * <p>
     * The model endpoint’s status in Amazon Fraud Detector.
     * </p>
     * 
     * @param modelEndpointStatus
     *        The model endpoint’s status in Amazon Fraud Detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelEndpointStatus
     */

    public PutExternalModelRequest withModelEndpointStatus(ModelEndpointStatus modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getModelEndpoint() != null)
            sb.append("ModelEndpoint: ").append(getModelEndpoint()).append(",");
        if (getModelSource() != null)
            sb.append("ModelSource: ").append(getModelSource()).append(",");
        if (getInvokeModelEndpointRoleArn() != null)
            sb.append("InvokeModelEndpointRoleArn: ").append(getInvokeModelEndpointRoleArn()).append(",");
        if (getInputConfiguration() != null)
            sb.append("InputConfiguration: ").append(getInputConfiguration()).append(",");
        if (getOutputConfiguration() != null)
            sb.append("OutputConfiguration: ").append(getOutputConfiguration()).append(",");
        if (getModelEndpointStatus() != null)
            sb.append("ModelEndpointStatus: ").append(getModelEndpointStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutExternalModelRequest == false)
            return false;
        PutExternalModelRequest other = (PutExternalModelRequest) obj;
        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
            return false;
        if (other.getModelSource() == null ^ this.getModelSource() == null)
            return false;
        if (other.getModelSource() != null && other.getModelSource().equals(this.getModelSource()) == false)
            return false;
        if (other.getInvokeModelEndpointRoleArn() == null ^ this.getInvokeModelEndpointRoleArn() == null)
            return false;
        if (other.getInvokeModelEndpointRoleArn() != null && other.getInvokeModelEndpointRoleArn().equals(this.getInvokeModelEndpointRoleArn()) == false)
            return false;
        if (other.getInputConfiguration() == null ^ this.getInputConfiguration() == null)
            return false;
        if (other.getInputConfiguration() != null && other.getInputConfiguration().equals(this.getInputConfiguration()) == false)
            return false;
        if (other.getOutputConfiguration() == null ^ this.getOutputConfiguration() == null)
            return false;
        if (other.getOutputConfiguration() != null && other.getOutputConfiguration().equals(this.getOutputConfiguration()) == false)
            return false;
        if (other.getModelEndpointStatus() == null ^ this.getModelEndpointStatus() == null)
            return false;
        if (other.getModelEndpointStatus() != null && other.getModelEndpointStatus().equals(this.getModelEndpointStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
        hashCode = prime * hashCode + ((getModelSource() == null) ? 0 : getModelSource().hashCode());
        hashCode = prime * hashCode + ((getInvokeModelEndpointRoleArn() == null) ? 0 : getInvokeModelEndpointRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfiguration() == null) ? 0 : getInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputConfiguration() == null) ? 0 : getOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelEndpointStatus() == null) ? 0 : getModelEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutExternalModelRequest clone() {
        return (PutExternalModelRequest) super.clone();
    }

}
