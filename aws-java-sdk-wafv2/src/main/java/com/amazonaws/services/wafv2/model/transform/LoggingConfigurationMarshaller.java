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
package com.amazonaws.services.wafv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoggingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoggingConfigurationMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<List> LOGDESTINATIONCONFIGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogDestinationConfigs").build();
    private static final MarshallingInfo<List> REDACTEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedactedFields").build();
    private static final MarshallingInfo<Boolean> MANAGEDBYFIREWALLMANAGER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedByFirewallManager").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingFilter").build();

    private static final LoggingConfigurationMarshaller instance = new LoggingConfigurationMarshaller();

    public static LoggingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoggingConfiguration loggingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (loggingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loggingConfiguration.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(loggingConfiguration.getLogDestinationConfigs(), LOGDESTINATIONCONFIGS_BINDING);
            protocolMarshaller.marshall(loggingConfiguration.getRedactedFields(), REDACTEDFIELDS_BINDING);
            protocolMarshaller.marshall(loggingConfiguration.getManagedByFirewallManager(), MANAGEDBYFIREWALLMANAGER_BINDING);
            protocolMarshaller.marshall(loggingConfiguration.getLoggingFilter(), LOGGINGFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
