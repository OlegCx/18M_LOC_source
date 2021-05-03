/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.TableSchemaSqlPoolWorkspaceSqlPoolColumnModel;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ColumnDataType;

class TableSchemaSqlPoolWorkspaceSqlPoolColumnModelImpl extends IndexableRefreshableWrapperImpl<TableSchemaSqlPoolWorkspaceSqlPoolColumnModel, SqlPoolColumnInner> implements TableSchemaSqlPoolWorkspaceSqlPoolColumnModel {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;
    private String schemaName;
    private String tableName;
    private String columnName;

    TableSchemaSqlPoolWorkspaceSqlPoolColumnModelImpl(SqlPoolColumnInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlPools");
        this.schemaName = IdParsingUtils.getValueFromIdByName(inner.id(), "schemas");
        this.tableName = IdParsingUtils.getValueFromIdByName(inner.id(), "tables");
        this.columnName = IdParsingUtils.getValueFromIdByName(inner.id(), "columns");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<SqlPoolColumnInner> getInnerAsync() {
        SqlPoolColumnsInner client = this.manager().inner().sqlPoolColumns();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.schemaName, this.tableName, this.columnName);
    }



    @Override
    public ColumnDataType columnType() {
        return this.inner().columnType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}