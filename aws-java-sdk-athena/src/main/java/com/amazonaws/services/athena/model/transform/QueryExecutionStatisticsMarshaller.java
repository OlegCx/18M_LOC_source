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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryExecutionStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryExecutionStatisticsMarshaller {

    private static final MarshallingInfo<Long> ENGINEEXECUTIONTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineExecutionTimeInMillis").build();
    private static final MarshallingInfo<Long> DATASCANNEDINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataScannedInBytes").build();
    private static final MarshallingInfo<String> DATAMANIFESTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataManifestLocation").build();
    private static final MarshallingInfo<Long> TOTALEXECUTIONTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalExecutionTimeInMillis").build();
    private static final MarshallingInfo<Long> QUERYQUEUETIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryQueueTimeInMillis").build();
    private static final MarshallingInfo<Long> QUERYPLANNINGTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryPlanningTimeInMillis").build();
    private static final MarshallingInfo<Long> SERVICEPROCESSINGTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceProcessingTimeInMillis").build();

    private static final QueryExecutionStatisticsMarshaller instance = new QueryExecutionStatisticsMarshaller();

    public static QueryExecutionStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryExecutionStatistics queryExecutionStatistics, ProtocolMarshaller protocolMarshaller) {

        if (queryExecutionStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryExecutionStatistics.getEngineExecutionTimeInMillis(), ENGINEEXECUTIONTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getDataScannedInBytes(), DATASCANNEDINBYTES_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getDataManifestLocation(), DATAMANIFESTLOCATION_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getTotalExecutionTimeInMillis(), TOTALEXECUTIONTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getQueryQueueTimeInMillis(), QUERYQUEUETIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getQueryPlanningTimeInMillis(), QUERYPLANNINGTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryExecutionStatistics.getServiceProcessingTimeInMillis(), SERVICEPROCESSINGTIMEINMILLIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
