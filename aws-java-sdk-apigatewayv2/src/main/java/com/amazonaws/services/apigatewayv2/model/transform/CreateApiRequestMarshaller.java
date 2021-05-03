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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApiRequestMarshaller {

    private static final MarshallingInfo<String> APIKEYSELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiKeySelectionExpression").build();
    private static final MarshallingInfo<StructuredPojo> CORSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("corsConfiguration").build();
    private static final MarshallingInfo<String> CREDENTIALSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> DISABLESCHEMAVALIDATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disableSchemaValidation").build();
    private static final MarshallingInfo<Boolean> DISABLEEXECUTEAPIENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disableExecuteApiEndpoint").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROTOCOLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("protocolType").build();
    private static final MarshallingInfo<String> ROUTEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("routeKey").build();
    private static final MarshallingInfo<String> ROUTESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeSelectionExpression").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("target").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final CreateApiRequestMarshaller instance = new CreateApiRequestMarshaller();

    public static CreateApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApiRequest createApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApiRequest.getApiKeySelectionExpression(), APIKEYSELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(createApiRequest.getCorsConfiguration(), CORSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApiRequest.getCredentialsArn(), CREDENTIALSARN_BINDING);
            protocolMarshaller.marshall(createApiRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createApiRequest.getDisableSchemaValidation(), DISABLESCHEMAVALIDATION_BINDING);
            protocolMarshaller.marshall(createApiRequest.getDisableExecuteApiEndpoint(), DISABLEEXECUTEAPIENDPOINT_BINDING);
            protocolMarshaller.marshall(createApiRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createApiRequest.getProtocolType(), PROTOCOLTYPE_BINDING);
            protocolMarshaller.marshall(createApiRequest.getRouteKey(), ROUTEKEY_BINDING);
            protocolMarshaller.marshall(createApiRequest.getRouteSelectionExpression(), ROUTESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(createApiRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createApiRequest.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(createApiRequest.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
