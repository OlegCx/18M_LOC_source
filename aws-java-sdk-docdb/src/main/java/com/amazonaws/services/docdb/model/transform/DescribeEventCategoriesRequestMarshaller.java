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
package com.amazonaws.services.docdb.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeEventCategoriesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventCategoriesRequestMarshaller implements Marshaller<Request<DescribeEventCategoriesRequest>, DescribeEventCategoriesRequest> {

    public Request<DescribeEventCategoriesRequest> marshall(DescribeEventCategoriesRequest describeEventCategoriesRequest) {

        if (describeEventCategoriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEventCategoriesRequest> request = new DefaultRequest<DescribeEventCategoriesRequest>(describeEventCategoriesRequest, "AmazonDocDB");
        request.addParameter("Action", "DescribeEventCategories");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEventCategoriesRequest.getSourceType() != null) {
            request.addParameter("SourceType", StringUtils.fromString(describeEventCategoriesRequest.getSourceType()));
        }

        if (describeEventCategoriesRequest.getFilters() != null) {
            java.util.List<Filter> filtersList = describeEventCategoriesRequest.getFilters();
            if (filtersList.isEmpty()) {
                request.addParameter("Filters", "");
            } else {
                int filtersListIndex = 1;

                for (Filter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        if (filtersListValue.getName() != null) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                        }

                        if (filtersListValue.getValues() != null) {
                            java.util.List<String> valuesList = filtersListValue.getValues();
                            if (valuesList.isEmpty()) {
                                request.addParameter("Filters.Filter." + filtersListIndex + ".Values", "");
                            } else {
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
                    }
                    filtersListIndex++;
                }
            }
        }

        return request;
    }

}
