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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InboxPlacementTrackingOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InboxPlacementTrackingOptionMarshaller {

    private static final MarshallingInfo<Boolean> GLOBAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Global").build();
    private static final MarshallingInfo<List> TRACKEDISPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrackedIsps").build();

    private static final InboxPlacementTrackingOptionMarshaller instance = new InboxPlacementTrackingOptionMarshaller();

    public static InboxPlacementTrackingOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InboxPlacementTrackingOption inboxPlacementTrackingOption, ProtocolMarshaller protocolMarshaller) {

        if (inboxPlacementTrackingOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inboxPlacementTrackingOption.getGlobal(), GLOBAL_BINDING);
            protocolMarshaller.marshall(inboxPlacementTrackingOption.getTrackedIsps(), TRACKEDISPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
