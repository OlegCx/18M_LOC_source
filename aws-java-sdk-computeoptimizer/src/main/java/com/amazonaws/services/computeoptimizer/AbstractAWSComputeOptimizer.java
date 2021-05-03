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
package com.amazonaws.services.computeoptimizer;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSComputeOptimizer}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSComputeOptimizer implements AWSComputeOptimizer {

    protected AbstractAWSComputeOptimizer() {
    }

    @Override
    public DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(ExportAutoScalingGroupRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(GetAutoScalingGroupRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEBSVolumeRecommendationsResult getEBSVolumeRecommendations(GetEBSVolumeRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(GetEC2RecommendationProjectedMetricsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLambdaFunctionRecommendationsResult getLambdaFunctionRecommendations(GetLambdaFunctionRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest request) {
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
