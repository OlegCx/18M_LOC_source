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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagevod.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DashPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashPackageMarshaller {

    private static final MarshallingInfo<List> DASHMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dashManifests").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Boolean> INCLUDEENCODERCONFIGURATIONINSEGMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeEncoderConfigurationInSegments").build();
    private static final MarshallingInfo<List> PERIODTRIGGERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("periodTriggers").build();
    private static final MarshallingInfo<Integer> SEGMENTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentDurationSeconds").build();
    private static final MarshallingInfo<String> SEGMENTTEMPLATEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentTemplateFormat").build();

    private static final DashPackageMarshaller instance = new DashPackageMarshaller();

    public static DashPackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashPackage dashPackage, ProtocolMarshaller protocolMarshaller) {

        if (dashPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashPackage.getDashManifests(), DASHMANIFESTS_BINDING);
            protocolMarshaller.marshall(dashPackage.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(dashPackage.getIncludeEncoderConfigurationInSegments(), INCLUDEENCODERCONFIGURATIONINSEGMENTS_BINDING);
            protocolMarshaller.marshall(dashPackage.getPeriodTriggers(), PERIODTRIGGERS_BINDING);
            protocolMarshaller.marshall(dashPackage.getSegmentDurationSeconds(), SEGMENTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(dashPackage.getSegmentTemplateFormat(), SEGMENTTEMPLATEFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
