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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreatePolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyRequestMarshaller implements Marshaller<Request<CreatePolicyRequest>, CreatePolicyRequest> {

    public Request<CreatePolicyRequest> marshall(CreatePolicyRequest createPolicyRequest) {

        if (createPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePolicyRequest> request = new DefaultRequest<CreatePolicyRequest>(createPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "CreatePolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (createPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(createPolicyRequest.getPolicyName()));
        }

        if (createPolicyRequest.getPath() != null) {
            request.addParameter("Path", StringUtils.fromString(createPolicyRequest.getPath()));
        }

        if (createPolicyRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(createPolicyRequest.getPolicyDocument()));
        }

        if (createPolicyRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createPolicyRequest.getDescription()));
        }

        if (!createPolicyRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createPolicyRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createPolicyRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
