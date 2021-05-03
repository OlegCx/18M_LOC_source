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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RemoveRoleFromDBInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRoleFromDBInstanceRequestMarshaller implements Marshaller<Request<RemoveRoleFromDBInstanceRequest>, RemoveRoleFromDBInstanceRequest> {

    public Request<RemoveRoleFromDBInstanceRequest> marshall(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest) {

        if (removeRoleFromDBInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveRoleFromDBInstanceRequest> request = new DefaultRequest<RemoveRoleFromDBInstanceRequest>(removeRoleFromDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "RemoveRoleFromDBInstance");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeRoleFromDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(removeRoleFromDBInstanceRequest.getDBInstanceIdentifier()));
        }

        if (removeRoleFromDBInstanceRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(removeRoleFromDBInstanceRequest.getRoleArn()));
        }

        if (removeRoleFromDBInstanceRequest.getFeatureName() != null) {
            request.addParameter("FeatureName", StringUtils.fromString(removeRoleFromDBInstanceRequest.getFeatureName()));
        }

        return request;
    }

}
