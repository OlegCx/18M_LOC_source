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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetAggregateConfigRuleComplianceSummaryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetAggregateConfigRuleComplianceSummaryRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONAGGREGATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationAggregatorName").build();
    private static final MarshallingInfo<StructuredPojo> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filters").build();
    private static final MarshallingInfo<String> GROUPBYKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupByKey").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final GetAggregateConfigRuleComplianceSummaryRequestMarshaller instance = new GetAggregateConfigRuleComplianceSummaryRequestMarshaller();

    public static GetAggregateConfigRuleComplianceSummaryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetAggregateConfigRuleComplianceSummaryRequest getAggregateConfigRuleComplianceSummaryRequest, ProtocolMarshaller protocolMarshaller) {

        if (getAggregateConfigRuleComplianceSummaryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getAggregateConfigRuleComplianceSummaryRequest.getConfigurationAggregatorName(), CONFIGURATIONAGGREGATORNAME_BINDING);
            protocolMarshaller.marshall(getAggregateConfigRuleComplianceSummaryRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(getAggregateConfigRuleComplianceSummaryRequest.getGroupByKey(), GROUPBYKEY_BINDING);
            protocolMarshaller.marshall(getAggregateConfigRuleComplianceSummaryRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(getAggregateConfigRuleComplianceSummaryRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
