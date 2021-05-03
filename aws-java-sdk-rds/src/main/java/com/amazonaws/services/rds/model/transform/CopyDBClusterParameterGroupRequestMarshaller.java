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
 * CopyDBClusterParameterGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBClusterParameterGroupRequestMarshaller implements
        Marshaller<Request<CopyDBClusterParameterGroupRequest>, CopyDBClusterParameterGroupRequest> {

    public Request<CopyDBClusterParameterGroupRequest> marshall(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest) {

        if (copyDBClusterParameterGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyDBClusterParameterGroupRequest> request = new DefaultRequest<CopyDBClusterParameterGroupRequest>(copyDBClusterParameterGroupRequest,
                "AmazonRDS");
        request.addParameter("Action", "CopyDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyDBClusterParameterGroupRequest.getSourceDBClusterParameterGroupIdentifier() != null) {
            request.addParameter("SourceDBClusterParameterGroupIdentifier",
                    StringUtils.fromString(copyDBClusterParameterGroupRequest.getSourceDBClusterParameterGroupIdentifier()));
        }

        if (copyDBClusterParameterGroupRequest.getTargetDBClusterParameterGroupIdentifier() != null) {
            request.addParameter("TargetDBClusterParameterGroupIdentifier",
                    StringUtils.fromString(copyDBClusterParameterGroupRequest.getTargetDBClusterParameterGroupIdentifier()));
        }

        if (copyDBClusterParameterGroupRequest.getTargetDBClusterParameterGroupDescription() != null) {
            request.addParameter("TargetDBClusterParameterGroupDescription",
                    StringUtils.fromString(copyDBClusterParameterGroupRequest.getTargetDBClusterParameterGroupDescription()));
        }

        if (!copyDBClusterParameterGroupRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) copyDBClusterParameterGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copyDBClusterParameterGroupRequest.getTags();
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
