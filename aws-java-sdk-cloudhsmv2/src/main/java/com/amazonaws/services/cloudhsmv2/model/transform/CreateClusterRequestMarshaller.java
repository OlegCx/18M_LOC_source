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
package com.amazonaws.services.cloudhsmv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudhsmv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateClusterRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> BACKUPRETENTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRetentionPolicy").build();
    private static final MarshallingInfo<String> HSMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HsmType").build();
    private static final MarshallingInfo<String> SOURCEBACKUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackupId").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<List> TAGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagList").build();

    private static final CreateClusterRequestMarshaller instance = new CreateClusterRequestMarshaller();

    public static CreateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateClusterRequest createClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (createClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createClusterRequest.getBackupRetentionPolicy(), BACKUPRETENTIONPOLICY_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getHsmType(), HSMTYPE_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSourceBackupId(), SOURCEBACKUPID_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getTagList(), TAGLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
