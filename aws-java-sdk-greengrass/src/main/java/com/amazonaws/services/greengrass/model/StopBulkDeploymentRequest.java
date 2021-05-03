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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/StopBulkDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopBulkDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the bulk deployment. */
    private String bulkDeploymentId;

    /**
     * The ID of the bulk deployment.
     * 
     * @param bulkDeploymentId
     *        The ID of the bulk deployment.
     */

    public void setBulkDeploymentId(String bulkDeploymentId) {
        this.bulkDeploymentId = bulkDeploymentId;
    }

    /**
     * The ID of the bulk deployment.
     * 
     * @return The ID of the bulk deployment.
     */

    public String getBulkDeploymentId() {
        return this.bulkDeploymentId;
    }

    /**
     * The ID of the bulk deployment.
     * 
     * @param bulkDeploymentId
     *        The ID of the bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopBulkDeploymentRequest withBulkDeploymentId(String bulkDeploymentId) {
        setBulkDeploymentId(bulkDeploymentId);
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
        if (getBulkDeploymentId() != null)
            sb.append("BulkDeploymentId: ").append(getBulkDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopBulkDeploymentRequest == false)
            return false;
        StopBulkDeploymentRequest other = (StopBulkDeploymentRequest) obj;
        if (other.getBulkDeploymentId() == null ^ this.getBulkDeploymentId() == null)
            return false;
        if (other.getBulkDeploymentId() != null && other.getBulkDeploymentId().equals(this.getBulkDeploymentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBulkDeploymentId() == null) ? 0 : getBulkDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public StopBulkDeploymentRequest clone() {
        return (StopBulkDeploymentRequest) super.clone();
    }

}
