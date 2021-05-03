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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BaselineOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BaselineOverrideMarshaller {

    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<StructuredPojo> GLOBALFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalFilters").build();
    private static final MarshallingInfo<StructuredPojo> APPROVALRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalRules").build();
    private static final MarshallingInfo<List> APPROVEDPATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatches").build();
    private static final MarshallingInfo<String> APPROVEDPATCHESCOMPLIANCELEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatchesComplianceLevel").build();
    private static final MarshallingInfo<List> REJECTEDPATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RejectedPatches").build();
    private static final MarshallingInfo<String> REJECTEDPATCHESACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RejectedPatchesAction").build();
    private static final MarshallingInfo<Boolean> APPROVEDPATCHESENABLENONSECURITY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatchesEnableNonSecurity").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sources").build();

    private static final BaselineOverrideMarshaller instance = new BaselineOverrideMarshaller();

    public static BaselineOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BaselineOverride baselineOverride, ProtocolMarshaller protocolMarshaller) {

        if (baselineOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(baselineOverride.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(baselineOverride.getGlobalFilters(), GLOBALFILTERS_BINDING);
            protocolMarshaller.marshall(baselineOverride.getApprovalRules(), APPROVALRULES_BINDING);
            protocolMarshaller.marshall(baselineOverride.getApprovedPatches(), APPROVEDPATCHES_BINDING);
            protocolMarshaller.marshall(baselineOverride.getApprovedPatchesComplianceLevel(), APPROVEDPATCHESCOMPLIANCELEVEL_BINDING);
            protocolMarshaller.marshall(baselineOverride.getRejectedPatches(), REJECTEDPATCHES_BINDING);
            protocolMarshaller.marshall(baselineOverride.getRejectedPatchesAction(), REJECTEDPATCHESACTION_BINDING);
            protocolMarshaller.marshall(baselineOverride.getApprovedPatchesEnableNonSecurity(), APPROVEDPATCHESENABLENONSECURITY_BINDING);
            protocolMarshaller.marshall(baselineOverride.getSources(), SOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
