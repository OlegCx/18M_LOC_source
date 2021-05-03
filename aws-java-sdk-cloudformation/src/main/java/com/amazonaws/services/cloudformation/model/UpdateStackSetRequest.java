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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * Use the existing template that's associated with the stack set that you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     */
    private Boolean usePreviousTemplate;
    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of
     * 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of tags that are currently associated with
     * this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     * associated with this stack set, even tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are
     * removed from the stack set, and therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see if you
     * have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack
     * set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the
     * stack set, and checks to see if you have permission to untag resources. If you don't have the necessary
     * permission(s), the entire <code>UpdateStackSet</code> action fails with an <code>access denied</code> error, and
     * the stack set is not updated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting Permissions
     * for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the stack set, you must specify a customized
     * administrator role, even if it is the same customized administrator role used with this stack set previously.
     * </p>
     */
    private String administrationRoleARN;
    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you do not specify an execution role, AWS
     * CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you do not
     * specify a customized execution role, AWS CloudFormation performs the update using the role previously associated
     * with the stack set, so long as you have permissions to perform operations on the stack set.
     * </p>
     */
    private String executionRoleName;
    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not specify <code>DeploymentTargets</code>
     * or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     * <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     * instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified accounts
     * and Regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation
     * updates the stack instances in the specified accounts and Regions, while leaving all other stack instances with
     * their existing stack instance status.
     * </p>
     */
    private DeploymentTargets deploymentTargets;
    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created. You cannot modify
     * <code>PermissionModel</code> if there are stack instances associated with your stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String permissionModel;
    /**
     * <p>
     * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts
     * that are added to a target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or <code>Regions</code>
     * .
     * </p>
     */
    private AutoDeployment autoDeployment;
    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * [Self-managed permissions] The accounts in which to update associated stack instances. If you specify accounts,
     * you must also specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accounts;
    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify Regions, you must also specify accounts
     * in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to update.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     * 
     * @return The name or unique ID of the stack set that you want to update.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * 
     * @param description
     *        A brief description of updates that you are making.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * 
     * @return A brief description of updates that you are making.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * 
     * @param description
     *        A brief description of updates that you are making.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *        51,200 bytes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @return The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *         51,200 bytes. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *         <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *        51,200 bytes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the template body. The URL must point to a template (maximum size:
     *        460,800 bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @return The location of the file that contains the template body. The URL must point to a template (maximum size:
     *         460,800 bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *         <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the template body. The URL must point to a template (maximum size:
     *        460,800 bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Use the existing template that's associated with the stack set that you're updating.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @return Use the existing template that's associated with the stack set that you're updating.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *         <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public Boolean getUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Use the existing template that's associated with the stack set that you're updating.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *        <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        setUsePreviousTemplate(usePreviousTemplate);
        return this;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     * <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     * </p>
     * 
     * @return Use the existing template that's associated with the stack set that you're updating.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>TemplateBody</code> or
     *         <code>TemplateURL</code>—or set <code>UsePreviousTemplate</code> to true.
     */

    public Boolean isUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     * 
     * @return A list of input parameters for the stack set template.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for the stack set template.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for the stack set template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for the stack set template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @return In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *         order for AWS CloudFormation to update the stack set and its associated stack instances.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *         </p>
     *         <p>
     *         Some stack templates might include resources that can affect permissions in your AWS account; for
     *         example, by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must
     *         explicitly acknowledge this by specifying one of these capabilities.
     *         </p>
     *         <p>
     *         The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *         <code>CAPABILITY_NAMED_IAM</code> capability.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have IAM resources, you can specify either capability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't specify either of these capabilities, AWS CloudFormation returns an
     *         <code>InsufficientCapabilities</code> error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If your stack template contains these resources, we recommend that you review all permissions associated
     *         with them and edit their permissions if necessary.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *         AWS::IAM::AccessKey</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *         AWS::IAM::Group</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *         AWS::IAM::InstanceProfile</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *         AWS::IAM::Policy</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *         AWS::IAM::Role</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *         AWS::IAM::User</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *         AWS::IAM::UserToGroupAddition</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_AUTO_EXPAND</code>
     *         </p>
     *         <p>
     *         Some templates reference macros. If your stack set template references one or more macros, you must
     *         update the stack set directly from the processed template, without first reviewing the resulting changes
     *         in a change set. To update the stack set directly, you must acknowledge this capability. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *         CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *         </p>
     *         <important>
     *         <p>
     *         Stack sets with service-managed permissions do not currently support the use of macros in templates.
     *         (This includes the <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     *         capability for a stack set with service-managed permissions, if you reference a macro in your template
     *         the stack set operation will fail.
     *         </p>
     *         </important></li>
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to update the stack set and its associated stack instances.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some templates reference macros. If your stack set template references one or more macros, you must update
     *        the stack set directly from the processed template, without first reviewing the resulting changes in a
     *        change set. To update the stack set directly, you must acknowledge this capability. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        <important>
     *        <p>
     *        Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     *        includes the <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     *        capability for a stack set with service-managed permissions, if you reference a macro in your template the
     *        stack set operation will fail.
     *        </p>
     *        </important></li>
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(capabilities);
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to update the stack set and its associated stack instances.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some templates reference macros. If your stack set template references one or more macros, you must update
     *        the stack set directly from the processed template, without first reviewing the resulting changes in a
     *        change set. To update the stack set directly, you must acknowledge this capability. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        <important>
     *        <p>
     *        Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     *        includes the <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     *        capability for a stack set with service-managed permissions, if you reference a macro in your template the
     *        stack set operation will fail.
     *        </p>
     *        </important></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackSetRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to update the stack set and its associated stack instances.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some templates reference macros. If your stack set template references one or more macros, you must update
     *        the stack set directly from the processed template, without first reviewing the resulting changes in a
     *        change set. To update the stack set directly, you must acknowledge this capability. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        <important>
     *        <p>
     *        Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     *        includes the <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     *        capability for a stack set with service-managed permissions, if you reference a macro in your template the
     *        stack set operation will fail.
     *        </p>
     *        </important></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for AWS CloudFormation to update the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates reference macros. If your stack set template references one or more macros, you must update the
     * stack set directly from the processed template, without first reviewing the resulting changes in a change set. To
     * update the stack set directly, you must acknowledge this capability. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * <important>
     * <p>
     * Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     * capability for a stack set with service-managed permissions, if you reference a macro in your template the stack
     * set operation will fail.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to update the stack set and its associated stack instances.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some templates reference macros. If your stack set template references one or more macros, you must update
     *        the stack set directly from the processed template, without first reviewing the resulting changes in a
     *        change set. To update the stack set directly, you must acknowledge this capability. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        <important>
     *        <p>
     *        Stack sets with service-managed permissions do not currently support the use of macros in templates. (This
     *        includes the <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this
     *        capability for a stack set with service-managed permissions, if you reference a macro in your template the
     *        stack set operation will fail.
     *        </p>
     *        </important></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackSetRequest withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of
     * 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of tags that are currently associated with
     * this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     * associated with this stack set, even tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are
     * removed from the stack set, and therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see if you
     * have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack
     * set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the
     * stack set, and checks to see if you have permission to untag resources. If you don't have the necessary
     * permission(s), the entire <code>UpdateStackSet</code> action fails with an <code>access denied</code> error, and
     * the stack set is not updated.
     * </p>
     * 
     * @return The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *         also propagates these tags to supported resources that are created in the stacks. You can specify a
     *         maximum number of 50 tags.</p>
     *         <p>
     *         If you specify tags for this parameter, those tags replace any list of tags that are currently associated
     *         with this stack set. This means:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     *         associated with this stack set, even tags you've specifed before (for example, when creating the stack
     *         set or during a previous update of the stack set.). Any tags that you don't include in the updated list
     *         of tags are removed from the stack set, and therefore from the stacks and resources as well.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to
     *         see if you have the required IAM permission to tag resources. If you omit tags that are currently
     *         associated with the stack set from the list of tags you specify, AWS CloudFormation assumes that you want
     *         to remove those tags from the stack set, and checks to see if you have permission to untag resources. If
     *         you don't have the necessary permission(s), the entire <code>UpdateStackSet</code> action fails with an
     *         <code>access denied</code> error, and the stack set is not updated.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of
     * 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of tags that are currently associated with
     * this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     * associated with this stack set, even tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are
     * removed from the stack set, and therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see if you
     * have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack
     * set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the
     * stack set, and checks to see if you have permission to untag resources. If you don't have the necessary
     * permission(s), the entire <code>UpdateStackSet</code> action fails with an <code>access denied</code> error, and
     * the stack set is not updated.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. You can specify a
     *        maximum number of 50 tags.</p>
     *        <p>
     *        If you specify tags for this parameter, those tags replace any list of tags that are currently associated
     *        with this stack set. This means:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     *        associated with this stack set, even tags you've specifed before (for example, when creating the stack set
     *        or during a previous update of the stack set.). Any tags that you don't include in the updated list of
     *        tags are removed from the stack set, and therefore from the stacks and resources as well.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see
     *        if you have the required IAM permission to tag resources. If you omit tags that are currently associated
     *        with the stack set from the list of tags you specify, AWS CloudFormation assumes that you want to remove
     *        those tags from the stack set, and checks to see if you have permission to untag resources. If you don't
     *        have the necessary permission(s), the entire <code>UpdateStackSet</code> action fails with an
     *        <code>access denied</code> error, and the stack set is not updated.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of
     * 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of tags that are currently associated with
     * this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     * associated with this stack set, even tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are
     * removed from the stack set, and therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see if you
     * have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack
     * set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the
     * stack set, and checks to see if you have permission to untag resources. If you don't have the necessary
     * permission(s), the entire <code>UpdateStackSet</code> action fails with an <code>access denied</code> error, and
     * the stack set is not updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. You can specify a
     *        maximum number of 50 tags.</p>
     *        <p>
     *        If you specify tags for this parameter, those tags replace any list of tags that are currently associated
     *        with this stack set. This means:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     *        associated with this stack set, even tags you've specifed before (for example, when creating the stack set
     *        or during a previous update of the stack set.). Any tags that you don't include in the updated list of
     *        tags are removed from the stack set, and therefore from the stacks and resources as well.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see
     *        if you have the required IAM permission to tag resources. If you omit tags that are currently associated
     *        with the stack set from the list of tags you specify, AWS CloudFormation assumes that you want to remove
     *        those tags from the stack set, and checks to see if you have permission to untag resources. If you don't
     *        have the necessary permission(s), the entire <code>UpdateStackSet</code> action fails with an
     *        <code>access denied</code> error, and the stack set is not updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of
     * 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of tags that are currently associated with
     * this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     * associated with this stack set, even tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are
     * removed from the stack set, and therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see if you
     * have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack
     * set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the
     * stack set, and checks to see if you have permission to untag resources. If you don't have the necessary
     * permission(s), the entire <code>UpdateStackSet</code> action fails with an <code>access denied</code> error, and
     * the stack set is not updated.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. You can specify a
     *        maximum number of 50 tags.</p>
     *        <p>
     *        If you specify tags for this parameter, those tags replace any list of tags that are currently associated
     *        with this stack set. This means:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <i>any</i> tags using this parameter, you must specify <i>all</i> the tags that you want
     *        associated with this stack set, even tags you've specifed before (for example, when creating the stack set
     *        or during a previous update of the stack set.). Any tags that you don't include in the updated list of
     *        tags are removed from the stack set, and therefore from the stacks and resources as well.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an empty value, AWS CloudFormation removes all currently associated tags.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify new tags as part of an <code>UpdateStackSet</code> action, AWS CloudFormation checks to see
     *        if you have the required IAM permission to tag resources. If you omit tags that are currently associated
     *        with the stack set from the list of tags you specify, AWS CloudFormation assumes that you want to remove
     *        those tags from the stack set, and checks to see if you have permission to untag resources. If you don't
     *        have the necessary permission(s), the entire <code>UpdateStackSet</code> action fails with an
     *        <code>access denied</code> error, and the stack set is not updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @return Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting Permissions
     * for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the stack set, you must specify a customized
     * administrator role, even if it is the same customized administrator role used with this stack set previously.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.</p>
     *        <p>
     *        Specify an IAM role only if you are using customized administrator roles to control which users or groups
     *        can manage specific stack sets within the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting
     *        Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        <p>
     *        If you specified a customized administrator role when you created the stack set, you must specify a
     *        customized administrator role, even if it is the same customized administrator role used with this stack
     *        set previously.
     */

    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting Permissions
     * for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the stack set, you must specify a customized
     * administrator role, even if it is the same customized administrator role used with this stack set previously.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.</p>
     *         <p>
     *         Specify an IAM role only if you are using customized administrator roles to control which users or groups
     *         can manage specific stack sets within the same administrator account. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting
     *         Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         <p>
     *         If you specified a customized administrator role when you created the stack set, you must specify a
     *         customized administrator role, even if it is the same customized administrator role used with this stack
     *         set previously.
     */

    public String getAdministrationRoleARN() {
        return this.administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting Permissions
     * for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the stack set, you must specify a customized
     * administrator role, even if it is the same customized administrator role used with this stack set previously.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role to use to update this stack set.</p>
     *        <p>
     *        Specify an IAM role only if you are using customized administrator roles to control which users or groups
     *        can manage specific stack sets within the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Granting
     *        Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        <p>
     *        If you specified a customized administrator role when you created the stack set, you must specify a
     *        customized administrator role, even if it is the same customized administrator role used with this stack
     *        set previously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withAdministrationRoleARN(String administrationRoleARN) {
        setAdministrationRoleARN(administrationRoleARN);
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you do not specify an execution role, AWS
     * CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you do not
     * specify a customized execution role, AWS CloudFormation performs the update using the role previously associated
     * with the stack set, so long as you have permissions to perform operations on the stack set.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role to use to update the stack set. If you do not specify an execution
     *        role, AWS CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     *        set operation.</p>
     *        <p>
     *        Specify an IAM role only if you are using customized execution roles to control which stack resources
     *        users and groups can include in their stack sets.
     *        </p>
     *        <p>
     *        If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you
     *        do not specify a customized execution role, AWS CloudFormation performs the update using the role
     *        previously associated with the stack set, so long as you have permissions to perform operations on the
     *        stack set.
     */

    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you do not specify an execution role, AWS
     * CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you do not
     * specify a customized execution role, AWS CloudFormation performs the update using the role previously associated
     * with the stack set, so long as you have permissions to perform operations on the stack set.
     * </p>
     * 
     * @return The name of the IAM execution role to use to update the stack set. If you do not specify an execution
     *         role, AWS CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     *         set operation.</p>
     *         <p>
     *         Specify an IAM role only if you are using customized execution roles to control which stack resources
     *         users and groups can include in their stack sets.
     *         </p>
     *         <p>
     *         If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you
     *         do not specify a customized execution role, AWS CloudFormation performs the update using the role
     *         previously associated with the stack set, so long as you have permissions to perform operations on the
     *         stack set.
     */

    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you do not specify an execution role, AWS
     * CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you do not
     * specify a customized execution role, AWS CloudFormation performs the update using the role previously associated
     * with the stack set, so long as you have permissions to perform operations on the stack set.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role to use to update the stack set. If you do not specify an execution
     *        role, AWS CloudFormation uses the <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     *        set operation.</p>
     *        <p>
     *        Specify an IAM role only if you are using customized execution roles to control which stack resources
     *        users and groups can include in their stack sets.
     *        </p>
     *        <p>
     *        If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you
     *        do not specify a customized execution role, AWS CloudFormation performs the update using the role
     *        previously associated with the stack set, so long as you have permissions to perform operations on the
     *        stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withExecutionRoleName(String executionRoleName) {
        setExecutionRoleName(executionRoleName);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not specify <code>DeploymentTargets</code>
     * or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     * <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     * instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified accounts
     * and Regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation
     * updates the stack instances in the specified accounts and Regions, while leaving all other stack instances with
     * their existing stack instance status.
     * </p>
     * 
     * @param deploymentTargets
     *        [Service-managed permissions] The AWS Organizations accounts in which to update associated stack
     *        instances.</p>
     *        <p>
     *        To update all the stack instances associated with this stack set, do not specify
     *        <code>DeploymentTargets</code> or <code>Regions</code>.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     *        <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     *        instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified
     *        accounts and Regions. If the stack set update does not include changes to the template or parameters, AWS
     *        CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     *        stack instances with their existing stack instance status.
     */

    public void setDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not specify <code>DeploymentTargets</code>
     * or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     * <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     * instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified accounts
     * and Regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation
     * updates the stack instances in the specified accounts and Regions, while leaving all other stack instances with
     * their existing stack instance status.
     * </p>
     * 
     * @return [Service-managed permissions] The AWS Organizations accounts in which to update associated stack
     *         instances.</p>
     *         <p>
     *         To update all the stack instances associated with this stack set, do not specify
     *         <code>DeploymentTargets</code> or <code>Regions</code>.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     *         <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all
     *         stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     *         specified accounts and Regions. If the stack set update does not include changes to the template or
     *         parameters, AWS CloudFormation updates the stack instances in the specified accounts and Regions, while
     *         leaving all other stack instances with their existing stack instance status.
     */

    public DeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    /**
     * <p>
     * [Service-managed permissions] The AWS Organizations accounts in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not specify <code>DeploymentTargets</code>
     * or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     * <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     * instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified accounts
     * and Regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation
     * updates the stack instances in the specified accounts and Regions, while leaving all other stack instances with
     * their existing stack instance status.
     * </p>
     * 
     * @param deploymentTargets
     *        [Service-managed permissions] The AWS Organizations accounts in which to update associated stack
     *        instances.</p>
     *        <p>
     *        To update all the stack instances associated with this stack set, do not specify
     *        <code>DeploymentTargets</code> or <code>Regions</code>.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if <code>TemplateBody</code> or
     *        <code>TemplateURL</code> is specified), or the <code>Parameters</code>, AWS CloudFormation marks all stack
     *        instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the specified
     *        accounts and Regions. If the stack set update does not include changes to the template or parameters, AWS
     *        CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     *        stack instances with their existing stack instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withDeploymentTargets(DeploymentTargets deploymentTargets) {
        setDeploymentTargets(deploymentTargets);
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created. You cannot modify
     * <code>PermissionModel</code> if there are stack instances associated with your stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created. You cannot modify
     *        <code>PermissionModel</code> if there are stack instances associated with your stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @see PermissionModels
     */

    public void setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created. You cannot modify
     * <code>PermissionModel</code> if there are stack instances associated with your stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes how the IAM roles required for stack set operations are created. You cannot modify
     *         <code>PermissionModel</code> if there are stack instances associated with your stack set.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         With <code>self-managed</code> permissions, you must create the administrator and execution roles
     *         required to deploy to target accounts. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *         >Grant Self-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *         deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *         >Grant Service-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     * @see PermissionModels
     */

    public String getPermissionModel() {
        return this.permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created. You cannot modify
     * <code>PermissionModel</code> if there are stack instances associated with your stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created. You cannot modify
     *        <code>PermissionModel</code> if there are stack instances associated with your stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModels
     */

    public UpdateStackSetRequest withPermissionModel(String permissionModel) {
        setPermissionModel(permissionModel);
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created. You cannot modify
     * <code>PermissionModel</code> if there are stack instances associated with your stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created. You cannot modify
     *        <code>PermissionModel</code> if there are stack instances associated with your stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModels
     */

    public UpdateStackSetRequest withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts
     * that are added to a target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or <code>Regions</code>
     * .
     * </p>
     * 
     * @param autoDeployment
     *        [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations
     *        accounts that are added to a target organization or organizational unit (OU).</p>
     *        <p>
     *        If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or
     *        <code>Regions</code>.
     */

    public void setAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
    }

    /**
     * <p>
     * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts
     * that are added to a target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or <code>Regions</code>
     * .
     * </p>
     * 
     * @return [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations
     *         accounts that are added to a target organization or organizational unit (OU).</p>
     *         <p>
     *         If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or
     *         <code>Regions</code>.
     */

    public AutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    /**
     * <p>
     * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts
     * that are added to a target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or <code>Regions</code>
     * .
     * </p>
     * 
     * @param autoDeployment
     *        [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations
     *        accounts that are added to a target organization or organizational unit (OU).</p>
     *        <p>
     *        If you specify <code>AutoDeployment</code>, do not specify <code>DeploymentTargets</code> or
     *        <code>Regions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withAutoDeployment(AutoDeployment autoDeployment) {
        setAutoDeployment(autoDeployment);
        return this;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @param operationId
     *        The unique ID for this stack set operation. </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     *        </p>
     *        <p>
     *        Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *        <code>OUTDATED</code>.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @return The unique ID for this stack set operation. </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *         stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *         operation requests to ensure that AWS CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     *         </p>
     *         <p>
     *         Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *         <code>OUTDATED</code>.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     * <code>OUTDATED</code>.
     * </p>
     * 
     * @param operationId
     *        The unique ID for this stack set operation. </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        If you don't specify an operation ID, AWS CloudFormation generates one automatically.
     *        </p>
     *        <p>
     *        Repeating this stack set operation with a new operation ID retries all stack instances whose status is
     *        <code>OUTDATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * [Self-managed permissions] The accounts in which to update associated stack instances. If you specify accounts,
     * you must also specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @return [Self-managed permissions] The accounts in which to update associated stack instances. If you specify
     *         accounts, you must also specify the Regions in which to update stack set instances.</p>
     *         <p>
     *         To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *         <code>Accounts</code> or <code>Regions</code> properties.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *         <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *         CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *         stack instances in the specified accounts and Regions. If the stack set update does not include changes
     *         to the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts
     *         and Regions, while leaving all other stack instances with their existing stack instance status.
     */

    public java.util.List<String> getAccounts() {
        if (accounts == null) {
            accounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accounts;
    }

    /**
     * <p>
     * [Self-managed permissions] The accounts in which to update associated stack instances. If you specify accounts,
     * you must also specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The accounts in which to update associated stack instances. If you specify
     *        accounts, you must also specify the Regions in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new com.amazonaws.internal.SdkInternalList<String>(accounts);
    }

    /**
     * <p>
     * [Self-managed permissions] The accounts in which to update associated stack instances. If you specify accounts,
     * you must also specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The accounts in which to update associated stack instances. If you specify
     *        accounts, you must also specify the Regions in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new com.amazonaws.internal.SdkInternalList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [Self-managed permissions] The accounts in which to update associated stack instances. If you specify accounts,
     * you must also specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @param accounts
     *        [Self-managed permissions] The accounts in which to update associated stack instances. If you specify
     *        accounts, you must also specify the Regions in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify Regions, you must also specify accounts
     * in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @return The Regions in which to update associated stack instances. If you specify Regions, you must also specify
     *         accounts in which to update stack set instances.</p>
     *         <p>
     *         To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *         <code>Accounts</code> or <code>Regions</code> properties.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *         <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *         CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *         stack instances in the specified accounts and Regions. If the stack set update does not include changes
     *         to the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts
     *         and Regions, while leaving all other stack instances with their existing stack instance status.
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify Regions, you must also specify accounts
     * in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @param regions
     *        The Regions in which to update associated stack instances. If you specify Regions, you must also specify
     *        accounts in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify Regions, you must also specify accounts
     * in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The Regions in which to update associated stack instances. If you specify Regions, you must also specify
     *        accounts in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify Regions, you must also specify accounts
     * in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set, do not specify the <code>Accounts</code>
     * or <code>Regions</code> properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     * <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to updating the stack instances in the
     * specified accounts and Regions. If the stack set update does not include changes to the template or parameters,
     * AWS CloudFormation updates the stack instances in the specified accounts and Regions, while leaving all other
     * stack instances with their existing stack instance status.
     * </p>
     * 
     * @param regions
     *        The Regions in which to update associated stack instances. If you specify Regions, you must also specify
     *        accounts in which to update stack set instances.</p>
     *        <p>
     *        To update <i>all</i> the stack instances associated with this stack set, do not specify the
     *        <code>Accounts</code> or <code>Regions</code> properties.
     *        </p>
     *        <p>
     *        If the stack set update includes changes to the template (that is, if the <code>TemplateBody</code> or
     *        <code>TemplateURL</code> properties are specified), or the <code>Parameters</code> property, AWS
     *        CloudFormation marks all stack instances with a status of <code>OUTDATED</code> prior to updating the
     *        stack instances in the specified accounts and Regions. If the stack set update does not include changes to
     *        the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and
     *        Regions, while leaving all other stack instances with their existing stack instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackSetRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *         organization's management account or as a delegated administrator in a member account.</p>
     *         <p>
     *         By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         <p>
     *         Your AWS account must be registered as a delegated administrator in the management account. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *         >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public UpdateStackSetRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public UpdateStackSetRequest withCallAs(CallAs callAs) {
        this.callAs = callAs.toString();
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: ").append(getTemplateURL()).append(",");
        if (getUsePreviousTemplate() != null)
            sb.append("UsePreviousTemplate: ").append(getUsePreviousTemplate()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: ").append(getAdministrationRoleARN()).append(",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: ").append(getExecutionRoleName()).append(",");
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: ").append(getDeploymentTargets()).append(",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: ").append(getPermissionModel()).append(",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: ").append(getAutoDeployment()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getCallAs() != null)
            sb.append("CallAs: ").append(getCallAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackSetRequest == false)
            return false;
        UpdateStackSetRequest other = (UpdateStackSetRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        if (other.getUsePreviousTemplate() == null ^ this.getUsePreviousTemplate() == null)
            return false;
        if (other.getUsePreviousTemplate() != null && other.getUsePreviousTemplate().equals(this.getUsePreviousTemplate()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getAdministrationRoleARN() == null ^ this.getAdministrationRoleARN() == null)
            return false;
        if (other.getAdministrationRoleARN() != null && other.getAdministrationRoleARN().equals(this.getAdministrationRoleARN()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
            return false;
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getAutoDeployment() == null ^ this.getAutoDeployment() == null)
            return false;
        if (other.getAutoDeployment() != null && other.getAutoDeployment().equals(this.getAutoDeployment()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getCallAs() == null ^ this.getCallAs() == null)
            return false;
        if (other.getCallAs() != null && other.getCallAs().equals(this.getCallAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getUsePreviousTemplate() == null) ? 0 : getUsePreviousTemplate().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        hashCode = prime * hashCode + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackSetRequest clone() {
        return (UpdateStackSetRequest) super.clone();
    }

}
