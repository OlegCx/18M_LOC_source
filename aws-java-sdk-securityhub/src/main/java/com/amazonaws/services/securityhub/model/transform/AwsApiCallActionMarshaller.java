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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiCallActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiCallActionMarshaller {

    private static final MarshallingInfo<String> API_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Api").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<String> CALLERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallerType").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEIPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoteIpDetails").build();
    private static final MarshallingInfo<StructuredPojo> DOMAINDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainDetails").build();
    private static final MarshallingInfo<Map> AFFECTEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AffectedResources").build();
    private static final MarshallingInfo<String> FIRSTSEEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstSeen").build();
    private static final MarshallingInfo<String> LASTSEEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastSeen").build();

    private static final AwsApiCallActionMarshaller instance = new AwsApiCallActionMarshaller();

    public static AwsApiCallActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiCallAction awsApiCallAction, ProtocolMarshaller protocolMarshaller) {

        if (awsApiCallAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiCallAction.getApi(), API_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getCallerType(), CALLERTYPE_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getRemoteIpDetails(), REMOTEIPDETAILS_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getDomainDetails(), DOMAINDETAILS_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getAffectedResources(), AFFECTEDRESOURCES_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getFirstSeen(), FIRSTSEEN_BINDING);
            protocolMarshaller.marshall(awsApiCallAction.getLastSeen(), LASTSEEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
