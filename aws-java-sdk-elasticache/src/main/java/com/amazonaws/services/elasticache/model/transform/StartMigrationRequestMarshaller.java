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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StartMigrationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMigrationRequestMarshaller implements Marshaller<Request<StartMigrationRequest>, StartMigrationRequest> {

    public Request<StartMigrationRequest> marshall(StartMigrationRequest startMigrationRequest) {

        if (startMigrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartMigrationRequest> request = new DefaultRequest<StartMigrationRequest>(startMigrationRequest, "AmazonElastiCache");
        request.addParameter("Action", "StartMigration");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (startMigrationRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(startMigrationRequest.getReplicationGroupId()));
        }

        if (!startMigrationRequest.getCustomerNodeEndpointList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint>) startMigrationRequest.getCustomerNodeEndpointList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint> customerNodeEndpointListList = (com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint>) startMigrationRequest
                    .getCustomerNodeEndpointList();
            int customerNodeEndpointListListIndex = 1;

            for (CustomerNodeEndpoint customerNodeEndpointListListValue : customerNodeEndpointListList) {
                if (customerNodeEndpointListListValue != null) {

                    if (customerNodeEndpointListListValue.getAddress() != null) {
                        request.addParameter("CustomerNodeEndpointList.member." + customerNodeEndpointListListIndex + ".Address",
                                StringUtils.fromString(customerNodeEndpointListListValue.getAddress()));
                    }

                    if (customerNodeEndpointListListValue.getPort() != null) {
                        request.addParameter("CustomerNodeEndpointList.member." + customerNodeEndpointListListIndex + ".Port",
                                StringUtils.fromInteger(customerNodeEndpointListListValue.getPort()));
                    }
                }
                customerNodeEndpointListListIndex++;
            }
        }

        return request;
    }

}
