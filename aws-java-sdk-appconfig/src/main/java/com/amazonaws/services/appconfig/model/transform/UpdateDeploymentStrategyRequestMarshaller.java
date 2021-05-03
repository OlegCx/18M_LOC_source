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
 * UpdateDeploymentStrategyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDeploymentStrategyRequestMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTSTRATEGYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("DeploymentStrategyId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> DEPLOYMENTDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentDurationInMinutes").build();
    private static final MarshallingInfo<Integer> FINALBAKETIMEINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalBakeTimeInMinutes").build();
    private static final MarshallingInfo<Float> GROWTHFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthFactor").build();
    private static final MarshallingInfo<String> GROWTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthType").build();

    private static final UpdateDeploymentStrategyRequestMarshaller instance = new UpdateDeploymentStrategyRequestMarshaller();

    public static UpdateDeploymentStrategyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDeploymentStrategyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getDeploymentStrategyId(), DEPLOYMENTSTRATEGYID_BINDING);
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getDeploymentDurationInMinutes(), DEPLOYMENTDURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getFinalBakeTimeInMinutes(), FINALBAKETIMEINMINUTES_BINDING);
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getGrowthFactor(), GROWTHFACTOR_BINDING);
            protocolMarshaller.marshall(updateDeploymentStrategyRequest.getGrowthType(), GROWTHTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
