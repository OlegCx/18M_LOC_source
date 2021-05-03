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
package com.amazonaws.services.robomaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SimulationJobBatchSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SimulationJobBatchSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Integer> FAILEDREQUESTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedRequestCount").build();
    private static final MarshallingInfo<Integer> PENDINGREQUESTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingRequestCount").build();
    private static final MarshallingInfo<Integer> CREATEDREQUESTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdRequestCount").build();

    private static final SimulationJobBatchSummaryMarshaller instance = new SimulationJobBatchSummaryMarshaller();

    public static SimulationJobBatchSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SimulationJobBatchSummary simulationJobBatchSummary, ProtocolMarshaller protocolMarshaller) {

        if (simulationJobBatchSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(simulationJobBatchSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getFailedRequestCount(), FAILEDREQUESTCOUNT_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getPendingRequestCount(), PENDINGREQUESTCOUNT_BINDING);
            protocolMarshaller.marshall(simulationJobBatchSummary.getCreatedRequestCount(), CREATEDREQUESTCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
