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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Assigns a value to a named Pipeline parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter to assign a value to. This parameter name must match a named parameter in the pipeline
     * definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The literal value for the parameter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the parameter to assign a value to. This parameter name must match a named parameter in the pipeline
     * definition.
     * </p>
     * 
     * @param name
     *        The name of the parameter to assign a value to. This parameter name must match a named parameter in the
     *        pipeline definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter to assign a value to. This parameter name must match a named parameter in the pipeline
     * definition.
     * </p>
     * 
     * @return The name of the parameter to assign a value to. This parameter name must match a named parameter in the
     *         pipeline definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter to assign a value to. This parameter name must match a named parameter in the pipeline
     * definition.
     * </p>
     * 
     * @param name
     *        The name of the parameter to assign a value to. This parameter name must match a named parameter in the
     *        pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The literal value for the parameter.
     * </p>
     * 
     * @param value
     *        The literal value for the parameter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The literal value for the parameter.
     * </p>
     * 
     * @return The literal value for the parameter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The literal value for the parameter.
     * </p>
     * 
     * @param value
     *        The literal value for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
