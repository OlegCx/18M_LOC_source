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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConstraintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The updated description of the constraint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the IAM role
     * with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the
     * administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch constraint and the account of the user
     * who launches a product with this launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     */
    private String parameters;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConstraintRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param id
     *        The identifier of the constraint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @return The identifier of the constraint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param id
     *        The identifier of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConstraintRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The updated description of the constraint.
     * </p>
     * 
     * @param description
     *        The updated description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the constraint.
     * </p>
     * 
     * @return The updated description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the constraint.
     * </p>
     * 
     * @param description
     *        The updated description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConstraintRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the IAM role
     * with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the
     * administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch constraint and the account of the user
     * who launches a product with this launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param parameters
     *        The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *        <dl>
     *        <dt>LAUNCH</dt>
     *        <dd>
     *        <p>
     *        You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't
     *        use both.
     *        </p>
     *        <p>
     *        Specify the <code>RoleArn</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *        </p>
     *        <p>
     *        Specify the <code>LocalRoleName</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *        </p>
     *        <p>
     *        If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the
     *        IAM role with that name in the account will be used. This allows launch-role constraints to be
     *        account-agnostic so the administrator can create fewer resources per shared account.
     *        </p>
     *        <note>
     *        <p>
     *        The given role name must exist in the account used to create the launch constraint and the account of the
     *        user who launches a product with this launch constraint.
     *        </p>
     *        </note>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *        </p>
     *        </dd>
     *        <dt>NOTIFICATION</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>NotificationArns</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *        </p>
     *        </dd>
     *        <dt>RESOURCE_UPDATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *        </p>
     *        <p>
     *        The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     *        <code>NOT_ALLOWED</code>.
     *        </p>
     *        </dd>
     *        <dt>STACKSET</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Parameters</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *        </p>
     *        <p>
     *        Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *        </p>
     *        </dd>
     *        <dt>TEMPLATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Rules</code> property. For more information, see <a
     *        href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *        >Template Constraint Rules</a>.
     *        </p>
     *        </dd>
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the IAM role
     * with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the
     * administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch constraint and the account of the user
     * who launches a product with this launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *         <dl>
     *         <dt>LAUNCH</dt>
     *         <dd>
     *         <p>
     *         You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't
     *         use both.
     *         </p>
     *         <p>
     *         Specify the <code>RoleArn</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *         </p>
     *         <p>
     *         Specify the <code>LocalRoleName</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *         </p>
     *         <p>
     *         If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the
     *         IAM role with that name in the account will be used. This allows launch-role constraints to be
     *         account-agnostic so the administrator can create fewer resources per shared account.
     *         </p>
     *         <note>
     *         <p>
     *         The given role name must exist in the account used to create the launch constraint and the account of the
     *         user who launches a product with this launch constraint.
     *         </p>
     *         </note>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *         </p>
     *         </dd>
     *         <dt>NOTIFICATION</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>NotificationArns</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *         </p>
     *         </dd>
     *         <dt>RESOURCE_UPDATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *         </p>
     *         <p>
     *         The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code>
     *         or <code>NOT_ALLOWED</code>.
     *         </p>
     *         </dd>
     *         <dt>STACKSET</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Parameters</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *         </p>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *         </p>
     *         <p>
     *         Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *         </p>
     *         </dd>
     *         <dt>TEMPLATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Rules</code> property. For more information, see <a
     *         href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *         >Template Constraint Rules</a>.
     *         </p>
     *         </dd>
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the IAM role
     * with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the
     * administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch constraint and the account of the user
     * who launches a product with this launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param parameters
     *        The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *        <dl>
     *        <dt>LAUNCH</dt>
     *        <dd>
     *        <p>
     *        You are required to specify either the <code>RoleArn</code> or the <code>LocalRoleName</code> but can't
     *        use both.
     *        </p>
     *        <p>
     *        Specify the <code>RoleArn</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *        </p>
     *        <p>
     *        Specify the <code>LocalRoleName</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *        </p>
     *        <p>
     *        If you specify the <code>LocalRoleName</code> property, when an account uses the launch constraint, the
     *        IAM role with that name in the account will be used. This allows launch-role constraints to be
     *        account-agnostic so the administrator can create fewer resources per shared account.
     *        </p>
     *        <note>
     *        <p>
     *        The given role name must exist in the account used to create the launch constraint and the account of the
     *        user who launches a product with this launch constraint.
     *        </p>
     *        </note>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *        </p>
     *        </dd>
     *        <dt>NOTIFICATION</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>NotificationArns</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *        </p>
     *        </dd>
     *        <dt>RESOURCE_UPDATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *        </p>
     *        <p>
     *        The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     *        <code>NOT_ALLOWED</code>.
     *        </p>
     *        </dd>
     *        <dt>STACKSET</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Parameters</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *        </p>
     *        <p>
     *        Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *        </p>
     *        </dd>
     *        <dt>TEMPLATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Rules</code> property. For more information, see <a
     *        href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *        >Template Constraint Rules</a>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConstraintRequest withParameters(String parameters) {
        setParameters(parameters);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConstraintRequest == false)
            return false;
        UpdateConstraintRequest other = (UpdateConstraintRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConstraintRequest clone() {
        return (UpdateConstraintRequest) super.clone();
    }

}
