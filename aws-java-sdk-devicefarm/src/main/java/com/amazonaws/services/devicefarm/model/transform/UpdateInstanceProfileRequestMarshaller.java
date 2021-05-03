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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateInstanceProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateInstanceProfileRequestMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> PACKAGECLEANUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageCleanup").build();
    private static final MarshallingInfo<List> EXCLUDEAPPPACKAGESFROMCLEANUP_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("excludeAppPackagesFromCleanup").build();
    private static final MarshallingInfo<Boolean> REBOOTAFTERUSE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rebootAfterUse").build();

    private static final UpdateInstanceProfileRequestMarshaller instance = new UpdateInstanceProfileRequestMarshaller();

    public static UpdateInstanceProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateInstanceProfileRequest updateInstanceProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateInstanceProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateInstanceProfileRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(updateInstanceProfileRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateInstanceProfileRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateInstanceProfileRequest.getPackageCleanup(), PACKAGECLEANUP_BINDING);
            protocolMarshaller.marshall(updateInstanceProfileRequest.getExcludeAppPackagesFromCleanup(), EXCLUDEAPPPACKAGESFROMCLEANUP_BINDING);
            protocolMarshaller.marshall(updateInstanceProfileRequest.getRebootAfterUse(), REBOOTAFTERUSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
