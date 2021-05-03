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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SharedDirectoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SharedDirectoryMarshaller {

    private static final MarshallingInfo<String> OWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccountId").build();
    private static final MarshallingInfo<String> OWNERDIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerDirectoryId").build();
    private static final MarshallingInfo<String> SHAREMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareMethod").build();
    private static final MarshallingInfo<String> SHAREDACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedAccountId").build();
    private static final MarshallingInfo<String> SHAREDDIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedDirectoryId").build();
    private static final MarshallingInfo<String> SHARESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareStatus").build();
    private static final MarshallingInfo<String> SHARENOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareNotes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final SharedDirectoryMarshaller instance = new SharedDirectoryMarshaller();

    public static SharedDirectoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SharedDirectory sharedDirectory, ProtocolMarshaller protocolMarshaller) {

        if (sharedDirectory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sharedDirectory.getOwnerAccountId(), OWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getOwnerDirectoryId(), OWNERDIRECTORYID_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getShareMethod(), SHAREMETHOD_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getSharedAccountId(), SHAREDACCOUNTID_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getSharedDirectoryId(), SHAREDDIRECTORYID_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getShareStatus(), SHARESTATUS_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getShareNotes(), SHARENOTES_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getCreatedDateTime(), CREATEDDATETIME_BINDING);
            protocolMarshaller.marshall(sharedDirectory.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
