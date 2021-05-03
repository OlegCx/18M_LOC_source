// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantSettingsContractInner;

/** Contains all response data for the get operation. */
public final class TenantSettingsGetResponse
    extends ResponseBase<TenantSettingsGetHeaders, TenantSettingsContractInner> {
    /**
     * Creates an instance of TenantSettingsGetResponse.
     *
     * @param request the request which resulted in this TenantSettingsGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TenantSettingsGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        TenantSettingsContractInner value,
        TenantSettingsGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TenantSettingsContractInner getValue() {
        return super.getValue();
    }
}