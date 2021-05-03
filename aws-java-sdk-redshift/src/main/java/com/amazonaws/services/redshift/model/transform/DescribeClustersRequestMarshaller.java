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
 * DescribeClustersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersRequestMarshaller implements Marshaller<Request<DescribeClustersRequest>, DescribeClustersRequest> {

    public Request<DescribeClustersRequest> marshall(DescribeClustersRequest describeClustersRequest) {

        if (describeClustersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClustersRequest> request = new DefaultRequest<DescribeClustersRequest>(describeClustersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusters");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClustersRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeClustersRequest.getClusterIdentifier()));
        }

        if (describeClustersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClustersRequest.getMaxRecords()));
        }

        if (describeClustersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClustersRequest.getMarker()));
        }

        if (!describeClustersRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeClustersRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) describeClustersRequest.getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.TagKey." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        if (!describeClustersRequest.getTagValues().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeClustersRequest.getTagValues()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClustersRequest
                    .getTagValues();
            int tagValuesListIndex = 1;

            for (String tagValuesListValue : tagValuesList) {
                if (tagValuesListValue != null) {
                    request.addParameter("TagValues.TagValue." + tagValuesListIndex, StringUtils.fromString(tagValuesListValue));
                }
                tagValuesListIndex++;
            }
        }

        return request;
    }

}
