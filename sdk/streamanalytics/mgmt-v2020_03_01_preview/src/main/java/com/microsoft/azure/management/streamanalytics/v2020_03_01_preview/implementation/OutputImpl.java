/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Output;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.OutputDataSource;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Serialization;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Diagnostics;

class OutputImpl extends CreatableUpdatableImpl<Output, OutputInner, OutputImpl> implements Output, Output.Definition, Output.Update {
    private final StreamAnalyticsManager manager;
    private String resourceGroupName;
    private String jobName;
    private String outputName;
    private String cifMatch;
    private String cifNoneMatch;
    private String uifMatch;

    OutputImpl(String name, StreamAnalyticsManager manager) {
        super(name, new OutputInner());
        this.manager = manager;
        // Set resource name
        this.outputName = name;
        //
    }

    OutputImpl(OutputInner inner, StreamAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.outputName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "streamingjobs");
        this.outputName = IdParsingUtils.getValueFromIdByName(inner.id(), "outputs");
        //
    }

    @Override
    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Output> createResourceAsync() {
        OutputsInner client = this.manager().inner().outputs();
        return client.createOrReplaceAsync(this.resourceGroupName, this.jobName, this.outputName, this.inner(), this.cifMatch, this.cifNoneMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Output> updateResourceAsync() {
        OutputsInner client = this.manager().inner().outputs();
        return client.updateAsync(this.resourceGroupName, this.jobName, this.outputName, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<OutputInner> getInnerAsync() {
        OutputsInner client = this.manager().inner().outputs();
        return client.getAsync(this.resourceGroupName, this.jobName, this.outputName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public OutputDataSource datasource() {
        return this.inner().datasource();
    }

    @Override
    public Diagnostics diagnostics() {
        return this.inner().diagnostics();
    }

    @Override
    public String etag() {
        return this.inner().etag();
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
    public Serialization serialization() {
        return this.inner().serialization();
    }

    @Override
    public Double sizeWindow() {
        return this.inner().sizeWindow();
    }

    @Override
    public String timeWindow() {
        return this.inner().timeWindow();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public OutputImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    @Override
    public OutputImpl withIfNoneMatch(String ifNoneMatch) {
        this.cifNoneMatch = ifNoneMatch;
        return this;
    }

    @Override
    public OutputImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public OutputImpl withDatasource(OutputDataSource datasource) {
        this.inner().withDatasource(datasource);
        return this;
    }

    @Override
    public OutputImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public OutputImpl withSerialization(Serialization serialization) {
        this.inner().withSerialization(serialization);
        return this;
    }

    @Override
    public OutputImpl withSizeWindow(Double sizeWindow) {
        this.inner().withSizeWindow(sizeWindow);
        return this;
    }

    @Override
    public OutputImpl withTimeWindow(String timeWindow) {
        this.inner().withTimeWindow(timeWindow);
        return this;
    }

}