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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStreamingSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStreamingSessionRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> EC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceType").build();
    private static final MarshallingInfo<String> LAUNCHPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchProfileId").build();
    private static final MarshallingInfo<String> STREAMINGIMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamingImageId").build();
    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("studioId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateStreamingSessionRequestMarshaller instance = new CreateStreamingSessionRequestMarshaller();

    public static CreateStreamingSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStreamingSessionRequest createStreamingSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStreamingSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStreamingSessionRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createStreamingSessionRequest.getEc2InstanceType(), EC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createStreamingSessionRequest.getLaunchProfileId(), LAUNCHPROFILEID_BINDING);
            protocolMarshaller.marshall(createStreamingSessionRequest.getStreamingImageId(), STREAMINGIMAGEID_BINDING);
            protocolMarshaller.marshall(createStreamingSessionRequest.getStudioId(), STUDIOID_BINDING);
            protocolMarshaller.marshall(createStreamingSessionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
