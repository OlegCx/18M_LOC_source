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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceQuotaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The service identifier.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quota identifier.
     * </p>
     */
    private String quotaCode;

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @return The service identifier.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @return The quota identifier.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceQuotaRequest == false)
            return false;
        GetServiceQuotaRequest other = (GetServiceQuotaRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceQuotaRequest clone() {
        return (GetServiceQuotaRequest) super.clone();
    }

}
