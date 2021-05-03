/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.frontdoor.v2020_05_01.implementation.FrontendEndpointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing FrontendEndpoints.
 */
public interface FrontendEndpoints extends HasInner<FrontendEndpointsInner> {
    /**
     * Enables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param customHttpsConfiguration The configuration specifying how to enable HTTPS
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableHttpsAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName, CustomHttpsConfiguration customHttpsConfiguration);

    /**
     * Disables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableHttpsAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName);

    /**
     * Gets a Frontend endpoint with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FrontendEndpoint> getAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName);

    /**
     * Lists all of the frontend endpoints within a Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FrontendEndpoint> listByFrontDoorAsync(final String resourceGroupName, final String frontDoorName);

}