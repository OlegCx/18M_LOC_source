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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RegisterType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of extension.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension being registered.
     * </p>
     * <p>
     * We recommend that extension names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in your extension names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String typeName;
    /**
     * <p>
     * A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     * extension you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the extension you want to register, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     * in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The user registering the extension must be able to access the package in the S3 bucket. That is, the user needs
     * to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a> permissions
     * for the schema handler package. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     */
    private String schemaHandlerPackage;
    /**
     * <p>
     * Specifies logging configuration information for an extension.
     * </p>
     */
    private LoggingConfig loggingConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension. If your
     * extension calls AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account. When
     * CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a
     * temporary session token, which it then passes to the extension handler, thereby supplying your extension with the
     * appropriate credentials.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request
     * token prevents CloudFormation from generating more than one version of an extension from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @return The kind of extension.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public RegisterTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public RegisterTypeRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension being registered.
     * </p>
     * <p>
     * We recommend that extension names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in your extension names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param typeName
     *        The name of the extension being registered.</p>
     *        <p>
     *        We recommend that extension names adhere to the following pattern:
     *        <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The following organization namespaces are reserved and cannot be used in your extension names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Alexa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMZN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Custom</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dev</code>
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension being registered.
     * </p>
     * <p>
     * We recommend that extension names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in your extension names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The name of the extension being registered.</p>
     *         <p>
     *         We recommend that extension names adhere to the following pattern:
     *         <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The following organization namespaces are reserved and cannot be used in your extension names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Alexa</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AMZN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Amazon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Custom</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dev</code>
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension being registered.
     * </p>
     * <p>
     * We recommend that extension names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in your extension names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param typeName
     *        The name of the extension being registered.</p>
     *        <p>
     *        We recommend that extension names adhere to the following pattern:
     *        <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The following organization namespaces are reserved and cannot be used in your extension names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Alexa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMZN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Custom</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dev</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     * extension you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the extension you want to register, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     * in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The user registering the extension must be able to access the package in the S3 bucket. That is, the user needs
     * to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a> permissions
     * for the schema handler package. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param schemaHandlerPackage
     *        A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     *        extension you want to register.</p>
     *        <p>
     *        For information on generating a schema handler package for the extension you want to register, see <a
     *        href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     *        in the <i>CloudFormation CLI User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The user registering the extension must be able to access the package in the S3 bucket. That is, the user
     *        needs to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     *        permissions for the schema handler package. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and
     *        Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     *        </p>
     */

    public void setSchemaHandlerPackage(String schemaHandlerPackage) {
        this.schemaHandlerPackage = schemaHandlerPackage;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     * extension you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the extension you want to register, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     * in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The user registering the extension must be able to access the package in the S3 bucket. That is, the user needs
     * to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a> permissions
     * for the schema handler package. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @return A url to the S3 bucket containing the extension project package that contains the neccessary files for
     *         the extension you want to register.</p>
     *         <p>
     *         For information on generating a schema handler package for the extension you want to register, see <a
     *         href
     *         ="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit
     *         </a> in the <i>CloudFormation CLI User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The user registering the extension must be able to access the package in the S3 bucket. That is, the user
     *         needs to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     *         permissions for the schema handler package. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and
     *         Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     *         </p>
     */

    public String getSchemaHandlerPackage() {
        return this.schemaHandlerPackage;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     * extension you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the extension you want to register, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     * in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The user registering the extension must be able to access the package in the S3 bucket. That is, the user needs
     * to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a> permissions
     * for the schema handler package. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param schemaHandlerPackage
     *        A url to the S3 bucket containing the extension project package that contains the neccessary files for the
     *        extension you want to register.</p>
     *        <p>
     *        For information on generating a schema handler package for the extension you want to register, see <a
     *        href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html">submit</a>
     *        in the <i>CloudFormation CLI User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The user registering the extension must be able to access the package in the S3 bucket. That is, the user
     *        needs to have <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     *        permissions for the schema handler package. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html">Actions, Resources, and
     *        Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTypeRequest withSchemaHandlerPackage(String schemaHandlerPackage) {
        setSchemaHandlerPackage(schemaHandlerPackage);
        return this;
    }

    /**
     * <p>
     * Specifies logging configuration information for an extension.
     * </p>
     * 
     * @param loggingConfig
     *        Specifies logging configuration information for an extension.
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * Specifies logging configuration information for an extension.
     * </p>
     * 
     * @return Specifies logging configuration information for an extension.
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * <p>
     * Specifies logging configuration information for an extension.
     * </p>
     * 
     * @param loggingConfig
     *        Specifies logging configuration information for an extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTypeRequest withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension. If your
     * extension calls AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account. When
     * CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a
     * temporary session token, which it then passes to the extension handler, thereby supplying your extension with the
     * appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension.
     *        If your extension calls AWS APIs in any of its handlers, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution
     *        role to create a temporary session token, which it then passes to the extension handler, thereby supplying
     *        your extension with the appropriate credentials.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension. If your
     * extension calls AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account. When
     * CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a
     * temporary session token, which it then passes to the extension handler, thereby supplying your extension with the
     * appropriate credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension.
     *         If your extension calls AWS APIs in any of its handlers, you must create an <i> <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *         includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *         account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution
     *         role to create a temporary session token, which it then passes to the extension handler, thereby
     *         supplying your extension with the appropriate credentials.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension. If your
     * extension calls AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account. When
     * CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a
     * temporary session token, which it then passes to the extension handler, thereby supplying your extension with the
     * appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension.
     *        If your extension calls AWS APIs in any of its handlers, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution
     *        role to create a temporary session token, which it then passes to the extension handler, thereby supplying
     *        your extension with the appropriate credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTypeRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request
     * token prevents CloudFormation from generating more than one version of an extension from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier that acts as an idempotency key for this registration request. Specifying a client
     *        request token prevents CloudFormation from generating more than one version of an extension from the same
     *        registeration request, even if the request is submitted multiple times.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request
     * token prevents CloudFormation from generating more than one version of an extension from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * 
     * @return A unique identifier that acts as an idempotency key for this registration request. Specifying a client
     *         request token prevents CloudFormation from generating more than one version of an extension from the same
     *         registeration request, even if the request is submitted multiple times.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request
     * token prevents CloudFormation from generating more than one version of an extension from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier that acts as an idempotency key for this registration request. Specifying a client
     *        request token prevents CloudFormation from generating more than one version of an extension from the same
     *        registeration request, even if the request is submitted multiple times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTypeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getSchemaHandlerPackage() != null)
            sb.append("SchemaHandlerPackage: ").append(getSchemaHandlerPackage()).append(",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: ").append(getLoggingConfig()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTypeRequest == false)
            return false;
        RegisterTypeRequest other = (RegisterTypeRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSchemaHandlerPackage() == null ^ this.getSchemaHandlerPackage() == null)
            return false;
        if (other.getSchemaHandlerPackage() != null && other.getSchemaHandlerPackage().equals(this.getSchemaHandlerPackage()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getSchemaHandlerPackage() == null) ? 0 : getSchemaHandlerPackage().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTypeRequest clone() {
        return (RegisterTypeRequest) super.clone();
    }

}
