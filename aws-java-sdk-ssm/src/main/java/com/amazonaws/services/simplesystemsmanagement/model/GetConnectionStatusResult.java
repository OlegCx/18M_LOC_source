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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetConnectionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * 
     * @param target
     *        The ID of the instance to check connection status.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * 
     * @return The ID of the instance to check connection status.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * 
     * @param target
     *        The ID of the instance to check connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionStatusResult withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * </p>
     * 
     * @param status
     *        The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * @see ConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * </p>
     * 
     * @return The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * @see ConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * </p>
     * 
     * @param status
     *        The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public GetConnectionStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * </p>
     * 
     * @param status
     *        The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public GetConnectionStatusResult withStatus(ConnectionStatus status) {
        this.status = status.toString();
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionStatusResult == false)
            return false;
        GetConnectionStatusResult other = (GetConnectionStatusResult) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionStatusResult clone() {
        try {
            return (GetConnectionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
