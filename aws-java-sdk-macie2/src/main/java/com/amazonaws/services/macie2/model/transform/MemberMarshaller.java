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
package com.amazonaws.services.macie2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MemberMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> ADMINISTRATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("administratorAccountId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("email").build();
    private static final MarshallingInfo<java.util.Date> INVITEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("invitedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> MASTERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterAccountId").build();
    private static final MarshallingInfo<String> RELATIONSHIPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationshipStatus").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final MemberMarshaller instance = new MemberMarshaller();

    public static MemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Member member, ProtocolMarshaller protocolMarshaller) {

        if (member == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(member.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(member.getAdministratorAccountId(), ADMINISTRATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(member.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(member.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(member.getInvitedAt(), INVITEDAT_BINDING);
            protocolMarshaller.marshall(member.getMasterAccountId(), MASTERACCOUNTID_BINDING);
            protocolMarshaller.marshall(member.getRelationshipStatus(), RELATIONSHIPSTATUS_BINDING);
            protocolMarshaller.marshall(member.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(member.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
