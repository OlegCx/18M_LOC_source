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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
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

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(copySnapshotRequest, "AmazonElastiCache");
        request.addParameter("Action", "CopySnapshot");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (copySnapshotRequest.getSourceSnapshotName() != null) {
            request.addParameter("SourceSnapshotName", StringUtils.fromString(copySnapshotRequest.getSourceSnapshotName()));
        }

        if (copySnapshotRequest.getTargetSnapshotName() != null) {
            request.addParameter("TargetSnapshotName", StringUtils.fromString(copySnapshotRequest.getTargetSnapshotName()));
        }

        if (copySnapshotRequest.getTargetBucket() != null) {
            request.addParameter("TargetBucket", StringUtils.fromString(copySnapshotRequest.getTargetBucket()));
        }

        if (copySnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(copySnapshotRequest.getKmsKeyId()));
        }

        if (!copySnapshotRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) copySnapshotRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copySnapshotRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
