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
 * CreateSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotsRequestMarshaller implements Marshaller<Request<CreateSnapshotsRequest>, CreateSnapshotsRequest> {

    public Request<CreateSnapshotsRequest> marshall(CreateSnapshotsRequest createSnapshotsRequest) {

        if (createSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSnapshotsRequest> request = new DefaultRequest<CreateSnapshotsRequest>(createSnapshotsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateSnapshots");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createSnapshotsRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createSnapshotsRequest.getDescription()));
        }

        InstanceSpecification instanceSpecification = createSnapshotsRequest.getInstanceSpecification();
        if (instanceSpecification != null) {

            if (instanceSpecification.getInstanceId() != null) {
                request.addParameter("InstanceSpecification.InstanceId", StringUtils.fromString(instanceSpecification.getInstanceId()));
            }

            if (instanceSpecification.getExcludeBootVolume() != null) {
                request.addParameter("InstanceSpecification.ExcludeBootVolume", StringUtils.fromBoolean(instanceSpecification.getExcludeBootVolume()));
            }
        }

        if (createSnapshotsRequest.getOutpostArn() != null) {
            request.addParameter("OutpostArn", StringUtils.fromString(createSnapshotsRequest.getOutpostArn()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createSnapshotsRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createSnapshotsRequest
                .getTagSpecifications();
        if (!createSnapshotsRequestTagSpecificationsList.isEmpty() || !createSnapshotsRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createSnapshotsRequestTagSpecificationsListValue : createSnapshotsRequestTagSpecificationsList) {

                if (createSnapshotsRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createSnapshotsRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createSnapshotsRequestTagSpecificationsListValue
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

        if (createSnapshotsRequest.getCopyTagsFromSource() != null) {
            request.addParameter("CopyTagsFromSource", StringUtils.fromString(createSnapshotsRequest.getCopyTagsFromSource()));
        }

        return request;
    }

}
