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
 * CreateFpgaImageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFpgaImageRequestMarshaller implements Marshaller<Request<CreateFpgaImageRequest>, CreateFpgaImageRequest> {

    public Request<CreateFpgaImageRequest> marshall(CreateFpgaImageRequest createFpgaImageRequest) {

        if (createFpgaImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFpgaImageRequest> request = new DefaultRequest<CreateFpgaImageRequest>(createFpgaImageRequest, "AmazonEC2");
        request.addParameter("Action", "CreateFpgaImage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        StorageLocation inputStorageLocation = createFpgaImageRequest.getInputStorageLocation();
        if (inputStorageLocation != null) {

            if (inputStorageLocation.getBucket() != null) {
                request.addParameter("InputStorageLocation.Bucket", StringUtils.fromString(inputStorageLocation.getBucket()));
            }

            if (inputStorageLocation.getKey() != null) {
                request.addParameter("InputStorageLocation.Key", StringUtils.fromString(inputStorageLocation.getKey()));
            }
        }

        StorageLocation logsStorageLocation = createFpgaImageRequest.getLogsStorageLocation();
        if (logsStorageLocation != null) {

            if (logsStorageLocation.getBucket() != null) {
                request.addParameter("LogsStorageLocation.Bucket", StringUtils.fromString(logsStorageLocation.getBucket()));
            }

            if (logsStorageLocation.getKey() != null) {
                request.addParameter("LogsStorageLocation.Key", StringUtils.fromString(logsStorageLocation.getKey()));
            }
        }

        if (createFpgaImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createFpgaImageRequest.getDescription()));
        }

        if (createFpgaImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createFpgaImageRequest.getName()));
        }

        if (createFpgaImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createFpgaImageRequest.getClientToken()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createFpgaImageRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createFpgaImageRequest
                .getTagSpecifications();
        if (!createFpgaImageRequestTagSpecificationsList.isEmpty() || !createFpgaImageRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createFpgaImageRequestTagSpecificationsListValue : createFpgaImageRequestTagSpecificationsList) {

                if (createFpgaImageRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createFpgaImageRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createFpgaImageRequestTagSpecificationsListValue
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
