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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelDeploymentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelDeploymentJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment job ARN to cancel.
     * </p>
     */
    private String job;

    /**
     * <p>
     * The deployment job ARN to cancel.
     * </p>
     * 
     * @param job
     *        The deployment job ARN to cancel.
     */

    public void setJob(String job) {
        this.job = job;
    }

    /**
     * <p>
     * The deployment job ARN to cancel.
     * </p>
     * 
     * @return The deployment job ARN to cancel.
     */

    public String getJob() {
        return this.job;
    }

    /**
     * <p>
     * The deployment job ARN to cancel.
     * </p>
     * 
     * @param job
     *        The deployment job ARN to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDeploymentJobRequest withJob(String job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: ").append(getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDeploymentJobRequest == false)
            return false;
        CancelDeploymentJobRequest other = (CancelDeploymentJobRequest) obj;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public CancelDeploymentJobRequest clone() {
        return (CancelDeploymentJobRequest) super.clone();
    }

}
