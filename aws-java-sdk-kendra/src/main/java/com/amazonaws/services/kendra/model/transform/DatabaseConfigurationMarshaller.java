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
 * DatabaseConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatabaseConfigurationMarshaller {

    private static final MarshallingInfo<String> DATABASEENGINETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseEngineType").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> COLUMNCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ACLCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AclConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SQLCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlConfiguration").build();

    private static final DatabaseConfigurationMarshaller instance = new DatabaseConfigurationMarshaller();

    public static DatabaseConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatabaseConfiguration databaseConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (databaseConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(databaseConfiguration.getDatabaseEngineType(), DATABASEENGINETYPE_BINDING);
            protocolMarshaller.marshall(databaseConfiguration.getConnectionConfiguration(), CONNECTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(databaseConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(databaseConfiguration.getColumnConfiguration(), COLUMNCONFIGURATION_BINDING);
            protocolMarshaller.marshall(databaseConfiguration.getAclConfiguration(), ACLCONFIGURATION_BINDING);
            protocolMarshaller.marshall(databaseConfiguration.getSqlConfiguration(), SQLCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
