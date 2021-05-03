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
 * PutSubscriptionFilterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSubscriptionFilterRequestMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<String> FILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterName").build();
    private static final MarshallingInfo<String> FILTERPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterPattern").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationArn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> DISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distribution").build();

    private static final PutSubscriptionFilterRequestMarshaller instance = new PutSubscriptionFilterRequestMarshaller();

    public static PutSubscriptionFilterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSubscriptionFilterRequest putSubscriptionFilterRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSubscriptionFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getFilterName(), FILTERNAME_BINDING);
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getFilterPattern(), FILTERPATTERN_BINDING);
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(putSubscriptionFilterRequest.getDistribution(), DISTRIBUTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
