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
package com.amazonaws.services.apigatewayv2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apigatewayv2.model.*;

/**
 * Interface for accessing AmazonApiGatewayV2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigatewayv2.AbstractAmazonApiGatewayV2} instead.
 * </p>
 * <p>
 * <p>
 * Amazon API Gateway V2
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApiGatewayV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "apigateway";

    /**
     * <p>
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest
     *        Creates a new Api resource to represent an API.
     * @return Result of the CreateApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateApi
     */
    CreateApiResult createApi(CreateApiRequest createApiRequest);

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest
     *        Creates a new ApiMapping resource to represent an API mapping.
     * @return Result of the CreateApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateApiMapping
     */
    CreateApiMappingResult createApiMapping(CreateApiMappingRequest createApiMappingRequest);

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest
     *        Creates a new Authorizer resource to represent an authorizer.
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateAuthorizer
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Creates a new Deployment resource to represent a deployment.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateDeployment
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        Creates a new DomainName resource to represent a domain name.
     * @return Result of the CreateDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws AccessDeniedException
     *         403 response
     * @sample AmazonApiGatewayV2.CreateDomainName
     */
    CreateDomainNameResult createDomainName(CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest
     *        Creates a new Integration resource to represent an integration.
     * @return Result of the CreateIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateIntegration
     */
    CreateIntegrationResult createIntegration(CreateIntegrationRequest createIntegrationRequest);

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest
     *        Creates a new IntegrationResponse resource to represent an integration response.
     * @return Result of the CreateIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateIntegrationResponse
     */
    CreateIntegrationResponseResult createIntegrationResponse(CreateIntegrationResponseRequest createIntegrationResponseRequest);

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest
     *        Creates a new Model.
     * @return Result of the CreateModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateModel
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest
     *        Creates a new Route resource to represent a route.
     * @return Result of the CreateRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateRoute
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest
     *        Creates a new RouteResponse resource to represent a route response.
     * @return Result of the CreateRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateRouteResponse
     */
    CreateRouteResponseResult createRouteResponse(CreateRouteResponseRequest createRouteResponseRequest);

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest
     *        Creates a new Stage resource to represent a stage.
     * @return Result of the CreateStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateStage
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a VPC link.
     * </p>
     * 
     * @param createVpcLinkRequest
     *        Creates a VPC link
     * @return Result of the CreateVpcLink operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.CreateVpcLink
     */
    CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest createVpcLinkRequest);

    /**
     * <p>
     * Deletes the AccessLogSettings for a Stage. To disable access logging for a Stage, delete its AccessLogSettings.
     * </p>
     * 
     * @param deleteAccessLogSettingsRequest
     * @return Result of the DeleteAccessLogSettings operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteAccessLogSettings
     */
    DeleteAccessLogSettingsResult deleteAccessLogSettings(DeleteAccessLogSettingsRequest deleteAccessLogSettingsRequest);

    /**
     * <p>
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @return Result of the DeleteApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteApi
     */
    DeleteApiResult deleteApi(DeleteApiRequest deleteApiRequest);

    /**
     * <p>
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @return Result of the DeleteApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.DeleteApiMapping
     */
    DeleteApiMappingResult deleteApiMapping(DeleteApiMappingRequest deleteApiMappingRequest);

    /**
     * <p>
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteAuthorizer
     */
    DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes a CORS configuration.
     * </p>
     * 
     * @param deleteCorsConfigurationRequest
     * @return Result of the DeleteCorsConfiguration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteCorsConfiguration
     */
    DeleteCorsConfigurationResult deleteCorsConfiguration(DeleteCorsConfigurationRequest deleteCorsConfigurationRequest);

    /**
     * <p>
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteDeployment
     */
    DeleteDeploymentResult deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @return Result of the DeleteDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteDomainName
     */
    DeleteDomainNameResult deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteIntegration
     */
    DeleteIntegrationResult deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @return Result of the DeleteIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteIntegrationResponse
     */
    DeleteIntegrationResponseResult deleteIntegrationResponse(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteModel
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRoute
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes a route request parameter.
     * </p>
     * 
     * @param deleteRouteRequestParameterRequest
     * @return Result of the DeleteRouteRequestParameter operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRouteRequestParameter
     */
    DeleteRouteRequestParameterResult deleteRouteRequestParameter(DeleteRouteRequestParameterRequest deleteRouteRequestParameterRequest);

    /**
     * <p>
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @return Result of the DeleteRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRouteResponse
     */
    DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest deleteRouteResponseRequest);

    /**
     * <p>
     * Deletes the RouteSettings for a stage.
     * </p>
     * 
     * @param deleteRouteSettingsRequest
     * @return Result of the DeleteRouteSettings operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRouteSettings
     */
    DeleteRouteSettingsResult deleteRouteSettings(DeleteRouteSettingsRequest deleteRouteSettingsRequest);

    /**
     * <p>
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteStage
     */
    DeleteStageResult deleteStage(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a VPC link.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     * @return Result of the DeleteVpcLink operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteVpcLink
     */
    DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest);

    /**
     * @param exportApiRequest
     * @return Result of the ExportApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.ExportApi
     */
    ExportApiResult exportApi(ExportApiRequest exportApiRequest);

    /**
     * <p>
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @return Result of the GetApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetApi
     */
    GetApiResult getApi(GetApiRequest getApiRequest);

    /**
     * <p>
     * Gets an API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @return Result of the GetApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApiMapping
     */
    GetApiMappingResult getApiMapping(GetApiMappingRequest getApiMappingRequest);

    /**
     * <p>
     * Gets API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @return Result of the GetApiMappings operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApiMappings
     */
    GetApiMappingsResult getApiMappings(GetApiMappingsRequest getApiMappingsRequest);

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @return Result of the GetApis operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApis
     */
    GetApisResult getApis(GetApisRequest getApisRequest);

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @return Result of the GetAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetAuthorizer
     */
    GetAuthorizerResult getAuthorizer(GetAuthorizerRequest getAuthorizerRequest);

    /**
     * <p>
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @return Result of the GetAuthorizers operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetAuthorizers
     */
    GetAuthorizersResult getAuthorizers(GetAuthorizersRequest getAuthorizersRequest);

    /**
     * <p>
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetDeployment
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @return Result of the GetDeployments operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetDeployments
     */
    GetDeploymentsResult getDeployments(GetDeploymentsRequest getDeploymentsRequest);

    /**
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return Result of the GetDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetDomainName
     */
    GetDomainNameResult getDomainName(GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @return Result of the GetDomainNames operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetDomainNames
     */
    GetDomainNamesResult getDomainNames(GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return Result of the GetIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetIntegration
     */
    GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @return Result of the GetIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetIntegrationResponse
     */
    GetIntegrationResponseResult getIntegrationResponse(GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @return Result of the GetIntegrationResponses operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetIntegrationResponses
     */
    GetIntegrationResponsesResult getIntegrationResponses(GetIntegrationResponsesRequest getIntegrationResponsesRequest);

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @return Result of the GetIntegrations operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetIntegrations
     */
    GetIntegrationsResult getIntegrations(GetIntegrationsRequest getIntegrationsRequest);

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @return Result of the GetModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetModel
     */
    GetModelResult getModel(GetModelRequest getModelRequest);

    /**
     * <p>
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetModelTemplate
     */
    GetModelTemplateResult getModelTemplate(GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @return Result of the GetModels operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetModels
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @return Result of the GetRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetRoute
     */
    GetRouteResult getRoute(GetRouteRequest getRouteRequest);

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @return Result of the GetRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetRouteResponse
     */
    GetRouteResponseResult getRouteResponse(GetRouteResponseRequest getRouteResponseRequest);

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @return Result of the GetRouteResponses operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetRouteResponses
     */
    GetRouteResponsesResult getRouteResponses(GetRouteResponsesRequest getRouteResponsesRequest);

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @return Result of the GetRoutes operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetRoutes
     */
    GetRoutesResult getRoutes(GetRoutesRequest getRoutesRequest);

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetStage
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @return Result of the GetStages operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetStages
     */
    GetStagesResult getStages(GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Gets a collection of Tag resources.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.GetTags
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Gets a VPC link.
     * </p>
     * 
     * @param getVpcLinkRequest
     * @return Result of the GetVpcLink operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetVpcLink
     */
    GetVpcLinkResult getVpcLink(GetVpcLinkRequest getVpcLinkRequest);

    /**
     * <p>
     * Gets a collection of VPC links.
     * </p>
     * 
     * @param getVpcLinksRequest
     * @return Result of the GetVpcLinks operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetVpcLinks
     */
    GetVpcLinksResult getVpcLinks(GetVpcLinksRequest getVpcLinksRequest);

    /**
     * <p>
     * Imports an API.
     * </p>
     * 
     * @param importApiRequest
     * @return Result of the ImportApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.ImportApi
     */
    ImportApiResult importApi(ImportApiRequest importApiRequest);

    /**
     * <p>
     * Puts an Api resource.
     * </p>
     * 
     * @param reimportApiRequest
     * @return Result of the ReimportApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.ReimportApi
     */
    ReimportApiResult reimportApi(ReimportApiRequest reimportApiRequest);

    /**
     * <p>
     * Resets all authorizer cache entries on a stage. Supported only for HTTP APIs.
     * </p>
     * 
     * @param resetAuthorizersCacheRequest
     * @return Result of the ResetAuthorizersCache operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.ResetAuthorizersCache
     */
    ResetAuthorizersCacheResult resetAuthorizersCache(ResetAuthorizersCacheRequest resetAuthorizersCacheRequest);

    /**
     * <p>
     * Creates a new Tag resource to represent a tag.
     * </p>
     * 
     * @param tagResourceRequest
     *        Creates a new Tag resource to represent a tag.
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.TagResource
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes a Tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UntagResource
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest
     *        Updates an Api.
     * @return Result of the UpdateApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateApi
     */
    UpdateApiResult updateApi(UpdateApiRequest updateApiRequest);

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest
     *        Updates an ApiMapping.
     * @return Result of the UpdateApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateApiMapping
     */
    UpdateApiMappingResult updateApiMapping(UpdateApiMappingRequest updateApiMappingRequest);

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     *        Updates an Authorizer.
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateAuthorizer
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Updates a Deployment.
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateDeployment
     */
    UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        Updates a DomainName.
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateDomainName
     */
    UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Updates an Integration.
     * @return Result of the UpdateIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateIntegration
     */
    UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Updates an IntegrationResponses.
     * @return Result of the UpdateIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateIntegrationResponse
     */
    UpdateIntegrationResponseResult updateIntegrationResponse(UpdateIntegrationResponseRequest updateIntegrationResponseRequest);

    /**
     * <p>
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest
     *        Updates a Model.
     * @return Result of the UpdateModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateModel
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest
     *        Updates a Route.
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateRoute
     */
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest);

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest
     *        Updates a RouteResponse.
     * @return Result of the UpdateRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateRouteResponse
     */
    UpdateRouteResponseResult updateRouteResponse(UpdateRouteResponseRequest updateRouteResponseRequest);

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest
     *        Updates a Stage.
     * @return Result of the UpdateStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateStage
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Updates a VPC link.
     * </p>
     * 
     * @param updateVpcLinkRequest
     *        Updates a VPC link.
     * @return Result of the UpdateVpcLink operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.UpdateVpcLink
     */
    UpdateVpcLinkResult updateVpcLink(UpdateVpcLinkRequest updateVpcLinkRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
