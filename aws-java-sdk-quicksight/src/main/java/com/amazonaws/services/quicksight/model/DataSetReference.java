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
 * Dataset reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     */
    private String dataSetPlaceholder;
    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     */
    private String dataSetArn;

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * 
     * @param dataSetPlaceholder
     *        Dataset placeholder.
     */

    public void setDataSetPlaceholder(String dataSetPlaceholder) {
        this.dataSetPlaceholder = dataSetPlaceholder;
    }

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * 
     * @return Dataset placeholder.
     */

    public String getDataSetPlaceholder() {
        return this.dataSetPlaceholder;
    }

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * 
     * @param dataSetPlaceholder
     *        Dataset placeholder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetReference withDataSetPlaceholder(String dataSetPlaceholder) {
        setDataSetPlaceholder(dataSetPlaceholder);
        return this;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     * 
     * @param dataSetArn
     *        Dataset Amazon Resource Name (ARN).
     */

    public void setDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Dataset Amazon Resource Name (ARN).
     */

    public String getDataSetArn() {
        return this.dataSetArn;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     * 
     * @param dataSetArn
     *        Dataset Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetReference withDataSetArn(String dataSetArn) {
        setDataSetArn(dataSetArn);
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
        if (getDataSetPlaceholder() != null)
            sb.append("DataSetPlaceholder: ").append(getDataSetPlaceholder()).append(",");
        if (getDataSetArn() != null)
            sb.append("DataSetArn: ").append(getDataSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetReference == false)
            return false;
        DataSetReference other = (DataSetReference) obj;
        if (other.getDataSetPlaceholder() == null ^ this.getDataSetPlaceholder() == null)
            return false;
        if (other.getDataSetPlaceholder() != null && other.getDataSetPlaceholder().equals(this.getDataSetPlaceholder()) == false)
            return false;
        if (other.getDataSetArn() == null ^ this.getDataSetArn() == null)
            return false;
        if (other.getDataSetArn() != null && other.getDataSetArn().equals(this.getDataSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetPlaceholder() == null) ? 0 : getDataSetPlaceholder().hashCode());
        hashCode = prime * hashCode + ((getDataSetArn() == null) ? 0 : getDataSetArn().hashCode());
        return hashCode;
    }

    @Override
    public DataSetReference clone() {
        try {
            return (DataSetReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
