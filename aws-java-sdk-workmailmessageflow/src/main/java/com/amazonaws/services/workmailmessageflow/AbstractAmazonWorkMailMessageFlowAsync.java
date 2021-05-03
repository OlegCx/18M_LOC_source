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
package com.amazonaws.services.workmailmessageflow;

import javax.annotation.Generated;

import com.amazonaws.services.workmailmessageflow.model.*;

/**
 * Abstract implementation of {@code AmazonWorkMailMessageFlowAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonWorkMailMessageFlowAsync extends AbstractAmazonWorkMailMessageFlow implements AmazonWorkMailMessageFlowAsync {

    protected AbstractAmazonWorkMailMessageFlowAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(GetRawMessageContentRequest request) {

        return getRawMessageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(GetRawMessageContentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRawMessageContentRequest, GetRawMessageContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRawMessageContentResult> putRawMessageContentAsync(PutRawMessageContentRequest request) {

        return putRawMessageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRawMessageContentResult> putRawMessageContentAsync(PutRawMessageContentRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRawMessageContentRequest, PutRawMessageContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
