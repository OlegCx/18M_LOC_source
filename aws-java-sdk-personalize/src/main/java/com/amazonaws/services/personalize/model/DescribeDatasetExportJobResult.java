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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the dataset export job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private DatasetExportJob datasetExportJob;

    /**
     * <p>
     * Information about the dataset export job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetExportJob
     *        Information about the dataset export job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setDatasetExportJob(DatasetExportJob datasetExportJob) {
        this.datasetExportJob = datasetExportJob;
    }

    /**
     * <p>
     * Information about the dataset export job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the dataset export job, including the status.</p>
     *         <p>
     *         The status is one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     */

    public DatasetExportJob getDatasetExportJob() {
        return this.datasetExportJob;
    }

    /**
     * <p>
     * Information about the dataset export job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetExportJob
     *        Information about the dataset export job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetExportJobResult withDatasetExportJob(DatasetExportJob datasetExportJob) {
        setDatasetExportJob(datasetExportJob);
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
        if (getDatasetExportJob() != null)
            sb.append("DatasetExportJob: ").append(getDatasetExportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetExportJobResult == false)
            return false;
        DescribeDatasetExportJobResult other = (DescribeDatasetExportJobResult) obj;
        if (other.getDatasetExportJob() == null ^ this.getDatasetExportJob() == null)
            return false;
        if (other.getDatasetExportJob() != null && other.getDatasetExportJob().equals(this.getDatasetExportJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetExportJob() == null) ? 0 : getDatasetExportJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetExportJobResult clone() {
        try {
            return (DescribeDatasetExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
