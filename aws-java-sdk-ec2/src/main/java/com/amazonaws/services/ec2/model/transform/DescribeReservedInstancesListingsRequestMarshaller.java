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
 * DescribeReservedInstancesListingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesListingsRequestMarshaller implements
        Marshaller<Request<DescribeReservedInstancesListingsRequest>, DescribeReservedInstancesListingsRequest> {

    public Request<DescribeReservedInstancesListingsRequest> marshall(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest) {

        if (describeReservedInstancesListingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedInstancesListingsRequest> request = new DefaultRequest<DescribeReservedInstancesListingsRequest>(
                describeReservedInstancesListingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstancesListings");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeReservedInstancesListingsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReservedInstancesListingsRequest
                .getFilters();
        if (!describeReservedInstancesListingsRequestFiltersList.isEmpty() || !describeReservedInstancesListingsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeReservedInstancesListingsRequestFiltersListValue : describeReservedInstancesListingsRequestFiltersList) {

                if (describeReservedInstancesListingsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeReservedInstancesListingsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesListingsRequestFiltersListValue
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

        if (describeReservedInstancesListingsRequest.getReservedInstancesId() != null) {
            request.addParameter("ReservedInstancesId", StringUtils.fromString(describeReservedInstancesListingsRequest.getReservedInstancesId()));
        }

        if (describeReservedInstancesListingsRequest.getReservedInstancesListingId() != null) {
            request.addParameter("ReservedInstancesListingId", StringUtils.fromString(describeReservedInstancesListingsRequest.getReservedInstancesListingId()));
        }

        return request;
    }

}
