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
package com.amazonaws.services.personalizeevents;

import javax.annotation.Generated;

import com.amazonaws.services.personalizeevents.model.*;

/**
 * Abstract implementation of {@code AmazonPersonalizeEventsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPersonalizeEventsAsync extends AbstractAmazonPersonalizeEvents implements AmazonPersonalizeEventsAsync {

    protected AbstractAmazonPersonalizeEventsAsync() {
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutItemsResult> putItemsAsync(PutItemsRequest request) {

        return putItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutItemsResult> putItemsAsync(PutItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutItemsRequest, PutItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutUsersResult> putUsersAsync(PutUsersRequest request) {

        return putUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutUsersResult> putUsersAsync(PutUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<PutUsersRequest, PutUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
