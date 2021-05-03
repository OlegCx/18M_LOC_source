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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AddSourceIdentifierToSubscriptionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddSourceIdentifierToSubscriptionRequestMarshaller implements
        Marshaller<Request<AddSourceIdentifierToSubscriptionRequest>, AddSourceIdentifierToSubscriptionRequest> {

    public Request<AddSourceIdentifierToSubscriptionRequest> marshall(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest) {

        if (addSourceIdentifierToSubscriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddSourceIdentifierToSubscriptionRequest> request = new DefaultRequest<AddSourceIdentifierToSubscriptionRequest>(
                addSourceIdentifierToSubscriptionRequest, "AmazonDocDB");
        request.addParameter("Action", "AddSourceIdentifierToSubscription");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (addSourceIdentifierToSubscriptionRequest.getSubscriptionName() != null) {
            request.addParameter("SubscriptionName", StringUtils.fromString(addSourceIdentifierToSubscriptionRequest.getSubscriptionName()));
        }

        if (addSourceIdentifierToSubscriptionRequest.getSourceIdentifier() != null) {
            request.addParameter("SourceIdentifier", StringUtils.fromString(addSourceIdentifierToSubscriptionRequest.getSourceIdentifier()));
        }

        return request;
    }

}
