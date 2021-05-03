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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdatePartnerStatusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePartnerStatusRequestMarshaller implements Marshaller<Request<UpdatePartnerStatusRequest>, UpdatePartnerStatusRequest> {

    public Request<UpdatePartnerStatusRequest> marshall(UpdatePartnerStatusRequest updatePartnerStatusRequest) {

        if (updatePartnerStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdatePartnerStatusRequest> request = new DefaultRequest<UpdatePartnerStatusRequest>(updatePartnerStatusRequest, "AmazonRedshift");
        request.addParameter("Action", "UpdatePartnerStatus");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updatePartnerStatusRequest.getAccountId() != null) {
            request.addParameter("AccountId", StringUtils.fromString(updatePartnerStatusRequest.getAccountId()));
        }

        if (updatePartnerStatusRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(updatePartnerStatusRequest.getClusterIdentifier()));
        }

        if (updatePartnerStatusRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(updatePartnerStatusRequest.getDatabaseName()));
        }

        if (updatePartnerStatusRequest.getPartnerName() != null) {
            request.addParameter("PartnerName", StringUtils.fromString(updatePartnerStatusRequest.getPartnerName()));
        }

        if (updatePartnerStatusRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(updatePartnerStatusRequest.getStatus()));
        }

        if (updatePartnerStatusRequest.getStatusMessage() != null) {
            request.addParameter("StatusMessage", StringUtils.fromString(updatePartnerStatusRequest.getStatusMessage()));
        }

        return request;
    }

}
