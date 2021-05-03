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
package com.amazonaws.services.servicequotas.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicequotas.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceQuotaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceQuotaMarshaller {

    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCode").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<String> QUOTAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaArn").build();
    private static final MarshallingInfo<String> QUOTACODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaCode").build();
    private static final MarshallingInfo<String> QUOTANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaName").build();
    private static final MarshallingInfo<Double> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Boolean> ADJUSTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Adjustable").build();
    private static final MarshallingInfo<Boolean> GLOBALQUOTA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalQuota").build();
    private static final MarshallingInfo<StructuredPojo> USAGEMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsageMetric").build();
    private static final MarshallingInfo<StructuredPojo> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Period").build();
    private static final MarshallingInfo<StructuredPojo> ERRORREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorReason").build();

    private static final ServiceQuotaMarshaller instance = new ServiceQuotaMarshaller();

    public static ServiceQuotaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceQuota serviceQuota, ProtocolMarshaller protocolMarshaller) {

        if (serviceQuota == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceQuota.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(serviceQuota.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(serviceQuota.getQuotaArn(), QUOTAARN_BINDING);
            protocolMarshaller.marshall(serviceQuota.getQuotaCode(), QUOTACODE_BINDING);
            protocolMarshaller.marshall(serviceQuota.getQuotaName(), QUOTANAME_BINDING);
            protocolMarshaller.marshall(serviceQuota.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(serviceQuota.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(serviceQuota.getAdjustable(), ADJUSTABLE_BINDING);
            protocolMarshaller.marshall(serviceQuota.getGlobalQuota(), GLOBALQUOTA_BINDING);
            protocolMarshaller.marshall(serviceQuota.getUsageMetric(), USAGEMETRIC_BINDING);
            protocolMarshaller.marshall(serviceQuota.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(serviceQuota.getErrorReason(), ERRORREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
