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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CopyOptionGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyOptionGroupRequestMarshaller implements Marshaller<Request<CopyOptionGroupRequest>, CopyOptionGroupRequest> {

    public Request<CopyOptionGroupRequest> marshall(CopyOptionGroupRequest copyOptionGroupRequest) {

        if (copyOptionGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyOptionGroupRequest> request = new DefaultRequest<CopyOptionGroupRequest>(copyOptionGroupRequest, "AmazonRDS");
        request.addParameter("Action", "CopyOptionGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyOptionGroupRequest.getSourceOptionGroupIdentifier() != null) {
            request.addParameter("SourceOptionGroupIdentifier", StringUtils.fromString(copyOptionGroupRequest.getSourceOptionGroupIdentifier()));
        }

        if (copyOptionGroupRequest.getTargetOptionGroupIdentifier() != null) {
            request.addParameter("TargetOptionGroupIdentifier", StringUtils.fromString(copyOptionGroupRequest.getTargetOptionGroupIdentifier()));
        }

        if (copyOptionGroupRequest.getTargetOptionGroupDescription() != null) {
            request.addParameter("TargetOptionGroupDescription", StringUtils.fromString(copyOptionGroupRequest.getTargetOptionGroupDescription()));
        }

        if (!copyOptionGroupRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) copyOptionGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copyOptionGroupRequest.getTags();
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
