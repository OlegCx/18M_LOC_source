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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The branch for an Amplify app, which maps to a third-party repository branch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Branch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Branch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     * </p>
     */
    private String branchArn;
    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * The display name for the branch. This is used as the default domain prefix.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     */
    private Boolean enableNotification;
    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify app.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     */
    private Boolean enableAutoBuild;
    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     */
    private java.util.List<String> customDomains;
    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     */
    private String activeJobId;
    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     */
    private String totalNumberOfJobs;
    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * Enables performance mode for the branch.
     * </p>
     * <p>
     * Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer
     * interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to
     * roll out.
     * </p>
     */
    private Boolean enablePerformanceMode;
    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     */
    private String thumbnailUrl;
    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify app.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     */
    private String ttl;
    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     */
    private java.util.List<String> associatedResources;
    /**
     * <p>
     * Enables pull request previews for the branch.
     * </p>
     */
    private Boolean enablePullRequestPreview;
    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     */
    private String pullRequestEnvironmentName;
    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     */
    private String destinationBranch;
    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     */
    private String sourceBranch;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * </p>
     */
    private String backendEnvironmentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchArn
     *        The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     */

    public void setBranchArn(String branchArn) {
        this.branchArn = branchArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     */

    public String getBranchArn() {
        return this.branchArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchArn
     *        The Amazon Resource Name (ARN) for a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBranchArn(String branchArn) {
        setBranchArn(branchArn);
        return this;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name for the branch that is part of an Amplify app.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * 
     * @return The name for the branch that is part of an Amplify app.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name for the branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param description
     *        The description for the branch that is part of an Amplify app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * 
     * @return The description for the branch that is part of an Amplify app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param description
     *        The description for the branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     * 
     * @return The tag for the branch of an Amplify app.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     * 
     * @param tags
     *        The tag for the branch of an Amplify app.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     * 
     * @param tags
     *        The tag for the branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Branch#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Branch addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param stage
     *        The current stage for the branch that is part of an Amplify app.
     * @see Stage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * 
     * @return The current stage for the branch that is part of an Amplify app.
     * @see Stage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param stage
     *        The current stage for the branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public Branch withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * 
     * @param stage
     *        The current stage for the branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public Branch withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain prefix.
     * </p>
     * 
     * @param displayName
     *        The display name for the branch. This is used as the default domain prefix.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain prefix.
     * </p>
     * 
     * @return The display name for the branch. This is used as the default domain prefix.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain prefix.
     * </p>
     * 
     * @param displayName
     *        The display name for the branch. This is used as the default domain prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for a branch that is part of an Amplify app.
     */

    public void setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return Enables notifications for a branch that is part of an Amplify app.
     */

    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableNotification(Boolean enableNotification) {
        setEnableNotification(enableNotification);
        return this;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return Enables notifications for a branch that is part of an Amplify app.
     */

    public Boolean isEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param createTime
     *        The creation date and time for a branch that is part of an Amplify app.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return The creation date and time for a branch that is part of an Amplify app.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param createTime
     *        The creation date and time for a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param updateTime
     *        The last updated date and time for a branch that is part of an Amplify app.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return The last updated date and time for a branch that is part of an Amplify app.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param updateTime
     *        The last updated date and time for a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     * 
     * @return The environment variables specific to a branch of an Amplify app.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables specific to a branch of an Amplify app.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables specific to a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see Branch#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Branch addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto-building on push for a branch of an Amplify app.
     */

    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     * 
     * @return Enables auto-building on push for a branch of an Amplify app.
     */

    public Boolean getEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto-building on push for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableAutoBuild(Boolean enableAutoBuild) {
        setEnableAutoBuild(enableAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     * 
     * @return Enables auto-building on push for a branch of an Amplify app.
     */

    public Boolean isEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * 
     * @return The custom domains for a branch of an Amplify app.
     */

    public java.util.List<String> getCustomDomains() {
        return customDomains;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * 
     * @param customDomains
     *        The custom domains for a branch of an Amplify app.
     */

    public void setCustomDomains(java.util.Collection<String> customDomains) {
        if (customDomains == null) {
            this.customDomains = null;
            return;
        }

        this.customDomains = new java.util.ArrayList<String>(customDomains);
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDomains(java.util.Collection)} or {@link #withCustomDomains(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customDomains
     *        The custom domains for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCustomDomains(String... customDomains) {
        if (this.customDomains == null) {
            setCustomDomains(new java.util.ArrayList<String>(customDomains.length));
        }
        for (String ele : customDomains) {
            this.customDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * 
     * @param customDomains
     *        The custom domains for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCustomDomains(java.util.Collection<String> customDomains) {
        setCustomDomains(customDomains);
        return this;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * 
     * @param framework
     *        The framework for a branch of an Amplify app.
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * 
     * @return The framework for a branch of an Amplify app.
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * 
     * @param framework
     *        The framework for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * 
     * @param activeJobId
     *        The ID of the active job for a branch of an Amplify app.
     */

    public void setActiveJobId(String activeJobId) {
        this.activeJobId = activeJobId;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * 
     * @return The ID of the active job for a branch of an Amplify app.
     */

    public String getActiveJobId() {
        return this.activeJobId;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * 
     * @param activeJobId
     *        The ID of the active job for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withActiveJobId(String activeJobId) {
        setActiveJobId(activeJobId);
        return this;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * 
     * @param totalNumberOfJobs
     *        The total number of jobs that are part of an Amplify app.
     */

    public void setTotalNumberOfJobs(String totalNumberOfJobs) {
        this.totalNumberOfJobs = totalNumberOfJobs;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * 
     * @return The total number of jobs that are part of an Amplify app.
     */

    public String getTotalNumberOfJobs() {
        return this.totalNumberOfJobs;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * 
     * @param totalNumberOfJobs
     *        The total number of jobs that are part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTotalNumberOfJobs(String totalNumberOfJobs) {
        setTotalNumberOfJobs(totalNumberOfJobs);
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables basic authorization for a branch of an Amplify app.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     * 
     * @return Enables basic authorization for a branch of an Amplify app.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables basic authorization for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     * 
     * @return Enables basic authorization for a branch of an Amplify app.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables performance mode for the branch.
     * </p>
     * <p>
     * Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer
     * interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to
     * roll out.
     * </p>
     * 
     * @param enablePerformanceMode
     *        Enables performance mode for the branch.</p>
     *        <p>
     *        Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a
     *        longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10
     *        minutes to roll out.
     */

    public void setEnablePerformanceMode(Boolean enablePerformanceMode) {
        this.enablePerformanceMode = enablePerformanceMode;
    }

    /**
     * <p>
     * Enables performance mode for the branch.
     * </p>
     * <p>
     * Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer
     * interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to
     * roll out.
     * </p>
     * 
     * @return Enables performance mode for the branch.</p>
     *         <p>
     *         Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a
     *         longer interval. When performance mode is enabled, hosting configuration or code changes can take up to
     *         10 minutes to roll out.
     */

    public Boolean getEnablePerformanceMode() {
        return this.enablePerformanceMode;
    }

    /**
     * <p>
     * Enables performance mode for the branch.
     * </p>
     * <p>
     * Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer
     * interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to
     * roll out.
     * </p>
     * 
     * @param enablePerformanceMode
     *        Enables performance mode for the branch.</p>
     *        <p>
     *        Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a
     *        longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10
     *        minutes to roll out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnablePerformanceMode(Boolean enablePerformanceMode) {
        setEnablePerformanceMode(enablePerformanceMode);
        return this;
    }

    /**
     * <p>
     * Enables performance mode for the branch.
     * </p>
     * <p>
     * Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer
     * interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to
     * roll out.
     * </p>
     * 
     * @return Enables performance mode for the branch.</p>
     *         <p>
     *         Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a
     *         longer interval. When performance mode is enabled, hosting configuration or code changes can take up to
     *         10 minutes to roll out.
     */

    public Boolean isEnablePerformanceMode() {
        return this.enablePerformanceMode;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * 
     * @param thumbnailUrl
     *        The thumbnail URL for the branch of an Amplify app.
     */

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * 
     * @return The thumbnail URL for the branch of an Amplify app.
     */

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * 
     * @param thumbnailUrl
     *        The thumbnail URL for the branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withThumbnailUrl(String thumbnailUrl) {
        setThumbnailUrl(thumbnailUrl);
        return this;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The basic authorization credentials for a branch of an Amplify app.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * 
     * @return The basic authorization credentials for a branch of an Amplify app.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The basic authorization credentials for a branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify app.
     * </p>
     * 
     * @param buildSpec
     *        The build specification (build spec) content for the branch of an Amplify app.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify app.
     * </p>
     * 
     * @return The build specification (build spec) content for the branch of an Amplify app.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify app.
     * </p>
     * 
     * @param buildSpec
     *        The build specification (build spec) content for the branch of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content Time to Live (TTL) for the website in seconds.
     */

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     * 
     * @return The content Time to Live (TTL) for the website in seconds.
     */

    public String getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content Time to Live (TTL) for the website in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTtl(String ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * 
     * @return A list of custom resources that are linked to this branch.
     */

    public java.util.List<String> getAssociatedResources() {
        return associatedResources;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * 
     * @param associatedResources
     *        A list of custom resources that are linked to this branch.
     */

    public void setAssociatedResources(java.util.Collection<String> associatedResources) {
        if (associatedResources == null) {
            this.associatedResources = null;
            return;
        }

        this.associatedResources = new java.util.ArrayList<String>(associatedResources);
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedResources(java.util.Collection)} or {@link #withAssociatedResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedResources
     *        A list of custom resources that are linked to this branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withAssociatedResources(String... associatedResources) {
        if (this.associatedResources == null) {
            setAssociatedResources(new java.util.ArrayList<String>(associatedResources.length));
        }
        for (String ele : associatedResources) {
            this.associatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * 
     * @param associatedResources
     *        A list of custom resources that are linked to this branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withAssociatedResources(java.util.Collection<String> associatedResources) {
        setAssociatedResources(associatedResources);
        return this;
    }

    /**
     * <p>
     * Enables pull request previews for the branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables pull request previews for the branch.
     */

    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request previews for the branch.
     * </p>
     * 
     * @return Enables pull request previews for the branch.
     */

    public Boolean getEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request previews for the branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables pull request previews for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        setEnablePullRequestPreview(enablePullRequestPreview);
        return this;
    }

    /**
     * <p>
     * Enables pull request previews for the branch.
     * </p>
     * 
     * @return Enables pull request previews for the branch.
     */

    public Boolean isEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify environment name for the pull request.
     */

    public void setPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * 
     * @return The Amplify environment name for the pull request.
     */

    public String getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify environment name for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        setPullRequestEnvironmentName(pullRequestEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * 
     * @param destinationBranch
     *        The destination branch if the branch is a pull request branch.
     */

    public void setDestinationBranch(String destinationBranch) {
        this.destinationBranch = destinationBranch;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * 
     * @return The destination branch if the branch is a pull request branch.
     */

    public String getDestinationBranch() {
        return this.destinationBranch;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * 
     * @param destinationBranch
     *        The destination branch if the branch is a pull request branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDestinationBranch(String destinationBranch) {
        setDestinationBranch(destinationBranch);
        return this;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * 
     * @param sourceBranch
     *        The source branch if the branch is a pull request branch.
     */

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * 
     * @return The source branch if the branch is a pull request branch.
     */

    public String getSourceBranch() {
        return this.sourceBranch;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * 
     * @param sourceBranch
     *        The source branch if the branch is a pull request branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withSourceBranch(String sourceBranch) {
        setSourceBranch(sourceBranch);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     */

    public void setBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     */

    public String getBackendEnvironmentArn() {
        return this.backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBackendEnvironmentArn(String backendEnvironmentArn) {
        setBackendEnvironmentArn(backendEnvironmentArn);
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
        if (getBranchArn() != null)
            sb.append("BranchArn: ").append(getBranchArn()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEnableNotification() != null)
            sb.append("EnableNotification: ").append(getEnableNotification()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getEnableAutoBuild() != null)
            sb.append("EnableAutoBuild: ").append(getEnableAutoBuild()).append(",");
        if (getCustomDomains() != null)
            sb.append("CustomDomains: ").append(getCustomDomains()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getActiveJobId() != null)
            sb.append("ActiveJobId: ").append(getActiveJobId()).append(",");
        if (getTotalNumberOfJobs() != null)
            sb.append("TotalNumberOfJobs: ").append(getTotalNumberOfJobs()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getEnablePerformanceMode() != null)
            sb.append("EnablePerformanceMode: ").append(getEnablePerformanceMode()).append(",");
        if (getThumbnailUrl() != null)
            sb.append("ThumbnailUrl: ").append(getThumbnailUrl()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getAssociatedResources() != null)
            sb.append("AssociatedResources: ").append(getAssociatedResources()).append(",");
        if (getEnablePullRequestPreview() != null)
            sb.append("EnablePullRequestPreview: ").append(getEnablePullRequestPreview()).append(",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("PullRequestEnvironmentName: ").append(getPullRequestEnvironmentName()).append(",");
        if (getDestinationBranch() != null)
            sb.append("DestinationBranch: ").append(getDestinationBranch()).append(",");
        if (getSourceBranch() != null)
            sb.append("SourceBranch: ").append(getSourceBranch()).append(",");
        if (getBackendEnvironmentArn() != null)
            sb.append("BackendEnvironmentArn: ").append(getBackendEnvironmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Branch == false)
            return false;
        Branch other = (Branch) obj;
        if (other.getBranchArn() == null ^ this.getBranchArn() == null)
            return false;
        if (other.getBranchArn() != null && other.getBranchArn().equals(this.getBranchArn()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnableNotification() == null ^ this.getEnableNotification() == null)
            return false;
        if (other.getEnableNotification() != null && other.getEnableNotification().equals(this.getEnableNotification()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getCustomDomains() == null ^ this.getCustomDomains() == null)
            return false;
        if (other.getCustomDomains() != null && other.getCustomDomains().equals(this.getCustomDomains()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getActiveJobId() == null ^ this.getActiveJobId() == null)
            return false;
        if (other.getActiveJobId() != null && other.getActiveJobId().equals(this.getActiveJobId()) == false)
            return false;
        if (other.getTotalNumberOfJobs() == null ^ this.getTotalNumberOfJobs() == null)
            return false;
        if (other.getTotalNumberOfJobs() != null && other.getTotalNumberOfJobs().equals(this.getTotalNumberOfJobs()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getEnablePerformanceMode() == null ^ this.getEnablePerformanceMode() == null)
            return false;
        if (other.getEnablePerformanceMode() != null && other.getEnablePerformanceMode().equals(this.getEnablePerformanceMode()) == false)
            return false;
        if (other.getThumbnailUrl() == null ^ this.getThumbnailUrl() == null)
            return false;
        if (other.getThumbnailUrl() != null && other.getThumbnailUrl().equals(this.getThumbnailUrl()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getAssociatedResources() == null ^ this.getAssociatedResources() == null)
            return false;
        if (other.getAssociatedResources() != null && other.getAssociatedResources().equals(this.getAssociatedResources()) == false)
            return false;
        if (other.getEnablePullRequestPreview() == null ^ this.getEnablePullRequestPreview() == null)
            return false;
        if (other.getEnablePullRequestPreview() != null && other.getEnablePullRequestPreview().equals(this.getEnablePullRequestPreview()) == false)
            return false;
        if (other.getPullRequestEnvironmentName() == null ^ this.getPullRequestEnvironmentName() == null)
            return false;
        if (other.getPullRequestEnvironmentName() != null && other.getPullRequestEnvironmentName().equals(this.getPullRequestEnvironmentName()) == false)
            return false;
        if (other.getDestinationBranch() == null ^ this.getDestinationBranch() == null)
            return false;
        if (other.getDestinationBranch() != null && other.getDestinationBranch().equals(this.getDestinationBranch()) == false)
            return false;
        if (other.getSourceBranch() == null ^ this.getSourceBranch() == null)
            return false;
        if (other.getSourceBranch() != null && other.getSourceBranch().equals(this.getSourceBranch()) == false)
            return false;
        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchArn() == null) ? 0 : getBranchArn().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEnableNotification() == null) ? 0 : getEnableNotification().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getCustomDomains() == null) ? 0 : getCustomDomains().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getActiveJobId() == null) ? 0 : getActiveJobId().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfJobs() == null) ? 0 : getTotalNumberOfJobs().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceMode() == null) ? 0 : getEnablePerformanceMode().hashCode());
        hashCode = prime * hashCode + ((getThumbnailUrl() == null) ? 0 : getThumbnailUrl().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResources() == null) ? 0 : getAssociatedResources().hashCode());
        hashCode = prime * hashCode + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview().hashCode());
        hashCode = prime * hashCode + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getDestinationBranch() == null) ? 0 : getDestinationBranch().hashCode());
        hashCode = prime * hashCode + ((getSourceBranch() == null) ? 0 : getSourceBranch().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentArn() == null) ? 0 : getBackendEnvironmentArn().hashCode());
        return hashCode;
    }

    @Override
    public Branch clone() {
        try {
            return (Branch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.BranchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
