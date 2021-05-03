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
package com.amazonaws.services.eventbridge.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eventbridge.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemoveTargetsResultEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemoveTargetsResultEntryMarshaller {

    private static final MarshallingInfo<String> TARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetId").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();

    private static final RemoveTargetsResultEntryMarshaller instance = new RemoveTargetsResultEntryMarshaller();

    public static RemoveTargetsResultEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemoveTargetsResultEntry removeTargetsResultEntry, ProtocolMarshaller protocolMarshaller) {

        if (removeTargetsResultEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(removeTargetsResultEntry.getTargetId(), TARGETID_BINDING);
            protocolMarshaller.marshall(removeTargetsResultEntry.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(removeTargetsResultEntry.getErrorMessage(), ERRORMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
