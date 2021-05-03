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
package com.amazonaws.services.appconfig.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appconfig.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StopDeploymentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StopDeploymentRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EnvironmentId").build();
    private static final MarshallingInfo<Integer> DEPLOYMENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("DeploymentNumber").build();

    private static final StopDeploymentRequestMarshaller instance = new StopDeploymentRequestMarshaller();

    public static StopDeploymentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StopDeploymentRequest stopDeploymentRequest, ProtocolMarshaller protocolMarshaller) {

        if (stopDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stopDeploymentRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(stopDeploymentRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(stopDeploymentRequest.getDeploymentNumber(), DEPLOYMENTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
