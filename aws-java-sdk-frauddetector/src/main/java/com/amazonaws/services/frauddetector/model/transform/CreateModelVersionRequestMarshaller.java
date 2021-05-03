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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelVersionRequestMarshaller {

    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<String> MODELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelType").build();
    private static final MarshallingInfo<String> TRAININGDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataSource").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGDATASCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataSchema").build();
    private static final MarshallingInfo<StructuredPojo> EXTERNALEVENTSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalEventsDetail").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateModelVersionRequestMarshaller instance = new CreateModelVersionRequestMarshaller();

    public static CreateModelVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelVersionRequest createModelVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelVersionRequest.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(createModelVersionRequest.getModelType(), MODELTYPE_BINDING);
            protocolMarshaller.marshall(createModelVersionRequest.getTrainingDataSource(), TRAININGDATASOURCE_BINDING);
            protocolMarshaller.marshall(createModelVersionRequest.getTrainingDataSchema(), TRAININGDATASCHEMA_BINDING);
            protocolMarshaller.marshall(createModelVersionRequest.getExternalEventsDetail(), EXTERNALEVENTSDETAIL_BINDING);
            protocolMarshaller.marshall(createModelVersionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
