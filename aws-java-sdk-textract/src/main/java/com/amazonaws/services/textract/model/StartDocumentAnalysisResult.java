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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDocumentAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     * </p>
     * 
     * @param jobId
     *        The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a
     *        subsequent call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     * </p>
     * 
     * @return The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a
     *         subsequent call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     * </p>
     * 
     * @param jobId
     *        The identifier for the document text detection job. Use <code>JobId</code> to identify the job in a
     *        subsequent call to <code>GetDocumentAnalysis</code>. A <code>JobId</code> value is only valid for 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentAnalysisResult withJobId(String jobId) {
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

        if (obj instanceof StartDocumentAnalysisResult == false)
            return false;
        StartDocumentAnalysisResult other = (StartDocumentAnalysisResult) obj;
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
    public StartDocumentAnalysisResult clone() {
        try {
            return (StartDocumentAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
