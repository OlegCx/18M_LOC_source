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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateStack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The stack's new name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more user-defined key-value pairs to be added to the stack attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * Do not use this parameter. You cannot update a stack's service role.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     */
    private String defaultInstanceProfileArn;
    /**
     * <p>
     * The stack's operating system, which must be set to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     * <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     * <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information about how to use custom AMIs with OpsWorks, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the stack's current operating system. For more information about supported operating
     * systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Stacks Operating Systems</a>.
     * </p>
     */
    private String defaultOs;
    /**
     * <p>
     * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities_and_Titans</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     */
    private String hostnameTheme;
    /**
     * <p>
     * The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see
     * <a>CreateStack</a>.
     * </p>
     */
    private String defaultAvailabilityZone;
    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     */
    private String defaultSubnetId;
    /**
     * <p>
     * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack
     * configuration JSON values or to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify
     * the Stack Configuration Attributes</a>.
     * </p>
     */
    private String customJson;
    /**
     * <p>
     * The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     * specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for
     * Linux stacks is currently 12.
     * </p>
     */
    private StackConfigurationManager configurationManager;
    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     */
    private ChefConfiguration chefConfiguration;
    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     */
    private Boolean useCustomCookbooks;
    /**
     * <p>
     * Contains the information required to retrieve an app or cookbook from a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding Apps</a> or <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks and Recipes</a>.
     * </p>
     */
    private Source customCookbooksSource;
    /**
     * <p>
     * A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair name, AWS
     * OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log
     * in to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH Access</a>.
     * You can override this setting by specifying a different key pair, or no key pair, when you <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an instance</a>.
     * </p>
     */
    private String defaultSshKeyName;
    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     */
    private String defaultRootDeviceType;
    /**
     * <p>
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated
     * with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own custom security
     * groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer
     * (default setting). You can associate additional security groups with a layer after you create it, but you cannot
     * delete the built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate
     * EC2 security groups and associate a security group with each layer that you create. However, you can still
     * manually associate a built-in security group with a layer on. Custom security groups are required only for those
     * layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     */
    private Boolean useOpsworksSecurityGroups;
    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new agent
     * versions on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version
     * on the stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     */
    private String agentVersion;

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The stack's new name.
     * </p>
     * 
     * @param name
     *        The stack's new name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The stack's new name.
     * </p>
     * 
     * @return The stack's new name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The stack's new name.
     * </p>
     * 
     * @param name
     *        The stack's new name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more user-defined key-value pairs to be added to the stack attributes.
     * </p>
     * 
     * @return One or more user-defined key-value pairs to be added to the stack attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * One or more user-defined key-value pairs to be added to the stack attributes.
     * </p>
     * 
     * @param attributes
     *        One or more user-defined key-value pairs to be added to the stack attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * One or more user-defined key-value pairs to be added to the stack attributes.
     * </p>
     * 
     * @param attributes
     *        One or more user-defined key-value pairs to be added to the stack attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see UpdateStackRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Do not use this parameter. You cannot update a stack's service role.
     * </p>
     * 
     * @param serviceRoleArn
     *        Do not use this parameter. You cannot update a stack's service role.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * Do not use this parameter. You cannot update a stack's service role.
     * </p>
     * 
     * @return Do not use this parameter. You cannot update a stack's service role.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * Do not use this parameter. You cannot update a stack's service role.
     * </p>
     * 
     * @param serviceRoleArn
     *        Do not use this parameter. You cannot update a stack's service role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *        information about IAM ARNs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @return The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *         information about IAM ARNs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public String getDefaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *        information about IAM ARNs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        setDefaultInstanceProfileArn(defaultInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     * <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     * <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information about how to use custom AMIs with OpsWorks, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the stack's current operating system. For more information about supported operating
     * systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Stacks Operating Systems</a>.
     * </p>
     * 
     * @param defaultOs
     *        The stack's operating system, which must be set to one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     *        <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     *        <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *        For more information about how to use custom AMIs with OpsWorks, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default option is the stack's current operating system. For more information about supported operating
     *        systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *        OpsWorks Stacks Operating Systems</a>.
     */

    public void setDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     * <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     * <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information about how to use custom AMIs with OpsWorks, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the stack's current operating system. For more information about supported operating
     * systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Stacks Operating Systems</a>.
     * </p>
     * 
     * @return The stack's operating system, which must be set to one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     *         <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     *         <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or
     *         <code>Amazon Linux 2015.03</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>
     *         , or <code>Ubuntu 12.04 LTS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CentOS Linux 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Red Hat Enterprise Linux 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *         For more information about how to use custom AMIs with OpsWorks, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default option is the stack's current operating system. For more information about supported
     *         operating systems, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *         Operating Systems</a>.
     */

    public String getDefaultOs() {
        return this.defaultOs;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     * <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     * <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information about how to use custom AMIs with OpsWorks, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the stack's current operating system. For more information about supported operating
     * systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Stacks Operating Systems</a>.
     * </p>
     * 
     * @param defaultOs
     *        The stack's operating system, which must be set to one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2018.03</code>,
     *        <code>Amazon Linux 2017.09</code>, <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>,
     *        <code>Amazon Linux 2016.03</code>, <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *        For more information about how to use custom AMIs with OpsWorks, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default option is the stack's current operating system. For more information about supported operating
     *        systems, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *        OpsWorks Stacks Operating Systems</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDefaultOs(String defaultOs) {
        setDefaultOs(defaultOs);
        return this;
    }

    /**
     * <p>
     * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities_and_Titans</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host
     *        names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *        <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *        The other themes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Baked_Goods</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Clouds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Europe_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fruits</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Greek_Deities_and_Titans</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Legendary_creatures_from_Japan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Planets_and_Moons</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Roman_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Scottish_Islands</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>US_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Wild_Cats</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *        on the current theme.
     */

    public void setHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }

    /**
     * <p>
     * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities_and_Titans</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @return The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host
     *         names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *         <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *         The other themes are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Baked_Goods</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Clouds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Europe_Cities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fruits</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Greek_Deities_and_Titans</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Legendary_creatures_from_Japan</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Planets_and_Moons</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Roman_Deities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Scottish_Islands</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>US_Cities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Wild_Cats</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *         on the current theme.
     */

    public String getHostnameTheme() {
        return this.hostnameTheme;
    }

    /**
     * <p>
     * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities_and_Titans</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host
     *        names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *        <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *        The other themes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Baked_Goods</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Clouds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Europe_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fruits</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Greek_Deities_and_Titans</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Legendary_creatures_from_Japan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Planets_and_Moons</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Roman_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Scottish_Islands</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>US_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Wild_Cats</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *        on the current theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withHostnameTheme(String hostnameTheme) {
        setHostnameTheme(hostnameTheme);
        return this;
    }

    /**
     * <p>
     * The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see
     * <a>CreateStack</a>.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also
     *        specify a value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more
     *        information, see <a>CreateStack</a>.
     */

    public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    /**
     * <p>
     * The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see
     * <a>CreateStack</a>.
     * </p>
     * 
     * @return The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also
     *         specify a value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more
     *         information, see <a>CreateStack</a>.
     */

    public String getDefaultAvailabilityZone() {
        return this.defaultAvailabilityZone;
    }

    /**
     * <p>
     * The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see
     * <a>CreateStack</a>.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The stack's default Availability Zone, which must be in the stack's region. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also
     *        specify a value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more
     *        information, see <a>CreateStack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDefaultAvailabilityZone(String defaultAvailabilityZone) {
        setDefaultAvailabilityZone(defaultAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @param defaultSubnetId
     *        The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *        <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *        when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *        subnet must be in that zone. For information on default values and when this parameter is required, see
     *        the <code>VpcId</code> parameter description.
     */

    public void setDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @return The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *         <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *         when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *         subnet must be in that zone. For information on default values and when this parameter is required, see
     *         the <code>VpcId</code> parameter description.
     */

    public String getDefaultSubnetId() {
        return this.defaultSubnetId;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @param defaultSubnetId
     *        The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *        <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *        when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *        subnet must be in that zone. For information on default values and when this parameter is required, see
     *        the <code>VpcId</code> parameter description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDefaultSubnetId(String defaultSubnetId) {
        setDefaultSubnetId(defaultSubnetId);
        return this;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack
     * configuration JSON values or to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify
     * the Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It can be used to override the corresponding default
     *        stack configuration JSON values or to pass data to recipes. The string should be in the following
     *        format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information about custom JSON, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack
     * configuration JSON values or to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify
     * the Stack Configuration Attributes</a>.
     * </p>
     * 
     * @return A string that contains user-defined, custom JSON. It can be used to override the corresponding default
     *         stack configuration JSON values or to pass data to recipes. The string should be in the following
     *         format:</p>
     *         <p>
     *         <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *         </p>
     *         <p>
     *         For more information about custom JSON, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *         Modify the Stack Configuration Attributes</a>.
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack
     * configuration JSON values or to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify
     * the Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It can be used to override the corresponding default
     *        stack configuration JSON values or to pass data to recipes. The string should be in the following
     *        format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information about custom JSON, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withCustomJson(String customJson) {
        setCustomJson(customJson);
        return this;
    }

    /**
     * <p>
     * The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     * specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for
     * Linux stacks is currently 12.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     *        specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *        value for Linux stacks is currently 12.
     */

    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    /**
     * <p>
     * The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     * specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for
     * Linux stacks is currently 12.
     * </p>
     * 
     * @return The configuration manager. When you update a stack, we recommend that you use the configuration manager
     *         to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *         value for Linux stacks is currently 12.
     */

    public StackConfigurationManager getConfigurationManager() {
        return this.configurationManager;
    }

    /**
     * <p>
     * The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     * specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for
     * Linux stacks is currently 12.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager. When you update a stack, we recommend that you use the configuration manager to
     *        specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *        value for Linux stacks is currently 12.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withConfigurationManager(StackConfigurationManager configurationManager) {
        setConfigurationManager(configurationManager);
        return this;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version on Chef 11.10 stacks. For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     */

    public void setChefConfiguration(ChefConfiguration chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *         version on Chef 11.10 stacks. For more information, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public ChefConfiguration getChefConfiguration() {
        return this.chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version on Chef 11.10 stacks. For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withChefConfiguration(ChefConfiguration chefConfiguration) {
        setChefConfiguration(chefConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether the stack uses custom cookbooks.
     */

    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @return Whether the stack uses custom cookbooks.
     */

    public Boolean getUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether the stack uses custom cookbooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withUseCustomCookbooks(Boolean useCustomCookbooks) {
        setUseCustomCookbooks(useCustomCookbooks);
        return this;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @return Whether the stack uses custom cookbooks.
     */

    public Boolean isUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Contains the information required to retrieve an app or cookbook from a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding Apps</a> or <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks and Recipes</a>.
     * </p>
     * 
     * @param customCookbooksSource
     *        Contains the information required to retrieve an app or cookbook from a repository. For more information,
     *        see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding
     *        Apps</a> or <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks
     *        and Recipes</a>.
     */

    public void setCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }

    /**
     * <p>
     * Contains the information required to retrieve an app or cookbook from a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding Apps</a> or <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks and Recipes</a>.
     * </p>
     * 
     * @return Contains the information required to retrieve an app or cookbook from a repository. For more information,
     *         see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding
     *         Apps</a> or <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks and
     *         Recipes</a>.
     */

    public Source getCustomCookbooksSource() {
        return this.customCookbooksSource;
    }

    /**
     * <p>
     * Contains the information required to retrieve an app or cookbook from a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding Apps</a> or <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks and Recipes</a>.
     * </p>
     * 
     * @param customCookbooksSource
     *        Contains the information required to retrieve an app or cookbook from a repository. For more information,
     *        see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Adding
     *        Apps</a> or <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Cookbooks
     *        and Recipes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withCustomCookbooksSource(Source customCookbooksSource) {
        setCustomCookbooksSource(customCookbooksSource);
        return this;
    }

    /**
     * <p>
     * A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair name, AWS
     * OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log
     * in to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH Access</a>.
     * You can override this setting by specifying a different key pair, or no key pair, when you <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an instance</a>.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair
     *        name, AWS OpsWorks Stacks installs the public key on the instance and you can use the private key with an
     *        SSH client to log in to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *        Communicate with an Instance</a> and <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *        Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *        instance</a>.
     */

    public void setDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair name, AWS
     * OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log
     * in to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH Access</a>.
     * You can override this setting by specifying a different key pair, or no key pair, when you <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an instance</a>.
     * </p>
     * 
     * @return A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair
     *         name, AWS OpsWorks Stacks installs the public key on the instance and you can use the private key with an
     *         SSH client to log in to the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *         Communicate with an Instance</a> and <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *         Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *         instance</a>.
     */

    public String getDefaultSshKeyName() {
        return this.defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair name, AWS
     * OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log
     * in to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH Access</a>.
     * You can override this setting by specifying a different key pair, or no key pair, when you <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an instance</a>.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key-pair name. The default value is <code>none</code>. If you specify a key-pair
     *        name, AWS OpsWorks Stacks installs the public key on the instance and you can use the private key with an
     *        SSH client to log in to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *        Communicate with an Instance</a> and <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *        Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *        instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDefaultSshKeyName(String defaultSshKeyName) {
        setDefaultSshKeyName(defaultSshKeyName);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     * 
     * @return The default root device type. This value is used by default for all instances in the stack, but you can
     *         override it when you create an instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *         >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public String getDefaultRootDeviceType() {
        return this.defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public UpdateStackRequest withDefaultRootDeviceType(String defaultRootDeviceType) {
        setDefaultRootDeviceType(defaultRootDeviceType);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        withDefaultRootDeviceType(defaultRootDeviceType);
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     * >Storage for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public UpdateStackRequest withDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated
     * with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own custom security
     * groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer
     * (default setting). You can associate additional security groups with a layer after you create it, but you cannot
     * delete the built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate
     * EC2 security groups and associate a security group with each layer that you create. However, you can still
     * manually associate a built-in security group with a layer on. Custom security groups are required only for those
     * layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.</p>
     *        <p>
     *        AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are
     *        associated with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own
     *        custom security groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has
     *        the following settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each
     *        layer (default setting). You can associate additional security groups with a layer after you create it,
     *        but you cannot delete the built-in security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create
     *        appropriate EC2 security groups and associate a security group with each layer that you create. However,
     *        you can still manually associate a built-in security group with a layer on. Custom security groups are
     *        required only for those layers that need custom settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     */

    public void setUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated
     * with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own custom security
     * groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer
     * (default setting). You can associate additional security groups with a layer after you create it, but you cannot
     * delete the built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate
     * EC2 security groups and associate a security group with each layer that you create. However, you can still
     * manually associate a built-in security group with a layer on. Custom security groups are required only for those
     * layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.</p>
     *         <p>
     *         AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are
     *         associated with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own
     *         custom security groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has
     *         the following settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each
     *         layer (default setting). You can associate additional security groups with a layer after you create it,
     *         but you cannot delete the built-in security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create
     *         appropriate EC2 security groups and associate a security group with each layer that you create. However,
     *         you can still manually associate a built-in security group with a layer on. Custom security groups are
     *         required only for those layers that need custom settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public Boolean getUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated
     * with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own custom security
     * groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer
     * (default setting). You can associate additional security groups with a layer after you create it, but you cannot
     * delete the built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate
     * EC2 security groups and associate a security group with each layer that you create. However, you can still
     * manually associate a built-in security group with a layer on. Custom security groups are required only for those
     * layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.</p>
     *        <p>
     *        AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are
     *        associated with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own
     *        custom security groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has
     *        the following settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each
     *        layer (default setting). You can associate additional security groups with a layer after you create it,
     *        but you cannot delete the built-in security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create
     *        appropriate EC2 security groups and associate a security group with each layer that you create. However,
     *        you can still manually associate a built-in security group with a layer on. Custom security groups are
     *        required only for those layers that need custom settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        setUseOpsworksSecurityGroups(useOpsworksSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated
     * with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own custom security
     * groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer
     * (default setting). You can associate additional security groups with a layer after you create it, but you cannot
     * delete the built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate
     * EC2 security groups and associate a security group with each layer that you create. However, you can still
     * manually associate a built-in security group with a layer on. Custom security groups are required only for those
     * layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.</p>
     *         <p>
     *         AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are
     *         associated with layers by default. <code>UseOpsworksSecurityGroups</code> allows you to provide your own
     *         custom security groups instead of using the built-in groups. <code>UseOpsworksSecurityGroups</code> has
     *         the following settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each
     *         layer (default setting). You can associate additional security groups with a layer after you create it,
     *         but you cannot delete the built-in security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create
     *         appropriate EC2 security groups and associate a security group with each layer that you create. However,
     *         you can still manually associate a built-in security group with a layer on. Custom security groups are
     *         required only for those layers that need custom settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public Boolean isUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new agent
     * versions on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version
     * on the stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new
     *        agent versions on the stack's instances as soon as they are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *        edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs
     *        that version on the stack's instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     *        number, not the abbreviated number shown on the console. For a list of available agent version numbers,
     *        call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     *        </p>
     *        <note>
     *        <p>
     *        You can also specify an agent version when you create or update an instance, which overrides the stack's
     *        default setting.
     *        </p>
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new agent
     * versions on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version
     * on the stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @return The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new
     *         agent versions on the stack's instances as soon as they are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *         edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs
     *         that version on the stack's instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete
     *         version number, not the abbreviated number shown on the console. For a list of available agent version
     *         numbers, call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     *         </p>
     *         <note>
     *         <p>
     *         You can also specify an agent version when you create or update an instance, which overrides the stack's
     *         default setting.
     *         </p>
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new agent
     * versions on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version
     * on the stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks Stacks automatically installs new
     *        agent versions on the stack's instances as soon as they are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *        edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs
     *        that version on the stack's instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     *        number, not the abbreviated number shown on the console. For a list of available agent version numbers,
     *        call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     *        </p>
     *        <note>
     *        <p>
     *        You can also specify an agent version when you create or update an instance, which overrides the stack's
     *        default setting.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getDefaultInstanceProfileArn() != null)
            sb.append("DefaultInstanceProfileArn: ").append(getDefaultInstanceProfileArn()).append(",");
        if (getDefaultOs() != null)
            sb.append("DefaultOs: ").append(getDefaultOs()).append(",");
        if (getHostnameTheme() != null)
            sb.append("HostnameTheme: ").append(getHostnameTheme()).append(",");
        if (getDefaultAvailabilityZone() != null)
            sb.append("DefaultAvailabilityZone: ").append(getDefaultAvailabilityZone()).append(",");
        if (getDefaultSubnetId() != null)
            sb.append("DefaultSubnetId: ").append(getDefaultSubnetId()).append(",");
        if (getCustomJson() != null)
            sb.append("CustomJson: ").append(getCustomJson()).append(",");
        if (getConfigurationManager() != null)
            sb.append("ConfigurationManager: ").append(getConfigurationManager()).append(",");
        if (getChefConfiguration() != null)
            sb.append("ChefConfiguration: ").append(getChefConfiguration()).append(",");
        if (getUseCustomCookbooks() != null)
            sb.append("UseCustomCookbooks: ").append(getUseCustomCookbooks()).append(",");
        if (getCustomCookbooksSource() != null)
            sb.append("CustomCookbooksSource: ").append(getCustomCookbooksSource()).append(",");
        if (getDefaultSshKeyName() != null)
            sb.append("DefaultSshKeyName: ").append(getDefaultSshKeyName()).append(",");
        if (getDefaultRootDeviceType() != null)
            sb.append("DefaultRootDeviceType: ").append(getDefaultRootDeviceType()).append(",");
        if (getUseOpsworksSecurityGroups() != null)
            sb.append("UseOpsworksSecurityGroups: ").append(getUseOpsworksSecurityGroups()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackRequest == false)
            return false;
        UpdateStackRequest other = (UpdateStackRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getDefaultInstanceProfileArn() == null ^ this.getDefaultInstanceProfileArn() == null)
            return false;
        if (other.getDefaultInstanceProfileArn() != null && other.getDefaultInstanceProfileArn().equals(this.getDefaultInstanceProfileArn()) == false)
            return false;
        if (other.getDefaultOs() == null ^ this.getDefaultOs() == null)
            return false;
        if (other.getDefaultOs() != null && other.getDefaultOs().equals(this.getDefaultOs()) == false)
            return false;
        if (other.getHostnameTheme() == null ^ this.getHostnameTheme() == null)
            return false;
        if (other.getHostnameTheme() != null && other.getHostnameTheme().equals(this.getHostnameTheme()) == false)
            return false;
        if (other.getDefaultAvailabilityZone() == null ^ this.getDefaultAvailabilityZone() == null)
            return false;
        if (other.getDefaultAvailabilityZone() != null && other.getDefaultAvailabilityZone().equals(this.getDefaultAvailabilityZone()) == false)
            return false;
        if (other.getDefaultSubnetId() == null ^ this.getDefaultSubnetId() == null)
            return false;
        if (other.getDefaultSubnetId() != null && other.getDefaultSubnetId().equals(this.getDefaultSubnetId()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null)
            return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false)
            return false;
        if (other.getChefConfiguration() == null ^ this.getChefConfiguration() == null)
            return false;
        if (other.getChefConfiguration() != null && other.getChefConfiguration().equals(this.getChefConfiguration()) == false)
            return false;
        if (other.getUseCustomCookbooks() == null ^ this.getUseCustomCookbooks() == null)
            return false;
        if (other.getUseCustomCookbooks() != null && other.getUseCustomCookbooks().equals(this.getUseCustomCookbooks()) == false)
            return false;
        if (other.getCustomCookbooksSource() == null ^ this.getCustomCookbooksSource() == null)
            return false;
        if (other.getCustomCookbooksSource() != null && other.getCustomCookbooksSource().equals(this.getCustomCookbooksSource()) == false)
            return false;
        if (other.getDefaultSshKeyName() == null ^ this.getDefaultSshKeyName() == null)
            return false;
        if (other.getDefaultSshKeyName() != null && other.getDefaultSshKeyName().equals(this.getDefaultSshKeyName()) == false)
            return false;
        if (other.getDefaultRootDeviceType() == null ^ this.getDefaultRootDeviceType() == null)
            return false;
        if (other.getDefaultRootDeviceType() != null && other.getDefaultRootDeviceType().equals(this.getDefaultRootDeviceType()) == false)
            return false;
        if (other.getUseOpsworksSecurityGroups() == null ^ this.getUseOpsworksSecurityGroups() == null)
            return false;
        if (other.getUseOpsworksSecurityGroups() != null && other.getUseOpsworksSecurityGroups().equals(this.getUseOpsworksSecurityGroups()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceProfileArn() == null) ? 0 : getDefaultInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultOs() == null) ? 0 : getDefaultOs().hashCode());
        hashCode = prime * hashCode + ((getHostnameTheme() == null) ? 0 : getHostnameTheme().hashCode());
        hashCode = prime * hashCode + ((getDefaultAvailabilityZone() == null) ? 0 : getDefaultAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubnetId() == null) ? 0 : getDefaultSubnetId().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode());
        hashCode = prime * hashCode + ((getChefConfiguration() == null) ? 0 : getChefConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUseCustomCookbooks() == null) ? 0 : getUseCustomCookbooks().hashCode());
        hashCode = prime * hashCode + ((getCustomCookbooksSource() == null) ? 0 : getCustomCookbooksSource().hashCode());
        hashCode = prime * hashCode + ((getDefaultSshKeyName() == null) ? 0 : getDefaultSshKeyName().hashCode());
        hashCode = prime * hashCode + ((getDefaultRootDeviceType() == null) ? 0 : getDefaultRootDeviceType().hashCode());
        hashCode = prime * hashCode + ((getUseOpsworksSecurityGroups() == null) ? 0 : getUseOpsworksSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackRequest clone() {
        return (UpdateStackRequest) super.clone();
    }

}
