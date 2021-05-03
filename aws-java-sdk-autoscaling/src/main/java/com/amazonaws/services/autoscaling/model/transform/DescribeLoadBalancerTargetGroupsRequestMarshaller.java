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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeLoadBalancerTargetGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancerTargetGroupsRequestMarshaller implements
        Marshaller<Request<DescribeLoadBalancerTargetGroupsRequest>, DescribeLoadBalancerTargetGroupsRequest> {

    public Request<DescribeLoadBalancerTargetGroupsRequest> marshall(DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest) {

        if (describeLoadBalancerTargetGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLoadBalancerTargetGroupsRequest> request = new DefaultRequest<DescribeLoadBalancerTargetGroupsRequest>(
                describeLoadBalancerTargetGroupsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLoadBalancerTargetGroups");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeLoadBalancerTargetGroupsRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeLoadBalancerTargetGroupsRequest.getAutoScalingGroupName()));
        }

        if (describeLoadBalancerTargetGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLoadBalancerTargetGroupsRequest.getNextToken()));
        }

        if (describeLoadBalancerTargetGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeLoadBalancerTargetGroupsRequest.getMaxRecords()));
        }

        return request;
    }

}
