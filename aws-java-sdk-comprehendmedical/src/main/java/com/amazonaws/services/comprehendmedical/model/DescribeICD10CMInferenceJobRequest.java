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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeICD10CMInferenceJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeICD10CMInferenceJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier that Amazon Comprehend Medical generated for the job. <code>The StartICD10CMInferenceJob</code>
     * operation returns this identifier in its response.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The identifier that Amazon Comprehend Medical generated for the job. <code>The StartICD10CMInferenceJob</code>
     * operation returns this identifier in its response.
     * </p>
     * 
     * @param jobId
     *        The identifier that Amazon Comprehend Medical generated for the job.
     *        <code>The StartICD10CMInferenceJob</code> operation returns this identifier in its response.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier that Amazon Comprehend Medical generated for the job. <code>The StartICD10CMInferenceJob</code>
     * operation returns this identifier in its response.
     * </p>
     * 
     * @return The identifier that Amazon Comprehend Medical generated for the job.
     *         <code>The StartICD10CMInferenceJob</code> operation returns this identifier in its response.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier that Amazon Comprehend Medical generated for the job. <code>The StartICD10CMInferenceJob</code>
     * operation returns this identifier in its response.
     * </p>
     * 
     * @param jobId
     *        The identifier that Amazon Comprehend Medical generated for the job.
     *        <code>The StartICD10CMInferenceJob</code> operation returns this identifier in its response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeICD10CMInferenceJobRequest withJobId(String jobId) {
        setJobId(jobId);
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
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeICD10CMInferenceJobRequest == false)
            return false;
        DescribeICD10CMInferenceJobRequest other = (DescribeICD10CMInferenceJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeICD10CMInferenceJobRequest clone() {
        return (DescribeICD10CMInferenceJobRequest) super.clone();
    }

}
