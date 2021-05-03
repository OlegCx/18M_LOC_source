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
 * CreateImageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageRequestMarshaller implements Marshaller<Request<CreateImageRequest>, CreateImageRequest> {

    public Request<CreateImageRequest> marshall(CreateImageRequest createImageRequest) {

        if (createImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateImageRequest> request = new DefaultRequest<CreateImageRequest>(createImageRequest, "AmazonEC2");
        request.addParameter("Action", "CreateImage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> createImageRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createImageRequest
                .getBlockDeviceMappings();
        if (!createImageRequestBlockDeviceMappingsList.isEmpty() || !createImageRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping createImageRequestBlockDeviceMappingsListValue : createImageRequestBlockDeviceMappingsList) {

                if (createImageRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                if (createImageRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getVirtualName()));
                }

                EbsBlockDevice ebs = createImageRequestBlockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                    }

                    if (ebs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                StringUtils.fromString(ebs.getSnapshotId()));
                    }

                    if (ebs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                StringUtils.fromInteger(ebs.getVolumeSize()));
                    }

                    if (ebs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                StringUtils.fromString(ebs.getVolumeType()));
                    }

                    if (ebs.getKmsKeyId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.KmsKeyId", StringUtils.fromString(ebs.getKmsKeyId()));
                    }

                    if (ebs.getThroughput() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Throughput",
                                StringUtils.fromInteger(ebs.getThroughput()));
                    }

                    if (ebs.getOutpostArn() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.OutpostArn",
                                StringUtils.fromString(ebs.getOutpostArn()));
                    }

                    if (ebs.getEncrypted() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                StringUtils.fromBoolean(ebs.getEncrypted()));
                    }
                }

                if (createImageRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (createImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createImageRequest.getDescription()));
        }

        if (createImageRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createImageRequest.getInstanceId()));
        }

        if (createImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createImageRequest.getName()));
        }

        if (createImageRequest.getNoReboot() != null) {
            request.addParameter("NoReboot", StringUtils.fromBoolean(createImageRequest.getNoReboot()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createImageRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createImageRequest
                .getTagSpecifications();
        if (!createImageRequestTagSpecificationsList.isEmpty() || !createImageRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createImageRequestTagSpecificationsListValue : createImageRequestTagSpecificationsList) {

                if (createImageRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createImageRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createImageRequestTagSpecificationsListValue
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
