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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentEC2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentEC2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the environment to create.
     * </p>
     * <p>
     * This name is visible to other AWS IAM users in the same AWS account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the environment to create.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client Tokens</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI for
     * the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.
     * </p>
     * <p>
     * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     * </p>
     * <p>
     * <b>AMI aliases </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SSM paths</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     */
    private String imageId;
    /**
     * <p>
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * </p>
     */
    private Integer automaticStopTimeMinutes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If
     * this value is not specified, the ARN defaults to this environment's creator.
     * </p>
     */
    private String ownerArn;
    /**
     * <p>
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are <code>CONNECT_SSH</code>
     * (default) and <code>CONNECT_SSM</code> (connected through AWS Systems Manager).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing
     * no-ingress EC2 instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * </p>
     */
    private String connectionType;

    /**
     * <p>
     * The name of the environment to create.
     * </p>
     * <p>
     * This name is visible to other AWS IAM users in the same AWS account.
     * </p>
     * 
     * @param name
     *        The name of the environment to create.</p>
     *        <p>
     *        This name is visible to other AWS IAM users in the same AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment to create.
     * </p>
     * <p>
     * This name is visible to other AWS IAM users in the same AWS account.
     * </p>
     * 
     * @return The name of the environment to create.</p>
     *         <p>
     *         This name is visible to other AWS IAM users in the same AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment to create.
     * </p>
     * <p>
     * This name is visible to other AWS IAM users in the same AWS account.
     * </p>
     * 
     * @param name
     *        The name of the environment to create.</p>
     *        <p>
     *        This name is visible to other AWS IAM users in the same AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the environment to create.
     * </p>
     * 
     * @param description
     *        The description of the environment to create.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment to create.
     * </p>
     * 
     * @return The description of the environment to create.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment to create.
     * </p>
     * 
     * @param description
     *        The description of the environment to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client Tokens</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one
     *        time.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client
     *        Tokens</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client Tokens</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one
     *         time.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client
     *         Tokens</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client Tokens</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one
     *        time.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Client
     *        Tokens</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     * </p>
     * 
     * @param instanceType
     *        The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     * </p>
     * 
     * @return The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     * </p>
     * 
     * @param instanceType
     *        The type of instance to connect to the environment (for example, <code>t2.micro</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * </p>
     * 
     * @return The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI for
     * the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.
     * </p>
     * <p>
     * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     * </p>
     * <p>
     * <b>AMI aliases </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SSM paths</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageId
     *        The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI
     *        for the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.</p>
     *        <p>
     *        The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     *        </p>
     *        <p>
     *        <b>AMI aliases </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SSM paths</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     *        </p>
     *        </li>
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI for
     * the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.
     * </p>
     * <p>
     * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     * </p>
     * <p>
     * <b>AMI aliases </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SSM paths</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an
     *         AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.</p>
     *         <p>
     *         The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     *         </p>
     *         <p>
     *         <b>AMI aliases </b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SSM paths</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     *         </p>
     *         </li>
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI for
     * the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.
     * </p>
     * <p>
     * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     * </p>
     * <p>
     * <b>AMI aliases </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SSM paths</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageId
     *        The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI
     *        for the instance, you must specify a valid AMI alias or a valid AWS Systems Manager (SSM) path.</p>
     *        <p>
     *        The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     *        </p>
     *        <p>
     *        <b>AMI aliases </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Linux (default): <code>amazonlinux-1-x86_64</code> </b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Linux 2: <code>amazonlinux-2-x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ubuntu 18.04: <code>ubuntu-18.04-x86_64</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SSM paths</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Linux (default): <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64</code> </b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Linux 2: <code>resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ubuntu 18.04: <code>resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * </p>
     * 
     * @param automaticStopTimeMinutes
     *        The number of minutes until the running instance is shut down after the environment has last been used.
     */

    public void setAutomaticStopTimeMinutes(Integer automaticStopTimeMinutes) {
        this.automaticStopTimeMinutes = automaticStopTimeMinutes;
    }

    /**
     * <p>
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * </p>
     * 
     * @return The number of minutes until the running instance is shut down after the environment has last been used.
     */

    public Integer getAutomaticStopTimeMinutes() {
        return this.automaticStopTimeMinutes;
    }

    /**
     * <p>
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * </p>
     * 
     * @param automaticStopTimeMinutes
     *        The number of minutes until the running instance is shut down after the environment has last been used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withAutomaticStopTimeMinutes(Integer automaticStopTimeMinutes) {
        setAutomaticStopTimeMinutes(automaticStopTimeMinutes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If
     * this value is not specified, the ARN defaults to this environment's creator.
     * </p>
     * 
     * @param ownerArn
     *        The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal.
     *        If this value is not specified, the ARN defaults to this environment's creator.
     */

    public void setOwnerArn(String ownerArn) {
        this.ownerArn = ownerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If
     * this value is not specified, the ARN defaults to this environment's creator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM
     *         principal. If this value is not specified, the ARN defaults to this environment's creator.
     */

    public String getOwnerArn() {
        return this.ownerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If
     * this value is not specified, the ARN defaults to this environment's creator.
     * </p>
     * 
     * @param ownerArn
     *        The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal.
     *        If this value is not specified, the ARN defaults to this environment's creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withOwnerArn(String ownerArn) {
        setOwnerArn(ownerArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * </p>
     * 
     * @return An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
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
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withTags(Tag... tags) {
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
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentEC2Request withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are <code>CONNECT_SSH</code>
     * (default) and <code>CONNECT_SSM</code> (connected through AWS Systems Manager).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing
     * no-ingress EC2 instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. Valid values are
     *        <code>CONNECT_SSH</code> (default) and <code>CONNECT_SSM</code> (connected through AWS Systems
     *        Manager).</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing no-ingress EC2
     *        instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are <code>CONNECT_SSH</code>
     * (default) and <code>CONNECT_SSM</code> (connected through AWS Systems Manager).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing
     * no-ingress EC2 instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * </p>
     * 
     * @return The connection type used for connecting to an Amazon EC2 environment. Valid values are
     *         <code>CONNECT_SSH</code> (default) and <code>CONNECT_SSM</code> (connected through AWS Systems
     *         Manager).</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing no-ingress EC2
     *         instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are <code>CONNECT_SSH</code>
     * (default) and <code>CONNECT_SSM</code> (connected through AWS Systems Manager).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing
     * no-ingress EC2 instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. Valid values are
     *        <code>CONNECT_SSH</code> (default) and <code>CONNECT_SSM</code> (connected through AWS Systems
     *        Manager).</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing no-ingress EC2
     *        instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateEnvironmentEC2Request withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are <code>CONNECT_SSH</code>
     * (default) and <code>CONNECT_SSM</code> (connected through AWS Systems Manager).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing
     * no-ingress EC2 instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. Valid values are
     *        <code>CONNECT_SSH</code> (default) and <code>CONNECT_SSM</code> (connected through AWS Systems
     *        Manager).</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html">Accessing no-ingress EC2
     *        instances with AWS Systems Manager</a> in the <i>AWS Cloud9 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateEnvironmentEC2Request withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getAutomaticStopTimeMinutes() != null)
            sb.append("AutomaticStopTimeMinutes: ").append(getAutomaticStopTimeMinutes()).append(",");
        if (getOwnerArn() != null)
            sb.append("OwnerArn: ").append(getOwnerArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentEC2Request == false)
            return false;
        CreateEnvironmentEC2Request other = (CreateEnvironmentEC2Request) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getAutomaticStopTimeMinutes() == null ^ this.getAutomaticStopTimeMinutes() == null)
            return false;
        if (other.getAutomaticStopTimeMinutes() != null && other.getAutomaticStopTimeMinutes().equals(this.getAutomaticStopTimeMinutes()) == false)
            return false;
        if (other.getOwnerArn() == null ^ this.getOwnerArn() == null)
            return false;
        if (other.getOwnerArn() != null && other.getOwnerArn().equals(this.getOwnerArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticStopTimeMinutes() == null) ? 0 : getAutomaticStopTimeMinutes().hashCode());
        hashCode = prime * hashCode + ((getOwnerArn() == null) ? 0 : getOwnerArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentEC2Request clone() {
        return (CreateEnvironmentEC2Request) super.clone();
    }

}
