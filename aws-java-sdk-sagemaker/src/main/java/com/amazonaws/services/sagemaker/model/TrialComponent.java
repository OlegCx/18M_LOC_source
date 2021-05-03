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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a trial component as returned by the <a>Search</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trial component.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     */
    private String trialComponentArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of the component.
     * </p>
     */
    private TrialComponentSource source;

    private TrialComponentStatus status;
    /**
     * <p>
     * When the component started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the component ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * When the component was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;
    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;
    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;
    /**
     * <p>
     * The metrics for the component.
     * </p>
     */
    private java.util.List<TrialComponentMetricSummary> metrics;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * Details of the source of the component.
     * </p>
     */
    private TrialComponentSourceDetail sourceDetail;
    /**
     * <p>
     * The list of tags that are associated with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An array of the parents of the component. A parent is a trial the component is associated with and the experiment
     * the trial is part of. A component might not have any parents.
     * </p>
     */
    private java.util.List<Parent> parents;

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @return The name of the trial component.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @return The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *         <code>TrialComponentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     */

    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial component.
     */

    public String getTrialComponentArn() {
        return this.trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withTrialComponentArn(String trialComponentArn) {
        setTrialComponentArn(trialComponentArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of the component.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) and job type of the source of the component.
     */

    public void setSource(TrialComponentSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) and job type of the source of the component.
     */

    public TrialComponentSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of the component.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) and job type of the source of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withSource(TrialComponentSource source) {
        setSource(source);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * @return
     */

    public TrialComponentStatus getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withStatus(TrialComponentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @return When the component started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @return When the component ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @return When the component was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @return When the component was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @return The hyperparameters of the component.
     */

    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters of the component.
     */

    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see TrialComponent#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent addParametersEntry(String key, TrialComponentParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TrialComponentParameterValue>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @return The input artifacts of the component.
     */

    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts of the component.
     */

    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * Add a single InputArtifacts entry
     *
     * @see TrialComponent#withInputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent addInputArtifactsEntry(String key, TrialComponentArtifact value) {
        if (null == this.inputArtifacts) {
            this.inputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.inputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputArtifacts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @return The output artifacts of the component.
     */

    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts of the component.
     */

    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * Add a single OutputArtifacts entry
     *
     * @see TrialComponent#withOutputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent addOutputArtifactsEntry(String key, TrialComponentArtifact value) {
        if (null == this.outputArtifacts) {
            this.outputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.outputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OutputArtifacts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @return The metrics for the component.
     */

    public java.util.List<TrialComponentMetricSummary> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     */

    public void setMetrics(java.util.Collection<TrialComponentMetricSummary> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<TrialComponentMetricSummary>(metrics);
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withMetrics(TrialComponentMetricSummary... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<TrialComponentMetricSummary>(metrics.length));
        }
        for (TrialComponentMetricSummary ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withMetrics(java.util.Collection<TrialComponentMetricSummary> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * Details of the source of the component.
     * </p>
     * 
     * @param sourceDetail
     *        Details of the source of the component.
     */

    public void setSourceDetail(TrialComponentSourceDetail sourceDetail) {
        this.sourceDetail = sourceDetail;
    }

    /**
     * <p>
     * Details of the source of the component.
     * </p>
     * 
     * @return Details of the source of the component.
     */

    public TrialComponentSourceDetail getSourceDetail() {
        return this.sourceDetail;
    }

    /**
     * <p>
     * Details of the source of the component.
     * </p>
     * 
     * @param sourceDetail
     *        Details of the source of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withSourceDetail(TrialComponentSourceDetail sourceDetail) {
        setSourceDetail(sourceDetail);
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return The list of tags that are associated with the component. You can use <a>Search</a> API to search on the
     *         tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags that are associated with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the component. You can use <a>Search</a> API to search on the
     *        tags.
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
     * The list of tags that are associated with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the component. You can use <a>Search</a> API to search on the
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withTags(Tag... tags) {
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
     * The list of tags that are associated with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the component. You can use <a>Search</a> API to search on the
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of the parents of the component. A parent is a trial the component is associated with and the experiment
     * the trial is part of. A component might not have any parents.
     * </p>
     * 
     * @return An array of the parents of the component. A parent is a trial the component is associated with and the
     *         experiment the trial is part of. A component might not have any parents.
     */

    public java.util.List<Parent> getParents() {
        return parents;
    }

    /**
     * <p>
     * An array of the parents of the component. A parent is a trial the component is associated with and the experiment
     * the trial is part of. A component might not have any parents.
     * </p>
     * 
     * @param parents
     *        An array of the parents of the component. A parent is a trial the component is associated with and the
     *        experiment the trial is part of. A component might not have any parents.
     */

    public void setParents(java.util.Collection<Parent> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<Parent>(parents);
    }

    /**
     * <p>
     * An array of the parents of the component. A parent is a trial the component is associated with and the experiment
     * the trial is part of. A component might not have any parents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParents(java.util.Collection)} or {@link #withParents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parents
     *        An array of the parents of the component. A parent is a trial the component is associated with and the
     *        experiment the trial is part of. A component might not have any parents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withParents(Parent... parents) {
        if (this.parents == null) {
            setParents(new java.util.ArrayList<Parent>(parents.length));
        }
        for (Parent ele : parents) {
            this.parents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the parents of the component. A parent is a trial the component is associated with and the experiment
     * the trial is part of. A component might not have any parents.
     * </p>
     * 
     * @param parents
     *        An array of the parents of the component. A parent is a trial the component is associated with and the
     *        experiment the trial is part of. A component might not have any parents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponent withParents(java.util.Collection<Parent> parents) {
        setParents(parents);
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: ").append(getTrialComponentArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getSourceDetail() != null)
            sb.append("SourceDetail: ").append(getSourceDetail()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getParents() != null)
            sb.append("Parents: ").append(getParents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponent == false)
            return false;
        TrialComponent other = (TrialComponent) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getSourceDetail() == null ^ this.getSourceDetail() == null)
            return false;
        if (other.getSourceDetail() != null && other.getSourceDetail().equals(this.getSourceDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceDetail() == null) ? 0 : getSourceDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponent clone() {
        try {
            return (TrialComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
