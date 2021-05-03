/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpledb.internal;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.services.simpledb.SimpleDBResponseMetadata;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import java.util.Map;

public class SimpleDBStaxResponseHandler<T> extends StaxResponseHandler<T> {

    public SimpleDBStaxResponseHandler(Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller) {
        super(responseUnmarshaller);
    }

    @Override
    protected void registerAdditionalMetadataExpressions(StaxUnmarshallerContext unmarshallerContext) {
        unmarshallerContext.registerMetadataExpression("ResponseMetadata/BoxUsage", 2,
                SimpleDBResponseMetadata.BOX_USAGE);
    }

    @Override
    protected ResponseMetadata getResponseMetadata(Map<String, String> metadata) {
        return new SimpleDBResponseMetadata(super.getResponseMetadata(metadata));
    }
}
