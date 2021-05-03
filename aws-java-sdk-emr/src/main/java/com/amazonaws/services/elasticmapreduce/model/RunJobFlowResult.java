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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of the <a>RunJobFlow</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RunJobFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunJobFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the job flow.
     * </p>
     */
    private String jobFlowId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * A unique identifier for the job flow.
     * </p>
     * 
     * @param jobFlowId
     *        A unique identifier for the job flow.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * A unique identifier for the job flow.
     * </p>
     * 
     * @return A unique identifier for the job flow.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * A unique identifier for the job flow.
     * </p>
     * 
     * @param jobFlowId
     *        A unique identifier for the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowResult withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: ").append(getJobFlowId()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunJobFlowResult == false)
            return false;
        RunJobFlowResult other = (RunJobFlowResult) obj;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public RunJobFlowResult clone() {
        try {
            return (RunJobFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
