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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChangeSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChangeSummaryMarshaller {

    private static final MarshallingInfo<String> CHANGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeType").build();
    private static final MarshallingInfo<StructuredPojo> ENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Entity").build();
    private static final MarshallingInfo<String> DETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Details").build();
    private static final MarshallingInfo<List> ERRORDETAILLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorDetailList").build();
    private static final MarshallingInfo<String> CHANGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeName").build();

    private static final ChangeSummaryMarshaller instance = new ChangeSummaryMarshaller();

    public static ChangeSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChangeSummary changeSummary, ProtocolMarshaller protocolMarshaller) {

        if (changeSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(changeSummary.getChangeType(), CHANGETYPE_BINDING);
            protocolMarshaller.marshall(changeSummary.getEntity(), ENTITY_BINDING);
            protocolMarshaller.marshall(changeSummary.getDetails(), DETAILS_BINDING);
            protocolMarshaller.marshall(changeSummary.getErrorDetailList(), ERRORDETAILLIST_BINDING);
            protocolMarshaller.marshall(changeSummary.getChangeName(), CHANGENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
