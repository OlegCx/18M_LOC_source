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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the theme.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the theme.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the new version of the theme.
     * </p>
     */
    private String versionArn;
    /**
     * <p>
     * The creation status of the theme.
     * </p>
     */
    private String creationStatus;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @return The ID for the theme.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeResult withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the theme.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the theme.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the theme.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the theme.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the theme.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the new version of the theme.
     * </p>
     * 
     * @param versionArn
     *        The Amazon Resource Name (ARN) for the new version of the theme.
     */

    public void setVersionArn(String versionArn) {
        this.versionArn = versionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the new version of the theme.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the new version of the theme.
     */

    public String getVersionArn() {
        return this.versionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the new version of the theme.
     * </p>
     * 
     * @param versionArn
     *        The Amazon Resource Name (ARN) for the new version of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeResult withVersionArn(String versionArn) {
        setVersionArn(versionArn);
        return this;
    }

    /**
     * <p>
     * The creation status of the theme.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of the theme.
     * @see ResourceStatus
     */

    public void setCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
    }

    /**
     * <p>
     * The creation status of the theme.
     * </p>
     * 
     * @return The creation status of the theme.
     * @see ResourceStatus
     */

    public String getCreationStatus() {
        return this.creationStatus;
    }

    /**
     * <p>
     * The creation status of the theme.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public UpdateThemeResult withCreationStatus(String creationStatus) {
        setCreationStatus(creationStatus);
        return this;
    }

    /**
     * <p>
     * The creation status of the theme.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public UpdateThemeResult withCreationStatus(ResourceStatus creationStatus) {
        this.creationStatus = creationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
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
     */

    public UpdateThemeResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getThemeId() != null)
            sb.append("ThemeId: ").append(getThemeId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersionArn() != null)
            sb.append("VersionArn: ").append(getVersionArn()).append(",");
        if (getCreationStatus() != null)
            sb.append("CreationStatus: ").append(getCreationStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThemeResult == false)
            return false;
        UpdateThemeResult other = (UpdateThemeResult) obj;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersionArn() == null ^ this.getVersionArn() == null)
            return false;
        if (other.getVersionArn() != null && other.getVersionArn().equals(this.getVersionArn()) == false)
            return false;
        if (other.getCreationStatus() == null ^ this.getCreationStatus() == null)
            return false;
        if (other.getCreationStatus() != null && other.getCreationStatus().equals(this.getCreationStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersionArn() == null) ? 0 : getVersionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationStatus() == null) ? 0 : getCreationStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThemeResult clone() {
        try {
            return (UpdateThemeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
