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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateInstanceExportTaskRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceExportTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateInstanceExportTaskRequest> {

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The format and location for an export instance task.
     * </p>
     */
    private ExportToS3TaskSpecification exportToS3Task;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The target virtualization environment.
     * </p>
     */
    private String targetEnvironment;
    /**
     * <p>
     * The tags to apply to the export instance task during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
     * </p>
     * 
     * @param description
     *        A description for the conversion task or the resource being exported. The maximum length is 255
     *        characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
     * </p>
     * 
     * @return A description for the conversion task or the resource being exported. The maximum length is 255
     *         characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
     * </p>
     * 
     * @param description
     *        A description for the conversion task or the resource being exported. The maximum length is 255
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The format and location for an export instance task.
     * </p>
     * 
     * @param exportToS3Task
     *        The format and location for an export instance task.
     */

    public void setExportToS3Task(ExportToS3TaskSpecification exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }

    /**
     * <p>
     * The format and location for an export instance task.
     * </p>
     * 
     * @return The format and location for an export instance task.
     */

    public ExportToS3TaskSpecification getExportToS3Task() {
        return this.exportToS3Task;
    }

    /**
     * <p>
     * The format and location for an export instance task.
     * </p>
     * 
     * @param exportToS3Task
     *        The format and location for an export instance task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskRequest withExportToS3Task(ExportToS3TaskSpecification exportToS3Task) {
        setExportToS3Task(exportToS3Task);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @see ExportEnvironment
     */

    public void setTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @return The target virtualization environment.
     * @see ExportEnvironment
     */

    public String getTargetEnvironment() {
        return this.targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportEnvironment
     */

    public CreateInstanceExportTaskRequest withTargetEnvironment(String targetEnvironment) {
        setTargetEnvironment(targetEnvironment);
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @see ExportEnvironment
     */

    public void setTargetEnvironment(ExportEnvironment targetEnvironment) {
        withTargetEnvironment(targetEnvironment);
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportEnvironment
     */

    public CreateInstanceExportTaskRequest withTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the export instance task during creation.
     * </p>
     * 
     * @return The tags to apply to the export instance task during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the export instance task during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the export instance task during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the export instance task during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the export instance task during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the export instance task during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the export instance task during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateInstanceExportTaskRequest> getDryRunRequest() {
        Request<CreateInstanceExportTaskRequest> request = new CreateInstanceExportTaskRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExportToS3Task() != null)
            sb.append("ExportToS3Task: ").append(getExportToS3Task()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTargetEnvironment() != null)
            sb.append("TargetEnvironment: ").append(getTargetEnvironment()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceExportTaskRequest == false)
            return false;
        CreateInstanceExportTaskRequest other = (CreateInstanceExportTaskRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null)
            return false;
        if (other.getExportToS3Task() != null && other.getExportToS3Task().equals(this.getExportToS3Task()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTargetEnvironment() == null ^ this.getTargetEnvironment() == null)
            return false;
        if (other.getTargetEnvironment() != null && other.getTargetEnvironment().equals(this.getTargetEnvironment()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTargetEnvironment() == null) ? 0 : getTargetEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceExportTaskRequest clone() {
        return (CreateInstanceExportTaskRequest) super.clone();
    }
}
