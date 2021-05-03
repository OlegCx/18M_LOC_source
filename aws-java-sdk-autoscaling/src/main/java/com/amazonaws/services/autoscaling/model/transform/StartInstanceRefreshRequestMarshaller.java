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
 * StartInstanceRefreshRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstanceRefreshRequestMarshaller implements Marshaller<Request<StartInstanceRefreshRequest>, StartInstanceRefreshRequest> {

    public Request<StartInstanceRefreshRequest> marshall(StartInstanceRefreshRequest startInstanceRefreshRequest) {

        if (startInstanceRefreshRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartInstanceRefreshRequest> request = new DefaultRequest<StartInstanceRefreshRequest>(startInstanceRefreshRequest, "AmazonAutoScaling");
        request.addParameter("Action", "StartInstanceRefresh");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (startInstanceRefreshRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(startInstanceRefreshRequest.getAutoScalingGroupName()));
        }

        if (startInstanceRefreshRequest.getStrategy() != null) {
            request.addParameter("Strategy", StringUtils.fromString(startInstanceRefreshRequest.getStrategy()));
        }

        {
            RefreshPreferences preferences = startInstanceRefreshRequest.getPreferences();
            if (preferences != null) {

                if (preferences.getMinHealthyPercentage() != null) {
                    request.addParameter("Preferences.MinHealthyPercentage", StringUtils.fromInteger(preferences.getMinHealthyPercentage()));
                }

                if (preferences.getInstanceWarmup() != null) {
                    request.addParameter("Preferences.InstanceWarmup", StringUtils.fromInteger(preferences.getInstanceWarmup()));
                }

                if (!preferences.getCheckpointPercentages().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Integer>) preferences.getCheckpointPercentages()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Integer> checkpointPercentagesList = (com.amazonaws.internal.SdkInternalList<Integer>) preferences
                            .getCheckpointPercentages();
                    int checkpointPercentagesListIndex = 1;

                    for (Integer checkpointPercentagesListValue : checkpointPercentagesList) {
                        if (checkpointPercentagesListValue != null) {
                            request.addParameter("Preferences.CheckpointPercentages.member." + checkpointPercentagesListIndex,
                                    StringUtils.fromInteger(checkpointPercentagesListValue));
                        }
                        checkpointPercentagesListIndex++;
                    }
                }

                if (preferences.getCheckpointDelay() != null) {
                    request.addParameter("Preferences.CheckpointDelay", StringUtils.fromInteger(preferences.getCheckpointDelay()));
                }
            }
        }

        return request;
    }

}
