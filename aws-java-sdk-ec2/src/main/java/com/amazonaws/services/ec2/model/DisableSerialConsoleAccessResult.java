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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableSerialConsoleAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     * <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * </p>
     */
    private Boolean serialConsoleAccessEnabled;

    /**
     * <p>
     * If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     * <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * </p>
     * 
     * @param serialConsoleAccessEnabled
     *        If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     *        <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     */

    public void setSerialConsoleAccessEnabled(Boolean serialConsoleAccessEnabled) {
        this.serialConsoleAccessEnabled = serialConsoleAccessEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     * <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * </p>
     * 
     * @return If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     *         <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     */

    public Boolean getSerialConsoleAccessEnabled() {
        return this.serialConsoleAccessEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     * <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * </p>
     * 
     * @param serialConsoleAccessEnabled
     *        If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     *        <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableSerialConsoleAccessResult withSerialConsoleAccessEnabled(Boolean serialConsoleAccessEnabled) {
        setSerialConsoleAccessEnabled(serialConsoleAccessEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     * <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     * </p>
     * 
     * @return If <code>true</code>, access to the EC2 serial console of all instances is enabled for your account. If
     *         <code>false</code>, access to the EC2 serial console of all instances is disabled for your account.
     */

    public Boolean isSerialConsoleAccessEnabled() {
        return this.serialConsoleAccessEnabled;
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
        if (getSerialConsoleAccessEnabled() != null)
            sb.append("SerialConsoleAccessEnabled: ").append(getSerialConsoleAccessEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableSerialConsoleAccessResult == false)
            return false;
        DisableSerialConsoleAccessResult other = (DisableSerialConsoleAccessResult) obj;
        if (other.getSerialConsoleAccessEnabled() == null ^ this.getSerialConsoleAccessEnabled() == null)
            return false;
        if (other.getSerialConsoleAccessEnabled() != null && other.getSerialConsoleAccessEnabled().equals(this.getSerialConsoleAccessEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSerialConsoleAccessEnabled() == null) ? 0 : getSerialConsoleAccessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DisableSerialConsoleAccessResult clone() {
        try {
            return (DisableSerialConsoleAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
