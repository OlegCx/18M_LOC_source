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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;

/**
 * Fluent builder for {@link com.amazonaws.services.mgn.AWSmgnAsync}. Use of the builder is preferred over using
 * constructors of the client class.
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class AWSmgnAsyncClientBuilder extends AwsAsyncClientBuilder<AWSmgnAsyncClientBuilder, AWSmgnAsync> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ClientConfigurationFactory();;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AWSmgnAsyncClientBuilder standard() {
        return new AWSmgnAsyncClientBuilder();
    }

    /**
     * @return Default async client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain} and
     *         {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AWSmgnAsync defaultClient() {
        return standard().build();
    }

    private AWSmgnAsyncClientBuilder() {
        super(CLIENT_CONFIG_FACTORY);
    }

    /**
     * Construct an asynchronous implementation of AWSmgnAsync using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AWSmgnAsync.
     */
    @Override
    protected AWSmgnAsync build(AwsAsyncClientParams params) {
        return new AWSmgnAsyncClient(params);
    }

}
