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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListFunctionEventInvokeConfigsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListFunctionEventInvokeConfigsRequestMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("Marker").build();
    private static final MarshallingInfo<Integer> MAXITEMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MaxItems").build();

    private static final ListFunctionEventInvokeConfigsRequestMarshaller instance = new ListFunctionEventInvokeConfigsRequestMarshaller();

    public static ListFunctionEventInvokeConfigsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListFunctionEventInvokeConfigsRequest listFunctionEventInvokeConfigsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listFunctionEventInvokeConfigsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listFunctionEventInvokeConfigsRequest.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(listFunctionEventInvokeConfigsRequest.getMarker(), MARKER_BINDING);
            protocolMarshaller.marshall(listFunctionEventInvokeConfigsRequest.getMaxItems(), MAXITEMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
