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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchListOutgoingTypedLinksMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchListOutgoingTypedLinksMarshaller {

    private static final MarshallingInfo<StructuredPojo> OBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectReference").build();
    private static final MarshallingInfo<List> FILTERATTRIBUTERANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterAttributeRanges").build();
    private static final MarshallingInfo<StructuredPojo> FILTERTYPEDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterTypedLink").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final BatchListOutgoingTypedLinksMarshaller instance = new BatchListOutgoingTypedLinksMarshaller();

    public static BatchListOutgoingTypedLinksMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchListOutgoingTypedLinks batchListOutgoingTypedLinks, ProtocolMarshaller protocolMarshaller) {

        if (batchListOutgoingTypedLinks == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchListOutgoingTypedLinks.getObjectReference(), OBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(batchListOutgoingTypedLinks.getFilterAttributeRanges(), FILTERATTRIBUTERANGES_BINDING);
            protocolMarshaller.marshall(batchListOutgoingTypedLinks.getFilterTypedLink(), FILTERTYPEDLINK_BINDING);
            protocolMarshaller.marshall(batchListOutgoingTypedLinks.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(batchListOutgoingTypedLinks.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
