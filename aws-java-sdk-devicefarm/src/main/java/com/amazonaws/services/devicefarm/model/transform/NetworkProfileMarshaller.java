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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkProfileMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Long> UPLINKBANDWIDTHBITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkBandwidthBits").build();
    private static final MarshallingInfo<Long> DOWNLINKBANDWIDTHBITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkBandwidthBits").build();
    private static final MarshallingInfo<Long> UPLINKDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uplinkDelayMs").build();
    private static final MarshallingInfo<Long> DOWNLINKDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkDelayMs").build();
    private static final MarshallingInfo<Long> UPLINKJITTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkJitterMs").build();
    private static final MarshallingInfo<Long> DOWNLINKJITTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkJitterMs").build();
    private static final MarshallingInfo<Integer> UPLINKLOSSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkLossPercent").build();
    private static final MarshallingInfo<Integer> DOWNLINKLOSSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkLossPercent").build();

    private static final NetworkProfileMarshaller instance = new NetworkProfileMarshaller();

    public static NetworkProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkProfile networkProfile, ProtocolMarshaller protocolMarshaller) {

        if (networkProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkProfile.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(networkProfile.getName(), NAME_BINDING);
            protocolMarshaller.marshall(networkProfile.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(networkProfile.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(networkProfile.getUplinkBandwidthBits(), UPLINKBANDWIDTHBITS_BINDING);
            protocolMarshaller.marshall(networkProfile.getDownlinkBandwidthBits(), DOWNLINKBANDWIDTHBITS_BINDING);
            protocolMarshaller.marshall(networkProfile.getUplinkDelayMs(), UPLINKDELAYMS_BINDING);
            protocolMarshaller.marshall(networkProfile.getDownlinkDelayMs(), DOWNLINKDELAYMS_BINDING);
            protocolMarshaller.marshall(networkProfile.getUplinkJitterMs(), UPLINKJITTERMS_BINDING);
            protocolMarshaller.marshall(networkProfile.getDownlinkJitterMs(), DOWNLINKJITTERMS_BINDING);
            protocolMarshaller.marshall(networkProfile.getUplinkLossPercent(), UPLINKLOSSPERCENT_BINDING);
            protocolMarshaller.marshall(networkProfile.getDownlinkLossPercent(), DOWNLINKLOSSPERCENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
