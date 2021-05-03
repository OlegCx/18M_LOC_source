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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * APNSVoipChannelResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class APNSVoipChannelResponseMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> DEFAULTAUTHENTICATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAuthenticationMethod").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<Boolean> HASCREDENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasCredential").build();
    private static final MarshallingInfo<Boolean> HASTOKENKEY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasTokenKey").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Boolean> ISARCHIVED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsArchived").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Platform").build();
    private static final MarshallingInfo<Integer> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

    private static final APNSVoipChannelResponseMarshaller instance = new APNSVoipChannelResponseMarshaller();

    public static APNSVoipChannelResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(APNSVoipChannelResponse aPNSVoipChannelResponse, ProtocolMarshaller protocolMarshaller) {

        if (aPNSVoipChannelResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getDefaultAuthenticationMethod(), DEFAULTAUTHENTICATIONMETHOD_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getHasCredential(), HASCREDENTIAL_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getHasTokenKey(), HASTOKENKEY_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getId(), ID_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getIsArchived(), ISARCHIVED_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(aPNSVoipChannelResponse.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
