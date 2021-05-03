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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SipMediaApplicationLoggingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SipMediaApplicationLoggingConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ENABLESIPMEDIAAPPLICATIONMESSAGELOGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableSipMediaApplicationMessageLogs").build();

    private static final SipMediaApplicationLoggingConfigurationMarshaller instance = new SipMediaApplicationLoggingConfigurationMarshaller();

    public static SipMediaApplicationLoggingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SipMediaApplicationLoggingConfiguration sipMediaApplicationLoggingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sipMediaApplicationLoggingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sipMediaApplicationLoggingConfiguration.getEnableSipMediaApplicationMessageLogs(),
                    ENABLESIPMEDIAAPPLICATIONMESSAGELOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
