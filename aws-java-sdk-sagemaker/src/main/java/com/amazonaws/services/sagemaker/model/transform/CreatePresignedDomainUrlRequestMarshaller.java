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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePresignedDomainUrlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePresignedDomainUrlRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainId").build();
    private static final MarshallingInfo<String> USERPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserProfileName").build();
    private static final MarshallingInfo<Integer> SESSIONEXPIRATIONDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionExpirationDurationInSeconds").build();
    private static final MarshallingInfo<Integer> EXPIRESINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiresInSeconds").build();

    private static final CreatePresignedDomainUrlRequestMarshaller instance = new CreatePresignedDomainUrlRequestMarshaller();

    public static CreatePresignedDomainUrlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPresignedDomainUrlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPresignedDomainUrlRequest.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(createPresignedDomainUrlRequest.getUserProfileName(), USERPROFILENAME_BINDING);
            protocolMarshaller.marshall(createPresignedDomainUrlRequest.getSessionExpirationDurationInSeconds(), SESSIONEXPIRATIONDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createPresignedDomainUrlRequest.getExpiresInSeconds(), EXPIRESINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
