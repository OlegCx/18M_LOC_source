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
package com.amazonaws.services.kinesis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConsumerDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsumerDescriptionMarshaller {

    private static final MarshallingInfo<String> CONSUMERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerName").build();
    private static final MarshallingInfo<String> CONSUMERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerARN").build();
    private static final MarshallingInfo<String> CONSUMERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerStatus").build();
    private static final MarshallingInfo<java.util.Date> CONSUMERCREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerCreationTimestamp").timestampFormat("unixTimestampInMillis").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();

    private static final ConsumerDescriptionMarshaller instance = new ConsumerDescriptionMarshaller();

    public static ConsumerDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConsumerDescription consumerDescription, ProtocolMarshaller protocolMarshaller) {

        if (consumerDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consumerDescription.getConsumerName(), CONSUMERNAME_BINDING);
            protocolMarshaller.marshall(consumerDescription.getConsumerARN(), CONSUMERARN_BINDING);
            protocolMarshaller.marshall(consumerDescription.getConsumerStatus(), CONSUMERSTATUS_BINDING);
            protocolMarshaller.marshall(consumerDescription.getConsumerCreationTimestamp(), CONSUMERCREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(consumerDescription.getStreamARN(), STREAMARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
