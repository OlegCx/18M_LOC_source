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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThingIndexingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThingIndexingConfigurationMarshaller {

    private static final MarshallingInfo<String> THINGINDEXINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingIndexingMode").build();
    private static final MarshallingInfo<String> THINGCONNECTIVITYINDEXINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingConnectivityIndexingMode").build();
    private static final MarshallingInfo<List> MANAGEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("managedFields").build();
    private static final MarshallingInfo<List> CUSTOMFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("customFields").build();

    private static final ThingIndexingConfigurationMarshaller instance = new ThingIndexingConfigurationMarshaller();

    public static ThingIndexingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThingIndexingConfiguration thingIndexingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (thingIndexingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(thingIndexingConfiguration.getThingIndexingMode(), THINGINDEXINGMODE_BINDING);
            protocolMarshaller.marshall(thingIndexingConfiguration.getThingConnectivityIndexingMode(), THINGCONNECTIVITYINDEXINGMODE_BINDING);
            protocolMarshaller.marshall(thingIndexingConfiguration.getManagedFields(), MANAGEDFIELDS_BINDING);
            protocolMarshaller.marshall(thingIndexingConfiguration.getCustomFields(), CUSTOMFIELDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
