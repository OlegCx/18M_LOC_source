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
package com.amazonaws.services.resourcegroupstaggingapi;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSResourceGroupsTaggingAPI}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSResourceGroupsTaggingAPI implements AWSResourceGroupsTaggingAPI {

    protected AbstractAWSResourceGroupsTaggingAPI() {
    }

    @Override
    public DescribeReportCreationResult describeReportCreation(DescribeReportCreationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryResult getComplianceSummary(GetComplianceSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTagKeysResult getTagKeys(GetTagKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTagValuesResult getTagValues(GetTagValuesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartReportCreationResult startReportCreation(StartReportCreationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourcesResult tagResources(TagResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourcesResult untagResources(UntagResourcesRequest request) {
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
