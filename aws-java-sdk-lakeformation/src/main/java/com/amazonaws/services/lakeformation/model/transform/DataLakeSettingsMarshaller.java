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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataLakeSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataLakeSettingsMarshaller {

    private static final MarshallingInfo<List> DATALAKEADMINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLakeAdmins").build();
    private static final MarshallingInfo<List> CREATEDATABASEDEFAULTPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDatabaseDefaultPermissions").build();
    private static final MarshallingInfo<List> CREATETABLEDEFAULTPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTableDefaultPermissions").build();
    private static final MarshallingInfo<List> TRUSTEDRESOURCEOWNERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustedResourceOwners").build();

    private static final DataLakeSettingsMarshaller instance = new DataLakeSettingsMarshaller();

    public static DataLakeSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataLakeSettings dataLakeSettings, ProtocolMarshaller protocolMarshaller) {

        if (dataLakeSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataLakeSettings.getDataLakeAdmins(), DATALAKEADMINS_BINDING);
            protocolMarshaller.marshall(dataLakeSettings.getCreateDatabaseDefaultPermissions(), CREATEDATABASEDEFAULTPERMISSIONS_BINDING);
            protocolMarshaller.marshall(dataLakeSettings.getCreateTableDefaultPermissions(), CREATETABLEDEFAULTPERMISSIONS_BINDING);
            protocolMarshaller.marshall(dataLakeSettings.getTrustedResourceOwners(), TRUSTEDRESOURCEOWNERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
