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
 * ProvisionByoipCidrRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionByoipCidrRequestMarshaller implements Marshaller<Request<ProvisionByoipCidrRequest>, ProvisionByoipCidrRequest> {

    public Request<ProvisionByoipCidrRequest> marshall(ProvisionByoipCidrRequest provisionByoipCidrRequest) {

        if (provisionByoipCidrRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ProvisionByoipCidrRequest> request = new DefaultRequest<ProvisionByoipCidrRequest>(provisionByoipCidrRequest, "AmazonEC2");
        request.addParameter("Action", "ProvisionByoipCidr");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (provisionByoipCidrRequest.getCidr() != null) {
            request.addParameter("Cidr", StringUtils.fromString(provisionByoipCidrRequest.getCidr()));
        }

        CidrAuthorizationContext cidrAuthorizationContext = provisionByoipCidrRequest.getCidrAuthorizationContext();
        if (cidrAuthorizationContext != null) {

            if (cidrAuthorizationContext.getMessage() != null) {
                request.addParameter("CidrAuthorizationContext.Message", StringUtils.fromString(cidrAuthorizationContext.getMessage()));
            }

            if (cidrAuthorizationContext.getSignature() != null) {
                request.addParameter("CidrAuthorizationContext.Signature", StringUtils.fromString(cidrAuthorizationContext.getSignature()));
            }
        }

        if (provisionByoipCidrRequest.getPubliclyAdvertisable() != null) {
            request.addParameter("PubliclyAdvertisable", StringUtils.fromBoolean(provisionByoipCidrRequest.getPubliclyAdvertisable()));
        }

        if (provisionByoipCidrRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(provisionByoipCidrRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> provisionByoipCidrRequestPoolTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) provisionByoipCidrRequest
                .getPoolTagSpecifications();
        if (!provisionByoipCidrRequestPoolTagSpecificationsList.isEmpty() || !provisionByoipCidrRequestPoolTagSpecificationsList.isAutoConstruct()) {
            int poolTagSpecificationsListIndex = 1;

            for (TagSpecification provisionByoipCidrRequestPoolTagSpecificationsListValue : provisionByoipCidrRequestPoolTagSpecificationsList) {

                if (provisionByoipCidrRequestPoolTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("PoolTagSpecification." + poolTagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(provisionByoipCidrRequestPoolTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) provisionByoipCidrRequestPoolTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("PoolTagSpecification." + poolTagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("PoolTagSpecification." + poolTagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                poolTagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
