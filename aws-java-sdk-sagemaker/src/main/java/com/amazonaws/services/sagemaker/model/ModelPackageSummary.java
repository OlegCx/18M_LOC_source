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
 * Provides summary information about a model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelPackageSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model package.
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * If the model package is a versioned model, the model group that the versioned model belongs to.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * If the model package is a versioned model, the version of the model.
     * </p>
     */
    private Integer modelPackageVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     */
    private String modelPackageArn;
    /**
     * <p>
     * A brief description of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The overall status of the model package.
     * </p>
     */
    private String modelPackageStatus;
    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     */
    private String modelApprovalStatus;

    /**
     * <p>
     * The name of the model package.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package.
     * </p>
     * 
     * @return The name of the model package.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * If the model package is a versioned model, the model group that the versioned model belongs to.
     * </p>
     * 
     * @param modelPackageGroupName
     *        If the model package is a versioned model, the model group that the versioned model belongs to.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * If the model package is a versioned model, the model group that the versioned model belongs to.
     * </p>
     * 
     * @return If the model package is a versioned model, the model group that the versioned model belongs to.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * If the model package is a versioned model, the model group that the versioned model belongs to.
     * </p>
     * 
     * @param modelPackageGroupName
     *        If the model package is a versioned model, the model group that the versioned model belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * If the model package is a versioned model, the version of the model.
     * </p>
     * 
     * @param modelPackageVersion
     *        If the model package is a versioned model, the version of the model.
     */

    public void setModelPackageVersion(Integer modelPackageVersion) {
        this.modelPackageVersion = modelPackageVersion;
    }

    /**
     * <p>
     * If the model package is a versioned model, the version of the model.
     * </p>
     * 
     * @return If the model package is a versioned model, the version of the model.
     */

    public Integer getModelPackageVersion() {
        return this.modelPackageVersion;
    }

    /**
     * <p>
     * If the model package is a versioned model, the version of the model.
     * </p>
     * 
     * @param modelPackageVersion
     *        If the model package is a versioned model, the version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withModelPackageVersion(Integer modelPackageVersion) {
        setModelPackageVersion(modelPackageVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     */

    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model package.
     */

    public String getModelPackageArn() {
        return this.modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withModelPackageArn(String modelPackageArn) {
        setModelPackageArn(modelPackageArn);
        return this;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A brief description of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * 
     * @return A brief description of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A brief description of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the model package was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     * 
     * @return A timestamp that shows when the model package was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the model package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The overall status of the model package.
     * @see ModelPackageStatus
     */

    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * 
     * @return The overall status of the model package.
     * @see ModelPackageStatus
     */

    public String getModelPackageStatus() {
        return this.modelPackageStatus;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The overall status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public ModelPackageSummary withModelPackageStatus(String modelPackageStatus) {
        setModelPackageStatus(modelPackageStatus);
        return this;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The overall status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public ModelPackageSummary withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The approval status of the model. This can be one of the following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APPROVED</code> - The model is approved
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REJECTED</code> - The model is rejected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *         </p>
     *         </li>
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ModelPackageSummary withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ModelPackageSummary withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: ").append(getModelPackageName()).append(",");
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageVersion() != null)
            sb.append("ModelPackageVersion: ").append(getModelPackageVersion()).append(",");
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: ").append(getModelPackageArn()).append(",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModelPackageStatus() != null)
            sb.append("ModelPackageStatus: ").append(getModelPackageStatus()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageSummary == false)
            return false;
        ModelPackageSummary other = (ModelPackageSummary) obj;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageVersion() == null ^ this.getModelPackageVersion() == null)
            return false;
        if (other.getModelPackageVersion() != null && other.getModelPackageVersion().equals(this.getModelPackageVersion()) == false)
            return false;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelPackageStatus() == null ^ this.getModelPackageStatus() == null)
            return false;
        if (other.getModelPackageStatus() != null && other.getModelPackageStatus().equals(this.getModelPackageStatus()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageVersion() == null) ? 0 : getModelPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModelPackageStatus() == null) ? 0 : getModelPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackageSummary clone() {
        try {
            return (ModelPackageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelPackageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
