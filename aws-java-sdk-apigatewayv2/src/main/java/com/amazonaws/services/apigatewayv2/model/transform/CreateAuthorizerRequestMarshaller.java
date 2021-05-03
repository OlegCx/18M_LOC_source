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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAuthorizerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAuthorizerRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> AUTHORIZERCREDENTIALSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerCredentialsArn").build();
    private static final MarshallingInfo<String> AUTHORIZERPAYLOADFORMATVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerPayloadFormatVersion").build();
    private static final MarshallingInfo<Integer> AUTHORIZERRESULTTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerResultTtlInSeconds").build();
    private static final MarshallingInfo<String> AUTHORIZERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerType").build();
    private static final MarshallingInfo<String> AUTHORIZERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerUri").build();
    private static final MarshallingInfo<Boolean> ENABLESIMPLERESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableSimpleResponses").build();
    private static final MarshallingInfo<List> IDENTITYSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identitySource").build();
    private static final MarshallingInfo<String> IDENTITYVALIDATIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityValidationExpression").build();
    private static final MarshallingInfo<StructuredPojo> JWTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jwtConfiguration").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final CreateAuthorizerRequestMarshaller instance = new CreateAuthorizerRequestMarshaller();

    public static CreateAuthorizerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAuthorizerRequest createAuthorizerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAuthorizerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAuthorizerRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerCredentialsArn(), AUTHORIZERCREDENTIALSARN_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerPayloadFormatVersion(), AUTHORIZERPAYLOADFORMATVERSION_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerResultTtlInSeconds(), AUTHORIZERRESULTTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerType(), AUTHORIZERTYPE_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerUri(), AUTHORIZERURI_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getEnableSimpleResponses(), ENABLESIMPLERESPONSES_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getIdentitySource(), IDENTITYSOURCE_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getIdentityValidationExpression(), IDENTITYVALIDATIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getJwtConfiguration(), JWTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
