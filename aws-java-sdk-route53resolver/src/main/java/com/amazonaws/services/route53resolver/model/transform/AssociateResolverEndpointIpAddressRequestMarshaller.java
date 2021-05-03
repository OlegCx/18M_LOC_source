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
package com.amazonaws.services.route53resolver.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53resolver.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateResolverEndpointIpAddressRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateResolverEndpointIpAddressRequestMarshaller {

    private static final MarshallingInfo<String> RESOLVERENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResolverEndpointId").build();
    private static final MarshallingInfo<StructuredPojo> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpAddress").build();

    private static final AssociateResolverEndpointIpAddressRequestMarshaller instance = new AssociateResolverEndpointIpAddressRequestMarshaller();

    public static AssociateResolverEndpointIpAddressRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateResolverEndpointIpAddressRequest associateResolverEndpointIpAddressRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateResolverEndpointIpAddressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateResolverEndpointIpAddressRequest.getResolverEndpointId(), RESOLVERENDPOINTID_BINDING);
            protocolMarshaller.marshall(associateResolverEndpointIpAddressRequest.getIpAddress(), IPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
