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
 * Contains the details of an Amazon Aurora DB cluster.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
 * <code>StartDBCluster</code> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBCluster implements Serializable, Cloneable {

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is associated with.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     * specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroup;
    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster, including the name, description, and
     * subnets in the subnet group.
     * </p>
     */
    private String dBSubnetGroup;
    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     */
    private String percentProgress;
    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time restore.
     * </p>
     */
    private java.util.Date earliestRestorableTime;
    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB cluster.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the
     * Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint,
     * Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can
     * help balance your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance,
     * your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you
     * can then reconnect to the reader endpoint.
     * </p>
     */
    private String readerEndpoint;
    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> customEndpoints;
    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;
    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships;
    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     * </p>
     */
    private String replicationSourceIdentifier;
    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> readReplicaIdentifiers;
    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterMember> dBClusterMembers;
    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS CMK for the DB cluster is accessed.
     * </p>
     */
    private String dbClusterResourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     */
    private String dBClusterArn;
    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services
     * on your behalf.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterRole> associatedRoles;
    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     */
    private String cloneGroupId;
    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     */
    private java.util.Date earliestBacktrackTime;
    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster.
     * Otherwise, backtracking is enabled.
     * </p>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     */
    private Long backtrackConsumedChangeRecords;
    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enabledCloudwatchLogsExports;
    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private Integer capacity;
    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     */
    private String engineMode;

    private ScalingConfigurationInfo scalingConfigurationInfo;
    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private Boolean httpEndpointEnabled;
    /**
     * <p>
     * The mode of the database activity stream. Database events such as a change or access generate an activity stream
     * event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     */
    private String activityStreamMode;
    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     */
    private String activityStreamStatus;
    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     */
    private String activityStreamKmsKeyId;
    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     */
    private String activityStreamKinesisStreamName;
    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     */
    private Boolean crossAccountClone;
    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainMembership> domainMemberships;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;
    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or
     * is in the process of enabling it.
     * </p>
     */
    private String globalWriteForwardingStatus;
    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global
     * database. Because write forwarding takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     * forwarding feature for this cluster.
     * </p>
     */
    private Boolean globalWriteForwardingRequested;
    /**
     * <p>
     * A value that specifies that changes to the DB cluster are pending. This element is only included when changes are
     * pending. Specific changes are identified by subelements.
     * </p>
     */
    private ClusterPendingModifiedValues pendingModifiedValues;

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *        storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *        Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @return For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *         storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *         Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *        storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *        Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @return Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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

    public DBCluster withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this cluster is associated with.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is associated with.
     * </p>
     * 
     * @return If present, specifies the name of the character set that this cluster is associated with.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this cluster is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     * specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @param databaseName
     *        Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     *        specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     * specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @return Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     *         specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     * specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @param databaseName
     *        Contains the name of the initial database of this DB cluster that was provided at create time, if one was
     *        specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *        cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @return Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *         cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroup
     *        Specifies the name of the DB cluster parameter group for the DB cluster.
     */

    public void setDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @return Specifies the name of the DB cluster parameter group for the DB cluster.
     */

    public String getDBClusterParameterGroup() {
        return this.dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroup
     *        Specifies the name of the DB cluster parameter group for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterParameterGroup(String dBClusterParameterGroup) {
        setDBClusterParameterGroup(dBClusterParameterGroup);
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB cluster, including the name, description,
     *        and subnets in the subnet group.
     */

    public void setDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @return Specifies information on the subnet group associated with the DB cluster, including the name,
     *         description, and subnets in the subnet group.
     */

    public String getDBSubnetGroup() {
        return this.dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster, including the name, description, and
     * subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB cluster, including the name, description,
     *        and subnets in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBSubnetGroup(String dBSubnetGroup) {
        setDBSubnetGroup(dBSubnetGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this DB cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @return Specifies the current state of this DB cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the progress of the operation as a percentage.
     */

    public void setPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @return Specifies the progress of the operation as a percentage.
     */

    public String getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the progress of the operation as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withPercentProgress(String percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param earliestRestorableTime
     *        The earliest time to which a database can be restored with point-in-time restore.
     */

    public void setEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @return The earliest time to which a database can be restored with point-in-time restore.
     */

    public java.util.Date getEarliestRestorableTime() {
        return this.earliestRestorableTime;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param earliestRestorableTime
     *        The earliest time to which a database can be restored with point-in-time restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        setEarliestRestorableTime(earliestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint for the primary instance of the DB cluster.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @return Specifies the connection endpoint for the primary instance of the DB cluster.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint for the primary instance of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the
     * Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint,
     * Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can
     * help balance your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance,
     * your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you
     * can then reconnect to the reader endpoint.
     * </p>
     * 
     * @param readerEndpoint
     *        The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections
     *        across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the
     *        reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster.
     *        This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.
     *        </p>
     *        <p>
     *        If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary
     *        instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in
     *        the cluster, you can then reconnect to the reader endpoint.
     */

    public void setReaderEndpoint(String readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the
     * Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint,
     * Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can
     * help balance your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance,
     * your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you
     * can then reconnect to the reader endpoint.
     * </p>
     * 
     * @return The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections
     *         across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the
     *         reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster.
     *         This functionality can help balance your read workload across multiple Aurora Replicas in your DB
     *         cluster. </p>
     *         <p>
     *         If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary
     *         instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in
     *         the cluster, you can then reconnect to the reader endpoint.
     */

    public String getReaderEndpoint() {
        return this.readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the
     * Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint,
     * Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can
     * help balance your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance,
     * your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you
     * can then reconnect to the reader endpoint.
     * </p>
     * 
     * @param readerEndpoint
     *        The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections
     *        across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the
     *        reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster.
     *        This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.
     *        </p>
     *        <p>
     *        If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary
     *        instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in
     *        the cluster, you can then reconnect to the reader endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withReaderEndpoint(String readerEndpoint) {
        setReaderEndpoint(readerEndpoint);
        return this;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * 
     * @return Identifies all custom endpoints associated with the cluster.
     */

    public java.util.List<String> getCustomEndpoints() {
        if (customEndpoints == null) {
            customEndpoints = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return customEndpoints;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * 
     * @param customEndpoints
     *        Identifies all custom endpoints associated with the cluster.
     */

    public void setCustomEndpoints(java.util.Collection<String> customEndpoints) {
        if (customEndpoints == null) {
            this.customEndpoints = null;
            return;
        }

        this.customEndpoints = new com.amazonaws.internal.SdkInternalList<String>(customEndpoints);
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomEndpoints(java.util.Collection)} or {@link #withCustomEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customEndpoints
     *        Identifies all custom endpoints associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCustomEndpoints(String... customEndpoints) {
        if (this.customEndpoints == null) {
            setCustomEndpoints(new com.amazonaws.internal.SdkInternalList<String>(customEndpoints.length));
        }
        for (String ele : customEndpoints) {
            this.customEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * 
     * @param customEndpoints
     *        Identifies all custom endpoints associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCustomEndpoints(java.util.Collection<String> customEndpoints) {
        setCustomEndpoints(customEndpoints);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DB cluster has instances in multiple Availability Zones.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @return Specifies whether the DB cluster has instances in multiple Availability Zones.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DB cluster has instances in multiple Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @return Specifies whether the DB cluster has instances in multiple Availability Zones.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @return The name of the database engine to be used for this DB cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEngine(String engine) {
        setEngine(engine);
        return this;
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

    public DBCluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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

    public DBCluster withLatestRestorableTime(java.util.Date latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine is listening on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @return Specifies the port that the database engine is listening on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine is listening on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB cluster.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @return Contains the master username for the DB cluster.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @return Provides the list of option group memberships for this DB cluster.
     */

    public java.util.List<DBClusterOptionGroupStatus> getDBClusterOptionGroupMemberships() {
        if (dBClusterOptionGroupMemberships == null) {
            dBClusterOptionGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>();
        }
        return dBClusterOptionGroupMemberships;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     */

    public void setDBClusterOptionGroupMemberships(java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        if (dBClusterOptionGroupMemberships == null) {
            this.dBClusterOptionGroupMemberships = null;
            return;
        }

        this.dBClusterOptionGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>(dBClusterOptionGroupMemberships);
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterOptionGroupMemberships(java.util.Collection)} or
     * {@link #withDBClusterOptionGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterOptionGroupMemberships(DBClusterOptionGroupStatus... dBClusterOptionGroupMemberships) {
        if (this.dBClusterOptionGroupMemberships == null) {
            setDBClusterOptionGroupMemberships(new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>(dBClusterOptionGroupMemberships.length));
        }
        for (DBClusterOptionGroupStatus ele : dBClusterOptionGroupMemberships) {
            this.dBClusterOptionGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterOptionGroupMemberships(java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        setDBClusterOptionGroupMemberships(dBClusterOptionGroupMemberships);
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

    public DBCluster withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
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

    public DBCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     */

    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     * </p>
     * 
     * @return Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        Contains the identifier of the source DB cluster if this DB cluster is a read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB cluster.
     * </p>
     * 
     * @return Contains one or more identifiers of the read replicas associated with this DB cluster.
     */

    public java.util.List<String> getReadReplicaIdentifiers() {
        if (readReplicaIdentifiers == null) {
            readReplicaIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return readReplicaIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB cluster.
     */

    public void setReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        if (readReplicaIdentifiers == null) {
            this.readReplicaIdentifiers = null;
            return;
        }

        this.readReplicaIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(readReplicaIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withReadReplicaIdentifiers(String... readReplicaIdentifiers) {
        if (this.readReplicaIdentifiers == null) {
            setReadReplicaIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(readReplicaIdentifiers.length));
        }
        for (String ele : readReplicaIdentifiers) {
            this.readReplicaIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the read replicas associated with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        setReadReplicaIdentifiers(readReplicaIdentifiers);
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @return Provides the list of instances that make up the DB cluster.
     */

    public java.util.List<DBClusterMember> getDBClusterMembers() {
        if (dBClusterMembers == null) {
            dBClusterMembers = new com.amazonaws.internal.SdkInternalList<DBClusterMember>();
        }
        return dBClusterMembers;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     */

    public void setDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        if (dBClusterMembers == null) {
            this.dBClusterMembers = null;
            return;
        }

        this.dBClusterMembers = new com.amazonaws.internal.SdkInternalList<DBClusterMember>(dBClusterMembers);
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterMembers(java.util.Collection)} or {@link #withDBClusterMembers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterMembers(DBClusterMember... dBClusterMembers) {
        if (this.dBClusterMembers == null) {
            setDBClusterMembers(new com.amazonaws.internal.SdkInternalList<DBClusterMember>(dBClusterMembers.length));
        }
        for (DBClusterMember ele : dBClusterMembers) {
            this.dBClusterMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        setDBClusterMembers(dBClusterMembers);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security groups that the DB cluster belongs to.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
            vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs to.
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
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
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
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @return Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.</p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK).
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier for the encrypted DB cluster.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS CMK for the DB cluster is accessed.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail
     *        log entries whenever the AWS KMS CMK for the DB cluster is accessed.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS CMK for the DB cluster is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS
     *         CloudTrail log entries whenever the AWS KMS CMK for the DB cluster is accessed.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS CMK for the DB cluster is accessed.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail
     *        log entries whenever the AWS KMS CMK for the DB cluster is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for the DB cluster.
     */

    public void setDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB cluster.
     */

    public String getDBClusterArn() {
        return this.dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDBClusterArn(String dBClusterArn) {
        setDBClusterArn(dBClusterArn);
        return this;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services
     * on your behalf.
     * </p>
     * 
     * @return Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB
     *         cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     *         other AWS services on your behalf.
     */

    public java.util.List<DBClusterRole> getAssociatedRoles() {
        if (associatedRoles == null) {
            associatedRoles = new com.amazonaws.internal.SdkInternalList<DBClusterRole>();
        }
        return associatedRoles;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services
     * on your behalf.
     * </p>
     * 
     * @param associatedRoles
     *        Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB
     *        cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     *        other AWS services on your behalf.
     */

    public void setAssociatedRoles(java.util.Collection<DBClusterRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new com.amazonaws.internal.SdkInternalList<DBClusterRole>(associatedRoles);
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services
     * on your behalf.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB
     *        cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     *        other AWS services on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withAssociatedRoles(DBClusterRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new com.amazonaws.internal.SdkInternalList<DBClusterRole>(associatedRoles.length));
        }
        for (DBClusterRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services
     * on your behalf.
     * </p>
     * 
     * @param associatedRoles
     *        Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB
     *        cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     *        other AWS services on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withAssociatedRoles(java.util.Collection<DBClusterRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts is enabled.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @return A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts is enabled.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @return A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts is enabled.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     * 
     * @param cloneGroupId
     *        Identifies the clone group to which the DB cluster is associated.
     */

    public void setCloneGroupId(String cloneGroupId) {
        this.cloneGroupId = cloneGroupId;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     * 
     * @return Identifies the clone group to which the DB cluster is associated.
     */

    public String getCloneGroupId() {
        return this.cloneGroupId;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     * 
     * @param cloneGroupId
     *        Identifies the clone group to which the DB cluster is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCloneGroupId(String cloneGroupId) {
        setCloneGroupId(cloneGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     * 
     * @param earliestBacktrackTime
     *        The earliest time to which a DB cluster can be backtracked.
     */

    public void setEarliestBacktrackTime(java.util.Date earliestBacktrackTime) {
        this.earliestBacktrackTime = earliestBacktrackTime;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     * 
     * @return The earliest time to which a DB cluster can be backtracked.
     */

    public java.util.Date getEarliestBacktrackTime() {
        return this.earliestBacktrackTime;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     * 
     * @param earliestBacktrackTime
     *        The earliest time to which a DB cluster can be backtracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEarliestBacktrackTime(java.util.Date earliestBacktrackTime) {
        setEarliestBacktrackTime(earliestBacktrackTime);
        return this;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster.
     * Otherwise, backtracking is enabled.
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB
     *        cluster. Otherwise, backtracking is enabled.
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster.
     * Otherwise, backtracking is enabled.
     * </p>
     * 
     * @return The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB
     *         cluster. Otherwise, backtracking is enabled.
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster.
     * Otherwise, backtracking is enabled.
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB
     *        cluster. Otherwise, backtracking is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     * 
     * @param backtrackConsumedChangeRecords
     *        The number of change records stored for Backtrack.
     */

    public void setBacktrackConsumedChangeRecords(Long backtrackConsumedChangeRecords) {
        this.backtrackConsumedChangeRecords = backtrackConsumedChangeRecords;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     * 
     * @return The number of change records stored for Backtrack.
     */

    public Long getBacktrackConsumedChangeRecords() {
        return this.backtrackConsumedChangeRecords;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     * 
     * @param backtrackConsumedChangeRecords
     *        The number of change records stored for Backtrack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withBacktrackConsumedChangeRecords(Long backtrackConsumedChangeRecords) {
        setBacktrackConsumedChangeRecords(backtrackConsumedChangeRecords);
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @return A list of log types that this DB cluster is configured to export to CloudWatch Logs.</p>
     *         <p>
     *         Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS
     *         Database Log Files</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public java.util.List<String> getEnabledCloudwatchLogsExports() {
        if (enabledCloudwatchLogsExports == null) {
            enabledCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enabledCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS
     *        Database Log Files</a> in the <i>Amazon Aurora User Guide.</i>
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
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnabledCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS
     *        Database Log Files</a> in the <i>Amazon Aurora User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEnabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
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
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each DB engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS Database Log
     * Files</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.</p>
     *        <p>
     *        Log types vary by DB engine. For information about the log types for each DB engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html">Amazon RDS
     *        Database Log Files</a> in the <i>Amazon Aurora User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEnabledCloudwatchLogsExports(java.util.Collection<String> enabledCloudwatchLogsExports) {
        setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param capacity
     *        The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is
     *        paused.</p>
     *        <p>
     *        For more information about Aurora Serverless, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is
     *         paused.</p>
     *         <p>
     *         For more information about Aurora Serverless, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param capacity
     *        The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is
     *        paused.</p>
     *        <p>
     *        For more information about Aurora Serverless, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *        CreateDBCluster</a>.
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * 
     * @return The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *         CreateDBCluster</a>.
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *        CreateDBCluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * @param scalingConfigurationInfo
     */

    public void setScalingConfigurationInfo(ScalingConfigurationInfo scalingConfigurationInfo) {
        this.scalingConfigurationInfo = scalingConfigurationInfo;
    }

    /**
     * @return
     */

    public ScalingConfigurationInfo getScalingConfigurationInfo() {
        return this.scalingConfigurationInfo;
    }

    /**
     * @param scalingConfigurationInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withScalingConfigurationInfo(ScalingConfigurationInfo scalingConfigurationInfo) {
        setScalingConfigurationInfo(scalingConfigurationInfo);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     *        protection is enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled.
     * </p>
     * 
     * @return Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     *         protection is enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     *        protection is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled.
     * </p>
     * 
     * @return Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion
     *         protection is enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        this.httpEndpointEnabled = httpEndpointEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Boolean getHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        setHttpEndpointEnabled(httpEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Boolean isHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a change or access generate an activity stream
     * event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param activityStreamMode
     *        The mode of the database activity stream. Database events such as a change or access generate an activity
     *        stream event. The database session can handle these events either synchronously or asynchronously.
     * @see ActivityStreamMode
     */

    public void setActivityStreamMode(String activityStreamMode) {
        this.activityStreamMode = activityStreamMode;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a change or access generate an activity stream
     * event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @return The mode of the database activity stream. Database events such as a change or access generate an activity
     *         stream event. The database session can handle these events either synchronously or asynchronously.
     * @see ActivityStreamMode
     */

    public String getActivityStreamMode() {
        return this.activityStreamMode;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a change or access generate an activity stream
     * event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param activityStreamMode
     *        The mode of the database activity stream. Database events such as a change or access generate an activity
     *        stream event. The database session can handle these events either synchronously or asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public DBCluster withActivityStreamMode(String activityStreamMode) {
        setActivityStreamMode(activityStreamMode);
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a change or access generate an activity stream
     * event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param activityStreamMode
     *        The mode of the database activity stream. Database events such as a change or access generate an activity
     *        stream event. The database session can handle these events either synchronously or asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public DBCluster withActivityStreamMode(ActivityStreamMode activityStreamMode) {
        this.activityStreamMode = activityStreamMode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param activityStreamStatus
     *        The status of the database activity stream.
     * @see ActivityStreamStatus
     */

    public void setActivityStreamStatus(String activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @return The status of the database activity stream.
     * @see ActivityStreamStatus
     */

    public String getActivityStreamStatus() {
        return this.activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param activityStreamStatus
     *        The status of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public DBCluster withActivityStreamStatus(String activityStreamStatus) {
        setActivityStreamStatus(activityStreamStatus);
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param activityStreamStatus
     *        The status of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public DBCluster withActivityStreamStatus(ActivityStreamStatus activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param activityStreamKmsKeyId
     *        The AWS KMS key identifier used for encrypting messages in the database activity stream.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     */

    public void setActivityStreamKmsKeyId(String activityStreamKmsKeyId) {
        this.activityStreamKmsKeyId = activityStreamKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @return The AWS KMS key identifier used for encrypting messages in the database activity stream.</p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK).
     */

    public String getActivityStreamKmsKeyId() {
        return this.activityStreamKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * 
     * @param activityStreamKmsKeyId
     *        The AWS KMS key identifier used for encrypting messages in the database activity stream.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withActivityStreamKmsKeyId(String activityStreamKmsKeyId) {
        setActivityStreamKmsKeyId(activityStreamKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @param activityStreamKinesisStreamName
     *        The name of the Amazon Kinesis data stream used for the database activity stream.
     */

    public void setActivityStreamKinesisStreamName(String activityStreamKinesisStreamName) {
        this.activityStreamKinesisStreamName = activityStreamKinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis data stream used for the database activity stream.
     */

    public String getActivityStreamKinesisStreamName() {
        return this.activityStreamKinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @param activityStreamKinesisStreamName
     *        The name of the Amazon Kinesis data stream used for the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withActivityStreamKinesisStreamName(String activityStreamKinesisStreamName) {
        setActivityStreamKinesisStreamName(activityStreamKinesisStreamName);
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @return Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @return Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @param crossAccountClone
     *        Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public void setCrossAccountClone(Boolean crossAccountClone) {
        this.crossAccountClone = crossAccountClone;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @return Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public Boolean getCrossAccountClone() {
        return this.crossAccountClone;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @param crossAccountClone
     *        Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withCrossAccountClone(Boolean crossAccountClone) {
        setCrossAccountClone(crossAccountClone);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @return Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public Boolean isCrossAccountClone() {
        return this.crossAccountClone;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB cluster.
     * </p>
     * 
     * @return The Active Directory Domain membership records associated with the DB cluster.
     */

    public java.util.List<DomainMembership> getDomainMemberships() {
        if (domainMemberships == null) {
            domainMemberships = new com.amazonaws.internal.SdkInternalList<DomainMembership>();
        }
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB cluster.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB cluster.
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
     * The Active Directory Domain membership records associated with the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainMemberships(java.util.Collection)} or {@link #withDomainMemberships(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDomainMemberships(DomainMembership... domainMemberships) {
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
     * The Active Directory Domain membership records associated with the DB cluster.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory Domain membership records associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
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

    public DBCluster withTagList(Tag... tagList) {
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

    public DBCluster withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or
     * is in the process of enabling it.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not
     *        enabled, or is in the process of enabling it.
     * @see WriteForwardingStatus
     */

    public void setGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or
     * is in the process of enabling it.
     * </p>
     * 
     * @return Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not
     *         enabled, or is in the process of enabling it.
     * @see WriteForwardingStatus
     */

    public String getGlobalWriteForwardingStatus() {
        return this.globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or
     * is in the process of enabling it.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not
     *        enabled, or is in the process of enabling it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteForwardingStatus
     */

    public DBCluster withGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        setGlobalWriteForwardingStatus(globalWriteForwardingStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or
     * is in the process of enabling it.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not
     *        enabled, or is in the process of enabling it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteForwardingStatus
     */

    public DBCluster withGlobalWriteForwardingStatus(WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global
     * database. Because write forwarding takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     * forwarding feature for this cluster.
     * </p>
     * 
     * @param globalWriteForwardingRequested
     *        Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora
     *        global database. Because write forwarding takes time to enable, check the value of
     *        <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     *        forwarding feature for this cluster.
     */

    public void setGlobalWriteForwardingRequested(Boolean globalWriteForwardingRequested) {
        this.globalWriteForwardingRequested = globalWriteForwardingRequested;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global
     * database. Because write forwarding takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     * forwarding feature for this cluster.
     * </p>
     * 
     * @return Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora
     *         global database. Because write forwarding takes time to enable, check the value of
     *         <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     *         forwarding feature for this cluster.
     */

    public Boolean getGlobalWriteForwardingRequested() {
        return this.globalWriteForwardingRequested;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global
     * database. Because write forwarding takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     * forwarding feature for this cluster.
     * </p>
     * 
     * @param globalWriteForwardingRequested
     *        Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora
     *        global database. Because write forwarding takes time to enable, check the value of
     *        <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     *        forwarding feature for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withGlobalWriteForwardingRequested(Boolean globalWriteForwardingRequested) {
        setGlobalWriteForwardingRequested(globalWriteForwardingRequested);
        return this;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global
     * database. Because write forwarding takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     * forwarding feature for this cluster.
     * </p>
     * 
     * @return Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora
     *         global database. Because write forwarding takes time to enable, check the value of
     *         <code>GlobalWriteForwardingStatus</code> to confirm that the request has completed before using the write
     *         forwarding feature for this cluster.
     */

    public Boolean isGlobalWriteForwardingRequested() {
        return this.globalWriteForwardingRequested;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB cluster are pending. This element is only included when changes are
     * pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that specifies that changes to the DB cluster are pending. This element is only included when
     *        changes are pending. Specific changes are identified by subelements.
     */

    public void setPendingModifiedValues(ClusterPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB cluster are pending. This element is only included when changes are
     * pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @return A value that specifies that changes to the DB cluster are pending. This element is only included when
     *         changes are pending. Specific changes are identified by subelements.
     */

    public ClusterPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A value that specifies that changes to the DB cluster are pending. This element is only included when changes are
     * pending. Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that specifies that changes to the DB cluster are pending. This element is only included when
     *        changes are pending. Specific changes are identified by subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBCluster withPendingModifiedValues(ClusterPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterParameterGroup() != null)
            sb.append("DBClusterParameterGroup: ").append(getDBClusterParameterGroup()).append(",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: ").append(getDBSubnetGroup()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getEarliestRestorableTime() != null)
            sb.append("EarliestRestorableTime: ").append(getEarliestRestorableTime()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getReaderEndpoint() != null)
            sb.append("ReaderEndpoint: ").append(getReaderEndpoint()).append(",");
        if (getCustomEndpoints() != null)
            sb.append("CustomEndpoints: ").append(getCustomEndpoints()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: ").append(getLatestRestorableTime()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getDBClusterOptionGroupMemberships() != null)
            sb.append("DBClusterOptionGroupMemberships: ").append(getDBClusterOptionGroupMemberships()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: ").append(getReplicationSourceIdentifier()).append(",");
        if (getReadReplicaIdentifiers() != null)
            sb.append("ReadReplicaIdentifiers: ").append(getReadReplicaIdentifiers()).append(",");
        if (getDBClusterMembers() != null)
            sb.append("DBClusterMembers: ").append(getDBClusterMembers()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId()).append(",");
        if (getDBClusterArn() != null)
            sb.append("DBClusterArn: ").append(getDBClusterArn()).append(",");
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getCloneGroupId() != null)
            sb.append("CloneGroupId: ").append(getCloneGroupId()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getEarliestBacktrackTime() != null)
            sb.append("EarliestBacktrackTime: ").append(getEarliestBacktrackTime()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getBacktrackConsumedChangeRecords() != null)
            sb.append("BacktrackConsumedChangeRecords: ").append(getBacktrackConsumedChangeRecords()).append(",");
        if (getEnabledCloudwatchLogsExports() != null)
            sb.append("EnabledCloudwatchLogsExports: ").append(getEnabledCloudwatchLogsExports()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getScalingConfigurationInfo() != null)
            sb.append("ScalingConfigurationInfo: ").append(getScalingConfigurationInfo()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getHttpEndpointEnabled() != null)
            sb.append("HttpEndpointEnabled: ").append(getHttpEndpointEnabled()).append(",");
        if (getActivityStreamMode() != null)
            sb.append("ActivityStreamMode: ").append(getActivityStreamMode()).append(",");
        if (getActivityStreamStatus() != null)
            sb.append("ActivityStreamStatus: ").append(getActivityStreamStatus()).append(",");
        if (getActivityStreamKmsKeyId() != null)
            sb.append("ActivityStreamKmsKeyId: ").append(getActivityStreamKmsKeyId()).append(",");
        if (getActivityStreamKinesisStreamName() != null)
            sb.append("ActivityStreamKinesisStreamName: ").append(getActivityStreamKinesisStreamName()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getCrossAccountClone() != null)
            sb.append("CrossAccountClone: ").append(getCrossAccountClone()).append(",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: ").append(getDomainMemberships()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getGlobalWriteForwardingStatus() != null)
            sb.append("GlobalWriteForwardingStatus: ").append(getGlobalWriteForwardingStatus()).append(",");
        if (getGlobalWriteForwardingRequested() != null)
            sb.append("GlobalWriteForwardingRequested: ").append(getGlobalWriteForwardingRequested()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBCluster == false)
            return false;
        DBCluster other = (DBCluster) obj;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterParameterGroup() == null ^ this.getDBClusterParameterGroup() == null)
            return false;
        if (other.getDBClusterParameterGroup() != null && other.getDBClusterParameterGroup().equals(this.getDBClusterParameterGroup()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getEarliestRestorableTime() == null ^ this.getEarliestRestorableTime() == null)
            return false;
        if (other.getEarliestRestorableTime() != null && other.getEarliestRestorableTime().equals(this.getEarliestRestorableTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getReaderEndpoint() == null ^ this.getReaderEndpoint() == null)
            return false;
        if (other.getReaderEndpoint() != null && other.getReaderEndpoint().equals(this.getReaderEndpoint()) == false)
            return false;
        if (other.getCustomEndpoints() == null ^ this.getCustomEndpoints() == null)
            return false;
        if (other.getCustomEndpoints() != null && other.getCustomEndpoints().equals(this.getCustomEndpoints()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBClusterOptionGroupMemberships() == null ^ this.getDBClusterOptionGroupMemberships() == null)
            return false;
        if (other.getDBClusterOptionGroupMemberships() != null
                && other.getDBClusterOptionGroupMemberships().equals(this.getDBClusterOptionGroupMemberships()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReplicationSourceIdentifier() == null ^ this.getReplicationSourceIdentifier() == null)
            return false;
        if (other.getReplicationSourceIdentifier() != null && other.getReplicationSourceIdentifier().equals(this.getReplicationSourceIdentifier()) == false)
            return false;
        if (other.getReadReplicaIdentifiers() == null ^ this.getReadReplicaIdentifiers() == null)
            return false;
        if (other.getReadReplicaIdentifiers() != null && other.getReadReplicaIdentifiers().equals(this.getReadReplicaIdentifiers()) == false)
            return false;
        if (other.getDBClusterMembers() == null ^ this.getDBClusterMembers() == null)
            return false;
        if (other.getDBClusterMembers() != null && other.getDBClusterMembers().equals(this.getDBClusterMembers()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getDBClusterArn() == null ^ this.getDBClusterArn() == null)
            return false;
        if (other.getDBClusterArn() != null && other.getDBClusterArn().equals(this.getDBClusterArn()) == false)
            return false;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getCloneGroupId() == null ^ this.getCloneGroupId() == null)
            return false;
        if (other.getCloneGroupId() != null && other.getCloneGroupId().equals(this.getCloneGroupId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getEarliestBacktrackTime() == null ^ this.getEarliestBacktrackTime() == null)
            return false;
        if (other.getEarliestBacktrackTime() != null && other.getEarliestBacktrackTime().equals(this.getEarliestBacktrackTime()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getBacktrackConsumedChangeRecords() == null ^ this.getBacktrackConsumedChangeRecords() == null)
            return false;
        if (other.getBacktrackConsumedChangeRecords() != null
                && other.getBacktrackConsumedChangeRecords().equals(this.getBacktrackConsumedChangeRecords()) == false)
            return false;
        if (other.getEnabledCloudwatchLogsExports() == null ^ this.getEnabledCloudwatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudwatchLogsExports() != null && other.getEnabledCloudwatchLogsExports().equals(this.getEnabledCloudwatchLogsExports()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfigurationInfo() == null ^ this.getScalingConfigurationInfo() == null)
            return false;
        if (other.getScalingConfigurationInfo() != null && other.getScalingConfigurationInfo().equals(this.getScalingConfigurationInfo()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getHttpEndpointEnabled() == null ^ this.getHttpEndpointEnabled() == null)
            return false;
        if (other.getHttpEndpointEnabled() != null && other.getHttpEndpointEnabled().equals(this.getHttpEndpointEnabled()) == false)
            return false;
        if (other.getActivityStreamMode() == null ^ this.getActivityStreamMode() == null)
            return false;
        if (other.getActivityStreamMode() != null && other.getActivityStreamMode().equals(this.getActivityStreamMode()) == false)
            return false;
        if (other.getActivityStreamStatus() == null ^ this.getActivityStreamStatus() == null)
            return false;
        if (other.getActivityStreamStatus() != null && other.getActivityStreamStatus().equals(this.getActivityStreamStatus()) == false)
            return false;
        if (other.getActivityStreamKmsKeyId() == null ^ this.getActivityStreamKmsKeyId() == null)
            return false;
        if (other.getActivityStreamKmsKeyId() != null && other.getActivityStreamKmsKeyId().equals(this.getActivityStreamKmsKeyId()) == false)
            return false;
        if (other.getActivityStreamKinesisStreamName() == null ^ this.getActivityStreamKinesisStreamName() == null)
            return false;
        if (other.getActivityStreamKinesisStreamName() != null
                && other.getActivityStreamKinesisStreamName().equals(this.getActivityStreamKinesisStreamName()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getCrossAccountClone() == null ^ this.getCrossAccountClone() == null)
            return false;
        if (other.getCrossAccountClone() != null && other.getCrossAccountClone().equals(this.getCrossAccountClone()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getGlobalWriteForwardingStatus() == null ^ this.getGlobalWriteForwardingStatus() == null)
            return false;
        if (other.getGlobalWriteForwardingStatus() != null && other.getGlobalWriteForwardingStatus().equals(this.getGlobalWriteForwardingStatus()) == false)
            return false;
        if (other.getGlobalWriteForwardingRequested() == null ^ this.getGlobalWriteForwardingRequested() == null)
            return false;
        if (other.getGlobalWriteForwardingRequested() != null
                && other.getGlobalWriteForwardingRequested().equals(this.getGlobalWriteForwardingRequested()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroup() == null) ? 0 : getDBClusterParameterGroup().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getEarliestRestorableTime() == null) ? 0 : getEarliestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getReaderEndpoint() == null) ? 0 : getReaderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpoints() == null) ? 0 : getCustomEndpoints().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDBClusterOptionGroupMemberships() == null) ? 0 : getDBClusterOptionGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getReplicationSourceIdentifier() == null) ? 0 : getReplicationSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaIdentifiers() == null) ? 0 : getReadReplicaIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDBClusterMembers() == null) ? 0 : getDBClusterMembers().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBClusterArn() == null) ? 0 : getDBClusterArn().hashCode());
        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloneGroupId() == null) ? 0 : getCloneGroupId().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEarliestBacktrackTime() == null) ? 0 : getEarliestBacktrackTime().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getBacktrackConsumedChangeRecords() == null) ? 0 : getBacktrackConsumedChangeRecords().hashCode());
        hashCode = prime * hashCode + ((getEnabledCloudwatchLogsExports() == null) ? 0 : getEnabledCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getScalingConfigurationInfo() == null) ? 0 : getScalingConfigurationInfo().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpointEnabled() == null) ? 0 : getHttpEndpointEnabled().hashCode());
        hashCode = prime * hashCode + ((getActivityStreamMode() == null) ? 0 : getActivityStreamMode().hashCode());
        hashCode = prime * hashCode + ((getActivityStreamStatus() == null) ? 0 : getActivityStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getActivityStreamKmsKeyId() == null) ? 0 : getActivityStreamKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getActivityStreamKinesisStreamName() == null) ? 0 : getActivityStreamKinesisStreamName().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getCrossAccountClone() == null) ? 0 : getCrossAccountClone().hashCode());
        hashCode = prime * hashCode + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getGlobalWriteForwardingStatus() == null) ? 0 : getGlobalWriteForwardingStatus().hashCode());
        hashCode = prime * hashCode + ((getGlobalWriteForwardingRequested() == null) ? 0 : getGlobalWriteForwardingRequested().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        return hashCode;
    }

    @Override
    public DBCluster clone() {
        try {
            return (DBCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
