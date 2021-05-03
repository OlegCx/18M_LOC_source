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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The default configuration that applies to all Lambda functions in the group. Individual Lambda functions can override
 * these settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionDefaultConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionDefaultConfig implements Serializable, Cloneable, StructuredPojo {

    private FunctionDefaultExecutionConfig execution;

    /**
     * @param execution
     */

    public void setExecution(FunctionDefaultExecutionConfig execution) {
        this.execution = execution;
    }

    /**
     * @return
     */

    public FunctionDefaultExecutionConfig getExecution() {
        return this.execution;
    }

    /**
     * @param execution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionDefaultConfig withExecution(FunctionDefaultExecutionConfig execution) {
        setExecution(execution);
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
        if (getExecution() != null)
            sb.append("Execution: ").append(getExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionDefaultConfig == false)
            return false;
        FunctionDefaultConfig other = (FunctionDefaultConfig) obj;
        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        return hashCode;
    }

    @Override
    public FunctionDefaultConfig clone() {
        try {
            return (FunctionDefaultConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionDefaultConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
