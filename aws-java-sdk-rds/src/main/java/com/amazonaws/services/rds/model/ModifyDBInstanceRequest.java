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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current
     * value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroups;
    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * instance. By default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically and
     * the parameter changes isn't applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each AWS Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result
     * in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is enabled for this request.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS will update the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an
     * outage and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that
     * is a different major version than the DB instance's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the
     * maintenance window. Changing this parameter doesn't result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the
     * maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine
     * version.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the existing value are rounded up so that they are
     * 10% greater than the current value.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * A value that indicates the DB instance should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur
     * during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string.
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
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String newDBInstanceIdentifier;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     */
    private String tdeCredentialPassword;
    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL
     * Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>ModifyDBCluster</code>.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     */
    private Integer dBPortNumber;
    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by the DB
     * cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * </p>
     */
    private Boolean enablePerformanceInsights;
    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default
     * CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     * Region.
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
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;
    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * </li>
     * </ul>
     */
    private Boolean certificateRotationRestart;
    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String replicaMode;
    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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
    private Boolean enableCustomerOwnedIp;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in AWS Backup.
     * </p>
     */
    private String awsBackupRecoveryPointArn;

    /**
     * Default constructor for ModifyDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ModifyDBInstanceRequest() {
    }

    /**
     * Constructs a new ModifyDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     */
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB instance identifier. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current
     * value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * 
     * @param allocatedStorage
     *        The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *        <p>
     *        For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     *        current value. Values that are not at least 10% greater than the existing value are rounded up so that
     *        they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current
     * value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * 
     * @return The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *         <p>
     *         For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     *         current value. Values that are not at least 10% greater than the existing value are rounded up so that
     *         they are 10% greater than the current value.
     *         </p>
     *         <p>
     *         For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current
     * value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * 
     * @param allocatedStorage
     *        The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *        <p>
     *        For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     *        current value. Values that are not at least 10% greater than the existing value are rounded up so that
     *        they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *         instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *         instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *         next maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is enabled for this request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you enable <code>ApplyImmediately</code>.
     *        </p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetGroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @return The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *         different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *         instance into a VPC. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *         >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         Changing the subnet group causes an outage during the change. The change is applied during the next
     *         maintenance window, unless you enable <code>ApplyImmediately</code>.
     *         </p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetGroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you enable <code>ApplyImmediately</code>.
     *        </p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetGroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *         outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing DBSecurityGroups.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
     *        </p>
     *        </li>
     */

    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroups(java.util.Collection)} or {@link #withDBSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (this.dBSecurityGroups == null) {
            setDBSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups.length));
        }
        for (String ele : dBSecurityGroups) {
            this.dBSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *         as soon as possible.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *         information, see <code>ModifyDBCluster</code>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing VpcSecurityGroupIds.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
     *        </p>
     *        </li>
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
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * instance. By default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB instance. By default, this parameter is disabled. </p>
     *        <p>
     *        If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *        Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or
     *        the next failure reboot. Review the table of parameters in <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     *        <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * instance. By default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB instance. By default, this parameter is disabled. </p>
     *         <p>
     *         If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *         Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>,
     *         or the next failure reboot. Review the table of parameters in <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html"
     *         >Modifying a DB Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or
     *         disabling <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are
     *         applied.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * instance. By default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB instance. By default, this parameter is disabled. </p>
     *        <p>
     *        If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *        Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or
     *        the next failure reboot. Review the table of parameters in <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     *        <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * instance. By default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB instance. By default, this parameter is disabled. </p>
     *         <p>
     *         If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *         Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>,
     *         or the next failure reboot. Review the table of parameters in <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html"
     *         >Modifying a DB Instance</a> in the <i>Amazon RDS User Guide.</i> to see the impact of enabling or
     *         disabling <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are
     *         applied.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @param masterUserPassword
     *        The new password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     *        <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *        primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @return The new password for the master user. The password can include any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *         possible. Between the time of the request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *         operation response.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     *         <code>ModifyDBCluster</code>.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 30 characters.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *         primary instance user if the password is lost. This includes restoring privileges that might have been
     *         accidentally revoked.
     *         </p>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @param masterUserPassword
     *        The new password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The password for the master user is managed by the DB cluster. For more information, see
     *        <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *        primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically and
     * the parameter changes isn't applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     *        outage. The parameter group name itself is changed immediately, but the actual parameter changes are not
     *        applied until you reboot the instance without failover. In this case, the DB instance isn't rebooted
     *        automatically and the parameter changes isn't applied during the next maintenance window.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically and
     * the parameter changes isn't applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @return The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in
     *         an outage. The parameter group name itself is changed immediately, but the actual parameter changes are
     *         not applied until you reboot the instance without failover. In this case, the DB instance isn't rebooted
     *         automatically and the parameter changes isn't applied during the next maintenance window.</p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically and
     * the parameter changes isn't applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     *        outage. The parameter group name itself is changed immediately, but the actual parameter changes are not
     *        applied until you reboot the instance without failover. In this case, the DB instance isn't rebooted
     *        automatically and the parameter changes isn't applied during the next maintenance window.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *        <p>
     *        Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     *        minutes, depending on the size and class of your DB instance.
     *        </p>
     *        </note>
     *        <p>
     *        These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *        non-zero value, the change is asynchronously applied as soon as possible.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days to retain automated backups. Setting this parameter to a positive number enables
     *         backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *         <p>
     *         Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a
     *         few minutes, depending on the size and class of your DB instance.
     *         </p>
     *         </note>
     *         <p>
     *         These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *         non-zero value, the change is asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *         information, see <code>ModifyDBCluster</code>.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 0 to 35
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 if the DB instance is a source to read replicas
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *        <p>
     *        Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     *        minutes, depending on the size and class of your DB instance.
     *        </p>
     *        </note>
     *        <p>
     *        These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *        non-zero value, the change is asynchronously applied as soon as possible.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each AWS Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *        an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *        selected at random from an 8-hour block of time for each AWS Region. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format hh24:mi-hh24:mi
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Time Coordinated (UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each AWS Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, as
     *         determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *         an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *         selected at random from an 8-hour block of time for each AWS Region. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >Backup window</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For
     *         more information, see <code>ModifyDBCluster</code>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format hh24:mi-hh24:mi
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Time Coordinated (UTC)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each AWS Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *        an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *        selected at random from an 8-hour block of time for each AWS Region. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format hh24:mi-hh24:mi
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Time Coordinated (UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter will cause a
     *        reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes
     *        between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @return The weekly time range (in UTC) during which system maintenance can occur, which might result in an
     *         outage. Changing this parameter doesn't result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot,
     *         and the maintenance window is changed to include the current time, then changing this parameter will
     *         cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30
     *         minutes between the current time and end of the window to ensure pending changes are applied.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *         >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter will cause a
     *        reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes
     *        between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result
     * in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is enabled for this request.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't
     *        result in an outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is enabled for this request.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result
     * in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is enabled for this request.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't
     *         result in an outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is enabled for this request.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result
     * in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is enabled for this request.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't
     *        result in an outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is enabled for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result
     * in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is enabled for this request.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't
     *         result in an outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is enabled for this request.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS will update the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. </p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        If you specify only a major version, Amazon RDS will update the DB instance to the default minor version
     *        if the current minor version is lower. For information about valid engine versions, see
     *        <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS will update the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * 
     * @return The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *         the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request. </p>
     *         <p>
     *         For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *         group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *         group can be the default for that DB parameter group family.
     *         </p>
     *         <p>
     *         If you specify only a major version, Amazon RDS will update the DB instance to the default minor version
     *         if the current minor version is lower. For information about valid engine versions, see
     *         <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS will update the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. </p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        If you specify only a major version, Amazon RDS will update the DB instance to the default minor version
     *        if the current minor version is lower. For information about valid engine versions, see
     *        <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an
     * outage and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that
     * is a different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result
     *        in an outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion
     *        parameter that is a different major version than the DB instance's current version.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an
     * outage and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that
     * is a different major version than the DB instance's current version.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result
     *         in an outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion
     *         parameter that is a different major version than the DB instance's current version.
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an
     * outage and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that
     * is a different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result
     *        in an outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion
     *        parameter that is a different major version than the DB instance's current version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an
     * outage and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that
     * is a different major version than the DB instance's current version.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result
     *         in an outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion
     *         parameter that is a different major version than the DB instance's current version.
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the
     * maintenance window. Changing this parameter doesn't result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the
     * maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor version upgrades are applied automatically to the DB instance during
     *        the maintenance window. Changing this parameter doesn't result in an outage except in the following case
     *        and the change is asynchronously applied as soon as possible. An outage results if this parameter is
     *        enabled during the maintenance window, and a newer minor version is available, and RDS has enabled auto
     *        patching for that engine version.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the
     * maintenance window. Changing this parameter doesn't result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the
     * maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @return A value that indicates whether minor version upgrades are applied automatically to the DB instance during
     *         the maintenance window. Changing this parameter doesn't result in an outage except in the following case
     *         and the change is asynchronously applied as soon as possible. An outage results if this parameter is
     *         enabled during the maintenance window, and a newer minor version is available, and RDS has enabled auto
     *         patching for that engine version.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the
     * maintenance window. Changing this parameter doesn't result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the
     * maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor version upgrades are applied automatically to the DB instance during
     *        the maintenance window. Changing this parameter doesn't result in an outage except in the following case
     *        and the change is asynchronously applied as soon as possible. An outage results if this parameter is
     *        enabled during the maintenance window, and a newer minor version is available, and RDS has enabled auto
     *        patching for that engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the
     * maintenance window. Changing this parameter doesn't result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the
     * maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @return A value that indicates whether minor version upgrades are applied automatically to the DB instance during
     *         the maintenance window. Changing this parameter doesn't result in an outage except in the following case
     *         and the change is asynchronously applied as soon as possible. An outage results if this parameter is
     *         enabled during the maintenance window, and a newer minor version is available, and RDS has enabled auto
     *         patching for that engine version.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @return The license model for the DB instance.</p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the existing value are rounded up so that they are
     * 10% greater than the current value.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance. </p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *        migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *        reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater
     *        than the current value. Values that are not at least 10% greater than the existing value are rounded up so
     *        that they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the existing value are rounded up so that they are
     * 10% greater than the current value.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new Provisioned IOPS (I/O operations per second) value for the RDS instance. </p>
     *         <p>
     *         Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *         migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *         reboot for the change in storage type to take effect.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance is available for use, but might experience performance degradation.
     *         While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS
     *         operations can take place for the instance, including modifying the instance, rebooting the instance,
     *         deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the
     *         instance.
     *         </p>
     *         <p>
     *         Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater
     *         than the current value. Values that are not at least 10% greater than the existing value are rounded up
     *         so that they are 10% greater than the current value.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the existing value are rounded up so that they are
     * 10% greater than the current value.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance. </p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *        migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *        reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater
     *        than the current value. Values that are not at least 10% greater than the existing value are rounded up so
     *        that they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * A value that indicates the DB instance should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates the DB instance should be associated with the specified option group. Changing this
     *        parameter doesn't result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If
     *        the parameter change results in an option group that enables OEM, this change can cause a brief
     *        (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *        instance
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates the DB instance should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return A value that indicates the DB instance should be associated with the specified option group. Changing
     *         this parameter doesn't result in an outage except in the following case and the change is applied during
     *         the next maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this
     *         request. If the parameter change results in an option group that enables OEM, this change can cause a
     *         brief (sub-second) period during which new connections are rejected but existing connections are not
     *         interrupted. </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *         instance
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates the DB instance should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates the DB instance should be associated with the specified option group. Changing this
     *        parameter doesn't result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If
     *        the parameter change results in an option group that enables OEM, this change can cause a brief
     *        (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *        instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur
     * during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string.
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
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or
     *        will occur during the next maintenance window if you disable Apply Immediately. This value is stored as a
     *        lowercase string. </p>
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
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     */

    public void setNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur
     * during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string.
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
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @return The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *         instance identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>,
     *         or will occur during the next maintenance window if you disable Apply Immediately. This value is stored
     *         as a lowercase string. </p>
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
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     */

    public String getNewDBInstanceIdentifier() {
        return this.newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur
     * during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string.
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
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or
     *        will occur during the next maintenance window if you disable Apply Immediately. This value is stored as a
     *        lowercase string. </p>
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
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        setNewDBInstanceIdentifier(newDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance. </p>
     *        <p>
     *        If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance. </p>
     *         <p>
     *         If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *         <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance is available for use, but might experience performance degradation.
     *         While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS
     *         operations can take place for the instance, including modifying the instance, rebooting the instance,
     *         deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the
     *         instance.
     *         </p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance. </p>
     *        <p>
     *        If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * 
     * @return The password for the given ARN from the key store in order to access the device.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Indicates the certificate that needs to be associated with the instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @return Indicates the certificate that needs to be associated with the instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Indicates the certificate that needs to be associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL
     * Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *        instance from its current domain. The domain must be created prior to this operation. Currently, only
     *        MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory
     *        Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL
     * Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *         instance from its current domain. The domain must be created prior to this operation. Currently, only
     *         MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory
     *         Domain.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *         Authentication</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL
     * Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *        instance from its current domain. The domain must be created prior to this operation. Currently, only
     *        MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory
     *        Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting. For more information, see
     *        <code>ModifyDBCluster</code>.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting. For more information, see
     *         <code>ModifyDBCluster</code>.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting. For more information, see
     *        <code>ModifyDBCluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting. For more information, see <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting. For more information, see
     *         <code>ModifyDBCluster</code>.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *         a value other than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *        the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *        <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     */

    public void setDBPortNumber(Integer dBPortNumber) {
        this.dBPortNumber = dBPortNumber;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *         options in the option group for the DB instance.
     *         </p>
     *         <p>
     *         Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *         the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Default: <code>1521</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Default: <code>1433</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *         <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     */

    public Integer getDBPortNumber() {
        return this.dBPortNumber;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *        the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *        <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBPortNumber(Integer dBPortNumber) {
        setDBPortNumber(dBPortNumber);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible. </p>
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
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible. </p>
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
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible. </p>
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
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible. </p>
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
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *         For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     *         monitoring role, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @return The name of the IAM role to use when making API calls to the Directory Service.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>. </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
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
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @return A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *         failure of the existing primary instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>. </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid Values: 0 - 15
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
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>. </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by the DB
     * cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by
     *        the DB cluster.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
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
     * This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by the DB
     * cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by
     *         the DB cluster.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
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
     * This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by the DB
     * cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by
     *        the DB cluster.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by the DB
     * cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora. Mapping AWS IAM accounts to database accounts is managed by
     *         the DB cluster.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the DB instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the DB instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the DB instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the DB instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon Relational Database Service User Guide</i>.
     */

    public Boolean isEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer master key
     * (CMK).
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default
     * CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     * Region.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for
     *        each AWS Region.
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
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default
     * CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     * Region.
     * </p>
     * 
     * @return The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *         <p>
     *         The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *         master key (CMK).
     *         </p>
     *         <p>
     *         If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *         default CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK
     *         for each AWS Region.
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
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default
     * CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for each AWS
     * Region.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the AWS KMS customer
     *        master key (CMK).
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default CMK. There is a default CMK for your AWS account. Your AWS account has a different default CMK for
     *        each AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
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

    public ModifyDBInstanceRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        instance.</p>
     *        <p>
     *        A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *        instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * 
     * @return The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *         instance.</p>
     *         <p>
     *         A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *         instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        instance.</p>
     *        <p>
     *        A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *        instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
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

    public ModifyDBInstanceRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
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

    public ModifyDBInstanceRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that indicates whether the DB instance class of the DB instance uses its default processor
     *        features.
     */

    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @return A value that indicates whether the DB instance class of the DB instance uses its default processor
     *         features.
     */

    public Boolean getUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that indicates whether the DB instance class of the DB instance uses its default processor
     *        features.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        setUseDefaultProcessorFeatures(useDefaultProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @return A value that indicates whether the DB instance class of the DB instance uses its default processor
     *         features.
     */

    public Boolean isUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.</p>
     *         <p>
     *         For more information about this setting, including limitations that apply to it, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *         > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *         Guide</i>.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateRotationRestart
     *        A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *        <p>
     *        By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *        updated until the DB instance is restarted.
     *        </p>
     *        <important>
     *        <p>
     *        Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *        </p>
     *        </important>
     *        <p>
     *        If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *        engine to rotate your SSL/TLS certificate:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        </li>
     */

    public void setCertificateRotationRestart(Boolean certificateRotationRestart) {
        this.certificateRotationRestart = certificateRotationRestart;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *         <p>
     *         By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *         updated until the DB instance is restarted.
     *         </p>
     *         <important>
     *         <p>
     *         Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *         </p>
     *         </important>
     *         <p>
     *         If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *         engine to rotate your SSL/TLS certificate:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *         Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     *         > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         </li>
     */

    public Boolean getCertificateRotationRestart() {
        return this.certificateRotationRestart;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateRotationRestart
     *        A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *        <p>
     *        By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *        updated until the DB instance is restarted.
     *        </p>
     *        <important>
     *        <p>
     *        Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *        </p>
     *        </important>
     *        <p>
     *        If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *        engine to rotate your SSL/TLS certificate:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCertificateRotationRestart(Boolean certificateRotationRestart) {
        setCertificateRotationRestart(certificateRotationRestart);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *         <p>
     *         By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *         updated until the DB instance is restarted.
     *         </p>
     *         <important>
     *         <p>
     *         Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *         </p>
     *         </important>
     *         <p>
     *         If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *         engine to rotate your SSL/TLS certificate:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *         Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     *         > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         </li>
     */

    public Boolean isCertificateRotationRestart() {
        return this.certificateRotationRestart;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * @see ReplicaMode
     */

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *         <p>
     *         Currently, this parameter is only supported for Oracle DB instances.
     *         </p>
     *         </note>
     *         <p>
     *         Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *         cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit
     *         information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't
     *         serve a read-only workload. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *         Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * @see ReplicaMode
     */

    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public ModifyDBInstanceRequest withReplicaMode(String replicaMode) {
        setReplicaMode(replicaMode);
        return this;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public ModifyDBInstanceRequest withReplicaMode(ReplicaMode replicaMode) {
        this.replicaMode = replicaMode.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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
     * @param enableCustomerOwnedIp
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *        instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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

    public void setEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        this.enableCustomerOwnedIp = enableCustomerOwnedIp;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *         instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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

    public Boolean getEnableCustomerOwnedIp() {
        return this.enableCustomerOwnedIp;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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
     * @param enableCustomerOwnedIp
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *        instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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

    public ModifyDBInstanceRequest withEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        setEnableCustomerOwnedIp(enableCustomerOwnedIp);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *         instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
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

    public Boolean isEnableCustomerOwnedIp() {
        return this.enableCustomerOwnedIp;
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

    public ModifyDBInstanceRequest withAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: ").append(getDBSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getNewDBInstanceIdentifier() != null)
            sb.append("NewDBInstanceIdentifier: ").append(getNewDBInstanceIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: ").append(getTdeCredentialPassword()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getDBPortNumber() != null)
            sb.append("DBPortNumber: ").append(getDBPortNumber()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: ").append(getUseDefaultProcessorFeatures()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getCertificateRotationRestart() != null)
            sb.append("CertificateRotationRestart: ").append(getCertificateRotationRestart()).append(",");
        if (getReplicaMode() != null)
            sb.append("ReplicaMode: ").append(getReplicaMode()).append(",");
        if (getEnableCustomerOwnedIp() != null)
            sb.append("EnableCustomerOwnedIp: ").append(getEnableCustomerOwnedIp()).append(",");
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

        if (obj instanceof ModifyDBInstanceRequest == false)
            return false;
        ModifyDBInstanceRequest other = (ModifyDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getNewDBInstanceIdentifier() == null ^ this.getNewDBInstanceIdentifier() == null)
            return false;
        if (other.getNewDBInstanceIdentifier() != null && other.getNewDBInstanceIdentifier().equals(this.getNewDBInstanceIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null)
            return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getDBPortNumber() == null ^ this.getDBPortNumber() == null)
            return false;
        if (other.getDBPortNumber() != null && other.getDBPortNumber().equals(this.getDBPortNumber()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getEnablePerformanceInsights() == null ^ this.getEnablePerformanceInsights() == null)
            return false;
        if (other.getEnablePerformanceInsights() != null && other.getEnablePerformanceInsights().equals(this.getEnablePerformanceInsights()) == false)
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
        if (other.getCloudwatchLogsExportConfiguration() == null ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(this.getCloudwatchLogsExportConfiguration()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getUseDefaultProcessorFeatures() == null ^ this.getUseDefaultProcessorFeatures() == null)
            return false;
        if (other.getUseDefaultProcessorFeatures() != null && other.getUseDefaultProcessorFeatures().equals(this.getUseDefaultProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getCertificateRotationRestart() == null ^ this.getCertificateRotationRestart() == null)
            return false;
        if (other.getCertificateRotationRestart() != null && other.getCertificateRotationRestart().equals(this.getCertificateRotationRestart()) == false)
            return false;
        if (other.getReplicaMode() == null ^ this.getReplicaMode() == null)
            return false;
        if (other.getReplicaMode() != null && other.getReplicaMode().equals(this.getReplicaMode()) == false)
            return false;
        if (other.getEnableCustomerOwnedIp() == null ^ this.getEnableCustomerOwnedIp() == null)
            return false;
        if (other.getEnableCustomerOwnedIp() != null && other.getEnableCustomerOwnedIp().equals(this.getEnableCustomerOwnedIp()) == false)
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
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getNewDBInstanceIdentifier() == null) ? 0 : getNewDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getDBPortNumber() == null) ? 0 : getDBPortNumber().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultProcessorFeatures() == null) ? 0 : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getCertificateRotationRestart() == null) ? 0 : getCertificateRotationRestart().hashCode());
        hashCode = prime * hashCode + ((getReplicaMode() == null) ? 0 : getReplicaMode().hashCode());
        hashCode = prime * hashCode + ((getEnableCustomerOwnedIp() == null) ? 0 : getEnableCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getAwsBackupRecoveryPointArn() == null) ? 0 : getAwsBackupRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBInstanceRequest clone() {
        return (ModifyDBInstanceRequest) super.clone();
    }

}
