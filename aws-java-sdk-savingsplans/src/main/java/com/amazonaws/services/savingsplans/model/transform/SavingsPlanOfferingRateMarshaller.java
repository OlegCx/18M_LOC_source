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
package com.amazonaws.services.savingsplans.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.savingsplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlanOfferingRateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlanOfferingRateMarshaller {

    private static final MarshallingInfo<StructuredPojo> SAVINGSPLANOFFERING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanOffering").build();
    private static final MarshallingInfo<String> RATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rate").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();
    private static final MarshallingInfo<String> PRODUCTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("productType").build();
    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceCode").build();
    private static final MarshallingInfo<String> USAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageType").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operation").build();
    private static final MarshallingInfo<List> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("properties").build();

    private static final SavingsPlanOfferingRateMarshaller instance = new SavingsPlanOfferingRateMarshaller();

    public static SavingsPlanOfferingRateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlanOfferingRate savingsPlanOfferingRate, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlanOfferingRate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlanOfferingRate.getSavingsPlanOffering(), SAVINGSPLANOFFERING_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getRate(), RATE_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getProductType(), PRODUCTTYPE_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getUsageType(), USAGETYPE_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(savingsPlanOfferingRate.getProperties(), PROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
