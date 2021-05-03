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
package com.amazonaws.services.mediapackagevod.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagevod.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsManifestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsManifestMarshaller {

    private static final MarshallingInfo<String> ADMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("adMarkers").build();
    private static final MarshallingInfo<Boolean> INCLUDEIFRAMEONLYSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeIframeOnlyStream").build();
    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestName").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTimeIntervalSeconds").build();
    private static final MarshallingInfo<Boolean> REPEATEXTXKEY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repeatExtXKey").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamSelection").build();

    private static final HlsManifestMarshaller instance = new HlsManifestMarshaller();

    public static HlsManifestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsManifest hlsManifest, ProtocolMarshaller protocolMarshaller) {

        if (hlsManifest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsManifest.getAdMarkers(), ADMARKERS_BINDING);
            protocolMarshaller.marshall(hlsManifest.getIncludeIframeOnlyStream(), INCLUDEIFRAMEONLYSTREAM_BINDING);
            protocolMarshaller.marshall(hlsManifest.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(hlsManifest.getProgramDateTimeIntervalSeconds(), PROGRAMDATETIMEINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(hlsManifest.getRepeatExtXKey(), REPEATEXTXKEY_BINDING);
            protocolMarshaller.marshall(hlsManifest.getStreamSelection(), STREAMSELECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
