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

/**
 * Abstract implementation of {@code AWSComputeOptimizerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSComputeOptimizerAsync extends AbstractAWSComputeOptimizer implements AWSComputeOptimizerAsync {

    protected AbstractAWSComputeOptimizerAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            DescribeRecommendationExportJobsRequest request) {

        return describeRecommendationExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            DescribeRecommendationExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommendationExportJobsRequest, DescribeRecommendationExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            ExportAutoScalingGroupRecommendationsRequest request) {

        return exportAutoScalingGroupRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            ExportAutoScalingGroupRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportAutoScalingGroupRecommendationsRequest, ExportAutoScalingGroupRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            ExportEC2InstanceRecommendationsRequest request) {

        return exportEC2InstanceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            ExportEC2InstanceRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportEC2InstanceRecommendationsRequest, ExportEC2InstanceRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            GetAutoScalingGroupRecommendationsRequest request) {

        return getAutoScalingGroupRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            GetAutoScalingGroupRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAutoScalingGroupRecommendationsRequest, GetAutoScalingGroupRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(GetEBSVolumeRecommendationsRequest request) {

        return getEBSVolumeRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(GetEBSVolumeRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEBSVolumeRecommendationsRequest, GetEBSVolumeRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(GetEC2InstanceRecommendationsRequest request) {

        return getEC2InstanceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(GetEC2InstanceRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEC2InstanceRecommendationsRequest, GetEC2InstanceRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            GetEC2RecommendationProjectedMetricsRequest request) {

        return getEC2RecommendationProjectedMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            GetEC2RecommendationProjectedMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEC2RecommendationProjectedMetricsRequest, GetEC2RecommendationProjectedMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(GetEnrollmentStatusRequest request) {

        return getEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(GetEnrollmentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEnrollmentStatusRequest, GetEnrollmentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            GetLambdaFunctionRecommendationsRequest request) {

        return getLambdaFunctionRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            GetLambdaFunctionRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLambdaFunctionRecommendationsRequest, GetLambdaFunctionRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(GetRecommendationSummariesRequest request) {

        return getRecommendationSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(GetRecommendationSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationSummariesRequest, GetRecommendationSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request) {

        return updateEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
