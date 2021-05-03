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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provided if <code>CallerType</code> is <code>domain</code>. It provides information about the DNS domain that issued
 * the API call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiCallActionDomainDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiCallActionDomainDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DNS domain that issued the API call.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The name of the DNS domain that issued the API call.
     * </p>
     * 
     * @param domain
     *        The name of the DNS domain that issued the API call.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the DNS domain that issued the API call.
     * </p>
     * 
     * @return The name of the DNS domain that issued the API call.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the DNS domain that issued the API call.
     * </p>
     * 
     * @param domain
     *        The name of the DNS domain that issued the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallActionDomainDetails withDomain(String domain) {
        setDomain(domain);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiCallActionDomainDetails == false)
            return false;
        AwsApiCallActionDomainDetails other = (AwsApiCallActionDomainDetails) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiCallActionDomainDetails clone() {
        try {
            return (AwsApiCallActionDomainDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiCallActionDomainDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
