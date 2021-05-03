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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CancelJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The output contains the ID of the cancelled job run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The output contains the virtual cluster ID for which the job run is cancelled.
     * </p>
     */
    private String virtualClusterId;

    /**
     * <p>
     * The output contains the ID of the cancelled job run.
     * </p>
     * 
     * @param id
     *        The output contains the ID of the cancelled job run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The output contains the ID of the cancelled job run.
     * </p>
     * 
     * @return The output contains the ID of the cancelled job run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The output contains the ID of the cancelled job run.
     * </p>
     * 
     * @param id
     *        The output contains the ID of the cancelled job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The output contains the virtual cluster ID for which the job run is cancelled.
     * </p>
     * 
     * @param virtualClusterId
     *        The output contains the virtual cluster ID for which the job run is cancelled.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The output contains the virtual cluster ID for which the job run is cancelled.
     * </p>
     * 
     * @return The output contains the virtual cluster ID for which the job run is cancelled.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The output contains the virtual cluster ID for which the job run is cancelled.
     * </p>
     * 
     * @param virtualClusterId
     *        The output contains the virtual cluster ID for which the job run is cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRunResult withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobRunResult == false)
            return false;
        CancelJobRunResult other = (CancelJobRunResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobRunResult clone() {
        try {
            return (CancelJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
