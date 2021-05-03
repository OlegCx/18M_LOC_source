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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.computeoptimizer.model.*;

/**
 * Interface for accessing AWS Compute Optimizer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.computeoptimizer.AbstractAWSComputeOptimizer} instead.
 * </p>
 * <p>
 * <p>
 * AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS compute
 * resources, such as EC2 instances, Auto Scaling groups, AWS Lambda functions, and Amazon EBS volumes. It reports
 * whether your resources are optimal, and generates optimization recommendations to reduce the cost and improve the
 * performance of your workloads. Compute Optimizer also provides recent utilization metric data, as well as projected
 * utilization metric data for the recommendations, which you can use to evaluate which recommendation provides the best
 * price-performance trade-off. The analysis of your usage patterns can help you decide when to move or resize your
 * running resources, and still meet your performance and capacity requirements. For more information about Compute
 * Optimizer, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComputeOptimizer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "compute-optimizer";

    /**
     * <p>
     * Describes recommendation export jobs created in the last seven days.
     * </p>
     * <p>
     * Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     * actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code>
     * action to view your export jobs.
     * </p>
     * 
     * @param describeRecommendationExportJobsRequest
     * @return Result of the DescribeRecommendationExportJobs operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.DescribeRecommendationExportJobs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Auto Scaling groups.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Auto Scaling group export job in progress per AWS Region.
     * </p>
     * 
     * @param exportAutoScalingGroupRecommendationsRequest
     * @return Result of the ExportAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(
            ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EC2 instance export job in progress per AWS Region.
     * </p>
     * 
     * @param exportEC2InstanceRecommendationsRequest
     * @return Result of the ExportEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportEC2InstanceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest);

    /**
     * <p>
     * Returns Auto Scaling group recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getAutoScalingGroupRecommendationsRequest
     * @return Result of the GetAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(
            GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest);

    /**
     * <p>
     * Returns Amazon Elastic Block Store (Amazon EBS) volume recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements.
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEBSVolumeRecommendationsRequest
     * @return Result of the GetEBSVolumeRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetEBSVolumeRecommendationsResult getEBSVolumeRecommendations(GetEBSVolumeRecommendationsRequest getEBSVolumeRecommendationsRequest);

    /**
     * <p>
     * Returns Amazon EC2 instance recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet
     * a specific set of requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEC2InstanceRecommendationsRequest
     * @return Result of the GetEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2InstanceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest);

    /**
     * <p>
     * Returns the projected utilization metrics of Amazon EC2 instance recommendations.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned when you
     * run this action. Additionally, the <code>Memory</code> metric is returned only for resources that have the
     * unified CloudWatch agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param getEC2RecommendationProjectedMetricsRequest
     * @return Result of the GetEC2RecommendationProjectedMetrics operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2RecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(
            GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest);

    /**
     * <p>
     * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is the management account of an organization, this action also confirms the enrollment status of
     * member accounts within the organization.
     * </p>
     * 
     * @param getEnrollmentStatusRequest
     * @return Result of the GetEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest getEnrollmentStatusRequest);

    /**
     * <p>
     * Returns AWS Lambda function recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getLambdaFunctionRecommendationsRequest
     * @return Result of the GetLambdaFunctionRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.GetLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetLambdaFunctionRecommendationsResult getLambdaFunctionRecommendations(GetLambdaFunctionRecommendationsRequest getLambdaFunctionRecommendationsRequest);

    /**
     * <p>
     * Returns the optimization findings for an account.
     * </p>
     * <p>
     * It returns the number of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon EC2 instances in an account that are <code>Underprovisioned</code>, <code>Overprovisioned</code>, or
     * <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto Scaling groups in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon EBS volumes in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda functions in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRecommendationSummariesRequest
     * @return Result of the GetRecommendationSummaries operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetRecommendationSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest getRecommendationSummariesRequest);

    /**
     * <p>
     * Updates the enrollment (opt in and opt out) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * within the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt
     * out. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/security-iam.html">Controlling access with AWS Identity
     * and Access Management</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * When you opt in, Compute Optimizer automatically creates a Service-Linked Role in your account to access its
     * data. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/using-service-linked-roles.html">Using Service-Linked
     * Roles for AWS Compute Optimizer</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @return Result of the UpdateEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
