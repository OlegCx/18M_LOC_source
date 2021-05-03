// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.databoxedge {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.databoxedge;
    exports com.azure.resourcemanager.databoxedge.fluent;
    exports com.azure.resourcemanager.databoxedge.fluent.models;
    exports com.azure.resourcemanager.databoxedge.models;

    opens com.azure.resourcemanager.databoxedge.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.databoxedge.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}