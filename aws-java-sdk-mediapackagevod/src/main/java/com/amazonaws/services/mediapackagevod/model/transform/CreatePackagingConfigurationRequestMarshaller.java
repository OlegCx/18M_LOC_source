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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagevod.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePackagingConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePackagingConfigurationRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CMAFPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cmafPackage").build();
    private static final MarshallingInfo<StructuredPojo> DASHPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashPackage").build();
    private static final MarshallingInfo<StructuredPojo> HLSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsPackage").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> MSSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mssPackage").build();
    private static final MarshallingInfo<String> PACKAGINGGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packagingGroupId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreatePackagingConfigurationRequestMarshaller instance = new CreatePackagingConfigurationRequestMarshaller();

    public static CreatePackagingConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePackagingConfigurationRequest createPackagingConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPackagingConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getCmafPackage(), CMAFPACKAGE_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getDashPackage(), DASHPACKAGE_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getHlsPackage(), HLSPACKAGE_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getMssPackage(), MSSPACKAGE_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getPackagingGroupId(), PACKAGINGGROUPID_BINDING);
            protocolMarshaller.marshall(createPackagingConfigurationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
