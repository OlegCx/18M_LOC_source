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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PhoneNumberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PhoneNumberMarshaller {

    private static final MarshallingInfo<String> PHONENUMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberId").build();
    private static final MarshallingInfo<String> E164PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("E164PhoneNumber").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> PRODUCTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capabilities").build();
    private static final MarshallingInfo<List> ASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Associations").build();
    private static final MarshallingInfo<String> CALLINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallingName").build();
    private static final MarshallingInfo<String> CALLINGNAMESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallingNameStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> DELETIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionTimestamp").timestampFormat("iso8601").build();

    private static final PhoneNumberMarshaller instance = new PhoneNumberMarshaller();

    public static PhoneNumberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PhoneNumber phoneNumber, ProtocolMarshaller protocolMarshaller) {

        if (phoneNumber == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(phoneNumber.getPhoneNumberId(), PHONENUMBERID_BINDING);
            protocolMarshaller.marshall(phoneNumber.getE164PhoneNumber(), E164PHONENUMBER_BINDING);
            protocolMarshaller.marshall(phoneNumber.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(phoneNumber.getProductType(), PRODUCTTYPE_BINDING);
            protocolMarshaller.marshall(phoneNumber.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(phoneNumber.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(phoneNumber.getAssociations(), ASSOCIATIONS_BINDING);
            protocolMarshaller.marshall(phoneNumber.getCallingName(), CALLINGNAME_BINDING);
            protocolMarshaller.marshall(phoneNumber.getCallingNameStatus(), CALLINGNAMESTATUS_BINDING);
            protocolMarshaller.marshall(phoneNumber.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(phoneNumber.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(phoneNumber.getDeletionTimestamp(), DELETIONTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
