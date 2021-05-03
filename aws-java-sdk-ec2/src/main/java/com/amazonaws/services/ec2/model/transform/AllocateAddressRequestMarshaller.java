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
 * AllocateAddressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateAddressRequestMarshaller implements Marshaller<Request<AllocateAddressRequest>, AllocateAddressRequest> {

    public Request<AllocateAddressRequest> marshall(AllocateAddressRequest allocateAddressRequest) {

        if (allocateAddressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocateAddressRequest> request = new DefaultRequest<AllocateAddressRequest>(allocateAddressRequest, "AmazonEC2");
        request.addParameter("Action", "AllocateAddress");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (allocateAddressRequest.getDomain() != null) {
            request.addParameter("Domain", StringUtils.fromString(allocateAddressRequest.getDomain()));
        }

        if (allocateAddressRequest.getAddress() != null) {
            request.addParameter("Address", StringUtils.fromString(allocateAddressRequest.getAddress()));
        }

        if (allocateAddressRequest.getPublicIpv4Pool() != null) {
            request.addParameter("PublicIpv4Pool", StringUtils.fromString(allocateAddressRequest.getPublicIpv4Pool()));
        }

        if (allocateAddressRequest.getNetworkBorderGroup() != null) {
            request.addParameter("NetworkBorderGroup", StringUtils.fromString(allocateAddressRequest.getNetworkBorderGroup()));
        }

        if (allocateAddressRequest.getCustomerOwnedIpv4Pool() != null) {
            request.addParameter("CustomerOwnedIpv4Pool", StringUtils.fromString(allocateAddressRequest.getCustomerOwnedIpv4Pool()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> allocateAddressRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) allocateAddressRequest
                .getTagSpecifications();
        if (!allocateAddressRequestTagSpecificationsList.isEmpty() || !allocateAddressRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification allocateAddressRequestTagSpecificationsListValue : allocateAddressRequestTagSpecificationsList) {

                if (allocateAddressRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(allocateAddressRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) allocateAddressRequestTagSpecificationsListValue
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
