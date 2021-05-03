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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceTypeSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceTypeSpecificationMarshaller {

    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Integer> WEIGHTEDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeightedCapacity").build();
    private static final MarshallingInfo<String> BIDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BidPrice").build();
    private static final MarshallingInfo<Double> BIDPRICEASPERCENTAGEOFONDEMANDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BidPriceAsPercentageOfOnDemandPrice").build();
    private static final MarshallingInfo<List> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configurations").build();
    private static final MarshallingInfo<List> EBSBLOCKDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsBlockDevices").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();

    private static final InstanceTypeSpecificationMarshaller instance = new InstanceTypeSpecificationMarshaller();

    public static InstanceTypeSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceTypeSpecification instanceTypeSpecification, ProtocolMarshaller protocolMarshaller) {

        if (instanceTypeSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceTypeSpecification.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getWeightedCapacity(), WEIGHTEDCAPACITY_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getBidPrice(), BIDPRICE_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getBidPriceAsPercentageOfOnDemandPrice(), BIDPRICEASPERCENTAGEOFONDEMANDPRICE_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getConfigurations(), CONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getEbsBlockDevices(), EBSBLOCKDEVICES_BINDING);
            protocolMarshaller.marshall(instanceTypeSpecification.getEbsOptimized(), EBSOPTIMIZED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
