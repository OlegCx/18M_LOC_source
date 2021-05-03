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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GenerateOrganizationsAccessReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateOrganizationsAccessReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     * </p>
     * 
     * @param jobId
     *        The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     * </p>
     * 
     * @return The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     * </p>
     * 
     * @param jobId
     *        The job identifier that you can use in the <a>GetOrganizationsAccessReport</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateOrganizationsAccessReportResult withJobId(String jobId) {
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

        if (obj instanceof GenerateOrganizationsAccessReportResult == false)
            return false;
        GenerateOrganizationsAccessReportResult other = (GenerateOrganizationsAccessReportResult) obj;
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
    public GenerateOrganizationsAccessReportResult clone() {
        try {
            return (GenerateOrganizationsAccessReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
