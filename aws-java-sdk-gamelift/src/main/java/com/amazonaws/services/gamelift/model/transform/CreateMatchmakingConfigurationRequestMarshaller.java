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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMatchmakingConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMatchmakingConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> GAMESESSIONQUEUEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionQueueArns").build();
    private static final MarshallingInfo<Integer> REQUESTTIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestTimeoutSeconds").build();
    private static final MarshallingInfo<Integer> ACCEPTANCETIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptanceTimeoutSeconds").build();
    private static final MarshallingInfo<Boolean> ACCEPTANCEREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptanceRequired").build();
    private static final MarshallingInfo<String> RULESETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleSetName").build();
    private static final MarshallingInfo<String> NOTIFICATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationTarget").build();
    private static final MarshallingInfo<Integer> ADDITIONALPLAYERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalPlayerCount").build();
    private static final MarshallingInfo<String> CUSTOMEVENTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomEventData").build();
    private static final MarshallingInfo<List> GAMEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameProperties").build();
    private static final MarshallingInfo<String> GAMESESSIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionData").build();
    private static final MarshallingInfo<String> BACKFILLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackfillMode").build();
    private static final MarshallingInfo<String> FLEXMATCHMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlexMatchMode").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateMatchmakingConfigurationRequestMarshaller instance = new CreateMatchmakingConfigurationRequestMarshaller();

    public static CreateMatchmakingConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMatchmakingConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getGameSessionQueueArns(), GAMESESSIONQUEUEARNS_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getRequestTimeoutSeconds(), REQUESTTIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getAcceptanceTimeoutSeconds(), ACCEPTANCETIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getAcceptanceRequired(), ACCEPTANCEREQUIRED_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getRuleSetName(), RULESETNAME_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getNotificationTarget(), NOTIFICATIONTARGET_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getAdditionalPlayerCount(), ADDITIONALPLAYERCOUNT_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getCustomEventData(), CUSTOMEVENTDATA_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getGameProperties(), GAMEPROPERTIES_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getGameSessionData(), GAMESESSIONDATA_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getBackfillMode(), BACKFILLMODE_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getFlexMatchMode(), FLEXMATCHMODE_BINDING);
            protocolMarshaller.marshall(createMatchmakingConfigurationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
