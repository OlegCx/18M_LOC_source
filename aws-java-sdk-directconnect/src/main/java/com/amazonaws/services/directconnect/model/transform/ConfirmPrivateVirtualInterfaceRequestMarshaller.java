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
 * ConfirmPrivateVirtualInterfaceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfirmPrivateVirtualInterfaceRequestMarshaller {

    private static final MarshallingInfo<String> VIRTUALINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceId").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();

    private static final ConfirmPrivateVirtualInterfaceRequestMarshaller instance = new ConfirmPrivateVirtualInterfaceRequestMarshaller();

    public static ConfirmPrivateVirtualInterfaceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest, ProtocolMarshaller protocolMarshaller) {

        if (confirmPrivateVirtualInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(confirmPrivateVirtualInterfaceRequest.getVirtualInterfaceId(), VIRTUALINTERFACEID_BINDING);
            protocolMarshaller.marshall(confirmPrivateVirtualInterfaceRequest.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
            protocolMarshaller.marshall(confirmPrivateVirtualInterfaceRequest.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
