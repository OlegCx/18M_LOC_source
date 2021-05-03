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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeDocumentPermissionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeDocumentPermissionRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionType").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeDocumentPermissionRequestMarshaller instance = new DescribeDocumentPermissionRequestMarshaller();

    public static DescribeDocumentPermissionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeDocumentPermissionRequest describeDocumentPermissionRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeDocumentPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeDocumentPermissionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(describeDocumentPermissionRequest.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(describeDocumentPermissionRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeDocumentPermissionRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
