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
 * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBEngineVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBEngineVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * The description of the database engine.
     * </p>
     */
    private String dBEngineDescription;
    /**
     * <p>
     * The description of the database engine version.
     * </p>
     */
    private String dBEngineVersionDescription;
    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     */
    private CharacterSet defaultCharacterSet;
    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CharacterSet> supportedCharacterSets;
    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CharacterSet> supportedNcharCharacterSets;
    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpgradeTarget> validUpgradeTarget;
    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Timezone> supportedTimezones;
    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportableLogTypes;
    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     */
    private Boolean supportsLogExportsToCloudwatchLogs;
    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     */
    private Boolean supportsReadReplica;
    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedEngineModes;
    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedFeatureNames;
    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     */
    private Boolean supportsParallelQuery;
    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     */
    private Boolean supportsGlobalDatabases;

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @return The name of the database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @return The version number of the database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @return The name of the DB parameter group family for the database engine.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     */

    public void setDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @return The description of the database engine.
     */

    public String getDBEngineDescription() {
        return this.dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBEngineDescription(String dBEngineDescription) {
        setDBEngineDescription(dBEngineDescription);
        return this;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     */

    public void setDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @return The description of the database engine version.
     */

    public String getDBEngineVersionDescription() {
        return this.dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBEngineVersionDescription(String dBEngineVersionDescription) {
        setDBEngineVersionDescription(dBEngineVersionDescription);
        return this;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API isn't specified.
     */

    public void setDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        this.defaultCharacterSet = defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @return The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *         parameter of the CreateDBInstance API isn't specified.
     */

    public CharacterSet getDefaultCharacterSet() {
        return this.defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API isn't specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        setDefaultCharacterSet(defaultCharacterSet);
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @return A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *         the <code>CreateDBInstance</code> operation.
     */

    public java.util.List<CharacterSet> getSupportedCharacterSets() {
        if (supportedCharacterSets == null) {
            supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>();
        }
        return supportedCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     */

    public void setSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        if (supportedCharacterSets == null) {
            this.supportedCharacterSets = null;
            return;
        }

        this.supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedCharacterSets(java.util.Collection)} or
     * {@link #withSupportedCharacterSets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedCharacterSets(CharacterSet... supportedCharacterSets) {
        if (this.supportedCharacterSets == null) {
            setSupportedCharacterSets(new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets.length));
        }
        for (CharacterSet ele : supportedCharacterSets) {
            this.supportedCharacterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        setSupportedCharacterSets(supportedCharacterSets);
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @return A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *         parameter of the <code>CreateDBInstance</code> operation.
     */

    public java.util.List<CharacterSet> getSupportedNcharCharacterSets() {
        if (supportedNcharCharacterSets == null) {
            supportedNcharCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>();
        }
        return supportedNcharCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     */

    public void setSupportedNcharCharacterSets(java.util.Collection<CharacterSet> supportedNcharCharacterSets) {
        if (supportedNcharCharacterSets == null) {
            this.supportedNcharCharacterSets = null;
            return;
        }

        this.supportedNcharCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedNcharCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedNcharCharacterSets(java.util.Collection)} or
     * {@link #withSupportedNcharCharacterSets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedNcharCharacterSets(CharacterSet... supportedNcharCharacterSets) {
        if (this.supportedNcharCharacterSets == null) {
            setSupportedNcharCharacterSets(new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedNcharCharacterSets.length));
        }
        for (CharacterSet ele : supportedNcharCharacterSets) {
            this.supportedNcharCharacterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedNcharCharacterSets(java.util.Collection<CharacterSet> supportedNcharCharacterSets) {
        setSupportedNcharCharacterSets(supportedNcharCharacterSets);
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @return A list of engine versions that this database engine version can be upgraded to.
     */

    public java.util.List<UpgradeTarget> getValidUpgradeTarget() {
        if (validUpgradeTarget == null) {
            validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>();
        }
        return validUpgradeTarget;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     */

    public void setValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        if (validUpgradeTarget == null) {
            this.validUpgradeTarget = null;
            return;
        }

        this.validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget);
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidUpgradeTarget(java.util.Collection)} or {@link #withValidUpgradeTarget(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withValidUpgradeTarget(UpgradeTarget... validUpgradeTarget) {
        if (this.validUpgradeTarget == null) {
            setValidUpgradeTarget(new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget.length));
        }
        for (UpgradeTarget ele : validUpgradeTarget) {
            this.validUpgradeTarget.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        setValidUpgradeTarget(validUpgradeTarget);
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @return A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *         <code>CreateDBInstance</code> action.
     */

    public java.util.List<Timezone> getSupportedTimezones() {
        if (supportedTimezones == null) {
            supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>();
        }
        return supportedTimezones;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     */

    public void setSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        if (supportedTimezones == null) {
            this.supportedTimezones = null;
            return;
        }

        this.supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones);
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTimezones(java.util.Collection)} or {@link #withSupportedTimezones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedTimezones(Timezone... supportedTimezones) {
        if (this.supportedTimezones == null) {
            setSupportedTimezones(new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones.length));
        }
        for (Timezone ele : supportedTimezones) {
            this.supportedTimezones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        setSupportedTimezones(supportedTimezones);
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @return The types of logs that the database engine has available for export to CloudWatch Logs.
     */

    public java.util.List<String> getExportableLogTypes() {
        if (exportableLogTypes == null) {
            exportableLogTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportableLogTypes;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     */

    public void setExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        if (exportableLogTypes == null) {
            this.exportableLogTypes = null;
            return;
        }

        this.exportableLogTypes = new com.amazonaws.internal.SdkInternalList<String>(exportableLogTypes);
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportableLogTypes(java.util.Collection)} or {@link #withExportableLogTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withExportableLogTypes(String... exportableLogTypes) {
        if (this.exportableLogTypes == null) {
            setExportableLogTypes(new com.amazonaws.internal.SdkInternalList<String>(exportableLogTypes.length));
        }
        for (String ele : exportableLogTypes) {
            this.exportableLogTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        setExportableLogTypes(exportableLogTypes);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        ExportableLogTypes to CloudWatch Logs.
     */

    public void setSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        this.supportsLogExportsToCloudwatchLogs = supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         ExportableLogTypes to CloudWatch Logs.
     */

    public Boolean getSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        ExportableLogTypes to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        setSupportsLogExportsToCloudwatchLogs(supportsLogExportsToCloudwatchLogs);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         ExportableLogTypes to CloudWatch Logs.
     */

    public Boolean isSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @param supportsReadReplica
     *        Indicates whether the database engine version supports read replicas.
     */

    public void setSupportsReadReplica(Boolean supportsReadReplica) {
        this.supportsReadReplica = supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @return Indicates whether the database engine version supports read replicas.
     */

    public Boolean getSupportsReadReplica() {
        return this.supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @param supportsReadReplica
     *        Indicates whether the database engine version supports read replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportsReadReplica(Boolean supportsReadReplica) {
        setSupportsReadReplica(supportsReadReplica);
        return this;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @return Indicates whether the database engine version supports read replicas.
     */

    public Boolean isSupportsReadReplica() {
        return this.supportsReadReplica;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @return A list of the supported DB engine modes.
     */

    public java.util.List<String> getSupportedEngineModes() {
        if (supportedEngineModes == null) {
            supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedEngineModes;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     */

    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedEngineModes(java.util.Collection)} or {@link #withSupportedEngineModes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedEngineModes(String... supportedEngineModes) {
        if (this.supportedEngineModes == null) {
            setSupportedEngineModes(new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes.length));
        }
        for (String ele : supportedEngineModes) {
            this.supportedEngineModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of features supported by the DB engine. Supported feature names include the following. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         s3Import
     *         </p>
     *         </li>
     */

    public java.util.List<String> getSupportedFeatureNames() {
        if (supportedFeatureNames == null) {
            supportedFeatureNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedFeatureNames;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine. Supported feature names include the following. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        s3Import
     *        </p>
     *        </li>
     */

    public void setSupportedFeatureNames(java.util.Collection<String> supportedFeatureNames) {
        if (supportedFeatureNames == null) {
            this.supportedFeatureNames = null;
            return;
        }

        this.supportedFeatureNames = new com.amazonaws.internal.SdkInternalList<String>(supportedFeatureNames);
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedFeatureNames(java.util.Collection)} or
     * {@link #withSupportedFeatureNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine. Supported feature names include the following. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        s3Import
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedFeatureNames(String... supportedFeatureNames) {
        if (this.supportedFeatureNames == null) {
            setSupportedFeatureNames(new com.amazonaws.internal.SdkInternalList<String>(supportedFeatureNames.length));
        }
        for (String ele : supportedFeatureNames) {
            this.supportedFeatureNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine. Supported feature names include the following. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        s3Import
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedFeatureNames(java.util.Collection<String> supportedFeatureNames) {
        setSupportedFeatureNames(supportedFeatureNames);
        return this;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @return The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @param supportsParallelQuery
     *        A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public void setSupportsParallelQuery(Boolean supportsParallelQuery) {
        this.supportsParallelQuery = supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public Boolean getSupportsParallelQuery() {
        return this.supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @param supportsParallelQuery
     *        A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportsParallelQuery(Boolean supportsParallelQuery) {
        setSupportsParallelQuery(supportsParallelQuery);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public Boolean isSupportsParallelQuery() {
        return this.supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public void setSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        this.supportsGlobalDatabases = supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public Boolean getSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        setSupportsGlobalDatabases(supportsGlobalDatabases);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public Boolean isSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getDBEngineDescription() != null)
            sb.append("DBEngineDescription: ").append(getDBEngineDescription()).append(",");
        if (getDBEngineVersionDescription() != null)
            sb.append("DBEngineVersionDescription: ").append(getDBEngineVersionDescription()).append(",");
        if (getDefaultCharacterSet() != null)
            sb.append("DefaultCharacterSet: ").append(getDefaultCharacterSet()).append(",");
        if (getSupportedCharacterSets() != null)
            sb.append("SupportedCharacterSets: ").append(getSupportedCharacterSets()).append(",");
        if (getSupportedNcharCharacterSets() != null)
            sb.append("SupportedNcharCharacterSets: ").append(getSupportedNcharCharacterSets()).append(",");
        if (getValidUpgradeTarget() != null)
            sb.append("ValidUpgradeTarget: ").append(getValidUpgradeTarget()).append(",");
        if (getSupportedTimezones() != null)
            sb.append("SupportedTimezones: ").append(getSupportedTimezones()).append(",");
        if (getExportableLogTypes() != null)
            sb.append("ExportableLogTypes: ").append(getExportableLogTypes()).append(",");
        if (getSupportsLogExportsToCloudwatchLogs() != null)
            sb.append("SupportsLogExportsToCloudwatchLogs: ").append(getSupportsLogExportsToCloudwatchLogs()).append(",");
        if (getSupportsReadReplica() != null)
            sb.append("SupportsReadReplica: ").append(getSupportsReadReplica()).append(",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: ").append(getSupportedEngineModes()).append(",");
        if (getSupportedFeatureNames() != null)
            sb.append("SupportedFeatureNames: ").append(getSupportedFeatureNames()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSupportsParallelQuery() != null)
            sb.append("SupportsParallelQuery: ").append(getSupportsParallelQuery()).append(",");
        if (getSupportsGlobalDatabases() != null)
            sb.append("SupportsGlobalDatabases: ").append(getSupportsGlobalDatabases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBEngineVersion == false)
            return false;
        DBEngineVersion other = (DBEngineVersion) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDBEngineDescription() == null ^ this.getDBEngineDescription() == null)
            return false;
        if (other.getDBEngineDescription() != null && other.getDBEngineDescription().equals(this.getDBEngineDescription()) == false)
            return false;
        if (other.getDBEngineVersionDescription() == null ^ this.getDBEngineVersionDescription() == null)
            return false;
        if (other.getDBEngineVersionDescription() != null && other.getDBEngineVersionDescription().equals(this.getDBEngineVersionDescription()) == false)
            return false;
        if (other.getDefaultCharacterSet() == null ^ this.getDefaultCharacterSet() == null)
            return false;
        if (other.getDefaultCharacterSet() != null && other.getDefaultCharacterSet().equals(this.getDefaultCharacterSet()) == false)
            return false;
        if (other.getSupportedCharacterSets() == null ^ this.getSupportedCharacterSets() == null)
            return false;
        if (other.getSupportedCharacterSets() != null && other.getSupportedCharacterSets().equals(this.getSupportedCharacterSets()) == false)
            return false;
        if (other.getSupportedNcharCharacterSets() == null ^ this.getSupportedNcharCharacterSets() == null)
            return false;
        if (other.getSupportedNcharCharacterSets() != null && other.getSupportedNcharCharacterSets().equals(this.getSupportedNcharCharacterSets()) == false)
            return false;
        if (other.getValidUpgradeTarget() == null ^ this.getValidUpgradeTarget() == null)
            return false;
        if (other.getValidUpgradeTarget() != null && other.getValidUpgradeTarget().equals(this.getValidUpgradeTarget()) == false)
            return false;
        if (other.getSupportedTimezones() == null ^ this.getSupportedTimezones() == null)
            return false;
        if (other.getSupportedTimezones() != null && other.getSupportedTimezones().equals(this.getSupportedTimezones()) == false)
            return false;
        if (other.getExportableLogTypes() == null ^ this.getExportableLogTypes() == null)
            return false;
        if (other.getExportableLogTypes() != null && other.getExportableLogTypes().equals(this.getExportableLogTypes()) == false)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() == null ^ this.getSupportsLogExportsToCloudwatchLogs() == null)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() != null
                && other.getSupportsLogExportsToCloudwatchLogs().equals(this.getSupportsLogExportsToCloudwatchLogs()) == false)
            return false;
        if (other.getSupportsReadReplica() == null ^ this.getSupportsReadReplica() == null)
            return false;
        if (other.getSupportsReadReplica() != null && other.getSupportsReadReplica().equals(this.getSupportsReadReplica()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        if (other.getSupportedFeatureNames() == null ^ this.getSupportedFeatureNames() == null)
            return false;
        if (other.getSupportedFeatureNames() != null && other.getSupportedFeatureNames().equals(this.getSupportedFeatureNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSupportsParallelQuery() == null ^ this.getSupportsParallelQuery() == null)
            return false;
        if (other.getSupportsParallelQuery() != null && other.getSupportsParallelQuery().equals(this.getSupportsParallelQuery()) == false)
            return false;
        if (other.getSupportsGlobalDatabases() == null ^ this.getSupportsGlobalDatabases() == null)
            return false;
        if (other.getSupportsGlobalDatabases() != null && other.getSupportsGlobalDatabases().equals(this.getSupportsGlobalDatabases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDBEngineDescription() == null) ? 0 : getDBEngineDescription().hashCode());
        hashCode = prime * hashCode + ((getDBEngineVersionDescription() == null) ? 0 : getDBEngineVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultCharacterSet() == null) ? 0 : getDefaultCharacterSet().hashCode());
        hashCode = prime * hashCode + ((getSupportedCharacterSets() == null) ? 0 : getSupportedCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getSupportedNcharCharacterSets() == null) ? 0 : getSupportedNcharCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getValidUpgradeTarget() == null) ? 0 : getValidUpgradeTarget().hashCode());
        hashCode = prime * hashCode + ((getSupportedTimezones() == null) ? 0 : getSupportedTimezones().hashCode());
        hashCode = prime * hashCode + ((getExportableLogTypes() == null) ? 0 : getExportableLogTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportsLogExportsToCloudwatchLogs() == null) ? 0 : getSupportsLogExportsToCloudwatchLogs().hashCode());
        hashCode = prime * hashCode + ((getSupportsReadReplica() == null) ? 0 : getSupportsReadReplica().hashCode());
        hashCode = prime * hashCode + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        hashCode = prime * hashCode + ((getSupportedFeatureNames() == null) ? 0 : getSupportedFeatureNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSupportsParallelQuery() == null) ? 0 : getSupportsParallelQuery().hashCode());
        hashCode = prime * hashCode + ((getSupportsGlobalDatabases() == null) ? 0 : getSupportsGlobalDatabases().hashCode());
        return hashCode;
    }

    @Override
    public DBEngineVersion clone() {
        try {
            return (DBEngineVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
