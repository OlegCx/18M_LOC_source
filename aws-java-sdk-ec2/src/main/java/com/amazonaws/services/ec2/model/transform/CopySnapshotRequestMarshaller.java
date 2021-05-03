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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CopySnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotRequestMarshaller implements Marshaller<Request<CopySnapshotRequest>, CopySnapshotRequest> {

    public Request<CopySnapshotRequest> marshall(CopySnapshotRequest copySnapshotRequest) {

        if (copySnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(copySnapshotRequest, "AmazonEC2");
        request.addParameter("Action", "CopySnapshot");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (copySnapshotRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(copySnapshotRequest.getDescription()));
        }

        if (copySnapshotRequest.getDestinationOutpostArn() != null) {
            request.addParameter("DestinationOutpostArn", StringUtils.fromString(copySnapshotRequest.getDestinationOutpostArn()));
        }

        if (copySnapshotRequest.getDestinationRegion() != null) {
            request.addParameter("DestinationRegion", StringUtils.fromString(copySnapshotRequest.getDestinationRegion()));
        }

        if (copySnapshotRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(copySnapshotRequest.getEncrypted()));
        }

        if (copySnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(copySnapshotRequest.getKmsKeyId()));
        }

        if (copySnapshotRequest.getPresignedUrl() != null) {
            request.addParameter("PresignedUrl", StringUtils.fromString(copySnapshotRequest.getPresignedUrl()));
        }

        if (copySnapshotRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(copySnapshotRequest.getSourceRegion()));
        }

        if (copySnapshotRequest.getSourceSnapshotId() != null) {
            request.addParameter("SourceSnapshotId", StringUtils.fromString(copySnapshotRequest.getSourceSnapshotId()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> copySnapshotRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) copySnapshotRequest
                .getTagSpecifications();
        if (!copySnapshotRequestTagSpecificationsList.isEmpty() || !copySnapshotRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification copySnapshotRequestTagSpecificationsListValue : copySnapshotRequestTagSpecificationsList) {

                if (copySnapshotRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(copySnapshotRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copySnapshotRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
