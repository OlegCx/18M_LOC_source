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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     */
    private String datasetExportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job.
     */

    public void setDatasetExportJobArn(String datasetExportJobArn) {
        this.datasetExportJobArn = datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset export job.
     */

    public String getDatasetExportJobArn() {
        return this.datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetExportJobResult withDatasetExportJobArn(String datasetExportJobArn) {
        setDatasetExportJobArn(datasetExportJobArn);
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
        if (getDatasetExportJobArn() != null)
            sb.append("DatasetExportJobArn: ").append(getDatasetExportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetExportJobResult == false)
            return false;
        CreateDatasetExportJobResult other = (CreateDatasetExportJobResult) obj;
        if (other.getDatasetExportJobArn() == null ^ this.getDatasetExportJobArn() == null)
            return false;
        if (other.getDatasetExportJobArn() != null && other.getDatasetExportJobArn().equals(this.getDatasetExportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetExportJobArn() == null) ? 0 : getDatasetExportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetExportJobResult clone() {
        try {
            return (CreateDatasetExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
