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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CrawlerTargetsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CrawlerTargetsMarshaller {

    private static final MarshallingInfo<List> S3TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Targets").build();
    private static final MarshallingInfo<List> JDBCTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JdbcTargets").build();
    private static final MarshallingInfo<List> MONGODBTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MongoDBTargets").build();
    private static final MarshallingInfo<List> DYNAMODBTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamoDBTargets").build();
    private static final MarshallingInfo<List> CATALOGTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogTargets").build();

    private static final CrawlerTargetsMarshaller instance = new CrawlerTargetsMarshaller();

    public static CrawlerTargetsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CrawlerTargets crawlerTargets, ProtocolMarshaller protocolMarshaller) {

        if (crawlerTargets == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(crawlerTargets.getS3Targets(), S3TARGETS_BINDING);
            protocolMarshaller.marshall(crawlerTargets.getJdbcTargets(), JDBCTARGETS_BINDING);
            protocolMarshaller.marshall(crawlerTargets.getMongoDBTargets(), MONGODBTARGETS_BINDING);
            protocolMarshaller.marshall(crawlerTargets.getDynamoDBTargets(), DYNAMODBTARGETS_BINDING);
            protocolMarshaller.marshall(crawlerTargets.getCatalogTargets(), CATALOGTARGETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
