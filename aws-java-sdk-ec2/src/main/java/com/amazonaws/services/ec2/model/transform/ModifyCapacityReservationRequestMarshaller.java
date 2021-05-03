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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyCapacityReservationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCapacityReservationRequestMarshaller implements Marshaller<Request<ModifyCapacityReservationRequest>, ModifyCapacityReservationRequest> {

    public Request<ModifyCapacityReservationRequest> marshall(ModifyCapacityReservationRequest modifyCapacityReservationRequest) {

        if (modifyCapacityReservationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCapacityReservationRequest> request = new DefaultRequest<ModifyCapacityReservationRequest>(modifyCapacityReservationRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyCapacityReservation");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyCapacityReservationRequest.getCapacityReservationId() != null) {
            request.addParameter("CapacityReservationId", StringUtils.fromString(modifyCapacityReservationRequest.getCapacityReservationId()));
        }

        if (modifyCapacityReservationRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(modifyCapacityReservationRequest.getInstanceCount()));
        }

        if (modifyCapacityReservationRequest.getEndDate() != null) {
            request.addParameter("EndDate", StringUtils.fromDate(modifyCapacityReservationRequest.getEndDate()));
        }

        if (modifyCapacityReservationRequest.getEndDateType() != null) {
            request.addParameter("EndDateType", StringUtils.fromString(modifyCapacityReservationRequest.getEndDateType()));
        }

        if (modifyCapacityReservationRequest.getAccept() != null) {
            request.addParameter("Accept", StringUtils.fromBoolean(modifyCapacityReservationRequest.getAccept()));
        }

        return request;
    }

}
