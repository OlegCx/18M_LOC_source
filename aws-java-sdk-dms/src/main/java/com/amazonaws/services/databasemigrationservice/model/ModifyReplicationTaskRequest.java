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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     */
    private String replicationTaskIdentifier;
    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the
     * path with <code>file://</code>. For example, <code>--table-mappings file://mappingfile.json</code>. When working
     * with the DMS API, provide the JSON as the parameter value.
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata settings.
     * </p>
     */
    private String replicationTaskSettings;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     */
    private java.util.Date cdcStartTime;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     * </p>
     * </note>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     */
    private String cdcStopPosition;
    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private String taskData;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-255 alphanumeric characters or hyphens.
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
     */

    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * 
     * @return The replication task identifier.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1-255 alphanumeric characters or hyphens.
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
     */

    public String getReplicationTaskIdentifier() {
        return this.replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-255 alphanumeric characters or hyphens.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @return The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *         <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationTaskRequest withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public void setMigrationType(MigrationTypeValue migrationType) {
        withMigrationType(migrationType);
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationTaskRequest withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the
     * path with <code>file://</code>. For example, <code>--table-mappings file://mappingfile.json</code>. When working
     * with the DMS API, provide the JSON as the parameter value.
     * </p>
     * 
     * @param tableMappings
     *        When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings.
     *        Precede the path with <code>file://</code>. For example,
     *        <code>--table-mappings file://mappingfile.json</code>. When working with the DMS API, provide the JSON as
     *        the parameter value.
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the
     * path with <code>file://</code>. For example, <code>--table-mappings file://mappingfile.json</code>. When working
     * with the DMS API, provide the JSON as the parameter value.
     * </p>
     * 
     * @return When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings.
     *         Precede the path with <code>file://</code>. For example,
     *         <code>--table-mappings file://mappingfile.json</code>. When working with the DMS API, provide the JSON as
     *         the parameter value.
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the
     * path with <code>file://</code>. For example, <code>--table-mappings file://mappingfile.json</code>. When working
     * with the DMS API, provide the JSON as the parameter value.
     * </p>
     * 
     * @param tableMappings
     *        When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings.
     *        Precede the path with <code>file://</code>. For example,
     *        <code>--table-mappings file://mappingfile.json</code>. When working with the DMS API, provide the JSON as
     *        the parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata settings.
     * </p>
     * 
     * @param replicationTaskSettings
     *        JSON file that contains settings for the task, such as task metadata settings.
     */

    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata settings.
     * </p>
     * 
     * @return JSON file that contains settings for the task, such as task metadata settings.
     */

    public String getReplicationTaskSettings() {
        return this.replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata settings.
     * </p>
     * 
     * @param replicationTaskSettings
     *        JSON file that contains settings for the task, such as task metadata settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withReplicationTaskSettings(String replicationTaskSettings) {
        setReplicationTaskSettings(replicationTaskSettings);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *         CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
     *         <p>
     *         Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     * </p>
     * </note>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     *        </p>
     *        <note>
     *        <p>
     *        When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *        already be created and associated with the source endpoint. You can verify this by setting the
     *        <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *        >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     *        </p>
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     * </p>
     * </note>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *         CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
     *         <p>
     *         The value can be in date, checkpoint, or LSN/SCN format.
     *         </p>
     *         <p>
     *         Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *         </p>
     *         <p>
     *         Checkpoint Example: --cdc-start-position
     *         "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *         </p>
     *         <p>
     *         LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     *         </p>
     *         <note>
     *         <p>
     *         When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *         already be created and associated with the source endpoint. You can verify this by setting the
     *         <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *         >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     *         </p>
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     * </p>
     * </note>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     *        </p>
     *        <note>
     *        <p>
     *        When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *        already be created and associated with the source endpoint. You can verify this by setting the
     *        <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *        >Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to stop. The value can be either server
     *         time or commit time.</p>
     *         <p>
     *         Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *         </p>
     *         <p>
     *         Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
        setCdcStopPosition(cdcStopPosition);
        return this;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *        Data for Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return Supplemental information that the task requires to migrate the data for certain source and target
     *         endpoints. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *         Data for Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public String getTaskData() {
        return this.taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *        Data for Task Settings</a> in the <i>AWS Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withTaskData(String taskData) {
        setTaskData(taskData);
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: ").append(getReplicationTaskIdentifier()).append(",");
        if (getMigrationType() != null)
            sb.append("MigrationType: ").append(getMigrationType()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: ").append(getReplicationTaskSettings()).append(",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime()).append(",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition()).append(",");
        if (getTaskData() != null)
            sb.append("TaskData: ").append(getTaskData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationTaskRequest == false)
            return false;
        ModifyReplicationTaskRequest other = (ModifyReplicationTaskRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskIdentifier() == null ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getMigrationType() == null ^ this.getMigrationType() == null)
            return false;
        if (other.getMigrationType() != null && other.getMigrationType().equals(this.getMigrationType()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getReplicationTaskSettings() == null ^ this.getReplicationTaskSettings() == null)
            return false;
        if (other.getReplicationTaskSettings() != null && other.getReplicationTaskSettings().equals(this.getReplicationTaskSettings()) == false)
            return false;
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
            return false;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskSettings() == null) ? 0 : getReplicationTaskSettings().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationTaskRequest clone() {
        return (ModifyReplicationTaskRequest) super.clone();
    }

}
