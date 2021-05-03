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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the launch template.
     * </p>
     */
    private LaunchTemplate launchTemplate;
    /**
     * <p>
     * If the launch template contains parameters or parameter combinations that are not valid, an error code and an
     * error message are returned for each issue that's found.
     * </p>
     */
    private ValidationWarning warning;

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @param launchTemplate
     *        Information about the launch template.
     */

    public void setLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @return Information about the launch template.
     */

    public LaunchTemplate getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @param launchTemplate
     *        Information about the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateResult withLaunchTemplate(LaunchTemplate launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * If the launch template contains parameters or parameter combinations that are not valid, an error code and an
     * error message are returned for each issue that's found.
     * </p>
     * 
     * @param warning
     *        If the launch template contains parameters or parameter combinations that are not valid, an error code and
     *        an error message are returned for each issue that's found.
     */

    public void setWarning(ValidationWarning warning) {
        this.warning = warning;
    }

    /**
     * <p>
     * If the launch template contains parameters or parameter combinations that are not valid, an error code and an
     * error message are returned for each issue that's found.
     * </p>
     * 
     * @return If the launch template contains parameters or parameter combinations that are not valid, an error code
     *         and an error message are returned for each issue that's found.
     */

    public ValidationWarning getWarning() {
        return this.warning;
    }

    /**
     * <p>
     * If the launch template contains parameters or parameter combinations that are not valid, an error code and an
     * error message are returned for each issue that's found.
     * </p>
     * 
     * @param warning
     *        If the launch template contains parameters or parameter combinations that are not valid, an error code and
     *        an error message are returned for each issue that's found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateResult withWarning(ValidationWarning warning) {
        setWarning(warning);
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
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchTemplateResult == false)
            return false;
        CreateLaunchTemplateResult other = (CreateLaunchTemplateResult) obj;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchTemplateResult clone() {
        try {
            return (CreateLaunchTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
