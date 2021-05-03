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
 * UpdateRoleDescriptionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoleDescriptionRequestMarshaller implements Marshaller<Request<UpdateRoleDescriptionRequest>, UpdateRoleDescriptionRequest> {

    public Request<UpdateRoleDescriptionRequest> marshall(UpdateRoleDescriptionRequest updateRoleDescriptionRequest) {

        if (updateRoleDescriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateRoleDescriptionRequest> request = new DefaultRequest<UpdateRoleDescriptionRequest>(updateRoleDescriptionRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateRoleDescription");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateRoleDescriptionRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(updateRoleDescriptionRequest.getRoleName()));
        }

        if (updateRoleDescriptionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(updateRoleDescriptionRequest.getDescription()));
        }

        return request;
    }

}
