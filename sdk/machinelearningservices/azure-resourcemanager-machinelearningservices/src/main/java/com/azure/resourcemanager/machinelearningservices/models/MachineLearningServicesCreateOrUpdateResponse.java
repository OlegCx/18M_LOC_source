// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ServiceResourceInner;

/** Contains all response data for the createOrUpdate operation. */
public final class MachineLearningServicesCreateOrUpdateResponse
    extends ResponseBase<MachineLearningServicesCreateOrUpdateHeaders, ServiceResourceInner> {
    /**
     * Creates an instance of MachineLearningServicesCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this MachineLearningServicesCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MachineLearningServicesCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ServiceResourceInner value,
        MachineLearningServicesCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ServiceResourceInner getValue() {
        return super.getValue();
    }
}