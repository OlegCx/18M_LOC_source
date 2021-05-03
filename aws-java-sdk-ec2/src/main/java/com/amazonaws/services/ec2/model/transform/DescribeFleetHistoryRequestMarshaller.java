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
 * DescribeFleetHistoryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetHistoryRequestMarshaller implements Marshaller<Request<DescribeFleetHistoryRequest>, DescribeFleetHistoryRequest> {

    public Request<DescribeFleetHistoryRequest> marshall(DescribeFleetHistoryRequest describeFleetHistoryRequest) {

        if (describeFleetHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFleetHistoryRequest> request = new DefaultRequest<DescribeFleetHistoryRequest>(describeFleetHistoryRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFleetHistory");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeFleetHistoryRequest.getEventType() != null) {
            request.addParameter("EventType", StringUtils.fromString(describeFleetHistoryRequest.getEventType()));
        }

        if (describeFleetHistoryRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFleetHistoryRequest.getMaxResults()));
        }

        if (describeFleetHistoryRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFleetHistoryRequest.getNextToken()));
        }

        if (describeFleetHistoryRequest.getFleetId() != null) {
            request.addParameter("FleetId", StringUtils.fromString(describeFleetHistoryRequest.getFleetId()));
        }

        if (describeFleetHistoryRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeFleetHistoryRequest.getStartTime()));
        }

        return request;
    }

}
