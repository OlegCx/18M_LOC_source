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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used as the request parameter in the <a>ListAssessmentTemplates</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentTemplateFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentTemplateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this
     * data type property must match the value of the <b>assessmentTemplateName</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     */
    private String namePattern;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type property must inclusively match any value
     * between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     */
    private DurationRange durationRange;
    /**
     * <p>
     * For a record to match a filter, the values that are specified for this data type property must be contained in
     * the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a> data type.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this
     * data type property must match the value of the <b>assessmentTemplateName</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param namePattern
     *        For a record to match a filter, an explicit value or a string that contains a wildcard that is specified
     *        for this data type property must match the value of the <b>assessmentTemplateName</b> property of the
     *        <a>AssessmentTemplate</a> data type.
     */

    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this
     * data type property must match the value of the <b>assessmentTemplateName</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, an explicit value or a string that contains a wildcard that is specified
     *         for this data type property must match the value of the <b>assessmentTemplateName</b> property of the
     *         <a>AssessmentTemplate</a> data type.
     */

    public String getNamePattern() {
        return this.namePattern;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this
     * data type property must match the value of the <b>assessmentTemplateName</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param namePattern
     *        For a record to match a filter, an explicit value or a string that contains a wildcard that is specified
     *        for this data type property must match the value of the <b>assessmentTemplateName</b> property of the
     *        <a>AssessmentTemplate</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplateFilter withNamePattern(String namePattern) {
        setNamePattern(namePattern);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type property must inclusively match any value
     * between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param durationRange
     *        For a record to match a filter, the value specified for this data type property must inclusively match any
     *        value between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     *        <a>AssessmentTemplate</a> data type.
     */

    public void setDurationRange(DurationRange durationRange) {
        this.durationRange = durationRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type property must inclusively match any value
     * between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data type property must inclusively match
     *         any value between the specified minimum and maximum values of the <b>durationInSeconds</b> property of
     *         the <a>AssessmentTemplate</a> data type.
     */

    public DurationRange getDurationRange() {
        return this.durationRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type property must inclusively match any value
     * between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     * <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param durationRange
     *        For a record to match a filter, the value specified for this data type property must inclusively match any
     *        value between the specified minimum and maximum values of the <b>durationInSeconds</b> property of the
     *        <a>AssessmentTemplate</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplateFilter withDurationRange(DurationRange durationRange) {
        setDurationRange(durationRange);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the values that are specified for this data type property must be contained in
     * the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the values that are specified for this data type property must be
     *         contained in the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a>
     *         data type.
     */

    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * For a record to match a filter, the values that are specified for this data type property must be contained in
     * the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the values that are specified for this data type property must be
     *        contained in the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a>
     *        data type.
     */

    public void setRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(rulesPackageArns);
    }

    /**
     * <p>
     * For a record to match a filter, the values that are specified for this data type property must be contained in
     * the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesPackageArns(java.util.Collection)} or {@link #withRulesPackageArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the values that are specified for this data type property must be
     *        contained in the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplateFilter withRulesPackageArns(String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the values that are specified for this data type property must be contained in
     * the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a> data type.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the values that are specified for this data type property must be
     *        contained in the list of values of the <b>rulesPackageArns</b> property of the <a>AssessmentTemplate</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplateFilter withRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
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
        if (getNamePattern() != null)
            sb.append("NamePattern: ").append(getNamePattern()).append(",");
        if (getDurationRange() != null)
            sb.append("DurationRange: ").append(getDurationRange()).append(",");
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: ").append(getRulesPackageArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentTemplateFilter == false)
            return false;
        AssessmentTemplateFilter other = (AssessmentTemplateFilter) obj;
        if (other.getNamePattern() == null ^ this.getNamePattern() == null)
            return false;
        if (other.getNamePattern() != null && other.getNamePattern().equals(this.getNamePattern()) == false)
            return false;
        if (other.getDurationRange() == null ^ this.getDurationRange() == null)
            return false;
        if (other.getDurationRange() != null && other.getDurationRange().equals(this.getDurationRange()) == false)
            return false;
        if (other.getRulesPackageArns() == null ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null && other.getRulesPackageArns().equals(this.getRulesPackageArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamePattern() == null) ? 0 : getNamePattern().hashCode());
        hashCode = prime * hashCode + ((getDurationRange() == null) ? 0 : getDurationRange().hashCode());
        hashCode = prime * hashCode + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentTemplateFilter clone() {
        try {
            return (AssessmentTemplateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentTemplateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
