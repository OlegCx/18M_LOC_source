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
 * DescribeDBProxyTargetGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBProxyTargetGroupsRequestMarshaller implements
        Marshaller<Request<DescribeDBProxyTargetGroupsRequest>, DescribeDBProxyTargetGroupsRequest> {

    public Request<DescribeDBProxyTargetGroupsRequest> marshall(DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest) {

        if (describeDBProxyTargetGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBProxyTargetGroupsRequest> request = new DefaultRequest<DescribeDBProxyTargetGroupsRequest>(describeDBProxyTargetGroupsRequest,
                "AmazonRDS");
        request.addParameter("Action", "DescribeDBProxyTargetGroups");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBProxyTargetGroupsRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(describeDBProxyTargetGroupsRequest.getDBProxyName()));
        }

        if (describeDBProxyTargetGroupsRequest.getTargetGroupName() != null) {
            request.addParameter("TargetGroupName", StringUtils.fromString(describeDBProxyTargetGroupsRequest.getTargetGroupName()));
        }

        if (!describeDBProxyTargetGroupsRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeDBProxyTargetGroupsRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDBProxyTargetGroupsRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {
                if (filtersListValue != null) {

                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }

                    if (!filtersListValue.getValues().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                                .getValues();
                        int valuesListIndex = 1;

                        for (String valuesListValue : valuesList) {
                            if (valuesListValue != null) {
                                request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                        StringUtils.fromString(valuesListValue));
                            }
                            valuesListIndex++;
                        }
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeDBProxyTargetGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBProxyTargetGroupsRequest.getMarker()));
        }

        if (describeDBProxyTargetGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBProxyTargetGroupsRequest.getMaxRecords()));
        }

        return request;
    }

}
