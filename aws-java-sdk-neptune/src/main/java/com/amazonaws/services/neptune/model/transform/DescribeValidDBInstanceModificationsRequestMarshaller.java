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
 * DescribeValidDBInstanceModificationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeValidDBInstanceModificationsRequestMarshaller implements
        Marshaller<Request<DescribeValidDBInstanceModificationsRequest>, DescribeValidDBInstanceModificationsRequest> {

    public Request<DescribeValidDBInstanceModificationsRequest> marshall(DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest) {

        if (describeValidDBInstanceModificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeValidDBInstanceModificationsRequest> request = new DefaultRequest<DescribeValidDBInstanceModificationsRequest>(
                describeValidDBInstanceModificationsRequest, "AmazonNeptune");
        request.addParameter("Action", "DescribeValidDBInstanceModifications");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeValidDBInstanceModificationsRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeValidDBInstanceModificationsRequest.getDBInstanceIdentifier()));
        }

        return request;
    }

}
