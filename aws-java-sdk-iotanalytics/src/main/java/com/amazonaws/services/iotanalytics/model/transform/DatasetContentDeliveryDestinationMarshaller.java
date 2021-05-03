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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetContentDeliveryDestinationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetContentDeliveryDestinationMarshaller {

    private static final MarshallingInfo<StructuredPojo> IOTEVENTSDESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotEventsDestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3DestinationConfiguration").build();

    private static final DatasetContentDeliveryDestinationMarshaller instance = new DatasetContentDeliveryDestinationMarshaller();

    public static DatasetContentDeliveryDestinationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetContentDeliveryDestination datasetContentDeliveryDestination, ProtocolMarshaller protocolMarshaller) {

        if (datasetContentDeliveryDestination == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetContentDeliveryDestination.getIotEventsDestinationConfiguration(), IOTEVENTSDESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(datasetContentDeliveryDestination.getS3DestinationConfiguration(), S3DESTINATIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
