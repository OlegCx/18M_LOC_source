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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConformancePackDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConformancePackDetailMarshaller {

    private static final MarshallingInfo<String> CONFORMANCEPACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackName").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackArn").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackId").build();
    private static final MarshallingInfo<String> DELIVERYS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3Bucket").build();
    private static final MarshallingInfo<String> DELIVERYS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3KeyPrefix").build();
    private static final MarshallingInfo<List> CONFORMANCEPACKINPUTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackInputParameters").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEREQUESTEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateRequestedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();

    private static final ConformancePackDetailMarshaller instance = new ConformancePackDetailMarshaller();

    public static ConformancePackDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConformancePackDetail conformancePackDetail, ProtocolMarshaller protocolMarshaller) {

        if (conformancePackDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conformancePackDetail.getConformancePackName(), CONFORMANCEPACKNAME_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getConformancePackArn(), CONFORMANCEPACKARN_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getConformancePackId(), CONFORMANCEPACKID_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getDeliveryS3Bucket(), DELIVERYS3BUCKET_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getDeliveryS3KeyPrefix(), DELIVERYS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getConformancePackInputParameters(), CONFORMANCEPACKINPUTPARAMETERS_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getLastUpdateRequestedTime(), LASTUPDATEREQUESTEDTIME_BINDING);
            protocolMarshaller.marshall(conformancePackDetail.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
