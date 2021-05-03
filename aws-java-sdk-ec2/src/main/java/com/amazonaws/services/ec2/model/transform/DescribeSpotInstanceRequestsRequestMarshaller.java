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
 * DescribeSpotInstanceRequestsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotInstanceRequestsRequestMarshaller implements
        Marshaller<Request<DescribeSpotInstanceRequestsRequest>, DescribeSpotInstanceRequestsRequest> {

    public Request<DescribeSpotInstanceRequestsRequest> marshall(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest) {

        if (describeSpotInstanceRequestsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSpotInstanceRequestsRequest> request = new DefaultRequest<DescribeSpotInstanceRequestsRequest>(describeSpotInstanceRequestsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeSpotInstanceRequests");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeSpotInstanceRequestsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSpotInstanceRequestsRequest
                .getFilters();
        if (!describeSpotInstanceRequestsRequestFiltersList.isEmpty() || !describeSpotInstanceRequestsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSpotInstanceRequestsRequestFiltersListValue : describeSpotInstanceRequestsRequestFiltersList) {

                if (describeSpotInstanceRequestsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeSpotInstanceRequestsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSpotInstanceRequestsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeSpotInstanceRequestsRequestSpotInstanceRequestIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSpotInstanceRequestsRequest
                .getSpotInstanceRequestIds();
        if (!describeSpotInstanceRequestsRequestSpotInstanceRequestIdsList.isEmpty()
                || !describeSpotInstanceRequestsRequestSpotInstanceRequestIdsList.isAutoConstruct()) {
            int spotInstanceRequestIdsListIndex = 1;

            for (String describeSpotInstanceRequestsRequestSpotInstanceRequestIdsListValue : describeSpotInstanceRequestsRequestSpotInstanceRequestIdsList) {
                if (describeSpotInstanceRequestsRequestSpotInstanceRequestIdsListValue != null) {
                    request.addParameter("SpotInstanceRequestId." + spotInstanceRequestIdsListIndex,
                            StringUtils.fromString(describeSpotInstanceRequestsRequestSpotInstanceRequestIdsListValue));
                }
                spotInstanceRequestIdsListIndex++;
            }
        }

        if (describeSpotInstanceRequestsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSpotInstanceRequestsRequest.getNextToken()));
        }

        if (describeSpotInstanceRequestsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSpotInstanceRequestsRequest.getMaxResults()));
        }

        return request;
    }

}
