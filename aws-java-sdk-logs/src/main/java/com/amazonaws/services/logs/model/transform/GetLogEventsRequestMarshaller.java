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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetLogEventsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetLogEventsRequestMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<String> LOGSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamName").build();
    private static final MarshallingInfo<Long> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTime").build();
    private static final MarshallingInfo<Long> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endTime").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<Boolean> STARTFROMHEAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startFromHead").build();

    private static final GetLogEventsRequestMarshaller instance = new GetLogEventsRequestMarshaller();

    public static GetLogEventsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetLogEventsRequest getLogEventsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getLogEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getLogEventsRequest.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getLogStreamName(), LOGSTREAMNAME_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(getLogEventsRequest.getStartFromHead(), STARTFROMHEAD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
