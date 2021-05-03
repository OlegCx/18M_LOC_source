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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>RetryStageExecution</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RetryStageExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryStageExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the current workflow execution in the failed stage.
     * </p>
     */
    private String pipelineExecutionId;

    /**
     * <p>
     * The ID of the current workflow execution in the failed stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the current workflow execution in the failed stage.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the current workflow execution in the failed stage.
     * </p>
     * 
     * @return The ID of the current workflow execution in the failed stage.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the current workflow execution in the failed stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the current workflow execution in the failed stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStageExecutionResult withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryStageExecutionResult == false)
            return false;
        RetryStageExecutionResult other = (RetryStageExecutionResult) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public RetryStageExecutionResult clone() {
        try {
            return (RetryStageExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
