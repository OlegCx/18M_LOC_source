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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;

/**
 * Abstract implementation of {@code AWSLambdaAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLambdaAsync extends AbstractAWSLambda implements AWSLambdaAsync {

    protected AbstractAWSLambdaAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(AddLayerVersionPermissionRequest request) {

        return addLayerVersionPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(AddLayerVersionPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<AddLayerVersionPermissionRequest, AddLayerVersionPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(CreateCodeSigningConfigRequest request) {

        return createCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(CreateCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCodeSigningConfigRequest, CreateCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest request) {

        return createEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest request) {

        return createFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(DeleteCodeSigningConfigRequest request) {

        return deleteCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(DeleteCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCodeSigningConfigRequest, DeleteCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest request) {

        return deleteEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest request) {

        return deleteFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            DeleteFunctionCodeSigningConfigRequest request) {

        return deleteFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            DeleteFunctionCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionCodeSigningConfigRequest, DeleteFunctionCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(DeleteFunctionConcurrencyRequest request) {

        return deleteFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(DeleteFunctionConcurrencyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionConcurrencyRequest, DeleteFunctionConcurrencyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            DeleteFunctionEventInvokeConfigRequest request) {

        return deleteFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            DeleteFunctionEventInvokeConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionEventInvokeConfigRequest, DeleteFunctionEventInvokeConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest request) {

        return deleteLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerVersionRequest, DeleteLayerVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            DeleteProvisionedConcurrencyConfigRequest request) {

        return deleteProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            DeleteProvisionedConcurrencyConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisionedConcurrencyConfigRequest, DeleteProvisionedConcurrencyConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request) {

        return getAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(GetCodeSigningConfigRequest request) {

        return getCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(GetCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCodeSigningConfigRequest, GetCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest request) {

        return getEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest request) {

        return getFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(GetFunctionCodeSigningConfigRequest request) {

        return getFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(GetFunctionCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFunctionCodeSigningConfigRequest, GetFunctionCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(GetFunctionConcurrencyRequest request) {

        return getFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(GetFunctionConcurrencyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConcurrencyRequest, GetFunctionConcurrencyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest request) {

        return getFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(GetFunctionEventInvokeConfigRequest request) {

        return getFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(GetFunctionEventInvokeConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFunctionEventInvokeConfigRequest, GetFunctionEventInvokeConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest request) {

        return getLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionRequest, GetLayerVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(GetLayerVersionByArnRequest request) {

        return getLayerVersionByArnAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(GetLayerVersionByArnRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionByArnRequest, GetLayerVersionByArnResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest request) {

        return getLayerVersionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionPolicyRequest, GetLayerVersionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            GetProvisionedConcurrencyConfigRequest request) {

        return getProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            GetProvisionedConcurrencyConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProvisionedConcurrencyConfigRequest, GetProvisionedConcurrencyConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest request) {

        return invokeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest request,
            com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest request) {

        return invokeAsyncAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest request,
            com.amazonaws.handlers.AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(ListCodeSigningConfigsRequest request) {

        return listCodeSigningConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(ListCodeSigningConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCodeSigningConfigsRequest, ListCodeSigningConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest request) {

        return listEventSourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync() {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest());
    }

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation with an AsyncHandler.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(ListFunctionEventInvokeConfigsRequest request) {

        return listFunctionEventInvokeConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(ListFunctionEventInvokeConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFunctionEventInvokeConfigsRequest, ListFunctionEventInvokeConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest request) {

        return listFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync() {

        return listFunctionsAsync(new ListFunctionsRequest());
    }

    /**
     * Simplified method form for invoking the ListFunctions operation with an AsyncHandler.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {

        return listFunctionsAsync(new ListFunctionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            ListFunctionsByCodeSigningConfigRequest request) {

        return listFunctionsByCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            ListFunctionsByCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsByCodeSigningConfigRequest, ListFunctionsByCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest request) {

        return listLayerVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLayerVersionsRequest, ListLayerVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest request) {

        return listLayersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLayersRequest, ListLayersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            ListProvisionedConcurrencyConfigsRequest request) {

        return listProvisionedConcurrencyConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            ListProvisionedConcurrencyConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedConcurrencyConfigsRequest, ListProvisionedConcurrencyConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest request) {

        return listVersionsByFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest request) {

        return publishLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishLayerVersionRequest, PublishLayerVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest request) {

        return publishVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(PutFunctionCodeSigningConfigRequest request) {

        return putFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(PutFunctionCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFunctionCodeSigningConfigRequest, PutFunctionCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest request) {

        return putFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFunctionConcurrencyRequest, PutFunctionConcurrencyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(PutFunctionEventInvokeConfigRequest request) {

        return putFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(PutFunctionEventInvokeConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFunctionEventInvokeConfigRequest, PutFunctionEventInvokeConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            PutProvisionedConcurrencyConfigRequest request) {

        return putProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            PutProvisionedConcurrencyConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<PutProvisionedConcurrencyConfigRequest, PutProvisionedConcurrencyConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(RemoveLayerVersionPermissionRequest request) {

        return removeLayerVersionPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(RemoveLayerVersionPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveLayerVersionPermissionRequest, RemoveLayerVersionPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(UpdateCodeSigningConfigRequest request) {

        return updateCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(UpdateCodeSigningConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCodeSigningConfigRequest, UpdateCodeSigningConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest request) {

        return updateEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {

        return updateFunctionCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest request) {

        return updateFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            UpdateFunctionEventInvokeConfigRequest request) {

        return updateFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            UpdateFunctionEventInvokeConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionEventInvokeConfigRequest, UpdateFunctionEventInvokeConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
