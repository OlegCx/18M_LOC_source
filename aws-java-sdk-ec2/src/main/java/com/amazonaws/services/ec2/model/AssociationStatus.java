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
 * Describes the state of a target network association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the target network association.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message about the status of the target network association, if applicable.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state of the target network association.
     * </p>
     * 
     * @param code
     *        The state of the target network association.
     * @see AssociationStatusCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state of the target network association.
     * </p>
     * 
     * @return The state of the target network association.
     * @see AssociationStatusCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state of the target network association.
     * </p>
     * 
     * @param code
     *        The state of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatusCode
     */

    public AssociationStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state of the target network association.
     * </p>
     * 
     * @param code
     *        The state of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatusCode
     */

    public AssociationStatus withCode(AssociationStatusCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the target network association, if applicable.
     * </p>
     * 
     * @param message
     *        A message about the status of the target network association, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the status of the target network association, if applicable.
     * </p>
     * 
     * @return A message about the status of the target network association, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the status of the target network association, if applicable.
     * </p>
     * 
     * @param message
     *        A message about the status of the target network association, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationStatus withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationStatus == false)
            return false;
        AssociationStatus other = (AssociationStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AssociationStatus clone() {
        try {
            return (AssociationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
