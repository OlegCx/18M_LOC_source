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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserDefinedFunctionInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserDefinedFunctionInputMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> CLASSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClassName").build();
    private static final MarshallingInfo<String> OWNERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerName").build();
    private static final MarshallingInfo<String> OWNERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerType").build();
    private static final MarshallingInfo<List> RESOURCEURIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceUris").build();

    private static final UserDefinedFunctionInputMarshaller instance = new UserDefinedFunctionInputMarshaller();

    public static UserDefinedFunctionInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserDefinedFunctionInput userDefinedFunctionInput, ProtocolMarshaller protocolMarshaller) {

        if (userDefinedFunctionInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userDefinedFunctionInput.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(userDefinedFunctionInput.getClassName(), CLASSNAME_BINDING);
            protocolMarshaller.marshall(userDefinedFunctionInput.getOwnerName(), OWNERNAME_BINDING);
            protocolMarshaller.marshall(userDefinedFunctionInput.getOwnerType(), OWNERTYPE_BINDING);
            protocolMarshaller.marshall(userDefinedFunctionInput.getResourceUris(), RESOURCEURIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
