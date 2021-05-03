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
package com.amazonaws.services.rds;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.services.rds.waiters.AmazonRDSWaiters;

/**
 * Interface for accessing Amazon RDS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rds.AbstractAmazonRDS} instead.
 * </p>
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizeable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Amazon RDS is asynchronous, which means that some interfaces might require techniques such
 * as polling or callback functions to determine when a command has been applied. In this reference, the parameter
 * descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list following some related topics from the user
 * guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRDS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds";

    /**
     * Overrides the default endpoint for this client ("rds.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "rds.amazonaws.com") or a full URL, including the protocol (ex:
     * "rds.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "rds.amazonaws.com") or a full URL, including the protocol (ex: "rds.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRDS#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param addRoleToDBClusterRequest
     * @return Result of the AddRoleToDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBClusterRoleAlreadyExistsException
     *         The specified IAM role Amazon Resource Name (ARN) is already associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterRoleQuotaExceededException
     *         You have exceeded the maximum number of IAM roles that can be associated with the specified DB cluster.
     * @sample AmazonRDS.AddRoleToDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest);

    /**
     * <p>
     * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
     * 
     * @param addRoleToDBInstanceRequest
     * @return Result of the AddRoleToDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBInstanceRoleAlreadyExistsException
     *         The specified <code>RoleArn</code> or <code>FeatureName</code> value is already associated with the DB
     *         instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceRoleQuotaExceededException
     *         You can't associate any more AWS Identity and Access Management (IAM) roles with the DB instance because
     *         the quota has been reached.
     * @sample AmazonRDS.AddRoleToDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    AddRoleToDBInstanceResult addRoleToDBInstance(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest);

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @return Result of the AddSourceIdentifierToSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
     * cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @sample AmazonRDS.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
     * can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
     * Second, IP ranges are available if the application accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
     * You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param authorizeDBSecurityGroupIngressRequest
     * @return Result of the AuthorizeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDR IP range or Amazon EC2 security group is already authorized for the specified DB
     *         security group.
     * @throws AuthorizationQuotaExceededException
     *         The DB security group authorization quota has been reached.
     * @sample AmazonRDS.AuthorizeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AuthorizeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest);

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html">
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest
     * @return Result of the BacktrackDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.BacktrackDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    BacktrackDBClusterResult backtrackDBCluster(BacktrackDBClusterRequest backtrackDBClusterRequest);

    /**
     * <p>
     * Cancels an export task in progress that is exporting a snapshot to Amazon S3. Any data that has already been
     * written to the S3 bucket isn't removed.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @throws ExportTaskNotFoundException
     *         The export task doesn't exist.
     * @throws InvalidExportTaskStateException
     *         You can't cancel an export task that has completed.
     * @sample AmazonRDS.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return Result of the CopyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Copies a snapshot of a DB cluster.
     * </p>
     * <p>
     * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
     * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon Resource Name (ARN) of the shared DB cluster
     * snapshot.
     * </p>
     * <p>
     * You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you
     * call the <code>CopyDBClusterSnapshot</code> action is the destination AWS Region for the encrypted DB cluster
     * snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the
     * copy of the DB cluster snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBClusterSnapshot</code> action to be called in the source AWS Region where the DB cluster snapshot is
     * copied from. The pre-signed URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action
     * that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the customer master key (CMK) to use to encrypt the copy
     * of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the destination AWS Region, and the action contained
     * in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS
     * Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>.
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
     * </note></li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new copy of the DB cluster snapshot in
     * the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value
     * as the <code>SourceDBClusterSnapshotIdentifier</code> in the pre-signed URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"> Copying a
     * Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterSnapshotRequest
     * @return Result of the CopyDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest);

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * 
     * @param copyDBParameterGroupRequest
     * @return Result of the CopyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @sample AmazonRDS.CopyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest copyDBParameterGroupRequest);

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the <code>available</code> state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
     * <code>CopyDBSnapshot</code> action is the destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot">Copying
     * a DB Snapshot</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param copyDBSnapshotRequest
     * @return Result of the CopyDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <code>DBSnapshotIdentifier</code> is already used by an existing snapshot.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws CustomAvailabilityZoneNotFoundException
     *         <code>CustomAvailabilityZoneId</code> doesn't refer to an existing custom Availability Zone identifier.
     * @sample AmazonRDS.CopyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DBSnapshot copyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest);

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest
     * @return Result of the CopyOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CopyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    OptionGroup copyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest);

    /**
     * <p>
     * Creates a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> RDS on VMware User
     * Guide.</a>
     * </p>
     * 
     * @param createCustomAvailabilityZoneRequest
     * @return Result of the CreateCustomAvailabilityZone operation returned by the service.
     * @throws CustomAvailabilityZoneAlreadyExistsException
     *         <code>CustomAvailabilityZoneName</code> is already used by an existing custom Availability Zone.
     * @throws CustomAvailabilityZoneQuotaExceededException
     *         You have exceeded the maximum number of custom Availability Zones.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.CreateCustomAvailabilityZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateCustomAvailabilityZone"
     *      target="_top">AWS API Documentation</a>
     */
    CustomAvailabilityZone createCustomAvailabilityZone(CreateCustomAvailabilityZoneRequest createCustomAvailabilityZoneRequest);

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a read replica of
     * another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
     * by <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterRequest
     * @return Result of the CreateDBCluster operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing DB cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @throws InvalidGlobalClusterStateException
     *         The global cluster is in an invalid state and can't perform the requested operation.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @sample AmazonRDS.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster createDBCluster(CreateDBClusterRequest createDBClusterRequest);

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @return Result of the CreateDBClusterEndpoint operation returned by the service.
     * @throws DBClusterEndpointQuotaExceededException
     *         The cluster already has the maximum number of custom endpoints.
     * @throws DBClusterEndpointAlreadyExistsException
     *         The specified custom endpoint can't be created because it already exists.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.CreateDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDBClusterEndpointResult createDBClusterEndpoint(CreateDBClusterEndpointRequest createDBClusterEndpointRequest);

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
     * creating it using <code>ModifyDBClusterParameterGroup</code>. Once you've created a DB cluster parameter group,
     * you need to associate it with your DB cluster using <code>ModifyDBCluster</code>. When you associate a new DB
     * cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without
     * failover for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
     * This is especially important for parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the <code>DescribeDBClusterParameters</code>
     * action to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterParameterGroupRequest
     * @return Result of the CreateDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterSnapshotRequest
     * @return Result of the CreateDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @sample AmazonRDS.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     * @return Result of the CreateDBInstance operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a new DB instance that acts as a read replica for an existing source DB instance. You can create a read
     * replica for a DB instance running MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with Read Replicas</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. Call the <code>CreateDBInstance</code> action to create a DB instance
     * for an Aurora DB cluster.
     * </p>
     * <p>
     * All read replica DB instances are created with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source DB instance, except as specified.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return Result of the CreateDBInstanceReadReplica operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBSubnetGroupNotAllowedException
     *         The DBSubnetGroup shouldn't be specified while creating read replicas that lie in the same region as the
     *         source instance.
     * @throws InvalidDBSubnetGroupException
     *         The DBSubnetGroup doesn't belong to the same VPC as that of an existing cross-region read replica of the
     *         same source instance.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @sample AmazonRDS.CreateDBInstanceReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstanceReadReplica"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstance createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest);

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for the database engine used by the DB
     * instance. To provide custom values for any of the parameters, you must modify the group after creating it using
     * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group, you need to associate it with your DB
     * instance using <i>ModifyDBInstance</i>. When you associate a new DB parameter group with a running DB instance,
     * you need to reboot the DB instance without failover for the new DB parameter group and associated settings to
     * take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * create action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest
     * @return Result of the CreateDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new DB proxy.
     * </p>
     * 
     * @param createDBProxyRequest
     * @return Result of the CreateDBProxy operation returned by the service.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws DBProxyAlreadyExistsException
     *         The specified proxy name must be unique for all proxies owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyQuotaExceededException
     *         Your AWS account already has the maximum number of proxies in the specified AWS Region.
     * @sample AmazonRDS.CreateDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDBProxyResult createDBProxy(CreateDBProxyRequest createDBProxyRequest);

    /**
     * <p>
     * Creates a <code>DBProxyEndpoint</code>. Only applies to proxies that are associated with Aurora DB clusters. You
     * can use DB proxy endpoints to specify read/write or read-only access to the DB cluster. You can also use DB proxy
     * endpoints to access a DB proxy through a different VPC than the proxy's default VPC.
     * </p>
     * 
     * @param createDBProxyEndpointRequest
     * @return Result of the CreateDBProxyEndpoint operation returned by the service.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyEndpointAlreadyExistsException
     *         The specified DB proxy endpoint name must be unique for all DB proxy endpoints owned by your AWS account
     *         in the specified AWS Region.
     * @throws DBProxyEndpointQuotaExceededException
     *         The DB proxy already has the maximum number of endpoints.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.CreateDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDBProxyEndpointResult createDBProxyEndpoint(CreateDBProxyEndpointRequest createDBProxyEndpointRequest);

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest
     * @return Result of the CreateDBSecurityGroup operation returned by the service.
     * @throws DBSecurityGroupAlreadyExistsException
     *         A DB security group with the name specified in <code>DBSecurityGroupName</code> already exists.
     * @throws DBSecurityGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB security groups.
     * @throws DBSecurityGroupNotSupportedException
     *         A DB security group isn't allowed for this action.
     * @sample AmazonRDS.CreateDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest createDBSecurityGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a DB instance. The source DB instance must be in the <code>available</code> or
     * <code>storage-optimization</code> state.
     * </p>
     * 
     * @param createDBSnapshotRequest
     * @return Result of the CreateDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <code>DBSnapshotIdentifier</code> is already used by an existing snapshot.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @sample AmazonRDS.CreateDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DBSnapshot createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest);

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
     * Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     * @return Result of the CreateDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupAlreadyExistsException
     *         <code>DBSubnetGroupName</code> is already used by an existing DB subnet group.
     * @throws DBSubnetGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB subnet groups.
     * @throws DBSubnetQuotaExceededException
     *         The request would result in the user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonRDS.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a topic Amazon Resource Name (ARN) created
     * by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in
     * Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of and provide a list
     * of RDS sources (<code>SourceIds</code>) that triggers the events. You can also provide a list of event categories
     * (<code>EventCategories</code>) for events that you want to be notified of. For example, you can specify
     * <code>SourceType</code> = <code>db-instance</code>, <code>SourceIds</code> = <code>mydbinstance1</code>,
     * <code>mydbinstance2</code> and <code>EventCategories</code> = <code>Availability</code>, <code>Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType</code> =
     * <code>db-instance</code> and <code>SourceIdentifier</code> = <code>myDBInstance1</code>, you are notified of all
     * the <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify a <code>SourceIdentifier</code>, you receive notice of the events for that source type for all your RDS
     * sources. If you don't specify either the SourceType or the <code>SourceIdentifier</code>, you are notified of
     * events generated from all RDS sources belonging to your customer account.
     * </p>
     * <note>
     * <p>
     * RDS event notification is only available for unencrypted SNS topics. If you specify an encrypted SNS topic, event
     * notifications aren't sent for the topic.
     * </p>
     * </note>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionAlreadyExistException
     *         The supplied subscription name already exists.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an Aurora global database spread across multiple AWS Regions. The global database contains a single
     * primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary
     * cluster through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
     * to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
     * primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @return Result of the CreateGlobalCluster operation returned by the service.
     * @throws GlobalClusterAlreadyExistsException
     *         The <code>GlobalClusterIdentifier</code> already exists. Choose a new global database identifier (unique
     *         name) to create a new global database cluster.
     * @throws GlobalClusterQuotaExceededException
     *         The number of global database clusters for this account is already at the maximum allowed.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.CreateGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster createGlobalCluster(CreateGlobalClusterRequest createGlobalClusterRequest);

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * 
     * @param createOptionGroupRequest
     * @return Result of the CreateOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CreateOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    OptionGroup createOptionGroup(CreateOptionGroupRequest createOptionGroupRequest);

    /**
     * <p>
     * Deletes a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> RDS on VMware User
     * Guide.</a>
     * </p>
     * 
     * @param deleteCustomAvailabilityZoneRequest
     * @return Result of the DeleteCustomAvailabilityZone operation returned by the service.
     * @throws CustomAvailabilityZoneNotFoundException
     *         <code>CustomAvailabilityZoneId</code> doesn't refer to an existing custom Availability Zone identifier.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.DeleteCustomAvailabilityZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteCustomAvailabilityZone"
     *      target="_top">AWS API Documentation</a>
     */
    CustomAvailabilityZone deleteCustomAvailabilityZone(DeleteCustomAvailabilityZoneRequest deleteCustomAvailabilityZoneRequest);

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterRequest
     * @return Result of the DeleteDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @sample AmazonRDS.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @return Result of the DeleteDBClusterEndpoint operation returned by the service.
     * @throws InvalidDBClusterEndpointStateException
     *         The requested operation can't be performed on the endpoint while the endpoint is in this state.
     * @throws DBClusterEndpointNotFoundException
     *         The specified custom endpoint doesn't exist.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.DeleteDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDBClusterEndpointResult deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest);

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
     * with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @return Result of the DeleteDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @return Result of the DeleteDBClusterSnapshot operation returned by the service.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
     * be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB instance is <code>deleting</code> until the DB
     * snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action can't be canceled or reverted once submitted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when you skip
     * creation of the final snapshot with the <code>SkipFinalSnapshot</code> parameter.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a read replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first call the <code>PromoteReadReplicaDBCluster</code> API action to
     * promote the DB cluster so it's no longer a read replica. After the promotion completes, then call the
     * <code>DeleteDBInstance</code> API action to delete the final instance in the DB cluster.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     * @return Result of the DeleteDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSnapshotAlreadyExistsException
     *         <code>DBSnapshotIdentifier</code> is already used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBInstanceAutomatedBackupQuotaExceededException
     *         The quota for retained automated backups was exceeded. This prevents you from retaining any additional
     *         automated backups. The retained automated backups quota is the same as your DB Instance quota.
     * @sample AmazonRDS.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes automated backups using the <code>DbiResourceId</code> value of the source DB instance or the Amazon
     * Resource Name (ARN) of the automated backups.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest
     *        Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
     * @return Result of the DeleteDBInstanceAutomatedBackup operation returned by the service.
     * @throws InvalidDBInstanceAutomatedBackupStateException
     *         The automated backup is in an invalid state. For example, this automated backup is associated with an
     *         active instance.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.DeleteDBInstanceAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstanceAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstanceAutomatedBackup deleteDBInstanceAutomatedBackup(DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest);

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @return Result of the DeleteDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBParameterGroupResult deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest);

    /**
     * <p>
     * Deletes an existing DB proxy.
     * </p>
     * 
     * @param deleteDBProxyRequest
     * @return Result of the DeleteDBProxy operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.DeleteDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBProxyResult deleteDBProxy(DeleteDBProxyRequest deleteDBProxyRequest);

    /**
     * <p>
     * Deletes a <code>DBProxyEndpoint</code>. Doing so removes the ability to access the DB proxy using the endpoint
     * that you defined. The endpoint that you delete might have provided capabilities such as read/write or read-only
     * operations, or using a different VPC than the DB proxy's default VPC.
     * </p>
     * 
     * @param deleteDBProxyEndpointRequest
     * @return Result of the DeleteDBProxyEndpoint operation returned by the service.
     * @throws DBProxyEndpointNotFoundException
     *         The DB proxy endpoint doesn't exist.
     * @throws InvalidDBProxyEndpointStateException
     *         You can't perform this operation while the DB proxy endpoint is in a particular state.
     * @sample AmazonRDS.DeleteDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBProxyEndpointResult deleteDBProxyEndpoint(DeleteDBProxyEndpointRequest deleteDBProxyEndpointRequest);

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest
     * @return Result of the DeleteDBSecurityGroup operation returned by the service.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @sample AmazonRDS.DeleteDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBSecurityGroupResult deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest);

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest
     * @return Result of the DeleteDBSnapshot operation returned by the service.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DeleteDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest);

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     * @return Result of the DeleteDBSubnetGroup operation returned by the service.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidDBSubnetStateException
     *         The DB subnet isn't in the <i>available</i> state.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @sample AmazonRDS.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws InvalidEventSubscriptionStateException
     *         This error can occur if someone else is modifying a subscription. You should retry the action.
     * @sample AmazonRDS.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
     * first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @return Result of the DeleteGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @throws InvalidGlobalClusterStateException
     *         The global cluster is in an invalid state and can't perform the requested operation.
     * @sample AmazonRDS.DeleteGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster deleteGlobalCluster(DeleteGlobalClusterRequest deleteGlobalClusterRequest);

    /**
     * <p>
     * Deletes the installation medium for a DB engine that requires an on-premises customer provided license, such as
     * Microsoft SQL Server.
     * </p>
     * 
     * @param deleteInstallationMediaRequest
     * @return Result of the DeleteInstallationMedia operation returned by the service.
     * @throws InstallationMediaNotFoundException
     *         <code>InstallationMediaID</code> doesn't refer to an existing installation medium.
     * @sample AmazonRDS.DeleteInstallationMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteInstallationMedia" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInstallationMediaResult deleteInstallationMedia(DeleteInstallationMediaRequest deleteInstallationMediaRequest);

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest
     * @return Result of the DeleteOptionGroup operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws InvalidOptionGroupStateException
     *         The option group isn't in the <i>available</i> state.
     * @sample AmazonRDS.DeleteOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteOptionGroupResult deleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest);

    /**
     * <p>
     * Remove the association between one or more <code>DBProxyTarget</code> data structures and a
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param deregisterDBProxyTargetsRequest
     * @return Result of the DeregisterDBProxyTargets operation returned by the service.
     * @throws DBProxyTargetNotFoundException
     *         The specified RDS DB instance or Aurora DB cluster isn't available for a proxy owned by your AWS account
     *         in the specified AWS Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.DeregisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeregisterDBProxyTargets" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterDBProxyTargetsResult deregisterDBProxyTargets(DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest);

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
     * such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
     * toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRDS.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributes(DescribeAccountAttributesRequest)
     */
    DescribeAccountAttributesResult describeAccountAttributes();

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws CertificateNotFoundException
     *         <code>CertificateIdentifier</code> doesn't refer to an existing certificate.
     * @sample AmazonRDS.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * Simplified method form for invoking the DescribeCertificates operation.
     *
     * @see #describeCertificates(DescribeCertificatesRequest)
     */
    DescribeCertificatesResult describeCertificates();

    /**
     * <p>
     * Returns information about custom Availability Zones (AZs).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> RDS on VMware User
     * Guide.</a>
     * </p>
     * 
     * @param describeCustomAvailabilityZonesRequest
     * @return Result of the DescribeCustomAvailabilityZones operation returned by the service.
     * @throws CustomAvailabilityZoneNotFoundException
     *         <code>CustomAvailabilityZoneId</code> doesn't refer to an existing custom Availability Zone identifier.
     * @sample AmazonRDS.DescribeCustomAvailabilityZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCustomAvailabilityZones"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomAvailabilityZonesResult describeCustomAvailabilityZones(DescribeCustomAvailabilityZonesRequest describeCustomAvailabilityZonesRequest);

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest
     * @return Result of the DescribeDBClusterBacktracks operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBClusterBacktrackNotFoundException
     *         <code>BacktrackIdentifier</code> doesn't refer to an existing backtrack.
     * @sample AmazonRDS.DescribeDBClusterBacktracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterBacktracksResult describeDBClusterBacktracks(DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest);

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @return Result of the DescribeDBClusterEndpoints operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.DescribeDBClusterEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBClusterEndpointsResult describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @return Result of the DescribeDBClusterParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation.
     *
     * @see #describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest)
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups();

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParametersRequest
     * @return Result of the DescribeDBClusterParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest describeDBClusterParametersRequest);

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
     * DB cluster snapshot public or private, use the <code>ModifyDBClusterSnapshotAttribute</code> API action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     * @return Result of the DescribeDBClusterSnapshotAttributes operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @return Result of the DescribeDBClusterSnapshots operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation.
     *
     * @see #describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest)
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots();

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBClustersRequest
     * @return Result of the DescribeDBClusters operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusters operation.
     *
     * @see #describeDBClusters(DescribeDBClustersRequest)
     */
    DescribeDBClustersResult describeDBClusters();

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return Result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonRDS.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation.
     *
     * @see #describeDBEngineVersions(DescribeDBEngineVersionsRequest)
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions();

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use this operation to find details about
     * automated backups for previously deleted instances. Current instances with retention periods greater than zero
     * (0) are returned for both the <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest
     *        Parameter input for DescribeDBInstanceAutomatedBackups.
     * @return Result of the DescribeDBInstanceAutomatedBackups operation returned by the service.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.DescribeDBInstanceAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstanceAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackups(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest);

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API supports pagination.
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBInstancesRequest
     * @return Result of the DescribeDBInstances operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeDBInstances operation.
     *
     * @see #describeDBInstances(DescribeDBInstancesRequest)
     */
    DescribeDBInstancesResult describeDBInstances();

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * 
     * @param describeDBLogFilesRequest
     * @return Result of the DescribeDBLogFiles operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBLogFiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest describeDBLogFilesRequest);

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a <code>DBParameterGroupName</code> is
     * specified, the list will contain only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest
     * @return Result of the DescribeDBParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation.
     *
     * @see #describeDBParameterGroups(DescribeDBParameterGroupsRequest)
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups();

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return Result of the DescribeDBParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest describeDBParametersRequest);

    /**
     * <p>
     * Returns information about DB proxies.
     * </p>
     * 
     * @param describeDBProxiesRequest
     * @return Result of the DescribeDBProxies operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @sample AmazonRDS.DescribeDBProxies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxies" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest describeDBProxiesRequest);

    /**
     * <p>
     * Returns information about DB proxy endpoints.
     * </p>
     * 
     * @param describeDBProxyEndpointsRequest
     * @return Result of the DescribeDBProxyEndpoints operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyEndpointNotFoundException
     *         The DB proxy endpoint doesn't exist.
     * @sample AmazonRDS.DescribeDBProxyEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBProxyEndpointsResult describeDBProxyEndpoints(DescribeDBProxyEndpointsRequest describeDBProxyEndpointsRequest);

    /**
     * <p>
     * Returns information about DB proxy target groups, represented by <code>DBProxyTargetGroup</code> data structures.
     * </p>
     * 
     * @param describeDBProxyTargetGroupsRequest
     * @return Result of the DescribeDBProxyTargetGroups operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.DescribeDBProxyTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBProxyTargetGroupsResult describeDBProxyTargetGroups(DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest);

    /**
     * <p>
     * Returns information about <code>DBProxyTarget</code> objects. This API supports pagination.
     * </p>
     * 
     * @param describeDBProxyTargetsRequest
     * @return Result of the DescribeDBProxyTargets operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetNotFoundException
     *         The specified RDS DB instance or Aurora DB cluster isn't available for a proxy owned by your AWS account
     *         in the specified AWS Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.DescribeDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBProxyTargetsResult describeDBProxyTargets(DescribeDBProxyTargetsRequest describeDBProxyTargetsRequest);

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
     * 
     * @param describeDBSecurityGroupsRequest
     * @return Result of the DescribeDBSecurityGroups operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @sample AmazonRDS.DescribeDBSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSecurityGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation.
     *
     * @see #describeDBSecurityGroups(DescribeDBSecurityGroupsRequest)
     */
    DescribeDBSecurityGroupsResult describeDBSecurityGroups();

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB snapshot. If <code>all</code> is included in the list of values for the <code>restore</code> attribute,
     * then the manual DB snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB
     * snapshot public or private, use the <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest
     * @return Result of the DescribeDBSnapshotAttributes operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DBSnapshotAttributesResult describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation.
     *
     * @see #describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest)
     */
    DBSnapshotAttributesResult describeDBSnapshotAttributes();

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest
     * @return Result of the DescribeDBSnapshots operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest describeDBSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation.
     *
     * @see #describeDBSnapshots(DescribeDBSnapshotsRequest)
     */
    DescribeDBSnapshotsResult describeDBSnapshots();

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
     * descriptions of the specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     * @return Result of the DescribeDBSubnetGroups operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @sample AmazonRDS.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation.
     *
     * @see #describeDBSubnetGroups(DescribeDBSubnetGroupsRequest)
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups();

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @return Result of the DescribeEngineDefaultClusterParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
     * see a list of the event categories and source types in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRDS.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategories(DescribeEventCategoriesRequest)
     */
    DescribeEventCategoriesResult describeEventCategories();

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify a <code>SubscriptionName</code>, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @sample AmazonRDS.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptions(DescribeEventSubscriptionsRequest)
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions();

    /**
     * <p>
     * Returns events related to DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, and
     * DB cluster snapshots for the past 14 days. Events specific to a particular DB instances, DB clusters, DB
     * parameter groups, DB security groups, DB snapshots, and DB cluster snapshots group can be obtained by providing
     * the name as a parameter.
     * </p>
     * <note>
     * <p>
     * By default, the past hour of events are returned.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonRDS.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

    /**
     * <p>
     * Returns information about a snapshot export to Amazon S3. This API operation supports pagination.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws ExportTaskNotFoundException
     *         The export task doesn't exist.
     * @sample AmazonRDS.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Returns information about Aurora global database clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return Result of the DescribeGlobalClusters operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @sample AmazonRDS.DescribeGlobalClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeGlobalClustersResult describeGlobalClusters(DescribeGlobalClustersRequest describeGlobalClustersRequest);

    /**
     * <p>
     * Describes the available installation media for a DB engine that requires an on-premises customer provided
     * license, such as Microsoft SQL Server.
     * </p>
     * 
     * @param describeInstallationMediaRequest
     * @return Result of the DescribeInstallationMedia operation returned by the service.
     * @throws InstallationMediaNotFoundException
     *         <code>InstallationMediaID</code> doesn't refer to an existing installation medium.
     * @sample AmazonRDS.DescribeInstallationMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeInstallationMedia" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInstallationMediaResult describeInstallationMedia(DescribeInstallationMediaRequest describeInstallationMediaRequest);

    /**
     * <p>
     * Describes all available options.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest
     * @return Result of the DescribeOptionGroupOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOptionGroupOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroupOptions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeOptionGroupOptionsResult describeOptionGroupOptions(DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest);

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest
     * @return Result of the DescribeOptionGroups operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.DescribeOptionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeOptionGroupsResult describeOptionGroups(DescribeOptionGroupsRequest describeOptionGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation.
     *
     * @see #describeOptionGroups(DescribeOptionGroupsRequest)
     */
    DescribeOptionGroupsResult describeOptionGroups();

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @return Result of the DescribeOrderableDBInstanceOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest);

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @sample AmazonRDS.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation.
     *
     * @see #describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest)
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions();

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest
     * @return Result of the DescribeReservedDBInstances operation returned by the service.
     * @throws ReservedDBInstanceNotFoundException
     *         The specified reserved DB Instance not found.
     * @sample AmazonRDS.DescribeReservedDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedDBInstancesResult describeReservedDBInstances(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation.
     *
     * @see #describeReservedDBInstances(DescribeReservedDBInstancesRequest)
     */
    DescribeReservedDBInstancesResult describeReservedDBInstances();

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest
     * @return Result of the DescribeReservedDBInstancesOfferings operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @sample AmazonRDS.DescribeReservedDBInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation.
     *
     * @see #describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest)
     */
    DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings();

    /**
     * <p>
     * Returns a list of the source AWS Regions where the current AWS Region can create a read replica, copy a DB
     * snapshot from, or replicate automated backups from. This API action supports pagination.
     * </p>
     * 
     * @param describeSourceRegionsRequest
     * @return Result of the DescribeSourceRegions operation returned by the service.
     * @sample AmazonRDS.DescribeSourceRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeSourceRegions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSourceRegionsResult describeSourceRegions(DescribeSourceRegionsRequest describeSourceRegionsRequest);

    /**
     * <p>
     * You can call <code>DescribeValidDBInstanceModifications</code> to learn what modifications you can make to your
     * DB instance. You can use this information when you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest
     * @return Result of the DescribeValidDBInstanceModifications operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.DescribeValidDBInstanceModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeValidDBInstanceModifications"
     *      target="_top">AWS API Documentation</a>
     */
    ValidDBInstanceModificationsMessage describeValidDBInstanceModifications(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest);

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest
     * @return Result of the DownloadDBLogFilePortion operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBLogFileNotFoundException
     *         <code>LogFileName</code> doesn't refer to an existing DB log file.
     * @sample AmazonRDS.DownloadDBLogFilePortion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DownloadDBLogFilePortion" target="_top">AWS
     *      API Documentation</a>
     */
    DownloadDBLogFilePortionResult downloadDBLogFilePortion(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest);

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the
     * primary instance (the cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails.
     * You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param failoverDBClusterRequest
     * @return Result of the FailoverDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * Simplified method form for invoking the FailoverDBCluster operation.
     *
     * @see #failoverDBCluster(FailoverDBClusterRequest)
     */
    DBCluster failoverDBCluster();

    /**
     * <p>
     * Initiates the failover process for an Aurora global database (<a>GlobalCluster</a>).
     * </p>
     * <p>
     * A failover for an Aurora global database promotes one of secondary read-only DB clusters to be the primary DB
     * cluster and demotes the primary DB cluster to being a secondary (read-only) DB cluster. In other words, the role
     * of the current primary DB cluster and the selected (target) DB cluster are switched. The selected secondary DB
     * cluster assumes full read/write capabilities for the Aurora global database.
     * </p>
     * <p>
     * For more information about failing over an Amazon Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-disaster-recovery.managed-failover"
     * >Managed planned failover for Amazon Aurora global databases</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action applies to <a>GlobalCluster</a> (Aurora global databases) only. Use this action only on healthy
     * Aurora global databases with running Aurora DB clusters and no Region-wide outages, to test disaster recovery
     * scenarios or to reconfigure your Aurora global database topology.
     * </p>
     * </note>
     * 
     * @param failoverGlobalClusterRequest
     * @return Result of the FailoverGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @throws InvalidGlobalClusterStateException
     *         The global cluster is in an invalid state and can't perform the requested operation.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.FailoverGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster failoverGlobalCluster(FailoverGlobalClusterRequest failoverGlobalClusterRequest);

    /**
     * <p>
     * Imports the installation media for a DB engine that requires an on-premises customer provided license, such as
     * SQL Server.
     * </p>
     * 
     * @param importInstallationMediaRequest
     * @return Result of the ImportInstallationMedia operation returned by the service.
     * @throws CustomAvailabilityZoneNotFoundException
     *         <code>CustomAvailabilityZoneId</code> doesn't refer to an existing custom Availability Zone identifier.
     * @throws InstallationMediaAlreadyExistsException
     *         The specified installation medium has already been imported.
     * @sample AmazonRDS.ImportInstallationMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ImportInstallationMedia" target="_top">AWS
     *      API Documentation</a>
     */
    ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest importInstallationMediaRequest);

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @sample AmazonRDS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Override the system-default Secure Sockets Layer/Transport Layer Security (SSL/TLS) certificate for Amazon RDS
     * for new DB instances temporarily, or remove the override.
     * </p>
     * <p>
     * By using this operation, you can specify an RDS-approved SSL/TLS certificate for new DB instances that is
     * different from the default certificate provided by RDS. You can also use this operation to remove the override,
     * so that new DB instances use the default certificate provided by RDS.
     * </p>
     * <p>
     * You might need to override the default certificate in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You already migrated your applications to support the latest certificate authority (CA) certificate, but the new
     * CA certificate is not yet the RDS default CA certificate for the specified AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has already moved to a new default CA certificate for the specified AWS Region, but you are still in the
     * process of supporting the new CA certificate. In this case, you temporarily need additional time to finish your
     * application changes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param modifyCertificatesRequest
     * @return Result of the ModifyCertificates operation returned by the service.
     * @throws CertificateNotFoundException
     *         <code>CertificateIdentifier</code> doesn't refer to an existing certificate.
     * @sample AmazonRDS.ModifyCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    Certificate modifyCertificates(ModifyCertificatesRequest modifyCertificatesRequest);

    /**
     * <p>
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on
     * the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling
     * points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @return Result of the ModifyCurrentDBClusterCapacity operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterCapacityException
     *         <code>Capacity</code> isn't a valid Aurora Serverless DB cluster capacity. Valid capacity values are
     *         <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     *         <code>128</code>, and <code>256</code>.
     * @sample AmazonRDS.ModifyCurrentDBClusterCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyCurrentDBClusterCapacityResult modifyCurrentDBClusterCapacity(ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest);

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
     * specifying these parameters and the new values in the request. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterRequest
     * @return Result of the ModifyDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing DB cluster parameter group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @sample AmazonRDS.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @return Result of the ModifyDBClusterEndpoint operation returned by the service.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterEndpointStateException
     *         The requested operation can't be performed on the endpoint while the endpoint is in this state.
     * @throws DBClusterEndpointNotFoundException
     *         The specified custom endpoint doesn't exist.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.ModifyDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDBClusterEndpointResult modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB cluster associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS
     * console</a> or the <code>DescribeDBClusterParameters</code> action to verify that your DB cluster parameter group
     * has been created or modified.
     * </p>
     * <p>
     * If the modified DB cluster parameter group is used by an Aurora Serverless cluster, Aurora applies the update
     * immediately. The cluster restart might interrupt your workload. In that case, your application must reopen any
     * connections and retry any transactions that were active when the parameter changes took effect.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @return Result of the ModifyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @sample AmazonRDS.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB cluster snapshot. Use the value <code>all</code> to make
     * the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB cluster snapshots that contain private information that
     * you don't want available to all AWS accounts.
     * </p>
     * </note>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS
     * account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value for that
     * parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
     * cluster snapshot is public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action. The
     * accounts are returned as values for the <code>restore</code> attribute.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     * @return Result of the ModifyDBClusterSnapshotAttribute operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonRDS.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
     * call <code>DescribeValidDBInstanceModifications</code> before you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     * @return Result of the ModifyDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBUpgradeDependencyFailureException
     *         The DB upgrade failed because a resource the DB depends on can't be modified.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws CertificateNotFoundException
     *         <code>CertificateIdentifier</code> doesn't refer to an existing certificate.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB instance associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * modify action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @return Result of the ModifyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @sample AmazonRDS.ModifyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest);

    /**
     * <p>
     * Changes the settings for an existing DB proxy.
     * </p>
     * 
     * @param modifyDBProxyRequest
     * @return Result of the ModifyDBProxy operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyAlreadyExistsException
     *         The specified proxy name must be unique for all proxies owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.ModifyDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest modifyDBProxyRequest);

    /**
     * <p>
     * Changes the settings for an existing DB proxy endpoint.
     * </p>
     * 
     * @param modifyDBProxyEndpointRequest
     * @return Result of the ModifyDBProxyEndpoint operation returned by the service.
     * @throws DBProxyEndpointNotFoundException
     *         The DB proxy endpoint doesn't exist.
     * @throws DBProxyEndpointAlreadyExistsException
     *         The specified DB proxy endpoint name must be unique for all DB proxy endpoints owned by your AWS account
     *         in the specified AWS Region.
     * @throws InvalidDBProxyEndpointStateException
     *         You can't perform this operation while the DB proxy endpoint is in a particular state.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.ModifyDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyDBProxyEndpointResult modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest modifyDBProxyEndpointRequest);

    /**
     * <p>
     * Modifies the properties of a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param modifyDBProxyTargetGroupRequest
     * @return Result of the ModifyDBProxyTargetGroup operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @sample AmazonRDS.ModifyDBProxyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDBProxyTargetGroupResult modifyDBProxyTargetGroup(ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest);

    /**
     * <p>
     * Updates a manual DB snapshot with a new engine version. The snapshot can be encrypted or unencrypted, but not
     * shared or public.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and PostgreSQL.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @return Result of the ModifyDBSnapshot operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.ModifyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DBSnapshot modifyDBSnapshot(ModifyDBSnapshotRequest modifyDBSnapshotRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make the
     * manual DB snapshot public, which means it can be copied or restored by all AWS accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     * want available to all AWS accounts.
     * </p>
     * </note>
     * <p>
     * If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account
     * IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value for that parameter in
     * this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
     * public or private, use the <a>DescribeDBSnapshotAttributes</a> API action. The accounts are returned as values
     * for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest
     * @return Result of the ModifyDBSnapshotAttribute operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonRDS.ModifyDBSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DBSnapshotAttributesResult modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     * @return Result of the ModifyDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetQuotaExceededException
     *         The request would result in the user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws SubnetAlreadyInUseException
     *         The DB subnet is already in use in the Availability Zone.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonRDS.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. You can't modify the source identifiers using this
     * call. To change source identifiers for a subscription, use the <code>AddSourceIdentifierToSubscription</code> and
     * <code>RemoveSourceIdentifierFromSubscription</code> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given source type (<code>SourceType</code>) in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> in the <i>Amazon RDS
     * User Guide</i> or by using the <code>DescribeEventCategories</code> operation.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @sample AmazonRDS.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
     * parameters by specifying these parameters and the new values in the request. For more information on Amazon
     * Aurora, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What
     * Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @return Result of the ModifyGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @throws InvalidGlobalClusterStateException
     *         The global cluster is in an invalid state and can't perform the requested operation.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.ModifyGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster modifyGlobalCluster(ModifyGlobalClusterRequest modifyGlobalClusterRequest);

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest
     * @return Result of the ModifyOptionGroup operation returned by the service.
     * @throws InvalidOptionGroupStateException
     *         The option group isn't in the <i>available</i> state.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.ModifyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    OptionGroup modifyOptionGroup(ModifyOptionGroupRequest modifyOptionGroupRequest);

    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a read replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a read replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your read replica, configure the automated
     * backup window so that daily backups do not interfere with read replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest
     * @return Result of the PromoteReadReplica operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.PromoteReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance promoteReadReplica(PromoteReadReplicaRequest promoteReadReplicaRequest);

    /**
     * <p>
     * Promotes a read replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param promoteReadReplicaDBClusterRequest
     * @return Result of the PromoteReadReplicaDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.PromoteReadReplicaDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplicaDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest);

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest
     * @return Result of the PurchaseReservedDBInstancesOffering operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws ReservedDBInstanceAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @throws ReservedDBInstanceQuotaExceededException
     *         Request would exceed the user's DB Instance quota.
     * @sample AmazonRDS.PurchaseReservedDBInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PurchaseReservedDBInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    ReservedDBInstance purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest);

    /**
     * <p>
     * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
     * modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
     * outage, during which the DB instance status is set to rebooting.
     * </p>
     * <p>
     * For more information about rebooting, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html">Rebooting a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @return Result of the RebootDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest);

    /**
     * <p>
     * Associate one or more <code>DBProxyTarget</code> data structures with a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param registerDBProxyTargetsRequest
     * @return Result of the RegisterDBProxyTargets operation returned by the service.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBProxyTargetAlreadyRegisteredException
     *         The proxy is already associated with the specified RDS DB instance or Aurora DB cluster.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBProxyStateException
     *         The requested operation can't be performed while the proxy is in this state.
     * @throws InsufficientAvailableIPsInSubnetException
     *         The requested operation can't be performed because there aren't enough available IP addresses in the
     *         proxy's subnets. Add more CIDR blocks to the VPC or remove IP address that aren't required from the
     *         subnets.
     * @sample AmazonRDS.RegisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RegisterDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterDBProxyTargetsResult registerDBProxyTargets(RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest);

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
     * cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
     * different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @return Result of the RemoveFromGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global database cluster.
     * @throws InvalidGlobalClusterStateException
     *         The global cluster is in an invalid state and can't perform the requested operation.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.RemoveFromGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    GlobalCluster removeFromGlobalCluster(RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest);

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf </a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeRoleFromDBClusterRequest
     * @return Result of the RemoveRoleFromDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBClusterRoleNotFoundException
     *         The specified IAM role Amazon Resource Name (ARN) isn't associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.RemoveRoleFromDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBCluster" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveRoleFromDBClusterResult removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest);

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @return Result of the RemoveRoleFromDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBInstanceRoleNotFoundException
     *         The specified <code>RoleArn</code> value doesn't match the specified feature for the DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.RemoveRoleFromDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBInstance" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveRoleFromDBInstanceResult removeRoleFromDBInstance(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest);

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @return Result of the RemoveSourceIdentifierFromSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBProxyNotFoundException
     *         The specified proxy name doesn't correspond to a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @throws DBProxyTargetGroupNotFoundException
     *         The specified target group isn't available for a proxy owned by your AWS account in the specified AWS
     *         Region.
     * @sample AmazonRDS.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
     * a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request. You must call <code>RebootDBInstance</code> for every DB instance in your DB cluster that you want the
     * updated static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @return Result of the ResetDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
     * provide a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB
     * parameter group, specify the <code>DBParameterGroup</code> name and <code>ResetAllParameters</code> parameters.
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest
     * @return Result of the ResetDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest);

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from MySQL data stored in an Amazon S3 bucket. Amazon RDS must be authorized
     * to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.ExtMySQL.html#AuroraMySQL.Migrating.ExtMySQL.S3"
     * > Migrating Data from MySQL by Using an Amazon S3 Bucket</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> action to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromS3</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters. The source DB engine must be MySQL.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @return Result of the RestoreDBClusterFromS3 operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name can't be found or Amazon RDS isn't authorized to access the specified
     *         Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and try
     *         again.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing DB cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @sample AmazonRDS.RestoreDBClusterFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromS3" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster restoreDBClusterFromS3(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request);

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This action only applies to Aurora DB
     * clusters.
     * </p>
     * <p>
     * The target DB cluster is created from the source snapshot with a default configuration. If you don't specify a
     * security group, the new DB cluster is associated with the default security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> action to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromSnapshot</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     * @return Result of the RestoreDBClusterFromSnapshot operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing DB cluster parameter group.
     * @sample AmazonRDS.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> action to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterToPointInTime</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @return Result of the RestoreDBClusterToPointInTime operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing DB cluster parameter group.
     * @sample AmazonRDS.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
     * point with most of the source's original configuration, including the default security group and DB parameter
     * group. By default, the new DB instance is created as a Single-AZ deployment, except when the instance is a SQL
     * Server instance that has an option group associated with mirroring. In this case, the instance becomes a Multi-AZ
     * deployment, not a Single-AZ deployment.
     * </p>
     * <p>
     * If you want to replace your original DB instance with the new, restored DB instance, then rename your original DB
     * instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the
     * same name. After you have renamed your original DB instance with a different identifier, then you can pass the
     * original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot
     * action. The result is that you replace the original DB instance with the DB instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterFromSnapshot</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest
     * @return Result of the RestoreDBInstanceFromDBSnapshot operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.RestoreDBInstanceFromDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromDBSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest);

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
     * create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
     * restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html">Importing Data into
     * an Amazon RDS MySQL DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @return Result of the RestoreDBInstanceFromS3 operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name can't be found or Amazon RDS isn't authorized to access the specified
     *         Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and try
     *         again.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.RestoreDBInstanceFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromS3" target="_top">AWS
     *      API Documentation</a>
     */
    DBInstance restoreDBInstanceFromS3(RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request);

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
     * identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
     * the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration, but in a system-selected Availability
     * Zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
     * the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
     * has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
     * and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterToPointInTime</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest
     * @return Result of the RestoreDBInstanceToPointInTime operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws PointInTimeRestoreNotEnabledException
     *         <code>SourceDBInstanceIdentifier</code> refers to a DB instance with <code>BackupRetentionPeriod</code>
     *         equal to 0.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <code>Domain</code> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing DB parameter group.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.RestoreDBInstanceToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest);

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC security groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
     * 
     * @param revokeDBSecurityGroupIngressRequest
     * @return Result of the RevokeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing DB security group.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @sample AmazonRDS.RevokeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RevokeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest);

    /**
     * <p>
     * Starts a database activity stream to monitor activity on the database. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html">Database Activity
     * Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param startActivityStreamRequest
     * @return Result of the StartActivityStream operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.StartActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    StartActivityStreamResult startActivityStream(StartActivityStreamRequest startActivityStreamRequest);

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
     * or the StopDBCluster action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @return Result of the StartDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster startDBCluster(StartDBClusterRequest startDBClusterRequest);

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
     * the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
     * <code>StartDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @return Result of the StartDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or Amazon EC2 security group might not be authorized for the specified DB
     *         security group.</p>
     *         <p>
     *         Or, RDS might not be authorized to perform necessary actions using IAM on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.StartDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance startDBInstance(StartDBInstanceRequest startDBInstanceRequest);

    /**
     * <p>
     * Enables replication of automated backups to a different AWS Region.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another AWS Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param startDBInstanceAutomatedBackupsReplicationRequest
     * @return Result of the StartDBInstanceAutomatedBackupsReplication operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBInstanceAutomatedBackupQuotaExceededException
     *         The quota for retained automated backups was exceeded. This prevents you from retaining any additional
     *         automated backups. The retained automated backups quota is the same as your DB Instance quota.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <code>StorageType</code> specified can't be associated with the DB instance.
     * @sample AmazonRDS.StartDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstanceAutomatedBackup startDBInstanceAutomatedBackupsReplication(
            StartDBInstanceAutomatedBackupsReplicationRequest startDBInstanceAutomatedBackupsReplicationRequest);

    /**
     * <p>
     * Starts an export of a snapshot to Amazon S3. The provided IAM role must have access to the S3 bucket.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return Result of the StartExportTask operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing DB snapshot.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing DB cluster snapshot.
     * @throws ExportTaskAlreadyExistsException
     *         You can't start an export task that's already running.
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name can't be found or Amazon RDS isn't authorized to access the specified
     *         Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and try
     *         again.
     * @throws IamRoleNotFoundException
     *         The IAM role is missing for exporting to an Amazon S3 bucket.
     * @throws IamRoleMissingPermissionsException
     *         The IAM role requires additional permissions to export to an Amazon S3 bucket.
     * @throws InvalidExportOnlyException
     *         The export is invalid for exporting to an Amazon S3 bucket.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws InvalidExportSourceStateException
     *         The state of the export snapshot is invalid for exporting to an Amazon S3 bucket.
     * @sample AmazonRDS.StartExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    StartExportTaskResult startExportTask(StartExportTaskRequest startExportTaskRequest);

    /**
     * <p>
     * Stops a database activity stream that was started using the AWS console, the <code>start-activity-stream</code>
     * AWS CLI command, or the <code>StartActivityStream</code> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html">Database Activity
     * Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param stopActivityStreamRequest
     * @return Result of the StopActivityStream operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.StopActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    StopActivityStreamResult stopActivityStream(StopActivityStreamRequest stopActivityStreamRequest);

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
     * including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
     * point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @return Result of the StopDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster stopDBCluster(StopDBClusterRequest stopDBClusterRequest);

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
     * including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
     * logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"> Stopping an Amazon RDS DB
     * Instance Temporarily</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use
     * <code>StopDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @return Result of the StopDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSnapshotAlreadyExistsException
     *         <code>DBSnapshotIdentifier</code> is already used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.StopDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance stopDBInstance(StopDBInstanceRequest stopDBInstanceRequest);

    /**
     * <p>
     * Stops automated backup replication for a DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another AWS Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param stopDBInstanceAutomatedBackupsReplicationRequest
     * @return Result of the StopDBInstanceAutomatedBackupsReplication operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.StopDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    DBInstanceAutomatedBackup stopDBInstanceAutomatedBackupsReplication(
            StopDBInstanceAutomatedBackupsReplicationRequest stopDBInstanceAutomatedBackupsReplicationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonRDSWaiters waiters();

}
