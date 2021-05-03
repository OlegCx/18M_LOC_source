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
package com.amazonaws.services.robomaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRobotApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRobotApplicationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("application").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();
    private static final MarshallingInfo<StructuredPojo> ROBOTSOFTWARESUITE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("robotSoftwareSuite").build();
    private static final MarshallingInfo<String> CURRENTREVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentRevisionId").build();

    private static final UpdateRobotApplicationRequestMarshaller instance = new UpdateRobotApplicationRequestMarshaller();

    public static UpdateRobotApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRobotApplicationRequest updateRobotApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRobotApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRobotApplicationRequest.getApplication(), APPLICATION_BINDING);
            protocolMarshaller.marshall(updateRobotApplicationRequest.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(updateRobotApplicationRequest.getRobotSoftwareSuite(), ROBOTSOFTWARESUITE_BINDING);
            protocolMarshaller.marshall(updateRobotApplicationRequest.getCurrentRevisionId(), CURRENTREVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
