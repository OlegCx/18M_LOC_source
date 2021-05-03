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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A series of reports. Each report contains information about the results from running a series of test cases. You
 * specify the test cases for a report group in the buildspec for a build project using one or more paths to the test
 * case files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ReportGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the <code>ReportGroup</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the <code>ReportGroup</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the <code>ReportGroup</code>. This can be one of the following values:
     * </p>
     * <dl>
     * <dt>CODE_COVERAGE</dt>
     * <dd>
     * <p>
     * The report group contains code coverage reports.
     * </p>
     * </dd>
     * <dt>TEST</dt>
     * <dd>
     * <p>
     * The report group contains test reports.
     * </p>
     * </dd>
     * </dl>
     */
    private String type;
    /**
     * <p>
     * Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     * </p>
     */
    private ReportExportConfig exportConfig;
    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The status of the report group. This property is read-only.
     * </p>
     * <p>
     * This can be one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The report group is active.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The report group is in the process of being deleted.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;

    /**
     * <p>
     * The ARN of the <code>ReportGroup</code>.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>ReportGroup</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the <code>ReportGroup</code>.
     * </p>
     * 
     * @return The ARN of the <code>ReportGroup</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the <code>ReportGroup</code>.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>ReportGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>ReportGroup</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>ReportGroup</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>ReportGroup</code>.
     * </p>
     * 
     * @return The name of the <code>ReportGroup</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>ReportGroup</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>ReportGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. This can be one of the following values:
     * </p>
     * <dl>
     * <dt>CODE_COVERAGE</dt>
     * <dd>
     * <p>
     * The report group contains code coverage reports.
     * </p>
     * </dd>
     * <dt>TEST</dt>
     * <dd>
     * <p>
     * The report group contains test reports.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        The type of the <code>ReportGroup</code>. This can be one of the following values:</p>
     *        <dl>
     *        <dt>CODE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        The report group contains code coverage reports.
     *        </p>
     *        </dd>
     *        <dt>TEST</dt>
     *        <dd>
     *        <p>
     *        The report group contains test reports.
     *        </p>
     *        </dd>
     * @see ReportType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. This can be one of the following values:
     * </p>
     * <dl>
     * <dt>CODE_COVERAGE</dt>
     * <dd>
     * <p>
     * The report group contains code coverage reports.
     * </p>
     * </dd>
     * <dt>TEST</dt>
     * <dd>
     * <p>
     * The report group contains test reports.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The type of the <code>ReportGroup</code>. This can be one of the following values:</p>
     *         <dl>
     *         <dt>CODE_COVERAGE</dt>
     *         <dd>
     *         <p>
     *         The report group contains code coverage reports.
     *         </p>
     *         </dd>
     *         <dt>TEST</dt>
     *         <dd>
     *         <p>
     *         The report group contains test reports.
     *         </p>
     *         </dd>
     * @see ReportType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. This can be one of the following values:
     * </p>
     * <dl>
     * <dt>CODE_COVERAGE</dt>
     * <dd>
     * <p>
     * The report group contains code coverage reports.
     * </p>
     * </dd>
     * <dt>TEST</dt>
     * <dd>
     * <p>
     * The report group contains test reports.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        The type of the <code>ReportGroup</code>. This can be one of the following values:</p>
     *        <dl>
     *        <dt>CODE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        The report group contains code coverage reports.
     *        </p>
     *        </dd>
     *        <dt>TEST</dt>
     *        <dd>
     *        <p>
     *        The report group contains test reports.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ReportGroup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. This can be one of the following values:
     * </p>
     * <dl>
     * <dt>CODE_COVERAGE</dt>
     * <dd>
     * <p>
     * The report group contains code coverage reports.
     * </p>
     * </dd>
     * <dt>TEST</dt>
     * <dd>
     * <p>
     * The report group contains test reports.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        The type of the <code>ReportGroup</code>. This can be one of the following values:</p>
     *        <dl>
     *        <dt>CODE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        The report group contains code coverage reports.
     *        </p>
     *        </dd>
     *        <dt>TEST</dt>
     *        <dd>
     *        <p>
     *        The report group contains test reports.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ReportGroup withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     * </p>
     * 
     * @param exportConfig
     *        Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     */

    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     * </p>
     * 
     * @return Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     */

    public ReportExportConfig getExportConfig() {
        return this.exportConfig;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     * </p>
     * 
     * @param exportConfig
     *        Information about the destination where the raw data of this <code>ReportGroup</code> is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withExportConfig(ReportExportConfig exportConfig) {
        setExportConfig(exportConfig);
        return this;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     * 
     * @param created
     *        The date and time this <code>ReportGroup</code> was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     * 
     * @return The date and time this <code>ReportGroup</code> was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     * 
     * @param created
     *        The date and time this <code>ReportGroup</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time this <code>ReportGroup</code> was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     * 
     * @return The date and time this <code>ReportGroup</code> was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time this <code>ReportGroup</code> was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * </p>
     * 
     * @return A list of tag key and value pairs associated with this report group. </p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild report group tags.
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
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withTags(Tag... tags) {
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
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The status of the report group. This property is read-only.
     * </p>
     * <p>
     * This can be one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The report group is active.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The report group is in the process of being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the report group. This property is read-only.</p>
     *        <p>
     *        This can be one of the following values:
     *        </p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The report group is active.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The report group is in the process of being deleted.
     *        </p>
     *        </dd>
     * @see ReportGroupStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the report group. This property is read-only.
     * </p>
     * <p>
     * This can be one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The report group is active.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The report group is in the process of being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the report group. This property is read-only.</p>
     *         <p>
     *         This can be one of the following values:
     *         </p>
     *         <dl>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The report group is active.
     *         </p>
     *         </dd>
     *         <dt>DELETING</dt>
     *         <dd>
     *         <p>
     *         The report group is in the process of being deleted.
     *         </p>
     *         </dd>
     * @see ReportGroupStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the report group. This property is read-only.
     * </p>
     * <p>
     * This can be one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The report group is active.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The report group is in the process of being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the report group. This property is read-only.</p>
     *        <p>
     *        This can be one of the following values:
     *        </p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The report group is active.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The report group is in the process of being deleted.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupStatusType
     */

    public ReportGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the report group. This property is read-only.
     * </p>
     * <p>
     * This can be one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The report group is active.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The report group is in the process of being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the report group. This property is read-only.</p>
     *        <p>
     *        This can be one of the following values:
     *        </p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The report group is active.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The report group is in the process of being deleted.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupStatusType
     */

    public ReportGroup withStatus(ReportGroupStatusType status) {
        this.status = status.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getExportConfig() != null)
            sb.append("ExportConfig: ").append(getExportConfig()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportGroup == false)
            return false;
        ReportGroup other = (ReportGroup) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReportGroup clone() {
        try {
            return (ReportGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ReportGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
