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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

/**
 * GetHealthCheckLastFailureReasonRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthCheckLastFailureReasonRequestMarshaller implements
        Marshaller<Request<GetHealthCheckLastFailureReasonRequest>, GetHealthCheckLastFailureReasonRequest> {

    public Request<GetHealthCheckLastFailureReasonRequest> marshall(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest) {

        if (getHealthCheckLastFailureReasonRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetHealthCheckLastFailureReasonRequest> request = new DefaultRequest<GetHealthCheckLastFailureReasonRequest>(
                getHealthCheckLastFailureReasonRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/healthcheck/{HealthCheckId}/lastfailurereason";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "HealthCheckId",
                getHealthCheckLastFailureReasonRequest.getHealthCheckId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
