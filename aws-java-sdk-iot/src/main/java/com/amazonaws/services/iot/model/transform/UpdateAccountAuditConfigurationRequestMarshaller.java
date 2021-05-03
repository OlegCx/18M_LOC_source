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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAccountAuditConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAccountAuditConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Map> AUDITNOTIFICATIONTARGETCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("auditNotificationTargetConfigurations").build();
    private static final MarshallingInfo<Map> AUDITCHECKCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("auditCheckConfigurations").build();

    private static final UpdateAccountAuditConfigurationRequestMarshaller instance = new UpdateAccountAuditConfigurationRequestMarshaller();

    public static UpdateAccountAuditConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAccountAuditConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAccountAuditConfigurationRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateAccountAuditConfigurationRequest.getAuditNotificationTargetConfigurations(),
                    AUDITNOTIFICATIONTARGETCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(updateAccountAuditConfigurationRequest.getAuditCheckConfigurations(), AUDITCHECKCONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
