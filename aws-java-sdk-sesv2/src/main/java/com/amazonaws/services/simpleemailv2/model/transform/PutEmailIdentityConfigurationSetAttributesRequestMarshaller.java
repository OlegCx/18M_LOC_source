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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutEmailIdentityConfigurationSetAttributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutEmailIdentityConfigurationSetAttributesRequestMarshaller {

    private static final MarshallingInfo<String> EMAILIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EmailIdentity").build();
    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();

    private static final PutEmailIdentityConfigurationSetAttributesRequestMarshaller instance = new PutEmailIdentityConfigurationSetAttributesRequestMarshaller();

    public static PutEmailIdentityConfigurationSetAttributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutEmailIdentityConfigurationSetAttributesRequest putEmailIdentityConfigurationSetAttributesRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (putEmailIdentityConfigurationSetAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putEmailIdentityConfigurationSetAttributesRequest.getEmailIdentity(), EMAILIDENTITY_BINDING);
            protocolMarshaller.marshall(putEmailIdentityConfigurationSetAttributesRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
