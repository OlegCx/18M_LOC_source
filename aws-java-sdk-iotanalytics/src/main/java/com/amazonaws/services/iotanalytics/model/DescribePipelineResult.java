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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Pipeline</code> object that contains information about the pipeline.
     * </p>
     */
    private Pipeline pipeline;

    /**
     * <p>
     * A <code>Pipeline</code> object that contains information about the pipeline.
     * </p>
     * 
     * @param pipeline
     *        A <code>Pipeline</code> object that contains information about the pipeline.
     */

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * A <code>Pipeline</code> object that contains information about the pipeline.
     * </p>
     * 
     * @return A <code>Pipeline</code> object that contains information about the pipeline.
     */

    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * A <code>Pipeline</code> object that contains information about the pipeline.
     * </p>
     * 
     * @param pipeline
     *        A <code>Pipeline</code> object that contains information about the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withPipeline(Pipeline pipeline) {
        setPipeline(pipeline);
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
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePipelineResult == false)
            return false;
        DescribePipelineResult other = (DescribePipelineResult) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipelineResult clone() {
        try {
            return (DescribePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
