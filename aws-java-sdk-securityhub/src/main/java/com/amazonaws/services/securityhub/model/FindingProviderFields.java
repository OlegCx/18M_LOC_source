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
 * In a <code>BatchImportFindings</code> request, finding providers use <code>FindingProviderFields</code> to provide
 * and update values for confidence, criticality, related findings, severity, and types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FindingProviderFields" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingProviderFields implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior
     * or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     */
    private Integer confidence;
    /**
     * <p>
     * The level of importance assigned to the resources associated with the finding.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     */
    private Integer criticality;
    /**
     * <p>
     * A list of findings that are related to the current finding.
     * </p>
     */
    private java.util.List<RelatedFinding> relatedFindings;
    /**
     * <p>
     * The severity of a finding.
     * </p>
     */
    private FindingProviderSeverity severity;
    /**
     * <p>
     * One or more finding types in the format of <code>namespace/category/classifier</code> that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive
     * Data Identifications
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior
     * or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @param confidence
     *        A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the
     *        behavior or issue that it was intended to identify.</p>
     *        <p>
     *        Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *        means 100 percent confidence.
     */

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior
     * or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @return A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the
     *         behavior or issue that it was intended to identify.</p>
     *         <p>
     *         Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *         means 100 percent confidence.
     */

    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior
     * or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @param confidence
     *        A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the
     *        behavior or issue that it was intended to identify.</p>
     *        <p>
     *        Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *        means 100 percent confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withConfidence(Integer confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The level of importance assigned to the resources associated with the finding.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @param criticality
     *        The level of importance assigned to the resources associated with the finding.</p>
     *        <p>
     *        A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *        the most critical resources.
     */

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    /**
     * <p>
     * The level of importance assigned to the resources associated with the finding.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @return The level of importance assigned to the resources associated with the finding.</p>
     *         <p>
     *         A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *         the most critical resources.
     */

    public Integer getCriticality() {
        return this.criticality;
    }

    /**
     * <p>
     * The level of importance assigned to the resources associated with the finding.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @param criticality
     *        The level of importance assigned to the resources associated with the finding.</p>
     *        <p>
     *        A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *        the most critical resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withCriticality(Integer criticality) {
        setCriticality(criticality);
        return this;
    }

    /**
     * <p>
     * A list of findings that are related to the current finding.
     * </p>
     * 
     * @return A list of findings that are related to the current finding.
     */

    public java.util.List<RelatedFinding> getRelatedFindings() {
        return relatedFindings;
    }

    /**
     * <p>
     * A list of findings that are related to the current finding.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the current finding.
     */

    public void setRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
        if (relatedFindings == null) {
            this.relatedFindings = null;
            return;
        }

        this.relatedFindings = new java.util.ArrayList<RelatedFinding>(relatedFindings);
    }

    /**
     * <p>
     * A list of findings that are related to the current finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedFindings(java.util.Collection)} or {@link #withRelatedFindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the current finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withRelatedFindings(RelatedFinding... relatedFindings) {
        if (this.relatedFindings == null) {
            setRelatedFindings(new java.util.ArrayList<RelatedFinding>(relatedFindings.length));
        }
        for (RelatedFinding ele : relatedFindings) {
            this.relatedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of findings that are related to the current finding.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the current finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
        setRelatedFindings(relatedFindings);
        return this;
    }

    /**
     * <p>
     * The severity of a finding.
     * </p>
     * 
     * @param severity
     *        The severity of a finding.
     */

    public void setSeverity(FindingProviderSeverity severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of a finding.
     * </p>
     * 
     * @return The severity of a finding.
     */

    public FindingProviderSeverity getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of a finding.
     * </p>
     * 
     * @param severity
     *        The severity of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withSeverity(FindingProviderSeverity severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of <code>namespace/category/classifier</code> that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive
     * Data Identifications
     * </p>
     * 
     * @return One or more finding types in the format of <code>namespace/category/classifier</code> that classify a
     *         finding.</p>
     *         <p>
     *         Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors |
     *         Sensitive Data Identifications
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * One or more finding types in the format of <code>namespace/category/classifier</code> that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive
     * Data Identifications
     * </p>
     * 
     * @param types
     *        One or more finding types in the format of <code>namespace/category/classifier</code> that classify a
     *        finding.</p>
     *        <p>
     *        Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors |
     *        Sensitive Data Identifications
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * One or more finding types in the format of <code>namespace/category/classifier</code> that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive
     * Data Identifications
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        One or more finding types in the format of <code>namespace/category/classifier</code> that classify a
     *        finding.</p>
     *        <p>
     *        Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors |
     *        Sensitive Data Identifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of <code>namespace/category/classifier</code> that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive
     * Data Identifications
     * </p>
     * 
     * @param types
     *        One or more finding types in the format of <code>namespace/category/classifier</code> that classify a
     *        finding.</p>
     *        <p>
     *        Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors |
     *        Sensitive Data Identifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderFields withTypes(java.util.Collection<String> types) {
        setTypes(types);
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getCriticality() != null)
            sb.append("Criticality: ").append(getCriticality()).append(",");
        if (getRelatedFindings() != null)
            sb.append("RelatedFindings: ").append(getRelatedFindings()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingProviderFields == false)
            return false;
        FindingProviderFields other = (FindingProviderFields) obj;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCriticality() == null ^ this.getCriticality() == null)
            return false;
        if (other.getCriticality() != null && other.getCriticality().equals(this.getCriticality()) == false)
            return false;
        if (other.getRelatedFindings() == null ^ this.getRelatedFindings() == null)
            return false;
        if (other.getRelatedFindings() != null && other.getRelatedFindings().equals(this.getRelatedFindings()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getCriticality() == null) ? 0 : getCriticality().hashCode());
        hashCode = prime * hashCode + ((getRelatedFindings() == null) ? 0 : getRelatedFindings().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        return hashCode;
    }

    @Override
    public FindingProviderFields clone() {
        try {
            return (FindingProviderFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FindingProviderFieldsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
