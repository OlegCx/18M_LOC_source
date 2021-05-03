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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/WithdrawByoipCidr"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WithdrawByoipCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the address pool.
     * </p>
     */
    private ByoipCidr byoipCidr;

    /**
     * <p>
     * Information about the address pool.
     * </p>
     * 
     * @param byoipCidr
     *        Information about the address pool.
     */

    public void setByoipCidr(ByoipCidr byoipCidr) {
        this.byoipCidr = byoipCidr;
    }

    /**
     * <p>
     * Information about the address pool.
     * </p>
     * 
     * @return Information about the address pool.
     */

    public ByoipCidr getByoipCidr() {
        return this.byoipCidr;
    }

    /**
     * <p>
     * Information about the address pool.
     * </p>
     * 
     * @param byoipCidr
     *        Information about the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WithdrawByoipCidrResult withByoipCidr(ByoipCidr byoipCidr) {
        setByoipCidr(byoipCidr);
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
        if (getByoipCidr() != null)
            sb.append("ByoipCidr: ").append(getByoipCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WithdrawByoipCidrResult == false)
            return false;
        WithdrawByoipCidrResult other = (WithdrawByoipCidrResult) obj;
        if (other.getByoipCidr() == null ^ this.getByoipCidr() == null)
            return false;
        if (other.getByoipCidr() != null && other.getByoipCidr().equals(this.getByoipCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByoipCidr() == null) ? 0 : getByoipCidr().hashCode());
        return hashCode;
    }

    @Override
    public WithdrawByoipCidrResult clone() {
        try {
            return (WithdrawByoipCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
