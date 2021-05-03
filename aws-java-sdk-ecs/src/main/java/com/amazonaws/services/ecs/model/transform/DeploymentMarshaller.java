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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TASKDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinition").build();
    private static final MarshallingInfo<Integer> DESIREDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredCount").build();
    private static final MarshallingInfo<Integer> PENDINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingCount").build();
    private static final MarshallingInfo<Integer> RUNNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningCount").build();
    private static final MarshallingInfo<Integer> FAILEDTASKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedTasks").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> CAPACITYPROVIDERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacityProviderStrategy").build();
    private static final MarshallingInfo<String> LAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchType").build();
    private static final MarshallingInfo<String> PLATFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformVersion").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConfiguration").build();
    private static final MarshallingInfo<String> ROLLOUTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rolloutState").build();
    private static final MarshallingInfo<String> ROLLOUTSTATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rolloutStateReason").build();

    private static final DeploymentMarshaller instance = new DeploymentMarshaller();

    public static DeploymentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Deployment deployment, ProtocolMarshaller protocolMarshaller) {

        if (deployment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deployment.getId(), ID_BINDING);
            protocolMarshaller.marshall(deployment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(deployment.getTaskDefinition(), TASKDEFINITION_BINDING);
            protocolMarshaller.marshall(deployment.getDesiredCount(), DESIREDCOUNT_BINDING);
            protocolMarshaller.marshall(deployment.getPendingCount(), PENDINGCOUNT_BINDING);
            protocolMarshaller.marshall(deployment.getRunningCount(), RUNNINGCOUNT_BINDING);
            protocolMarshaller.marshall(deployment.getFailedTasks(), FAILEDTASKS_BINDING);
            protocolMarshaller.marshall(deployment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(deployment.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(deployment.getCapacityProviderStrategy(), CAPACITYPROVIDERSTRATEGY_BINDING);
            protocolMarshaller.marshall(deployment.getLaunchType(), LAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(deployment.getPlatformVersion(), PLATFORMVERSION_BINDING);
            protocolMarshaller.marshall(deployment.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(deployment.getRolloutState(), ROLLOUTSTATE_BINDING);
            protocolMarshaller.marshall(deployment.getRolloutStateReason(), ROLLOUTSTATEREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
