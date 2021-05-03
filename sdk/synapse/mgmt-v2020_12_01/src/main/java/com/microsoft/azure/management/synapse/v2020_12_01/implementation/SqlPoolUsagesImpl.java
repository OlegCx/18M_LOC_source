/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolUsages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolUsage;

class SqlPoolUsagesImpl extends WrapperImpl<SqlPoolUsagesInner> implements SqlPoolUsages {
    private final SynapseManager manager;

    SqlPoolUsagesImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolUsages());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SqlPoolUsageImpl wrapModel(SqlPoolUsageInner inner) {
        return  new SqlPoolUsageImpl(inner, manager());
    }

    @Override
    public Observable<SqlPoolUsage> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolUsagesInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<SqlPoolUsageInner>, Iterable<SqlPoolUsageInner>>() {
            @Override
            public Iterable<SqlPoolUsageInner> call(Page<SqlPoolUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SqlPoolUsageInner, SqlPoolUsage>() {
            @Override
            public SqlPoolUsage call(SqlPoolUsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}