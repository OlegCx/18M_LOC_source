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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon RDS.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RDSActions implements Action {

    /** Represents any action executed on Amazon RDS. */
    AllRDSActions("rds:*"),

    /** Action for the AddRoleToDBCluster operation. */
    AddRoleToDBCluster("rds:AddRoleToDBCluster"),
    /** Action for the AddRoleToDBInstance operation. */
    AddRoleToDBInstance("rds:AddRoleToDBInstance"),
    /** Action for the AddSourceIdentifierToSubscription operation. */
    AddSourceIdentifierToSubscription("rds:AddSourceIdentifierToSubscription"),
    /** Action for the AddTagsToResource operation. */
    AddTagsToResource("rds:AddTagsToResource"),
    /** Action for the ApplyPendingMaintenanceAction operation. */
    ApplyPendingMaintenanceAction("rds:ApplyPendingMaintenanceAction"),
    /** Action for the AuthorizeDBSecurityGroupIngress operation. */
    AuthorizeDBSecurityGroupIngress("rds:AuthorizeDBSecurityGroupIngress"),
    /** Action for the BacktrackDBCluster operation. */
    BacktrackDBCluster("rds:BacktrackDBCluster"),
    /** Action for the CancelExportTask operation. */
    CancelExportTask("rds:CancelExportTask"),
    /** Action for the CopyDBClusterParameterGroup operation. */
    CopyDBClusterParameterGroup("rds:CopyDBClusterParameterGroup"),
    /** Action for the CopyDBClusterSnapshot operation. */
    CopyDBClusterSnapshot("rds:CopyDBClusterSnapshot"),
    /** Action for the CopyDBParameterGroup operation. */
    CopyDBParameterGroup("rds:CopyDBParameterGroup"),
    /** Action for the CopyDBSnapshot operation. */
    CopyDBSnapshot("rds:CopyDBSnapshot"),
    /** Action for the CopyOptionGroup operation. */
    CopyOptionGroup("rds:CopyOptionGroup"),
    /** Action for the CreateCustomAvailabilityZone operation. */
    CreateCustomAvailabilityZone("rds:CreateCustomAvailabilityZone"),
    /** Action for the CreateDBCluster operation. */
    CreateDBCluster("rds:CreateDBCluster"),
    /** Action for the CreateDBClusterEndpoint operation. */
    CreateDBClusterEndpoint("rds:CreateDBClusterEndpoint"),
    /** Action for the CreateDBClusterParameterGroup operation. */
    CreateDBClusterParameterGroup("rds:CreateDBClusterParameterGroup"),
    /** Action for the CreateDBClusterSnapshot operation. */
    CreateDBClusterSnapshot("rds:CreateDBClusterSnapshot"),
    /** Action for the CreateDBInstance operation. */
    CreateDBInstance("rds:CreateDBInstance"),
    /** Action for the CreateDBInstanceReadReplica operation. */
    CreateDBInstanceReadReplica("rds:CreateDBInstanceReadReplica"),
    /** Action for the CreateDBParameterGroup operation. */
    CreateDBParameterGroup("rds:CreateDBParameterGroup"),
    /** Action for the CreateDBProxy operation. */
    CreateDBProxy("rds:CreateDBProxy"),
    /** Action for the CreateDBProxyEndpoint operation. */
    CreateDBProxyEndpoint("rds:CreateDBProxyEndpoint"),
    /** Action for the CreateDBSecurityGroup operation. */
    CreateDBSecurityGroup("rds:CreateDBSecurityGroup"),
    /** Action for the CreateDBSnapshot operation. */
    CreateDBSnapshot("rds:CreateDBSnapshot"),
    /** Action for the CreateDBSubnetGroup operation. */
    CreateDBSubnetGroup("rds:CreateDBSubnetGroup"),
    /** Action for the CreateEventSubscription operation. */
    CreateEventSubscription("rds:CreateEventSubscription"),
    /** Action for the CreateGlobalCluster operation. */
    CreateGlobalCluster("rds:CreateGlobalCluster"),
    /** Action for the CreateOptionGroup operation. */
    CreateOptionGroup("rds:CreateOptionGroup"),
    /** Action for the DeleteCustomAvailabilityZone operation. */
    DeleteCustomAvailabilityZone("rds:DeleteCustomAvailabilityZone"),
    /** Action for the DeleteDBCluster operation. */
    DeleteDBCluster("rds:DeleteDBCluster"),
    /** Action for the DeleteDBClusterEndpoint operation. */
    DeleteDBClusterEndpoint("rds:DeleteDBClusterEndpoint"),
    /** Action for the DeleteDBClusterParameterGroup operation. */
    DeleteDBClusterParameterGroup("rds:DeleteDBClusterParameterGroup"),
    /** Action for the DeleteDBClusterSnapshot operation. */
    DeleteDBClusterSnapshot("rds:DeleteDBClusterSnapshot"),
    /** Action for the DeleteDBInstance operation. */
    DeleteDBInstance("rds:DeleteDBInstance"),
    /** Action for the DeleteDBInstanceAutomatedBackup operation. */
    DeleteDBInstanceAutomatedBackup("rds:DeleteDBInstanceAutomatedBackup"),
    /** Action for the DeleteDBParameterGroup operation. */
    DeleteDBParameterGroup("rds:DeleteDBParameterGroup"),
    /** Action for the DeleteDBProxy operation. */
    DeleteDBProxy("rds:DeleteDBProxy"),
    /** Action for the DeleteDBProxyEndpoint operation. */
    DeleteDBProxyEndpoint("rds:DeleteDBProxyEndpoint"),
    /** Action for the DeleteDBSecurityGroup operation. */
    DeleteDBSecurityGroup("rds:DeleteDBSecurityGroup"),
    /** Action for the DeleteDBSnapshot operation. */
    DeleteDBSnapshot("rds:DeleteDBSnapshot"),
    /** Action for the DeleteDBSubnetGroup operation. */
    DeleteDBSubnetGroup("rds:DeleteDBSubnetGroup"),
    /** Action for the DeleteEventSubscription operation. */
    DeleteEventSubscription("rds:DeleteEventSubscription"),
    /** Action for the DeleteGlobalCluster operation. */
    DeleteGlobalCluster("rds:DeleteGlobalCluster"),
    /** Action for the DeleteInstallationMedia operation. */
    DeleteInstallationMedia("rds:DeleteInstallationMedia"),
    /** Action for the DeleteOptionGroup operation. */
    DeleteOptionGroup("rds:DeleteOptionGroup"),
    /** Action for the DeregisterDBProxyTargets operation. */
    DeregisterDBProxyTargets("rds:DeregisterDBProxyTargets"),
    /** Action for the DescribeAccountAttributes operation. */
    DescribeAccountAttributes("rds:DescribeAccountAttributes"),
    /** Action for the DescribeCertificates operation. */
    DescribeCertificates("rds:DescribeCertificates"),
    /** Action for the DescribeCustomAvailabilityZones operation. */
    DescribeCustomAvailabilityZones("rds:DescribeCustomAvailabilityZones"),
    /** Action for the DescribeDBClusterBacktracks operation. */
    DescribeDBClusterBacktracks("rds:DescribeDBClusterBacktracks"),
    /** Action for the DescribeDBClusterEndpoints operation. */
    DescribeDBClusterEndpoints("rds:DescribeDBClusterEndpoints"),
    /** Action for the DescribeDBClusterParameterGroups operation. */
    DescribeDBClusterParameterGroups("rds:DescribeDBClusterParameterGroups"),
    /** Action for the DescribeDBClusterParameters operation. */
    DescribeDBClusterParameters("rds:DescribeDBClusterParameters"),
    /** Action for the DescribeDBClusterSnapshotAttributes operation. */
    DescribeDBClusterSnapshotAttributes("rds:DescribeDBClusterSnapshotAttributes"),
    /** Action for the DescribeDBClusterSnapshots operation. */
    DescribeDBClusterSnapshots("rds:DescribeDBClusterSnapshots"),
    /** Action for the DescribeDBClusters operation. */
    DescribeDBClusters("rds:DescribeDBClusters"),
    /** Action for the DescribeDBEngineVersions operation. */
    DescribeDBEngineVersions("rds:DescribeDBEngineVersions"),
    /** Action for the DescribeDBInstanceAutomatedBackups operation. */
    DescribeDBInstanceAutomatedBackups("rds:DescribeDBInstanceAutomatedBackups"),
    /** Action for the DescribeDBInstances operation. */
    DescribeDBInstances("rds:DescribeDBInstances"),
    /** Action for the DescribeDBLogFiles operation. */
    DescribeDBLogFiles("rds:DescribeDBLogFiles"),
    /** Action for the DescribeDBParameterGroups operation. */
    DescribeDBParameterGroups("rds:DescribeDBParameterGroups"),
    /** Action for the DescribeDBParameters operation. */
    DescribeDBParameters("rds:DescribeDBParameters"),
    /** Action for the DescribeDBProxies operation. */
    DescribeDBProxies("rds:DescribeDBProxies"),
    /** Action for the DescribeDBProxyEndpoints operation. */
    DescribeDBProxyEndpoints("rds:DescribeDBProxyEndpoints"),
    /** Action for the DescribeDBProxyTargetGroups operation. */
    DescribeDBProxyTargetGroups("rds:DescribeDBProxyTargetGroups"),
    /** Action for the DescribeDBProxyTargets operation. */
    DescribeDBProxyTargets("rds:DescribeDBProxyTargets"),
    /** Action for the DescribeDBSecurityGroups operation. */
    DescribeDBSecurityGroups("rds:DescribeDBSecurityGroups"),
    /** Action for the DescribeDBSnapshotAttributes operation. */
    DescribeDBSnapshotAttributes("rds:DescribeDBSnapshotAttributes"),
    /** Action for the DescribeDBSnapshots operation. */
    DescribeDBSnapshots("rds:DescribeDBSnapshots"),
    /** Action for the DescribeDBSubnetGroups operation. */
    DescribeDBSubnetGroups("rds:DescribeDBSubnetGroups"),
    /** Action for the DescribeEngineDefaultClusterParameters operation. */
    DescribeEngineDefaultClusterParameters("rds:DescribeEngineDefaultClusterParameters"),
    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("rds:DescribeEngineDefaultParameters"),
    /** Action for the DescribeEventCategories operation. */
    DescribeEventCategories("rds:DescribeEventCategories"),
    /** Action for the DescribeEventSubscriptions operation. */
    DescribeEventSubscriptions("rds:DescribeEventSubscriptions"),
    /** Action for the DescribeEvents operation. */
    DescribeEvents("rds:DescribeEvents"),
    /** Action for the DescribeExportTasks operation. */
    DescribeExportTasks("rds:DescribeExportTasks"),
    /** Action for the DescribeGlobalClusters operation. */
    DescribeGlobalClusters("rds:DescribeGlobalClusters"),
    /** Action for the DescribeInstallationMedia operation. */
    DescribeInstallationMedia("rds:DescribeInstallationMedia"),
    /** Action for the DescribeOptionGroupOptions operation. */
    DescribeOptionGroupOptions("rds:DescribeOptionGroupOptions"),
    /** Action for the DescribeOptionGroups operation. */
    DescribeOptionGroups("rds:DescribeOptionGroups"),
    /** Action for the DescribeOrderableDBInstanceOptions operation. */
    DescribeOrderableDBInstanceOptions("rds:DescribeOrderableDBInstanceOptions"),
    /** Action for the DescribePendingMaintenanceActions operation. */
    DescribePendingMaintenanceActions("rds:DescribePendingMaintenanceActions"),
    /** Action for the DescribeReservedDBInstances operation. */
    DescribeReservedDBInstances("rds:DescribeReservedDBInstances"),
    /** Action for the DescribeReservedDBInstancesOfferings operation. */
    DescribeReservedDBInstancesOfferings("rds:DescribeReservedDBInstancesOfferings"),
    /** Action for the DescribeSourceRegions operation. */
    DescribeSourceRegions("rds:DescribeSourceRegions"),
    /** Action for the DescribeValidDBInstanceModifications operation. */
    DescribeValidDBInstanceModifications("rds:DescribeValidDBInstanceModifications"),
    /** Action for the DownloadDBLogFilePortion operation. */
    DownloadDBLogFilePortion("rds:DownloadDBLogFilePortion"),
    /** Action for the FailoverDBCluster operation. */
    FailoverDBCluster("rds:FailoverDBCluster"),
    /** Action for the FailoverGlobalCluster operation. */
    FailoverGlobalCluster("rds:FailoverGlobalCluster"),
    /** Action for the ImportInstallationMedia operation. */
    ImportInstallationMedia("rds:ImportInstallationMedia"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("rds:ListTagsForResource"),
    /** Action for the ModifyCertificates operation. */
    ModifyCertificates("rds:ModifyCertificates"),
    /** Action for the ModifyCurrentDBClusterCapacity operation. */
    ModifyCurrentDBClusterCapacity("rds:ModifyCurrentDBClusterCapacity"),
    /** Action for the ModifyDBCluster operation. */
    ModifyDBCluster("rds:ModifyDBCluster"),
    /** Action for the ModifyDBClusterEndpoint operation. */
    ModifyDBClusterEndpoint("rds:ModifyDBClusterEndpoint"),
    /** Action for the ModifyDBClusterParameterGroup operation. */
    ModifyDBClusterParameterGroup("rds:ModifyDBClusterParameterGroup"),
    /** Action for the ModifyDBClusterSnapshotAttribute operation. */
    ModifyDBClusterSnapshotAttribute("rds:ModifyDBClusterSnapshotAttribute"),
    /** Action for the ModifyDBInstance operation. */
    ModifyDBInstance("rds:ModifyDBInstance"),
    /** Action for the ModifyDBParameterGroup operation. */
    ModifyDBParameterGroup("rds:ModifyDBParameterGroup"),
    /** Action for the ModifyDBProxy operation. */
    ModifyDBProxy("rds:ModifyDBProxy"),
    /** Action for the ModifyDBProxyEndpoint operation. */
    ModifyDBProxyEndpoint("rds:ModifyDBProxyEndpoint"),
    /** Action for the ModifyDBProxyTargetGroup operation. */
    ModifyDBProxyTargetGroup("rds:ModifyDBProxyTargetGroup"),
    /** Action for the ModifyDBSnapshot operation. */
    ModifyDBSnapshot("rds:ModifyDBSnapshot"),
    /** Action for the ModifyDBSnapshotAttribute operation. */
    ModifyDBSnapshotAttribute("rds:ModifyDBSnapshotAttribute"),
    /** Action for the ModifyDBSubnetGroup operation. */
    ModifyDBSubnetGroup("rds:ModifyDBSubnetGroup"),
    /** Action for the ModifyEventSubscription operation. */
    ModifyEventSubscription("rds:ModifyEventSubscription"),
    /** Action for the ModifyGlobalCluster operation. */
    ModifyGlobalCluster("rds:ModifyGlobalCluster"),
    /** Action for the ModifyOptionGroup operation. */
    ModifyOptionGroup("rds:ModifyOptionGroup"),
    /** Action for the PromoteReadReplica operation. */
    PromoteReadReplica("rds:PromoteReadReplica"),
    /** Action for the PromoteReadReplicaDBCluster operation. */
    PromoteReadReplicaDBCluster("rds:PromoteReadReplicaDBCluster"),
    /** Action for the PurchaseReservedDBInstancesOffering operation. */
    PurchaseReservedDBInstancesOffering("rds:PurchaseReservedDBInstancesOffering"),
    /** Action for the RebootDBInstance operation. */
    RebootDBInstance("rds:RebootDBInstance"),
    /** Action for the RegisterDBProxyTargets operation. */
    RegisterDBProxyTargets("rds:RegisterDBProxyTargets"),
    /** Action for the RemoveFromGlobalCluster operation. */
    RemoveFromGlobalCluster("rds:RemoveFromGlobalCluster"),
    /** Action for the RemoveRoleFromDBCluster operation. */
    RemoveRoleFromDBCluster("rds:RemoveRoleFromDBCluster"),
    /** Action for the RemoveRoleFromDBInstance operation. */
    RemoveRoleFromDBInstance("rds:RemoveRoleFromDBInstance"),
    /** Action for the RemoveSourceIdentifierFromSubscription operation. */
    RemoveSourceIdentifierFromSubscription("rds:RemoveSourceIdentifierFromSubscription"),
    /** Action for the RemoveTagsFromResource operation. */
    RemoveTagsFromResource("rds:RemoveTagsFromResource"),
    /** Action for the ResetDBClusterParameterGroup operation. */
    ResetDBClusterParameterGroup("rds:ResetDBClusterParameterGroup"),
    /** Action for the ResetDBParameterGroup operation. */
    ResetDBParameterGroup("rds:ResetDBParameterGroup"),
    /** Action for the RestoreDBClusterFromS3 operation. */
    RestoreDBClusterFromS3("rds:RestoreDBClusterFromS3"),
    /** Action for the RestoreDBClusterFromSnapshot operation. */
    RestoreDBClusterFromSnapshot("rds:RestoreDBClusterFromSnapshot"),
    /** Action for the RestoreDBClusterToPointInTime operation. */
    RestoreDBClusterToPointInTime("rds:RestoreDBClusterToPointInTime"),
    /** Action for the RestoreDBInstanceFromDBSnapshot operation. */
    RestoreDBInstanceFromDBSnapshot("rds:RestoreDBInstanceFromDBSnapshot"),
    /** Action for the RestoreDBInstanceFromS3 operation. */
    RestoreDBInstanceFromS3("rds:RestoreDBInstanceFromS3"),
    /** Action for the RestoreDBInstanceToPointInTime operation. */
    RestoreDBInstanceToPointInTime("rds:RestoreDBInstanceToPointInTime"),
    /** Action for the RevokeDBSecurityGroupIngress operation. */
    RevokeDBSecurityGroupIngress("rds:RevokeDBSecurityGroupIngress"),
    /** Action for the StartActivityStream operation. */
    StartActivityStream("rds:StartActivityStream"),
    /** Action for the StartDBCluster operation. */
    StartDBCluster("rds:StartDBCluster"),
    /** Action for the StartDBInstance operation. */
    StartDBInstance("rds:StartDBInstance"),
    /** Action for the StartDBInstanceAutomatedBackupsReplication operation. */
    StartDBInstanceAutomatedBackupsReplication("rds:StartDBInstanceAutomatedBackupsReplication"),
    /** Action for the StartExportTask operation. */
    StartExportTask("rds:StartExportTask"),
    /** Action for the StopActivityStream operation. */
    StopActivityStream("rds:StopActivityStream"),
    /** Action for the StopDBCluster operation. */
    StopDBCluster("rds:StopDBCluster"),
    /** Action for the StopDBInstance operation. */
    StopDBInstance("rds:StopDBInstance"),
    /** Action for the StopDBInstanceAutomatedBackupsReplication operation. */
    StopDBInstanceAutomatedBackupsReplication("rds:StopDBInstanceAutomatedBackupsReplication"),

    ;

    private final String action;

    private RDSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }

    public boolean isNotType() {
        return false;
    }
}
