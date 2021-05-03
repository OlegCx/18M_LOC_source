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
package com.amazonaws.services.iotfleethub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleethub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationSummaryMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationName").build();
    private static final MarshallingInfo<String> APPLICATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationDescription").build();
    private static final MarshallingInfo<String> APPLICATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationUrl").build();
    private static final MarshallingInfo<Long> APPLICATIONCREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationCreationDate").build();
    private static final MarshallingInfo<Long> APPLICATIONLASTUPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationLastUpdateDate").build();
    private static final MarshallingInfo<String> APPLICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationState").build();

    private static final ApplicationSummaryMarshaller instance = new ApplicationSummaryMarshaller();

    public static ApplicationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationSummary applicationSummary, ProtocolMarshaller protocolMarshaller) {

        if (applicationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationSummary.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationDescription(), APPLICATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationUrl(), APPLICATIONURL_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationCreationDate(), APPLICATIONCREATIONDATE_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationLastUpdateDate(), APPLICATIONLASTUPDATEDATE_BINDING);
            protocolMarshaller.marshall(applicationSummary.getApplicationState(), APPLICATIONSTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
