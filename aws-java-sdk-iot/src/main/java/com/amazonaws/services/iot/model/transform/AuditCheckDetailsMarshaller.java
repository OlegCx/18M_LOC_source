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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuditCheckDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuditCheckDetailsMarshaller {

    private static final MarshallingInfo<String> CHECKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkRunStatus").build();
    private static final MarshallingInfo<Boolean> CHECKCOMPLIANT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkCompliant").build();
    private static final MarshallingInfo<Long> TOTALRESOURCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalResourcesCount").build();
    private static final MarshallingInfo<Long> NONCOMPLIANTRESOURCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nonCompliantResourcesCount").build();
    private static final MarshallingInfo<Long> SUPPRESSEDNONCOMPLIANTRESOURCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressedNonCompliantResourcesCount").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorCode").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();

    private static final AuditCheckDetailsMarshaller instance = new AuditCheckDetailsMarshaller();

    public static AuditCheckDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuditCheckDetails auditCheckDetails, ProtocolMarshaller protocolMarshaller) {

        if (auditCheckDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(auditCheckDetails.getCheckRunStatus(), CHECKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getCheckCompliant(), CHECKCOMPLIANT_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getTotalResourcesCount(), TOTALRESOURCESCOUNT_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getNonCompliantResourcesCount(), NONCOMPLIANTRESOURCESCOUNT_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getSuppressedNonCompliantResourcesCount(), SUPPRESSEDNONCOMPLIANTRESOURCESCOUNT_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(auditCheckDetails.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
