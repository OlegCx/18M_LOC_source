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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source template of an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnalysisSourceTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSourceTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dataset references of the source template of an analysis.
     * </p>
     */
    private java.util.List<DataSetReference> dataSetReferences;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source template of an analysis.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The dataset references of the source template of an analysis.
     * </p>
     * 
     * @return The dataset references of the source template of an analysis.
     */

    public java.util.List<DataSetReference> getDataSetReferences() {
        return dataSetReferences;
    }

    /**
     * <p>
     * The dataset references of the source template of an analysis.
     * </p>
     * 
     * @param dataSetReferences
     *        The dataset references of the source template of an analysis.
     */

    public void setDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        if (dataSetReferences == null) {
            this.dataSetReferences = null;
            return;
        }

        this.dataSetReferences = new java.util.ArrayList<DataSetReference>(dataSetReferences);
    }

    /**
     * <p>
     * The dataset references of the source template of an analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetReferences(java.util.Collection)} or {@link #withDataSetReferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dataSetReferences
     *        The dataset references of the source template of an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSourceTemplate withDataSetReferences(DataSetReference... dataSetReferences) {
        if (this.dataSetReferences == null) {
            setDataSetReferences(new java.util.ArrayList<DataSetReference>(dataSetReferences.length));
        }
        for (DataSetReference ele : dataSetReferences) {
            this.dataSetReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dataset references of the source template of an analysis.
     * </p>
     * 
     * @param dataSetReferences
     *        The dataset references of the source template of an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSourceTemplate withDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        setDataSetReferences(dataSetReferences);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source template of an analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source template of an analysis.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source template of an analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source template of an analysis.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source template of an analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source template of an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSourceTemplate withArn(String arn) {
        setArn(arn);
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
        if (getDataSetReferences() != null)
            sb.append("DataSetReferences: ").append(getDataSetReferences()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisSourceTemplate == false)
            return false;
        AnalysisSourceTemplate other = (AnalysisSourceTemplate) obj;
        if (other.getDataSetReferences() == null ^ this.getDataSetReferences() == null)
            return false;
        if (other.getDataSetReferences() != null && other.getDataSetReferences().equals(this.getDataSetReferences()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetReferences() == null) ? 0 : getDataSetReferences().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSourceTemplate clone() {
        try {
            return (AnalysisSourceTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisSourceTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
