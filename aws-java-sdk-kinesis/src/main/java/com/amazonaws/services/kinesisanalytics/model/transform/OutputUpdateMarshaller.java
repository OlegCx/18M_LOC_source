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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutputUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputUpdateMarshaller {

    private static final MarshallingInfo<String> OUTPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputId").build();
    private static final MarshallingInfo<String> NAMEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NameUpdate").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSOUTPUTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamsOutputUpdate").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEOUTPUTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseOutputUpdate").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAOUTPUTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaOutputUpdate").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSCHEMAUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationSchemaUpdate").build();

    private static final OutputUpdateMarshaller instance = new OutputUpdateMarshaller();

    public static OutputUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutputUpdate outputUpdate, ProtocolMarshaller protocolMarshaller) {

        if (outputUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outputUpdate.getOutputId(), OUTPUTID_BINDING);
            protocolMarshaller.marshall(outputUpdate.getNameUpdate(), NAMEUPDATE_BINDING);
            protocolMarshaller.marshall(outputUpdate.getKinesisStreamsOutputUpdate(), KINESISSTREAMSOUTPUTUPDATE_BINDING);
            protocolMarshaller.marshall(outputUpdate.getKinesisFirehoseOutputUpdate(), KINESISFIREHOSEOUTPUTUPDATE_BINDING);
            protocolMarshaller.marshall(outputUpdate.getLambdaOutputUpdate(), LAMBDAOUTPUTUPDATE_BINDING);
            protocolMarshaller.marshall(outputUpdate.getDestinationSchemaUpdate(), DESTINATIONSCHEMAUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
