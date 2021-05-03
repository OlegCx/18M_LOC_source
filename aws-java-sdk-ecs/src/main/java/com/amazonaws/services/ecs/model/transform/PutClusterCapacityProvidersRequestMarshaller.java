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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutClusterCapacityProvidersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutClusterCapacityProvidersRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cluster").build();
    private static final MarshallingInfo<List> CAPACITYPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacityProviders").build();
    private static final MarshallingInfo<List> DEFAULTCAPACITYPROVIDERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultCapacityProviderStrategy").build();

    private static final PutClusterCapacityProvidersRequestMarshaller instance = new PutClusterCapacityProvidersRequestMarshaller();

    public static PutClusterCapacityProvidersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutClusterCapacityProvidersRequest putClusterCapacityProvidersRequest, ProtocolMarshaller protocolMarshaller) {

        if (putClusterCapacityProvidersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putClusterCapacityProvidersRequest.getCluster(), CLUSTER_BINDING);
            protocolMarshaller.marshall(putClusterCapacityProvidersRequest.getCapacityProviders(), CAPACITYPROVIDERS_BINDING);
            protocolMarshaller.marshall(putClusterCapacityProvidersRequest.getDefaultCapacityProviderStrategy(), DEFAULTCAPACITYPROVIDERSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
