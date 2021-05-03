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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionTypeUrlsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionTypeUrlsMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationUrl").build();
    private static final MarshallingInfo<String> ENTITYURLTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityUrlTemplate").build();
    private static final MarshallingInfo<String> EXECUTIONURLTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionUrlTemplate").build();
    private static final MarshallingInfo<String> REVISIONURLTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revisionUrlTemplate").build();

    private static final ActionTypeUrlsMarshaller instance = new ActionTypeUrlsMarshaller();

    public static ActionTypeUrlsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionTypeUrls actionTypeUrls, ProtocolMarshaller protocolMarshaller) {

        if (actionTypeUrls == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionTypeUrls.getConfigurationUrl(), CONFIGURATIONURL_BINDING);
            protocolMarshaller.marshall(actionTypeUrls.getEntityUrlTemplate(), ENTITYURLTEMPLATE_BINDING);
            protocolMarshaller.marshall(actionTypeUrls.getExecutionUrlTemplate(), EXECUTIONURLTEMPLATE_BINDING);
            protocolMarshaller.marshall(actionTypeUrls.getRevisionUrlTemplate(), REVISIONURLTEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
