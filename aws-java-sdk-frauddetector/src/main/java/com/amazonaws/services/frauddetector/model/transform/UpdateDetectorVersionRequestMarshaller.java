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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDetectorVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDetectorVersionRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorId").build();
    private static final MarshallingInfo<String> DETECTORVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorVersionId").build();
    private static final MarshallingInfo<List> EXTERNALMODELENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalModelEndpoints").build();
    private static final MarshallingInfo<List> RULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rules").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> MODELVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelVersions").build();
    private static final MarshallingInfo<String> RULEEXECUTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleExecutionMode").build();

    private static final UpdateDetectorVersionRequestMarshaller instance = new UpdateDetectorVersionRequestMarshaller();

    public static UpdateDetectorVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDetectorVersionRequest updateDetectorVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDetectorVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDetectorVersionRequest.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getDetectorVersionId(), DETECTORVERSIONID_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getExternalModelEndpoints(), EXTERNALMODELENDPOINTS_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getRules(), RULES_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getModelVersions(), MODELVERSIONS_BINDING);
            protocolMarshaller.marshall(updateDetectorVersionRequest.getRuleExecutionMode(), RULEEXECUTIONMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
