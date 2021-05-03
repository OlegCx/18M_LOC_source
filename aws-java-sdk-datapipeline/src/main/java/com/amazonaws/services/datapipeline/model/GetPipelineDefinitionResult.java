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
 * Contains the output of GetPipelineDefinition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The objects defined in the pipeline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PipelineObject> pipelineObjects;
    /**
     * <p>
     * The parameter objects used in the pipeline definition.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterObject> parameterObjects;
    /**
     * <p>
     * The parameter values used in the pipeline definition.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterValue> parameterValues;

    /**
     * <p>
     * The objects defined in the pipeline.
     * </p>
     * 
     * @return The objects defined in the pipeline.
     */

    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
            pipelineObjects = new com.amazonaws.internal.SdkInternalList<PipelineObject>();
        }
        return pipelineObjects;
    }

    /**
     * <p>
     * The objects defined in the pipeline.
     * </p>
     * 
     * @param pipelineObjects
     *        The objects defined in the pipeline.
     */

    public void setPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
            return;
        }

        this.pipelineObjects = new com.amazonaws.internal.SdkInternalList<PipelineObject>(pipelineObjects);
    }

    /**
     * <p>
     * The objects defined in the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineObjects(java.util.Collection)} or {@link #withPipelineObjects(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pipelineObjects
     *        The objects defined in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withPipelineObjects(PipelineObject... pipelineObjects) {
        if (this.pipelineObjects == null) {
            setPipelineObjects(new com.amazonaws.internal.SdkInternalList<PipelineObject>(pipelineObjects.length));
        }
        for (PipelineObject ele : pipelineObjects) {
            this.pipelineObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The objects defined in the pipeline.
     * </p>
     * 
     * @param pipelineObjects
     *        The objects defined in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        setPipelineObjects(pipelineObjects);
        return this;
    }

    /**
     * <p>
     * The parameter objects used in the pipeline definition.
     * </p>
     * 
     * @return The parameter objects used in the pipeline definition.
     */

    public java.util.List<ParameterObject> getParameterObjects() {
        if (parameterObjects == null) {
            parameterObjects = new com.amazonaws.internal.SdkInternalList<ParameterObject>();
        }
        return parameterObjects;
    }

    /**
     * <p>
     * The parameter objects used in the pipeline definition.
     * </p>
     * 
     * @param parameterObjects
     *        The parameter objects used in the pipeline definition.
     */

    public void setParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        if (parameterObjects == null) {
            this.parameterObjects = null;
            return;
        }

        this.parameterObjects = new com.amazonaws.internal.SdkInternalList<ParameterObject>(parameterObjects);
    }

    /**
     * <p>
     * The parameter objects used in the pipeline definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterObjects(java.util.Collection)} or {@link #withParameterObjects(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterObjects
     *        The parameter objects used in the pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withParameterObjects(ParameterObject... parameterObjects) {
        if (this.parameterObjects == null) {
            setParameterObjects(new com.amazonaws.internal.SdkInternalList<ParameterObject>(parameterObjects.length));
        }
        for (ParameterObject ele : parameterObjects) {
            this.parameterObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter objects used in the pipeline definition.
     * </p>
     * 
     * @param parameterObjects
     *        The parameter objects used in the pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        setParameterObjects(parameterObjects);
        return this;
    }

    /**
     * <p>
     * The parameter values used in the pipeline definition.
     * </p>
     * 
     * @return The parameter values used in the pipeline definition.
     */

    public java.util.List<ParameterValue> getParameterValues() {
        if (parameterValues == null) {
            parameterValues = new com.amazonaws.internal.SdkInternalList<ParameterValue>();
        }
        return parameterValues;
    }

    /**
     * <p>
     * The parameter values used in the pipeline definition.
     * </p>
     * 
     * @param parameterValues
     *        The parameter values used in the pipeline definition.
     */

    public void setParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }

        this.parameterValues = new com.amazonaws.internal.SdkInternalList<ParameterValue>(parameterValues);
    }

    /**
     * <p>
     * The parameter values used in the pipeline definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterValues(java.util.Collection)} or {@link #withParameterValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterValues
     *        The parameter values used in the pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withParameterValues(ParameterValue... parameterValues) {
        if (this.parameterValues == null) {
            setParameterValues(new com.amazonaws.internal.SdkInternalList<ParameterValue>(parameterValues.length));
        }
        for (ParameterValue ele : parameterValues) {
            this.parameterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter values used in the pipeline definition.
     * </p>
     * 
     * @param parameterValues
     *        The parameter values used in the pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionResult withParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        setParameterValues(parameterValues);
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
        if (getPipelineObjects() != null)
            sb.append("PipelineObjects: ").append(getPipelineObjects()).append(",");
        if (getParameterObjects() != null)
            sb.append("ParameterObjects: ").append(getParameterObjects()).append(",");
        if (getParameterValues() != null)
            sb.append("ParameterValues: ").append(getParameterValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineDefinitionResult == false)
            return false;
        GetPipelineDefinitionResult other = (GetPipelineDefinitionResult) obj;
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null)
            return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false)
            return false;
        if (other.getParameterObjects() == null ^ this.getParameterObjects() == null)
            return false;
        if (other.getParameterObjects() != null && other.getParameterObjects().equals(this.getParameterObjects()) == false)
            return false;
        if (other.getParameterValues() == null ^ this.getParameterValues() == null)
            return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode());
        hashCode = prime * hashCode + ((getParameterObjects() == null) ? 0 : getParameterObjects().hashCode());
        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineDefinitionResult clone() {
        try {
            return (GetPipelineDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
