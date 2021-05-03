/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SynapseManagementClientImpl class.
 */
public class SynapseManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SynapseManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for this operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SynapseManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SynapseManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SynapseManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The BigDataPoolsInner object to access its operations.
     */
    private BigDataPoolsInner bigDataPools;

    /**
     * Gets the BigDataPoolsInner object to access its operations.
     * @return the BigDataPoolsInner object.
     */
    public BigDataPoolsInner bigDataPools() {
        return this.bigDataPools;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The IpFirewallRulesInner object to access its operations.
     */
    private IpFirewallRulesInner ipFirewallRules;

    /**
     * Gets the IpFirewallRulesInner object to access its operations.
     * @return the IpFirewallRulesInner object.
     */
    public IpFirewallRulesInner ipFirewallRules() {
        return this.ipFirewallRules;
    }

    /**
     * The SqlPoolsInner object to access its operations.
     */
    private SqlPoolsInner sqlPools;

    /**
     * Gets the SqlPoolsInner object to access its operations.
     * @return the SqlPoolsInner object.
     */
    public SqlPoolsInner sqlPools() {
        return this.sqlPools;
    }

    /**
     * The SqlPoolMetadataSyncConfigsInner object to access its operations.
     */
    private SqlPoolMetadataSyncConfigsInner sqlPoolMetadataSyncConfigs;

    /**
     * Gets the SqlPoolMetadataSyncConfigsInner object to access its operations.
     * @return the SqlPoolMetadataSyncConfigsInner object.
     */
    public SqlPoolMetadataSyncConfigsInner sqlPoolMetadataSyncConfigs() {
        return this.sqlPoolMetadataSyncConfigs;
    }

    /**
     * The SqlPoolOperationResultsInner object to access its operations.
     */
    private SqlPoolOperationResultsInner sqlPoolOperationResults;

    /**
     * Gets the SqlPoolOperationResultsInner object to access its operations.
     * @return the SqlPoolOperationResultsInner object.
     */
    public SqlPoolOperationResultsInner sqlPoolOperationResults() {
        return this.sqlPoolOperationResults;
    }

    /**
     * The SqlPoolGeoBackupPoliciesInner object to access its operations.
     */
    private SqlPoolGeoBackupPoliciesInner sqlPoolGeoBackupPolicies;

    /**
     * Gets the SqlPoolGeoBackupPoliciesInner object to access its operations.
     * @return the SqlPoolGeoBackupPoliciesInner object.
     */
    public SqlPoolGeoBackupPoliciesInner sqlPoolGeoBackupPolicies() {
        return this.sqlPoolGeoBackupPolicies;
    }

    /**
     * The SqlPoolDataWarehouseUserActivitiesInner object to access its operations.
     */
    private SqlPoolDataWarehouseUserActivitiesInner sqlPoolDataWarehouseUserActivities;

    /**
     * Gets the SqlPoolDataWarehouseUserActivitiesInner object to access its operations.
     * @return the SqlPoolDataWarehouseUserActivitiesInner object.
     */
    public SqlPoolDataWarehouseUserActivitiesInner sqlPoolDataWarehouseUserActivities() {
        return this.sqlPoolDataWarehouseUserActivities;
    }

    /**
     * The SqlPoolRestorePointsInner object to access its operations.
     */
    private SqlPoolRestorePointsInner sqlPoolRestorePoints;

    /**
     * Gets the SqlPoolRestorePointsInner object to access its operations.
     * @return the SqlPoolRestorePointsInner object.
     */
    public SqlPoolRestorePointsInner sqlPoolRestorePoints() {
        return this.sqlPoolRestorePoints;
    }

    /**
     * The SqlPoolReplicationLinksInner object to access its operations.
     */
    private SqlPoolReplicationLinksInner sqlPoolReplicationLinks;

    /**
     * Gets the SqlPoolReplicationLinksInner object to access its operations.
     * @return the SqlPoolReplicationLinksInner object.
     */
    public SqlPoolReplicationLinksInner sqlPoolReplicationLinks() {
        return this.sqlPoolReplicationLinks;
    }

    /**
     * The SqlPoolTransparentDataEncryptionsInner object to access its operations.
     */
    private SqlPoolTransparentDataEncryptionsInner sqlPoolTransparentDataEncryptions;

    /**
     * Gets the SqlPoolTransparentDataEncryptionsInner object to access its operations.
     * @return the SqlPoolTransparentDataEncryptionsInner object.
     */
    public SqlPoolTransparentDataEncryptionsInner sqlPoolTransparentDataEncryptions() {
        return this.sqlPoolTransparentDataEncryptions;
    }

    /**
     * The SqlPoolBlobAuditingPoliciesInner object to access its operations.
     */
    private SqlPoolBlobAuditingPoliciesInner sqlPoolBlobAuditingPolicies;

    /**
     * Gets the SqlPoolBlobAuditingPoliciesInner object to access its operations.
     * @return the SqlPoolBlobAuditingPoliciesInner object.
     */
    public SqlPoolBlobAuditingPoliciesInner sqlPoolBlobAuditingPolicies() {
        return this.sqlPoolBlobAuditingPolicies;
    }

    /**
     * The SqlPoolOperationsInner object to access its operations.
     */
    private SqlPoolOperationsInner sqlPoolOperations;

    /**
     * Gets the SqlPoolOperationsInner object to access its operations.
     * @return the SqlPoolOperationsInner object.
     */
    public SqlPoolOperationsInner sqlPoolOperations() {
        return this.sqlPoolOperations;
    }

    /**
     * The SqlPoolUsagesInner object to access its operations.
     */
    private SqlPoolUsagesInner sqlPoolUsages;

    /**
     * Gets the SqlPoolUsagesInner object to access its operations.
     * @return the SqlPoolUsagesInner object.
     */
    public SqlPoolUsagesInner sqlPoolUsages() {
        return this.sqlPoolUsages;
    }

    /**
     * The SqlPoolSensitivityLabelsInner object to access its operations.
     */
    private SqlPoolSensitivityLabelsInner sqlPoolSensitivityLabels;

    /**
     * Gets the SqlPoolSensitivityLabelsInner object to access its operations.
     * @return the SqlPoolSensitivityLabelsInner object.
     */
    public SqlPoolSensitivityLabelsInner sqlPoolSensitivityLabels() {
        return this.sqlPoolSensitivityLabels;
    }

    /**
     * The SqlPoolSchemasInner object to access its operations.
     */
    private SqlPoolSchemasInner sqlPoolSchemas;

    /**
     * Gets the SqlPoolSchemasInner object to access its operations.
     * @return the SqlPoolSchemasInner object.
     */
    public SqlPoolSchemasInner sqlPoolSchemas() {
        return this.sqlPoolSchemas;
    }

    /**
     * The SqlPoolTablesInner object to access its operations.
     */
    private SqlPoolTablesInner sqlPoolTables;

    /**
     * Gets the SqlPoolTablesInner object to access its operations.
     * @return the SqlPoolTablesInner object.
     */
    public SqlPoolTablesInner sqlPoolTables() {
        return this.sqlPoolTables;
    }

    /**
     * The SqlPoolTableColumnsInner object to access its operations.
     */
    private SqlPoolTableColumnsInner sqlPoolTableColumns;

    /**
     * Gets the SqlPoolTableColumnsInner object to access its operations.
     * @return the SqlPoolTableColumnsInner object.
     */
    public SqlPoolTableColumnsInner sqlPoolTableColumns() {
        return this.sqlPoolTableColumns;
    }

    /**
     * The SqlPoolConnectionPoliciesInner object to access its operations.
     */
    private SqlPoolConnectionPoliciesInner sqlPoolConnectionPolicies;

    /**
     * Gets the SqlPoolConnectionPoliciesInner object to access its operations.
     * @return the SqlPoolConnectionPoliciesInner object.
     */
    public SqlPoolConnectionPoliciesInner sqlPoolConnectionPolicies() {
        return this.sqlPoolConnectionPolicies;
    }

    /**
     * The SqlPoolVulnerabilityAssessmentsInner object to access its operations.
     */
    private SqlPoolVulnerabilityAssessmentsInner sqlPoolVulnerabilityAssessments;

    /**
     * Gets the SqlPoolVulnerabilityAssessmentsInner object to access its operations.
     * @return the SqlPoolVulnerabilityAssessmentsInner object.
     */
    public SqlPoolVulnerabilityAssessmentsInner sqlPoolVulnerabilityAssessments() {
        return this.sqlPoolVulnerabilityAssessments;
    }

    /**
     * The SqlPoolVulnerabilityAssessmentScansInner object to access its operations.
     */
    private SqlPoolVulnerabilityAssessmentScansInner sqlPoolVulnerabilityAssessmentScans;

    /**
     * Gets the SqlPoolVulnerabilityAssessmentScansInner object to access its operations.
     * @return the SqlPoolVulnerabilityAssessmentScansInner object.
     */
    public SqlPoolVulnerabilityAssessmentScansInner sqlPoolVulnerabilityAssessmentScans() {
        return this.sqlPoolVulnerabilityAssessmentScans;
    }

    /**
     * The SqlPoolSecurityAlertPoliciesInner object to access its operations.
     */
    private SqlPoolSecurityAlertPoliciesInner sqlPoolSecurityAlertPolicies;

    /**
     * Gets the SqlPoolSecurityAlertPoliciesInner object to access its operations.
     * @return the SqlPoolSecurityAlertPoliciesInner object.
     */
    public SqlPoolSecurityAlertPoliciesInner sqlPoolSecurityAlertPolicies() {
        return this.sqlPoolSecurityAlertPolicies;
    }

    /**
     * The SqlPoolVulnerabilityAssessmentRuleBaselinesInner object to access its operations.
     */
    private SqlPoolVulnerabilityAssessmentRuleBaselinesInner sqlPoolVulnerabilityAssessmentRuleBaselines;

    /**
     * Gets the SqlPoolVulnerabilityAssessmentRuleBaselinesInner object to access its operations.
     * @return the SqlPoolVulnerabilityAssessmentRuleBaselinesInner object.
     */
    public SqlPoolVulnerabilityAssessmentRuleBaselinesInner sqlPoolVulnerabilityAssessmentRuleBaselines() {
        return this.sqlPoolVulnerabilityAssessmentRuleBaselines;
    }

    /**
     * The ExtendedSqlPoolBlobAuditingPoliciesInner object to access its operations.
     */
    private ExtendedSqlPoolBlobAuditingPoliciesInner extendedSqlPoolBlobAuditingPolicies;

    /**
     * Gets the ExtendedSqlPoolBlobAuditingPoliciesInner object to access its operations.
     * @return the ExtendedSqlPoolBlobAuditingPoliciesInner object.
     */
    public ExtendedSqlPoolBlobAuditingPoliciesInner extendedSqlPoolBlobAuditingPolicies() {
        return this.extendedSqlPoolBlobAuditingPolicies;
    }

    /**
     * The DataMaskingPoliciesInner object to access its operations.
     */
    private DataMaskingPoliciesInner dataMaskingPolicies;

    /**
     * Gets the DataMaskingPoliciesInner object to access its operations.
     * @return the DataMaskingPoliciesInner object.
     */
    public DataMaskingPoliciesInner dataMaskingPolicies() {
        return this.dataMaskingPolicies;
    }

    /**
     * The DataMaskingRulesInner object to access its operations.
     */
    private DataMaskingRulesInner dataMaskingRules;

    /**
     * Gets the DataMaskingRulesInner object to access its operations.
     * @return the DataMaskingRulesInner object.
     */
    public DataMaskingRulesInner dataMaskingRules() {
        return this.dataMaskingRules;
    }

    /**
     * The SqlPoolColumnsInner object to access its operations.
     */
    private SqlPoolColumnsInner sqlPoolColumns;

    /**
     * Gets the SqlPoolColumnsInner object to access its operations.
     * @return the SqlPoolColumnsInner object.
     */
    public SqlPoolColumnsInner sqlPoolColumns() {
        return this.sqlPoolColumns;
    }

    /**
     * The SqlPoolWorkloadGroupsInner object to access its operations.
     */
    private SqlPoolWorkloadGroupsInner sqlPoolWorkloadGroups;

    /**
     * Gets the SqlPoolWorkloadGroupsInner object to access its operations.
     * @return the SqlPoolWorkloadGroupsInner object.
     */
    public SqlPoolWorkloadGroupsInner sqlPoolWorkloadGroups() {
        return this.sqlPoolWorkloadGroups;
    }

    /**
     * The SqlPoolWorkloadClassifiersInner object to access its operations.
     */
    private SqlPoolWorkloadClassifiersInner sqlPoolWorkloadClassifiers;

    /**
     * Gets the SqlPoolWorkloadClassifiersInner object to access its operations.
     * @return the SqlPoolWorkloadClassifiersInner object.
     */
    public SqlPoolWorkloadClassifiersInner sqlPoolWorkloadClassifiers() {
        return this.sqlPoolWorkloadClassifiers;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * The WorkspaceAadAdminsInner object to access its operations.
     */
    private WorkspaceAadAdminsInner workspaceAadAdmins;

    /**
     * Gets the WorkspaceAadAdminsInner object to access its operations.
     * @return the WorkspaceAadAdminsInner object.
     */
    public WorkspaceAadAdminsInner workspaceAadAdmins() {
        return this.workspaceAadAdmins;
    }

    /**
     * The WorkspaceSqlAadAdminsInner object to access its operations.
     */
    private WorkspaceSqlAadAdminsInner workspaceSqlAadAdmins;

    /**
     * Gets the WorkspaceSqlAadAdminsInner object to access its operations.
     * @return the WorkspaceSqlAadAdminsInner object.
     */
    public WorkspaceSqlAadAdminsInner workspaceSqlAadAdmins() {
        return this.workspaceSqlAadAdmins;
    }

    /**
     * The WorkspaceManagedIdentitySqlControlSettingsInner object to access its operations.
     */
    private WorkspaceManagedIdentitySqlControlSettingsInner workspaceManagedIdentitySqlControlSettings;

    /**
     * Gets the WorkspaceManagedIdentitySqlControlSettingsInner object to access its operations.
     * @return the WorkspaceManagedIdentitySqlControlSettingsInner object.
     */
    public WorkspaceManagedIdentitySqlControlSettingsInner workspaceManagedIdentitySqlControlSettings() {
        return this.workspaceManagedIdentitySqlControlSettings;
    }

    /**
     * The RestorableDroppedSqlPoolsInner object to access its operations.
     */
    private RestorableDroppedSqlPoolsInner restorableDroppedSqlPools;

    /**
     * Gets the RestorableDroppedSqlPoolsInner object to access its operations.
     * @return the RestorableDroppedSqlPoolsInner object.
     */
    public RestorableDroppedSqlPoolsInner restorableDroppedSqlPools() {
        return this.restorableDroppedSqlPools;
    }

    /**
     * The IntegrationRuntimesInner object to access its operations.
     */
    private IntegrationRuntimesInner integrationRuntimes;

    /**
     * Gets the IntegrationRuntimesInner object to access its operations.
     * @return the IntegrationRuntimesInner object.
     */
    public IntegrationRuntimesInner integrationRuntimes() {
        return this.integrationRuntimes;
    }

    /**
     * The IntegrationRuntimeNodeIpAddressOperationsInner object to access its operations.
     */
    private IntegrationRuntimeNodeIpAddressOperationsInner integrationRuntimeNodeIpAddressOperations;

    /**
     * Gets the IntegrationRuntimeNodeIpAddressOperationsInner object to access its operations.
     * @return the IntegrationRuntimeNodeIpAddressOperationsInner object.
     */
    public IntegrationRuntimeNodeIpAddressOperationsInner integrationRuntimeNodeIpAddressOperations() {
        return this.integrationRuntimeNodeIpAddressOperations;
    }

    /**
     * The IntegrationRuntimeObjectMetadatasInner object to access its operations.
     */
    private IntegrationRuntimeObjectMetadatasInner integrationRuntimeObjectMetadatas;

    /**
     * Gets the IntegrationRuntimeObjectMetadatasInner object to access its operations.
     * @return the IntegrationRuntimeObjectMetadatasInner object.
     */
    public IntegrationRuntimeObjectMetadatasInner integrationRuntimeObjectMetadatas() {
        return this.integrationRuntimeObjectMetadatas;
    }

    /**
     * The IntegrationRuntimeNodesInner object to access its operations.
     */
    private IntegrationRuntimeNodesInner integrationRuntimeNodes;

    /**
     * Gets the IntegrationRuntimeNodesInner object to access its operations.
     * @return the IntegrationRuntimeNodesInner object.
     */
    public IntegrationRuntimeNodesInner integrationRuntimeNodes() {
        return this.integrationRuntimeNodes;
    }

    /**
     * The IntegrationRuntimeCredentialsInner object to access its operations.
     */
    private IntegrationRuntimeCredentialsInner integrationRuntimeCredentials;

    /**
     * Gets the IntegrationRuntimeCredentialsInner object to access its operations.
     * @return the IntegrationRuntimeCredentialsInner object.
     */
    public IntegrationRuntimeCredentialsInner integrationRuntimeCredentials() {
        return this.integrationRuntimeCredentials;
    }

    /**
     * The IntegrationRuntimeConnectionInfosInner object to access its operations.
     */
    private IntegrationRuntimeConnectionInfosInner integrationRuntimeConnectionInfos;

    /**
     * Gets the IntegrationRuntimeConnectionInfosInner object to access its operations.
     * @return the IntegrationRuntimeConnectionInfosInner object.
     */
    public IntegrationRuntimeConnectionInfosInner integrationRuntimeConnectionInfos() {
        return this.integrationRuntimeConnectionInfos;
    }

    /**
     * The IntegrationRuntimeAuthKeysOperationsInner object to access its operations.
     */
    private IntegrationRuntimeAuthKeysOperationsInner integrationRuntimeAuthKeysOperations;

    /**
     * Gets the IntegrationRuntimeAuthKeysOperationsInner object to access its operations.
     * @return the IntegrationRuntimeAuthKeysOperationsInner object.
     */
    public IntegrationRuntimeAuthKeysOperationsInner integrationRuntimeAuthKeysOperations() {
        return this.integrationRuntimeAuthKeysOperations;
    }

    /**
     * The IntegrationRuntimeMonitoringDatasInner object to access its operations.
     */
    private IntegrationRuntimeMonitoringDatasInner integrationRuntimeMonitoringDatas;

    /**
     * Gets the IntegrationRuntimeMonitoringDatasInner object to access its operations.
     * @return the IntegrationRuntimeMonitoringDatasInner object.
     */
    public IntegrationRuntimeMonitoringDatasInner integrationRuntimeMonitoringDatas() {
        return this.integrationRuntimeMonitoringDatas;
    }

    /**
     * The IntegrationRuntimeStatusOperationsInner object to access its operations.
     */
    private IntegrationRuntimeStatusOperationsInner integrationRuntimeStatusOperations;

    /**
     * Gets the IntegrationRuntimeStatusOperationsInner object to access its operations.
     * @return the IntegrationRuntimeStatusOperationsInner object.
     */
    public IntegrationRuntimeStatusOperationsInner integrationRuntimeStatusOperations() {
        return this.integrationRuntimeStatusOperations;
    }

    /**
     * The PrivateLinkResourcesInner object to access its operations.
     */
    private PrivateLinkResourcesInner privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesInner object to access its operations.
     * @return the PrivateLinkResourcesInner object.
     */
    public PrivateLinkResourcesInner privateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The PrivateEndpointConnectionsInner object to access its operations.
     */
    private PrivateEndpointConnectionsInner privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsInner object to access its operations.
     * @return the PrivateEndpointConnectionsInner object.
     */
    public PrivateEndpointConnectionsInner privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkHubsInner object to access its operations.
     */
    private PrivateLinkHubsInner privateLinkHubs;

    /**
     * Gets the PrivateLinkHubsInner object to access its operations.
     * @return the PrivateLinkHubsInner object.
     */
    public PrivateLinkHubsInner privateLinkHubs() {
        return this.privateLinkHubs;
    }

    /**
     * The PrivateEndpointConnectionsPrivateLinkHubsInner object to access its operations.
     */
    private PrivateEndpointConnectionsPrivateLinkHubsInner privateEndpointConnectionsPrivateLinkHubs;

    /**
     * Gets the PrivateEndpointConnectionsPrivateLinkHubsInner object to access its operations.
     * @return the PrivateEndpointConnectionsPrivateLinkHubsInner object.
     */
    public PrivateEndpointConnectionsPrivateLinkHubsInner privateEndpointConnectionsPrivateLinkHubs() {
        return this.privateEndpointConnectionsPrivateLinkHubs;
    }

    /**
     * The WorkspaceManagedSqlServerBlobAuditingPoliciesInner object to access its operations.
     */
    private WorkspaceManagedSqlServerBlobAuditingPoliciesInner workspaceManagedSqlServerBlobAuditingPolicies;

    /**
     * Gets the WorkspaceManagedSqlServerBlobAuditingPoliciesInner object to access its operations.
     * @return the WorkspaceManagedSqlServerBlobAuditingPoliciesInner object.
     */
    public WorkspaceManagedSqlServerBlobAuditingPoliciesInner workspaceManagedSqlServerBlobAuditingPolicies() {
        return this.workspaceManagedSqlServerBlobAuditingPolicies;
    }

    /**
     * The WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner object to access its operations.
     */
    private WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner workspaceManagedSqlServerExtendedBlobAuditingPolicies;

    /**
     * Gets the WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner object to access its operations.
     * @return the WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner object.
     */
    public WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner workspaceManagedSqlServerExtendedBlobAuditingPolicies() {
        return this.workspaceManagedSqlServerExtendedBlobAuditingPolicies;
    }

    /**
     * The WorkspaceManagedSqlServerSecurityAlertPolicysInner object to access its operations.
     */
    private WorkspaceManagedSqlServerSecurityAlertPolicysInner workspaceManagedSqlServerSecurityAlertPolicys;

    /**
     * Gets the WorkspaceManagedSqlServerSecurityAlertPolicysInner object to access its operations.
     * @return the WorkspaceManagedSqlServerSecurityAlertPolicysInner object.
     */
    public WorkspaceManagedSqlServerSecurityAlertPolicysInner workspaceManagedSqlServerSecurityAlertPolicys() {
        return this.workspaceManagedSqlServerSecurityAlertPolicys;
    }

    /**
     * The WorkspaceManagedSqlServerVulnerabilityAssessmentsInner object to access its operations.
     */
    private WorkspaceManagedSqlServerVulnerabilityAssessmentsInner workspaceManagedSqlServerVulnerabilityAssessments;

    /**
     * Gets the WorkspaceManagedSqlServerVulnerabilityAssessmentsInner object to access its operations.
     * @return the WorkspaceManagedSqlServerVulnerabilityAssessmentsInner object.
     */
    public WorkspaceManagedSqlServerVulnerabilityAssessmentsInner workspaceManagedSqlServerVulnerabilityAssessments() {
        return this.workspaceManagedSqlServerVulnerabilityAssessments;
    }

    /**
     * The WorkspaceManagedSqlServerUsagesInner object to access its operations.
     */
    private WorkspaceManagedSqlServerUsagesInner workspaceManagedSqlServerUsages;

    /**
     * Gets the WorkspaceManagedSqlServerUsagesInner object to access its operations.
     * @return the WorkspaceManagedSqlServerUsagesInner object.
     */
    public WorkspaceManagedSqlServerUsagesInner workspaceManagedSqlServerUsages() {
        return this.workspaceManagedSqlServerUsages;
    }

    /**
     * The WorkspaceManagedSqlServerRecoverableSqlpoolsInner object to access its operations.
     */
    private WorkspaceManagedSqlServerRecoverableSqlpoolsInner workspaceManagedSqlServerRecoverableSqlpools;

    /**
     * Gets the WorkspaceManagedSqlServerRecoverableSqlpoolsInner object to access its operations.
     * @return the WorkspaceManagedSqlServerRecoverableSqlpoolsInner object.
     */
    public WorkspaceManagedSqlServerRecoverableSqlpoolsInner workspaceManagedSqlServerRecoverableSqlpools() {
        return this.workspaceManagedSqlServerRecoverableSqlpools;
    }

    /**
     * The KeysInner object to access its operations.
     */
    private KeysInner keys;

    /**
     * Gets the KeysInner object to access its operations.
     * @return the KeysInner object.
     */
    public KeysInner keys() {
        return this.keys;
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SynapseManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SynapseManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SynapseManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-06-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.bigDataPools = new BigDataPoolsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.ipFirewallRules = new IpFirewallRulesInner(restClient().retrofit(), this);
        this.sqlPools = new SqlPoolsInner(restClient().retrofit(), this);
        this.sqlPoolMetadataSyncConfigs = new SqlPoolMetadataSyncConfigsInner(restClient().retrofit(), this);
        this.sqlPoolOperationResults = new SqlPoolOperationResultsInner(restClient().retrofit(), this);
        this.sqlPoolGeoBackupPolicies = new SqlPoolGeoBackupPoliciesInner(restClient().retrofit(), this);
        this.sqlPoolDataWarehouseUserActivities = new SqlPoolDataWarehouseUserActivitiesInner(restClient().retrofit(), this);
        this.sqlPoolRestorePoints = new SqlPoolRestorePointsInner(restClient().retrofit(), this);
        this.sqlPoolReplicationLinks = new SqlPoolReplicationLinksInner(restClient().retrofit(), this);
        this.sqlPoolTransparentDataEncryptions = new SqlPoolTransparentDataEncryptionsInner(restClient().retrofit(), this);
        this.sqlPoolBlobAuditingPolicies = new SqlPoolBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.sqlPoolOperations = new SqlPoolOperationsInner(restClient().retrofit(), this);
        this.sqlPoolUsages = new SqlPoolUsagesInner(restClient().retrofit(), this);
        this.sqlPoolSensitivityLabels = new SqlPoolSensitivityLabelsInner(restClient().retrofit(), this);
        this.sqlPoolSchemas = new SqlPoolSchemasInner(restClient().retrofit(), this);
        this.sqlPoolTables = new SqlPoolTablesInner(restClient().retrofit(), this);
        this.sqlPoolTableColumns = new SqlPoolTableColumnsInner(restClient().retrofit(), this);
        this.sqlPoolConnectionPolicies = new SqlPoolConnectionPoliciesInner(restClient().retrofit(), this);
        this.sqlPoolVulnerabilityAssessments = new SqlPoolVulnerabilityAssessmentsInner(restClient().retrofit(), this);
        this.sqlPoolVulnerabilityAssessmentScans = new SqlPoolVulnerabilityAssessmentScansInner(restClient().retrofit(), this);
        this.sqlPoolSecurityAlertPolicies = new SqlPoolSecurityAlertPoliciesInner(restClient().retrofit(), this);
        this.sqlPoolVulnerabilityAssessmentRuleBaselines = new SqlPoolVulnerabilityAssessmentRuleBaselinesInner(restClient().retrofit(), this);
        this.extendedSqlPoolBlobAuditingPolicies = new ExtendedSqlPoolBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.dataMaskingPolicies = new DataMaskingPoliciesInner(restClient().retrofit(), this);
        this.dataMaskingRules = new DataMaskingRulesInner(restClient().retrofit(), this);
        this.sqlPoolColumns = new SqlPoolColumnsInner(restClient().retrofit(), this);
        this.sqlPoolWorkloadGroups = new SqlPoolWorkloadGroupsInner(restClient().retrofit(), this);
        this.sqlPoolWorkloadClassifiers = new SqlPoolWorkloadClassifiersInner(restClient().retrofit(), this);
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.workspaceAadAdmins = new WorkspaceAadAdminsInner(restClient().retrofit(), this);
        this.workspaceSqlAadAdmins = new WorkspaceSqlAadAdminsInner(restClient().retrofit(), this);
        this.workspaceManagedIdentitySqlControlSettings = new WorkspaceManagedIdentitySqlControlSettingsInner(restClient().retrofit(), this);
        this.restorableDroppedSqlPools = new RestorableDroppedSqlPoolsInner(restClient().retrofit(), this);
        this.integrationRuntimes = new IntegrationRuntimesInner(restClient().retrofit(), this);
        this.integrationRuntimeNodeIpAddressOperations = new IntegrationRuntimeNodeIpAddressOperationsInner(restClient().retrofit(), this);
        this.integrationRuntimeObjectMetadatas = new IntegrationRuntimeObjectMetadatasInner(restClient().retrofit(), this);
        this.integrationRuntimeNodes = new IntegrationRuntimeNodesInner(restClient().retrofit(), this);
        this.integrationRuntimeCredentials = new IntegrationRuntimeCredentialsInner(restClient().retrofit(), this);
        this.integrationRuntimeConnectionInfos = new IntegrationRuntimeConnectionInfosInner(restClient().retrofit(), this);
        this.integrationRuntimeAuthKeysOperations = new IntegrationRuntimeAuthKeysOperationsInner(restClient().retrofit(), this);
        this.integrationRuntimeMonitoringDatas = new IntegrationRuntimeMonitoringDatasInner(restClient().retrofit(), this);
        this.integrationRuntimeStatusOperations = new IntegrationRuntimeStatusOperationsInner(restClient().retrofit(), this);
        this.privateLinkResources = new PrivateLinkResourcesInner(restClient().retrofit(), this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsInner(restClient().retrofit(), this);
        this.privateLinkHubs = new PrivateLinkHubsInner(restClient().retrofit(), this);
        this.privateEndpointConnectionsPrivateLinkHubs = new PrivateEndpointConnectionsPrivateLinkHubsInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerBlobAuditingPolicies = new WorkspaceManagedSqlServerBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerExtendedBlobAuditingPolicies = new WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerSecurityAlertPolicys = new WorkspaceManagedSqlServerSecurityAlertPolicysInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerVulnerabilityAssessments = new WorkspaceManagedSqlServerVulnerabilityAssessmentsInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerUsages = new WorkspaceManagedSqlServerUsagesInner(restClient().retrofit(), this);
        this.workspaceManagedSqlServerRecoverableSqlpools = new WorkspaceManagedSqlServerRecoverableSqlpoolsInner(restClient().retrofit(), this);
        this.keys = new KeysInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "SynapseManagementClient", "2019-06-01-preview");
    }
}