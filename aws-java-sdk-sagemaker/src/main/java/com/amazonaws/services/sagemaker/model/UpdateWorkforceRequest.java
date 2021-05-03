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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkforceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the private workforce that you want to update. You can find your workforce name by using the
     * operation.
     * </p>
     */
    private String workforceName;
    /**
     * <p>
     * A list of one to ten worker IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to access
     * tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Ten CIDR values
     * </p>
     */
    private SourceIpConfig sourceIpConfig;
    /**
     * <p>
     * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own
     * IdP.
     * </p>
     */
    private OidcConfig oidcConfig;

    /**
     * <p>
     * The name of the private workforce that you want to update. You can find your workforce name by using the
     * operation.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce that you want to update. You can find your workforce name by using the
     *        operation.
     */

    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the private workforce that you want to update. You can find your workforce name by using the
     * operation.
     * </p>
     * 
     * @return The name of the private workforce that you want to update. You can find your workforce name by using the
     *         operation.
     */

    public String getWorkforceName() {
        return this.workforceName;
    }

    /**
     * <p>
     * The name of the private workforce that you want to update. You can find your workforce name by using the
     * operation.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce that you want to update. You can find your workforce name by using the
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkforceRequest withWorkforceName(String workforceName) {
        setWorkforceName(workforceName);
        return this;
    }

    /**
     * <p>
     * A list of one to ten worker IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to access
     * tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Ten CIDR values
     * </p>
     * 
     * @param sourceIpConfig
     *        A list of one to ten worker IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to
     *        access tasks assigned to this workforce.</p>
     *        <p>
     *        Maximum: Ten CIDR values
     */

    public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to ten worker IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to access
     * tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Ten CIDR values
     * </p>
     * 
     * @return A list of one to ten worker IP address ranges (<a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to
     *         access tasks assigned to this workforce.</p>
     *         <p>
     *         Maximum: Ten CIDR values
     */

    public SourceIpConfig getSourceIpConfig() {
        return this.sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to ten worker IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to access
     * tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Ten CIDR values
     * </p>
     * 
     * @param sourceIpConfig
     *        A list of one to ten worker IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) that can be used to
     *        access tasks assigned to this workforce.</p>
     *        <p>
     *        Maximum: Ten CIDR values
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkforceRequest withSourceIpConfig(SourceIpConfig sourceIpConfig) {
        setSourceIpConfig(sourceIpConfig);
        return this;
    }

    /**
     * <p>
     * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own
     * IdP.
     * </p>
     * 
     * @param oidcConfig
     *        Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using
     *        your own IdP.
     */

    public void setOidcConfig(OidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    /**
     * <p>
     * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own
     * IdP.
     * </p>
     * 
     * @return Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using
     *         your own IdP.
     */

    public OidcConfig getOidcConfig() {
        return this.oidcConfig;
    }

    /**
     * <p>
     * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own
     * IdP.
     * </p>
     * 
     * @param oidcConfig
     *        Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using
     *        your own IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkforceRequest withOidcConfig(OidcConfig oidcConfig) {
        setOidcConfig(oidcConfig);
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
        if (getWorkforceName() != null)
            sb.append("WorkforceName: ").append(getWorkforceName()).append(",");
        if (getSourceIpConfig() != null)
            sb.append("SourceIpConfig: ").append(getSourceIpConfig()).append(",");
        if (getOidcConfig() != null)
            sb.append("OidcConfig: ").append(getOidcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkforceRequest == false)
            return false;
        UpdateWorkforceRequest other = (UpdateWorkforceRequest) obj;
        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        if (other.getOidcConfig() == null ^ this.getOidcConfig() == null)
            return false;
        if (other.getOidcConfig() != null && other.getOidcConfig().equals(this.getOidcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        hashCode = prime * hashCode + ((getSourceIpConfig() == null) ? 0 : getSourceIpConfig().hashCode());
        hashCode = prime * hashCode + ((getOidcConfig() == null) ? 0 : getOidcConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkforceRequest clone() {
        return (UpdateWorkforceRequest) super.clone();
    }

}
