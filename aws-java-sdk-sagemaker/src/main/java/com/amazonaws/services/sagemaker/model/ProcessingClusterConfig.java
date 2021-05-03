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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for the cluster used to run a processing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingClusterConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingClusterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value
     * greater than 1. The default value is 1.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage
     * for your scenario.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the processing job.
     * </p>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value
     * greater than 1. The default value is 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use in the processing job. For distributed processing jobs, specify
     *        a value greater than 1. The default value is 1.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value
     * greater than 1. The default value is 1.
     * </p>
     * 
     * @return The number of ML compute instances to use in the processing job. For distributed processing jobs, specify
     *         a value greater than 1. The default value is 1.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value
     * greater than 1. The default value is 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use in the processing job. For distributed processing jobs, specify
     *        a value greater than 1. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingClusterConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the processing job.
     * @see ProcessingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * 
     * @return The ML compute instance type for the processing job.
     * @see ProcessingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingInstanceType
     */

    public ProcessingClusterConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingInstanceType
     */

    public ProcessingClusterConfig withInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage
     * for your scenario.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML
     *        storage for your scenario.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage
     * for your scenario.
     * </p>
     * 
     * @return The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML
     *         storage for your scenario.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage
     * for your scenario.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML
     *        storage for your scenario.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingClusterConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the processing job.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the processing job.
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the processing job.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *         volume attached to the ML compute instance(s) that run the processing job.
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the processing job.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingClusterConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingClusterConfig == false)
            return false;
        ProcessingClusterConfig other = (ProcessingClusterConfig) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingClusterConfig clone() {
        try {
            return (ProcessingClusterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingClusterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
