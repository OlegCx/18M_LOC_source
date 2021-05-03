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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you specify
     * the type of object you're using as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     * <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or <code>SourceAnalysis</code>
     * to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     */
    private TemplateSourceEntity sourceEntity;
    /**
     * <p>
     * A description of the current template version that is being updated. Every time you call
     * <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template maintains a
     * description of the version in the <code>VersionDescription</code> field.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * The name for the template.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're updating.
     * </p>
     * 
     * @return The ID of the AWS account that contains the template that you're updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @param templateId
     *        The ID for the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @return The ID for the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @param templateId
     *        The ID for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you specify
     * the type of object you're using as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     * <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or <code>SourceAnalysis</code>
     * to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     * 
     * @param sourceEntity
     *        The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you
     *        specify the type of object you're using as source: <code>SourceTemplate</code> for a template or
     *        <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     *        <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>,
     *        specify the ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account
     *        and any QuickSight-supported AWS Region. </p>
     *        <p>
     *        Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or
     *        <code>SourceAnalysis</code> to list the replacement datasets for the placeholders listed in the original.
     *        The schema in each dataset must match its placeholder.
     */

    public void setSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you specify
     * the type of object you're using as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     * <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or <code>SourceAnalysis</code>
     * to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     * 
     * @return The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you
     *         specify the type of object you're using as source: <code>SourceTemplate</code> for a template or
     *         <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     *         <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>,
     *         specify the ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account
     *         and any QuickSight-supported AWS Region. </p>
     *         <p>
     *         Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or
     *         <code>SourceAnalysis</code> to list the replacement datasets for the placeholders listed in the original.
     *         The schema in each dataset must match its placeholder.
     */

    public TemplateSourceEntity getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you specify
     * the type of object you're using as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     * <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or <code>SourceAnalysis</code>
     * to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     * 
     * @param sourceEntity
     *        The entity that you are using as a source when you update the template. In <code>SourceEntity</code>, you
     *        specify the type of object you're using as source: <code>SourceTemplate</code> for a template or
     *        <code>SourceAnalysis</code> for an analysis. Both of these require an Amazon Resource Name (ARN). For
     *        <code>SourceTemplate</code>, specify the ARN of the source template. For <code>SourceAnalysis</code>,
     *        specify the ARN of the source analysis. The <code>SourceTemplate</code> ARN can contain any AWS Account
     *        and any QuickSight-supported AWS Region. </p>
     *        <p>
     *        Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> or
     *        <code>SourceAnalysis</code> to list the replacement datasets for the placeholders listed in the original.
     *        The schema in each dataset must match its placeholder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withSourceEntity(TemplateSourceEntity sourceEntity) {
        setSourceEntity(sourceEntity);
        return this;
    }

    /**
     * <p>
     * A description of the current template version that is being updated. Every time you call
     * <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template maintains a
     * description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the current template version that is being updated. Every time you call
     *        <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template
     *        maintains a description of the version in the <code>VersionDescription</code> field.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the current template version that is being updated. Every time you call
     * <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template maintains a
     * description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @return A description of the current template version that is being updated. Every time you call
     *         <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template
     *         maintains a description of the version in the <code>VersionDescription</code> field.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description of the current template version that is being updated. Every time you call
     * <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template maintains a
     * description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the current template version that is being updated. Every time you call
     *        <code>UpdateTemplate</code>, you create a new version of the template. Each version of the template
     *        maintains a description of the version in the <code>VersionDescription</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * 
     * @param name
     *        The name for the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * 
     * @return The name for the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * 
     * @param name
     *        The name for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withName(String name) {
        setName(name);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: ").append(getSourceEntity()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateRequest == false)
            return false;
        UpdateTemplateRequest other = (UpdateTemplateRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTemplateRequest clone() {
        return (UpdateTemplateRequest) super.clone();
    }

}
