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
package com.amazonaws.services.augmentedairuntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.augmentedairuntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartHumanLoopRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartHumanLoopRequestMarshaller {

    private static final MarshallingInfo<String> HUMANLOOPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopName").build();
    private static final MarshallingInfo<String> FLOWDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlowDefinitionArn").build();
    private static final MarshallingInfo<StructuredPojo> HUMANLOOPINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopInput").build();
    private static final MarshallingInfo<StructuredPojo> DATAATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAttributes").build();

    private static final StartHumanLoopRequestMarshaller instance = new StartHumanLoopRequestMarshaller();

    public static StartHumanLoopRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartHumanLoopRequest startHumanLoopRequest, ProtocolMarshaller protocolMarshaller) {

        if (startHumanLoopRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startHumanLoopRequest.getHumanLoopName(), HUMANLOOPNAME_BINDING);
            protocolMarshaller.marshall(startHumanLoopRequest.getFlowDefinitionArn(), FLOWDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(startHumanLoopRequest.getHumanLoopInput(), HUMANLOOPINPUT_BINDING);
            protocolMarshaller.marshall(startHumanLoopRequest.getDataAttributes(), DATAATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
