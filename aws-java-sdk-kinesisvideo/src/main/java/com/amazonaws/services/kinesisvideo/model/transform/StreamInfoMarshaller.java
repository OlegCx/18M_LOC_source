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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamInfoMarshaller {

    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> MEDIATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MediaType").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> DATARETENTIONINHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRetentionInHours").build();

    private static final StreamInfoMarshaller instance = new StreamInfoMarshaller();

    public static StreamInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamInfo streamInfo, ProtocolMarshaller protocolMarshaller) {

        if (streamInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamInfo.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(streamInfo.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(streamInfo.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(streamInfo.getMediaType(), MEDIATYPE_BINDING);
            protocolMarshaller.marshall(streamInfo.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(streamInfo.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(streamInfo.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(streamInfo.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(streamInfo.getDataRetentionInHours(), DATARETENTIONINHOURS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
