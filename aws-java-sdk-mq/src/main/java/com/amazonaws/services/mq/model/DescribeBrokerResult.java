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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The authentication strategy used to secure the broker. */
    private String authenticationStrategy;
    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */
    private Boolean autoMinorVersionUpgrade;
    /** The Amazon Resource Name (ARN) of the broker. */
    private String brokerArn;
    /** The unique ID that Amazon MQ generates for the broker. */
    private String brokerId;
    /** A list of information about allocated brokers. */
    private java.util.List<BrokerInstance> brokerInstances;
    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     */
    private String brokerName;
    /** The status of the broker. */
    private String brokerState;
    /** The list of all revisions for the specified configuration. */
    private Configurations configurations;
    /** The time when the broker was created. */
    private java.util.Date created;
    /** Required. The deployment mode of the broker. */
    private String deploymentMode;
    /** Encryption options for the broker. */
    private EncryptionOptions encryptionOptions;
    /** Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ. */
    private String engineType;
    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String engineVersion;
    /** The broker's instance type. */
    private String hostInstanceType;
    /** The metadata of the LDAP server used to authenticate and authorize connections to the broker. */
    private LdapServerMetadataOutput ldapServerMetadata;
    /** The list of information about logs currently enabled and pending to be deployed for the specified broker. */
    private LogsSummary logs;
    /** The parameters that determine the WeeklyStartTime. */
    private WeeklyStartTime maintenanceWindowStartTime;
    /** The authentication strategy that will be applied when the broker is rebooted. */
    private String pendingAuthenticationStrategy;
    /**
     * The version of the broker engine to upgrade to. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String pendingEngineVersion;
    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */
    private String pendingHostInstanceType;
    /**
     * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it
     * is rebooted.
     */
    private LdapServerMetadataOutput pendingLdapServerMetadata;
    /** The list of pending security groups to authorize connections to brokers. */
    private java.util.List<String> pendingSecurityGroups;
    /** Required. Enables connections from applications outside of the VPC that hosts the broker's subnets. */
    private Boolean publiclyAccessible;
    /** The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers. */
    private java.util.List<String> securityGroups;
    /** The broker's storage type. */
    private String storageType;
    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements
     * when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
     */
    private java.util.List<String> subnetIds;
    /** The list of all tags associated with this broker. */
    private java.util.Map<String, String> tags;
    /** The list of all broker usernames for the specified broker. */
    private java.util.List<UserSummary> users;

    /**
     * The authentication strategy used to secure the broker.
     * 
     * @param authenticationStrategy
     *        The authentication strategy used to secure the broker.
     * @see AuthenticationStrategy
     */

    public void setAuthenticationStrategy(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * The authentication strategy used to secure the broker.
     * 
     * @return The authentication strategy used to secure the broker.
     * @see AuthenticationStrategy
     */

    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }

    /**
     * The authentication strategy used to secure the broker.
     * 
     * @param authenticationStrategy
     *        The authentication strategy used to secure the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public DescribeBrokerResult withAuthenticationStrategy(String authenticationStrategy) {
        setAuthenticationStrategy(authenticationStrategy);
        return this;
    }

    /**
     * The authentication strategy used to secure the broker.
     * 
     * @param authenticationStrategy
     *        The authentication strategy used to secure the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public DescribeBrokerResult withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *        The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *         The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *        The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *         The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     */

    public void setBrokerArn(String brokerArn) {
        this.brokerArn = brokerArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @return The Amazon Resource Name (ARN) of the broker.
     */

    public String getBrokerArn() {
        return this.brokerArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withBrokerArn(String brokerArn) {
        setBrokerArn(brokerArn);
        return this;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * A list of information about allocated brokers.
     * 
     * @return A list of information about allocated brokers.
     */

    public java.util.List<BrokerInstance> getBrokerInstances() {
        return brokerInstances;
    }

    /**
     * A list of information about allocated brokers.
     * 
     * @param brokerInstances
     *        A list of information about allocated brokers.
     */

    public void setBrokerInstances(java.util.Collection<BrokerInstance> brokerInstances) {
        if (brokerInstances == null) {
            this.brokerInstances = null;
            return;
        }

        this.brokerInstances = new java.util.ArrayList<BrokerInstance>(brokerInstances);
    }

    /**
     * A list of information about allocated brokers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerInstances(java.util.Collection)} or {@link #withBrokerInstances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param brokerInstances
     *        A list of information about allocated brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withBrokerInstances(BrokerInstance... brokerInstances) {
        if (this.brokerInstances == null) {
            setBrokerInstances(new java.util.ArrayList<BrokerInstance>(brokerInstances.length));
        }
        for (BrokerInstance ele : brokerInstances) {
            this.brokerInstances.add(ele);
        }
        return this;
    }

    /**
     * A list of information about allocated brokers.
     * 
     * @param brokerInstances
     *        A list of information about allocated brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withBrokerInstances(java.util.Collection<BrokerInstance> brokerInstances) {
        setBrokerInstances(brokerInstances);
        return this;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerName
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @return The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *         only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *         characters, or special characters.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerName
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * The status of the broker.
     * 
     * @param brokerState
     *        The status of the broker.
     * @see BrokerState
     */

    public void setBrokerState(String brokerState) {
        this.brokerState = brokerState;
    }

    /**
     * The status of the broker.
     * 
     * @return The status of the broker.
     * @see BrokerState
     */

    public String getBrokerState() {
        return this.brokerState;
    }

    /**
     * The status of the broker.
     * 
     * @param brokerState
     *        The status of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public DescribeBrokerResult withBrokerState(String brokerState) {
        setBrokerState(brokerState);
        return this;
    }

    /**
     * The status of the broker.
     * 
     * @param brokerState
     *        The status of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public DescribeBrokerResult withBrokerState(BrokerState brokerState) {
        this.brokerState = brokerState.toString();
        return this;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @param configurations
     *        The list of all revisions for the specified configuration.
     */

    public void setConfigurations(Configurations configurations) {
        this.configurations = configurations;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @return The list of all revisions for the specified configuration.
     */

    public Configurations getConfigurations() {
        return this.configurations;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @param configurations
     *        The list of all revisions for the specified configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withConfigurations(Configurations configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * The time when the broker was created.
     * 
     * @param created
     *        The time when the broker was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * The time when the broker was created.
     * 
     * @return The time when the broker was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * The time when the broker was created.
     * 
     * @param created
     *        The time when the broker was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @see DeploymentMode
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @return Required. The deployment mode of the broker.
     * @see DeploymentMode
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public DescribeBrokerResult withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public DescribeBrokerResult withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode.toString();
        return this;
    }

    /**
     * Encryption options for the broker.
     * 
     * @param encryptionOptions
     *        Encryption options for the broker.
     */

    public void setEncryptionOptions(EncryptionOptions encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
    }

    /**
     * Encryption options for the broker.
     * 
     * @return Encryption options for the broker.
     */

    public EncryptionOptions getEncryptionOptions() {
        return this.encryptionOptions;
    }

    /**
     * Encryption options for the broker.
     * 
     * @param encryptionOptions
     *        Encryption options for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withEncryptionOptions(EncryptionOptions encryptionOptions) {
        setEncryptionOptions(encryptionOptions);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * 
     * @return Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public DescribeBrokerResult withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public DescribeBrokerResult withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @return The version of the broker engine. For a list of supported engine versions, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * The broker's instance type.
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * The broker's instance type.
     * 
     * @return The broker's instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * The broker's instance type.
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * 
     * @param ldapServerMetadata
     *        The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     */

    public void setLdapServerMetadata(LdapServerMetadataOutput ldapServerMetadata) {
        this.ldapServerMetadata = ldapServerMetadata;
    }

    /**
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * 
     * @return The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     */

    public LdapServerMetadataOutput getLdapServerMetadata() {
        return this.ldapServerMetadata;
    }

    /**
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * 
     * @param ldapServerMetadata
     *        The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withLdapServerMetadata(LdapServerMetadataOutput ldapServerMetadata) {
        setLdapServerMetadata(ldapServerMetadata);
        return this;
    }

    /**
     * The list of information about logs currently enabled and pending to be deployed for the specified broker.
     * 
     * @param logs
     *        The list of information about logs currently enabled and pending to be deployed for the specified broker.
     */

    public void setLogs(LogsSummary logs) {
        this.logs = logs;
    }

    /**
     * The list of information about logs currently enabled and pending to be deployed for the specified broker.
     * 
     * @return The list of information about logs currently enabled and pending to be deployed for the specified broker.
     */

    public LogsSummary getLogs() {
        return this.logs;
    }

    /**
     * The list of information about logs currently enabled and pending to be deployed for the specified broker.
     * 
     * @param logs
     *        The list of information about logs currently enabled and pending to be deployed for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withLogs(LogsSummary logs) {
        setLogs(logs);
        return this;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @param maintenanceWindowStartTime
     *        The parameters that determine the WeeklyStartTime.
     */

    public void setMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @return The parameters that determine the WeeklyStartTime.
     */

    public WeeklyStartTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @param maintenanceWindowStartTime
     *        The parameters that determine the WeeklyStartTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        setMaintenanceWindowStartTime(maintenanceWindowStartTime);
        return this;
    }

    /**
     * The authentication strategy that will be applied when the broker is rebooted.
     * 
     * @param pendingAuthenticationStrategy
     *        The authentication strategy that will be applied when the broker is rebooted.
     * @see AuthenticationStrategy
     */

    public void setPendingAuthenticationStrategy(String pendingAuthenticationStrategy) {
        this.pendingAuthenticationStrategy = pendingAuthenticationStrategy;
    }

    /**
     * The authentication strategy that will be applied when the broker is rebooted.
     * 
     * @return The authentication strategy that will be applied when the broker is rebooted.
     * @see AuthenticationStrategy
     */

    public String getPendingAuthenticationStrategy() {
        return this.pendingAuthenticationStrategy;
    }

    /**
     * The authentication strategy that will be applied when the broker is rebooted.
     * 
     * @param pendingAuthenticationStrategy
     *        The authentication strategy that will be applied when the broker is rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public DescribeBrokerResult withPendingAuthenticationStrategy(String pendingAuthenticationStrategy) {
        setPendingAuthenticationStrategy(pendingAuthenticationStrategy);
        return this;
    }

    /**
     * The authentication strategy that will be applied when the broker is rebooted.
     * 
     * @param pendingAuthenticationStrategy
     *        The authentication strategy that will be applied when the broker is rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public DescribeBrokerResult withPendingAuthenticationStrategy(AuthenticationStrategy pendingAuthenticationStrategy) {
        this.pendingAuthenticationStrategy = pendingAuthenticationStrategy.toString();
        return this;
    }

    /**
     * The version of the broker engine to upgrade to. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param pendingEngineVersion
     *        The version of the broker engine to upgrade to. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public void setPendingEngineVersion(String pendingEngineVersion) {
        this.pendingEngineVersion = pendingEngineVersion;
    }

    /**
     * The version of the broker engine to upgrade to. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @return The version of the broker engine to upgrade to. For a list of supported engine versions, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public String getPendingEngineVersion() {
        return this.pendingEngineVersion;
    }

    /**
     * The version of the broker engine to upgrade to. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param pendingEngineVersion
     *        The version of the broker engine to upgrade to. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPendingEngineVersion(String pendingEngineVersion) {
        setPendingEngineVersion(pendingEngineVersion);
        return this;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @param pendingHostInstanceType
     *        The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */

    public void setPendingHostInstanceType(String pendingHostInstanceType) {
        this.pendingHostInstanceType = pendingHostInstanceType;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @return The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */

    public String getPendingHostInstanceType() {
        return this.pendingHostInstanceType;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @param pendingHostInstanceType
     *        The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPendingHostInstanceType(String pendingHostInstanceType) {
        setPendingHostInstanceType(pendingHostInstanceType);
        return this;
    }

    /**
     * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it
     * is rebooted.
     * 
     * @param pendingLdapServerMetadata
     *        The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker
     *        once it is rebooted.
     */

    public void setPendingLdapServerMetadata(LdapServerMetadataOutput pendingLdapServerMetadata) {
        this.pendingLdapServerMetadata = pendingLdapServerMetadata;
    }

    /**
     * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it
     * is rebooted.
     * 
     * @return The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker
     *         once it is rebooted.
     */

    public LdapServerMetadataOutput getPendingLdapServerMetadata() {
        return this.pendingLdapServerMetadata;
    }

    /**
     * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it
     * is rebooted.
     * 
     * @param pendingLdapServerMetadata
     *        The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker
     *        once it is rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPendingLdapServerMetadata(LdapServerMetadataOutput pendingLdapServerMetadata) {
        setPendingLdapServerMetadata(pendingLdapServerMetadata);
        return this;
    }

    /**
     * The list of pending security groups to authorize connections to brokers.
     * 
     * @return The list of pending security groups to authorize connections to brokers.
     */

    public java.util.List<String> getPendingSecurityGroups() {
        return pendingSecurityGroups;
    }

    /**
     * The list of pending security groups to authorize connections to brokers.
     * 
     * @param pendingSecurityGroups
     *        The list of pending security groups to authorize connections to brokers.
     */

    public void setPendingSecurityGroups(java.util.Collection<String> pendingSecurityGroups) {
        if (pendingSecurityGroups == null) {
            this.pendingSecurityGroups = null;
            return;
        }

        this.pendingSecurityGroups = new java.util.ArrayList<String>(pendingSecurityGroups);
    }

    /**
     * The list of pending security groups to authorize connections to brokers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingSecurityGroups(java.util.Collection)} or
     * {@link #withPendingSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingSecurityGroups
     *        The list of pending security groups to authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPendingSecurityGroups(String... pendingSecurityGroups) {
        if (this.pendingSecurityGroups == null) {
            setPendingSecurityGroups(new java.util.ArrayList<String>(pendingSecurityGroups.length));
        }
        for (String ele : pendingSecurityGroups) {
            this.pendingSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * The list of pending security groups to authorize connections to brokers.
     * 
     * @param pendingSecurityGroups
     *        The list of pending security groups to authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPendingSecurityGroups(java.util.Collection<String> pendingSecurityGroups) {
        setPendingSecurityGroups(pendingSecurityGroups);
        return this;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @param publiclyAccessible
     *        Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @return Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @param publiclyAccessible
     *        Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @return Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * 
     * @return The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * The broker's storage type.
     * 
     * @param storageType
     *        The broker's storage type.
     * @see BrokerStorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * The broker's storage type.
     * 
     * @return The broker's storage type.
     * @see BrokerStorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * The broker's storage type.
     * 
     * @param storageType
     *        The broker's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerStorageType
     */

    public DescribeBrokerResult withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * The broker's storage type.
     * 
     * @param storageType
     *        The broker's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerStorageType
     */

    public DescribeBrokerResult withStorageType(BrokerStorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements
     * when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
     * 
     * @return The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *         Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *         ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment
     *         (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public
     *         accessibility requires at least one subnet.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements
     * when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment
     *        (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public
     *        accessibility requires at least one subnet.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements
     * when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment
     *        (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public
     *        accessibility requires at least one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements
     * when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment
     *        (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public
     *        accessibility requires at least one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * The list of all tags associated with this broker.
     * 
     * @return The list of all tags associated with this broker.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The list of all tags associated with this broker.
     * 
     * @param tags
     *        The list of all tags associated with this broker.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The list of all tags associated with this broker.
     * 
     * @param tags
     *        The list of all tags associated with this broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeBrokerResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult addTagsEntry(String key, String value) {
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

    public DescribeBrokerResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * The list of all broker usernames for the specified broker.
     * 
     * @return The list of all broker usernames for the specified broker.
     */

    public java.util.List<UserSummary> getUsers() {
        return users;
    }

    /**
     * The list of all broker usernames for the specified broker.
     * 
     * @param users
     *        The list of all broker usernames for the specified broker.
     */

    public void setUsers(java.util.Collection<UserSummary> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserSummary>(users);
    }

    /**
     * The list of all broker usernames for the specified broker.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        The list of all broker usernames for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withUsers(UserSummary... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<UserSummary>(users.length));
        }
        for (UserSummary ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * The list of all broker usernames for the specified broker.
     * 
     * @param users
     *        The list of all broker usernames for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerResult withUsers(java.util.Collection<UserSummary> users) {
        setUsers(users);
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
        if (getAuthenticationStrategy() != null)
            sb.append("AuthenticationStrategy: ").append(getAuthenticationStrategy()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getBrokerArn() != null)
            sb.append("BrokerArn: ").append(getBrokerArn()).append(",");
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getBrokerInstances() != null)
            sb.append("BrokerInstances: ").append(getBrokerInstances()).append(",");
        if (getBrokerName() != null)
            sb.append("BrokerName: ").append(getBrokerName()).append(",");
        if (getBrokerState() != null)
            sb.append("BrokerState: ").append(getBrokerState()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDeploymentMode() != null)
            sb.append("DeploymentMode: ").append(getDeploymentMode()).append(",");
        if (getEncryptionOptions() != null)
            sb.append("EncryptionOptions: ").append(getEncryptionOptions()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType()).append(",");
        if (getLdapServerMetadata() != null)
            sb.append("LdapServerMetadata: ").append(getLdapServerMetadata()).append(",");
        if (getLogs() != null)
            sb.append("Logs: ").append(getLogs()).append(",");
        if (getMaintenanceWindowStartTime() != null)
            sb.append("MaintenanceWindowStartTime: ").append(getMaintenanceWindowStartTime()).append(",");
        if (getPendingAuthenticationStrategy() != null)
            sb.append("PendingAuthenticationStrategy: ").append(getPendingAuthenticationStrategy()).append(",");
        if (getPendingEngineVersion() != null)
            sb.append("PendingEngineVersion: ").append(getPendingEngineVersion()).append(",");
        if (getPendingHostInstanceType() != null)
            sb.append("PendingHostInstanceType: ").append(getPendingHostInstanceType()).append(",");
        if (getPendingLdapServerMetadata() != null)
            sb.append("PendingLdapServerMetadata: ").append(getPendingLdapServerMetadata()).append(",");
        if (getPendingSecurityGroups() != null)
            sb.append("PendingSecurityGroups: ").append(getPendingSecurityGroups()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBrokerResult == false)
            return false;
        DescribeBrokerResult other = (DescribeBrokerResult) obj;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getBrokerArn() == null ^ this.getBrokerArn() == null)
            return false;
        if (other.getBrokerArn() != null && other.getBrokerArn().equals(this.getBrokerArn()) == false)
            return false;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getBrokerInstances() == null ^ this.getBrokerInstances() == null)
            return false;
        if (other.getBrokerInstances() != null && other.getBrokerInstances().equals(this.getBrokerInstances()) == false)
            return false;
        if (other.getBrokerName() == null ^ this.getBrokerName() == null)
            return false;
        if (other.getBrokerName() != null && other.getBrokerName().equals(this.getBrokerName()) == false)
            return false;
        if (other.getBrokerState() == null ^ this.getBrokerState() == null)
            return false;
        if (other.getBrokerState() != null && other.getBrokerState().equals(this.getBrokerState()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDeploymentMode() == null ^ this.getDeploymentMode() == null)
            return false;
        if (other.getDeploymentMode() != null && other.getDeploymentMode().equals(this.getDeploymentMode()) == false)
            return false;
        if (other.getEncryptionOptions() == null ^ this.getEncryptionOptions() == null)
            return false;
        if (other.getEncryptionOptions() != null && other.getEncryptionOptions().equals(this.getEncryptionOptions()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getHostInstanceType() == null ^ this.getHostInstanceType() == null)
            return false;
        if (other.getHostInstanceType() != null && other.getHostInstanceType().equals(this.getHostInstanceType()) == false)
            return false;
        if (other.getLdapServerMetadata() == null ^ this.getLdapServerMetadata() == null)
            return false;
        if (other.getLdapServerMetadata() != null && other.getLdapServerMetadata().equals(this.getLdapServerMetadata()) == false)
            return false;
        if (other.getLogs() == null ^ this.getLogs() == null)
            return false;
        if (other.getLogs() != null && other.getLogs().equals(this.getLogs()) == false)
            return false;
        if (other.getMaintenanceWindowStartTime() == null ^ this.getMaintenanceWindowStartTime() == null)
            return false;
        if (other.getMaintenanceWindowStartTime() != null && other.getMaintenanceWindowStartTime().equals(this.getMaintenanceWindowStartTime()) == false)
            return false;
        if (other.getPendingAuthenticationStrategy() == null ^ this.getPendingAuthenticationStrategy() == null)
            return false;
        if (other.getPendingAuthenticationStrategy() != null
                && other.getPendingAuthenticationStrategy().equals(this.getPendingAuthenticationStrategy()) == false)
            return false;
        if (other.getPendingEngineVersion() == null ^ this.getPendingEngineVersion() == null)
            return false;
        if (other.getPendingEngineVersion() != null && other.getPendingEngineVersion().equals(this.getPendingEngineVersion()) == false)
            return false;
        if (other.getPendingHostInstanceType() == null ^ this.getPendingHostInstanceType() == null)
            return false;
        if (other.getPendingHostInstanceType() != null && other.getPendingHostInstanceType().equals(this.getPendingHostInstanceType()) == false)
            return false;
        if (other.getPendingLdapServerMetadata() == null ^ this.getPendingLdapServerMetadata() == null)
            return false;
        if (other.getPendingLdapServerMetadata() != null && other.getPendingLdapServerMetadata().equals(this.getPendingLdapServerMetadata()) == false)
            return false;
        if (other.getPendingSecurityGroups() == null ^ this.getPendingSecurityGroups() == null)
            return false;
        if (other.getPendingSecurityGroups() != null && other.getPendingSecurityGroups().equals(this.getPendingSecurityGroups()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getBrokerArn() == null) ? 0 : getBrokerArn().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getBrokerInstances() == null) ? 0 : getBrokerInstances().hashCode());
        hashCode = prime * hashCode + ((getBrokerName() == null) ? 0 : getBrokerName().hashCode());
        hashCode = prime * hashCode + ((getBrokerState() == null) ? 0 : getBrokerState().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOptions() == null) ? 0 : getEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLdapServerMetadata() == null) ? 0 : getLdapServerMetadata().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindowStartTime() == null) ? 0 : getMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getPendingAuthenticationStrategy() == null) ? 0 : getPendingAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getPendingEngineVersion() == null) ? 0 : getPendingEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPendingHostInstanceType() == null) ? 0 : getPendingHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPendingLdapServerMetadata() == null) ? 0 : getPendingLdapServerMetadata().hashCode());
        hashCode = prime * hashCode + ((getPendingSecurityGroups() == null) ? 0 : getPendingSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerResult clone() {
        try {
            return (DescribeBrokerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
