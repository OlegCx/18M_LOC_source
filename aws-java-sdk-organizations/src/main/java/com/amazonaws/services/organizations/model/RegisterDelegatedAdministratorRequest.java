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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RegisterDelegatedAdministrator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDelegatedAdministratorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * </p>
     */
    private String servicePrincipal;

    /**
     * <p>
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * </p>
     * 
     * @param accountId
     *        The account ID number of the member account in the organization to register as a delegated administrator.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * </p>
     * 
     * @return The account ID number of the member account in the organization to register as a delegated administrator.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * </p>
     * 
     * @param accountId
     *        The account ID number of the member account in the organization to register as a delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDelegatedAdministratorRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * </p>
     * 
     * @param servicePrincipal
     *        The service principal of the AWS service for which you want to make the member account a delegated
     *        administrator.
     */

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * </p>
     * 
     * @return The service principal of the AWS service for which you want to make the member account a delegated
     *         administrator.
     */

    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * </p>
     * 
     * @param servicePrincipal
     *        The service principal of the AWS service for which you want to make the member account a delegated
     *        administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDelegatedAdministratorRequest withServicePrincipal(String servicePrincipal) {
        setServicePrincipal(servicePrincipal);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: ").append(getServicePrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDelegatedAdministratorRequest == false)
            return false;
        RegisterDelegatedAdministratorRequest other = (RegisterDelegatedAdministratorRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        return hashCode;
    }

    @Override
    public RegisterDelegatedAdministratorRequest clone() {
        return (RegisterDelegatedAdministratorRequest) super.clone();
    }

}
