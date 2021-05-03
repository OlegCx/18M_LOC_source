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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateExclusionsPreview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExclusionsPreviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment template for which you want to create an exclusions preview.
     * </p>
     */
    private String assessmentTemplateArn;

    /**
     * <p>
     * The ARN that specifies the assessment template for which you want to create an exclusions preview.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN that specifies the assessment template for which you want to create an exclusions preview.
     */

    public void setAssessmentTemplateArn(String assessmentTemplateArn) {
        this.assessmentTemplateArn = assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment template for which you want to create an exclusions preview.
     * </p>
     * 
     * @return The ARN that specifies the assessment template for which you want to create an exclusions preview.
     */

    public String getAssessmentTemplateArn() {
        return this.assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment template for which you want to create an exclusions preview.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN that specifies the assessment template for which you want to create an exclusions preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExclusionsPreviewRequest withAssessmentTemplateArn(String assessmentTemplateArn) {
        setAssessmentTemplateArn(assessmentTemplateArn);
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
        if (getAssessmentTemplateArn() != null)
            sb.append("AssessmentTemplateArn: ").append(getAssessmentTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExclusionsPreviewRequest == false)
            return false;
        CreateExclusionsPreviewRequest other = (CreateExclusionsPreviewRequest) obj;
        if (other.getAssessmentTemplateArn() == null ^ this.getAssessmentTemplateArn() == null)
            return false;
        if (other.getAssessmentTemplateArn() != null && other.getAssessmentTemplateArn().equals(this.getAssessmentTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTemplateArn() == null) ? 0 : getAssessmentTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateExclusionsPreviewRequest clone() {
        return (CreateExclusionsPreviewRequest) super.clone();
    }

}
