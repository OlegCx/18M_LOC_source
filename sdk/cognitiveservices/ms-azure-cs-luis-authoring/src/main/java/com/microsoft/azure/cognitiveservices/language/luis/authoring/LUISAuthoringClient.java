/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for LUISAuthoringClient class.
 */
public interface LUISAuthoringClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    LUISAuthoringClient withEndpoint(String endpoint);

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    LUISAuthoringClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    LUISAuthoringClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    LUISAuthoringClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the Features object to access its operations.
     * @return the Features object.
     */
    Features features();

    /**
     * Gets the Examples object to access its operations.
     * @return the Examples object.
     */
    Examples examples();

    /**
     * Gets the Models object to access its operations.
     * @return the Models object.
     */
    Models models();

    /**
     * Gets the Apps object to access its operations.
     * @return the Apps object.
     */
    Apps apps();

    /**
     * Gets the Versions object to access its operations.
     * @return the Versions object.
     */
    Versions versions();

    /**
     * Gets the Trains object to access its operations.
     * @return the Trains object.
     */
    Trains trains();

    /**
     * Gets the Patterns object to access its operations.
     * @return the Patterns object.
     */
    Patterns patterns();

    /**
     * Gets the Settings object to access its operations.
     * @return the Settings object.
     */
    Settings settings();

    /**
     * Gets the AzureAccounts object to access its operations.
     * @return the AzureAccounts object.
     */
    AzureAccounts azureAccounts();

}