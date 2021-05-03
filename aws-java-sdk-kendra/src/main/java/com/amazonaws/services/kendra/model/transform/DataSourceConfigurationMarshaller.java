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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataSourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataSourceConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Configuration").build();
    private static final MarshallingInfo<StructuredPojo> SHAREPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharePointConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATABASECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SalesforceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ONEDRIVECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OneDriveConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SERVICENOWCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNowConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CONFLUENCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfluenceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> GOOGLEDRIVECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GoogleDriveConfiguration").build();

    private static final DataSourceConfigurationMarshaller instance = new DataSourceConfigurationMarshaller();

    public static DataSourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataSourceConfiguration dataSourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dataSourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataSourceConfiguration.getS3Configuration(), S3CONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getSharePointConfiguration(), SHAREPOINTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getDatabaseConfiguration(), DATABASECONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getSalesforceConfiguration(), SALESFORCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getOneDriveConfiguration(), ONEDRIVECONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getServiceNowConfiguration(), SERVICENOWCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getConfluenceConfiguration(), CONFLUENCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataSourceConfiguration.getGoogleDriveConfiguration(), GOOGLEDRIVECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
