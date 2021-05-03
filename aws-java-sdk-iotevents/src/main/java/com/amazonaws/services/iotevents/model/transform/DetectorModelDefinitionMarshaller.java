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
package com.amazonaws.services.iotevents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectorModelDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectorModelDefinitionMarshaller {

    private static final MarshallingInfo<List> STATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("states").build();
    private static final MarshallingInfo<String> INITIALSTATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initialStateName").build();

    private static final DetectorModelDefinitionMarshaller instance = new DetectorModelDefinitionMarshaller();

    public static DetectorModelDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectorModelDefinition detectorModelDefinition, ProtocolMarshaller protocolMarshaller) {

        if (detectorModelDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectorModelDefinition.getStates(), STATES_BINDING);
            protocolMarshaller.marshall(detectorModelDefinition.getInitialStateName(), INITIALSTATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
