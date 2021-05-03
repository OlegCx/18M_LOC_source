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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a <code>Lambda Invoke</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LambdaInvokeOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaInvokeOperation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every object in
     * the manifest.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every object in
     * the manifest.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every
     *        object in the manifest.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every object in
     * the manifest.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every
     *         object in the manifest.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every object in
     * the manifest.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke on every
     *        object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaInvokeOperation == false)
            return false;
        LambdaInvokeOperation other = (LambdaInvokeOperation) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public LambdaInvokeOperation clone() {
        try {
            return (LambdaInvokeOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
