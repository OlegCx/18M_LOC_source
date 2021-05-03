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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DetectStackSetDriftRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectStackSetDriftRequestMarshaller implements Marshaller<Request<DetectStackSetDriftRequest>, DetectStackSetDriftRequest> {

    public Request<DetectStackSetDriftRequest> marshall(DetectStackSetDriftRequest detectStackSetDriftRequest) {

        if (detectStackSetDriftRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetectStackSetDriftRequest> request = new DefaultRequest<DetectStackSetDriftRequest>(detectStackSetDriftRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DetectStackSetDrift");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (detectStackSetDriftRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(detectStackSetDriftRequest.getStackSetName()));
        }

        {
            StackSetOperationPreferences operationPreferences = detectStackSetDriftRequest.getOperationPreferences();
            if (operationPreferences != null) {

                if (operationPreferences.getRegionConcurrencyType() != null) {
                    request.addParameter("OperationPreferences.RegionConcurrencyType", StringUtils.fromString(operationPreferences.getRegionConcurrencyType()));
                }

                if (operationPreferences.getRegionOrder().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    request.addParameter("OperationPreferences.RegionOrder", "");
                }
                if (!operationPreferences.getRegionOrder().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> regionOrderList = (com.amazonaws.internal.SdkInternalList<String>) operationPreferences
                            .getRegionOrder();
                    int regionOrderListIndex = 1;

                    for (String regionOrderListValue : regionOrderList) {
                        if (regionOrderListValue != null) {
                            request.addParameter("OperationPreferences.RegionOrder.member." + regionOrderListIndex,
                                    StringUtils.fromString(regionOrderListValue));
                        }
                        regionOrderListIndex++;
                    }
                }

                if (operationPreferences.getFailureToleranceCount() != null) {
                    request.addParameter("OperationPreferences.FailureToleranceCount", StringUtils.fromInteger(operationPreferences.getFailureToleranceCount()));
                }

                if (operationPreferences.getFailureTolerancePercentage() != null) {
                    request.addParameter("OperationPreferences.FailureTolerancePercentage",
                            StringUtils.fromInteger(operationPreferences.getFailureTolerancePercentage()));
                }

                if (operationPreferences.getMaxConcurrentCount() != null) {
                    request.addParameter("OperationPreferences.MaxConcurrentCount", StringUtils.fromInteger(operationPreferences.getMaxConcurrentCount()));
                }

                if (operationPreferences.getMaxConcurrentPercentage() != null) {
                    request.addParameter("OperationPreferences.MaxConcurrentPercentage",
                            StringUtils.fromInteger(operationPreferences.getMaxConcurrentPercentage()));
                }
            }
        }

        request.addParameter("OperationId", IdempotentUtils.resolveString(detectStackSetDriftRequest.getOperationId()));

        if (detectStackSetDriftRequest.getCallAs() != null) {
            request.addParameter("CallAs", StringUtils.fromString(detectStackSetDriftRequest.getCallAs()));
        }

        return request;
    }

}
