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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchLoggingOptionUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchLoggingOptionUpdateMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGGINGOPTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptionId").build();
    private static final MarshallingInfo<String> LOGSTREAMARNUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogStreamARNUpdate").build();

    private static final CloudWatchLoggingOptionUpdateMarshaller instance = new CloudWatchLoggingOptionUpdateMarshaller();

    public static CloudWatchLoggingOptionUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchLoggingOptionUpdate cloudWatchLoggingOptionUpdate, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchLoggingOptionUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchLoggingOptionUpdate.getCloudWatchLoggingOptionId(), CLOUDWATCHLOGGINGOPTIONID_BINDING);
            protocolMarshaller.marshall(cloudWatchLoggingOptionUpdate.getLogStreamARNUpdate(), LOGSTREAMARNUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
