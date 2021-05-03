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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutGatewayResponseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutGatewayResponseRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> RESPONSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("response_type").build();
    private static final MarshallingInfo<String> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusCode").build();
    private static final MarshallingInfo<Map> RESPONSEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseParameters").build();
    private static final MarshallingInfo<Map> RESPONSETEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseTemplates").build();

    private static final PutGatewayResponseRequestMarshaller instance = new PutGatewayResponseRequestMarshaller();

    public static PutGatewayResponseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutGatewayResponseRequest putGatewayResponseRequest, ProtocolMarshaller protocolMarshaller) {

        if (putGatewayResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putGatewayResponseRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(putGatewayResponseRequest.getResponseType(), RESPONSETYPE_BINDING);
            protocolMarshaller.marshall(putGatewayResponseRequest.getStatusCode(), STATUSCODE_BINDING);
            protocolMarshaller.marshall(putGatewayResponseRequest.getResponseParameters(), RESPONSEPARAMETERS_BINDING);
            protocolMarshaller.marshall(putGatewayResponseRequest.getResponseTemplates(), RESPONSETEMPLATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
