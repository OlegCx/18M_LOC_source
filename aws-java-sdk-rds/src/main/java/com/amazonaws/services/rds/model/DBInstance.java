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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of an Amazon RDS DB instance.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBInstances</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstance implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The name of the database engine to be used for this DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     * Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String dBInstanceStatus;
    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;
    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership> dBSecurityGroups;
    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBParameterGroupStatus> dBParameterGroups;
    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located in.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Specifies information on the subnet group associated with the DB instance, including the name, description, and
     * subnets in the subnet group.
     * </p>
     */
    private DBSubnetGroup dBSubnetGroup;
    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * A value that specifies that changes to the DB instance are pending. This element is only included when changes
     * are pending. Specific changes are identified by subelements.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;
    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates that minor version patches are applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is a read replica.
     * </p>
     */
    private String readReplicaSourceDBInstanceIdentifier;
    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> readReplicaDBInstanceIdentifiers;
    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read
     * replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora
     * read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> readReplicaDBClusterIdentifiers;
    /**
     * <p>
     * The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This attribute is only supported in RDS for Oracle.
     * </p>
     * </note>
     */
    private String replicaMode;
    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionGroupMembership> optionGroupMemberships;
    /**
     * <p>
     * If present, specifies the name of the character set that this instance is associated with.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode encoding
     * for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     * </p>
     */
    private String ncharCharacterSetName;
    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     * </p>
     */
    private String secondaryAvailabilityZone;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the
     * DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance
     * is ultimately controlled by the security group it uses, and that public access is not permitted if the security
     * group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is blank.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBInstanceStatusInfo> statusInfos;
    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     */
    private Integer dbInstancePort;
    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainMembership> domainMemberships;
    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring
     * metrics data for the DB instance.
     * </p>
     */
    private String enhancedMonitoringResourceArn;
    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     */
    private String dBInstanceArn;
    /**
     * <p>
     * The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and otherwise false.
     * </p>
     */
    private Boolean performanceInsightsEnabled;
    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     */
    private String performanceInsightsKMSKeyId;
    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;
    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enabledCloudwatchLogsExports;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBInstanceRole> associatedRoles;
    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     */
    private Endpoint listenerEndpoint;
    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     */
    private Integer maxAllocatedStorage;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;
    /**
     * <p>
     * The list of replicated automated backups associated with the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackupsReplication> dBInstanceAutomatedBackupsReplications;
    /**
     * <p>
     * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on AWS
     * Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     * >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * </p>
     */
    private Boolean customerOwnedIpEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * </p>
     */
    private String awsBackupRecoveryPointArn;

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @return Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *         instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @return The name of the database engine to be used for this DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     * Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param dBInstanceStatus
     *        Specifies the current state of this database.</p>
     *        <p>
     *        For information about DB instance statuses, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     *        Status</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     * Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return Specifies the current state of this database.</p>
     *         <p>
     *         For information about DB instance statuses, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     *         Status</a> in the <i>Amazon RDS User Guide.</i>
     */

    public String getDBInstanceStatus() {
        return this.dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     * Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param dBInstanceStatus
     *        Specifies the current state of this database.</p>
     *        <p>
     *        For information about DB instance statuses, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html">DB Instance
     *        Status</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceStatus(String dBInstanceStatus) {
        setDBInstanceStatus(dBInstanceStatus);
        return this;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB instance.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     * 
     * @return Contains the master username for the DB instance.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *         </p>
     *         <p>
     *         Contains the name of the initial database of this instance that was provided at create time, if one was
     *         specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *         not apply to an Oracle DB instance.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @return Specifies the connection endpoint.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size specified in gibibytes.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     * 
     * @return Specifies the allocated storage size specified in gibibytes.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size specified in gibibytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time the DB instance was created.
     */

    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @return Provides the date and time the DB instance was created.
     */

    public java.util.Date getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time the DB instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withInstanceCreateTime(java.util.Date instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are created if automated backups are
     *        enabled, as determined by the <code>BackupRetentionPeriod</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @return Specifies the daily time range during which automated backups are created if automated backups are
     *         enabled, as determined by the <code>BackupRetentionPeriod</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are created if automated backups are
     *        enabled, as determined by the <code>BackupRetentionPeriod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @return Specifies the number of days for which automatic DB snapshots are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * </p>
     * 
     * @return A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     */

    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     *        <code>DBSecurityGroup.Status</code> subelements.
     */

    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroups(java.util.Collection)} or {@link #withDBSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     *        <code>DBSecurityGroup.Status</code> subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBSecurityGroups(DBSecurityGroupMembership... dBSecurityGroups) {
        if (this.dBSecurityGroups == null) {
            setDBSecurityGroups(new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>(dBSecurityGroups.length));
        }
        for (DBSecurityGroupMembership ele : dBSecurityGroups) {
            this.dBSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security group elements containing <code>DBSecurityGroup.Name</code> and
     *        <code>DBSecurityGroup.Status</code> subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security group elements that the DB instance belongs to.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
            vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     */

    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups);
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * 
     * @return Provides the list of DB parameter groups applied to this DB instance.
     */

    public java.util.List<DBParameterGroupStatus> getDBParameterGroups() {
        if (dBParameterGroups == null) {
            dBParameterGroups = new com.amazonaws.internal.SdkInternalList<DBParameterGroupStatus>();
        }
        return dBParameterGroups;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * 
     * @param dBParameterGroups
     *        Provides the list of DB parameter groups applied to this DB instance.
     */

    public void setDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }

        this.dBParameterGroups = new com.amazonaws.internal.SdkInternalList<DBParameterGroupStatus>(dBParameterGroups);
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBParameterGroups(java.util.Collection)} or {@link #withDBParameterGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dBParameterGroups
     *        Provides the list of DB parameter groups applied to this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBParameterGroups(DBParameterGroupStatus... dBParameterGroups) {
        if (this.dBParameterGroups == null) {
            setDBParameterGroups(new com.amazonaws.internal.SdkInternalList<DBParameterGroupStatus>(dBParameterGroups.length));
        }
        for (DBParameterGroupStatus ele : dBParameterGroups) {
            this.dBParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * 
     * @param dBParameterGroups
     *        Provides the list of DB parameter groups applied to this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        setDBParameterGroups(dBParameterGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located in.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone the DB instance is located in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located in.
     * </p>
     * 
     * @return Specifies the name of the Availability Zone the DB instance is located in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located in.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone the DB instance is located in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB instance, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB instance, including the name,
     *        description, and subnets in the subnet group.
     */

    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB instance, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @return Specifies information on the subnet group associated with the DB instance, including the name,
     *         description, and subnets in the subnet group.
     */

    public DBSubnetGroup getDBSubnetGroup() {
        return this.dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB instance, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB instance, including the name,
     *        description, and subnets in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        setDBSubnetGroup(dBSubnetGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *        (UTC).
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *         (UTC).
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB instance are pending. This element is only included when changes
     * are pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that specifies that changes to the DB instance are pending. This element is only included when
     *        changes are pending. Specific changes are identified by subelements.
     */

    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB instance are pending. This element is only included when changes
     * are pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @return A value that specifies that changes to the DB instance are pending. This element is only included when
     *         changes are pending. Specific changes are identified by subelements.
     */

    public PendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB instance are pending. This element is only included when changes
     * are pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that specifies that changes to the DB instance are pending. This element is only included when
     *        changes are pending. Specific changes are identified by subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.
     */

    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @return Specifies the latest time to which a database can be restored with point-in-time restore.
     */

    public java.util.Date getLatestRestorableTime() {
        return this.latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withLatestRestorableTime(java.util.Date latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates that minor version patches are applied automatically.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @return A value that indicates that minor version patches are applied automatically.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates that minor version patches are applied automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @return A value that indicates that minor version patches are applied automatically.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is a read replica.
     * </p>
     * 
     * @param readReplicaSourceDBInstanceIdentifier
     *        Contains the identifier of the source DB instance if this DB instance is a read replica.
     */

    public void setReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is a read replica.
     * </p>
     * 
     * @return Contains the identifier of the source DB instance if this DB instance is a read replica.
     */

    public String getReadReplicaSourceDBInstanceIdentifier() {
        return this.readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is a read replica.
     * </p>
     * 
     * @param readReplicaSourceDBInstanceIdentifier
     *        Contains the identifier of the source DB instance if this DB instance is a read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        setReadReplicaSourceDBInstanceIdentifier(readReplicaSourceDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @return Contains one or more identifiers of the read replicas associated with this DB instance.
     */

    public java.util.List<String> getReadReplicaDBInstanceIdentifiers() {
        if (readReplicaDBInstanceIdentifiers == null) {
            readReplicaDBInstanceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return readReplicaDBInstanceIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB instance.
     */

    public void setReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
            return;
        }

        this.readReplicaDBInstanceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(readReplicaDBInstanceIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaDBInstanceIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaDBInstanceIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withReadReplicaDBInstanceIdentifiers(String... readReplicaDBInstanceIdentifiers) {
        if (this.readReplicaDBInstanceIdentifiers == null) {
            setReadReplicaDBInstanceIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(readReplicaDBInstanceIdentifiers.length));
        }
        for (String ele : readReplicaDBInstanceIdentifiers) {
            this.readReplicaDBInstanceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        setReadReplicaDBInstanceIdentifiers(readReplicaDBInstanceIdentifiers);
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read
     * replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora
     * read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * 
     * @return Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a
     *         read replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora
     *         MySQL DB cluster for the Aurora read replica is shown. This output does not contain information about
     *         cross region Aurora read replicas.</p> <note>
     *         <p>
     *         Currently, each RDS DB instance can have only one Aurora read replica.
     *         </p>
     */

    public java.util.List<String> getReadReplicaDBClusterIdentifiers() {
        if (readReplicaDBClusterIdentifiers == null) {
            readReplicaDBClusterIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return readReplicaDBClusterIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read
     * replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora
     * read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a
     *        read replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora
     *        MySQL DB cluster for the Aurora read replica is shown. This output does not contain information about
     *        cross region Aurora read replicas.</p> <note>
     *        <p>
     *        Currently, each RDS DB instance can have only one Aurora read replica.
     *        </p>
     */

    public void setReadReplicaDBClusterIdentifiers(java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        if (readReplicaDBClusterIdentifiers == null) {
            this.readReplicaDBClusterIdentifiers = null;
            return;
        }

        this.readReplicaDBClusterIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(readReplicaDBClusterIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read
     * replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora
     * read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaDBClusterIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaDBClusterIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a
     *        read replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora
     *        MySQL DB cluster for the Aurora read replica is shown. This output does not contain information about
     *        cross region Aurora read replicas.</p> <note>
     *        <p>
     *        Currently, each RDS DB instance can have only one Aurora read replica.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withReadReplicaDBClusterIdentifiers(String... readReplicaDBClusterIdentifiers) {
        if (this.readReplicaDBClusterIdentifiers == null) {
            setReadReplicaDBClusterIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(readReplicaDBClusterIdentifiers.length));
        }
        for (String ele : readReplicaDBClusterIdentifiers) {
            this.readReplicaDBClusterIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read
     * replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora
     * read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a
     *        read replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora
     *        MySQL DB cluster for the Aurora read replica is shown. This output does not contain information about
     *        cross region Aurora read replicas.</p> <note>
     *        <p>
     *        Currently, each RDS DB instance can have only one Aurora read replica.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withReadReplicaDBClusterIdentifiers(java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        setReadReplicaDBClusterIdentifiers(readReplicaDBClusterIdentifiers);
        return this;
    }

    /**
     * <p>
     * The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This attribute is only supported in RDS for Oracle.
     * </p>
     * </note>
     * 
     * @param replicaMode
     *        The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information,
     *        see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working
     *        with Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.</p> <note>
     *        <p>
     *        This attribute is only supported in RDS for Oracle.
     *        </p>
     * @see ReplicaMode
     */

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    /**
     * <p>
     * The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This attribute is only supported in RDS for Oracle.
     * </p>
     * </note>
     * 
     * @return The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *         Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.</p> <note>
     *         <p>
     *         This attribute is only supported in RDS for Oracle.
     *         </p>
     * @see ReplicaMode
     */

    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * <p>
     * The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This attribute is only supported in RDS for Oracle.
     * </p>
     * </note>
     * 
     * @param replicaMode
     *        The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information,
     *        see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working
     *        with Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.</p> <note>
     *        <p>
     *        This attribute is only supported in RDS for Oracle.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public DBInstance withReplicaMode(String replicaMode) {
        setReplicaMode(replicaMode);
        return this;
    }

    /**
     * <p>
     * The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This attribute is only supported in RDS for Oracle.
     * </p>
     * </note>
     * 
     * @param replicaMode
     *        The open mode of an Oracle read replica. The default is <code>open-read-only</code>. For more information,
     *        see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working
     *        with Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.</p> <note>
     *        <p>
     *        This attribute is only supported in RDS for Oracle.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public DBInstance withReplicaMode(ReplicaMode replicaMode) {
        this.replicaMode = replicaMode.toString();
        return this;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @return License model information for this DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     * 
     * @param iops
     *        Specifies the Provisioned IOPS (I/O operations per second) value.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     * 
     * @return Specifies the Provisioned IOPS (I/O operations per second) value.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     * 
     * @param iops
     *        Specifies the Provisioned IOPS (I/O operations per second) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * 
     * @return Provides the list of option group memberships for this DB instance.
     */

    public java.util.List<OptionGroupMembership> getOptionGroupMemberships() {
        if (optionGroupMemberships == null) {
            optionGroupMemberships = new com.amazonaws.internal.SdkInternalList<OptionGroupMembership>();
        }
        return optionGroupMemberships;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * 
     * @param optionGroupMemberships
     *        Provides the list of option group memberships for this DB instance.
     */

    public void setOptionGroupMemberships(java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        if (optionGroupMemberships == null) {
            this.optionGroupMemberships = null;
            return;
        }

        this.optionGroupMemberships = new com.amazonaws.internal.SdkInternalList<OptionGroupMembership>(optionGroupMemberships);
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupMemberships(java.util.Collection)} or
     * {@link #withOptionGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param optionGroupMemberships
     *        Provides the list of option group memberships for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withOptionGroupMemberships(OptionGroupMembership... optionGroupMemberships) {
        if (this.optionGroupMemberships == null) {
            setOptionGroupMemberships(new com.amazonaws.internal.SdkInternalList<OptionGroupMembership>(optionGroupMemberships.length));
        }
        for (OptionGroupMembership ele : optionGroupMemberships) {
            this.optionGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * 
     * @param optionGroupMemberships
     *        Provides the list of option group memberships for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withOptionGroupMemberships(java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        setOptionGroupMemberships(optionGroupMemberships);
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this instance is associated with.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is associated with.
     * </p>
     * 
     * @return If present, specifies the name of the character set that this instance is associated with.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode encoding
     * for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode
     *        encoding for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     */

    public void setNcharCharacterSetName(String ncharCharacterSetName) {
        this.ncharCharacterSetName = ncharCharacterSetName;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode encoding
     * for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     * </p>
     * 
     * @return The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode
     *         encoding for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     */

    public String getNcharCharacterSetName() {
        return this.ncharCharacterSetName;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode encoding
     * for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode
     *        encoding for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withNcharCharacterSetName(String ncharCharacterSetName) {
        setNcharCharacterSetName(ncharCharacterSetName);
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     */

    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     * </p>
     * 
     * @return If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ
     *         support.
     */

    public String getSecondaryAvailabilityZone() {
        return this.secondaryAvailabilityZone;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        setSecondaryAvailabilityZone(secondaryAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the
     * DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance
     * is ultimately controlled by the security group it uses, and that public access is not permitted if the security
     * group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from
     *        within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access
     *        to the DB instance is ultimately controlled by the security group it uses, and that public access is not
     *        permitted if the security group assigned to the DB instance doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBInstance</a>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the
     * DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance
     * is ultimately controlled by the security group it uses, and that public access is not permitted if the security
     * group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from
     *         within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access
     *         to the DB instance is ultimately controlled by the security group it uses, and that public access is not
     *         permitted if the security group assigned to the DB instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the
     * DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance
     * is ultimately controlled by the security group it uses, and that public access is not permitted if the security
     * group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from
     *        within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access
     *        to the DB instance is ultimately controlled by the security group it uses, and that public access is not
     *        permitted if the security group assigned to the DB instance doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBInstance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the
     * DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance
     * is ultimately controlled by the security group it uses, and that public access is not permitted if the security
     * group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from
     *         within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access
     *         to the DB instance is ultimately controlled by the security group it uses, and that public access is not
     *         permitted if the security group assigned to the DB instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is blank.
     * </p>
     * 
     * @return The status of a read replica. If the instance isn't a read replica, this is blank.
     */

    public java.util.List<DBInstanceStatusInfo> getStatusInfos() {
        if (statusInfos == null) {
            statusInfos = new com.amazonaws.internal.SdkInternalList<DBInstanceStatusInfo>();
        }
        return statusInfos;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is blank.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is blank.
     */

    public void setStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
            return;
        }

        this.statusInfos = new com.amazonaws.internal.SdkInternalList<DBInstanceStatusInfo>(statusInfos);
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is blank.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusInfos(java.util.Collection)} or {@link #withStatusInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStatusInfos(DBInstanceStatusInfo... statusInfos) {
        if (this.statusInfos == null) {
            setStatusInfos(new com.amazonaws.internal.SdkInternalList<DBInstanceStatusInfo>(statusInfos.length));
        }
        for (DBInstanceStatusInfo ele : statusInfos) {
            this.statusInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is blank.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        setStatusInfos(statusInfos);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     * 
     * @return Specifies the storage type associated with DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     */

    public void setDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @return Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *         be a different port than the DB cluster port.
     */

    public Integer getDbInstancePort() {
        return this.dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDbInstancePort(Integer dbInstancePort) {
        setDbInstancePort(dbInstancePort);
        return this;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @return If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *         is a member of.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance. </p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance. </p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK).
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance. </p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *         CloudTrail log entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS customer master key (CMK) for the DB instance is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @return The identifier of the CA certificate for this DB instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB instance.
     * </p>
     * 
     * @return The Active Directory Domain membership records associated with the DB instance.
     */

    public java.util.List<DomainMembership> getDomainMemberships() {
        if (domainMemberships == null) {
            domainMemberships = new com.amazonaws.internal.SdkInternalList<DomainMembership>();
        }
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB instance.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB instance.
     */

    public void setDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        if (domainMemberships == null) {
            this.domainMemberships = null;
            return;
        }

        this.domainMemberships = new com.amazonaws.internal.SdkInternalList<DomainMembership>(domainMemberships);
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainMemberships(java.util.Collection)} or {@link #withDomainMemberships(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDomainMemberships(DomainMembership... domainMemberships) {
        if (this.domainMemberships == null) {
            setDomainMemberships(new com.amazonaws.internal.SdkInternalList<DomainMembership>(domainMemberships.length));
        }
        for (DomainMembership ele : domainMemberships) {
            this.domainMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB instance.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether tags are copied from the DB instance to snapshots of the DB instance.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     * 
     * @return Specifies whether tags are copied from the DB instance to snapshots of the DB instance.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether tags are copied from the DB instance to snapshots of the DB instance.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     * 
     * @return Specifies whether tags are copied from the DB instance to snapshots of the DB instance.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting. For more information, see <code>DBCluster</code>.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance.
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance.
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring
     * metrics data for the DB instance.
     * </p>
     * 
     * @param enhancedMonitoringResourceArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced
     *        Monitoring metrics data for the DB instance.
     */

    public void setEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        this.enhancedMonitoringResourceArn = enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring
     * metrics data for the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced
     *         Monitoring metrics data for the DB instance.
     */

    public String getEnhancedMonitoringResourceArn() {
        return this.enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring
     * metrics data for the DB instance.
     * </p>
     * 
     * @param enhancedMonitoringResourceArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced
     *        Monitoring metrics data for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        setEnhancedMonitoringResourceArn(enhancedMonitoringResourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *         failure of the existing primary instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the DB instance.
     */

    public void setDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB instance.
     */

    public String getDBInstanceArn() {
        return this.dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceArn(String dBInstanceArn) {
        setDBInstanceArn(dBInstanceArn);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *        time zone specified.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @return The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     *         <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *         time zone specified.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *        time zone specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     *        </p>
     *        </li>
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     *         </p>
     *         </li>
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.
     *         </p>
     *         </li>
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and otherwise false.
     * </p>
     * 
     * @param performanceInsightsEnabled
     *        True if Performance Insights is enabled for the DB instance, and otherwise false.
     */

    public void setPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        this.performanceInsightsEnabled = performanceInsightsEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and otherwise false.
     * </p>
     * 
     * @return True if Performance Insights is enabled for the DB instance, and otherwise false.
     */

    public Boolean getPerformanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and otherwise false.
     * </p>
     * 
     * @param performanceInsightsEnabled
     *        True if Performance Insights is enabled for the DB instance, and otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        setPerformanceInsightsEnabled(performanceInsightsEnabled);
        return this;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and otherwise false.
     * </p>
     * 
     * @return True if Performance Insights is enabled for the DB instance, and otherwise false.
     */

    public Boolean isPerformanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     */

    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @return The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK).
     */

    public String getPerformanceInsightsKMSKeyId() {
        return this.performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @return The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return A list of log types that this DB instance is configured to export to CloudWatch Logs.</p>
     *         <p>
     *         Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     *         Files</a> in the <i>Amazon RDS User Guide.</i>
     */

    public java.util.List<String> getEnabledCloudwatchLogsExports() {
        if (enabledCloudwatchLogsExports == null) {
            enabledCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enabledCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     *        Files</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setEnabledCloudwatchLogsExports(java.util.Collection<String> enabledCloudwatchLogsExports) {
        if (enabledCloudwatchLogsExports == null) {
            this.enabledCloudwatchLogsExports = null;
            return;
        }

        this.enabledCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>(enabledCloudwatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnabledCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     *        Files</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEnabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
        if (this.enabledCloudwatchLogsExports == null) {
            setEnabledCloudwatchLogsExports(new com.amazonaws.internal.SdkInternalList<String>(enabledCloudwatchLogsExports.length));
        }
        for (String ele : enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html">Amazon RDS Database Log
     *        Files</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEnabledCloudwatchLogsExports(java.util.Collection<String> enabledCloudwatchLogsExports) {
        setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        if (processorFeatures == null) {
            processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>();
        }
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withProcessorFeatures(ProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures.length));
        }
        for (ProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     *        protection is enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     *         protection is enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     *        protection is enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion
     *         protection is enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public java.util.List<DBInstanceRole> getAssociatedRoles() {
        if (associatedRoles == null) {
            associatedRoles = new com.amazonaws.internal.SdkInternalList<DBInstanceRole>();
        }
        return associatedRoles;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public void setAssociatedRoles(java.util.Collection<DBInstanceRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new com.amazonaws.internal.SdkInternalList<DBInstanceRole>(associatedRoles);
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAssociatedRoles(DBInstanceRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new com.amazonaws.internal.SdkInternalList<DBInstanceRole>(associatedRoles.length));
        }
        for (DBInstanceRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAssociatedRoles(java.util.Collection<DBInstanceRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     * 
     * @param listenerEndpoint
     *        Specifies the listener connection endpoint for SQL Server Always On.
     */

    public void setListenerEndpoint(Endpoint listenerEndpoint) {
        this.listenerEndpoint = listenerEndpoint;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     * 
     * @return Specifies the listener connection endpoint for SQL Server Always On.
     */

    public Endpoint getListenerEndpoint() {
        return this.listenerEndpoint;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     * 
     * @param listenerEndpoint
     *        Specifies the listener connection endpoint for SQL Server Always On.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withListenerEndpoint(Endpoint listenerEndpoint) {
        setListenerEndpoint(listenerEndpoint);
        return this;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @return The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
            tagList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagList;
    }

    /**
     * @param tagList
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new com.amazonaws.internal.SdkInternalList<Tag>(tagList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new com.amazonaws.internal.SdkInternalList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * The list of replicated automated backups associated with the DB instance.
     * </p>
     * 
     * @return The list of replicated automated backups associated with the DB instance.
     */

    public java.util.List<DBInstanceAutomatedBackupsReplication> getDBInstanceAutomatedBackupsReplications() {
        if (dBInstanceAutomatedBackupsReplications == null) {
            dBInstanceAutomatedBackupsReplications = new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackupsReplication>();
        }
        return dBInstanceAutomatedBackupsReplications;
    }

    /**
     * <p>
     * The list of replicated automated backups associated with the DB instance.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsReplications
     *        The list of replicated automated backups associated with the DB instance.
     */

    public void setDBInstanceAutomatedBackupsReplications(java.util.Collection<DBInstanceAutomatedBackupsReplication> dBInstanceAutomatedBackupsReplications) {
        if (dBInstanceAutomatedBackupsReplications == null) {
            this.dBInstanceAutomatedBackupsReplications = null;
            return;
        }

        this.dBInstanceAutomatedBackupsReplications = new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackupsReplication>(
                dBInstanceAutomatedBackupsReplications);
    }

    /**
     * <p>
     * The list of replicated automated backups associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBInstanceAutomatedBackupsReplications(java.util.Collection)} or
     * {@link #withDBInstanceAutomatedBackupsReplications(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsReplications
     *        The list of replicated automated backups associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceAutomatedBackupsReplications(DBInstanceAutomatedBackupsReplication... dBInstanceAutomatedBackupsReplications) {
        if (this.dBInstanceAutomatedBackupsReplications == null) {
            setDBInstanceAutomatedBackupsReplications(new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackupsReplication>(
                    dBInstanceAutomatedBackupsReplications.length));
        }
        for (DBInstanceAutomatedBackupsReplication ele : dBInstanceAutomatedBackupsReplications) {
            this.dBInstanceAutomatedBackupsReplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of replicated automated backups associated with the DB instance.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsReplications
     *        The list of replicated automated backups associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceAutomatedBackupsReplications(
            java.util.Collection<DBInstanceAutomatedBackupsReplication> dBInstanceAutomatedBackupsReplications) {
        setDBInstanceAutomatedBackupsReplications(dBInstanceAutomatedBackupsReplications);
        return this;
    }

    /**
     * <p>
     * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on AWS
     * Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     * >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * </p>
     * 
     * @param customerOwnedIpEnabled
     *        Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.</p>
     *        <p>
     *        A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on AWS Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about CoIPs, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     *        >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     */

    public void setCustomerOwnedIpEnabled(Boolean customerOwnedIpEnabled) {
        this.customerOwnedIpEnabled = customerOwnedIpEnabled;
    }

    /**
     * <p>
     * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on AWS
     * Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     * >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * </p>
     * 
     * @return Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.</p>
     *         <p>
     *         A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon
     *         RDS on AWS Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about CoIPs, see <a href=
     *         "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     *         >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     */

    public Boolean getCustomerOwnedIpEnabled() {
        return this.customerOwnedIpEnabled;
    }

    /**
     * <p>
     * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on AWS
     * Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     * >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * </p>
     * 
     * @param customerOwnedIpEnabled
     *        Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.</p>
     *        <p>
     *        A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on AWS Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about CoIPs, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     *        >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withCustomerOwnedIpEnabled(Boolean customerOwnedIpEnabled) {
        setCustomerOwnedIpEnabled(customerOwnedIpEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on AWS
     * Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     * >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     * </p>
     * 
     * @return Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance.</p>
     *         <p>
     *         A <i>CoIP </i>provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon
     *         RDS on AWS Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about CoIPs, see <a href=
     *         "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing"
     *         >Customer-owned IP addresses</a> in the <i>AWS Outposts User Guide</i>.
     */

    public Boolean isCustomerOwnedIpEnabled() {
        return this.customerOwnedIpEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     */

    public void setAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        this.awsBackupRecoveryPointArn = awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     */

    public String getAwsBackupRecoveryPointArn() {
        return this.awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        setAwsBackupRecoveryPointArn(awsBackupRecoveryPointArn);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getDBInstanceStatus() != null)
            sb.append("DBInstanceStatus: ").append(getDBInstanceStatus()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: ").append(getDBSecurityGroups()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getDBParameterGroups() != null)
            sb.append("DBParameterGroups: ").append(getDBParameterGroups()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: ").append(getDBSubnetGroup()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: ").append(getLatestRestorableTime()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getReadReplicaSourceDBInstanceIdentifier() != null)
            sb.append("ReadReplicaSourceDBInstanceIdentifier: ").append(getReadReplicaSourceDBInstanceIdentifier()).append(",");
        if (getReadReplicaDBInstanceIdentifiers() != null)
            sb.append("ReadReplicaDBInstanceIdentifiers: ").append(getReadReplicaDBInstanceIdentifiers()).append(",");
        if (getReadReplicaDBClusterIdentifiers() != null)
            sb.append("ReadReplicaDBClusterIdentifiers: ").append(getReadReplicaDBClusterIdentifiers()).append(",");
        if (getReplicaMode() != null)
            sb.append("ReplicaMode: ").append(getReplicaMode()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupMemberships() != null)
            sb.append("OptionGroupMemberships: ").append(getOptionGroupMemberships()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getNcharCharacterSetName() != null)
            sb.append("NcharCharacterSetName: ").append(getNcharCharacterSetName()).append(",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: ").append(getSecondaryAvailabilityZone()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getStatusInfos() != null)
            sb.append("StatusInfos: ").append(getStatusInfos()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getDbInstancePort() != null)
            sb.append("DbInstancePort: ").append(getDbInstancePort()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: ").append(getDomainMemberships()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getEnhancedMonitoringResourceArn() != null)
            sb.append("EnhancedMonitoringResourceArn: ").append(getEnhancedMonitoringResourceArn()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getDBInstanceArn() != null)
            sb.append("DBInstanceArn: ").append(getDBInstanceArn()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getPerformanceInsightsEnabled() != null)
            sb.append("PerformanceInsightsEnabled: ").append(getPerformanceInsightsEnabled()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getEnabledCloudwatchLogsExports() != null)
            sb.append("EnabledCloudwatchLogsExports: ").append(getEnabledCloudwatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles()).append(",");
        if (getListenerEndpoint() != null)
            sb.append("ListenerEndpoint: ").append(getListenerEndpoint()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getDBInstanceAutomatedBackupsReplications() != null)
            sb.append("DBInstanceAutomatedBackupsReplications: ").append(getDBInstanceAutomatedBackupsReplications()).append(",");
        if (getCustomerOwnedIpEnabled() != null)
            sb.append("CustomerOwnedIpEnabled: ").append(getCustomerOwnedIpEnabled()).append(",");
        if (getAwsBackupRecoveryPointArn() != null)
            sb.append("AwsBackupRecoveryPointArn: ").append(getAwsBackupRecoveryPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstance == false)
            return false;
        DBInstance other = (DBInstance) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getDBInstanceStatus() == null ^ this.getDBInstanceStatus() == null)
            return false;
        if (other.getDBInstanceStatus() != null && other.getDBInstanceStatus().equals(this.getDBInstanceStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getDBParameterGroups() == null ^ this.getDBParameterGroups() == null)
            return false;
        if (other.getDBParameterGroups() != null && other.getDBParameterGroups().equals(this.getDBParameterGroups()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() == null ^ this.getReadReplicaSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() != null
                && other.getReadReplicaSourceDBInstanceIdentifier().equals(this.getReadReplicaSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() == null ^ this.getReadReplicaDBInstanceIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() != null
                && other.getReadReplicaDBInstanceIdentifiers().equals(this.getReadReplicaDBInstanceIdentifiers()) == false)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() == null ^ this.getReadReplicaDBClusterIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() != null
                && other.getReadReplicaDBClusterIdentifiers().equals(this.getReadReplicaDBClusterIdentifiers()) == false)
            return false;
        if (other.getReplicaMode() == null ^ this.getReplicaMode() == null)
            return false;
        if (other.getReplicaMode() != null && other.getReplicaMode().equals(this.getReplicaMode()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupMemberships() == null ^ this.getOptionGroupMemberships() == null)
            return false;
        if (other.getOptionGroupMemberships() != null && other.getOptionGroupMemberships().equals(this.getOptionGroupMemberships()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getNcharCharacterSetName() == null ^ this.getNcharCharacterSetName() == null)
            return false;
        if (other.getNcharCharacterSetName() != null && other.getNcharCharacterSetName().equals(this.getNcharCharacterSetName()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStatusInfos() == null ^ this.getStatusInfos() == null)
            return false;
        if (other.getStatusInfos() != null && other.getStatusInfos().equals(this.getStatusInfos()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getDbInstancePort() == null ^ this.getDbInstancePort() == null)
            return false;
        if (other.getDbInstancePort() != null && other.getDbInstancePort().equals(this.getDbInstancePort()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getEnhancedMonitoringResourceArn() == null ^ this.getEnhancedMonitoringResourceArn() == null)
            return false;
        if (other.getEnhancedMonitoringResourceArn() != null
                && other.getEnhancedMonitoringResourceArn().equals(this.getEnhancedMonitoringResourceArn()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getDBInstanceArn() == null ^ this.getDBInstanceArn() == null)
            return false;
        if (other.getDBInstanceArn() != null && other.getDBInstanceArn().equals(this.getDBInstanceArn()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getPerformanceInsightsEnabled() == null ^ this.getPerformanceInsightsEnabled() == null)
            return false;
        if (other.getPerformanceInsightsEnabled() != null && other.getPerformanceInsightsEnabled().equals(this.getPerformanceInsightsEnabled()) == false)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() == null ^ this.getPerformanceInsightsKMSKeyId() == null)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() != null && other.getPerformanceInsightsKMSKeyId().equals(this.getPerformanceInsightsKMSKeyId()) == false)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() == null ^ this.getPerformanceInsightsRetentionPeriod() == null)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() != null
                && other.getPerformanceInsightsRetentionPeriod().equals(this.getPerformanceInsightsRetentionPeriod()) == false)
            return false;
        if (other.getEnabledCloudwatchLogsExports() == null ^ this.getEnabledCloudwatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudwatchLogsExports() != null && other.getEnabledCloudwatchLogsExports().equals(this.getEnabledCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getListenerEndpoint() == null ^ this.getListenerEndpoint() == null)
            return false;
        if (other.getListenerEndpoint() != null && other.getListenerEndpoint().equals(this.getListenerEndpoint()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getDBInstanceAutomatedBackupsReplications() == null ^ this.getDBInstanceAutomatedBackupsReplications() == null)
            return false;
        if (other.getDBInstanceAutomatedBackupsReplications() != null
                && other.getDBInstanceAutomatedBackupsReplications().equals(this.getDBInstanceAutomatedBackupsReplications()) == false)
            return false;
        if (other.getCustomerOwnedIpEnabled() == null ^ this.getCustomerOwnedIpEnabled() == null)
            return false;
        if (other.getCustomerOwnedIpEnabled() != null && other.getCustomerOwnedIpEnabled().equals(this.getCustomerOwnedIpEnabled()) == false)
            return false;
        if (other.getAwsBackupRecoveryPointArn() == null ^ this.getAwsBackupRecoveryPointArn() == null)
            return false;
        if (other.getAwsBackupRecoveryPointArn() != null && other.getAwsBackupRecoveryPointArn().equals(this.getAwsBackupRecoveryPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceStatus() == null) ? 0 : getDBInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroups() == null) ? 0 : getDBParameterGroups().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaSourceDBInstanceIdentifier() == null) ? 0 : getReadReplicaSourceDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaDBInstanceIdentifiers() == null) ? 0 : getReadReplicaDBInstanceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaDBClusterIdentifiers() == null) ? 0 : getReadReplicaDBClusterIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getReplicaMode() == null) ? 0 : getReplicaMode().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupMemberships() == null) ? 0 : getOptionGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getNcharCharacterSetName() == null) ? 0 : getNcharCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getStatusInfos() == null) ? 0 : getStatusInfos().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getDbInstancePort() == null) ? 0 : getDbInstancePort().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoringResourceArn() == null) ? 0 : getEnhancedMonitoringResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceArn() == null) ? 0 : getDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsEnabled() == null) ? 0 : getPerformanceInsightsEnabled().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getEnabledCloudwatchLogsExports() == null) ? 0 : getEnabledCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode + ((getListenerEndpoint() == null) ? 0 : getListenerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceAutomatedBackupsReplications() == null) ? 0 : getDBInstanceAutomatedBackupsReplications().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIpEnabled() == null) ? 0 : getCustomerOwnedIpEnabled().hashCode());
        hashCode = prime * hashCode + ((getAwsBackupRecoveryPointArn() == null) ? 0 : getAwsBackupRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public DBInstance clone() {
        try {
            return (DBInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
