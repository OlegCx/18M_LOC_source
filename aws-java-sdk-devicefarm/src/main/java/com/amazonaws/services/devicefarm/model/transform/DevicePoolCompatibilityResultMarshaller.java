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
 * DevicePoolCompatibilityResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DevicePoolCompatibilityResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> DEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("device").build();
    private static final MarshallingInfo<Boolean> COMPATIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compatible").build();
    private static final MarshallingInfo<List> INCOMPATIBILITYMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incompatibilityMessages").build();

    private static final DevicePoolCompatibilityResultMarshaller instance = new DevicePoolCompatibilityResultMarshaller();

    public static DevicePoolCompatibilityResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DevicePoolCompatibilityResult devicePoolCompatibilityResult, ProtocolMarshaller protocolMarshaller) {

        if (devicePoolCompatibilityResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(devicePoolCompatibilityResult.getDevice(), DEVICE_BINDING);
            protocolMarshaller.marshall(devicePoolCompatibilityResult.getCompatible(), COMPATIBLE_BINDING);
            protocolMarshaller.marshall(devicePoolCompatibilityResult.getIncompatibilityMessages(), INCOMPATIBILITYMESSAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
