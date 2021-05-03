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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeConfigurationAggregatorSourcesStatusRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeConfigurationAggregatorSourcesStatusRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONAGGREGATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationAggregatorName").build();
    private static final MarshallingInfo<List> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpdateStatus").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();

    private static final DescribeConfigurationAggregatorSourcesStatusRequestMarshaller instance = new DescribeConfigurationAggregatorSourcesStatusRequestMarshaller();

    public static DescribeConfigurationAggregatorSourcesStatusRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeConfigurationAggregatorSourcesStatusRequest describeConfigurationAggregatorSourcesStatusRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (describeConfigurationAggregatorSourcesStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeConfigurationAggregatorSourcesStatusRequest.getConfigurationAggregatorName(),
                    CONFIGURATIONAGGREGATORNAME_BINDING);
            protocolMarshaller.marshall(describeConfigurationAggregatorSourcesStatusRequest.getUpdateStatus(), UPDATESTATUS_BINDING);
            protocolMarshaller.marshall(describeConfigurationAggregatorSourcesStatusRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeConfigurationAggregatorSourcesStatusRequest.getLimit(), LIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
