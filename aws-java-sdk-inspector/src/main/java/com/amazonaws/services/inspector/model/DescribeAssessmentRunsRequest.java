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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentRuns" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssessmentRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment run that you want to describe.
     * </p>
     */
    private java.util.List<String> assessmentRunArns;

    /**
     * <p>
     * The ARN that specifies the assessment run that you want to describe.
     * </p>
     * 
     * @return The ARN that specifies the assessment run that you want to describe.
     */

    public java.util.List<String> getAssessmentRunArns() {
        return assessmentRunArns;
    }

    /**
     * <p>
     * The ARN that specifies the assessment run that you want to describe.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN that specifies the assessment run that you want to describe.
     */

    public void setAssessmentRunArns(java.util.Collection<String> assessmentRunArns) {
        if (assessmentRunArns == null) {
            this.assessmentRunArns = null;
            return;
        }

        this.assessmentRunArns = new java.util.ArrayList<String>(assessmentRunArns);
    }

    /**
     * <p>
     * The ARN that specifies the assessment run that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentRunArns(java.util.Collection)} or {@link #withAssessmentRunArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN that specifies the assessment run that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentRunsRequest withAssessmentRunArns(String... assessmentRunArns) {
        if (this.assessmentRunArns == null) {
            setAssessmentRunArns(new java.util.ArrayList<String>(assessmentRunArns.length));
        }
        for (String ele : assessmentRunArns) {
            this.assessmentRunArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN that specifies the assessment run that you want to describe.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN that specifies the assessment run that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentRunsRequest withAssessmentRunArns(java.util.Collection<String> assessmentRunArns) {
        setAssessmentRunArns(assessmentRunArns);
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
        if (getAssessmentRunArns() != null)
            sb.append("AssessmentRunArns: ").append(getAssessmentRunArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssessmentRunsRequest == false)
            return false;
        DescribeAssessmentRunsRequest other = (DescribeAssessmentRunsRequest) obj;
        if (other.getAssessmentRunArns() == null ^ this.getAssessmentRunArns() == null)
            return false;
        if (other.getAssessmentRunArns() != null && other.getAssessmentRunArns().equals(this.getAssessmentRunArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentRunArns() == null) ? 0 : getAssessmentRunArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssessmentRunsRequest clone() {
        return (DescribeAssessmentRunsRequest) super.clone();
    }

}
