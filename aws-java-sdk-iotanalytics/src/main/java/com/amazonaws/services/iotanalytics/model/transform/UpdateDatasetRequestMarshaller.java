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
package com.amazonaws.services.iotanalytics.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDatasetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDatasetRequestMarshaller {

    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetName").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actions").build();
    private static final MarshallingInfo<List> TRIGGERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("triggers").build();
    private static final MarshallingInfo<List> CONTENTDELIVERYRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentDeliveryRules").build();
    private static final MarshallingInfo<StructuredPojo> RETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retentionPeriod").build();
    private static final MarshallingInfo<StructuredPojo> VERSIONINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versioningConfiguration").build();
    private static final MarshallingInfo<List> LATEDATARULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lateDataRules").build();

    private static final UpdateDatasetRequestMarshaller instance = new UpdateDatasetRequestMarshaller();

    public static UpdateDatasetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDatasetRequest updateDatasetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDatasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDatasetRequest.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getTriggers(), TRIGGERS_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getContentDeliveryRules(), CONTENTDELIVERYRULES_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getVersioningConfiguration(), VERSIONINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateDatasetRequest.getLateDataRules(), LATEDATARULES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
