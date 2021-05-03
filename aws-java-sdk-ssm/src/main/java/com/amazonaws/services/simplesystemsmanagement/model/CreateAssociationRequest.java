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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SSM document that contains the configuration information for the instance. You can specify
     * Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a document that is shared with you from
     * another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document
     * ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document
     * name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM documents
     * that use schema version 2.0 or later will fail. In addition, if you use the parameter <code>InstanceId</code>,
     * you cannot use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>, <code>MaxErrors</code>,
     * <code>MaxConcurrency</code>, <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these
     * parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     */
    private String instanceId;
    /**
     * <p>
     * The parameters for the runtime configuration of the document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The targets for the association. You can target instances by using tags, AWS Resource Groups, all instances in an
     * AWS account, or individual instance IDs. For more information about choosing targets for an association, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     * >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An S3 bucket where you want to store the output details of the request.
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;
    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     */
    private String associationName;
    /**
     * <p>
     * Specify the target for the association. This target is required for associations that use an Automation document
     * and target resources by using rate controls.
     * </p>
     */
    private String automationTargetParameterName;
    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     */
    private String complianceSeverity;
    /**
     * <p>
     * The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>. In
     * <code>AUTO</code> mode, the system uses the status of the association execution to determine the compliance
     * status. If the association execution runs successfully, then the association is <code>COMPLIANT</code>. If the
     * association execution doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     * managed by your direct call to the <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     */
    private String syncCompliance;
    /**
     * <p>
     * By default, when you create a new associations, the system runs it immediately after it is created and then
     * according to the schedule you specified. Specify this option if you don't want an association to run immediately
     * after you create it. This parameter is not supported for rate expressions.
     * </p>
     */
    private Boolean applyOnlyAtCronInterval;
    /**
     * <p>
     * A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use this
     * action to create an association in multiple Regions and multiple accounts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetLocation> targetLocations;

    /**
     * <p>
     * The name of the SSM document that contains the configuration information for the instance. You can specify
     * Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a document that is shared with you from
     * another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document
     * ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document
     * name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * 
     * @param name
     *        The name of the SSM document that contains the configuration information for the instance. You can specify
     *        Command or Automation documents.</p>
     *        <p>
     *        You can specify AWS-predefined documents, documents you created, or a document that is shared with you
     *        from another account.
     *        </p>
     *        <p>
     *        For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM
     *        document ARN, in the following format:
     *        </p>
     *        <p>
     *        <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *        </p>
     *        <p>
     *        For AWS-predefined documents and SSM documents you created in your account, you only need to specify the
     *        document name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document that contains the configuration information for the instance. You can specify
     * Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a document that is shared with you from
     * another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document
     * ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document
     * name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * 
     * @return The name of the SSM document that contains the configuration information for the instance. You can
     *         specify Command or Automation documents.</p>
     *         <p>
     *         You can specify AWS-predefined documents, documents you created, or a document that is shared with you
     *         from another account.
     *         </p>
     *         <p>
     *         For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM
     *         document ARN, in the following format:
     *         </p>
     *         <p>
     *         <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *         </p>
     *         <p>
     *         For AWS-predefined documents and SSM documents you created in your account, you only need to specify the
     *         document name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document that contains the configuration information for the instance. You can specify
     * Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a document that is shared with you from
     * another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document
     * ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document
     * name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * 
     * @param name
     *        The name of the SSM document that contains the configuration information for the instance. You can specify
     *        Command or Automation documents.</p>
     *        <p>
     *        You can specify AWS-predefined documents, documents you created, or a document that is shared with you
     *        from another account.
     *        </p>
     *        <p>
     *        For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM
     *        document ARN, in the following format:
     *        </p>
     *        <p>
     *        <code>arn:<i>partition</i>:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *        </p>
     *        <p>
     *        For AWS-predefined documents and SSM documents you created in your account, you only need to specify the
     *        document name. For example, <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @return The document version you want to associate with the target(s). Can be a specific version or the default
     *         version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM documents
     * that use schema version 2.0 or later will fail. In addition, if you use the parameter <code>InstanceId</code>,
     * you cannot use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>, <code>MaxErrors</code>,
     * <code>MaxConcurrency</code>, <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these
     * parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @param instanceId
     *        The instance ID.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *        <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM
     *        documents that use schema version 2.0 or later will fail. In addition, if you use the parameter
     *        <code>InstanceId</code>, you cannot use the parameters <code>AssociationName</code>,
     *        <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *        <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use the
     *        <code>Targets</code> parameter.
     *        </p>
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM documents
     * that use schema version 2.0 or later will fail. In addition, if you use the parameter <code>InstanceId</code>,
     * you cannot use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>, <code>MaxErrors</code>,
     * <code>MaxConcurrency</code>, <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these
     * parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @return The instance ID.</p> <note>
     *         <p>
     *         <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *         <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM
     *         documents that use schema version 2.0 or later will fail. In addition, if you use the parameter
     *         <code>InstanceId</code>, you cannot use the parameters <code>AssociationName</code>,
     *         <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *         <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use
     *         the <code>Targets</code> parameter.
     *         </p>
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM documents
     * that use schema version 2.0 or later will fail. In addition, if you use the parameter <code>InstanceId</code>,
     * you cannot use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>, <code>MaxErrors</code>,
     * <code>MaxConcurrency</code>, <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these
     * parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @param instanceId
     *        The instance ID.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *        <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with SSM
     *        documents that use schema version 2.0 or later will fail. In addition, if you use the parameter
     *        <code>InstanceId</code>, you cannot use the parameters <code>AssociationName</code>,
     *        <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *        <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use the
     *        <code>Targets</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The parameters for the runtime configuration of the document.
     * </p>
     * 
     * @return The parameters for the runtime configuration of the document.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the runtime configuration of the document.
     * </p>
     * 
     * @param parameters
     *        The parameters for the runtime configuration of the document.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the runtime configuration of the document.
     * </p>
     * 
     * @param parameters
     *        The parameters for the runtime configuration of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateAssociationRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
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

    public CreateAssociationRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The targets for the association. You can target instances by using tags, AWS Resource Groups, all instances in an
     * AWS account, or individual instance IDs. For more information about choosing targets for an association, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     * >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @return The targets for the association. You can target instances by using tags, AWS Resource Groups, all
     *         instances in an AWS account, or individual instance IDs. For more information about choosing targets for
     *         an association, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     *         >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets for the association. You can target instances by using tags, AWS Resource Groups, all instances in an
     * AWS account, or individual instance IDs. For more information about choosing targets for an association, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     * >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param targets
     *        The targets for the association. You can target instances by using tags, AWS Resource Groups, all
     *        instances in an AWS account, or individual instance IDs. For more information about choosing targets for
     *        an association, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     *        >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets for the association. You can target instances by using tags, AWS Resource Groups, all instances in an
     * AWS account, or individual instance IDs. For more information about choosing targets for an association, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     * >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets for the association. You can target instances by using tags, AWS Resource Groups, all
     *        instances in an AWS account, or individual instance IDs. For more information about choosing targets for
     *        an association, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     *        >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets for the association. You can target instances by using tags, AWS Resource Groups, all instances in an
     * AWS account, or individual instance IDs. For more information about choosing targets for an association, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     * >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param targets
     *        The targets for the association. You can target instances by using tags, AWS Resource Groups, all
     *        instances in an AWS account, or individual instance IDs. For more information about choosing targets for
     *        an association, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-state-manager-targets-and-rate-controls.html"
     *        >Using targets and rate controls with State Manager associations</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s).
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @return A cron expression when the association will be applied to the target(s).
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @param outputLocation
     *        An S3 bucket where you want to store the output details of the request.
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @return An S3 bucket where you want to store the output details of the request.
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @param outputLocation
     *        An S3 bucket where you want to store the output details of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @param associationName
     *        Specify a descriptive name for the association.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @return Specify a descriptive name for the association.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @param associationName
     *        Specify a descriptive name for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withAssociationName(String associationName) {
        setAssociationName(associationName);
        return this;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for associations that use an Automation document
     * and target resources by using rate controls.
     * </p>
     * 
     * @param automationTargetParameterName
     *        Specify the target for the association. This target is required for associations that use an Automation
     *        document and target resources by using rate controls.
     */

    public void setAutomationTargetParameterName(String automationTargetParameterName) {
        this.automationTargetParameterName = automationTargetParameterName;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for associations that use an Automation document
     * and target resources by using rate controls.
     * </p>
     * 
     * @return Specify the target for the association. This target is required for associations that use an Automation
     *         document and target resources by using rate controls.
     */

    public String getAutomationTargetParameterName() {
        return this.automationTargetParameterName;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for associations that use an Automation document
     * and target resources by using rate controls.
     * </p>
     * 
     * @param automationTargetParameterName
     *        Specify the target for the association. This target is required for associations that use an Automation
     *        document and target resources by using rate controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withAutomationTargetParameterName(String automationTargetParameterName) {
        setAutomationTargetParameterName(automationTargetParameterName);
        return this;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops sending requests to run the association on
     *        additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *        of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *        the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *        error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *        stops sending the request when the sixth error is received.</p>
     *        <p>
     *        Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @return The number of errors that are allowed before the system stops sending requests to run the association on
     *         additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *         of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *         the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *         error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *         stops sending the request when the sixth error is received.</p>
     *         <p>
     *         Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *         some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *         failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops sending requests to run the association on
     *        additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *        of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *        the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *        error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *        stops sending the request when the sixth error is received.</p>
     *        <p>
     *        Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *        for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means
     *        all targets run the association at the same time.</p>
     *        <p>
     *        If a new instance starts and attempts to run an association while Systems Manager is running
     *        MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *        new instance will process its association within the limit specified for MaxConcurrency.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @return The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *         for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which
     *         means all targets run the association at the same time.</p>
     *         <p>
     *         If a new instance starts and attempts to run an association while Systems Manager is running
     *         MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *         new instance will process its association within the limit specified for MaxConcurrency.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *        for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means
     *        all targets run the association at the same time.</p>
     *        <p>
     *        If a new instance starts and attempts to run an association while Systems Manager is running
     *        MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *        new instance will process its association within the limit specified for MaxConcurrency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level to assign to the association.
     * @see AssociationComplianceSeverity
     */

    public void setComplianceSeverity(String complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * 
     * @return The severity level to assign to the association.
     * @see AssociationComplianceSeverity
     */

    public String getComplianceSeverity() {
        return this.complianceSeverity;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level to assign to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationComplianceSeverity
     */

    public CreateAssociationRequest withComplianceSeverity(String complianceSeverity) {
        setComplianceSeverity(complianceSeverity);
        return this;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level to assign to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationComplianceSeverity
     */

    public CreateAssociationRequest withComplianceSeverity(AssociationComplianceSeverity complianceSeverity) {
        this.complianceSeverity = complianceSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>. In
     * <code>AUTO</code> mode, the system uses the status of the association execution to determine the compliance
     * status. If the association execution runs successfully, then the association is <code>COMPLIANT</code>. If the
     * association execution doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     * managed by your direct call to the <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * 
     * @param syncCompliance
     *        The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>.
     *        In <code>AUTO</code> mode, the system uses the status of the association execution to determine the
     *        compliance status. If the association execution runs successfully, then the association is
     *        <code>COMPLIANT</code>. If the association execution doesn't run successfully, the association is
     *        <code>NON-COMPLIANT</code>.</p>
     *        <p>
     *        In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     *        <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     *        managed by your direct call to the <a>PutComplianceItems</a> API action.
     *        </p>
     *        <p>
     *        By default, all associations use <code>AUTO</code> mode.
     * @see AssociationSyncCompliance
     */

    public void setSyncCompliance(String syncCompliance) {
        this.syncCompliance = syncCompliance;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>. In
     * <code>AUTO</code> mode, the system uses the status of the association execution to determine the compliance
     * status. If the association execution runs successfully, then the association is <code>COMPLIANT</code>. If the
     * association execution doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     * managed by your direct call to the <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * 
     * @return The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>.
     *         In <code>AUTO</code> mode, the system uses the status of the association execution to determine the
     *         compliance status. If the association execution runs successfully, then the association is
     *         <code>COMPLIANT</code>. If the association execution doesn't run successfully, the association is
     *         <code>NON-COMPLIANT</code>.</p>
     *         <p>
     *         In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     *         <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It
     *         is managed by your direct call to the <a>PutComplianceItems</a> API action.
     *         </p>
     *         <p>
     *         By default, all associations use <code>AUTO</code> mode.
     * @see AssociationSyncCompliance
     */

    public String getSyncCompliance() {
        return this.syncCompliance;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>. In
     * <code>AUTO</code> mode, the system uses the status of the association execution to determine the compliance
     * status. If the association execution runs successfully, then the association is <code>COMPLIANT</code>. If the
     * association execution doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     * managed by your direct call to the <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * 
     * @param syncCompliance
     *        The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>.
     *        In <code>AUTO</code> mode, the system uses the status of the association execution to determine the
     *        compliance status. If the association execution runs successfully, then the association is
     *        <code>COMPLIANT</code>. If the association execution doesn't run successfully, the association is
     *        <code>NON-COMPLIANT</code>.</p>
     *        <p>
     *        In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     *        <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     *        managed by your direct call to the <a>PutComplianceItems</a> API action.
     *        </p>
     *        <p>
     *        By default, all associations use <code>AUTO</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationSyncCompliance
     */

    public CreateAssociationRequest withSyncCompliance(String syncCompliance) {
        setSyncCompliance(syncCompliance);
        return this;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>. In
     * <code>AUTO</code> mode, the system uses the status of the association execution to determine the compliance
     * status. If the association execution runs successfully, then the association is <code>COMPLIANT</code>. If the
     * association execution doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     * managed by your direct call to the <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * 
     * @param syncCompliance
     *        The mode for generating association compliance. You can specify <code>AUTO</code> or <code>MANUAL</code>.
     *        In <code>AUTO</code> mode, the system uses the status of the association execution to determine the
     *        compliance status. If the association execution runs successfully, then the association is
     *        <code>COMPLIANT</code>. If the association execution doesn't run successfully, the association is
     *        <code>NON-COMPLIANT</code>.</p>
     *        <p>
     *        In <code>MANUAL</code> mode, you must specify the <code>AssociationId</code> as a parameter for the
     *        <a>PutComplianceItems</a> API action. In this case, compliance data is not managed by State Manager. It is
     *        managed by your direct call to the <a>PutComplianceItems</a> API action.
     *        </p>
     *        <p>
     *        By default, all associations use <code>AUTO</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationSyncCompliance
     */

    public CreateAssociationRequest withSyncCompliance(AssociationSyncCompliance syncCompliance) {
        this.syncCompliance = syncCompliance.toString();
        return this;
    }

    /**
     * <p>
     * By default, when you create a new associations, the system runs it immediately after it is created and then
     * according to the schedule you specified. Specify this option if you don't want an association to run immediately
     * after you create it. This parameter is not supported for rate expressions.
     * </p>
     * 
     * @param applyOnlyAtCronInterval
     *        By default, when you create a new associations, the system runs it immediately after it is created and
     *        then according to the schedule you specified. Specify this option if you don't want an association to run
     *        immediately after you create it. This parameter is not supported for rate expressions.
     */

    public void setApplyOnlyAtCronInterval(Boolean applyOnlyAtCronInterval) {
        this.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
    }

    /**
     * <p>
     * By default, when you create a new associations, the system runs it immediately after it is created and then
     * according to the schedule you specified. Specify this option if you don't want an association to run immediately
     * after you create it. This parameter is not supported for rate expressions.
     * </p>
     * 
     * @return By default, when you create a new associations, the system runs it immediately after it is created and
     *         then according to the schedule you specified. Specify this option if you don't want an association to run
     *         immediately after you create it. This parameter is not supported for rate expressions.
     */

    public Boolean getApplyOnlyAtCronInterval() {
        return this.applyOnlyAtCronInterval;
    }

    /**
     * <p>
     * By default, when you create a new associations, the system runs it immediately after it is created and then
     * according to the schedule you specified. Specify this option if you don't want an association to run immediately
     * after you create it. This parameter is not supported for rate expressions.
     * </p>
     * 
     * @param applyOnlyAtCronInterval
     *        By default, when you create a new associations, the system runs it immediately after it is created and
     *        then according to the schedule you specified. Specify this option if you don't want an association to run
     *        immediately after you create it. This parameter is not supported for rate expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withApplyOnlyAtCronInterval(Boolean applyOnlyAtCronInterval) {
        setApplyOnlyAtCronInterval(applyOnlyAtCronInterval);
        return this;
    }

    /**
     * <p>
     * By default, when you create a new associations, the system runs it immediately after it is created and then
     * according to the schedule you specified. Specify this option if you don't want an association to run immediately
     * after you create it. This parameter is not supported for rate expressions.
     * </p>
     * 
     * @return By default, when you create a new associations, the system runs it immediately after it is created and
     *         then according to the schedule you specified. Specify this option if you don't want an association to run
     *         immediately after you create it. This parameter is not supported for rate expressions.
     */

    public Boolean isApplyOnlyAtCronInterval() {
        return this.applyOnlyAtCronInterval;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use this
     * action to create an association in multiple Regions and multiple accounts.
     * </p>
     * 
     * @return A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use
     *         this action to create an association in multiple Regions and multiple accounts.
     */

    public java.util.List<TargetLocation> getTargetLocations() {
        if (targetLocations == null) {
            targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>();
        }
        return targetLocations;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use this
     * action to create an association in multiple Regions and multiple accounts.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use
     *        this action to create an association in multiple Regions and multiple accounts.
     */

    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use this
     * action to create an association in multiple Regions and multiple accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLocations(java.util.Collection)} or {@link #withTargetLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use
     *        this action to create an association in multiple Regions and multiple accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargetLocations(TargetLocation... targetLocations) {
        if (this.targetLocations == null) {
            setTargetLocations(new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations.length));
        }
        for (TargetLocation ele : targetLocations) {
            this.targetLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use this
     * action to create an association in multiple Regions and multiple accounts.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and AWS accounts where you want to run the association. Use
     *        this action to create an association in multiple Regions and multiple accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName()).append(",");
        if (getAutomationTargetParameterName() != null)
            sb.append("AutomationTargetParameterName: ").append(getAutomationTargetParameterName()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getComplianceSeverity() != null)
            sb.append("ComplianceSeverity: ").append(getComplianceSeverity()).append(",");
        if (getSyncCompliance() != null)
            sb.append("SyncCompliance: ").append(getSyncCompliance()).append(",");
        if (getApplyOnlyAtCronInterval() != null)
            sb.append("ApplyOnlyAtCronInterval: ").append(getApplyOnlyAtCronInterval()).append(",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: ").append(getTargetLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationRequest == false)
            return false;
        CreateAssociationRequest other = (CreateAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        if (other.getAutomationTargetParameterName() == null ^ this.getAutomationTargetParameterName() == null)
            return false;
        if (other.getAutomationTargetParameterName() != null
                && other.getAutomationTargetParameterName().equals(this.getAutomationTargetParameterName()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getComplianceSeverity() == null ^ this.getComplianceSeverity() == null)
            return false;
        if (other.getComplianceSeverity() != null && other.getComplianceSeverity().equals(this.getComplianceSeverity()) == false)
            return false;
        if (other.getSyncCompliance() == null ^ this.getSyncCompliance() == null)
            return false;
        if (other.getSyncCompliance() != null && other.getSyncCompliance().equals(this.getSyncCompliance()) == false)
            return false;
        if (other.getApplyOnlyAtCronInterval() == null ^ this.getApplyOnlyAtCronInterval() == null)
            return false;
        if (other.getApplyOnlyAtCronInterval() != null && other.getApplyOnlyAtCronInterval().equals(this.getApplyOnlyAtCronInterval()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        hashCode = prime * hashCode + ((getAutomationTargetParameterName() == null) ? 0 : getAutomationTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getComplianceSeverity() == null) ? 0 : getComplianceSeverity().hashCode());
        hashCode = prime * hashCode + ((getSyncCompliance() == null) ? 0 : getSyncCompliance().hashCode());
        hashCode = prime * hashCode + ((getApplyOnlyAtCronInterval() == null) ? 0 : getApplyOnlyAtCronInterval().hashCode());
        hashCode = prime * hashCode + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationRequest clone() {
        return (CreateAssociationRequest) super.clone();
    }

}
