// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateContractInner;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.EmailTemplatesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.EmailTemplatesGetResponse;
import com.azure.resourcemanager.apimanagement.models.EmailTemplatesUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.TemplateName;

/** An instance of this class provides access to all the operations defined in EmailTemplatesClient. */
public interface EmailTemplatesClient {
    /**
     * Gets all email templates.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all email templates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailTemplateContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Gets all email templates.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all email templates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailTemplateContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, TemplateName templateName);

    /**
     * Gets the entity state (Etag) version of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the email template specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplatesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, Context context);

    /**
     * Gets the details of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the email template specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplateContractInner get(String resourceGroupName, String serviceName, TemplateName templateName);

    /**
     * Gets the details of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the email template specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplatesGetResponse getWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, Context context);

    /**
     * Updates an Email Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param parameters Email Template update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return email Template details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplateContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        TemplateName templateName,
        EmailTemplateUpdateParameters parameters);

    /**
     * Updates an Email Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param parameters Email Template update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return email Template details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EmailTemplateContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        TemplateName templateName,
        EmailTemplateUpdateParameters parameters,
        String ifMatch,
        Context context);

    /**
     * Updates API Management email template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return email Template details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplateContractInner update(
        String resourceGroupName,
        String serviceName,
        TemplateName templateName,
        String ifMatch,
        EmailTemplateUpdateParameters parameters);

    /**
     * Updates API Management email template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return email Template details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailTemplatesUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        TemplateName templateName,
        String ifMatch,
        EmailTemplateUpdateParameters parameters,
        Context context);

    /**
     * Reset the Email Template to default template provided by the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, TemplateName templateName, String ifMatch);

    /**
     * Reset the Email Template to default template provided by the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, String ifMatch, Context context);
}