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
package com.amazonaws.services.dynamodbv2;

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain;
import com.amazonaws.endpointdiscovery.DefaultEndpointDiscoveryProviderChain;
import com.amazonaws.internal.config.InternalConfig;

/**
 * Fluent builder for {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync}. Use of the builder is preferred
 * over using constructors of the client class.
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class AmazonDynamoDBAsyncClientBuilder extends AwsAsyncClientBuilder<AmazonDynamoDBAsyncClientBuilder, AmazonDynamoDBAsync> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory();;

    private static final EndpointDiscoveryProviderChain DEFAULT_ENDPOINT_DISCOVERY_PROVIDER = new DefaultEndpointDiscoveryProviderChain();

    private boolean endpointDiscoveryEnabled = false;
    private boolean endpointDiscoveryDisabled = false;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AmazonDynamoDBAsyncClientBuilder standard() {
        return new AmazonDynamoDBAsyncClientBuilder();
    }

    /**
     * @return Default async client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain} and
     *         {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AmazonDynamoDBAsync defaultClient() {
        return standard().build();
    }

    private AmazonDynamoDBAsyncClientBuilder() {
        super(CLIENT_CONFIG_FACTORY);
    }

    public AmazonDynamoDBAsyncClientBuilder enableEndpointDiscovery() {
        this.endpointDiscoveryEnabled = true;
        return this;
    }

    public AmazonDynamoDBAsyncClientBuilder disableEndpointDiscovery() {
        this.endpointDiscoveryDisabled = true;
        return this;
    }

    private boolean endpointDiscoveryEnabled() {

        Boolean endpointDiscoveryChainSetting = DEFAULT_ENDPOINT_DISCOVERY_PROVIDER.endpointDiscoveryEnabled();

        if (endpointDiscoveryDisabled) {
            return false;
        }

        if (endpointDiscoveryEnabled) {
            return true;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting == false) {
            return false;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting) {
            return true;
        }

        if (InternalConfig.Factory.getInternalConfig().endpointDiscoveryEnabled()) {
            return true;
        }

        return false;
    }

    /**
     * Construct an asynchronous implementation of AmazonDynamoDBAsync using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AmazonDynamoDBAsync.
     */
    @Override
    protected AmazonDynamoDBAsync build(AwsAsyncClientParams params) {
        if (endpointDiscoveryEnabled() && getEndpoint() == null) {
            return new AmazonDynamoDBAsyncClient(params, true);
        }
        return new AmazonDynamoDBAsyncClient(params);
    }

}
