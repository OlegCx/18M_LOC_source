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
 * DeleteDirectConnectGatewayAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteDirectConnectGatewayAssociationRequestMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();

    private static final DeleteDirectConnectGatewayAssociationRequestMarshaller instance = new DeleteDirectConnectGatewayAssociationRequestMarshaller();

    public static DeleteDirectConnectGatewayAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteDirectConnectGatewayAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteDirectConnectGatewayAssociationRequest.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(deleteDirectConnectGatewayAssociationRequest.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(deleteDirectConnectGatewayAssociationRequest.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
