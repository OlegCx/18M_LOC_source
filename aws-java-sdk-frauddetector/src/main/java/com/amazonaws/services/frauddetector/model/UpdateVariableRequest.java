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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVariableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new default value of the variable.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The new description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The variable type. For more information see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     */
    private String variableType;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @return The name of the variable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVariableRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     * 
     * @param defaultValue
     *        The new default value of the variable.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     * 
     * @return The new default value of the variable.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     * 
     * @param defaultValue
     *        The new default value of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVariableRequest withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @param description
     *        The new description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @return The new description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @param description
     *        The new description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVariableRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The variable type. For more information see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @param variableType
     *        The variable type. For more information see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *        types</a>.
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type. For more information see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @return The variable type. For more information see <a
     *         href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *         types</a>.
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The variable type. For more information see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @param variableType
     *        The variable type. For more information see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *        types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVariableRequest withVariableType(String variableType) {
        setVariableType(variableType);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVariableRequest == false)
            return false;
        UpdateVariableRequest other = (UpdateVariableRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVariableRequest clone() {
        return (UpdateVariableRequest) super.clone();
    }

}
