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
package com.amazonaws.services.lexruntime.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSessionRequestMarshaller {

    private static final MarshallingInfo<String> BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botName").build();
    private static final MarshallingInfo<String> BOTALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botAlias").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<Map> SESSIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DIALOGACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogAction").build();
    private static final MarshallingInfo<List> RECENTINTENTSUMMARYVIEW_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recentIntentSummaryView").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("Accept").build();
    private static final MarshallingInfo<List> ACTIVECONTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeContexts").build();

    private static final PutSessionRequestMarshaller instance = new PutSessionRequestMarshaller();

    public static PutSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSessionRequest putSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSessionRequest.getBotName(), BOTNAME_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getBotAlias(), BOTALIAS_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getSessionAttributes(), SESSIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getDialogAction(), DIALOGACTION_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getRecentIntentSummaryView(), RECENTINTENTSUMMARYVIEW_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getAccept(), ACCEPT_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getActiveContexts(), ACTIVECONTEXTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
