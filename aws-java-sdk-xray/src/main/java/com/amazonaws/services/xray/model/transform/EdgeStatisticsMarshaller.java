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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EdgeStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EdgeStatisticsMarshaller {

    private static final MarshallingInfo<Long> OKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OkCount").build();
    private static final MarshallingInfo<StructuredPojo> ERRORSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorStatistics").build();
    private static final MarshallingInfo<StructuredPojo> FAULTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FaultStatistics").build();
    private static final MarshallingInfo<Long> TOTALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalCount").build();
    private static final MarshallingInfo<Double> TOTALRESPONSETIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalResponseTime").build();

    private static final EdgeStatisticsMarshaller instance = new EdgeStatisticsMarshaller();

    public static EdgeStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EdgeStatistics edgeStatistics, ProtocolMarshaller protocolMarshaller) {

        if (edgeStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(edgeStatistics.getOkCount(), OKCOUNT_BINDING);
            protocolMarshaller.marshall(edgeStatistics.getErrorStatistics(), ERRORSTATISTICS_BINDING);
            protocolMarshaller.marshall(edgeStatistics.getFaultStatistics(), FAULTSTATISTICS_BINDING);
            protocolMarshaller.marshall(edgeStatistics.getTotalCount(), TOTALCOUNT_BINDING);
            protocolMarshaller.marshall(edgeStatistics.getTotalResponseTime(), TOTALRESPONSETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
