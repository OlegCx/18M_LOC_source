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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConnectionAuthRequestParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConnectionAuthRequestParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> BASICAUTHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BasicAuthParameters").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OAuthParameters").build();
    private static final MarshallingInfo<StructuredPojo> APIKEYAUTHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiKeyAuthParameters").build();
    private static final MarshallingInfo<StructuredPojo> INVOCATIONHTTPPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvocationHttpParameters").build();

    private static final UpdateConnectionAuthRequestParametersMarshaller instance = new UpdateConnectionAuthRequestParametersMarshaller();

    public static UpdateConnectionAuthRequestParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConnectionAuthRequestParameters updateConnectionAuthRequestParameters, ProtocolMarshaller protocolMarshaller) {

        if (updateConnectionAuthRequestParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConnectionAuthRequestParameters.getBasicAuthParameters(), BASICAUTHPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateConnectionAuthRequestParameters.getOAuthParameters(), OAUTHPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateConnectionAuthRequestParameters.getApiKeyAuthParameters(), APIKEYAUTHPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateConnectionAuthRequestParameters.getInvocationHttpParameters(), INVOCATIONHTTPPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
