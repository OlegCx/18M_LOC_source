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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeAlarmHistoryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmHistoryRequestMarshaller implements Marshaller<Request<DescribeAlarmHistoryRequest>, DescribeAlarmHistoryRequest> {

    public Request<DescribeAlarmHistoryRequest> marshall(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {

        if (describeAlarmHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAlarmHistoryRequest> request = new DefaultRequest<DescribeAlarmHistoryRequest>(describeAlarmHistoryRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DescribeAlarmHistory");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeAlarmHistoryRequest.getAlarmName() != null) {
            request.addParameter("AlarmName", StringUtils.fromString(describeAlarmHistoryRequest.getAlarmName()));
        }

        if (!describeAlarmHistoryRequest.getAlarmTypes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeAlarmHistoryRequest.getAlarmTypes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> alarmTypesList = (com.amazonaws.internal.SdkInternalList<String>) describeAlarmHistoryRequest
                    .getAlarmTypes();
            int alarmTypesListIndex = 1;

            for (String alarmTypesListValue : alarmTypesList) {
                if (alarmTypesListValue != null) {
                    request.addParameter("AlarmTypes.member." + alarmTypesListIndex, StringUtils.fromString(alarmTypesListValue));
                }
                alarmTypesListIndex++;
            }
        }

        if (describeAlarmHistoryRequest.getHistoryItemType() != null) {
            request.addParameter("HistoryItemType", StringUtils.fromString(describeAlarmHistoryRequest.getHistoryItemType()));
        }

        if (describeAlarmHistoryRequest.getStartDate() != null) {
            request.addParameter("StartDate", StringUtils.fromDate(describeAlarmHistoryRequest.getStartDate()));
        }

        if (describeAlarmHistoryRequest.getEndDate() != null) {
            request.addParameter("EndDate", StringUtils.fromDate(describeAlarmHistoryRequest.getEndDate()));
        }

        if (describeAlarmHistoryRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeAlarmHistoryRequest.getMaxRecords()));
        }

        if (describeAlarmHistoryRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeAlarmHistoryRequest.getNextToken()));
        }

        if (describeAlarmHistoryRequest.getScanBy() != null) {
            request.addParameter("ScanBy", StringUtils.fromString(describeAlarmHistoryRequest.getScanBy()));
        }

        return request;
    }

}
