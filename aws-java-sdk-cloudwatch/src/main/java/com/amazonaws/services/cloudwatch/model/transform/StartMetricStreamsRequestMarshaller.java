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
 * StartMetricStreamsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetricStreamsRequestMarshaller implements Marshaller<Request<StartMetricStreamsRequest>, StartMetricStreamsRequest> {

    public Request<StartMetricStreamsRequest> marshall(StartMetricStreamsRequest startMetricStreamsRequest) {

        if (startMetricStreamsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartMetricStreamsRequest> request = new DefaultRequest<StartMetricStreamsRequest>(startMetricStreamsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "StartMetricStreams");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!startMetricStreamsRequest.getNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) startMetricStreamsRequest.getNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> namesList = (com.amazonaws.internal.SdkInternalList<String>) startMetricStreamsRequest.getNames();
            int namesListIndex = 1;

            for (String namesListValue : namesList) {
                if (namesListValue != null) {
                    request.addParameter("Names.member." + namesListIndex, StringUtils.fromString(namesListValue));
                }
                namesListIndex++;
            }
        }

        return request;
    }

}
