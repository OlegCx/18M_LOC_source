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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeCacheClustersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheClustersRequestMarshaller implements Marshaller<Request<DescribeCacheClustersRequest>, DescribeCacheClustersRequest> {

    public Request<DescribeCacheClustersRequest> marshall(DescribeCacheClustersRequest describeCacheClustersRequest) {

        if (describeCacheClustersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCacheClustersRequest> request = new DefaultRequest<DescribeCacheClustersRequest>(describeCacheClustersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheClusters");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeCacheClustersRequest.getCacheClusterId() != null) {
            request.addParameter("CacheClusterId", StringUtils.fromString(describeCacheClustersRequest.getCacheClusterId()));
        }

        if (describeCacheClustersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheClustersRequest.getMaxRecords()));
        }

        if (describeCacheClustersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheClustersRequest.getMarker()));
        }

        if (describeCacheClustersRequest.getShowCacheNodeInfo() != null) {
            request.addParameter("ShowCacheNodeInfo", StringUtils.fromBoolean(describeCacheClustersRequest.getShowCacheNodeInfo()));
        }

        if (describeCacheClustersRequest.getShowCacheClustersNotInReplicationGroups() != null) {
            request.addParameter("ShowCacheClustersNotInReplicationGroups",
                    StringUtils.fromBoolean(describeCacheClustersRequest.getShowCacheClustersNotInReplicationGroups()));
        }

        return request;
    }

}
