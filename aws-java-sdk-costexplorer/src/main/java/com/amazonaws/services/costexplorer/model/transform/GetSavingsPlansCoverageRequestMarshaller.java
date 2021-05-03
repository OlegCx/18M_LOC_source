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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSavingsPlansCoverageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSavingsPlansCoverageRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimePeriod").build();
    private static final MarshallingInfo<List> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupBy").build();
    private static final MarshallingInfo<String> GRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Granularity").build();
    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filter").build();
    private static final MarshallingInfo<List> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metrics").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<StructuredPojo> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortBy").build();

    private static final GetSavingsPlansCoverageRequestMarshaller instance = new GetSavingsPlansCoverageRequestMarshaller();

    public static GetSavingsPlansCoverageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSavingsPlansCoverageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getGranularity(), GRANULARITY_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getSavingsPlansCoverageRequest.getSortBy(), SORTBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
