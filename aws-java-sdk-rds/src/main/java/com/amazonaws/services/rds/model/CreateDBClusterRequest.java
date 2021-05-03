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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
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
     * Can't end with a hyphen or contain two consecutive hyphens.
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
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
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
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
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
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     * 5.7-compatible Aurora), and <code>aurora-postgresql</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     * <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
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
     * Can't be a reserved word for the chosen database engine.
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
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To view
     * the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     */
    private String replicationSourceIdentifier;
    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a CMK isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the CMK used
     * to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be called
     * in the source AWS Region where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be executed
     * in the source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in
     * the destination AWS Region. This should refer to the same AWS KMS CMK for both the <code>CreateDBCluster</code>
     * action that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you
     * are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     * Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation
     * that can be executed in the source AWS Region.
     * </p>
     * </note>
     */
    private String preSignedUrl;
    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     */
    private String engineMode;
    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
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
    private Boolean enableHttpEndpoint;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     */
    private Boolean enableGlobalWriteForwarding;
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on
     *         AWS Regions and Availability Zones, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on
     *        AWS Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
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
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on
     *        AWS Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(String... availabilityZones) {
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
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on
     *        AWS Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     *        The number of days for which automated backups are retained.</p>
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
     * The number of days for which automated backups are retained.
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
     * @return The number of days for which automated backups are retained.</p>
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
     * The number of days for which automated backups are retained.
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
     *        The number of days for which automated backups are retained.</p>
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
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *        doesn't create a database in the DB cluster you are creating.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * 
     * @return The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *         doesn't create a database in the DB cluster you are creating.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *        doesn't create a database in the DB cluster you are creating.
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
     * Can't end with a hyphen or contain two consecutive hyphens.
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
     *        Can't end with a hyphen or contain two consecutive hyphens.
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
     * Can't end with a hyphen or contain two consecutive hyphens.
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
     *         Can't end with a hyphen or contain two consecutive hyphens.
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
     * Can't end with a hyphen or contain two consecutive hyphens.
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
     *        Can't end with a hyphen or contain two consecutive hyphens.
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
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *        value, then the default DB cluster parameter group for the specified DB engine and version is used. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB cluster parameter group.
     *        </p>
     *        </li>
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *         value, then the default DB cluster parameter group for the specified DB engine and version is used. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB cluster parameter group.
     *         </p>
     *         </li>
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *        value, then the default DB cluster parameter group for the specified DB engine and version is used. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB cluster parameter group.
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
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
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

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
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
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
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
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     * 5.7-compatible Aurora), and <code>aurora-postgresql</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     *        5.7-compatible Aurora), and <code>aurora-postgresql</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     * 5.7-compatible Aurora), and <code>aurora-postgresql</code>
     * </p>
     * 
     * @return The name of the database engine to be used for this DB cluster.</p>
     *         <p>
     *         Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     *         5.7-compatible Aurora), and <code>aurora-postgresql</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     * 5.7-compatible Aurora), and <code>aurora-postgresql</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora), <code>aurora-mysql</code> (for MySQL
     *        5.7-compatible Aurora), and <code>aurora-postgresql</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     * <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *        <code>5.7.mysql_aurora.2.04.5</code>
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Example: <code>9.6.3</code>, <code>10.7</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     * <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *         use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *         Aurora), use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *         command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *         <code>5.7.mysql_aurora.2.04.5</code>
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Example: <code>9.6.3</code>, <code>10.7</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     * <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *        <code>5.7.mysql_aurora.2.04.5</code>
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Example: <code>9.6.3</code>, <code>10.7</code>
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
     * Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
     * </p>
     * 
     * @return The port number on which the instances in the DB cluster accept connections.</p>
     *         <p>
     *         Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        Default: <code>3306</code> if engine is set as aurora or <code>5432</code> if set to aurora-postgresql.
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
     * Can't be a reserved word for the chosen database engine.
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
     *        Can't be a reserved word for the chosen database engine.
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
     * Can't be a reserved word for the chosen database engine.
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
     *         Can't be a reserved word for the chosen database engine.
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
     * Can't be a reserved word for the chosen database engine.
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
     *        Can't be a reserved word for the chosen database engine.
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
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *        cluster once it is associated with a DB cluster.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *         <p>
     *         Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *         cluster once it is associated with a DB cluster.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *        cluster once it is associated with a DB cluster.
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
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To view
     * the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To view
     * the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *         the <code>BackupRetentionPeriod</code> parameter. </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *         view the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *         > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To view
     * the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *         occurring on a random day of the week. To see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        read replica.
     */

    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *         read replica.
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     * 
     * @return Tags to assign to the DB cluster.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.
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
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB cluster.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a CMK isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the CMK used
     * to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When a CMK isn't specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *        CMK used to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *        isn't specified, then Amazon RDS will use your default CMK.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     *        Region.
     *        </p>
     *        <p>
     *        If you create a read replica of an encrypted DB cluster in another AWS Region, you must set
     *        <code>KmsKeyId</code> to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is
     *        used to encrypt the read replica in that AWS Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a CMK isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the CMK used
     * to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     * 
     * @return The AWS KMS key identifier for an encrypted DB cluster.</p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         When a CMK isn't specified in <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *         CMK used to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *         isn't specified, then Amazon RDS will use your default CMK.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     *         Region.
     *         </p>
     *         <p>
     *         If you create a read replica of an encrypted DB cluster in another AWS Region, you must set
     *         <code>KmsKeyId</code> to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK
     *         is used to encrypt the read replica in that AWS Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a CMK isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the CMK used
     * to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default CMK.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS Region, you must set <code>KmsKeyId</code>
     * to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK). To use a CMK in a different AWS account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When a CMK isn't specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *        CMK used to encrypt the source. Otherwise, Amazon RDS will use your default CMK.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *        isn't specified, then Amazon RDS will use your default CMK.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     *        Region.
     *        </p>
     *        <p>
     *        If you create a read replica of an encrypted DB cluster in another AWS Region, you must set
     *        <code>KmsKeyId</code> to a AWS KMS key identifier that is valid in the destination AWS Region. This CMK is
     *        used to encrypt the read replica in that AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be called
     * in the source AWS Region where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be executed
     * in the source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in
     * the destination AWS Region. This should refer to the same AWS KMS CMK for both the <code>CreateDBCluster</code>
     * action that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you
     * are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     * Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation
     * that can be executed in the source AWS Region.
     * </p>
     * </note>
     * 
     * @param preSignedUrl
     *        A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be
     *        called in the source AWS Region where the DB cluster is replicated from. You only need to specify
     *        <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB
     *        cluster.</p>
     *        <p>
     *        The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be
     *        executed in the source AWS Region that contains the encrypted DB cluster to be copied.
     *        </p>
     *        <p>
     *        The pre-signed URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB
     *        cluster in the destination AWS Region. This should refer to the same AWS KMS CMK for both the
     *        <code>CreateDBCluster</code> action that is called in the destination AWS Region, and the action contained
     *        in the pre-signed URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     *        example, if you are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     *        <code>ReplicationSourceIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *        operation that can be executed in the source AWS Region.
     *        </p>
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be called
     * in the source AWS Region where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be executed
     * in the source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in
     * the destination AWS Region. This should refer to the same AWS KMS CMK for both the <code>CreateDBCluster</code>
     * action that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you
     * are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     * Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation
     * that can be executed in the source AWS Region.
     * </p>
     * </note>
     * 
     * @return A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to
     *         be called in the source AWS Region where the DB cluster is replicated from. You only need to specify
     *         <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB
     *         cluster.</p>
     *         <p>
     *         The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be
     *         executed in the source AWS Region that contains the encrypted DB cluster to be copied.
     *         </p>
     *         <p>
     *         The pre-signed URL request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB
     *         cluster in the destination AWS Region. This should refer to the same AWS KMS CMK for both the
     *         <code>CreateDBCluster</code> action that is called in the destination AWS Region, and the action
     *         contained in the pre-signed URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *         copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     *         example, if you are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     *         <code>ReplicationSourceIdentifier</code> would look like Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *         Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4
     *         Signing Process</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     *         <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *         Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *         operation that can be executed in the source AWS Region.
     *         </p>
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be called
     * in the source AWS Region where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be executed
     * in the source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in
     * the destination AWS Region. This should refer to the same AWS KMS CMK for both the <code>CreateDBCluster</code>
     * action that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you
     * are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     * Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation
     * that can be executed in the source AWS Region.
     * </p>
     * </note>
     * 
     * @param preSignedUrl
     *        A URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> action to be
     *        called in the source AWS Region where the DB cluster is replicated from. You only need to specify
     *        <code>PreSignedUrl</code> when you are performing cross-region replication from an encrypted DB
     *        cluster.</p>
     *        <p>
     *        The pre-signed URL must be a valid request for the <code>CreateDBCluster</code> API action that can be
     *        executed in the source AWS Region that contains the encrypted DB cluster to be copied.
     *        </p>
     *        <p>
     *        The pre-signed URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the copy of the DB
     *        cluster in the destination AWS Region. This should refer to the same AWS KMS CMK for both the
     *        <code>CreateDBCluster</code> action that is called in the destination AWS Region, and the action contained
     *        in the pre-signed URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The name of the AWS Region that Aurora read replica will be created in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     *        example, if you are copying an encrypted DB cluster from the us-west-2 AWS Region, then your
     *        <code>ReplicationSourceIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an AWS SDK tool or the AWS CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the AWS CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *        operation that can be executed in the source AWS Region.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0. </p> <note>
     *        <p>
     *        Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0. </p> <note>
     *         <p>
     *         Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *         </p>
     *         </note>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *         </p>
     *         </li>
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0. </p> <note>
     *        <p>
     *        Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * 
     * @return The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *         depend on the DB engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *         <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible value is <code>postgresql</code>.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *        versions, and version 2.09 and higher 2.x versions.
     *        </p>
     *        <p>
     *        The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *        and <code>global</code> engine mode isn't required for any 2.x versions.
     *        </p>
     *        <p>
     *        The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *        5.6.10a.
     *        </p>
     *        <p>
     *        For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *        <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *        </p>
     *        <p>
     *        Limitations and requirements apply to some DB engine modes. For more information, see the following
     *        sections in the <i>Amazon Aurora User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *        > Limitations of Aurora Serverless</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *        > Limitations of Parallel Query</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *        > Limitations of Aurora Global Databases</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *        > Limitations of Multi-Master Clusters</a>
     *        </p>
     *        </li>
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
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *         <p>
     *         The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *         versions, and version 2.09 and higher 2.x versions.
     *         </p>
     *         <p>
     *         The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *         and <code>global</code> engine mode isn't required for any 2.x versions.
     *         </p>
     *         <p>
     *         The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *         5.6.10a.
     *         </p>
     *         <p>
     *         For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *         <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *         </p>
     *         <p>
     *         Limitations and requirements apply to some DB engine modes. For more information, see the following
     *         sections in the <i>Amazon Aurora User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *         > Limitations of Aurora Serverless</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *         > Limitations of Parallel Query</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *         > Limitations of Aurora Global Databases</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *         > Limitations of Multi-Master Clusters</a>
     *         </p>
     *         </li>
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
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *        versions, and version 2.09 and higher 2.x versions.
     *        </p>
     *        <p>
     *        The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *        and <code>global</code> engine mode isn't required for any 2.x versions.
     *        </p>
     *        <p>
     *        The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *        5.6.10a.
     *        </p>
     *        <p>
     *        For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *        <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *        </p>
     *        <p>
     *        Limitations and requirements apply to some DB engine modes. For more information, see the following
     *        sections in the <i>Amazon Aurora User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *        > Limitations of Aurora Serverless</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *        > Limitations of Parallel Query</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *        > Limitations of Aurora Global Databases</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *        > Limitations of Multi-Master Clusters</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @return For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *        cluster.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * 
     * @return The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *         cluster.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
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
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
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

    public void setEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
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
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
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

    public Boolean getEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
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
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
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

    public CreateDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        setEnableHttpEndpoint(enableHttpEndpoint);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
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
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
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

    public Boolean isEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB cluster in.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *        connect to the DB cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The Active Directory directory ID to create the DB cluster in.</p>
     *         <p>
     *         For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *         connect to the DB cluster. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *         Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB cluster in.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *        connect to the DB cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     */

    public void setEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        this.enableGlobalWriteForwarding = enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     */

    public Boolean getEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        setEnableGlobalWriteForwarding(enableGlobalWriteForwarding);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     */

    public Boolean isEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
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
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: ").append(getEnableHttpEndpoint()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getEnableGlobalWriteForwarding() != null)
            sb.append("EnableGlobalWriteForwarding: ").append(getEnableGlobalWriteForwarding()).append(",");
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
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getEnableHttpEndpoint() == null ^ this.getEnableHttpEndpoint() == null)
            return false;
        if (other.getEnableHttpEndpoint() != null && other.getEnableHttpEndpoint().equals(this.getEnableHttpEndpoint()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getEnableGlobalWriteForwarding() == null ^ this.getEnableGlobalWriteForwarding() == null)
            return false;
        if (other.getEnableGlobalWriteForwarding() != null && other.getEnableGlobalWriteForwarding().equals(this.getEnableGlobalWriteForwarding()) == false)
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
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getEnableGlobalWriteForwarding() == null) ? 0 : getEnableGlobalWriteForwarding().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterRequest clone() {
        return (CreateDBClusterRequest) super.clone();
    }

}
