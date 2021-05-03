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
package com.amazonaws.services.codestarconnections;

import javax.annotation.Generated;

import com.amazonaws.services.codestarconnections.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCodeStarconnections}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeStarconnections implements AWSCodeStarconnections {

    protected AbstractAWSCodeStarconnections() {
    }

    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateHostResult createHost(CreateHostRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHostResult deleteHost(DeleteHostRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetConnectionResult getConnection(GetConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetHostResult getHost(GetHostRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListConnectionsResult listConnections(ListConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListHostsResult listHosts(ListHostsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateHostResult updateHost(UpdateHostRequest request) {
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
