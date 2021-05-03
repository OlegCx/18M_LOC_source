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
 * ParallelismConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParallelismConfigurationUpdateMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONTYPEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationTypeUpdate").build();
    private static final MarshallingInfo<Integer> PARALLELISMUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelismUpdate").build();
    private static final MarshallingInfo<Integer> PARALLELISMPERKPUUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelismPerKPUUpdate").build();
    private static final MarshallingInfo<Boolean> AUTOSCALINGENABLEDUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingEnabledUpdate").build();

    private static final ParallelismConfigurationUpdateMarshaller instance = new ParallelismConfigurationUpdateMarshaller();

    public static ParallelismConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParallelismConfigurationUpdate parallelismConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (parallelismConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parallelismConfigurationUpdate.getConfigurationTypeUpdate(), CONFIGURATIONTYPEUPDATE_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationUpdate.getParallelismUpdate(), PARALLELISMUPDATE_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationUpdate.getParallelismPerKPUUpdate(), PARALLELISMPERKPUUPDATE_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationUpdate.getAutoScalingEnabledUpdate(), AUTOSCALINGENABLEDUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
