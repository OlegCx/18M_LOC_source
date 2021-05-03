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
 * DescribeLocalGatewayVirtualInterfaceGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayVirtualInterfaceGroupsRequestMarshaller implements
        Marshaller<Request<DescribeLocalGatewayVirtualInterfaceGroupsRequest>, DescribeLocalGatewayVirtualInterfaceGroupsRequest> {

    public Request<DescribeLocalGatewayVirtualInterfaceGroupsRequest> marshall(
            DescribeLocalGatewayVirtualInterfaceGroupsRequest describeLocalGatewayVirtualInterfaceGroupsRequest) {

        if (describeLocalGatewayVirtualInterfaceGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalGatewayVirtualInterfaceGroupsRequest> request = new DefaultRequest<DescribeLocalGatewayVirtualInterfaceGroupsRequest>(
                describeLocalGatewayVirtualInterfaceGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLocalGatewayVirtualInterfaceGroups");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayVirtualInterfaceGroupsRequest
                .getLocalGatewayVirtualInterfaceGroupIds();
        if (!describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsList.isEmpty()
                || !describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsList.isAutoConstruct()) {
            int localGatewayVirtualInterfaceGroupIdsListIndex = 1;

            for (String describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsListValue : describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsList) {
                if (describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsListValue != null) {
                    request.addParameter("LocalGatewayVirtualInterfaceGroupId." + localGatewayVirtualInterfaceGroupIdsListIndex,
                            StringUtils.fromString(describeLocalGatewayVirtualInterfaceGroupsRequestLocalGatewayVirtualInterfaceGroupIdsListValue));
                }
                localGatewayVirtualInterfaceGroupIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLocalGatewayVirtualInterfaceGroupsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLocalGatewayVirtualInterfaceGroupsRequest
                .getFilters();
        if (!describeLocalGatewayVirtualInterfaceGroupsRequestFiltersList.isEmpty()
                || !describeLocalGatewayVirtualInterfaceGroupsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLocalGatewayVirtualInterfaceGroupsRequestFiltersListValue : describeLocalGatewayVirtualInterfaceGroupsRequestFiltersList) {

                if (describeLocalGatewayVirtualInterfaceGroupsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLocalGatewayVirtualInterfaceGroupsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayVirtualInterfaceGroupsRequestFiltersListValue
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

        if (describeLocalGatewayVirtualInterfaceGroupsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLocalGatewayVirtualInterfaceGroupsRequest.getMaxResults()));
        }

        if (describeLocalGatewayVirtualInterfaceGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLocalGatewayVirtualInterfaceGroupsRequest.getNextToken()));
        }

        return request;
    }

}
