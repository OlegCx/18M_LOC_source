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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeSimulationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * </p>
     */
    private java.util.List<String> jobs;

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     */

    public java.util.List<String> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * </p>
     * 
     * @param jobs
     *        A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     */

    public void setJobs(java.util.Collection<String> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<String>(jobs);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobRequest withJobs(String... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<String>(jobs.length));
        }
        for (String ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * </p>
     * 
     * @param jobs
     *        A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobRequest withJobs(java.util.Collection<String> jobs) {
        setJobs(jobs);
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
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeSimulationJobRequest == false)
            return false;
        BatchDescribeSimulationJobRequest other = (BatchDescribeSimulationJobRequest) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeSimulationJobRequest clone() {
        return (BatchDescribeSimulationJobRequest) super.clone();
    }

}
