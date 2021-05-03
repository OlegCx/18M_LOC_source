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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyAquaConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAquaConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated AQUA configuration of the cluster.
     * </p>
     */
    private AquaConfiguration aquaConfiguration;

    /**
     * <p>
     * The updated AQUA configuration of the cluster.
     * </p>
     * 
     * @param aquaConfiguration
     *        The updated AQUA configuration of the cluster.
     */

    public void setAquaConfiguration(AquaConfiguration aquaConfiguration) {
        this.aquaConfiguration = aquaConfiguration;
    }

    /**
     * <p>
     * The updated AQUA configuration of the cluster.
     * </p>
     * 
     * @return The updated AQUA configuration of the cluster.
     */

    public AquaConfiguration getAquaConfiguration() {
        return this.aquaConfiguration;
    }

    /**
     * <p>
     * The updated AQUA configuration of the cluster.
     * </p>
     * 
     * @param aquaConfiguration
     *        The updated AQUA configuration of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAquaConfigurationResult withAquaConfiguration(AquaConfiguration aquaConfiguration) {
        setAquaConfiguration(aquaConfiguration);
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
        if (getAquaConfiguration() != null)
            sb.append("AquaConfiguration: ").append(getAquaConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAquaConfigurationResult == false)
            return false;
        ModifyAquaConfigurationResult other = (ModifyAquaConfigurationResult) obj;
        if (other.getAquaConfiguration() == null ^ this.getAquaConfiguration() == null)
            return false;
        if (other.getAquaConfiguration() != null && other.getAquaConfiguration().equals(this.getAquaConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAquaConfiguration() == null) ? 0 : getAquaConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAquaConfigurationResult clone() {
        try {
            return (ModifyAquaConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
