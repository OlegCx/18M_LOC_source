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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteConfigurationProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfigurationProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID that includes the configuration profile you want to delete.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the configuration profile you want to delete.
     * </p>
     */
    private String configurationProfileId;

    /**
     * <p>
     * The application ID that includes the configuration profile you want to delete.
     * </p>
     * 
     * @param applicationId
     *        The application ID that includes the configuration profile you want to delete.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID that includes the configuration profile you want to delete.
     * </p>
     * 
     * @return The application ID that includes the configuration profile you want to delete.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID that includes the configuration profile you want to delete.
     * </p>
     * 
     * @param applicationId
     *        The application ID that includes the configuration profile you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationProfileRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the configuration profile you want to delete.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the configuration profile you want to delete.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile you want to delete.
     * </p>
     * 
     * @return The ID of the configuration profile you want to delete.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile you want to delete.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the configuration profile you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationProfileRequest withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: ").append(getConfigurationProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationProfileRequest == false)
            return false;
        DeleteConfigurationProfileRequest other = (DeleteConfigurationProfileRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfigurationProfileRequest clone() {
        return (DeleteConfigurationProfileRequest) super.clone();
    }

}
