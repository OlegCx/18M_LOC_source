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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAccessPreviewFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPreviewFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of access preview findings that match the specified filter criteria.
     * </p>
     */
    private java.util.List<AccessPreviewFinding> findings;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of access preview findings that match the specified filter criteria.
     * </p>
     * 
     * @return A list of access preview findings that match the specified filter criteria.
     */

    public java.util.List<AccessPreviewFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * A list of access preview findings that match the specified filter criteria.
     * </p>
     * 
     * @param findings
     *        A list of access preview findings that match the specified filter criteria.
     */

    public void setFindings(java.util.Collection<AccessPreviewFinding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<AccessPreviewFinding>(findings);
    }

    /**
     * <p>
     * A list of access preview findings that match the specified filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        A list of access preview findings that match the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsResult withFindings(AccessPreviewFinding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<AccessPreviewFinding>(findings.length));
        }
        for (AccessPreviewFinding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of access preview findings that match the specified filter criteria.
     * </p>
     * 
     * @param findings
     *        A list of access preview findings that match the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsResult withFindings(java.util.Collection<AccessPreviewFinding> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFindings() != null)
            sb.append("Findings: ").append(getFindings()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessPreviewFindingsResult == false)
            return false;
        ListAccessPreviewFindingsResult other = (ListAccessPreviewFindingsResult) obj;
        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPreviewFindingsResult clone() {
        try {
            return (ListAccessPreviewFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
