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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDetectorVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector under which you want to create a new version.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The description of the detector version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Sagemaker model endpoints to include in the detector version.
     * </p>
     */
    private java.util.List<String> externalModelEndpoints;
    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     */
    private java.util.List<ModelVersion> modelVersions;
    /**
     * <p>
     * The rule execution mode for the rules included in the detector version.
     * </p>
     * <p>
     * You can define and edit the rule mode at the detector version level, when it is in draft status.
     * </p>
     * <p>
     * If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to last,
     * stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the outcomes for
     * all matched rules.
     * </p>
     * <p>
     * The default behavior is <code>FIRST_MATCHED</code>.
     * </p>
     */
    private String ruleExecutionMode;
    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the detector under which you want to create a new version.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector under which you want to create a new version.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector under which you want to create a new version.
     * </p>
     * 
     * @return The ID of the detector under which you want to create a new version.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector under which you want to create a new version.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector under which you want to create a new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The description of the detector version.
     * </p>
     * 
     * @param description
     *        The description of the detector version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the detector version.
     * </p>
     * 
     * @return The description of the detector version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the detector version.
     * </p>
     * 
     * @param description
     *        The description of the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Sagemaker model endpoints to include in the detector version.
     * </p>
     * 
     * @return The Amazon Sagemaker model endpoints to include in the detector version.
     */

    public java.util.List<String> getExternalModelEndpoints() {
        return externalModelEndpoints;
    }

    /**
     * <p>
     * The Amazon Sagemaker model endpoints to include in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon Sagemaker model endpoints to include in the detector version.
     */

    public void setExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        if (externalModelEndpoints == null) {
            this.externalModelEndpoints = null;
            return;
        }

        this.externalModelEndpoints = new java.util.ArrayList<String>(externalModelEndpoints);
    }

    /**
     * <p>
     * The Amazon Sagemaker model endpoints to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalModelEndpoints(java.util.Collection)} or
     * {@link #withExternalModelEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon Sagemaker model endpoints to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withExternalModelEndpoints(String... externalModelEndpoints) {
        if (this.externalModelEndpoints == null) {
            setExternalModelEndpoints(new java.util.ArrayList<String>(externalModelEndpoints.length));
        }
        for (String ele : externalModelEndpoints) {
            this.externalModelEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Sagemaker model endpoints to include in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon Sagemaker model endpoints to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        setExternalModelEndpoints(externalModelEndpoints);
        return this;
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * 
     * @return The rules to include in the detector version.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * 
     * @return The model versions to include in the detector version.
     */

    public java.util.List<ModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
     */

    public void setModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        if (modelVersions == null) {
            this.modelVersions = null;
            return;
        }

        this.modelVersions = new java.util.ArrayList<ModelVersion>(modelVersions);
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVersions(java.util.Collection)} or {@link #withModelVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withModelVersions(ModelVersion... modelVersions) {
        if (this.modelVersions == null) {
            setModelVersions(new java.util.ArrayList<ModelVersion>(modelVersions.length));
        }
        for (ModelVersion ele : modelVersions) {
            this.modelVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        setModelVersions(modelVersions);
        return this;
    }

    /**
     * <p>
     * The rule execution mode for the rules included in the detector version.
     * </p>
     * <p>
     * You can define and edit the rule mode at the detector version level, when it is in draft status.
     * </p>
     * <p>
     * If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to last,
     * stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the outcomes for
     * all matched rules.
     * </p>
     * <p>
     * The default behavior is <code>FIRST_MATCHED</code>.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The rule execution mode for the rules included in the detector version.</p>
     *        <p>
     *        You can define and edit the rule mode at the detector version level, when it is in draft status.
     *        </p>
     *        <p>
     *        If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to
     *        last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that
     *        single rule.
     *        </p>
     *        <p>
     *        If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the
     *        outcomes for all matched rules.
     *        </p>
     *        <p>
     *        The default behavior is <code>FIRST_MATCHED</code>.
     * @see RuleExecutionMode
     */

    public void setRuleExecutionMode(String ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode;
    }

    /**
     * <p>
     * The rule execution mode for the rules included in the detector version.
     * </p>
     * <p>
     * You can define and edit the rule mode at the detector version level, when it is in draft status.
     * </p>
     * <p>
     * If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to last,
     * stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the outcomes for
     * all matched rules.
     * </p>
     * <p>
     * The default behavior is <code>FIRST_MATCHED</code>.
     * </p>
     * 
     * @return The rule execution mode for the rules included in the detector version.</p>
     *         <p>
     *         You can define and edit the rule mode at the detector version level, when it is in draft status.
     *         </p>
     *         <p>
     *         If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to
     *         last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that
     *         single rule.
     *         </p>
     *         <p>
     *         If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the
     *         outcomes for all matched rules.
     *         </p>
     *         <p>
     *         The default behavior is <code>FIRST_MATCHED</code>.
     * @see RuleExecutionMode
     */

    public String getRuleExecutionMode() {
        return this.ruleExecutionMode;
    }

    /**
     * <p>
     * The rule execution mode for the rules included in the detector version.
     * </p>
     * <p>
     * You can define and edit the rule mode at the detector version level, when it is in draft status.
     * </p>
     * <p>
     * If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to last,
     * stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the outcomes for
     * all matched rules.
     * </p>
     * <p>
     * The default behavior is <code>FIRST_MATCHED</code>.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The rule execution mode for the rules included in the detector version.</p>
     *        <p>
     *        You can define and edit the rule mode at the detector version level, when it is in draft status.
     *        </p>
     *        <p>
     *        If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to
     *        last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that
     *        single rule.
     *        </p>
     *        <p>
     *        If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the
     *        outcomes for all matched rules.
     *        </p>
     *        <p>
     *        The default behavior is <code>FIRST_MATCHED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionMode
     */

    public CreateDetectorVersionRequest withRuleExecutionMode(String ruleExecutionMode) {
        setRuleExecutionMode(ruleExecutionMode);
        return this;
    }

    /**
     * <p>
     * The rule execution mode for the rules included in the detector version.
     * </p>
     * <p>
     * You can define and edit the rule mode at the detector version level, when it is in draft status.
     * </p>
     * <p>
     * If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to last,
     * stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the outcomes for
     * all matched rules.
     * </p>
     * <p>
     * The default behavior is <code>FIRST_MATCHED</code>.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The rule execution mode for the rules included in the detector version.</p>
     *        <p>
     *        You can define and edit the rule mode at the detector version level, when it is in draft status.
     *        </p>
     *        <p>
     *        If you specify <code>FIRST_MATCHED</code>, Amazon Fraud Detector evaluates rules sequentially, first to
     *        last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that
     *        single rule.
     *        </p>
     *        <p>
     *        If you specifiy <code>ALL_MATCHED</code>, Amazon Fraud Detector evaluates all rules and returns the
     *        outcomes for all matched rules.
     *        </p>
     *        <p>
     *        The default behavior is <code>FIRST_MATCHED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionMode
     */

    public CreateDetectorVersionRequest withRuleExecutionMode(RuleExecutionMode ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode.toString();
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExternalModelEndpoints() != null)
            sb.append("ExternalModelEndpoints: ").append(getExternalModelEndpoints()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getModelVersions() != null)
            sb.append("ModelVersions: ").append(getModelVersions()).append(",");
        if (getRuleExecutionMode() != null)
            sb.append("RuleExecutionMode: ").append(getRuleExecutionMode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorVersionRequest == false)
            return false;
        CreateDetectorVersionRequest other = (CreateDetectorVersionRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExternalModelEndpoints() == null ^ this.getExternalModelEndpoints() == null)
            return false;
        if (other.getExternalModelEndpoints() != null && other.getExternalModelEndpoints().equals(this.getExternalModelEndpoints()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        if (other.getRuleExecutionMode() == null ^ this.getRuleExecutionMode() == null)
            return false;
        if (other.getRuleExecutionMode() != null && other.getRuleExecutionMode().equals(this.getRuleExecutionMode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExternalModelEndpoints() == null) ? 0 : getExternalModelEndpoints().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        hashCode = prime * hashCode + ((getRuleExecutionMode() == null) ? 0 : getRuleExecutionMode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDetectorVersionRequest clone() {
        return (CreateDetectorVersionRequest) super.clone();
    }

}
