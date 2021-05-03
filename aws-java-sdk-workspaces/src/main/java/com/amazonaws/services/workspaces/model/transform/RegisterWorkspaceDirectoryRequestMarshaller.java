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
package com.amazonaws.services.workspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterWorkspaceDirectoryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterWorkspaceDirectoryRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<Boolean> ENABLEWORKDOCS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableWorkDocs").build();
    private static final MarshallingInfo<Boolean> ENABLESELFSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableSelfService").build();
    private static final MarshallingInfo<String> TENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tenancy").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final RegisterWorkspaceDirectoryRequestMarshaller instance = new RegisterWorkspaceDirectoryRequestMarshaller();

    public static RegisterWorkspaceDirectoryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterWorkspaceDirectoryRequest registerWorkspaceDirectoryRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerWorkspaceDirectoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getEnableWorkDocs(), ENABLEWORKDOCS_BINDING);
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getEnableSelfService(), ENABLESELFSERVICE_BINDING);
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getTenancy(), TENANCY_BINDING);
            protocolMarshaller.marshall(registerWorkspaceDirectoryRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
