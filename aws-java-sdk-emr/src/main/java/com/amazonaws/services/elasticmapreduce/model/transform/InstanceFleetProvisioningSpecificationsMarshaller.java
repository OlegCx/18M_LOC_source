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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceFleetProvisioningSpecificationsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceFleetProvisioningSpecificationsMarshaller {

    private static final MarshallingInfo<StructuredPojo> SPOTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotSpecification").build();
    private static final MarshallingInfo<StructuredPojo> ONDEMANDSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandSpecification").build();

    private static final InstanceFleetProvisioningSpecificationsMarshaller instance = new InstanceFleetProvisioningSpecificationsMarshaller();

    public static InstanceFleetProvisioningSpecificationsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceFleetProvisioningSpecifications instanceFleetProvisioningSpecifications, ProtocolMarshaller protocolMarshaller) {

        if (instanceFleetProvisioningSpecifications == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceFleetProvisioningSpecifications.getSpotSpecification(), SPOTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(instanceFleetProvisioningSpecifications.getOnDemandSpecification(), ONDEMANDSPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
