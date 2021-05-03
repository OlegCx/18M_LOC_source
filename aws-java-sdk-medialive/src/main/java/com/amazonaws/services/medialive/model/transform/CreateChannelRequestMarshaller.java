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
package com.amazonaws.services.medialive.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateChannelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateChannelRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CDIINPUTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cdiInputSpecification").build();
    private static final MarshallingInfo<String> CHANNELCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelClass").build();
    private static final MarshallingInfo<List> DESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("destinations").build();
    private static final MarshallingInfo<StructuredPojo> ENCODERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encoderSettings").build();
    private static final MarshallingInfo<List> INPUTATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputAttachments").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSpecification").build();
    private static final MarshallingInfo<String> LOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logLevel").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> REQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestId").defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> RESERVED_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reserved").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpc").build();

    private static final CreateChannelRequestMarshaller instance = new CreateChannelRequestMarshaller();

    public static CreateChannelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateChannelRequest createChannelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createChannelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createChannelRequest.getCdiInputSpecification(), CDIINPUTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getChannelClass(), CHANNELCLASS_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getDestinations(), DESTINATIONS_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getEncoderSettings(), ENCODERSETTINGS_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getInputAttachments(), INPUTATTACHMENTS_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getInputSpecification(), INPUTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getLogLevel(), LOGLEVEL_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getRequestId(), REQUESTID_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getReserved(), RESERVED_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createChannelRequest.getVpc(), VPC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
