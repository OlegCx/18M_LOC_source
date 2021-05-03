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
package com.amazonaws.services.mq.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBrokerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBrokerRequestMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationStrategy").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> BROKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("broker-id").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<String> HOSTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostInstanceType").build();
    private static final MarshallingInfo<StructuredPojo> LDAPSERVERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ldapServerMetadata").build();
    private static final MarshallingInfo<StructuredPojo> LOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logs").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroups").build();

    private static final UpdateBrokerRequestMarshaller instance = new UpdateBrokerRequestMarshaller();

    public static UpdateBrokerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBrokerRequest updateBrokerRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateBrokerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBrokerRequest.getAuthenticationStrategy(), AUTHENTICATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getBrokerId(), BROKERID_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getHostInstanceType(), HOSTINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getLdapServerMetadata(), LDAPSERVERMETADATA_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getLogs(), LOGS_BINDING);
            protocolMarshaller.marshall(updateBrokerRequest.getSecurityGroups(), SECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
