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

/**
 * <p>
 * The response information for license configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportImageLicenseConfigurationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportImageLicenseConfigurationResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a license configuration.
     * </p>
     */
    private String licenseConfigurationArn;

    /**
     * <p>
     * The ARN of a license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        The ARN of a license configuration.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * The ARN of a license configuration.
     * </p>
     * 
     * @return The ARN of a license configuration.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * The ARN of a license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        The ARN of a license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageLicenseConfigurationResponse withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageLicenseConfigurationResponse == false)
            return false;
        ImportImageLicenseConfigurationResponse other = (ImportImageLicenseConfigurationResponse) obj;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public ImportImageLicenseConfigurationResponse clone() {
        try {
            return (ImportImageLicenseConfigurationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
