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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateNatGatewayRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNatGatewayRequestMarshaller implements Marshaller<Request<CreateNatGatewayRequest>, CreateNatGatewayRequest> {

    public Request<CreateNatGatewayRequest> marshall(CreateNatGatewayRequest createNatGatewayRequest) {

        if (createNatGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNatGatewayRequest> request = new DefaultRequest<CreateNatGatewayRequest>(createNatGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNatGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createNatGatewayRequest.getClientToken()));

        if (createNatGatewayRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createNatGatewayRequest.getSubnetId()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createNatGatewayRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createNatGatewayRequest
                .getTagSpecifications();
        if (!createNatGatewayRequestTagSpecificationsList.isEmpty() || !createNatGatewayRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createNatGatewayRequestTagSpecificationsListValue : createNatGatewayRequestTagSpecificationsList) {

                if (createNatGatewayRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createNatGatewayRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createNatGatewayRequestTagSpecificationsListValue
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

        if (createNatGatewayRequest.getAllocationId() != null) {
            request.addParameter("AllocationId", StringUtils.fromString(createNatGatewayRequest.getAllocationId()));
        }

        return request;
    }

}
