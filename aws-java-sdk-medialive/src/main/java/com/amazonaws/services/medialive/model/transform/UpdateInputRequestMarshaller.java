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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateInputRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateInputRequestMarshaller {

    private static final MarshallingInfo<List> DESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("destinations").build();
    private static final MarshallingInfo<List> INPUTDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputDevices").build();
    private static final MarshallingInfo<String> INPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("inputId").build();
    private static final MarshallingInfo<List> INPUTSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSecurityGroups").build();
    private static final MarshallingInfo<List> MEDIACONNECTFLOWS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaConnectFlows").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();

    private static final UpdateInputRequestMarshaller instance = new UpdateInputRequestMarshaller();

    public static UpdateInputRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateInputRequest updateInputRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateInputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateInputRequest.getDestinations(), DESTINATIONS_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getInputDevices(), INPUTDEVICES_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getInputId(), INPUTID_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getInputSecurityGroups(), INPUTSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getMediaConnectFlows(), MEDIACONNECTFLOWS_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateInputRequest.getSources(), SOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
