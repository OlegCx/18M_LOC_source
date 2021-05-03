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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying a global database cluster. This value
     * is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newGlobalClusterIdentifier;
    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be
     * deleted when deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to
     * the default parameter groups for the new version. Apply any custom parameter groups after completing the upgrade.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global database cluster.
     *        </p>
     *        </li>
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing global database cluster.
     *         </p>
     *         </li>
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global database cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying a global database cluster. This value
     * is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newGlobalClusterIdentifier
     *        The new cluster identifier for the global database cluster when modifying a global database cluster. This
     *        value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     */

    public void setNewGlobalClusterIdentifier(String newGlobalClusterIdentifier) {
        this.newGlobalClusterIdentifier = newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying a global database cluster. This value
     * is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @return The new cluster identifier for the global database cluster when modifying a global database cluster. This
     *         value is stored as a lowercase string. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     */

    public String getNewGlobalClusterIdentifier() {
        return this.newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying a global database cluster. This value
     * is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newGlobalClusterIdentifier
     *        The new cluster identifier for the global database cluster when modifying a global database cluster. This
     *        value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withNewGlobalClusterIdentifier(String newGlobalClusterIdentifier) {
        setNewGlobalClusterIdentifier(newGlobalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the global database cluster has deletion protection enabled. The global database cluster
     *        can't be deleted when deletion protection is enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @return Indicates if the global database cluster has deletion protection enabled. The global database cluster
     *         can't be deleted when deletion protection is enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the global database cluster has deletion protection enabled. The global database cluster
     *        can't be deleted when deletion protection is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @return Indicates if the global database cluster has deletion protection enabled. The global database cluster
     *         can't be deleted when deletion protection is enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * 
     * @return The version number of the database engine to which you want to upgrade. Changing this parameter results
     *         in an outage. The change is applied during the next maintenance window unless
     *         <code>ApplyImmediately</code> is enabled.</p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *         use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *         Aurora), use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *         command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query '*[]|[?SupportsGlobalDatabases == `true`].[EngineVersion]'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to
     * the default parameter groups for the new version. Apply any custom parameter groups after completing the upgrade.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     *        </p>
     *        <p>
     *        If you upgrade the major version of a global database, the cluster and DB instance parameter groups are
     *        set to the default parameter groups for the new version. Apply any custom parameter groups after
     *        completing the upgrade.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to
     * the default parameter groups for the new version. Apply any custom parameter groups after completing the upgrade.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     *         <p>
     *         If you upgrade the major version of a global database, the cluster and DB instance parameter groups are
     *         set to the default parameter groups for the new version. Apply any custom parameter groups after
     *         completing the upgrade.
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to
     * the default parameter groups for the new version. Apply any custom parameter groups after completing the upgrade.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     *        </p>
     *        <p>
     *        If you upgrade the major version of a global database, the cluster and DB instance parameter groups are
     *        set to the default parameter groups for the new version. Apply any custom parameter groups after
     *        completing the upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to
     * the default parameter groups for the new version. Apply any custom parameter groups after completing the upgrade.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     *         <p>
     *         If you upgrade the major version of a global database, the cluster and DB instance parameter groups are
     *         set to the default parameter groups for the new version. Apply any custom parameter groups after
     *         completing the upgrade.
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getNewGlobalClusterIdentifier() != null)
            sb.append("NewGlobalClusterIdentifier: ").append(getNewGlobalClusterIdentifier()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyGlobalClusterRequest == false)
            return false;
        ModifyGlobalClusterRequest other = (ModifyGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getNewGlobalClusterIdentifier() == null ^ this.getNewGlobalClusterIdentifier() == null)
            return false;
        if (other.getNewGlobalClusterIdentifier() != null && other.getNewGlobalClusterIdentifier().equals(this.getNewGlobalClusterIdentifier()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNewGlobalClusterIdentifier() == null) ? 0 : getNewGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        return hashCode;
    }

    @Override
    public ModifyGlobalClusterRequest clone() {
        return (ModifyGlobalClusterRequest) super.clone();
    }

}
