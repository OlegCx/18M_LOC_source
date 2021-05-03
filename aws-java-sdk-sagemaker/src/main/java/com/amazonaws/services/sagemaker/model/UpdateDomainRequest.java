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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings defaultUserSettings;

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @return The ID of the domain to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        A collection of settings.
     */

    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @return A collection of settings.
     */

    public UserSettings getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        A collection of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        setDefaultUserSettings(defaultUserSettings);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: ").append(getDefaultUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainRequest == false)
            return false;
        UpdateDomainRequest other = (UpdateDomainRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainRequest clone() {
        return (UpdateDomainRequest) super.clone();
    }

}
