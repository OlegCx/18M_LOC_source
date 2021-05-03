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
 * CreateApplicationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequestMarshaller implements Marshaller<Request<CreateApplicationRequest>, CreateApplicationRequest> {

    public Request<CreateApplicationRequest> marshall(CreateApplicationRequest createApplicationRequest) {

        if (createApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateApplicationRequest> request = new DefaultRequest<CreateApplicationRequest>(createApplicationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateApplication");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createApplicationRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(createApplicationRequest.getApplicationName()));
        }

        if (createApplicationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createApplicationRequest.getDescription()));
        }

        {
            ApplicationResourceLifecycleConfig resourceLifecycleConfig = createApplicationRequest.getResourceLifecycleConfig();
            if (resourceLifecycleConfig != null) {

                if (resourceLifecycleConfig.getServiceRole() != null) {
                    request.addParameter("ResourceLifecycleConfig.ServiceRole", StringUtils.fromString(resourceLifecycleConfig.getServiceRole()));
                }

                {
                    ApplicationVersionLifecycleConfig versionLifecycleConfig = resourceLifecycleConfig.getVersionLifecycleConfig();
                    if (versionLifecycleConfig != null) {

                        {
                            MaxCountRule maxCountRule = versionLifecycleConfig.getMaxCountRule();
                            if (maxCountRule != null) {

                                if (maxCountRule.getEnabled() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.Enabled",
                                            StringUtils.fromBoolean(maxCountRule.getEnabled()));
                                }

                                if (maxCountRule.getMaxCount() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.MaxCount",
                                            StringUtils.fromInteger(maxCountRule.getMaxCount()));
                                }

                                if (maxCountRule.getDeleteSourceFromS3() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.DeleteSourceFromS3",
                                            StringUtils.fromBoolean(maxCountRule.getDeleteSourceFromS3()));
                                }
                            }
                        }

                        {
                            MaxAgeRule maxAgeRule = versionLifecycleConfig.getMaxAgeRule();
                            if (maxAgeRule != null) {

                                if (maxAgeRule.getEnabled() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.Enabled",
                                            StringUtils.fromBoolean(maxAgeRule.getEnabled()));
                                }

                                if (maxAgeRule.getMaxAgeInDays() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.MaxAgeInDays",
                                            StringUtils.fromInteger(maxAgeRule.getMaxAgeInDays()));
                                }

                                if (maxAgeRule.getDeleteSourceFromS3() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.DeleteSourceFromS3",
                                            StringUtils.fromBoolean(maxAgeRule.getDeleteSourceFromS3()));
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!createApplicationRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createApplicationRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createApplicationRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
