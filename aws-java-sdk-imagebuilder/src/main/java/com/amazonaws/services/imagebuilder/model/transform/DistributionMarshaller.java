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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DistributionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DistributionMarshaller {

    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<StructuredPojo> AMIDISTRIBUTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amiDistributionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERDISTRIBUTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerDistributionConfiguration").build();
    private static final MarshallingInfo<List> LICENSECONFIGURATIONARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseConfigurationArns").build();
    private static final MarshallingInfo<List> LAUNCHTEMPLATECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchTemplateConfigurations").build();

    private static final DistributionMarshaller instance = new DistributionMarshaller();

    public static DistributionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Distribution distribution, ProtocolMarshaller protocolMarshaller) {

        if (distribution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(distribution.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(distribution.getAmiDistributionConfiguration(), AMIDISTRIBUTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(distribution.getContainerDistributionConfiguration(), CONTAINERDISTRIBUTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(distribution.getLicenseConfigurationArns(), LICENSECONFIGURATIONARNS_BINDING);
            protocolMarshaller.marshall(distribution.getLaunchTemplateConfigurations(), LAUNCHTEMPLATECONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
