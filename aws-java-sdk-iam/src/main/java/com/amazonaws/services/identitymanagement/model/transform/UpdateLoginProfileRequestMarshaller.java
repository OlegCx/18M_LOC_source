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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateLoginProfileRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLoginProfileRequestMarshaller implements Marshaller<Request<UpdateLoginProfileRequest>, UpdateLoginProfileRequest> {

    public Request<UpdateLoginProfileRequest> marshall(UpdateLoginProfileRequest updateLoginProfileRequest) {

        if (updateLoginProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateLoginProfileRequest> request = new DefaultRequest<UpdateLoginProfileRequest>(updateLoginProfileRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateLoginProfile");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateLoginProfileRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(updateLoginProfileRequest.getUserName()));
        }

        if (updateLoginProfileRequest.getPassword() != null) {
            request.addParameter("Password", StringUtils.fromString(updateLoginProfileRequest.getPassword()));
        }

        if (updateLoginProfileRequest.getPasswordResetRequired() != null) {
            request.addParameter("PasswordResetRequired", StringUtils.fromBoolean(updateLoginProfileRequest.getPasswordResetRequired()));
        }

        return request;
    }

}
