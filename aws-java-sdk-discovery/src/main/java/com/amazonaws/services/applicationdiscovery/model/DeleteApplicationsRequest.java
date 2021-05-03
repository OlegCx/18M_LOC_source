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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration ID of an application to be deleted.
     * </p>
     */
    private java.util.List<String> configurationIds;

    /**
     * <p>
     * Configuration ID of an application to be deleted.
     * </p>
     * 
     * @return Configuration ID of an application to be deleted.
     */

    public java.util.List<String> getConfigurationIds() {
        return configurationIds;
    }

    /**
     * <p>
     * Configuration ID of an application to be deleted.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of an application to be deleted.
     */

    public void setConfigurationIds(java.util.Collection<String> configurationIds) {
        if (configurationIds == null) {
            this.configurationIds = null;
            return;
        }

        this.configurationIds = new java.util.ArrayList<String>(configurationIds);
    }

    /**
     * <p>
     * Configuration ID of an application to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationIds(java.util.Collection)} or {@link #withConfigurationIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of an application to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationsRequest withConfigurationIds(String... configurationIds) {
        if (this.configurationIds == null) {
            setConfigurationIds(new java.util.ArrayList<String>(configurationIds.length));
        }
        for (String ele : configurationIds) {
            this.configurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration ID of an application to be deleted.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of an application to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationsRequest withConfigurationIds(java.util.Collection<String> configurationIds) {
        setConfigurationIds(configurationIds);
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
        if (getConfigurationIds() != null)
            sb.append("ConfigurationIds: ").append(getConfigurationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationsRequest == false)
            return false;
        DeleteApplicationsRequest other = (DeleteApplicationsRequest) obj;
        if (other.getConfigurationIds() == null ^ this.getConfigurationIds() == null)
            return false;
        if (other.getConfigurationIds() != null && other.getConfigurationIds().equals(this.getConfigurationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationIds() == null) ? 0 : getConfigurationIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationsRequest clone() {
        return (DeleteApplicationsRequest) super.clone();
    }

}
