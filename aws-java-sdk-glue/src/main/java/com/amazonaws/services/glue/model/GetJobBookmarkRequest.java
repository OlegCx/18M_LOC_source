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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobBookmark" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobBookmarkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job in question.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The name of the job in question.
     * </p>
     * 
     * @param jobName
     *        The name of the job in question.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job in question.
     * </p>
     * 
     * @return The name of the job in question.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job in question.
     * </p>
     * 
     * @param jobName
     *        The name of the job in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobBookmarkRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this job run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     * 
     * @return The unique run identifier associated with this job run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobBookmarkRequest withRunId(String runId) {
        setRunId(runId);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobBookmarkRequest == false)
            return false;
        GetJobBookmarkRequest other = (GetJobBookmarkRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public GetJobBookmarkRequest clone() {
        return (GetJobBookmarkRequest) super.clone();
    }

}
