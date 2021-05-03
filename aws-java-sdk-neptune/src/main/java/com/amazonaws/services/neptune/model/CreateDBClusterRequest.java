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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune
     * will not create a database in the DB cluster you are creating.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBClusterParameterGroup.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>neptune</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Example: <code>1.0.2.1</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>8182</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read
     * Replica.
     * </p>
     */
    private String replicationSourceIdentifier;
    /**
     * <p>
     * The tags to assign to the new DB cluster.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use the
     * encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     * specified, then Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that
     * AWS Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * </p>
     * 
     * @return A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster can be created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @param characterSetName
     *        <i>(Not supported by Neptune)</i>
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @return <i>(Not supported by Neptune)</i>
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @param characterSetName
     *        <i>(Not supported by Neptune)</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune
     * will not create a database in the DB cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *        Neptune will not create a database in the DB cluster you are creating.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune
     * will not create a database in the DB cluster you are creating.
     * </p>
     * 
     * @return The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *         Neptune will not create a database in the DB cluster you are creating.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune
     * will not create a database in the DB cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *        Neptune will not create a database in the DB cluster you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @return The DB cluster identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBClusterParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBClusterParameterGroup.
     *        </p>
     *        </li>
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBClusterParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If this argument is
     *         omitted, the default is used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DBClusterParameterGroup.
     *         </p>
     *         </li>
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBClusterParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBClusterParameterGroup.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with this DB cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return A DB subnet group to associate with this DB cluster.</p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>neptune</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
     *        <p>
     *        Valid Values: <code>neptune</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>neptune</code>
     * </p>
     * 
     * @return The name of the database engine to be used for this DB cluster.</p>
     *         <p>
     *         Valid Values: <code>neptune</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>neptune</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
     *        <p>
     *        Valid Values: <code>neptune</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Example: <code>1.0.2.1</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use for the new DB cluster.</p>
     *        <p>
     *        Example: <code>1.0.2.1</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Example: <code>1.0.2.1</code>
     * </p>
     * 
     * @return The version number of the database engine to use for the new DB cluster.</p>
     *         <p>
     *         Example: <code>1.0.2.1</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Example: <code>1.0.2.1</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use for the new DB cluster.</p>
     *        <p>
     *        Example: <code>1.0.2.1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>8182</code>
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        Default: <code>8182</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>8182</code>
     * </p>
     * 
     * @return The port number on which the instances in the DB cluster accept connections.</p>
     *         <p>
     *         Default: <code>8182</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>8182</code>
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        Default: <code>8182</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the master user for the DB cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can contain any printable ASCII character except
     *        "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @return The password for the master database user. This password can contain any printable ASCII character except
     *         "/", """, or "@".</p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can contain any printable ASCII character except
     *        "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @param optionGroupName
     *        <i>(Not supported by Neptune)</i>
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @return <i>(Not supported by Neptune)</i>
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * <i>(Not supported by Neptune)</i>
     * </p>
     * 
     * @param optionGroupName
     *        <i>(Not supported by Neptune)</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        see the time blocks available, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *        Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled using
     *         the <code>BackupRetentionPeriod</code> parameter.</p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *         see the time blocks available, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        see the time blocks available, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *        Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week. To see the time blocks available, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *        Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *         occurring on a random day of the week. To see the time blocks available, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week. To see the time blocks available, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *        Adjusting the Preferred Maintenance Window</a> in the <i>Amazon Neptune User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read
     * Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        Read Replica.
     */

    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read
     * Replica.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *         Read Replica.
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read
     * Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        Read Replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster.
     * </p>
     * 
     * @return The tags to assign to the new DB cluster.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster.
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
     * The tags to assign to the new DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(Tag... tags) {
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
     * The tags to assign to the new DB cluster.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
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
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use the
     * encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     * specified, then Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that
     * AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster,
     *        then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use
     *        the encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption
     *        key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     *        specified, then Amazon Neptune will use your default encryption key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     *        </p>
     *        <p>
     *        If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set
     *        <code>KmsKeyId</code> to a KMS key ID that is valid in the destination AWS Region. This key is used to
     *        encrypt the Read Replica in that AWS Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use the
     * encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     * specified, then Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that
     * AWS Region.
     * </p>
     * 
     * @return The AWS KMS key identifier for an encrypted DB cluster.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating
     *         a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *         cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         If an encryption key is not specified in <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use
     *         the encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption
     *         key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is
     *         not specified, then Amazon Neptune will use your default encryption key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *         encryption key for each AWS Region.
     *         </p>
     *         <p>
     *         If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set
     *         <code>KmsKeyId</code> to a KMS key ID that is valid in the destination AWS Region. This key is used to
     *         encrypt the Read Replica in that AWS Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use the
     * encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     * specified, then Amazon Neptune will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that
     * AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster,
     *        then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon Neptune will use
     *        the encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption
     *        key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true and <code>ReplicationSourceIdentifier</code> is not
     *        specified, then Amazon Neptune will use your default encryption key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     *        </p>
     *        <p>
     *        If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set
     *        <code>KmsKeyId</code> to a KMS key ID that is valid in the destination AWS Region. This key is used to
     *        encrypt the Read Replica in that AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param preSignedUrl
     *        This parameter is not currently supported.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param preSignedUrl
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Not supported by Neptune.
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @return Not supported by Neptune.
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Not supported by Neptune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @return Not supported by Neptune.
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * </p>
     * 
     * @return The list of log types that need to be enabled for exporting to CloudWatch Logs.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs.
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new java.util.ArrayList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is enabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is enabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @return The region where the source instance is located.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: ").append(getReplicationSourceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterRequest == false)
            return false;
        CreateDBClusterRequest other = (CreateDBClusterRequest) obj;
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
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getReplicationSourceIdentifier() == null) ? 0 : getReplicationSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterRequest clone() {
        return (CreateDBClusterRequest) super.clone();
    }

}
