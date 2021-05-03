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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkteamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     */
    private String workteamName;
    /**
     * <p>
     * The name of the workforce.
     * </p>
     */
    private String workforceName;
    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input for both of these parameters
     * in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;
    /**
     * <p>
     * A description of the work team.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configures notification of workers regarding available or expiring work items.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html">Resource
     * Tag</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team. Use this name to identify the work team.
     */

    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @return The name of the work team. Use this name to identify the work team.
     */

    public String getWorkteamName() {
        return this.workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team. Use this name to identify the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withWorkteamName(String workteamName) {
        setWorkteamName(workteamName);
        return this;
    }

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the workforce.
     */

    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @return The name of the workforce.
     */

    public String getWorkforceName() {
        return this.workforceName;
    }

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withWorkforceName(String workforceName) {
        setWorkforceName(workforceName);
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input for both of these parameters
     * in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * </p>
     * 
     * @return A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *         up the work team. </p>
     *         <p>
     *         Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *         workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *         using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input
     *         for both of these parameters in a single request.
     *         </p>
     *         <p>
     *         For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *         groups</i> within the user pool used to create a workforce. All of the
     *         <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *         <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *         worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *         <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     *         Amazon Cognito User Pools</a>.
     *         </p>
     *         <p>
     *         For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *         private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     */

    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input for both of these parameters
     * in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input
     *        for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     */

    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input for both of these parameters
     * in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDefinitions(java.util.Collection)} or {@link #withMemberDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input
     *        for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (this.memberDefinitions == null) {
            setMemberDefinitions(new java.util.ArrayList<MemberDefinition>(memberDefinitions.length));
        }
        for (MemberDefinition ele : memberDefinitions) {
            this.memberDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input for both of these parameters
     * in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. Do not provide input
     *        for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @return A description of the work team.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work items.
     * </p>
     * 
     * @param notificationConfiguration
     *        Configures notification of workers regarding available or expiring work items.
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work items.
     * </p>
     * 
     * @return Configures notification of workers regarding available or expiring work items.
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work items.
     * </p>
     * 
     * @param notificationConfiguration
     *        Configures notification of workers regarding available or expiring work items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html">Resource
     * Tag</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *         >Resource Tag</a> and <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     *         Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html">Resource
     * Tag</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *        >Resource Tag</a> and <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
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
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html">Resource
     * Tag</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *        >Resource Tag</a> and <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withTags(Tag... tags) {
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
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html">Resource
     * Tag</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *        >Resource Tag</a> and <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: ").append(getWorkteamName()).append(",");
        if (getWorkforceName() != null)
            sb.append("WorkforceName: ").append(getWorkforceName()).append(",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: ").append(getMemberDefinitions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration()).append(",");
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

        if (obj instanceof CreateWorkteamRequest == false)
            return false;
        CreateWorkteamRequest other = (CreateWorkteamRequest) obj;
        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        hashCode = prime * hashCode + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkteamRequest clone() {
        return (CreateWorkteamRequest) super.clone();
    }

}
