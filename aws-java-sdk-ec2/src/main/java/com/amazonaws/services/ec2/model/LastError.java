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

/**
 * <p>
 * The last error that occurred for a VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LastError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastError implements Serializable, Cloneable {

    /**
     * <p>
     * The error message for the VPC endpoint error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The error code for the VPC endpoint error.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The error message for the VPC endpoint error.
     * </p>
     * 
     * @param message
     *        The error message for the VPC endpoint error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message for the VPC endpoint error.
     * </p>
     * 
     * @return The error message for the VPC endpoint error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message for the VPC endpoint error.
     * </p>
     * 
     * @param message
     *        The error message for the VPC endpoint error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The error code for the VPC endpoint error.
     * </p>
     * 
     * @param code
     *        The error code for the VPC endpoint error.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code for the VPC endpoint error.
     * </p>
     * 
     * @return The error code for the VPC endpoint error.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code for the VPC endpoint error.
     * </p>
     * 
     * @param code
     *        The error code for the VPC endpoint error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastError withCode(String code) {
        setCode(code);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastError == false)
            return false;
        LastError other = (LastError) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public LastError clone() {
        try {
            return (LastError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
