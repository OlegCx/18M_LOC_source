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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSourceLocationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSourceLocationRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCESSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTSEGMENTDELIVERYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSegmentDeliveryConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HTTPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpConfiguration").build();
    private static final MarshallingInfo<String> SOURCELOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("sourceLocationName").build();

    private static final UpdateSourceLocationRequestMarshaller instance = new UpdateSourceLocationRequestMarshaller();

    public static UpdateSourceLocationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSourceLocationRequest updateSourceLocationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSourceLocationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSourceLocationRequest.getAccessConfiguration(), ACCESSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateSourceLocationRequest.getDefaultSegmentDeliveryConfiguration(), DEFAULTSEGMENTDELIVERYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateSourceLocationRequest.getHttpConfiguration(), HTTPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateSourceLocationRequest.getSourceLocationName(), SOURCELOCATIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
