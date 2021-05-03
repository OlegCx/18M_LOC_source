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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteDBClusterEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBClusterEndpointRequestMarshaller implements Marshaller<Request<DeleteDBClusterEndpointRequest>, DeleteDBClusterEndpointRequest> {

    public Request<DeleteDBClusterEndpointRequest> marshall(DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest) {

        if (deleteDBClusterEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteDBClusterEndpointRequest> request = new DefaultRequest<DeleteDBClusterEndpointRequest>(deleteDBClusterEndpointRequest, "AmazonRDS");
        request.addParameter("Action", "DeleteDBClusterEndpoint");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteDBClusterEndpointRequest.getDBClusterEndpointIdentifier() != null) {
            request.addParameter("DBClusterEndpointIdentifier", StringUtils.fromString(deleteDBClusterEndpointRequest.getDBClusterEndpointIdentifier()));
        }

        return request;
    }

}
