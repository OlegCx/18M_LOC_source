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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NewTransitVirtualInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NewTransitVirtualInterfaceMarshaller {

    private static final MarshallingInfo<String> VIRTUALINTERFACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceName").build();
    private static final MarshallingInfo<Integer> VLAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vlan").build();
    private static final MarshallingInfo<Integer> ASN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asn").build();
    private static final MarshallingInfo<Integer> MTU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mtu").build();
    private static final MarshallingInfo<String> AUTHKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authKey").build();
    private static final MarshallingInfo<String> AMAZONADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amazonAddress").build();
    private static final MarshallingInfo<String> CUSTOMERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerAddress").build();
    private static final MarshallingInfo<String> ADDRESSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addressFamily").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final NewTransitVirtualInterfaceMarshaller instance = new NewTransitVirtualInterfaceMarshaller();

    public static NewTransitVirtualInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NewTransitVirtualInterface newTransitVirtualInterface, ProtocolMarshaller protocolMarshaller) {

        if (newTransitVirtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(newTransitVirtualInterface.getVirtualInterfaceName(), VIRTUALINTERFACENAME_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getVlan(), VLAN_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getAsn(), ASN_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getMtu(), MTU_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getAuthKey(), AUTHKEY_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getAmazonAddress(), AMAZONADDRESS_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getCustomerAddress(), CUSTOMERADDRESS_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getAddressFamily(), ADDRESSFAMILY_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(newTransitVirtualInterface.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
