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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of compliance based on either account ID or region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateConformancePackComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateConformancePackComplianceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns an <code>AggregateConformancePackComplianceCount</code> object.
     * </p>
     */
    private AggregateConformancePackComplianceCount complianceSummary;
    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * Returns an <code>AggregateConformancePackComplianceCount</code> object.
     * </p>
     * 
     * @param complianceSummary
     *        Returns an <code>AggregateConformancePackComplianceCount</code> object.
     */

    public void setComplianceSummary(AggregateConformancePackComplianceCount complianceSummary) {
        this.complianceSummary = complianceSummary;
    }

    /**
     * <p>
     * Returns an <code>AggregateConformancePackComplianceCount</code> object.
     * </p>
     * 
     * @return Returns an <code>AggregateConformancePackComplianceCount</code> object.
     */

    public AggregateConformancePackComplianceCount getComplianceSummary() {
        return this.complianceSummary;
    }

    /**
     * <p>
     * Returns an <code>AggregateConformancePackComplianceCount</code> object.
     * </p>
     * 
     * @param complianceSummary
     *        Returns an <code>AggregateConformancePackComplianceCount</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackComplianceSummary withComplianceSummary(AggregateConformancePackComplianceCount complianceSummary) {
        setComplianceSummary(complianceSummary);
        return this;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupName
     *        Groups the result based on AWS Account ID or AWS Region.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @return Groups the result based on AWS Account ID or AWS Region.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupName
     *        Groups the result based on AWS Account ID or AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackComplianceSummary withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getComplianceSummary() != null)
            sb.append("ComplianceSummary: ").append(getComplianceSummary()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateConformancePackComplianceSummary == false)
            return false;
        AggregateConformancePackComplianceSummary other = (AggregateConformancePackComplianceSummary) obj;
        if (other.getComplianceSummary() == null ^ this.getComplianceSummary() == null)
            return false;
        if (other.getComplianceSummary() != null && other.getComplianceSummary().equals(this.getComplianceSummary()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceSummary() == null) ? 0 : getComplianceSummary().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public AggregateConformancePackComplianceSummary clone() {
        try {
            return (AggregateConformancePackComplianceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateConformancePackComplianceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
