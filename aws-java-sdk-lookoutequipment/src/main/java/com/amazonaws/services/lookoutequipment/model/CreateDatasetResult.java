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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being created.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Indicates the status of the <code>CreateDataset</code> operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being created.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @return The name of the dataset being created.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being created.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being created.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset being created.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being created.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateDataset</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateDataset</code> operation.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateDataset</code> operation.
     * </p>
     * 
     * @return Indicates the status of the <code>CreateDataset</code> operation.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateDataset</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateDataset</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public CreateDatasetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateDataset</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateDataset</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public CreateDatasetResult withStatus(DatasetStatus status) {
        this.status = status.toString();
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetResult == false)
            return false;
        CreateDatasetResult other = (CreateDatasetResult) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetResult clone() {
        try {
            return (CreateDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
