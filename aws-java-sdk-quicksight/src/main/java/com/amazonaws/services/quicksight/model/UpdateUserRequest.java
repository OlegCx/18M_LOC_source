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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the QuickSight role is invisible to the user except for the console screens dealing with permissions.
     * </p>
     */
    private String role;
    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     * </p>
     * <p>
     * QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     * typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin,
     * author, reader).
     * </p>
     * <p>
     * This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation
     * for Single Sign-On (SSO).
     * </p>
     */
    private String customPermissionsName;
    /**
     * <p>
     * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     * parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter
     * defaults to NULL and it doesn't accept any other value.
     * </p>
     */
    private Boolean unapplyCustomPermissions;

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * 
     * @param userName
     *        The Amazon QuickSight user name that you want to update.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * 
     * @return The Amazon QuickSight user name that you want to update.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * 
     * @param userName
     *        The Amazon QuickSight user name that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *         contains your Amazon QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @return The namespace. Currently, you should set this to <code>default</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     * 
     * @param email
     *        The email address of the user that you want to update.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     * 
     * @return The email address of the user that you want to update.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     * 
     * @param email
     *        The email address of the user that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the QuickSight role is invisible to the user except for the console screens dealing with permissions.
     * </p>
     * 
     * @param role
     *        The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the QuickSight role is invisible to the user except for the console screens dealing with
     *        permissions.
     * @see UserRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the QuickSight role is invisible to the user except for the console screens dealing with permissions.
     * </p>
     * 
     * @return The Amazon QuickSight role of the user. The role can be one of the following default security
     *         cohorts:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of the QuickSight role is invisible to the user except for the console screens dealing with
     *         permissions.
     * @see UserRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the QuickSight role is invisible to the user except for the console screens dealing with permissions.
     * </p>
     * 
     * @param role
     *        The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the QuickSight role is invisible to the user except for the console screens dealing with
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public UpdateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the QuickSight role is invisible to the user except for the console screens dealing with permissions.
     * </p>
     * 
     * @param role
     *        The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the QuickSight role is invisible to the user except for the console screens dealing with
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public UpdateUserRequest withRole(UserRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     * </p>
     * <p>
     * QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     * typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin,
     * author, reader).
     * </p>
     * <p>
     * This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation
     * for Single Sign-On (SSO).
     * </p>
     * 
     * @param customPermissionsName
     *        (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     *        Customized permissions allows you to control a user's access by restricting access the following
     *        operations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Create and update data sources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update datasets
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update email reports
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subscribe to email reports
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *        the profile names for custom permission sets by using the QuickSight console. Then, you use the
     *        <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     *        </p>
     *        <p>
     *        QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     *        typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight
     *        (admin, author, reader).
     *        </p>
     *        <p>
     *        This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based
     *        Federation for Single Sign-On (SSO).
     */

    public void setCustomPermissionsName(String customPermissionsName) {
        this.customPermissionsName = customPermissionsName;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     * </p>
     * <p>
     * QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     * typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin,
     * author, reader).
     * </p>
     * <p>
     * This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation
     * for Single Sign-On (SSO).
     * </p>
     * 
     * @return (Enterprise edition only) The name of the custom permissions profile that you want to assign to this
     *         user. Customized permissions allows you to control a user's access by restricting access the following
     *         operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Create and update data sources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Create and update datasets
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Create and update email reports
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subscribe to email reports
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *         the profile names for custom permission sets by using the QuickSight console. Then, you use the
     *         <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     *         </p>
     *         <p>
     *         QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     *         typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight
     *         (admin, author, reader).
     *         </p>
     *         <p>
     *         This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based
     *         Federation for Single Sign-On (SSO).
     */

    public String getCustomPermissionsName() {
        return this.customPermissionsName;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     * </p>
     * <p>
     * QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     * typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin,
     * author, reader).
     * </p>
     * <p>
     * This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation
     * for Single Sign-On (SSO).
     * </p>
     * 
     * @param customPermissionsName
     *        (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     *        Customized permissions allows you to control a user's access by restricting access the following
     *        operations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Create and update data sources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update datasets
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update email reports
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subscribe to email reports
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *        the profile names for custom permission sets by using the QuickSight console. Then, you use the
     *        <code>RegisterUser</code> API operation to assign the named set of permissions to a QuickSight user.
     *        </p>
     *        <p>
     *        QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions
     *        typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight
     *        (admin, author, reader).
     *        </p>
     *        <p>
     *        This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based
     *        Federation for Single Sign-On (SSO).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withCustomPermissionsName(String customPermissionsName) {
        setCustomPermissionsName(customPermissionsName);
        return this;
    }

    /**
     * <p>
     * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     * parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter
     * defaults to NULL and it doesn't accept any other value.
     * </p>
     * 
     * @param unapplyCustomPermissions
     *        A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     *        parameter resets the user to the state it was in before a custom permissions profile was applied. This
     *        parameter defaults to NULL and it doesn't accept any other value.
     */

    public void setUnapplyCustomPermissions(Boolean unapplyCustomPermissions) {
        this.unapplyCustomPermissions = unapplyCustomPermissions;
    }

    /**
     * <p>
     * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     * parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter
     * defaults to NULL and it doesn't accept any other value.
     * </p>
     * 
     * @return A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     *         parameter resets the user to the state it was in before a custom permissions profile was applied. This
     *         parameter defaults to NULL and it doesn't accept any other value.
     */

    public Boolean getUnapplyCustomPermissions() {
        return this.unapplyCustomPermissions;
    }

    /**
     * <p>
     * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     * parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter
     * defaults to NULL and it doesn't accept any other value.
     * </p>
     * 
     * @param unapplyCustomPermissions
     *        A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     *        parameter resets the user to the state it was in before a custom permissions profile was applied. This
     *        parameter defaults to NULL and it doesn't accept any other value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUnapplyCustomPermissions(Boolean unapplyCustomPermissions) {
        setUnapplyCustomPermissions(unapplyCustomPermissions);
        return this;
    }

    /**
     * <p>
     * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     * parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter
     * defaults to NULL and it doesn't accept any other value.
     * </p>
     * 
     * @return A flag that you use to indicate that you want to remove all custom permissions from this user. Using this
     *         parameter resets the user to the state it was in before a custom permissions profile was applied. This
     *         parameter defaults to NULL and it doesn't accept any other value.
     */

    public Boolean isUnapplyCustomPermissions() {
        return this.unapplyCustomPermissions;
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getCustomPermissionsName() != null)
            sb.append("CustomPermissionsName: ").append(getCustomPermissionsName()).append(",");
        if (getUnapplyCustomPermissions() != null)
            sb.append("UnapplyCustomPermissions: ").append(getUnapplyCustomPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getCustomPermissionsName() == null ^ this.getCustomPermissionsName() == null)
            return false;
        if (other.getCustomPermissionsName() != null && other.getCustomPermissionsName().equals(this.getCustomPermissionsName()) == false)
            return false;
        if (other.getUnapplyCustomPermissions() == null ^ this.getUnapplyCustomPermissions() == null)
            return false;
        if (other.getUnapplyCustomPermissions() != null && other.getUnapplyCustomPermissions().equals(this.getUnapplyCustomPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getCustomPermissionsName() == null) ? 0 : getCustomPermissionsName().hashCode());
        hashCode = prime * hashCode + ((getUnapplyCustomPermissions() == null) ? 0 : getUnapplyCustomPermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
