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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetProtectionStatusRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetProtectionStatusRequestMarshaller {

    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> MEMBERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemberAccountId").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final GetProtectionStatusRequestMarshaller instance = new GetProtectionStatusRequestMarshaller();

    public static GetProtectionStatusRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetProtectionStatusRequest getProtectionStatusRequest, ProtocolMarshaller protocolMarshaller) {

        if (getProtectionStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getProtectionStatusRequest.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(getProtectionStatusRequest.getMemberAccountId(), MEMBERACCOUNTID_BINDING);
            protocolMarshaller.marshall(getProtectionStatusRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getProtectionStatusRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getProtectionStatusRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getProtectionStatusRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
