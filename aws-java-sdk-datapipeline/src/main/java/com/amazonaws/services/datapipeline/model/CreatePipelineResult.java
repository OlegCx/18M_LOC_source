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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of CreatePipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     * <code>df-06372391ZG65EXAMPLE</code>.
     * </p>
     */
    private String pipelineId;

    /**
     * <p>
     * The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     * <code>df-06372391ZG65EXAMPLE</code>.
     * </p>
     * 
     * @param pipelineId
     *        The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     *        <code>df-06372391ZG65EXAMPLE</code>.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     * <code>df-06372391ZG65EXAMPLE</code>.
     * </p>
     * 
     * @return The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     *         <code>df-06372391ZG65EXAMPLE</code>.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     * <code>df-06372391ZG65EXAMPLE</code>.
     * </p>
     * 
     * @param pipelineId
     *        The ID that AWS Data Pipeline assigns the newly created pipeline. For example,
     *        <code>df-06372391ZG65EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineResult withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePipelineResult == false)
            return false;
        CreatePipelineResult other = (CreatePipelineResult) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineResult clone() {
        try {
            return (CreatePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
