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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonTranslate}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTranslate implements AmazonTranslate {

    protected AbstractAmazonTranslate() {
    }

    @Override
    public CreateParallelDataResult createParallelData(CreateParallelDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteParallelDataResult deleteParallelData(DeleteParallelDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTerminologyResult deleteTerminology(DeleteTerminologyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTextTranslationJobResult describeTextTranslationJob(DescribeTextTranslationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetParallelDataResult getParallelData(GetParallelDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTerminologyResult getTerminology(GetTerminologyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportTerminologyResult importTerminology(ImportTerminologyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListParallelDataResult listParallelData(ListParallelDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTerminologiesResult listTerminologies(ListTerminologiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartTextTranslationJobResult startTextTranslationJob(StartTextTranslationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopTextTranslationJobResult stopTextTranslationJob(StopTextTranslationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TranslateTextResult translateText(TranslateTextRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateParallelDataResult updateParallelData(UpdateParallelDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
