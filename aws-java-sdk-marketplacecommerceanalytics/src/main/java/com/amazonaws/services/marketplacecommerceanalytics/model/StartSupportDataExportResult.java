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
package com.amazonaws.services.marketplacecommerceanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Container for the result of the StartSupportDataExport operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplacecommerceanalytics-2015-07-01/StartSupportDataExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSupportDataExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can
     * be used to correlate a request with notifications from the SNS topic.
     */
    private String dataSetRequestId;

    /**
     * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can
     * be used to correlate a request with notifications from the SNS topic.
     * 
     * @param dataSetRequestId
     *        A unique identifier representing a specific request to the StartSupportDataExport operation. This
     *        identifier can be used to correlate a request with notifications from the SNS topic.
     */

    public void setDataSetRequestId(String dataSetRequestId) {
        this.dataSetRequestId = dataSetRequestId;
    }

    /**
     * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can
     * be used to correlate a request with notifications from the SNS topic.
     * 
     * @return A unique identifier representing a specific request to the StartSupportDataExport operation. This
     *         identifier can be used to correlate a request with notifications from the SNS topic.
     */

    public String getDataSetRequestId() {
        return this.dataSetRequestId;
    }

    /**
     * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can
     * be used to correlate a request with notifications from the SNS topic.
     * 
     * @param dataSetRequestId
     *        A unique identifier representing a specific request to the StartSupportDataExport operation. This
     *        identifier can be used to correlate a request with notifications from the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportResult withDataSetRequestId(String dataSetRequestId) {
        setDataSetRequestId(dataSetRequestId);
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
        if (getDataSetRequestId() != null)
            sb.append("DataSetRequestId: ").append(getDataSetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSupportDataExportResult == false)
            return false;
        StartSupportDataExportResult other = (StartSupportDataExportResult) obj;
        if (other.getDataSetRequestId() == null ^ this.getDataSetRequestId() == null)
            return false;
        if (other.getDataSetRequestId() != null && other.getDataSetRequestId().equals(this.getDataSetRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetRequestId() == null) ? 0 : getDataSetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public StartSupportDataExportResult clone() {
        try {
            return (StartSupportDataExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
