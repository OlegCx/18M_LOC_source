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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A version of a template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Errors associated with this template version.
     * </p>
     */
    private java.util.List<TemplateError> errors;
    /**
     * <p>
     * The version number of the template version.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to
     * new datasets matching the same schema described through this API operation.
     * </p>
     */
    private java.util.List<DataSetConfiguration> dataSetConfigurations;
    /**
     * <p>
     * The description of the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     * </p>
     */
    private String sourceEntityArn;
    /**
     * <p>
     * The ARN of the theme associated with this version of the template.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     */
    private java.util.List<Sheet> sheets;

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this template version was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @return The time that this template version was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this template version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Errors associated with this template version.
     * </p>
     * 
     * @return Errors associated with this template version.
     */

    public java.util.List<TemplateError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with this template version.
     * </p>
     * 
     * @param errors
     *        Errors associated with this template version.
     */

    public void setErrors(java.util.Collection<TemplateError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<TemplateError>(errors);
    }

    /**
     * <p>
     * Errors associated with this template version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with this template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withErrors(TemplateError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<TemplateError>(errors.length));
        }
        for (TemplateError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with this template version.
     * </p>
     * 
     * @param errors
     *        Errors associated with this template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withErrors(java.util.Collection<TemplateError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the template version.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @return The version number of the template version.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TemplateVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TemplateVersion withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to
     * new datasets matching the same schema described through this API operation.
     * </p>
     * 
     * @return Schema of the dataset identified by the placeholder. Any dashboard created from this template should be
     *         bound to new datasets matching the same schema described through this API operation.
     */

    public java.util.List<DataSetConfiguration> getDataSetConfigurations() {
        return dataSetConfigurations;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to
     * new datasets matching the same schema described through this API operation.
     * </p>
     * 
     * @param dataSetConfigurations
     *        Schema of the dataset identified by the placeholder. Any dashboard created from this template should be
     *        bound to new datasets matching the same schema described through this API operation.
     */

    public void setDataSetConfigurations(java.util.Collection<DataSetConfiguration> dataSetConfigurations) {
        if (dataSetConfigurations == null) {
            this.dataSetConfigurations = null;
            return;
        }

        this.dataSetConfigurations = new java.util.ArrayList<DataSetConfiguration>(dataSetConfigurations);
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to
     * new datasets matching the same schema described through this API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetConfigurations(java.util.Collection)} or
     * {@link #withDataSetConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataSetConfigurations
     *        Schema of the dataset identified by the placeholder. Any dashboard created from this template should be
     *        bound to new datasets matching the same schema described through this API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withDataSetConfigurations(DataSetConfiguration... dataSetConfigurations) {
        if (this.dataSetConfigurations == null) {
            setDataSetConfigurations(new java.util.ArrayList<DataSetConfiguration>(dataSetConfigurations.length));
        }
        for (DataSetConfiguration ele : dataSetConfigurations) {
            this.dataSetConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to
     * new datasets matching the same schema described through this API operation.
     * </p>
     * 
     * @param dataSetConfigurations
     *        Schema of the dataset identified by the placeholder. Any dashboard created from this template should be
     *        bound to new datasets matching the same schema described through this API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withDataSetConfigurations(java.util.Collection<DataSetConfiguration> dataSetConfigurations) {
        setDataSetConfigurations(dataSetConfigurations);
        return this;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @param description
     *        The description of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @return The description of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @param description
     *        The description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     * </p>
     * 
     * @param sourceEntityArn
     *        The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     */

    public void setSourceEntityArn(String sourceEntityArn) {
        this.sourceEntityArn = sourceEntityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     */

    public String getSourceEntityArn() {
        return this.sourceEntityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     * </p>
     * 
     * @param sourceEntityArn
     *        The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withSourceEntityArn(String sourceEntityArn) {
        setSourceEntityArn(sourceEntityArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the theme associated with this version of the template.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme associated with this version of the template.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN of the theme associated with this version of the template.
     * </p>
     * 
     * @return The ARN of the theme associated with this version of the template.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN of the theme associated with this version of the template.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme associated with this version of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @return A list of the associated sheets with the unique identifier and name of each sheet.
     */

    public java.util.List<Sheet> getSheets() {
        return sheets;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     */

    public void setSheets(java.util.Collection<Sheet> sheets) {
        if (sheets == null) {
            this.sheets = null;
            return;
        }

        this.sheets = new java.util.ArrayList<Sheet>(sheets);
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheets(java.util.Collection)} or {@link #withSheets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withSheets(Sheet... sheets) {
        if (this.sheets == null) {
            setSheets(new java.util.ArrayList<Sheet>(sheets.length));
        }
        for (Sheet ele : sheets) {
            this.sheets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersion withSheets(java.util.Collection<Sheet> sheets) {
        setSheets(sheets);
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDataSetConfigurations() != null)
            sb.append("DataSetConfigurations: ").append(getDataSetConfigurations()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceEntityArn() != null)
            sb.append("SourceEntityArn: ").append(getSourceEntityArn()).append(",");
        if (getThemeArn() != null)
            sb.append("ThemeArn: ").append(getThemeArn()).append(",");
        if (getSheets() != null)
            sb.append("Sheets: ").append(getSheets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersion == false)
            return false;
        TemplateVersion other = (TemplateVersion) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDataSetConfigurations() == null ^ this.getDataSetConfigurations() == null)
            return false;
        if (other.getDataSetConfigurations() != null && other.getDataSetConfigurations().equals(this.getDataSetConfigurations()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceEntityArn() == null ^ this.getSourceEntityArn() == null)
            return false;
        if (other.getSourceEntityArn() != null && other.getSourceEntityArn().equals(this.getSourceEntityArn()) == false)
            return false;
        if (other.getThemeArn() == null ^ this.getThemeArn() == null)
            return false;
        if (other.getThemeArn() != null && other.getThemeArn().equals(this.getThemeArn()) == false)
            return false;
        if (other.getSheets() == null ^ this.getSheets() == null)
            return false;
        if (other.getSheets() != null && other.getSheets().equals(this.getSheets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDataSetConfigurations() == null) ? 0 : getDataSetConfigurations().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceEntityArn() == null) ? 0 : getSourceEntityArn().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getSheets() == null) ? 0 : getSheets().hashCode());
        return hashCode;
    }

    @Override
    public TemplateVersion clone() {
        try {
            return (TemplateVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
