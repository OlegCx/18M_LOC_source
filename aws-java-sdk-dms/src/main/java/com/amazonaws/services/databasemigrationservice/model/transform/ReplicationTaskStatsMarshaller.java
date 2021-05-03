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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationTaskStatsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationTaskStatsMarshaller {

    private static final MarshallingInfo<Integer> FULLLOADPROGRESSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FullLoadProgressPercent").build();
    private static final MarshallingInfo<Long> ELAPSEDTIMEMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElapsedTimeMillis").build();
    private static final MarshallingInfo<Integer> TABLESLOADED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesLoaded").build();
    private static final MarshallingInfo<Integer> TABLESLOADING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesLoading").build();
    private static final MarshallingInfo<Integer> TABLESQUEUED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesQueued").build();
    private static final MarshallingInfo<Integer> TABLESERRORED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesErrored").build();
    private static final MarshallingInfo<java.util.Date> FRESHSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FreshStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STOPDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FULLLOADSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FullLoadStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FULLLOADFINISHDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FullLoadFinishDate").timestampFormat("unixTimestamp").build();

    private static final ReplicationTaskStatsMarshaller instance = new ReplicationTaskStatsMarshaller();

    public static ReplicationTaskStatsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationTaskStats replicationTaskStats, ProtocolMarshaller protocolMarshaller) {

        if (replicationTaskStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationTaskStats.getFullLoadProgressPercent(), FULLLOADPROGRESSPERCENT_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getElapsedTimeMillis(), ELAPSEDTIMEMILLIS_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getTablesLoaded(), TABLESLOADED_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getTablesLoading(), TABLESLOADING_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getTablesQueued(), TABLESQUEUED_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getTablesErrored(), TABLESERRORED_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getFreshStartDate(), FRESHSTARTDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getStopDate(), STOPDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getFullLoadStartDate(), FULLLOADSTARTDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskStats.getFullLoadFinishDate(), FULLLOADFINISHDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
