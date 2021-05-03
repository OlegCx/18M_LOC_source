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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-63 alphanumeric characters or hyphens.
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
     * Example: <code>myrepinstance</code>
     * </p>
     */
    private String replicationInstanceIdentifier;
    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class. For example to specify the instance class dms.c4.large, set this parameter to <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your migration</a>.
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The default value is a random,
     * system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a random
     * day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * If an engine version number is not specified when a replication instance is created, the default is the latest
     * engine version available.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the replication instance during
     * the maintenance window. This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption
     * key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * A list of custom DNS name servers supported for the replication instance to access your on-premise source or
     * target database. This list overrides the default name servers supported by the replication instance. You can
     * specify a comma-separated list of internet addresses for up to four on-premise DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     */
    private String dnsNameServers;
    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-63 alphanumeric characters or hyphens.
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
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-63 alphanumeric characters or hyphens.
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
     *        Example: <code>myrepinstance</code>
     */

    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-63 alphanumeric characters or hyphens.
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
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @return The replication instance identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1-63 alphanumeric characters or hyphens.
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
     *         Example: <code>myrepinstance</code>
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-63 alphanumeric characters or hyphens.
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
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-63 alphanumeric characters or hyphens.
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
     *        Example: <code>myrepinstance</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class. For example to specify the instance class dms.c4.large, set this parameter to <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your migration</a>.
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as defined for the specified replication
     *        instance class. For example to specify the instance class dms.c4.large, set this parameter to
     *        <code>"dms.c4.large"</code>.</p>
     *        <p>
     *        For more information on the settings and capacities for the available replication instance classes, see <a
     *        href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *        > Selecting the right AWS DMS replication instance for your migration</a>.
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class. For example to specify the instance class dms.c4.large, set this parameter to <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your migration</a>.
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance as defined for the specified replication
     *         instance class. For example to specify the instance class dms.c4.large, set this parameter to
     *         <code>"dms.c4.large"</code>.</p>
     *         <p>
     *         For more information on the settings and capacities for the available replication instance classes, see
     *         <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *         > Selecting the right AWS DMS replication instance for your migration</a>.
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class. For example to specify the instance class dms.c4.large, set this parameter to <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your migration</a>.
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as defined for the specified replication
     *        instance class. For example to specify the instance class dms.c4.large, set this parameter to
     *        <code>"dms.c4.large"</code>.</p>
     *        <p>
     *        For more information on the settings and capacities for the available replication instance classes, see <a
     *        href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *        > Selecting the right AWS DMS replication instance for your migration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withReplicationInstanceClass(String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @return Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *         work with the VPC containing the replication instance.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
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
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The default value is a random,
     * system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the replication instance will be created. The default value is a random,
     *        system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The default value is a random,
     * system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     * 
     * @return The Availability Zone where the replication instance will be created. The default value is a random,
     *         system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The default value is a random,
     * system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the replication instance will be created. The default value is a random,
     *        system-chosen Availability Zone in the endpoint's AWS Region, for example: <code>us-east-1d</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        A subnet group to associate with the replication instance.
     */

    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @return A subnet group to associate with the replication instance.
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        A subnet group to associate with the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a random
     * day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *        Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a
     *        random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a random
     * day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *         Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on
     *         a random day of the week.
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a random
     * day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *        Default: A 30-minute window selected at random from an 8-hour block of time per AWS Region, occurring on a
     *        random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the replication instance is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * If an engine version number is not specified when a replication instance is created, the default is the latest
     * engine version available.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.</p>
     *        <p>
     *        If an engine version number is not specified when a replication instance is created, the default is the
     *        latest engine version available.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * If an engine version number is not specified when a replication instance is created, the default is the latest
     * engine version available.
     * </p>
     * 
     * @return The engine version number of the replication instance.</p>
     *         <p>
     *         If an engine version number is not specified when a replication instance is created, the default is the
     *         latest engine version available.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * If an engine version number is not specified when a replication instance is created, the default is the latest
     * engine version available.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.</p>
     *        <p>
     *        If an engine version number is not specified when a replication instance is created, the default is the
     *        latest engine version available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the replication instance during
     * the maintenance window. This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the replication instance
     *        during the maintenance window. This parameter defaults to <code>true</code>.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the replication instance during
     * the maintenance window. This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the replication
     *         instance during the maintenance window. This parameter defaults to <code>true</code>.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the replication instance during
     * the maintenance window. This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the replication instance
     *        during the maintenance window. This parameter defaults to <code>true</code>.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the replication instance during
     * the maintenance window. This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the replication
     *         instance during the maintenance window. This parameter defaults to <code>true</code>.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     * 
     * @return One or more tags to be assigned to the replication instance.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication instance.
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
     * One or more tags to be assigned to the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withTags(Tag... tags) {
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
     * One or more tags to be assigned to the replication instance.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption
     * key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An AWS KMS key identifier that is used to encrypt the data on the replication instance.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     *        encryption key.
     *        </p>
     *        <p>
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption
     * key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * 
     * @return An AWS KMS key identifier that is used to encrypt the data on the replication instance.</p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     *         encryption key.
     *         </p>
     *         <p>
     *         AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *         encryption key for each AWS Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption
     * key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     * encryption key for each AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An AWS KMS key identifier that is used to encrypt the data on the replication instance.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     *        encryption key.
     *        </p>
     *        <p>
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *        an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *        IP address. The default value is <code>true</code>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *         an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *         IP address. The default value is <code>true</code>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *        an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *        IP address. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *         an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *         IP address. The default value is <code>true</code>.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the replication instance to access your on-premise source or
     * target database. This list overrides the default name servers supported by the replication instance. You can
     * specify a comma-separated list of internet addresses for up to four on-premise DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @param dnsNameServers
     *        A list of custom DNS name servers supported for the replication instance to access your on-premise source
     *        or target database. This list overrides the default name servers supported by the replication instance.
     *        You can specify a comma-separated list of internet addresses for up to four on-premise DNS name servers.
     *        For example: <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     */

    public void setDnsNameServers(String dnsNameServers) {
        this.dnsNameServers = dnsNameServers;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the replication instance to access your on-premise source or
     * target database. This list overrides the default name servers supported by the replication instance. You can
     * specify a comma-separated list of internet addresses for up to four on-premise DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @return A list of custom DNS name servers supported for the replication instance to access your on-premise source
     *         or target database. This list overrides the default name servers supported by the replication instance.
     *         You can specify a comma-separated list of internet addresses for up to four on-premise DNS name servers.
     *         For example: <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     */

    public String getDnsNameServers() {
        return this.dnsNameServers;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the replication instance to access your on-premise source or
     * target database. This list overrides the default name servers supported by the replication instance. You can
     * specify a comma-separated list of internet addresses for up to four on-premise DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @param dnsNameServers
     *        A list of custom DNS name servers supported for the replication instance to access your on-premise source
     *        or target database. This list overrides the default name servers supported by the replication instance.
     *        You can specify a comma-separated list of internet addresses for up to four on-premise DNS name servers.
     *        For example: <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withDnsNameServers(String dnsNameServers) {
        setDnsNameServers(dnsNameServers);
        return this;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *        that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *        31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *        hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *        <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *        <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *        <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     *        <code>EndpointArn</code>.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @return A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *         that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *         31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *         hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *         <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *         <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *         <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     *         <code>EndpointArn</code>.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *        that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *        31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *        hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *        <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *        <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *        <code>ResourceIdentifier</code> value, AWS DMS generates a default identifier value for the end of
     *        <code>EndpointArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationInstanceRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: ").append(getReplicationInstanceIdentifier()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: ").append(getReplicationInstanceClass()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: ").append(getReplicationSubnetGroupIdentifier()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getDnsNameServers() != null)
            sb.append("DnsNameServers: ").append(getDnsNameServers()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationInstanceRequest == false)
            return false;
        CreateReplicationInstanceRequest other = (CreateReplicationInstanceRequest) obj;
        if (other.getReplicationInstanceIdentifier() == null ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() == null ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(this.getReplicationSubnetGroupIdentifier()) == false)
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
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getDnsNameServers() == null ^ this.getDnsNameServers() == null)
            return false;
        if (other.getDnsNameServers() != null && other.getDnsNameServers().equals(this.getDnsNameServers()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceIdentifier() == null) ? 0 : getReplicationInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroupIdentifier() == null) ? 0 : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getDnsNameServers() == null) ? 0 : getDnsNameServers().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationInstanceRequest clone() {
        return (CreateReplicationInstanceRequest) super.clone();
    }

}
