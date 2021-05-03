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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceiSCSIAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceiSCSIAttributesMarshaller {

    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetARN").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceId").build();
    private static final MarshallingInfo<Integer> NETWORKINTERFACEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfacePort").build();
    private static final MarshallingInfo<Boolean> CHAPENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChapEnabled").build();

    private static final DeviceiSCSIAttributesMarshaller instance = new DeviceiSCSIAttributesMarshaller();

    public static DeviceiSCSIAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceiSCSIAttributes deviceiSCSIAttributes, ProtocolMarshaller protocolMarshaller) {

        if (deviceiSCSIAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceiSCSIAttributes.getTargetARN(), TARGETARN_BINDING);
            protocolMarshaller.marshall(deviceiSCSIAttributes.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(deviceiSCSIAttributes.getNetworkInterfacePort(), NETWORKINTERFACEPORT_BINDING);
            protocolMarshaller.marshall(deviceiSCSIAttributes.getChapEnabled(), CHAPENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
