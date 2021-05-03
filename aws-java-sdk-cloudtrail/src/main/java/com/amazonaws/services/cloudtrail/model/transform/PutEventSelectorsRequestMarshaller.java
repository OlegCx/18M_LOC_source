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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutEventSelectorsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutEventSelectorsRequestMarshaller {

    private static final MarshallingInfo<String> TRAILNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrailName").build();
    private static final MarshallingInfo<List> EVENTSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSelectors").build();
    private static final MarshallingInfo<List> ADVANCEDEVENTSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedEventSelectors").build();

    private static final PutEventSelectorsRequestMarshaller instance = new PutEventSelectorsRequestMarshaller();

    public static PutEventSelectorsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutEventSelectorsRequest putEventSelectorsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putEventSelectorsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putEventSelectorsRequest.getTrailName(), TRAILNAME_BINDING);
            protocolMarshaller.marshall(putEventSelectorsRequest.getEventSelectors(), EVENTSELECTORS_BINDING);
            protocolMarshaller.marshall(putEventSelectorsRequest.getAdvancedEventSelectors(), ADVANCEDEVENTSELECTORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
