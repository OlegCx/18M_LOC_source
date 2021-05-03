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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     */
    private String ingestionArn;
    /**
     * <p>
     * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     */
    private String ingestionId;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSetId
     *        The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSetId
     *        The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @param ingestionArn
     *        The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     */

    public void setIngestionArn(String ingestionArn) {
        this.ingestionArn = ingestionArn;
    }

    /**
     * <p>
     * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @return The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is
     *         SPICE.
     */

    public String getIngestionArn() {
        return this.ingestionArn;
    }

    /**
     * <p>
     * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @param ingestionArn
     *        The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withIngestionArn(String ingestionArn) {
        setIngestionArn(ingestionArn);
        return this;
    }

    /**
     * <p>
     * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @param ingestionId
     *        The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     */

    public void setIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
    }

    /**
     * <p>
     * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @return The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     */

    public String getIngestionId() {
        return this.ingestionId;
    }

    /**
     * <p>
     * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * </p>
     * 
     * @param ingestionId
     *        The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withIngestionId(String ingestionId) {
        setIngestionId(ingestionId);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetResult withStatus(Integer status) {
        setStatus(status);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getIngestionArn() != null)
            sb.append("IngestionArn: ").append(getIngestionArn()).append(",");
        if (getIngestionId() != null)
            sb.append("IngestionId: ").append(getIngestionId()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof CreateDataSetResult == false)
            return false;
        CreateDataSetResult other = (CreateDataSetResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getIngestionArn() == null ^ this.getIngestionArn() == null)
            return false;
        if (other.getIngestionArn() != null && other.getIngestionArn().equals(this.getIngestionArn()) == false)
            return false;
        if (other.getIngestionId() == null ^ this.getIngestionId() == null)
            return false;
        if (other.getIngestionId() != null && other.getIngestionId().equals(this.getIngestionId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getIngestionArn() == null) ? 0 : getIngestionArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionId() == null) ? 0 : getIngestionId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSetResult clone() {
        try {
            return (CreateDataSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
