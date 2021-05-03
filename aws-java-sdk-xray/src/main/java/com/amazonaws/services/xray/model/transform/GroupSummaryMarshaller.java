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
 * GroupSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GroupSummaryMarshaller {

    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<String> GROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupARN").build();
    private static final MarshallingInfo<String> FILTEREXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterExpression").build();
    private static final MarshallingInfo<StructuredPojo> INSIGHTSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsightsConfiguration").build();

    private static final GroupSummaryMarshaller instance = new GroupSummaryMarshaller();

    public static GroupSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GroupSummary groupSummary, ProtocolMarshaller protocolMarshaller) {

        if (groupSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(groupSummary.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(groupSummary.getGroupARN(), GROUPARN_BINDING);
            protocolMarshaller.marshall(groupSummary.getFilterExpression(), FILTEREXPRESSION_BINDING);
            protocolMarshaller.marshall(groupSummary.getInsightsConfiguration(), INSIGHTSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
