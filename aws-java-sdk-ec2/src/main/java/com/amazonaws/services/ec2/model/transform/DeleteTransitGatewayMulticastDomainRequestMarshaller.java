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
 * DeleteTransitGatewayMulticastDomainRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTransitGatewayMulticastDomainRequestMarshaller implements
        Marshaller<Request<DeleteTransitGatewayMulticastDomainRequest>, DeleteTransitGatewayMulticastDomainRequest> {

    public Request<DeleteTransitGatewayMulticastDomainRequest> marshall(DeleteTransitGatewayMulticastDomainRequest deleteTransitGatewayMulticastDomainRequest) {

        if (deleteTransitGatewayMulticastDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTransitGatewayMulticastDomainRequest> request = new DefaultRequest<DeleteTransitGatewayMulticastDomainRequest>(
                deleteTransitGatewayMulticastDomainRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteTransitGatewayMulticastDomain");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(deleteTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId()));
        }

        return request;
    }

}
