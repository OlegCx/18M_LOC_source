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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateConfigurationSetReputationMetricsEnabledRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetReputationMetricsEnabledRequestMarshaller implements
        Marshaller<Request<UpdateConfigurationSetReputationMetricsEnabledRequest>, UpdateConfigurationSetReputationMetricsEnabledRequest> {

    public Request<UpdateConfigurationSetReputationMetricsEnabledRequest> marshall(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest) {

        if (updateConfigurationSetReputationMetricsEnabledRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateConfigurationSetReputationMetricsEnabledRequest> request = new DefaultRequest<UpdateConfigurationSetReputationMetricsEnabledRequest>(
                updateConfigurationSetReputationMetricsEnabledRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "UpdateConfigurationSetReputationMetricsEnabled");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateConfigurationSetReputationMetricsEnabledRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName",
                    StringUtils.fromString(updateConfigurationSetReputationMetricsEnabledRequest.getConfigurationSetName()));
        }

        if (updateConfigurationSetReputationMetricsEnabledRequest.getEnabled() != null) {
            request.addParameter("Enabled", StringUtils.fromBoolean(updateConfigurationSetReputationMetricsEnabledRequest.getEnabled()));
        }

        return request;
    }

}
