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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the AWS service for which the account is a delegated administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DelegatedService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegatedService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an AWS service that can request an operation for the specified service. This is typically in the form
     * of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     */
    private String servicePrincipal;
    /**
     * <p>
     * The date that the account became a delegated administrator for this service.
     * </p>
     */
    private java.util.Date delegationEnabledDate;

    /**
     * <p>
     * The name of an AWS service that can request an operation for the specified service. This is typically in the form
     * of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @param servicePrincipal
     *        The name of an AWS service that can request an operation for the specified service. This is typically in
     *        the form of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     */

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The name of an AWS service that can request an operation for the specified service. This is typically in the form
     * of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @return The name of an AWS service that can request an operation for the specified service. This is typically in
     *         the form of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     */

    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     * <p>
     * The name of an AWS service that can request an operation for the specified service. This is typically in the form
     * of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @param servicePrincipal
     *        The name of an AWS service that can request an operation for the specified service. This is typically in
     *        the form of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedService withServicePrincipal(String servicePrincipal) {
        setServicePrincipal(servicePrincipal);
        return this;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this service.
     * </p>
     * 
     * @param delegationEnabledDate
     *        The date that the account became a delegated administrator for this service.
     */

    public void setDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        this.delegationEnabledDate = delegationEnabledDate;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this service.
     * </p>
     * 
     * @return The date that the account became a delegated administrator for this service.
     */

    public java.util.Date getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this service.
     * </p>
     * 
     * @param delegationEnabledDate
     *        The date that the account became a delegated administrator for this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedService withDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        setDelegationEnabledDate(delegationEnabledDate);
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: ").append(getServicePrincipal()).append(",");
        if (getDelegationEnabledDate() != null)
            sb.append("DelegationEnabledDate: ").append(getDelegationEnabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegatedService == false)
            return false;
        DelegatedService other = (DelegatedService) obj;
        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDelegationEnabledDate() == null ^ this.getDelegationEnabledDate() == null)
            return false;
        if (other.getDelegationEnabledDate() != null && other.getDelegationEnabledDate().equals(this.getDelegationEnabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        hashCode = prime * hashCode + ((getDelegationEnabledDate() == null) ? 0 : getDelegationEnabledDate().hashCode());
        return hashCode;
    }

    @Override
    public DelegatedService clone() {
        try {
            return (DelegatedService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.DelegatedServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
