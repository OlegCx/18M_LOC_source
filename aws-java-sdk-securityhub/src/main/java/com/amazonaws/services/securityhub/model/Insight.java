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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a Security Hub insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Insight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Insight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     */
    private String insightArn;
    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more attributes used to filter the findings included in the insight. The insight only includes findings
     * that match the criteria defined in the filters.
     * </p>
     */
    private AwsSecurityFindingFilters filters;
    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group the matching findings, and identifies
     * the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then
     * the insight produces a list of resource identifiers.
     * </p>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * 
     * @param insightArn
     *        The ARN of a Security Hub insight.
     */

    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * 
     * @return The ARN of a Security Hub insight.
     */

    public String getInsightArn() {
        return this.insightArn;
    }

    /**
     * <p>
     * The ARN of a Security Hub insight.
     * </p>
     * 
     * @param insightArn
     *        The ARN of a Security Hub insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightArn(String insightArn) {
        setInsightArn(insightArn);
        return this;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * 
     * @param name
     *        The name of a Security Hub insight.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * 
     * @return The name of a Security Hub insight.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a Security Hub insight.
     * </p>
     * 
     * @param name
     *        The name of a Security Hub insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the insight. The insight only includes findings
     * that match the criteria defined in the filters.
     * </p>
     * 
     * @param filters
     *        One or more attributes used to filter the findings included in the insight. The insight only includes
     *        findings that match the criteria defined in the filters.
     */

    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the insight. The insight only includes findings
     * that match the criteria defined in the filters.
     * </p>
     * 
     * @return One or more attributes used to filter the findings included in the insight. The insight only includes
     *         findings that match the criteria defined in the filters.
     */

    public AwsSecurityFindingFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * One or more attributes used to filter the findings included in the insight. The insight only includes findings
     * that match the criteria defined in the filters.
     * </p>
     * 
     * @param filters
     *        One or more attributes used to filter the findings included in the insight. The insight only includes
     *        findings that match the criteria defined in the filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withFilters(AwsSecurityFindingFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group the matching findings, and identifies
     * the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then
     * the insight produces a list of resource identifiers.
     * </p>
     * 
     * @param groupByAttribute
     *        The grouping attribute for the insight's findings. Indicates how to group the matching findings, and
     *        identifies the type of item that the insight applies to. For example, if an insight is grouped by resource
     *        identifier, then the insight produces a list of resource identifiers.
     */

    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group the matching findings, and identifies
     * the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then
     * the insight produces a list of resource identifiers.
     * </p>
     * 
     * @return The grouping attribute for the insight's findings. Indicates how to group the matching findings, and
     *         identifies the type of item that the insight applies to. For example, if an insight is grouped by
     *         resource identifier, then the insight produces a list of resource identifiers.
     */

    public String getGroupByAttribute() {
        return this.groupByAttribute;
    }

    /**
     * <p>
     * The grouping attribute for the insight's findings. Indicates how to group the matching findings, and identifies
     * the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then
     * the insight produces a list of resource identifiers.
     * </p>
     * 
     * @param groupByAttribute
     *        The grouping attribute for the insight's findings. Indicates how to group the matching findings, and
     *        identifies the type of item that the insight applies to. For example, if an insight is grouped by resource
     *        identifier, then the insight produces a list of resource identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withGroupByAttribute(String groupByAttribute) {
        setGroupByAttribute(groupByAttribute);
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
        if (getInsightArn() != null)
            sb.append("InsightArn: ").append(getInsightArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getGroupByAttribute() != null)
            sb.append("GroupByAttribute: ").append(getGroupByAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Insight == false)
            return false;
        Insight other = (Insight) obj;
        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupByAttribute() == null ^ this.getGroupByAttribute() == null)
            return false;
        if (other.getGroupByAttribute() != null && other.getGroupByAttribute().equals(this.getGroupByAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Insight clone() {
        try {
            return (Insight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.InsightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
