/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.PrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateEndpointConnections.
 */
public interface PrivateEndpointConnections extends SupportsCreating<PrivateEndpointConnection.DefinitionStages.Blank>, HasInner<PrivateEndpointConnectionsInner> {
    /**
     * Gets the private endpoint connections associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnectionListResult> listAsync(String resourceGroupName, String accountName);

    /**
     * Gets the specified private endpoint connection associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Cognitive Services Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Cognitive Services Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName);

}