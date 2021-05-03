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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTrailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTrailRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3KeyPrefix").build();
    private static final MarshallingInfo<String> SNSTOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicName").build();
    private static final MarshallingInfo<Boolean> INCLUDEGLOBALSERVICEEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeGlobalServiceEvents").build();
    private static final MarshallingInfo<Boolean> ISMULTIREGIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsMultiRegionTrail").build();
    private static final MarshallingInfo<Boolean> ENABLELOGFILEVALIDATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableLogFileValidation").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsLogGroupArn").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsRoleArn").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> ISORGANIZATIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsOrganizationTrail").build();
    private static final MarshallingInfo<List> TAGSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagsList").build();

    private static final CreateTrailRequestMarshaller instance = new CreateTrailRequestMarshaller();

    public static CreateTrailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTrailRequest createTrailRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTrailRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getSnsTopicName(), SNSTOPICNAME_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getIncludeGlobalServiceEvents(), INCLUDEGLOBALSERVICEEVENTS_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getIsMultiRegionTrail(), ISMULTIREGIONTRAIL_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getEnableLogFileValidation(), ENABLELOGFILEVALIDATION_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getCloudWatchLogsLogGroupArn(), CLOUDWATCHLOGSLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getCloudWatchLogsRoleArn(), CLOUDWATCHLOGSROLEARN_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getIsOrganizationTrail(), ISORGANIZATIONTRAIL_BINDING);
            protocolMarshaller.marshall(createTrailRequest.getTagsList(), TAGSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
