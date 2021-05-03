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
package com.amazonaws.services.translate;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;

/**
 * Abstract implementation of {@code AmazonTranslateAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTranslateAsync extends AbstractAmazonTranslate implements AmazonTranslateAsync {

    protected AbstractAmazonTranslateAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateParallelDataResult> createParallelDataAsync(CreateParallelDataRequest request) {

        return createParallelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParallelDataResult> createParallelDataAsync(CreateParallelDataRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateParallelDataRequest, CreateParallelDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteParallelDataResult> deleteParallelDataAsync(DeleteParallelDataRequest request) {

        return deleteParallelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParallelDataResult> deleteParallelDataAsync(DeleteParallelDataRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteParallelDataRequest, DeleteParallelDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest request) {

        return deleteTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTerminologyRequest, DeleteTerminologyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(DescribeTextTranslationJobRequest request) {

        return describeTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(DescribeTextTranslationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTextTranslationJobRequest, DescribeTextTranslationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetParallelDataResult> getParallelDataAsync(GetParallelDataRequest request) {

        return getParallelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParallelDataResult> getParallelDataAsync(GetParallelDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetParallelDataRequest, GetParallelDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest request) {

        return getTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest request) {

        return importTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListParallelDataResult> listParallelDataAsync(ListParallelDataRequest request) {

        return listParallelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParallelDataResult> listParallelDataAsync(ListParallelDataRequest request,
            com.amazonaws.handlers.AsyncHandler<ListParallelDataRequest, ListParallelDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest request) {

        return listTerminologiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(ListTextTranslationJobsRequest request) {

        return listTextTranslationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(ListTextTranslationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTextTranslationJobsRequest, ListTextTranslationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(StartTextTranslationJobRequest request) {

        return startTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(StartTextTranslationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTextTranslationJobRequest, StartTextTranslationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(StopTextTranslationJobRequest request) {

        return stopTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(StopTextTranslationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopTextTranslationJobRequest, StopTextTranslationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest request) {

        return translateTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest request,
            com.amazonaws.handlers.AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateParallelDataResult> updateParallelDataAsync(UpdateParallelDataRequest request) {

        return updateParallelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateParallelDataResult> updateParallelDataAsync(UpdateParallelDataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateParallelDataRequest, UpdateParallelDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
