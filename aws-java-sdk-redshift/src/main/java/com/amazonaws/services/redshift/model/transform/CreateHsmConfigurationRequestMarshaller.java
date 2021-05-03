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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateHsmConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmConfigurationRequestMarshaller implements Marshaller<Request<CreateHsmConfigurationRequest>, CreateHsmConfigurationRequest> {

    public Request<CreateHsmConfigurationRequest> marshall(CreateHsmConfigurationRequest createHsmConfigurationRequest) {

        if (createHsmConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateHsmConfigurationRequest> request = new DefaultRequest<CreateHsmConfigurationRequest>(createHsmConfigurationRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateHsmConfiguration");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createHsmConfigurationRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(createHsmConfigurationRequest.getHsmConfigurationIdentifier()));
        }

        if (createHsmConfigurationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createHsmConfigurationRequest.getDescription()));
        }

        if (createHsmConfigurationRequest.getHsmIpAddress() != null) {
            request.addParameter("HsmIpAddress", StringUtils.fromString(createHsmConfigurationRequest.getHsmIpAddress()));
        }

        if (createHsmConfigurationRequest.getHsmPartitionName() != null) {
            request.addParameter("HsmPartitionName", StringUtils.fromString(createHsmConfigurationRequest.getHsmPartitionName()));
        }

        if (createHsmConfigurationRequest.getHsmPartitionPassword() != null) {
            request.addParameter("HsmPartitionPassword", StringUtils.fromString(createHsmConfigurationRequest.getHsmPartitionPassword()));
        }

        if (createHsmConfigurationRequest.getHsmServerPublicCertificate() != null) {
            request.addParameter("HsmServerPublicCertificate", StringUtils.fromString(createHsmConfigurationRequest.getHsmServerPublicCertificate()));
        }

        if (!createHsmConfigurationRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createHsmConfigurationRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createHsmConfigurationRequest.getTags();
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
