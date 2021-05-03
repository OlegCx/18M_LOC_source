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
 * AssociationExecutionTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociationExecutionTargetMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<String> ASSOCIATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationVersion").build();
    private static final MarshallingInfo<String> EXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionId").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> DETAILEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailedStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputSource").build();

    private static final AssociationExecutionTargetMarshaller instance = new AssociationExecutionTargetMarshaller();

    public static AssociationExecutionTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociationExecutionTarget associationExecutionTarget, ProtocolMarshaller protocolMarshaller) {

        if (associationExecutionTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associationExecutionTarget.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getAssociationVersion(), ASSOCIATIONVERSION_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getExecutionId(), EXECUTIONID_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getDetailedStatus(), DETAILEDSTATUS_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getLastExecutionDate(), LASTEXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(associationExecutionTarget.getOutputSource(), OUTPUTSOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
