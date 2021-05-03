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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CancelCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The 39-character ID for the cluster that you want to cancel, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The 39-character ID for the cluster that you want to cancel, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to cancel, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to cancel, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The 39-character ID for the cluster that you want to cancel, for example
     *         <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to cancel, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to cancel, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelClusterRequest == false)
            return false;
        CancelClusterRequest other = (CancelClusterRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        return hashCode;
    }

    @Override
    public CancelClusterRequest clone() {
        return (CancelClusterRequest) super.clone();
    }

}
