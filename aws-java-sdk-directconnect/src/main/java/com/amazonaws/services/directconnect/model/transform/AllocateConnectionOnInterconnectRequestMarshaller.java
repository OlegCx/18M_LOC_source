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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AllocateConnectionOnInterconnectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AllocateConnectionOnInterconnectRequestMarshaller {

    private static final MarshallingInfo<String> BANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bandwidth").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionName").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> INTERCONNECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interconnectId").build();
    private static final MarshallingInfo<Integer> VLAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vlan").build();

    private static final AllocateConnectionOnInterconnectRequestMarshaller instance = new AllocateConnectionOnInterconnectRequestMarshaller();

    public static AllocateConnectionOnInterconnectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest, ProtocolMarshaller protocolMarshaller) {

        if (allocateConnectionOnInterconnectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(allocateConnectionOnInterconnectRequest.getBandwidth(), BANDWIDTH_BINDING);
            protocolMarshaller.marshall(allocateConnectionOnInterconnectRequest.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(allocateConnectionOnInterconnectRequest.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(allocateConnectionOnInterconnectRequest.getInterconnectId(), INTERCONNECTID_BINDING);
            protocolMarshaller.marshall(allocateConnectionOnInterconnectRequest.getVlan(), VLAN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
