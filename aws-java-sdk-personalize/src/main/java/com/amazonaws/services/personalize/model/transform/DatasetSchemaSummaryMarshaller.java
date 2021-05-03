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
package com.amazonaws.services.personalize.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetSchemaSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetSchemaSummaryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> SCHEMAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("schemaArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final DatasetSchemaSummaryMarshaller instance = new DatasetSchemaSummaryMarshaller();

    public static DatasetSchemaSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetSchemaSummary datasetSchemaSummary, ProtocolMarshaller protocolMarshaller) {

        if (datasetSchemaSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetSchemaSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(datasetSchemaSummary.getSchemaArn(), SCHEMAARN_BINDING);
            protocolMarshaller.marshall(datasetSchemaSummary.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(datasetSchemaSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
