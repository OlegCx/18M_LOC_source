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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioNormalizationSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioNormalizationSettingsMarshaller {

    private static final MarshallingInfo<String> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("algorithm").build();
    private static final MarshallingInfo<String> ALGORITHMCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("algorithmControl").build();
    private static final MarshallingInfo<Integer> CORRECTIONGATELEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("correctionGateLevel").build();
    private static final MarshallingInfo<String> LOUDNESSLOGGING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loudnessLogging").build();
    private static final MarshallingInfo<String> PEAKCALCULATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("peakCalculation").build();
    private static final MarshallingInfo<Double> TARGETLKFS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetLkfs").build();

    private static final AudioNormalizationSettingsMarshaller instance = new AudioNormalizationSettingsMarshaller();

    public static AudioNormalizationSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioNormalizationSettings audioNormalizationSettings, ProtocolMarshaller protocolMarshaller) {

        if (audioNormalizationSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioNormalizationSettings.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(audioNormalizationSettings.getAlgorithmControl(), ALGORITHMCONTROL_BINDING);
            protocolMarshaller.marshall(audioNormalizationSettings.getCorrectionGateLevel(), CORRECTIONGATELEVEL_BINDING);
            protocolMarshaller.marshall(audioNormalizationSettings.getLoudnessLogging(), LOUDNESSLOGGING_BINDING);
            protocolMarshaller.marshall(audioNormalizationSettings.getPeakCalculation(), PEAKCALCULATION_BINDING);
            protocolMarshaller.marshall(audioNormalizationSettings.getTargetLkfs(), TARGETLKFS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
