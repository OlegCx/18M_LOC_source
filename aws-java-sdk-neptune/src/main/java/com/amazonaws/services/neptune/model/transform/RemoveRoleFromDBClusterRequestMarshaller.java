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
package com.amazonaws.services.neptune.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RemoveRoleFromDBClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRoleFromDBClusterRequestMarshaller implements Marshaller<Request<RemoveRoleFromDBClusterRequest>, RemoveRoleFromDBClusterRequest> {

    public Request<RemoveRoleFromDBClusterRequest> marshall(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest) {

        if (removeRoleFromDBClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveRoleFromDBClusterRequest> request = new DefaultRequest<RemoveRoleFromDBClusterRequest>(removeRoleFromDBClusterRequest, "AmazonNeptune");
        request.addParameter("Action", "RemoveRoleFromDBCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeRoleFromDBClusterRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(removeRoleFromDBClusterRequest.getDBClusterIdentifier()));
        }

        if (removeRoleFromDBClusterRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(removeRoleFromDBClusterRequest.getRoleArn()));
        }

        if (removeRoleFromDBClusterRequest.getFeatureName() != null) {
            request.addParameter("FeatureName", StringUtils.fromString(removeRoleFromDBClusterRequest.getFeatureName()));
        }

        return request;
    }

}
