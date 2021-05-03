/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.internal.config;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.retry.PredefinedRetryPolicies;

/**
 * Factory producing predefined {@link ClientConfiguration} instances.
 */
@SdkInternalApi
public class ApiGatewayClientConfigurationFactory extends ClientConfigurationFactory {

    public static final int DEFAULT_SOCKET_TIMEOUT = 35 * 1000;
    public static final boolean DEFAULT_CACHE_RESPONSE_METADATA = false;

    @Override
    protected ClientConfiguration getDefaultConfig() {
        return super.getDefaultConfig().withRetryPolicy(PredefinedRetryPolicies.NO_RETRY_POLICY)
                                        .withCacheResponseMetadata(DEFAULT_CACHE_RESPONSE_METADATA)
                                        .withSocketTimeout(DEFAULT_SOCKET_TIMEOUT);
    }

    @Override
    protected ClientConfiguration getInRegionOptimizedConfig() {
        return getDefaultConfig();
    }

}
