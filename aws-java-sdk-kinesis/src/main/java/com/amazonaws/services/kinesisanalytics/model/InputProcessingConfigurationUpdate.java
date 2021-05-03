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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes updates to an <a
 * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputProcessingConfiguration.html"
 * >InputProcessingConfiguration</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/InputProcessingConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputProcessingConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides update information for an <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     * >InputLambdaProcessor</a>.
     * </p>
     */
    private InputLambdaProcessorUpdate inputLambdaProcessorUpdate;

    /**
     * <p>
     * Provides update information for an <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     * >InputLambdaProcessor</a>.
     * </p>
     * 
     * @param inputLambdaProcessorUpdate
     *        Provides update information for an <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     *        >InputLambdaProcessor</a>.
     */

    public void setInputLambdaProcessorUpdate(InputLambdaProcessorUpdate inputLambdaProcessorUpdate) {
        this.inputLambdaProcessorUpdate = inputLambdaProcessorUpdate;
    }

    /**
     * <p>
     * Provides update information for an <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     * >InputLambdaProcessor</a>.
     * </p>
     * 
     * @return Provides update information for an <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     *         >InputLambdaProcessor</a>.
     */

    public InputLambdaProcessorUpdate getInputLambdaProcessorUpdate() {
        return this.inputLambdaProcessorUpdate;
    }

    /**
     * <p>
     * Provides update information for an <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     * >InputLambdaProcessor</a>.
     * </p>
     * 
     * @param inputLambdaProcessorUpdate
     *        Provides update information for an <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html"
     *        >InputLambdaProcessor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputProcessingConfigurationUpdate withInputLambdaProcessorUpdate(InputLambdaProcessorUpdate inputLambdaProcessorUpdate) {
        setInputLambdaProcessorUpdate(inputLambdaProcessorUpdate);
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
        if (getInputLambdaProcessorUpdate() != null)
            sb.append("InputLambdaProcessorUpdate: ").append(getInputLambdaProcessorUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputProcessingConfigurationUpdate == false)
            return false;
        InputProcessingConfigurationUpdate other = (InputProcessingConfigurationUpdate) obj;
        if (other.getInputLambdaProcessorUpdate() == null ^ this.getInputLambdaProcessorUpdate() == null)
            return false;
        if (other.getInputLambdaProcessorUpdate() != null && other.getInputLambdaProcessorUpdate().equals(this.getInputLambdaProcessorUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputLambdaProcessorUpdate() == null) ? 0 : getInputLambdaProcessorUpdate().hashCode());
        return hashCode;
    }

    @Override
    public InputProcessingConfigurationUpdate clone() {
        try {
            return (InputProcessingConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.InputProcessingConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
