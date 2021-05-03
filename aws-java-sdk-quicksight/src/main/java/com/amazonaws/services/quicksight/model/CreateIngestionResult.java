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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIngestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIngestionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     */
    private String ingestionId;
    /**
     * <p>
     * The ingestion status.
     * </p>
     */
    private String ingestionStatus;
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
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the data ingestion.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the data ingestion.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the data ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * 
     * @param ingestionId
     *        An ID for the ingestion.
     */

    public void setIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * 
     * @return An ID for the ingestion.
     */

    public String getIngestionId() {
        return this.ingestionId;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * 
     * @param ingestionId
     *        An ID for the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionResult withIngestionId(String ingestionId) {
        setIngestionId(ingestionId);
        return this;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        The ingestion status.
     * @see IngestionStatus
     */

    public void setIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * 
     * @return The ingestion status.
     * @see IngestionStatus
     */

    public String getIngestionStatus() {
        return this.ingestionStatus;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        The ingestion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public CreateIngestionResult withIngestionStatus(String ingestionStatus) {
        setIngestionStatus(ingestionStatus);
        return this;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        The ingestion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public CreateIngestionResult withIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
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

    public CreateIngestionResult withRequestId(String requestId) {
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

    public CreateIngestionResult withStatus(Integer status) {
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
        if (getIngestionId() != null)
            sb.append("IngestionId: ").append(getIngestionId()).append(",");
        if (getIngestionStatus() != null)
            sb.append("IngestionStatus: ").append(getIngestionStatus()).append(",");
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

        if (obj instanceof CreateIngestionResult == false)
            return false;
        CreateIngestionResult other = (CreateIngestionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIngestionId() == null ^ this.getIngestionId() == null)
            return false;
        if (other.getIngestionId() != null && other.getIngestionId().equals(this.getIngestionId()) == false)
            return false;
        if (other.getIngestionStatus() == null ^ this.getIngestionStatus() == null)
            return false;
        if (other.getIngestionStatus() != null && other.getIngestionStatus().equals(this.getIngestionStatus()) == false)
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
        hashCode = prime * hashCode + ((getIngestionId() == null) ? 0 : getIngestionId().hashCode());
        hashCode = prime * hashCode + ((getIngestionStatus() == null) ? 0 : getIngestionStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateIngestionResult clone() {
        try {
            return (CreateIngestionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
