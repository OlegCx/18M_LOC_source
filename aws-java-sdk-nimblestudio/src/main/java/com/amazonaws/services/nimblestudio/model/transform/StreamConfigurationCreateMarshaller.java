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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamConfigurationCreateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamConfigurationCreateMarshaller {

    private static final MarshallingInfo<String> CLIPBOARDMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clipboardMode").build();
    private static final MarshallingInfo<List> EC2INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceTypes").build();
    private static final MarshallingInfo<Integer> MAXSESSIONLENGTHINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxSessionLengthInMinutes").build();
    private static final MarshallingInfo<List> STREAMINGIMAGEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamingImageIds").build();

    private static final StreamConfigurationCreateMarshaller instance = new StreamConfigurationCreateMarshaller();

    public static StreamConfigurationCreateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamConfigurationCreate streamConfigurationCreate, ProtocolMarshaller protocolMarshaller) {

        if (streamConfigurationCreate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamConfigurationCreate.getClipboardMode(), CLIPBOARDMODE_BINDING);
            protocolMarshaller.marshall(streamConfigurationCreate.getEc2InstanceTypes(), EC2INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(streamConfigurationCreate.getMaxSessionLengthInMinutes(), MAXSESSIONLENGTHINMINUTES_BINDING);
            protocolMarshaller.marshall(streamConfigurationCreate.getStreamingImageIds(), STREAMINGIMAGEIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
