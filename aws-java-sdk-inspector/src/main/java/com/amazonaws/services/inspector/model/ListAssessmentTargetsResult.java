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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs that specifies the assessment targets that are returned by the action.
     * </p>
     */
    private java.util.List<String> assessmentTargetArns;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ARNs that specifies the assessment targets that are returned by the action.
     * </p>
     * 
     * @return A list of ARNs that specifies the assessment targets that are returned by the action.
     */

    public java.util.List<String> getAssessmentTargetArns() {
        return assessmentTargetArns;
    }

    /**
     * <p>
     * A list of ARNs that specifies the assessment targets that are returned by the action.
     * </p>
     * 
     * @param assessmentTargetArns
     *        A list of ARNs that specifies the assessment targets that are returned by the action.
     */

    public void setAssessmentTargetArns(java.util.Collection<String> assessmentTargetArns) {
        if (assessmentTargetArns == null) {
            this.assessmentTargetArns = null;
            return;
        }

        this.assessmentTargetArns = new java.util.ArrayList<String>(assessmentTargetArns);
    }

    /**
     * <p>
     * A list of ARNs that specifies the assessment targets that are returned by the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentTargetArns(java.util.Collection)} or {@link #withAssessmentTargetArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assessmentTargetArns
     *        A list of ARNs that specifies the assessment targets that are returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsResult withAssessmentTargetArns(String... assessmentTargetArns) {
        if (this.assessmentTargetArns == null) {
            setAssessmentTargetArns(new java.util.ArrayList<String>(assessmentTargetArns.length));
        }
        for (String ele : assessmentTargetArns) {
            this.assessmentTargetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs that specifies the assessment targets that are returned by the action.
     * </p>
     * 
     * @param assessmentTargetArns
     *        A list of ARNs that specifies the assessment targets that are returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsResult withAssessmentTargetArns(java.util.Collection<String> assessmentTargetArns) {
        setAssessmentTargetArns(assessmentTargetArns);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed, this parameter is present in the
     *         response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *         request. If there is no more data to be listed, this parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsResult withNextToken(String nextToken) {
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
        if (getAssessmentTargetArns() != null)
            sb.append("AssessmentTargetArns: ").append(getAssessmentTargetArns()).append(",");
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

        if (obj instanceof ListAssessmentTargetsResult == false)
            return false;
        ListAssessmentTargetsResult other = (ListAssessmentTargetsResult) obj;
        if (other.getAssessmentTargetArns() == null ^ this.getAssessmentTargetArns() == null)
            return false;
        if (other.getAssessmentTargetArns() != null && other.getAssessmentTargetArns().equals(this.getAssessmentTargetArns()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentTargetArns() == null) ? 0 : getAssessmentTargetArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentTargetsResult clone() {
        try {
            return (ListAssessmentTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
