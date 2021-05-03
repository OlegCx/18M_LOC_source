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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeEnvironmentManagedActionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentManagedActionsRequestMarshaller implements
        Marshaller<Request<DescribeEnvironmentManagedActionsRequest>, DescribeEnvironmentManagedActionsRequest> {

    public Request<DescribeEnvironmentManagedActionsRequest> marshall(DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest) {

        if (describeEnvironmentManagedActionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEnvironmentManagedActionsRequest> request = new DefaultRequest<DescribeEnvironmentManagedActionsRequest>(
                describeEnvironmentManagedActionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironmentManagedActions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEnvironmentManagedActionsRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(describeEnvironmentManagedActionsRequest.getEnvironmentName()));
        }

        if (describeEnvironmentManagedActionsRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(describeEnvironmentManagedActionsRequest.getEnvironmentId()));
        }

        if (describeEnvironmentManagedActionsRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(describeEnvironmentManagedActionsRequest.getStatus()));
        }

        return request;
    }

}
