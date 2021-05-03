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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartPersonTrackingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartPersonTrackingRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> VIDEO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Video").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationChannel").build();
    private static final MarshallingInfo<String> JOBTAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobTag").build();

    private static final StartPersonTrackingRequestMarshaller instance = new StartPersonTrackingRequestMarshaller();

    public static StartPersonTrackingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartPersonTrackingRequest startPersonTrackingRequest, ProtocolMarshaller protocolMarshaller) {

        if (startPersonTrackingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startPersonTrackingRequest.getVideo(), VIDEO_BINDING);
            protocolMarshaller.marshall(startPersonTrackingRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startPersonTrackingRequest.getNotificationChannel(), NOTIFICATIONCHANNEL_BINDING);
            protocolMarshaller.marshall(startPersonTrackingRequest.getJobTag(), JOBTAG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
