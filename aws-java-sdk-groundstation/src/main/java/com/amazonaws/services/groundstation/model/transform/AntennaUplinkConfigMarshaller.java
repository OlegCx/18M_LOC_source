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
package com.amazonaws.services.groundstation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AntennaUplinkConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AntennaUplinkConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> SPECTRUMCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spectrumConfig").build();
    private static final MarshallingInfo<StructuredPojo> TARGETEIRP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetEirp").build();
    private static final MarshallingInfo<Boolean> TRANSMITDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transmitDisabled").build();

    private static final AntennaUplinkConfigMarshaller instance = new AntennaUplinkConfigMarshaller();

    public static AntennaUplinkConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AntennaUplinkConfig antennaUplinkConfig, ProtocolMarshaller protocolMarshaller) {

        if (antennaUplinkConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(antennaUplinkConfig.getSpectrumConfig(), SPECTRUMCONFIG_BINDING);
            protocolMarshaller.marshall(antennaUplinkConfig.getTargetEirp(), TARGETEIRP_BINDING);
            protocolMarshaller.marshall(antennaUplinkConfig.getTransmitDisabled(), TRANSMITDISABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
