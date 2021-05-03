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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSigningJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of your signing job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The AWS account ID of the signing job owner.
     * </p>
     */
    private String jobOwner;

    /**
     * <p>
     * The ID of your signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of your signing job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of your signing job.
     * </p>
     * 
     * @return The ID of your signing job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of your signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of your signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the signing job owner.
     * </p>
     * 
     * @param jobOwner
     *        The AWS account ID of the signing job owner.
     */

    public void setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
    }

    /**
     * <p>
     * The AWS account ID of the signing job owner.
     * </p>
     * 
     * @return The AWS account ID of the signing job owner.
     */

    public String getJobOwner() {
        return this.jobOwner;
    }

    /**
     * <p>
     * The AWS account ID of the signing job owner.
     * </p>
     * 
     * @param jobOwner
     *        The AWS account ID of the signing job owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobResult withJobOwner(String jobOwner) {
        setJobOwner(jobOwner);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobOwner() != null)
            sb.append("JobOwner: ").append(getJobOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSigningJobResult == false)
            return false;
        StartSigningJobResult other = (StartSigningJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobOwner() == null ^ this.getJobOwner() == null)
            return false;
        if (other.getJobOwner() != null && other.getJobOwner().equals(this.getJobOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobOwner() == null) ? 0 : getJobOwner().hashCode());
        return hashCode;
    }

    @Override
    public StartSigningJobResult clone() {
        try {
            return (StartSigningJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
