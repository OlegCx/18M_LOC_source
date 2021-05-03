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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetDashboardEmbedUrlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetDashboardEmbedUrlRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> DASHBOARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DashboardId").build();
    private static final MarshallingInfo<String> IDENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("creds-type").build();
    private static final MarshallingInfo<Long> SESSIONLIFETIMEINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("session-lifetime").build();
    private static final MarshallingInfo<Boolean> UNDOREDODISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("undo-redo-disabled").build();
    private static final MarshallingInfo<Boolean> RESETDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("reset-disabled").build();
    private static final MarshallingInfo<Boolean> STATEPERSISTENCEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("state-persistence-enabled").build();
    private static final MarshallingInfo<String> USERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("user-arn").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("namespace").build();
    private static final MarshallingInfo<List> ADDITIONALDASHBOARDIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("additional-dashboard-ids").build();

    private static final GetDashboardEmbedUrlRequestMarshaller instance = new GetDashboardEmbedUrlRequestMarshaller();

    public static GetDashboardEmbedUrlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest, ProtocolMarshaller protocolMarshaller) {

        if (getDashboardEmbedUrlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getDashboardId(), DASHBOARDID_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getIdentityType(), IDENTITYTYPE_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getSessionLifetimeInMinutes(), SESSIONLIFETIMEINMINUTES_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getUndoRedoDisabled(), UNDOREDODISABLED_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getResetDisabled(), RESETDISABLED_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getStatePersistenceEnabled(), STATEPERSISTENCEENABLED_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getUserArn(), USERARN_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(getDashboardEmbedUrlRequest.getAdditionalDashboardIds(), ADDITIONALDASHBOARDIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
