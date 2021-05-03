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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetRequestedServiceQuotaChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRequestedServiceQuotaChangeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the quota increase request.
     * </p>
     */
    private RequestedServiceQuotaChange requestedQuota;

    /**
     * <p>
     * Information about the quota increase request.
     * </p>
     * 
     * @param requestedQuota
     *        Information about the quota increase request.
     */

    public void setRequestedQuota(RequestedServiceQuotaChange requestedQuota) {
        this.requestedQuota = requestedQuota;
    }

    /**
     * <p>
     * Information about the quota increase request.
     * </p>
     * 
     * @return Information about the quota increase request.
     */

    public RequestedServiceQuotaChange getRequestedQuota() {
        return this.requestedQuota;
    }

    /**
     * <p>
     * Information about the quota increase request.
     * </p>
     * 
     * @param requestedQuota
     *        Information about the quota increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestedServiceQuotaChangeResult withRequestedQuota(RequestedServiceQuotaChange requestedQuota) {
        setRequestedQuota(requestedQuota);
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
        if (getRequestedQuota() != null)
            sb.append("RequestedQuota: ").append(getRequestedQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRequestedServiceQuotaChangeResult == false)
            return false;
        GetRequestedServiceQuotaChangeResult other = (GetRequestedServiceQuotaChangeResult) obj;
        if (other.getRequestedQuota() == null ^ this.getRequestedQuota() == null)
            return false;
        if (other.getRequestedQuota() != null && other.getRequestedQuota().equals(this.getRequestedQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestedQuota() == null) ? 0 : getRequestedQuota().hashCode());
        return hashCode;
    }

    @Override
    public GetRequestedServiceQuotaChangeResult clone() {
        try {
            return (GetRequestedServiceQuotaChangeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
