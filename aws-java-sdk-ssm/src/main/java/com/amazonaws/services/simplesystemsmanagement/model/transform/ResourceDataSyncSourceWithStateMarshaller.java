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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDataSyncSourceWithStateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDataSyncSourceWithStateMarshaller {

    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<StructuredPojo> AWSORGANIZATIONSSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsOrganizationsSource").build();
    private static final MarshallingInfo<List> SOURCEREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceRegions").build();
    private static final MarshallingInfo<Boolean> INCLUDEFUTUREREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeFutureRegions").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<Boolean> ENABLEALLOPSDATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableAllOpsDataSources").build();

    private static final ResourceDataSyncSourceWithStateMarshaller instance = new ResourceDataSyncSourceWithStateMarshaller();

    public static ResourceDataSyncSourceWithStateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDataSyncSourceWithState resourceDataSyncSourceWithState, ProtocolMarshaller protocolMarshaller) {

        if (resourceDataSyncSourceWithState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getAwsOrganizationsSource(), AWSORGANIZATIONSSOURCE_BINDING);
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getSourceRegions(), SOURCEREGIONS_BINDING);
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getIncludeFutureRegions(), INCLUDEFUTUREREGIONS_BINDING);
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getState(), STATE_BINDING);
            protocolMarshaller.marshall(resourceDataSyncSourceWithState.getEnableAllOpsDataSources(), ENABLEALLOPSDATASOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
