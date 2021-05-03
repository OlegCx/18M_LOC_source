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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeAccountLimitsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountLimitsRequestMarshaller implements Marshaller<Request<DescribeAccountLimitsRequest>, DescribeAccountLimitsRequest> {

    public Request<DescribeAccountLimitsRequest> marshall(DescribeAccountLimitsRequest describeAccountLimitsRequest) {

        if (describeAccountLimitsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAccountLimitsRequest> request = new DefaultRequest<DescribeAccountLimitsRequest>(describeAccountLimitsRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeAccountLimits");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeAccountLimitsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeAccountLimitsRequest.getMarker()));
        }

        if (describeAccountLimitsRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeAccountLimitsRequest.getPageSize()));
        }

        return request;
    }

}
