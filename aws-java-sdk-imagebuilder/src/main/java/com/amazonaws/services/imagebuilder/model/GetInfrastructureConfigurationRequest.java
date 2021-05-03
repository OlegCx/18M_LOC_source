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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * GetInfrastructureConfiguration request object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInfrastructureConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     * </p>
     */
    private String infrastructureConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     */

    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     */

    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInfrastructureConfigurationRequest withInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        setInfrastructureConfigurationArn(infrastructureConfigurationArn);
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
        if (getInfrastructureConfigurationArn() != null)
            sb.append("InfrastructureConfigurationArn: ").append(getInfrastructureConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInfrastructureConfigurationRequest == false)
            return false;
        GetInfrastructureConfigurationRequest other = (GetInfrastructureConfigurationRequest) obj;
        if (other.getInfrastructureConfigurationArn() == null ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(this.getInfrastructureConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInfrastructureConfigurationArn() == null) ? 0 : getInfrastructureConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public GetInfrastructureConfigurationRequest clone() {
        return (GetInfrastructureConfigurationRequest) super.clone();
    }

}
