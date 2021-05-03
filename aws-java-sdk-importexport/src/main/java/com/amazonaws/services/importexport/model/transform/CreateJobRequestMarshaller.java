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
package com.amazonaws.services.importexport.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateJobRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AmazonImportExport");
        request.addParameter("Action", "CreateJob");
        request.addParameter("Version", "2010-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createJobRequest.getJobType() != null) {
            request.addParameter("JobType", StringUtils.fromString(createJobRequest.getJobType()));
        }

        if (createJobRequest.getManifest() != null) {
            request.addParameter("Manifest", StringUtils.fromString(createJobRequest.getManifest()));
        }

        if (createJobRequest.getManifestAddendum() != null) {
            request.addParameter("ManifestAddendum", StringUtils.fromString(createJobRequest.getManifestAddendum()));
        }

        if (createJobRequest.getValidateOnly() != null) {
            request.addParameter("ValidateOnly", StringUtils.fromBoolean(createJobRequest.getValidateOnly()));
        }

        if (createJobRequest.getAPIVersion() != null) {
            request.addParameter("APIVersion", StringUtils.fromString(createJobRequest.getAPIVersion()));
        }

        return request;
    }

}
